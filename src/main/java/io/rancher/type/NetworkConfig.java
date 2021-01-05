package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class NetworkConfig extends AbstractType {
    
    private CalicoNetworkProvider calicoNetworkProvider;
    
    private CanalNetworkProvider canalNetworkProvider;
    
    private FlannelNetworkProvider flannelNetworkProvider;
    
    private Integer mtu;
    
    private Map<String, Object> nodeSelector;
    
    private Map<String, Object> options;
    
    private String plugin;
    
    private DaemonSetUpdateStrategy updateStrategy;
    
    private WeaveNetworkProvider weaveNetworkProvider;
    
    public CalicoNetworkProvider getCalicoNetworkProvider() {
        return this.calicoNetworkProvider;
    }

    public void setCalicoNetworkProvider(CalicoNetworkProvider calicoNetworkProvider) {
      this.calicoNetworkProvider = calicoNetworkProvider;
    }
    
    public CanalNetworkProvider getCanalNetworkProvider() {
        return this.canalNetworkProvider;
    }

    public void setCanalNetworkProvider(CanalNetworkProvider canalNetworkProvider) {
      this.canalNetworkProvider = canalNetworkProvider;
    }
    
    public FlannelNetworkProvider getFlannelNetworkProvider() {
        return this.flannelNetworkProvider;
    }

    public void setFlannelNetworkProvider(FlannelNetworkProvider flannelNetworkProvider) {
      this.flannelNetworkProvider = flannelNetworkProvider;
    }
    
    public Integer getMtu() {
        return this.mtu;
    }

    public void setMtu(Integer mtu) {
      this.mtu = mtu;
    }
    
    public Map<String, Object> getNodeSelector() {
        return this.nodeSelector;
    }

    public void setNodeSelector(Map<String, Object> nodeSelector) {
      this.nodeSelector = nodeSelector;
    }
    
    public Map<String, Object> getOptions() {
        return this.options;
    }

    public void setOptions(Map<String, Object> options) {
      this.options = options;
    }
    
    public String getPlugin() {
        return this.plugin;
    }

    public void setPlugin(String plugin) {
      this.plugin = plugin;
    }
    
    public DaemonSetUpdateStrategy getUpdateStrategy() {
        return this.updateStrategy;
    }

    public void setUpdateStrategy(DaemonSetUpdateStrategy updateStrategy) {
      this.updateStrategy = updateStrategy;
    }
    
    public WeaveNetworkProvider getWeaveNetworkProvider() {
        return this.weaveNetworkProvider;
    }

    public void setWeaveNetworkProvider(WeaveNetworkProvider weaveNetworkProvider) {
      this.weaveNetworkProvider = weaveNetworkProvider;
    }
    
}
