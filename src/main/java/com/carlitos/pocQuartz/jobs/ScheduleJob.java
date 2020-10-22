package com.carlitos.pocQuartz.jobs;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.time.LocalDateTime;

public class ScheduleJob implements Job {

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(String.format("processing... %s : %s : %s", now.getHour(), now.getMinute(), now.getSecond()));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("processed %s : %s : %s", now.getHour(), now.getMinute(), now.getSecond()));
    }
}
