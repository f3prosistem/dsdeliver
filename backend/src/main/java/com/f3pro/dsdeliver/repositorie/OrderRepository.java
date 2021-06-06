package com.f3pro.dsdeliver.repositorie;

import com.f3pro.dsdeliver.etities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
