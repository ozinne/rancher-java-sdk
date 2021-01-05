package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class SecretsEncryptionConfig extends AbstractType {
    
    private Map<String, Object> customConfig;
    
    private Boolean enabled;
    
    public Map<String, Object> getCustomConfig() {
        return this.customConfig;
    }

    public void setCustomConfig(Map<String, Object> customConfig) {
      this.customConfig = customConfig;
    }
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
}
