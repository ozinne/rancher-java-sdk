package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Password;

public class BastionHost extends AbstractType {
    
    private String address;
    
    private String port;
    
    private Boolean sshAgentAuth;
    
    private String sshCert;
    
    private String sshCertPath;
    
    private Password sshKey;
    
    private String sshKeyPath;
    
    private String user;
    
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
      this.address = address;
    }
    
    public String getPort() {
        return this.port;
    }

    public void setPort(String port) {
      this.port = port;
    }
    
    public Boolean getSshAgentAuth() {
        return this.sshAgentAuth;
    }

    public void setSshAgentAuth(Boolean sshAgentAuth) {
      this.sshAgentAuth = sshAgentAuth;
    }
    
    public String getSshCert() {
        return this.sshCert;
    }

    public void setSshCert(String sshCert) {
      this.sshCert = sshCert;
    }
    
    public String getSshCertPath() {
        return this.sshCertPath;
    }

    public void setSshCertPath(String sshCertPath) {
      this.sshCertPath = sshCertPath;
    }
    
    public Password getSshKey() {
        return this.sshKey;
    }

    public void setSshKey(Password sshKey) {
      this.sshKey = sshKey;
    }
    
    public String getSshKeyPath() {
        return this.sshKeyPath;
    }

    public void setSshKeyPath(String sshKeyPath) {
      this.sshKeyPath = sshKeyPath;
    }
    
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
      this.user = user;
    }
    
}
