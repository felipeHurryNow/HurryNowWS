/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hurrynow.hurrynowws.services;

import com.hurrynow.hurrynowws.model.Store;
import com.hurrynow.hurrynowws.model.Ubication;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author felip
 */
@Path("serviceUbications")
public class UbicationService {
    
    
    private static Map<Integer, Ubication> ubications = new HashMap<Integer,Ubication>(); 
    
    static {
    
        for (int i=0; i<10; i++){
        
            Ubication ubication = new Ubication(); 
            int id = i+1; 
            ubication.setIdBranchOffice(id);
            ubication.setLatitude(-44.879966+id);
            ubication.setLongitude(78.099889+id);
            
            
            
            ubications.put(id,ubication); 
           
        }
    }
    
    @GET
    @Path("/getUbicationByIdXml/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Ubication getUbicationByIdXml(@PathParam("id") int id ){
    
        return ubications.get(id); 
    
    }
    
    @GET
    @Path("/getUbicationByIdJson/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Ubication getBranchOfficeByIdJson(@PathParam("id")int id){
    
        return ubications.get(id); 
    }
    
    @GET
    @Path("/getAllUbicationsInXml")
    @Produces(MediaType.APPLICATION_XML)
    public List<Ubication> getAllClientsInXml(){
    
        return new ArrayList<Ubication>(ubications.values()); 
    }
    
    @GET
    @Path("/getAllUbicationsInJson")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Ubication> getAllClientsInJson(){
    
        return new ArrayList<Ubication>(ubications.values()); 
    }
    
    
    
}
