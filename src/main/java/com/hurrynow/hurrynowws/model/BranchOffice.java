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


@XmlRootElement(name = "BranchOffice")
@XmlType(propOrder={"idBranchOffice","idStore","address","local","phone","latitude","longitude","atentionHour"})
public class BranchOffice {
    
    private int idBranchOffice; 
    private int idStore; 
    private String address; 
    private String local; 
    private int phone; 
    private double latitude; 
    private double longitude; 
    private String atentionHour; 

    
    @XmlElement 
    public int getIdBranchOffice() {
        return idBranchOffice;
    }

    public void setIdBranchOffice(int idBranchOffice) {
        this.idBranchOffice = idBranchOffice;
    }

    @XmlElement 
    public int getIdStore() {
        return idStore;
    }

    public void setIdStore(int idStore) {
        this.idStore = idStore;
    }

    @XmlElement 
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @XmlElement 
    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    @XmlElement 
    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @XmlElement 
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    
    @XmlElement 
    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @XmlElement 
    public String getAtentionHour() {
        return atentionHour;
    }

    public void setAtentionHour(String atentionHour) {
        this.atentionHour = atentionHour;
    }
    
    
    
    
    
}
