package com.example.htl.W1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.htl.W1.model.MenuType;

@Repository("menuTypeRepository")
public interface MenuTypeRepository extends JpaRepository<MenuType, Long>{
	MenuType findByMenuTypeId(long menuTypeId);
}
