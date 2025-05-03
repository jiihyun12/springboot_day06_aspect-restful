package com.app.restful.service;

import com.app.restful.domain.PostDTO;
import com.app.restful.domain.PostVO;

import java.util.List;
import java.util.Optional;

public interface PostService {

//    전체 게시물 조회
    public List<PostDTO> getPosts();

//    1개 게시물 조회
    public Optional<PostDTO> getPost(Long id);

//    게시글 작성
    public void write(PostVO postVO);

//    게시글 수정
    public void modify(PostVO postVO);

//    게시글 삭제
    public void remove(Long id);

}
