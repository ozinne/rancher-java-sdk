package io.rancher.type;

import io.rancher.base.AbstractType;

public class FeatureStatus extends AbstractType {
    
    private Boolean default_;
    
    private String description;
    
    private Boolean dynamic;
    
    public Boolean getDefault() {
        return this.default_;
    }

    public void setDefault(Boolean default_) {
      this.default_ = default_;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public Boolean getDynamic() {
        return this.dynamic;
    }

    public void setDynamic(Boolean dynamic) {
      this.dynamic = dynamic;
    }
    
}
