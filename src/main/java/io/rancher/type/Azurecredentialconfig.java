package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Password;

public class Azurecredentialconfig extends AbstractType {
    
    private String clientId;
    
    private Password clientSecret;
    
    private String subscriptionId;
    
    public String getClientId() {
        return this.clientId;
    }

    public void setClientId(String clientId) {
      this.clientId = clientId;
    }
    
    public Password getClientSecret() {
        return this.clientSecret;
    }

    public void setClientSecret(Password clientSecret) {
      this.clientSecret = clientSecret;
    }
    
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
      this.subscriptionId = subscriptionId;
    }
    
}
