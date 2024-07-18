package com.project.bita.purchase.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.bita.purchase.model.Purchase;


@Repository
public interface PurchaseRepository extends JpaRepository<Purchase,Long> {
    
    @Query (value = "select sum(qty) from purchase ;",nativeQuery = true)
    int countItemsQuantity();

    List<Purchase> findByPurchasefull_nameContaining(Object full_name);
}
