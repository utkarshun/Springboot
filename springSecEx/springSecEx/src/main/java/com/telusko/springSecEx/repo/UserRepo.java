package com.telusko.springSecEx.repo;

import com.telusko.springSecEx.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//if we want loaduserByUsername in MyUserDetailsService.java to fetch data we need a repo layer
@Repository
public interface UserRepo extends JpaRepository <Users,Integer>{
    Users findByUsername(String username);
}
