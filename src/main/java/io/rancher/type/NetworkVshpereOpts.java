package io.rancher.type;

import io.rancher.base.AbstractType;

public class NetworkVshpereOpts extends AbstractType {
    
    private String publicNetwork;

    public String getPublicNetwork() {
        return publicNetwork;
    }

    public void setPublicNetwork(String publicNetwork) {
        this.publicNetwork = publicNetwork;
    }
}
