package io.rancher.type;

import io.rancher.base.AbstractType;

public class PagerdutyConfig extends AbstractType {
    
    private String proxyUrl;
    
    private String serviceKey;
    
    public String getProxyUrl() {
        return this.proxyUrl;
    }

    public void setProxyUrl(String proxyUrl) {
      this.proxyUrl = proxyUrl;
    }
    
    public String getServiceKey() {
        return this.serviceKey;
    }

    public void setServiceKey(String serviceKey) {
      this.serviceKey = serviceKey;
    }
    
}
