package io.rancher.type;

import io.rancher.base.AbstractType;

public class FlannelNetworkProvider extends AbstractType {
    
    private String iface;
    
    public String getIface() {
        return this.iface;
    }

    public void setIface(String iface) {
      this.iface = iface;
    }
    
}
