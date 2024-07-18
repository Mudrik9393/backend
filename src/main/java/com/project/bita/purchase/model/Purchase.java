package com.project.bita.purchase.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="purchase")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String full_name;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private int quantity;
    @Column(nullable = false)
    private String grade;
    @Column(nullable = false)
    private double total_amount;
    @Column(nullable = false)

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFullName() {
        return full_name;
    }
    public void setFullName(String fullName) {
        this.full_name = fullName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public double getTotalAmount() {
        return total_amount;
    }
    public void setTotalAmount(double totalAmount) {
        this.total_amount = totalAmount;
    }
    

    
    
}
