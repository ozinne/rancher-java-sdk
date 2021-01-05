package io.rancher.type;

import io.rancher.base.AbstractType;

public class BlockStorageOpenstackOpts extends AbstractType {
    
    private String bsVersion;
    
    private Boolean ignoreVolumeAz;
    
    private Boolean trustDevicePath;

    public String getBsVersion() {
        return bsVersion;
    }

    public void setBsVersion(String bsVersion) {
        this.bsVersion = bsVersion;
    }

    public Boolean getIgnoreVolumeAz() {
        return ignoreVolumeAz;
    }

    public void setIgnoreVolumeAz(Boolean ignoreVolumeAz) {
        this.ignoreVolumeAz = ignoreVolumeAz;
    }

    public Boolean getTrustDevicePath() {
        return trustDevicePath;
    }

    public void setTrustDevicePath(Boolean trustDevicePath) {
        this.trustDevicePath = trustDevicePath;
    }
}
