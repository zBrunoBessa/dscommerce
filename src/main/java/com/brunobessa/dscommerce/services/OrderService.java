package com.brunobessa.dscommerce.services;

import com.brunobessa.dscommerce.dto.OrderDTO;
import com.brunobessa.dscommerce.dto.ProductDTO;
import com.brunobessa.dscommerce.entities.Order;
import com.brunobessa.dscommerce.entities.Product;
import com.brunobessa.dscommerce.repositories.OrderRepository;
import com.brunobessa.dscommerce.repositories.ProductRepository;
import com.brunobessa.dscommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id) {
        Order order = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));
        return new OrderDTO(order);
    }
}
