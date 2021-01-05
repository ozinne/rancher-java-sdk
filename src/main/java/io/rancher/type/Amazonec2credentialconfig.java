package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Password;

public class Amazonec2credentialconfig extends AbstractType {
    
    private String accessKey;
    
    private Password secretKey;
    
    public String getAccessKey() {
        return this.accessKey;
    }

    public void setAccessKey(String accessKey) {
      this.accessKey = accessKey;
    }
    
    public Password getSecretKey() {
        return this.secretKey;
    }

    public void setSecretKey(Password secretKey) {
      this.secretKey = secretKey;
    }
    
}
