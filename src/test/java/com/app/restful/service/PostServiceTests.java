package com.app.restful.service;

import com.app.restful.mapper.PostMapper;
import com.app.restful.repository.PostDAO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class PostServiceTests {

    @Autowired
    private PostService postService;

    @Autowired
    private PostDAO postDAO;


    @Test
    public void getPostService() {
//        log.info("{}", postService.getPost(10L));
        log.info("{}", postDAO.findById(10L));
    }
}
