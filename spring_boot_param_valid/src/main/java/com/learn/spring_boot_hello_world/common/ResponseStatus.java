package com.learn.spring_boot_hello_world.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description:
 * @author: cyx
 * @date: 2022-09-29
 **/
@Getter
@AllArgsConstructor
public enum ResponseStatus {

    SUCCESS("200", "success"),
    FAIL("500", "failed"),

    HTTP_STATUS_200("200", "ok"),
    HTTP_STATUS_400("400", "request error"),
    HTTP_STATUS_401("401", "no authentication"),
    HTTP_STATUS_403("403", "no authorities"),
    HTTP_STATUS_500("500", "server error");

    private String code;

    private String desc;

}
