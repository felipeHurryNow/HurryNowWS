/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hurrynow.hurrynowws.services;

import com.hurrynow.hurrynowws.model.Product;
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

@Path("serviceProduct")
public class ProductService {
    
    
    private static Map<Integer, Product> products = new HashMap<Integer,Product>(); 
    
    static {
    
        for (int i=0; i<10; i++){
        
            Product product = new Product(); 
            int id = (i+1)*312; 
            product.setIdProduct(id);
            product.setIdBranchOffice(id*23);
            product.setPrice(id*12000);
            product.setIdProductCategory(id*45);
            Boolean enable = getRandomBoolean(); 
            product.setEnableDiscount(enable);
            product.setDescription("Este es el producto "+id);
            product.setIdDiscount(id*57);
           
            
            products.put(id,product); 
           
        }
    }
    
    public static boolean getRandomBoolean() {
        
        return Math.random() < 0.5;
    //I tried another approaches here, still the same result

     }
    
    
    @GET
    @Path("/getProductByIdXml/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Product getProductByIdXml(@PathParam("id") int id ){
    
        return products.get(id); 
    
    }
    
    @GET
    @Path("/getProductByIdJson/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Product getProductByIdJson(@PathParam("id")int id){
    
        return products.get(id); 
    }
    
    @GET
    @Path("/getAllProductsInXml")
    @Produces(MediaType.APPLICATION_XML)
    public List<Product> getAllClientsInXml(){
    
        return new ArrayList<Product>(products.values()); 
    }
    
    @GET
    @Path("/getAllProductsInJson")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getAllClientsInJson(){
    
        return new ArrayList<Product>(products.values()); 
    }
    
}
