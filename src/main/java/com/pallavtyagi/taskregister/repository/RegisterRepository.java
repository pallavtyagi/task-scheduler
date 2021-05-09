package com.pallavtyagi.taskregister.repository;

import com.pallavtyagi.taskregister.dao.Register;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RegisterRepository extends MongoRepository<Register, String> {

}
