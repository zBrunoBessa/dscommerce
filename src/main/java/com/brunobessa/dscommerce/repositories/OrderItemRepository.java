package com.brunobessa.dscommerce.repositories;

import com.brunobessa.dscommerce.entities.Order;
import com.brunobessa.dscommerce.entities.OrderItem;
import com.brunobessa.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {


}
