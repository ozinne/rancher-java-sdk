package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Password;

public class WeaveNetworkProvider extends AbstractType {
    
    private Password password;
    
    public Password getPassword() {
        return this.password;
    }

    public void setPassword(Password password) {
      this.password = password;
    }
    
}
