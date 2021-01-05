package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Password;

public class Digitaloceancredentialconfig extends AbstractType {
    
    private Password accessToken;
    
    public Password getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(Password accessToken) {
      this.accessToken = accessToken;
    }
    
}
