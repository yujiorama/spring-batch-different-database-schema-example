package com.example.batch.import_todo;

import org.junit.jupiter.api.Test;
import org.springframework.batch.test.context.SpringBatchTest;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.NONE,
        classes = {ImportTodoConfiguration.class}
)
@SpringBatchTest
@TestPropertySource(
        properties = {
                "spring.batch.job.enabled=true",
                "spring.batch.job.names=importTodoJob",
        }
)
@EnableAutoConfiguration
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DirtiesContext
@ActiveProfiles("test")
class ImportTodoTest {
    @Test
    void contextLoads() {
    }
}
