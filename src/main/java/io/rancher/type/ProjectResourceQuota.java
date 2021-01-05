package io.rancher.type;

import io.rancher.base.AbstractType;

public class ProjectResourceQuota extends AbstractType {
    
    private ResourceQuotaLimit limit;
    
    private ResourceQuotaLimit usedLimit;
    
    public ResourceQuotaLimit getLimit() {
        return this.limit;
    }

    public void setLimit(ResourceQuotaLimit limit) {
      this.limit = limit;
    }
    
    public ResourceQuotaLimit getUsedLimit() {
        return this.usedLimit;
    }

    public void setUsedLimit(ResourceQuotaLimit usedLimit) {
      this.usedLimit = usedLimit;
    }
    
}
