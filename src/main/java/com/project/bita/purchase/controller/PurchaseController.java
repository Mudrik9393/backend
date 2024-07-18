package com.project.bita.purchase.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.bita.purchase.model.Purchase;
import com.project.bita.purchase.repository.PurchaseRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin
@RestController
@RequestMapping("/api/purchases")
public class PurchaseController {
    
    public final PurchaseRepository purchaseRepository;
    public PurchaseController(PurchaseRepository purchaseRepository){
        this.purchaseRepository=purchaseRepository;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Purchase>> getAllPurchase(){
        List<Purchase> pr =purchaseRepository.findAll();
        return new ResponseEntity<>(pr, HttpStatus.OK);
    }
    @GetMapping("/Id")
    public ResponseEntity<Purchase> getPurchasesById(@PathVariable Long id){
   Optional<Purchase> pr =purchaseRepository.findById(id);
   return new ResponseEntity<>(pr.get(), HttpStatus.OK); 
    }

    @PostMapping("/save")
    public Purchase createPurchase(@RequestBody Purchase purchase){
        return purchaseRepository.save(purchase);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        purchaseRepository.deleteById(id);
        return new ResponseEntity<>("Delete data success", HttpStatus.OK);
    }

    @GetMapping("/items")
    public ResponseEntity<Purchase> getPurchaseByfull_name(@PathVariable String full_name){
        Optional<Purchase> pr =purchaseRepository.findByPurchasefull_nameContaining(full_name); 
       return new ResponseEntity<>(pr.get(),HttpStatus.OK);
     }
       
}