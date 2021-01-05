package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Password;

public class CloudflareProviderConfig extends AbstractType {
    
    private String apiEmail;
    
    private Password apiKey;
    
    private Boolean proxySetting;
    
    public String getApiEmail() {
        return this.apiEmail;
    }

    public void setApiEmail(String apiEmail) {
      this.apiEmail = apiEmail;
    }
    
    public Password getApiKey() {
        return this.apiKey;
    }

    public void setApiKey(Password apiKey) {
      this.apiKey = apiKey;
    }
    
    public Boolean getProxySetting() {
        return this.proxySetting;
    }

    public void setProxySetting(Boolean proxySetting) {
      this.proxySetting = proxySetting;
    }
    
}
