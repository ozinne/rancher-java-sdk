package io.rancher.type;

import io.rancher.base.AbstractType;

public class MetadataOpenstackOpts extends AbstractType {
    
    private Integer requestTimeout;
    
    private String searchOrder;

    public Integer getRequestTimeout() {
        return requestTimeout;
    }

    public String getSearchOrder() {
        return searchOrder;
    }

    public void setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
    }

    public void setSearchOrder(String searchOrder) {
        this.searchOrder = searchOrder;
    }
}
