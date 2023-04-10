package com.example.golosovanie.service;

import com.example.golosovanie.entity.Member;
import com.example.golosovanie.repo.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    final MemberRepo memberRepo;

    public MemberService(MemberRepo memberRepo) {
        this.memberRepo = memberRepo;
    }

    public List<Member> getAllMember(){
        return memberRepo.findAll();
    }

    public Member updateMember(Long id){
        Member m = memberRepo.findMemberById(id);
        if(m != null){
            m.setCount(m.getCount()+1);
            memberRepo.save(m);
        }else{
            return null;
        }
        return m;
    }

    public Member regNewMember(String name){
        Member newMember = new Member();
        newMember.setMemberName(name);
        newMember.setCount(0);
        return memberRepo.save(newMember);
    }
}
