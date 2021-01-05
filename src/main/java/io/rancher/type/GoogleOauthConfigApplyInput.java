package io.rancher.type;

import io.rancher.base.AbstractType;

public class GoogleOauthConfigApplyInput extends AbstractType {
    
    private String code;
    
    private Boolean enabled;
    
    private GoogleOauthConfig googleOauthConfig;
    
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
      this.code = code;
    }
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
    public GoogleOauthConfig getGoogleOauthConfig() {
        return this.googleOauthConfig;
    }

    public void setGoogleOauthConfig(GoogleOauthConfig googleOauthConfig) {
      this.googleOauthConfig = googleOauthConfig;
    }
    
}
