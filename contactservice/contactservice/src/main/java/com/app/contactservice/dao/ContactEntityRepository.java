package com.app.contactservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.contactservice.entity.ContactEntity;

@Repository
public interface ContactEntityRepository extends JpaRepository<ContactEntity, Long>{

	List<ContactEntity> findByUserId(Long userId);
}
