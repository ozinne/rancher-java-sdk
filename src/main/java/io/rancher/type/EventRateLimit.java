package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class EventRateLimit extends AbstractType {
    
    private Map<String, Object> configuration;
    
    private Boolean enabled;
    
    public Map<String, Object> getConfiguration() {
        return this.configuration;
    }

    public void setConfiguration(Map<String, Object> configuration) {
      this.configuration = configuration;
    }
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
}
