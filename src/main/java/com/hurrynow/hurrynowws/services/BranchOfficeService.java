/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hurrynow.hurrynowws.services;

import com.hurrynow.hurrynowws.model.BranchOffice;
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

@Path("serviceBranchOffice")
public class BranchOfficeService {
    
    
    private static Map<Integer, BranchOffice> BranchesOffice = new HashMap<Integer,BranchOffice>(); 
    
    static {
    
        for (int i=0; i<10; i++){
        
            BranchOffice branchOffice = new BranchOffice(); 
            int id = i+1; 
            branchOffice.setIdBranchOffice(id);
            branchOffice.setIdStore(id*12 );
            branchOffice.setAddress("AVENIDA "+id+"Carrera "+id*21);
            branchOffice.setLocal("L-"+(id+100));
            branchOffice.setPhone(31200394+id);
            branchOffice.setLatitude(-44.879966+id);
            branchOffice.setLongitude(78.099889+id);
            branchOffice.setAtentionHour("lunes a viernes 8:30 am ");
            
            
            BranchesOffice.put(id,branchOffice); 
           
        }
    }
    
    @GET
    @Path("/getBranchOfficeByIdXml/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public BranchOffice getBranchOfficeByIdXml(@PathParam("id") int id ){
    
        return BranchesOffice.get(id); 
    
    }
    
    @GET
    @Path("/getBranchOfficeByIdJson/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public BranchOffice getBranchOfficeByIdJson(@PathParam("id")int id){
    
        return BranchesOffice.get(id); 
    }
    
    @GET
    @Path("/getAllBranchesOfficeInXml")
    @Produces(MediaType.APPLICATION_XML)
    public List<BranchOffice> getAllClientsInXml(){
    
        return new ArrayList<BranchOffice>(BranchesOffice.values()); 
    }
    
    @GET
    @Path("/getAllBranchesOfficeInJson")
    @Produces(MediaType.APPLICATION_JSON)
    public List<BranchOffice> getAllClientsInJson(){
    
        return new ArrayList<BranchOffice>(BranchesOffice.values()); 
    }
    
}
