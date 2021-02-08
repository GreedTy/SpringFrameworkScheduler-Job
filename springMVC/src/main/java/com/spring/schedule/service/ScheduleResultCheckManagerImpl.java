package com.spring.schedule.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ScheduleResultCheckManagerImpl implements ScheduleResultCheckManager {
    Logger logger = LoggerFactory.getLogger(getClass());
    public void checkSchedule(String startDateTime, String endDateTime) {
        logger.debug("StartDateTime:{}, EndDateTime:{}", startDateTime, endDateTime);
        System.out.println(startDateTime + ":" + endDateTime);
    }
}
