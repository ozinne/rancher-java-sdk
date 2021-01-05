package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Password;

import java.util.Map;
import java.util.List;

public class CustomConfig extends AbstractType {
    
    private String address;
    
    private String dockerSocket;
    
    private String internalAddress;
    
    private Map<String, Object> label;
    
    private String sshCert;
    
    private Password sshKey;
    
    private List<String> taints;
    
    private String user;
    
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
      this.address = address;
    }
    
    public String getDockerSocket() {
        return this.dockerSocket;
    }

    public void setDockerSocket(String dockerSocket) {
      this.dockerSocket = dockerSocket;
    }
    
    public String getInternalAddress() {
        return this.internalAddress;
    }

    public void setInternalAddress(String internalAddress) {
      this.internalAddress = internalAddress;
    }
    
    public Map<String, Object> getLabel() {
        return this.label;
    }

    public void setLabel(Map<String, Object> label) {
      this.label = label;
    }
    
    public String getSshCert() {
        return this.sshCert;
    }

    public void setSshCert(String sshCert) {
      this.sshCert = sshCert;
    }
    
    public Password getSshKey() {
        return this.sshKey;
    }

    public void setSshKey(Password sshKey) {
      this.sshKey = sshKey;
    }
    
    public List<String> getTaints() {
        return this.taints;
    }

    public void setTaints(List<String> taints) {
      this.taints = taints;
    }
    
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
      this.user = user;
    }
    
}
