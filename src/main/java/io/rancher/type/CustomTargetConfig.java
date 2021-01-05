package io.rancher.type;

import io.rancher.base.AbstractType;

public class CustomTargetConfig extends AbstractType {
    
    private String certificate;
    
    private String clientCert;
    
    private String clientKey;
    
    private String content;
    
    public String getCertificate() {
        return this.certificate;
    }

    public void setCertificate(String certificate) {
      this.certificate = certificate;
    }
    
    public String getClientCert() {
        return this.clientCert;
    }

    public void setClientCert(String clientCert) {
      this.clientCert = clientCert;
    }
    
    public String getClientKey() {
        return this.clientKey;
    }

    public void setClientKey(String clientKey) {
      this.clientKey = clientKey;
    }
    
    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
      this.content = content;
    }
    
}
