package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Password;

import java.util.List;

public class AzureKubernetesServiceConfig extends AbstractType {
    
    private String aadClientAppId;
    
    private String aadServerAppId;
    
    private String aadServerAppSecret;
    
    private String aadTenantId;
    
    private String adminUsername;
    
    private Integer agentOsdiskSize;
    
    private String agentPoolName;
    
    private String agentStorageProfile;
    
    private String agentVmSize;
    
    private String authBaseUrl;
    
    private String baseUrl;
    
    private String clientId;
    
    private Password clientSecret;
    
    private Integer count;
    
    private String displayName;
    
    private String dnsServiceIp;
    
    private String dockerBridgeCidr;
    
    private String driverName;
    
    private Boolean enableHttpApplicationRouting;
    
    private Boolean enableMonitoring;
    
    private String kubernetesVersion;
    
    private String location;
    
    private String logAnalyticsWorkspace;
    
    private String logAnalyticsWorkspaceResourceGroup;
    
    private String masterDnsPrefix;
    
    private Integer maxPods;
    
    private String name;
    
    private String networkPlugin;
    
    private String networkPolicy;
    
    private String podCidr;
    
    private String resourceGroup;
    
    private String serviceCidr;
    
    private String sshPublicKeyContents;
    
    private String subnet;
    
    private String subscriptionId;
    
    private List<String> tags;
    
    private String tenantId;
    
    private String virtualNetwork;
    
    private String virtualNetworkResourceGroup;
    
    public String getAadClientAppId() {
        return this.aadClientAppId;
    }

    public void setAadClientAppId(String aadClientAppId) {
      this.aadClientAppId = aadClientAppId;
    }
    
    public String getAadServerAppId() {
        return this.aadServerAppId;
    }

    public void setAadServerAppId(String aadServerAppId) {
      this.aadServerAppId = aadServerAppId;
    }
    
    public String getAadServerAppSecret() {
        return this.aadServerAppSecret;
    }

    public void setAadServerAppSecret(String aadServerAppSecret) {
      this.aadServerAppSecret = aadServerAppSecret;
    }
    
    public String getAadTenantId() {
        return this.aadTenantId;
    }

    public void setAadTenantId(String aadTenantId) {
      this.aadTenantId = aadTenantId;
    }
    
    public String getAdminUsername() {
        return this.adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
      this.adminUsername = adminUsername;
    }
    
    public Integer getAgentOsdiskSize() {
        return this.agentOsdiskSize;
    }

    public void setAgentOsdiskSize(Integer agentOsdiskSize) {
      this.agentOsdiskSize = agentOsdiskSize;
    }
    
    public String getAgentPoolName() {
        return this.agentPoolName;
    }

    public void setAgentPoolName(String agentPoolName) {
      this.agentPoolName = agentPoolName;
    }
    
    public String getAgentStorageProfile() {
        return this.agentStorageProfile;
    }

    public void setAgentStorageProfile(String agentStorageProfile) {
      this.agentStorageProfile = agentStorageProfile;
    }
    
    public String getAgentVmSize() {
        return this.agentVmSize;
    }

    public void setAgentVmSize(String agentVmSize) {
      this.agentVmSize = agentVmSize;
    }
    
    public String getAuthBaseUrl() {
        return this.authBaseUrl;
    }

    public void setAuthBaseUrl(String authBaseUrl) {
      this.authBaseUrl = authBaseUrl;
    }
    
    public String getBaseUrl() {
        return this.baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
      this.baseUrl = baseUrl;
    }
    
    public String getClientId() {
        return this.clientId;
    }

    public void setClientId(String clientId) {
      this.clientId = clientId;
    }
    
    public Password getClientSecret() {
        return this.clientSecret;
    }

