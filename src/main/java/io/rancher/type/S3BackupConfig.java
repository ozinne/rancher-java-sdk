package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Password;

public class S3BackupConfig extends AbstractType {
    
    private String accessKey;
    
    private String bucketName;
    
    private String customCa;
    
    private String endpoint;
    
    private String folder;
    
    private String region;
    
    private Password secretKey;
    
    public String getAccessKey() {
        return this.accessKey;
    }

    public void setAccessKey(String accessKey) {
      this.accessKey = accessKey;
    }
    
    public String getBucketName() {
        return this.bucketName;
    }

    public void setBucketName(String bucketName) {
      this.bucketName = bucketName;
    }
    
    public String getCustomCa() {
        return this.customCa;
    }

    public void setCustomCa(String customCa) {
      this.customCa = customCa;
    }
    
    public String getEndpoint() {
        return this.endpoint;
    }

    public void setEndpoint(String endpoint) {
      this.endpoint = endpoint;
    }
    
    public String getFolder() {
        return this.folder;
    }

    public void setFolder(String folder) {
      this.folder = folder;
    }
    
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
      this.region = region;
    }
    
    public Password getSecretKey() {
        return this.secretKey;
    }

    public void setSecretKey(Password secretKey) {
      this.secretKey = secretKey;
    }
    
}
