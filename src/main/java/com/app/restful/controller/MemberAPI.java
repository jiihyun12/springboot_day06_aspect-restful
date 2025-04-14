package com.app.restful.controller;

import com.app.restful.domain.MemberVO;
import com.app.restful.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members/api/*")
public class MemberAPI {

    private final MemberService memberService;

//    url 파라미터 : 모든 컨트롤러에서 사용이 가능하지만 보통 rest에서 사용된다.
    @GetMapping("member/{id}")
    public MemberVO getMember(@PathVariable Long id){

        if(foundMember.isPresent()){
            return foundMember.get();
        }

//       잘못 전달하면 빈 객체를 전달한다.
//       exception 보다는 null을 보내서 값을 잘못 전달하게 처리한다.
//       그래서 대부분 Optional로 안보낼때가 많지만 상세하게 전달할 때에는 Optional로 전달한다.
        return new MemberVO();
    }
}
