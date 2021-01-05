package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Password;

public class Vmwarevspherecredentialconfig extends AbstractType {
    
    private Password password;
    
    private String username;
    
    private String vcenter;
    
    private String vcenterPort;
    
    public Password getPassword() {
        return this.password;
    }

    public void setPassword(Password password) {
      this.password = password;
    }
    
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
      this.username = username;
    }
    
    public String getVcenter() {
        return this.vcenter;
    }

    public void setVcenter(String vcenter) {
      this.vcenter = vcenter;
    }
    
    public String getVcenterPort() {
        return this.vcenterPort;
    }

    public void setVcenterPort(String vcenterPort) {
      this.vcenterPort = vcenterPort;
    }
    
}
