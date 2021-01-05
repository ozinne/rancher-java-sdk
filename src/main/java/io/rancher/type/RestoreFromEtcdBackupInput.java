package io.rancher.type;

import io.rancher.base.AbstractType;

public class RestoreFromEtcdBackupInput extends AbstractType {
    
    private String etcdBackupId;
    
    private String restoreRkeConfig;
    
    public String getEtcdBackupId() {
        return this.etcdBackupId;
    }

    public void setEtcdBackupId(String etcdBackupId) {
      this.etcdBackupId = etcdBackupId;
    }
    
    public String getRestoreRkeConfig() {
        return this.restoreRkeConfig;
    }

    public void setRestoreRkeConfig(String restoreRkeConfig) {
      this.restoreRkeConfig = restoreRkeConfig;
    }
    
}
