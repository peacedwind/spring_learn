package com.learn.spring_boot_hello_world.DTO;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

/**
 * @description:
 * @author: cyx
 * @date: 2022-09-29
 **/
public class UserDTO {

    @NotEmpty(message = "姓名不能为空")
    private String name;

    @NotEmpty(message = "手机号不能为空")
    @Pattern(regexp = "^[1]\\d{10}$")
    private String phone;

    @NotEmpty
    @Email
    private String email;
}
