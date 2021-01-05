package io.rancher.type;

import io.rancher.base.AbstractType;

public class CertExpiration extends AbstractType {
    
    private String expirationDate;
    
    public String getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
      this.expirationDate = expirationDate;
    }
    
}
