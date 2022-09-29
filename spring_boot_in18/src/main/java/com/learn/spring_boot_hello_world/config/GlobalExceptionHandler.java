package com.learn.spring_boot_hello_world.config;

import com.learn.spring_boot_hello_world.common.ResResult;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.naming.spi.ResolveResult;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;

/**
 * Global exception handler.
 *
 * @author pdai
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * exception handler for bad request.
     *
     * @param e
     *            exception
     * @return ResponseResult
     */
    @ResponseBody
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = { BindException.class, ValidationException.class, MethodArgumentNotValidException.class })
    public ResResult<Object> handleParameterVerificationException(@NonNull Exception e) {
        ResResult.ResResultBuilder<Object> builder = ResResult.builder();
        builder.status(com.learn.spring_boot_hello_world.common.ResponseStatus.HTTP_STATUS_500.getCode());
        log.warn("Exception: {}", e.getMessage());
        if (e instanceof BindException) {
            BindingResult bindingResult = ((MethodArgumentNotValidException) e).getBindingResult();
            String s = bindingResult.getAllErrors().stream().map(DefaultMessageSourceResolvable::getDefaultMessage)
                    .findFirst().get();
            return builder.desc(s).build();
        } else if (e instanceof ConstraintViolationException) {
            if (e.getMessage() != null) {
                builder.desc(e.getMessage());
            }
        } else {
            builder.desc("invalid parameter");
        }
        return builder.build();
    }


    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ResResult<String> processException(Exception exception) {
        log.error(exception.getLocalizedMessage(), exception);
        // 这里可以屏蔽掉后台的异常栈信息，直接返回"server error"
        return ResResult.error(exception.getLocalizedMessage());
    }

}
