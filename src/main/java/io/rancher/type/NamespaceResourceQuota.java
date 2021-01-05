package io.rancher.type;

import io.rancher.base.AbstractType;

public class NamespaceResourceQuota extends AbstractType {
    
    private ResourceQuotaLimit limit;
    
    public ResourceQuotaLimit getLimit() {
        return this.limit;
    }

    public void setLimit(ResourceQuotaLimit limit) {
      this.limit = limit;
    }
    
}
