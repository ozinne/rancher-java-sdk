package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Password;

public class VirtualCenterConfig extends AbstractType {
    
    private String datacenters;
    
    private Password password;
    
    private String port;
    
    private Integer soapRoundtripCount;
    
    private String user;

    public String getDatacenters() {
        return datacenters;
    }

    public void setDatacenters(String datacenters) {
        this.datacenters = datacenters;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Integer getSoapRoundtripCount() {
        return soapRoundtripCount;
    }

    public void setSoapRoundtripCount(Integer soapRoundtripCount) {
        this.soapRoundtripCount = soapRoundtripCount;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
