package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Password;

public class Digitaloceanconfig extends AbstractType {
    
    private Password accessToken;
    
    private Boolean backups;
    
    private String image;
    
    private Boolean ipv6;
    
    private Boolean monitoring;
    
    private Boolean privateNetworking;
    
    private String region;
    
    private String size;
    
    private Password sshKeyContents;
    
    private String sshKeyFingerprint;
    
    private String sshPort;
    
    private String sshUser;
    
    private String tags;
    
    private String userdata;
    
    public Password getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(Password accessToken) {
      this.accessToken = accessToken;
    }
    
    public Boolean getBackups() {
        return this.backups;
    }

    public void setBackups(Boolean backups) {
      this.backups = backups;
    }
    
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }
    
    public Boolean getIpv6() {
        return this.ipv6;
    }

    public void setIpv6(Boolean ipv6) {
      this.ipv6 = ipv6;
    }
    
    public Boolean getMonitoring() {
        return this.monitoring;
    }

    public void setMonitoring(Boolean monitoring) {
      this.monitoring = monitoring;
    }
    
    public Boolean getPrivateNetworking() {
        return this.privateNetworking;
    }

    public void setPrivateNetworking(Boolean privateNetworking) {
      this.privateNetworking = privateNetworking;
    }
    
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
      this.region = region;
    }
    
    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
      this.size = size;
    }
    
    public Password getSshKeyContents() {
        return this.sshKeyContents;
    }

    public void setSshKeyContents(Password sshKeyContents) {
      this.sshKeyContents = sshKeyContents;
    }
    
    public String getSshKeyFingerprint() {
        return this.sshKeyFingerprint;
    }

    public void setSshKeyFingerprint(String sshKeyFingerprint) {
      this.sshKeyFingerprint = sshKeyFingerprint;
    }
    
    public String getSshPort() {
        return this.sshPort;
    }

    public void setSshPort(String sshPort) {
      this.sshPort = sshPort;
    }
    
    public String getSshUser() {
        return this.sshUser;
    }

    public void setSshUser(String sshUser) {
      this.sshUser = sshUser;
    }
    
    public String getTags() {
        return this.tags;
    }

    public void setTags(String tags) {
      this.tags = tags;
    }
    
    public String getUserdata() {
        return this.userdata;
    }

    public void setUserdata(String userdata) {
      this.userdata = userdata;
    }
    
}
