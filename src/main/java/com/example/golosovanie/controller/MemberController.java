package com.example.golosovanie.controller;

import com.example.golosovanie.entity.Member;
import com.example.golosovanie.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping()
    public List<Member> getAllMembers(){
        return memberService.getAllMember();
    }

    @PostMapping("/{id}")
    public Member updateMember(@PathVariable String id){
        return memberService.updateMember(Long.parseLong(id));
    }

    @PostMapping("/reg/{member}")
    public Member regNewMember(@PathVariable String member){
        return memberService.regNewMember(member);
    }
}
