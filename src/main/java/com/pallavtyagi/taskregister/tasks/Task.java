package com.pallavtyagi.taskregister.tasks;

public interface Task<T, R> {
    R apply(T t) throws Exception;
}
