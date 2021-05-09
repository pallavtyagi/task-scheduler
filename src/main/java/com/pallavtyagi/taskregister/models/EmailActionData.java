package com.pallavtyagi.taskregister.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class EmailActionData {
    private String to;
    private String subject;
    private String body;
    private Boolean attachResults;
}
