package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Password;

public class FluentServer extends AbstractType {
    
    private String endpoint;
    
    private String hostname;
    
    private Password password;
    
    private Password sharedKey;
    
    private Boolean standby;
    
    private String username;
    
    private Integer weight;
    
    public String getEndpoint() {
        return this.endpoint;
    }

    public void setEndpoint(String endpoint) {
      this.endpoint = endpoint;
    }
    
    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
      this.hostname = hostname;
    }
    
    public Password getPassword() {
        return this.password;
    }

    public void setPassword(Password password) {
      this.password = password;
    }
    
    public Password getSharedKey() {
        return this.sharedKey;
    }

    public void setSharedKey(Password sharedKey) {
      this.sharedKey = sharedKey;
    }
    
    public Boolean getStandby() {
        return this.standby;
    }

    public void setStandby(Boolean standby) {
      this.standby = standby;
    }
    
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
      this.username = username;
    }
    
    public Integer getWeight() {
        return this.weight;
    }

    public void setWeight(Integer weight) {
      this.weight = weight;
    }
    
}
