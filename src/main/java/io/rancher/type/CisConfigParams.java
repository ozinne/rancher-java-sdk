package io.rancher.type;

import io.rancher.base.AbstractType;

public class CisConfigParams extends AbstractType {
    
    private String benchmarkVersion;
    
    public String getBenchmarkVersion() {
        return this.benchmarkVersion;
    }

    public void setBenchmarkVersion(String benchmarkVersion) {
      this.benchmarkVersion = benchmarkVersion;
    }
    
}
