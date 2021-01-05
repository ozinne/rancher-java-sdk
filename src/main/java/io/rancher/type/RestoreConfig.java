package io.rancher.type;

import io.rancher.base.AbstractType;

public class RestoreConfig extends AbstractType {
    
    private Boolean restore;
    
    private String snapshotName;
    
    public Boolean getRestore() {
        return this.restore;
    }

    public void setRestore(Boolean restore) {
      this.restore = restore;
    }
    
    public String getSnapshotName() {
        return this.snapshotName;
    }

    public void setSnapshotName(String snapshotName) {
      this.snapshotName = snapshotName;
    }
    
}
