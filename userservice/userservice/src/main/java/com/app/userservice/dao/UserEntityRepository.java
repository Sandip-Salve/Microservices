package com.app.userservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.userservice.entity.UserEntity;

@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity, Long>{

}