    public void setClientSecret(Password clientSecret) {
      this.clientSecret = clientSecret;
    }
    
    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
      this.count = count;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
      this.displayName = displayName;
    }
    
    public String getDnsServiceIp() {
        return this.dnsServiceIp;
    }

    public void setDnsServiceIp(String dnsServiceIp) {
      this.dnsServiceIp = dnsServiceIp;
    }
    
    public String getDockerBridgeCidr() {
        return this.dockerBridgeCidr;
    }

    public void setDockerBridgeCidr(String dockerBridgeCidr) {
      this.dockerBridgeCidr = dockerBridgeCidr;
    }
    
    public String getDriverName() {
        return this.driverName;
    }

    public void setDriverName(String driverName) {
      this.driverName = driverName;
    }
    
    public Boolean getEnableHttpApplicationRouting() {
        return this.enableHttpApplicationRouting;
    }

    public void setEnableHttpApplicationRouting(Boolean enableHttpApplicationRouting) {
      this.enableHttpApplicationRouting = enableHttpApplicationRouting;
    }
    
    public Boolean getEnableMonitoring() {
        return this.enableMonitoring;
    }

    public void setEnableMonitoring(Boolean enableMonitoring) {
      this.enableMonitoring = enableMonitoring;
    }
    
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    public void setKubernetesVersion(String kubernetesVersion) {
      this.kubernetesVersion = kubernetesVersion;
    }
    
    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
      this.location = location;
    }
    
    public String getLogAnalyticsWorkspace() {
        return this.logAnalyticsWorkspace;
    }

    public void setLogAnalyticsWorkspace(String logAnalyticsWorkspace) {
      this.logAnalyticsWorkspace = logAnalyticsWorkspace;
    }
    
    public String getLogAnalyticsWorkspaceResourceGroup() {
        return this.logAnalyticsWorkspaceResourceGroup;
    }

    public void setLogAnalyticsWorkspaceResourceGroup(String logAnalyticsWorkspaceResourceGroup) {
      this.logAnalyticsWorkspaceResourceGroup = logAnalyticsWorkspaceResourceGroup;
    }
    
    public String getMasterDnsPrefix() {
        return this.masterDnsPrefix;
    }

    public void setMasterDnsPrefix(String masterDnsPrefix) {
      this.masterDnsPrefix = masterDnsPrefix;
    }
    
    public Integer getMaxPods() {
        return this.maxPods;
    }

    public void setMaxPods(Integer maxPods) {
      this.maxPods = maxPods;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getNetworkPlugin() {
        return this.networkPlugin;
    }

    public void setNetworkPlugin(String networkPlugin) {
      this.networkPlugin = networkPlugin;
    }
    
    public String getNetworkPolicy() {
        return this.networkPolicy;
    }

    public void setNetworkPolicy(String networkPolicy) {
      this.networkPolicy = networkPolicy;
    }
    
    public String getPodCidr() {
        return this.podCidr;
    }

    public void setPodCidr(String podCidr) {
      this.podCidr = podCidr;
    }
    
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public void setResourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
    }
    
    public String getServiceCidr() {
        return this.serviceCidr;
    }

    public void setServiceCidr(String serviceCidr) {
      this.serviceCidr = serviceCidr;
    }
    
    public String getSshPublicKeyContents() {
        return this.sshPublicKeyContents;
    }

    public void setSshPublicKeyContents(String sshPublicKeyContents) {
      this.sshPublicKeyContents = sshPublicKeyContents;
    }
    
    public String getSubnet() {
        return this.subnet;
    }

    public void setSubnet(String subnet) {
      this.subnet = subnet;
    }
    
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
      this.subscriptionId = subscriptionId;
    }
    
    public List<String> getTags() {
        return this.tags;
    }

    public void setTags(List<String> tags) {
      this.tags = tags;
    }
    
    public String getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(String tenantId) {
      this.tenantId = tenantId;
    }
    
    public String getVirtualNetwork() {
        return this.virtualNetwork;
    }

    public void setVirtualNetwork(String virtualNetwork) {
      this.virtualNetwork = virtualNetwork;
    }
    
    public String getVirtualNetworkResourceGroup() {
        return this.virtualNetworkResourceGroup;
    }

    public void setVirtualNetworkResourceGroup(String virtualNetworkResourceGroup) {
      this.virtualNetworkResourceGroup = virtualNetworkResourceGroup;
    }
    
}
