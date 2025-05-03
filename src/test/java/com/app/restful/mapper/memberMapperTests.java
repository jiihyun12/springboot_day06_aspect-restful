package com.app.restful.mapper;

import com.app.restful.domain.MemberVO;
import com.app.restful.repository.MemberDAO;
import com.app.restful.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class memberMapperTests {

    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberMapper memberMapper;

    @Test
    public void memberSelectTest(){
        log.info("{}", memberService.login(1L));
    }

    @Test
    public void memberInsertTest(){
        MemberVO memberVO = new MemberVO();
        memberVO.setMemberEmail("test@gmail.com");
        memberVO.setMemberName("장보고");
        memberVO.setMemberPassword("1234");

        memberMapper.insert(memberVO);
    }

    @Test
    public void memberUpdateTest(){
        MemberVO memberVO = new MemberVO();

        memberVO.setId(61L);
        memberVO.setMemberEmail("test@gmail.com");
        memberVO.setMemberName("이순신");
        memberVO.setMemberPassword("1234");

        memberMapper.update(memberVO);
    }

    @Test
    public void memberDeleteTest(){
        memberMapper.delete(61L);
    }

}
