package io.rancher.type;

import io.rancher.base.AbstractType;

public class LocalClusterAuthEndpoint extends AbstractType {
    
    private String caCerts;
    
    private Boolean enabled;
    
    private String fqdn;
    
    public String getCaCerts() {
        return this.caCerts;
    }

    public void setCaCerts(String caCerts) {
      this.caCerts = caCerts;
    }
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
    public String getFqdn() {
        return this.fqdn;
    }

    public void setFqdn(String fqdn) {
      this.fqdn = fqdn;
    }
    
}
