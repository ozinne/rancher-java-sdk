package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Password;

import java.util.List;

public class GoogleKubernetesEngineConfig extends AbstractType {
    
    private String clusterIpv4Cidr;
    
    private Password credential;
    
    private String description;
    
    private Integer diskSizeGb;
    
    private String diskType;
    
    private String displayName;
    
    private String driverName;
    
    private Boolean enableAlphaFeature;
    
    private Boolean enableAutoRepair;
    
    private Boolean enableAutoUpgrade;
    
    private Boolean enableHorizontalPodAutoscaling;
    
    private Boolean enableHttpLoadBalancing;
    
    private Boolean enableKubernetesDashboard;
    
    private Boolean enableLegacyAbac;
    
    private Boolean enableMasterAuthorizedNetwork;
    
    private Boolean enableNetworkPolicyConfig;
    
    private Boolean enableNodepoolAutoscaling;
    
    private Boolean enablePrivateEndpoint;
    
    private Boolean enablePrivateNodes;
    
    private Boolean enableStackdriverLogging;
    
    private Boolean enableStackdriverMonitoring;
    
    private String imageType;
    
    private String ipPolicyClusterIpv4CidrBlock;
    
    private String ipPolicyClusterSecondaryRangeName;
    
    private Boolean ipPolicyCreateSubnetwork;
    
    private String ipPolicyNodeIpv4CidrBlock;
    
    private String ipPolicyServicesIpv4CidrBlock;
    
    private String ipPolicyServicesSecondaryRangeName;
    
    private String ipPolicySubnetworkName;
    
    private Boolean issueClientCertificate;
    
    private Boolean kubernetesDashboard;
    
    private List<String> labels;
    
    private Integer localSsdCount;
    
    private List<String> locations;
    
    private String machineType;
    
    private String maintenanceWindow;
    
    private List<String> masterAuthorizedNetworkCidrBlocks;
    
    private String masterIpv4CidrBlock;
    
    private String masterVersion;
    
    private Integer maxNodeCount;
    
    private Integer minNodeCount;
    
    private String name;
    
    private String network;
    
    private Integer nodeCount;
    
    private String nodePool;
    
    private String nodeVersion;
    
    private List<String> oauthScopes;
    
    private Boolean preemptible;
    
    private String projectId;
    
    private String region;
    
    private List<String> resourceLabels;
    
    private String serviceAccount;
    
    private String subNetwork;
    
    private List<String> taints;
    
    private Boolean useIpAliases;
    
    private String zone;
    
    public String getClusterIpv4Cidr() {
        return this.clusterIpv4Cidr;
    }

    public void setClusterIpv4Cidr(String clusterIpv4Cidr) {
      this.clusterIpv4Cidr = clusterIpv4Cidr;
    }
    
    public Password getCredential() {
        return this.credential;
    }

