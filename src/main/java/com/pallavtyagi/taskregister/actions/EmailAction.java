package com.pallavtyagi.taskregister.actions;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class EmailAction implements Action<String, String>{
    @Override
    public void accept(String content, String data) throws Exception {
        log.info("Sending Email with File:{}", content);
        //
    }
}
