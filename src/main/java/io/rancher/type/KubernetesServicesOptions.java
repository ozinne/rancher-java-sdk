package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class KubernetesServicesOptions extends AbstractType {
    
    private Map<String, Object> etcd;
    
    private Map<String, Object> kubeController;
    
    private Map<String, Object> kubeapi;
    
    private Map<String, Object> kubelet;
    
    private Map<String, Object> kubeproxy;
    
    private Map<String, Object> scheduler;
    
    public Map<String, Object> getEtcd() {
        return this.etcd;
    }

    public void setEtcd(Map<String, Object> etcd) {
      this.etcd = etcd;
    }
    
    public Map<String, Object> getKubeController() {
        return this.kubeController;
    }

    public void setKubeController(Map<String, Object> kubeController) {
      this.kubeController = kubeController;
    }
    
    public Map<String, Object> getKubeapi() {
        return this.kubeapi;
    }

    public void setKubeapi(Map<String, Object> kubeapi) {
      this.kubeapi = kubeapi;
    }
    
    public Map<String, Object> getKubelet() {
        return this.kubelet;
    }

    public void setKubelet(Map<String, Object> kubelet) {
      this.kubelet = kubelet;
    }
    
    public Map<String, Object> getKubeproxy() {
        return this.kubeproxy;
    }

    public void setKubeproxy(Map<String, Object> kubeproxy) {
      this.kubeproxy = kubeproxy;
    }
    
    public Map<String, Object> getScheduler() {
        return this.scheduler;
    }

    public void setScheduler(Map<String, Object> scheduler) {
      this.scheduler = scheduler;
    }
    
}
