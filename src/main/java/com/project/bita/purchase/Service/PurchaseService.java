package com.project.bita.purchase.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bita.purchase.controller.PurchaseController;
import com.project.bita.purchase.model.Purchase;
import com.project.bita.purchase.repository.PurchaseRepository;

@Service
public class PurchaseService {
    private final PurchaseRepository purchaseRepository;  

    @Autowired  
    public PurchaseService(PurchaseRepository purchaseRepository) {  
        this.purchaseRepository = purchaseRepository;  
    }  

    public List<Purchase> getAllPurchases() {  
        return purchaseRepository.findAll();  
    }  

    public Optional<Purchase> getPurchaseById(Long id) {  
        return purchaseRepository.findById(id);  
    }  

    public Purchase createPurchase(Purchase purchase) {  
        return purchaseRepository.save(purchase);  
    }  

    public void deletePurchaseById(Long id) {  
        purchaseRepository.deleteById(id);  
    }

    public int getCountOfItems() {  
        return PurchaseController.countItemsQt();  
    }

	
  
}
