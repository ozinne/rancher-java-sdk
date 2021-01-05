package io.rancher.type;

import io.rancher.base.AbstractType;

public class LoadBalancerOpenstackOpts extends AbstractType {

    private Boolean createMonitor;

    private String floatingNetworkId;

    private String lbMethod;

    private String lbProvider;

    private String lbVersion;

    private Boolean manageSecurityGroups;

    private String monitorDelay;

    private Integer monitorMaxRetries;

    private String monitorTimeout;

    private String subnetId;

    private Boolean useOctavia;

    public Boolean getCreateMonitor() {
        return createMonitor;
    }

    public void setCreateMonitor(Boolean createMonitor) {
        this.createMonitor = createMonitor;
    }

    public String getFloatingNetworkId() {
        return floatingNetworkId;
    }

    public void setFloatingNetworkId(String floatingNetworkId) {
        this.floatingNetworkId = floatingNetworkId;
    }

    public String getLbMethod() {
        return lbMethod;
    }

    public void setLbMethod(String lbMethod) {
        this.lbMethod = lbMethod;
    }

    public String getLbProvider() {
        return lbProvider;
    }

    public void setLbProvider(String lbProvider) {
        this.lbProvider = lbProvider;
    }

    public String getLbVersion() {
        return lbVersion;
    }

    public void setLbVersion(String lbVersion) {
        this.lbVersion = lbVersion;
    }

    public Boolean getManageSecurityGroups() {
        return manageSecurityGroups;
    }

    public void setManageSecurityGroups(Boolean manageSecurityGroups) {
        this.manageSecurityGroups = manageSecurityGroups;
    }

    public String getMonitorDelay() {
        return monitorDelay;
    }

    public void setMonitorDelay(String monitorDelay) {
        this.monitorDelay = monitorDelay;
    }

    public Integer getMonitorMaxRetries() {
        return monitorMaxRetries;
    }

    public void setMonitorMaxRetries(Integer monitorMaxRetries) {
        this.monitorMaxRetries = monitorMaxRetries;
    }

    public String getMonitorTimeout() {
        return monitorTimeout;
    }

    public void setMonitorTimeout(String monitorTimeout) {
        this.monitorTimeout = monitorTimeout;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public Boolean getUseOctavia() {
        return useOctavia;
    }

    public void setUseOctavia(Boolean useOctavia) {
        this.useOctavia = useOctavia;
    }
}
