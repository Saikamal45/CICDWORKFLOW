package com.demo.mappings.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.mappings.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{

}
