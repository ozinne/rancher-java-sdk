package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class AuthnConfig extends AbstractType {
    
    private List<String> sans;
    
    private String strategy;
    
    private AuthWebhookConfig webhook;
    
    public List<String> getSans() {
        return this.sans;
    }

    public void setSans(List<String> sans) {
      this.sans = sans;
    }
    
    public String getStrategy() {
        return this.strategy;
    }

    public void setStrategy(String strategy) {
      this.strategy = strategy;
    }
    
    public AuthWebhookConfig getWebhook() {
        return this.webhook;
    }

    public void setWebhook(AuthWebhookConfig webhook) {
      this.webhook = webhook;
    }
    
}
