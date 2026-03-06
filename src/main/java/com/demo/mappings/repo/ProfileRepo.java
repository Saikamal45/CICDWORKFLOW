package com.demo.mappings.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.mappings.entity.Profile;

@Repository
public interface ProfileRepo extends JpaRepository<Profile, Long>{

}
