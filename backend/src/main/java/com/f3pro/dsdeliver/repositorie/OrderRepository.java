package com.f3pro.dsdeliver.repositorie;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.f3pro.dsdeliver.etities.Order;



@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {


	@Query("SELECT DISTINCT obj FROM Order obj JOIN FETCH obj.products"
			+ " WHERE obj.status = 0 ORDER BY obj.moment " )
	List<Order> findOrdersWithProducts();
}