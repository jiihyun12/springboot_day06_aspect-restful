package com.app.aspect;

import com.app.aspect.service.SampleService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class SampleServiceTests {

    @Autowired
    private SampleService sampleService;

    @Test
    public void test() {
        log.info("{}", sampleService.doAdd("ㅁ", "2"));
    }

    @Test
    public void test2() {
        log.info("{}", sampleService.divide(10, 5));
    }
}
