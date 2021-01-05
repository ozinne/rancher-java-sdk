package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class RuntimeClassStrategyOptions extends AbstractType {
    
    private List<String> allowedRuntimeClassNames;
    
    private String defaultRuntimeClassName;
    
    public List<String> getAllowedRuntimeClassNames() {
        return this.allowedRuntimeClassNames;
    }

    public void setAllowedRuntimeClassNames(List<String> allowedRuntimeClassNames) {
      this.allowedRuntimeClassNames = allowedRuntimeClassNames;
    }
    
    public String getDefaultRuntimeClassName() {
        return this.defaultRuntimeClassName;
    }

    public void setDefaultRuntimeClassName(String defaultRuntimeClassName) {
      this.defaultRuntimeClassName = defaultRuntimeClassName;
    }
    
}
