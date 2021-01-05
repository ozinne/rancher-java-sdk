package io.rancher.type;

import io.rancher.base.AbstractType;

public class TemplateStatus extends AbstractType {
    
    private String helmVersion;
    
    public String getHelmVersion() {
        return this.helmVersion;
    }

    public void setHelmVersion(String helmVersion) {
      this.helmVersion = helmVersion;
    }
    
}
