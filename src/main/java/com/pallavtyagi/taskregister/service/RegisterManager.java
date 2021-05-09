package com.pallavtyagi.taskregister.service;

import com.pallavtyagi.taskregister.dao.Register;
import com.pallavtyagi.taskregister.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class RegisterManager {

    @Autowired
    private RegisterRepository registerRepository;

    @Bean
    public List<Register> registeredTasks() {
        List<Register> register = registerRepository.findAll();
        return register;
    }

}
