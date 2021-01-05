package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Password;

import java.util.List;

public class EtcdBackupStatus extends AbstractType {
    
    private Password clusterObject;
    
    private List<EtcdBackupCondition> conditions;
    
    private String kubernetesVersion;
    
    public Password getClusterObject() {
        return this.clusterObject;
    }

    public void setClusterObject(Password clusterObject) {
      this.clusterObject = clusterObject;
    }
    
    public List<EtcdBackupCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<EtcdBackupCondition> conditions) {
      this.conditions = conditions;
    }
    
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    public void setKubernetesVersion(String kubernetesVersion) {
      this.kubernetesVersion = kubernetesVersion;
    }
    
}
