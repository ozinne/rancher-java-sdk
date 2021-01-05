package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Password;

public class Route53ProviderConfig extends AbstractType {
    
    private String accessKey;
    
    private String credentialsPath;
    
    private String region;
    
    private String roleArn;
    
    private Password secretKey;
    
    private String zoneType;
    
    public String getAccessKey() {
        return this.accessKey;
    }

    public void setAccessKey(String accessKey) {
      this.accessKey = accessKey;
    }
    
    public String getCredentialsPath() {
        return this.credentialsPath;
    }

    public void setCredentialsPath(String credentialsPath) {
      this.credentialsPath = credentialsPath;
    }
    
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
      this.region = region;
    }
    
    public String getRoleArn() {
        return this.roleArn;
    }

    public void setRoleArn(String roleArn) {
      this.roleArn = roleArn;
    }
    
    public Password getSecretKey() {
        return this.secretKey;
    }

    public void setSecretKey(Password secretKey) {
      this.secretKey = secretKey;
    }
    
    public String getZoneType() {
        return this.zoneType;
    }

    public void setZoneType(String zoneType) {
      this.zoneType = zoneType;
    }
    
}
