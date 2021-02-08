package com.spring.batch.job;

import com.spring.schedule.service.ScheduleResultCheckManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ScheduleResultCheckJob {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    ScheduleResultCheckManager scheduleResultCheckManager;

    public void checkGo() {
        LocalDate currentDate = LocalDate.now();
        LocalDate startDate = currentDate.minusDays(1);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("YYYY-MM-DD");
        String currentDateString = currentDate.format(dateTimeFormatter);
        String beginDateString = startDate.format(dateTimeFormatter);
        scheduleResultCheckManager.checkSchedule(beginDateString, currentDateString);
    }
}
