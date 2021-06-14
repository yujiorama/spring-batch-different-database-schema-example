package com.example.batch;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;

public class JobStepExecutionListener extends JobExecutionListenerSupport implements StepExecutionListener {

    private static final Logger log = LoggerFactory.getLogger(JobStepExecutionListener.class);

    @Override
    public void beforeStep(@NotNull StepExecution stepExecution) {
        if (log.isInfoEnabled()) {
            log.info(stepExecution.getSummary());
        }
    }

    @Override
    public ExitStatus afterStep(@NotNull StepExecution stepExecution) {
        if (log.isInfoEnabled()) {
            log.info(stepExecution.getSummary());
        }
        // ステップの終了ステータスを変えるときは値を変更する
        return null;
    }

    @Override
    public void beforeJob(@NotNull JobExecution jobExecution) {
        if (log.isInfoEnabled()) {
            log.info(jobExecution.toString());
        }
    }

    @Override
    public void afterJob(@NotNull JobExecution jobExecution) {
        if (log.isInfoEnabled()) {
            log.info(jobExecution.toString());
        }
    }
}

