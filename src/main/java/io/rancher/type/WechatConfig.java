package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Password;

public class WechatConfig extends AbstractType {
    
    private String agent;
    
    private String apiUrl;
    
    private String corp;
    
    private String defaultRecipient;
    
    private String proxyUrl;
    
    private String recipientType;
    
    private Password secret;
    
    public String getAgent() {
        return this.agent;
    }

    public void setAgent(String agent) {
      this.agent = agent;
    }
    
    public String getApiUrl() {
        return this.apiUrl;
    }

    public void setApiUrl(String apiUrl) {
      this.apiUrl = apiUrl;
    }
    
    public String getCorp() {
        return this.corp;
    }

    public void setCorp(String corp) {
      this.corp = corp;
    }
    
    public String getDefaultRecipient() {
        return this.defaultRecipient;
    }

    public void setDefaultRecipient(String defaultRecipient) {
      this.defaultRecipient = defaultRecipient;
    }
    
    public String getProxyUrl() {
        return this.proxyUrl;
    }

    public void setProxyUrl(String proxyUrl) {
      this.proxyUrl = proxyUrl;
    }
    
    public String getRecipientType() {
        return this.recipientType;
    }

    public void setRecipientType(String recipientType) {
      this.recipientType = recipientType;
    }
    
    public Password getSecret() {
        return this.secret;
    }

    public void setSecret(Password secret) {
      this.secret = secret;
    }
    
}
