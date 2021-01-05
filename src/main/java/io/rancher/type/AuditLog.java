package io.rancher.type;

import io.rancher.base.AbstractType;

public class AuditLog extends AbstractType {
    
    private AuditLogConfig configuration;
    
    private Boolean enabled;
    
    public AuditLogConfig getConfiguration() {
        return this.configuration;
    }

    public void setConfiguration(AuditLogConfig configuration) {
      this.configuration = configuration;
    }
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
}
