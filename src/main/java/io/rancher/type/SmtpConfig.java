package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Hostname;
import io.rancher.extend.Password;

public class SmtpConfig extends AbstractType {
    
    private String defaultRecipient;
    
    private Hostname host;
    
    private Password password;
    
    private Integer port;
    
    private String sender;
    
    private Boolean tls;
    
    private String username;
    
    public String getDefaultRecipient() {
        return this.defaultRecipient;
    }

    public void setDefaultRecipient(String defaultRecipient) {
      this.defaultRecipient = defaultRecipient;
    }
    
    public Hostname getHost() {
        return this.host;
    }

    public void setHost(Hostname host) {
      this.host = host;
    }
    
    public Password getPassword() {
        return this.password;
    }

    public void setPassword(Password password) {
      this.password = password;
    }
    
    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
      this.port = port;
    }
    
    public String getSender() {
        return this.sender;
    }

    public void setSender(String sender) {
      this.sender = sender;
    }
    
    public Boolean getTls() {
        return this.tls;
    }

    public void setTls(Boolean tls) {
      this.tls = tls;
    }
    
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
      this.username = username;
    }
    
}
