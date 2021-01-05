package io.rancher.type;

import io.rancher.base.AbstractType;

public class PortCheck extends AbstractType {
    
    private String address;
    
    private Integer port;
    
    private String protocol;
    
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
      this.address = address;
    }
    
    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
      this.port = port;
    }
    
    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
      this.protocol = protocol;
    }
    
}
