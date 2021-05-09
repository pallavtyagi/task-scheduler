package com.pallavtyagi.taskregister.models;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class RegisterEntity {
    private String taskName;
    private String schedule;
    private String task;
    private String taskData;
    private String Action;
    private String actionData;
}
