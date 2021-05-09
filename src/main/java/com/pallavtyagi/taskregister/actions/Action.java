package com.pallavtyagi.taskregister.actions;

public interface Action<T, D> {
    public void accept(T t, D d) throws Exception;
}
