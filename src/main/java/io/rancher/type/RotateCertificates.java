package io.rancher.type;

import io.rancher.base.AbstractType;

public class RotateCertificates extends AbstractType {
    
    private Boolean caCertificates;
    
    private String services;
    
    public Boolean getCaCertificates() {
        return this.caCertificates;
    }

    public void setCaCertificates(Boolean caCertificates) {
      this.caCertificates = caCertificates;
    }
    
    public String getServices() {
        return this.services;
    }

    public void setServices(String services) {
      this.services = services;
    }
    
}
