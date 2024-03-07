package iegcode.Javaspringlogging;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class LoggingTest {

    @Test
    void testLog() {
        log.info("Learn Java");
        log.warn("Learn Spring");
        log.error("Learn IegCode");
    }
}
