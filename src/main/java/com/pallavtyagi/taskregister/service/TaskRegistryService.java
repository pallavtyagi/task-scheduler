package com.pallavtyagi.taskregister.service;


import com.pallavtyagi.taskregister.actions.Action;
import com.pallavtyagi.taskregister.dao.Register;
import com.pallavtyagi.taskregister.tasks.Task;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.config.TriggerTask;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Log4j2
@EnableScheduling
public class TaskRegistryService implements SchedulingConfigurer {

    @Autowired
    Map<String, Task> tasks;

    @Autowired
    Map<String, Action> actions;

    @Autowired
    List<Register> registeredTasks;


    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar)  {
        log.info("Registering Tasks::"+registeredTasks);
        log.info("Tasks Available::"+ tasks);
        log.info("Actions Available::"+ actions);
        registeredTasks.stream().forEach(task ->
                taskRegistrar.addTriggerTask(new TriggerTask(() -> {
                    try {
                        actions.get(task.getAction()).accept(tasks.get(task.getTask()).apply(task.getTaskData()), task.getActionData());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }, new CronTrigger(task.getSchedule()))));

    }
}
