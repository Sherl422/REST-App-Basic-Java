package com.projectsjava.rest_demo.model;

public class CloudVendor {
    
    private String vednorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhoneNumber;

    
    public CloudVendor() {
    }

    public CloudVendor(String vednorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
        this.vednorId = vednorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    
    public String getVednorId() {
        return vednorId;
    }
    public void setVednorId(String vednorId) {
        this.vednorId = vednorId;
    }
    public String getVendorName() {
        return vendorName;
    }
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
    public String getVendorAddress() {
        return vendorAddress;
    }
    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }
    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }
    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }
    
    
}
