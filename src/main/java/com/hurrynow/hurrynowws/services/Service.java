/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hurrynow.hurrynowws.services;

import com.hurrynow.hurrynowws.model.Client;
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

@Path("service")
public class Service {
    
    private static Map<Integer, Client> clients = new HashMap<Integer,Client>(); 
    
    static {
    
        for (int i=0; i<10; i++){
        
            Client client = new Client(); 
            int id = i+1; 
            client.setName("Felipe "+id);
            client.setLastName("Tarquino " +id );
            client.setAddress("AVENIDA "+id);
            client.setIdCliente(id);
            client.setEmail("danie@hurrynow.com "+id);
            client.setPhone(123+id);
            client.setPoints(id+50);
            client.setPassword("contraseña "+id);
            
            clients.put(id,client); 
           
        }
    }
    
    @GET
    @Path("/getClientByIdXml/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Client getClientByIdXml(@PathParam("id") int id ){
    
        return clients.get(id); 
    
    }
    
    @GET
    @Path("/getClientByIdJson/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Client getClientByIdJson(@PathParam("id")int id){
    
        return clients.get(id); 
    }
    
    @GET
    @Path("/getAllClientsInXml")
    @Produces(MediaType.APPLICATION_XML)
    public List<Client> getAllClientsInXml(){
    
        return new ArrayList<Client>(clients.values()); 
    }
    
    @GET
    @Path("/getAllClientsInJson")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Client> getAllClientsInJson(){
    
        return new ArrayList<Client>(clients.values()); 
    }
    
}
