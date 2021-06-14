package com.example.batch.import_todo;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class EmptyTask implements Tasklet {

    private static final Logger log = LoggerFactory.getLogger(EmptyTask.class);

    @Override
    public RepeatStatus execute(@NotNull StepContribution contribution, @NotNull ChunkContext chunkContext)
            throws Exception {
        log.debug("empty task");
        return RepeatStatus.FINISHED;
    }
}