    public void setCredential(Password credential) {
      this.credential = credential;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public Integer getDiskSizeGb() {
        return this.diskSizeGb;
    }

    public void setDiskSizeGb(Integer diskSizeGb) {
      this.diskSizeGb = diskSizeGb;
    }
    
    public String getDiskType() {
        return this.diskType;
    }

    public void setDiskType(String diskType) {
      this.diskType = diskType;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
      this.displayName = displayName;
    }
    
    public String getDriverName() {
        return this.driverName;
    }

    public void setDriverName(String driverName) {
      this.driverName = driverName;
    }
    
    public Boolean getEnableAlphaFeature() {
        return this.enableAlphaFeature;
    }

    public void setEnableAlphaFeature(Boolean enableAlphaFeature) {
      this.enableAlphaFeature = enableAlphaFeature;
    }
    
    public Boolean getEnableAutoRepair() {
        return this.enableAutoRepair;
    }

    public void setEnableAutoRepair(Boolean enableAutoRepair) {
      this.enableAutoRepair = enableAutoRepair;
    }
    
    public Boolean getEnableAutoUpgrade() {
        return this.enableAutoUpgrade;
    }

    public void setEnableAutoUpgrade(Boolean enableAutoUpgrade) {
      this.enableAutoUpgrade = enableAutoUpgrade;
    }
    
    public Boolean getEnableHorizontalPodAutoscaling() {
        return this.enableHorizontalPodAutoscaling;
    }

    public void setEnableHorizontalPodAutoscaling(Boolean enableHorizontalPodAutoscaling) {
      this.enableHorizontalPodAutoscaling = enableHorizontalPodAutoscaling;
    }
    
    public Boolean getEnableHttpLoadBalancing() {
        return this.enableHttpLoadBalancing;
    }

    public void setEnableHttpLoadBalancing(Boolean enableHttpLoadBalancing) {
      this.enableHttpLoadBalancing = enableHttpLoadBalancing;
    }
    
    public Boolean getEnableKubernetesDashboard() {
        return this.enableKubernetesDashboard;
    }

    public void setEnableKubernetesDashboard(Boolean enableKubernetesDashboard) {
      this.enableKubernetesDashboard = enableKubernetesDashboard;
    }
    
    public Boolean getEnableLegacyAbac() {
        return this.enableLegacyAbac;
    }

    public void setEnableLegacyAbac(Boolean enableLegacyAbac) {
      this.enableLegacyAbac = enableLegacyAbac;
    }
    
    public Boolean getEnableMasterAuthorizedNetwork() {
        return this.enableMasterAuthorizedNetwork;
    }

    public void setEnableMasterAuthorizedNetwork(Boolean enableMasterAuthorizedNetwork) {
      this.enableMasterAuthorizedNetwork = enableMasterAuthorizedNetwork;
    }
    
    public Boolean getEnableNetworkPolicyConfig() {
        return this.enableNetworkPolicyConfig;
    }

    public void setEnableNetworkPolicyConfig(Boolean enableNetworkPolicyConfig) {
      this.enableNetworkPolicyConfig = enableNetworkPolicyConfig;
    }
    
    public Boolean getEnableNodepoolAutoscaling() {
        return this.enableNodepoolAutoscaling;
    }

    public void setEnableNodepoolAutoscaling(Boolean enableNodepoolAutoscaling) {
      this.enableNodepoolAutoscaling = enableNodepoolAutoscaling;
    }
    
    public Boolean getEnablePrivateEndpoint() {
        return this.enablePrivateEndpoint;
    }

    public void setEnablePrivateEndpoint(Boolean enablePrivateEndpoint) {
      this.enablePrivateEndpoint = enablePrivateEndpoint;
    }
    
    public Boolean getEnablePrivateNodes() {
        return this.enablePrivateNodes;
    }

    public void setEnablePrivateNodes(Boolean enablePrivateNodes) {
      this.enablePrivateNodes = enablePrivateNodes;
    }
    
    public Boolean getEnableStackdriverLogging() {
        return this.enableStackdriverLogging;
    }

    public void setEnableStackdriverLogging(Boolean enableStackdriverLogging) {
      this.enableStackdriverLogging = enableStackdriverLogging;
    }
    
    public Boolean getEnableStackdriverMonitoring() {
        return this.enableStackdriverMonitoring;
    }

    public void setEnableStackdriverMonitoring(Boolean enableStackdriverMonitoring) {
      this.enableStackdriverMonitoring = enableStackdriverMonitoring;
    }
    
    public String getImageType() {
        return this.imageType;
    }

    public void setImageType(String imageType) {
      this.imageType = imageType;
    }
    
    public String getIpPolicyClusterIpv4CidrBlock() {
        return this.ipPolicyClusterIpv4CidrBlock;
    }

    public void setIpPolicyClusterIpv4CidrBlock(String ipPolicyClusterIpv4CidrBlock) {
      this.ipPolicyClusterIpv4CidrBlock = ipPolicyClusterIpv4CidrBlock;
    }
    
    public String getIpPolicyClusterSecondaryRangeName() {
        return this.ipPolicyClusterSecondaryRangeName;
    }

    public void setIpPolicyClusterSecondaryRangeName(String ipPolicyClusterSecondaryRangeName) {
      this.ipPolicyClusterSecondaryRangeName = ipPolicyClusterSecondaryRangeName;
    }
    
    public Boolean getIpPolicyCreateSubnetwork() {
        return this.ipPolicyCreateSubnetwork;
    }

    public void setIpPolicyCreateSubnetwork(Boolean ipPolicyCreateSubnetwork) {
      this.ipPolicyCreateSubnetwork = ipPolicyCreateSubnetwork;
    }
    
    public String getIpPolicyNodeIpv4CidrBlock() {
        return this.ipPolicyNodeIpv4CidrBlock;
    }

    public void setIpPolicyNodeIpv4CidrBlock(String ipPolicyNodeIpv4CidrBlock) {
      this.ipPolicyNodeIpv4CidrBlock = ipPolicyNodeIpv4CidrBlock;
    }
    
    public String getIpPolicyServicesIpv4CidrBlock() {
        return this.ipPolicyServicesIpv4CidrBlock;
    }

    public void setIpPolicyServicesIpv4CidrBlock(String ipPolicyServicesIpv4CidrBlock) {
      this.ipPolicyServicesIpv4CidrBlock = ipPolicyServicesIpv4CidrBlock;
    }
    
    public String getIpPolicyServicesSecondaryRangeName() {
        return this.ipPolicyServicesSecondaryRangeName;
    }

    public void setIpPolicyServicesSecondaryRangeName(String ipPolicyServicesSecondaryRangeName) {
      this.ipPolicyServicesSecondaryRangeName = ipPolicyServicesSecondaryRangeName;
    }
    
    public String getIpPolicySubnetworkName() {
        return this.ipPolicySubnetworkName;
    }

    public void setIpPolicySubnetworkName(String ipPolicySubnetworkName) {
      this.ipPolicySubnetworkName = ipPolicySubnetworkName;
    }
    
    public Boolean getIssueClientCertificate() {
        return this.issueClientCertificate;
    }

    public void setIssueClientCertificate(Boolean issueClientCertificate) {
      this.issueClientCertificate = issueClientCertificate;
    }
    
    public Boolean getKubernetesDashboard() {
        return this.kubernetesDashboard;
    }

    public void setKubernetesDashboard(Boolean kubernetesDashboard) {
      this.kubernetesDashboard = kubernetesDashboard;
    }
    
    public List<String> getLabels() {
        return this.labels;
    }

    public void setLabels(List<String> labels) {
      this.labels = labels;
    }
    
    public Integer getLocalSsdCount() {
        return this.localSsdCount;
    }

    public void setLocalSsdCount(Integer localSsdCount) {
      this.localSsdCount = localSsdCount;
    }
    
    public List<String> getLocations() {
        return this.locations;
    }

    public void setLocations(List<String> locations) {
      this.locations = locations;
    }
    
    public String getMachineType() {
        return this.machineType;
    }

    public void setMachineType(String machineType) {
      this.machineType = machineType;
    }
    
    public String getMaintenanceWindow() {
        return this.maintenanceWindow;
    }

    public void setMaintenanceWindow(String maintenanceWindow) {
      this.maintenanceWindow = maintenanceWindow;
    }
    
    public List<String> getMasterAuthorizedNetworkCidrBlocks() {
        return this.masterAuthorizedNetworkCidrBlocks;
    }

    public void setMasterAuthorizedNetworkCidrBlocks(List<String> masterAuthorizedNetworkCidrBlocks) {
      this.masterAuthorizedNetworkCidrBlocks = masterAuthorizedNetworkCidrBlocks;
    }
    
    public String getMasterIpv4CidrBlock() {
        return this.masterIpv4CidrBlock;
    }

    public void setMasterIpv4CidrBlock(String masterIpv4CidrBlock) {
      this.masterIpv4CidrBlock = masterIpv4CidrBlock;
    }
    
    public String getMasterVersion() {
        return this.masterVersion;
    }

    public void setMasterVersion(String masterVersion) {
      this.masterVersion = masterVersion;
    }
    
    public Integer getMaxNodeCount() {
        return this.maxNodeCount;
    }

    public void setMaxNodeCount(Integer maxNodeCount) {
      this.maxNodeCount = maxNodeCount;
    }
    
    public Integer getMinNodeCount() {
        return this.minNodeCount;
    }

    public void setMinNodeCount(Integer minNodeCount) {
      this.minNodeCount = minNodeCount;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getNetwork() {
        return this.network;
    }

    public void setNetwork(String network) {
      this.network = network;
    }
    
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    public void setNodeCount(Integer nodeCount) {
      this.nodeCount = nodeCount;
    }
    
    public String getNodePool() {
        return this.nodePool;
    }

    public void setNodePool(String nodePool) {
      this.nodePool = nodePool;
    }
    
    public String getNodeVersion() {
        return this.nodeVersion;
    }

    public void setNodeVersion(String nodeVersion) {
      this.nodeVersion = nodeVersion;
    }
    
    public List<String> getOauthScopes() {
        return this.oauthScopes;
    }

    public void setOauthScopes(List<String> oauthScopes) {
      this.oauthScopes = oauthScopes;
    }
    
    public Boolean getPreemptible() {
        return this.preemptible;
    }

    public void setPreemptible(Boolean preemptible) {
      this.preemptible = preemptible;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
      this.region = region;
    }
    
    public List<String> getResourceLabels() {
        return this.resourceLabels;
    }

    public void setResourceLabels(List<String> resourceLabels) {
      this.resourceLabels = resourceLabels;
    }
    
    public String getServiceAccount() {
        return this.serviceAccount;
    }

    public void setServiceAccount(String serviceAccount) {
      this.serviceAccount = serviceAccount;
    }
    
    public String getSubNetwork() {
        return this.subNetwork;
    }

    public void setSubNetwork(String subNetwork) {
      this.subNetwork = subNetwork;
    }
    
    public List<String> getTaints() {
        return this.taints;
    }

    public void setTaints(List<String> taints) {
      this.taints = taints;
    }
    
    public Boolean getUseIpAliases() {
        return this.useIpAliases;
    }

    public void setUseIpAliases(Boolean useIpAliases) {
      this.useIpAliases = useIpAliases;
    }
    
    public String getZone() {
        return this.zone;
    }

    public void setZone(String zone) {
      this.zone = zone;
    }
    
}
