package io.rancher.type;

import io.rancher.base.AbstractType;

public class RouteOpenstackOpts extends AbstractType {
    
    private String routerId;

    public String getRouterId() {
        return routerId;
    }

    public void setRouterId(String routerId) {
        this.routerId = routerId;
    }
}
