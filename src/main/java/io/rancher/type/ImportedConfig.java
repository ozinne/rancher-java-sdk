package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Password;

public class ImportedConfig extends AbstractType {
    
    private Password kubeConfig;
    
    public Password getKubeConfig() {
        return this.kubeConfig;
    }

    public void setKubeConfig(Password kubeConfig) {
      this.kubeConfig = kubeConfig;
    }
    
}
