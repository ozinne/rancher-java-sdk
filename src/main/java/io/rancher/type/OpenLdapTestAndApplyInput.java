package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Password;

public class OpenLdapTestAndApplyInput extends AbstractType {
    
    private LdapConfig ldapConfig;
    
    private Password password;
    
    private String username;
    
    public LdapConfig getLdapConfig() {
        return this.ldapConfig;
    }

    public void setLdapConfig(LdapConfig ldapConfig) {
      this.ldapConfig = ldapConfig;
    }
    
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
    
}
