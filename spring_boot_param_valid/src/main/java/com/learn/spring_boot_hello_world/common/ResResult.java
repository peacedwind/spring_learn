package com.learn.spring_boot_hello_world.common;

import lombok.Builder;
import lombok.Data;

/**
 * @description:
 * @author: cyx
 * @date: 2022-09-29
 **/
@Builder
@Data
public class ResResult<T> {

    private Long timeStep;

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

}
