package com.app.restful.service;

import com.app.restful.domain.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
@Slf4j
public class MemberServiceTests {

    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberVO memberVO;

    @Test
    public void memberSelectTest(){
        log.info("{}", memberService.getMemberInfo(1L));
    }


}
