package com.app.restful.mapper;

import com.app.restful.domain.PostVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class postMapperTests {

    @Autowired
    private PostMapper postMapper;

    @Test
    public void selectAllTest(){
        log.info("{}", postMapper.selectAll());
    }

    @Test
    public void selectByIdTest(){
        log.info("{}", postMapper.selectById(10L));
    }

    @Test
    public void insertTest(){
        PostVO postVO = new PostVO();
        postVO.setPostTitle("테스트 게시글 제목 100");
        postVO.setPostContent("테스트 게시글 내용 100");
        postVO.setMemberId(25L);
        postMapper.insert(postVO);
    }

    @Test
    public void updateTest(){
        PostVO postVO = new PostVO();
        postVO.setId(101L);
        postVO.setPostTitle("테스트 게시글 제목 1000");
        postVO.setPostContent("테스트 게시글 내용 1000");
        postMapper.update(postVO);
    }

    @Test
    public void deleteTest(){
        postMapper.delete(101L);
    }

    @Test
    public void deleteAllTest(){
        postMapper.deleteAll(21L);
    }


}
