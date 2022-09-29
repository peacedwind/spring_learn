package com.learn.spring_boot_hello_world.DTO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

/**
 * @description:
 * @author: cyx
 * @date: 2022-09-29
 **/
@Data
@ApiModel
public class UserDTO {

    @ApiModelProperty(name = "name",value = "name1")
    @NotEmpty(message = "{user.name.notEmpty}")
    private String name;

    @NotEmpty(message = "手机号不能为空")
    @ApiModelProperty(name = "phone",value = "phone1")
    @Pattern(regexp = "^[1]\\d{10}$",message = "欢欢来了")
    private String phone;

    @NotEmpty
    @Email(message = "欢欢的邮箱")
    @ApiModelProperty(name = "email",value = "email1")
    private String email;
}
