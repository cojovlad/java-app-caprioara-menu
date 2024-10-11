package com.caprioara_menu.repository.Interface;

import com.caprioara_menu.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Long> {

    Category save(Category category);

    Category findCategoriesById(Long id);

    List<Category> findAll();

    void deleteById(Long id);
}
