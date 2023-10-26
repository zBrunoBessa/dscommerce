package com.brunobessa.dscommerce.repositories;

import com.brunobessa.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
