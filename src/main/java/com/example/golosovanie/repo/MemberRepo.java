package com.example.golosovanie.repo;

import com.example.golosovanie.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepo extends JpaRepository<Member,Long> {
    List<Member> findAll();
    Member findMemberById(Long id);


}
