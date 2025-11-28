/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert2_51422361;

/**
 *
 * @author Raissa Putri
 */
public class Seller extends User{
    private String product;
    
    public void addProduct (String productName){
        System.out.println("Seller menggunakan " + productName);
        this.product = productName;
    }
}

