package com.learn.spring_boot_hello_world.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: cyx
 * @date: 2022-09-29
 **/
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class ResResult<T> {

    @ApiModelProperty(name = "timeStep",value = "时间戳")
    private Long timeStep;

    @ApiModelProperty(name = "data",value = "数据")
    private T data;

    private String status;

    private String desc;


    public static <T> ResResult<T> success(T data){
        return resResult(ResponseStatus.HTTP_STATUS_200,data);
    }

    public static <T> ResResult<T> resResult(ResponseStatus responseStatus,T data){
        return ResResult.<T>builder()
                .data(data).status(responseStatus.getCode())
                .desc(responseStatus.getDesc())
                .timeStep(System.currentTimeMillis())
                .build();
    }

    public static <T> ResResult<T> error(){
        return resResult(ResponseStatus.HTTP_STATUS_500,null);
    }

    public static ResResult<String> error(String message){
        ResResult<String> resResult = resResult(ResponseStatus.HTTP_STATUS_500, null);
        resResult.setDesc(message);
        return resResult;
    }

}
