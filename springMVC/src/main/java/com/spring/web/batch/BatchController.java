package com.spring.web.batch;

import com.spring.batch.job.ScheduleResultCheckJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class BatchController {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    ScheduleResultCheckJob scheduleResultCheckJob;

    @Scheduled(cron = "5 * * * * *")
    public void checkScheduleResultExecute() {
        logger.info("스케줄 결과 체크 시작");
        try {
            scheduleResultCheckJob.checkGo();
        } catch (Exception e) {
            logger.info("스케줄 결과체크 에러 - {} / {}", e.getMessage(), e.getStackTrace());
        }
    }
}
