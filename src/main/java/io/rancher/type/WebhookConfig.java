package io.rancher.type;

import io.rancher.base.AbstractType;

public class WebhookConfig extends AbstractType {
    
    private String proxyUrl;
    
    private String url;
    
    public String getProxyUrl() {
        return this.proxyUrl;
    }

    public void setProxyUrl(String proxyUrl) {
      this.proxyUrl = proxyUrl;
    }
    
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
      this.url = url;
    }
    
}
