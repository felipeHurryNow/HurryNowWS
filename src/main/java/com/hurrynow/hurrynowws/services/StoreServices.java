/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hurrynow.hurrynowws.services;

import com.hurrynow.hurrynowws.model.Store;
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

@Path("serviceStores")
public class StoreServices {
    
    
     private static Map<Integer, Store> stores = new HashMap<Integer,Store>(); 
    
    static {
    
        for (int i=0; i<10; i++){
        
            Store store = new Store(); 
            int id = i+1; 
            store.setIdStore(id);
            store.setName("Tienda "+1);
            store.setBranchesOffice("Sucursal "+id);
            
            
            
            stores.put(id,store); 
           
        }
    }
    
    @GET
    @Path("/getStoreByIdXml/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Store getBranchOfficeByIdXml(@PathParam("id") int id ){
    
        return stores.get(id); 
    
    }
    
    @GET
    @Path("/getStoreByIdJson/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Store getBranchOfficeByIdJson(@PathParam("id")int id){
    
        return stores.get(id); 
    }
    
    @GET
    @Path("/getAllStoresInXml")
    @Produces(MediaType.APPLICATION_XML)
    public List<Store> getAllClientsInXml(){
    
        return new ArrayList<Store>(stores.values()); 
    }
    
    @GET
    @Path("/getAllStoresInJson")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Store> getAllClientsInJson(){
    
        return new ArrayList<Store>(stores.values()); 
    }
    
    
}
