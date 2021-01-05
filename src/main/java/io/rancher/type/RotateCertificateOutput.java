package io.rancher.type;

import io.rancher.base.AbstractType;

public class RotateCertificateOutput extends AbstractType {
    
    private String message;
    
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
      this.message = message;
    }
    
}
