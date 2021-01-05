package io.rancher.type;

import io.rancher.base.AbstractType;

public class BackupConfig extends AbstractType {
    
    private Boolean enabled;
    
    private Integer intervalHours;
    
    private Integer retention;
    
    private S3BackupConfig s3BackupConfig;
    
    private Boolean safeTimestamp;
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
    public Integer getIntervalHours() {
        return this.intervalHours;
    }

    public void setIntervalHours(Integer intervalHours) {
      this.intervalHours = intervalHours;
    }
    
    public Integer getRetention() {
        return this.retention;
    }

    public void setRetention(Integer retention) {
      this.retention = retention;
    }
    
    public S3BackupConfig getS3BackupConfig() {
        return this.s3BackupConfig;
    }

    public void setS3BackupConfig(S3BackupConfig s3BackupConfig) {
      this.s3BackupConfig = s3BackupConfig;
    }
    
    public Boolean getSafeTimestamp() {
        return this.safeTimestamp;
    }

    public void setSafeTimestamp(Boolean safeTimestamp) {
      this.safeTimestamp = safeTimestamp;
    }
    
}
