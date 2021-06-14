package com.example.batch.import_todo;

import com.example.batch.JobStepExecutionListener;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
public class ImportTodoConfiguration {

    private static final String BATCH_NAME = "importTodo";

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean(BATCH_NAME + "Step")
    public Step step() {
        return stepBuilderFactory.get(BATCH_NAME + "Step")
                                 .tasklet(new EmptyTask())
                                 .build();
    }

    @Bean(BATCH_NAME + "Job")
    public Job job() {
        return jobBuilderFactory.get(BATCH_NAME + "Job")
                                .incrementer(new RunIdIncrementer())
                                .listener(new JobStepExecutionListener())
                                .start(step())
                                .build();
    }
}
