package com.projectsjava.rest_demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectsjava.rest_demo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")

public class CloudAPIService {
    
    CloudVendor cv;
    
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return new CloudVendor("C1","Name1","Address1","PhoneNumber1");
    }
    
    @PostMapping
    public String uploadCloudVendorDetails(@RequestBody CloudVendor cv){
        this.cv = cv;
        return "Service is Uploaded";  
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cv){
        this.cv = cv;
        return "Service is updated";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId){
        this.cv = null;
        return "Deleted";
    }
}
