package com.pallavtyagi.taskregister.dao;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Register {
    private String taskName;
    private String schedule;
    private String task;
    private String taskData;
    private String action;
    private String actionData;

}
