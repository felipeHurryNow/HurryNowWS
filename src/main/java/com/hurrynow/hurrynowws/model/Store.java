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


@XmlRootElement(name = "store")
@XmlType(propOrder={"idStore","name","branchesOffice"})
public class Store {
    
    
    private int idStore; 
    private String name; 
    private String branchesOffice; 

    
    @XmlElement
    public int getIdStore() {
        return idStore;
    }

    public void setIdStore(int idStore) {
        this.idStore = idStore;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public String getBranchesOffice() {
        return branchesOffice;
    }

    public void setBranchesOffice(String branchesOffice) {
        this.branchesOffice = branchesOffice;
    }
    
    
    
}
