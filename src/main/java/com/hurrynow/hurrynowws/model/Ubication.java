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

@XmlRootElement(name = "ubication")
@XmlType(propOrder={"idBranchOffice","longitude","latitude"})
public class Ubication {
    
    private int idBranchOffice; 
    private double longitude; 
    private double latitude; 

    @XmlElement
    public int getIdBranchOffice() {
        return idBranchOffice;
    }

    public void setIdBranchOffice(int idBranchOffice) {
        this.idBranchOffice = idBranchOffice;
    }

    @XmlElement
    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @XmlElement
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    
    
    
    
    
}
