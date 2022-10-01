/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author pavan
 */
public class viewEmployee {
    private ArrayList<Product> view;
    
    public viewEmployee() {
        this.view = new ArrayList<>();
        
    }

public Product addProduct(){
     Product newProducts = new Product();
     view.add(newProducts); 
     return newProducts; 
}    

    public ArrayList<Product> getHistory() {
        return view;
    }

    public void deleteProduct(Product p) {
     view.remove(p); 
    }
}   
