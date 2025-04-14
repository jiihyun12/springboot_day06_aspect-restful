package com.app.restful.mapper;

import com.app.restful.domain.PostDTO;

import java.util.List;
import java.util.Optional;

public interface PostMapper {

//    게시글 목록
    public List<PostDTO> selectAll();

//    게시글 1개 조회
    public Optional<PostDTO> selectById(Long id);
}
