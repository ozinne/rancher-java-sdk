package io.rancher.type;

import io.rancher.base.AbstractType;

public class IngressCapabilities extends AbstractType {
    
    private Boolean customDefaultBackend;
    
    private String ingressProvider;
    
    public Boolean getCustomDefaultBackend() {
        return this.customDefaultBackend;
    }

    public void setCustomDefaultBackend(Boolean customDefaultBackend) {
      this.customDefaultBackend = customDefaultBackend;
    }
    
    public String getIngressProvider() {
        return this.ingressProvider;
    }

    public void setIngressProvider(String ingressProvider) {
      this.ingressProvider = ingressProvider;
    }
    
}
