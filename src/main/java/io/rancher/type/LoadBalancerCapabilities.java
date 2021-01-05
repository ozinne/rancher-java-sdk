package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class LoadBalancerCapabilities extends AbstractType {
    
    private Boolean enabled;
    
    private Boolean healthCheckSupported;
    
    private List<String> protocolsSupported;
    
    private String provider;
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
    public Boolean getHealthCheckSupported() {
        return this.healthCheckSupported;
    }

    public void setHealthCheckSupported(Boolean healthCheckSupported) {
      this.healthCheckSupported = healthCheckSupported;
    }
    
    public List<String> getProtocolsSupported() {
        return this.protocolsSupported;
    }

    public void setProtocolsSupported(List<String> protocolsSupported) {
      this.protocolsSupported = protocolsSupported;
    }
    
    public String getProvider() {
        return this.provider;
    }

    public void setProvider(String provider) {
      this.provider = provider;
    }
    
}
