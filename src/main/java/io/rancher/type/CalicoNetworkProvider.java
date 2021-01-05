package io.rancher.type;

import io.rancher.base.AbstractType;

public class CalicoNetworkProvider extends AbstractType {
    
    private String cloudProvider;
    
    public String getCloudProvider() {
        return this.cloudProvider;
    }

    public void setCloudProvider(String cloudProvider) {
      this.cloudProvider = cloudProvider;
    }
    
}
