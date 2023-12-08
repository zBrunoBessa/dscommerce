package com.brunobessa.dscommerce.repositories;

import com.brunobessa.dscommerce.entities.Category;
import com.brunobessa.dscommerce.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
