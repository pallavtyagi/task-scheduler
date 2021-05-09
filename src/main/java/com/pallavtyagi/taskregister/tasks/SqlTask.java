package com.pallavtyagi.taskregister.tasks;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;


@Component
@Log4j2
public class SqlTask implements Task<String, String>{

    @Override
    public String apply(String s) throws Exception {
        //Assuming its running a SQL on a DB and writing output to below file.
        log.info("Executing SQL Task NOW");
        //File file = Paths.get("D:\\workspace\\task-register\\src\\main\\resources\\test.txt").toFile();
        return "D:\\\\workspace\\\\task-register\\\\src\\\\main\\\\resources\\\\test.txt";
    }
}
