package com.brixton.demodata.repositories;

import com.brixton.demodata.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
