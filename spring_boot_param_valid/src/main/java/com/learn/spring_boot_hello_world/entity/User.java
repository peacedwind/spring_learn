package com.learn.spring_boot_hello_world.entity;

import lombok.Data;

import javax.annotation.processing.Generated;
import javax.persistence.*;

/**
 * @description:
 * @author: cyx
 * @date: 2022-09-29
 **/
@Data
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String email;

    private String phone;
}
