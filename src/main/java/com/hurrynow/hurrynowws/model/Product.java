/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hurrynow.hurrynowws.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author felip
 */

@XmlRootElement(name = "product")
@XmlType(propOrder={"idProduct","idBranchOffice","price","idProductCategory","enableDiscount",
    "description","idDiscount"})
public class Product {
    
    private int idProduct; 
    private int idBranchOffice; 
    private double price; 
    private int idProductCategory; 
    private boolean enableDiscount; 
    private String description; 
    private int idDiscount; 

    
    @XmlElement 
    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
    
    @XmlElement 
    public int getIdBranchOffice() {
        return idBranchOffice;
    }

    public void setIdBranchOffice(int idBrancOffice) {
        this.idBranchOffice = idBrancOffice;
    }
    
    @XmlElement 
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @XmlElement 
    public int getIdProductCategory() {
        return idProductCategory;
    }

    public void setIdProductCategory(int idProductCategory) {
        this.idProductCategory = idProductCategory;
    }

    @XmlElement 
    public boolean isEnableDiscount() {
        return enableDiscount;
    }

    public void setEnableDiscount(boolean enableDiscount) {
        this.enableDiscount = enableDiscount;
    }

    @XmlElement 
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElement 
    public int getIdDiscount() {
        return idDiscount;
    }

    public void setIdDiscount(int idDiscount) {
        this.idDiscount = idDiscount;
    }
    
    
    
}
