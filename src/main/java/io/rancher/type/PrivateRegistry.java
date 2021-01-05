package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Password;

public class PrivateRegistry extends AbstractType {
    
    private Boolean isDefault;
    
    private Password password;
    
    private String url;
    
    private String user;
    
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
      this.isDefault = isDefault;
    }
    
    public Password getPassword() {
        return this.password;
    }

    public void setPassword(Password password) {
      this.password = password;
    }
    
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
      this.url = url;
    }
    
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
      this.user = user;
    }
    
}
