package com.f3pro.dsdeliver.repositorie;

import com.f3pro.dsdeliver.etities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    List<Product> findAllByOrderByNameAsc();
}
