package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.DnsLabel;

import java.util.List;
import java.util.Map;

public class Cluster extends AbstractType {
    
    private Map<String, Object> agentFeatures;
    
    private String agentImage;
    
    private String agentImageOverride;
    
    private Map<String, Object> allocatable;
    
    private AmazonElasticContainerServiceConfig amazonElasticContainerServiceConfig;
    
    private Map<String, Object> annotations;
    
    private Answer answers;
    
    private String apiEndpoint;
    
    private Boolean appliedEnableNetworkPolicy;
    
    private String appliedPodSecurityPolicyTemplateId;
    
    private ClusterSpec appliedSpec;
    
    private String authImage;
    
    private AzureKubernetesServiceConfig azureKubernetesServiceConfig;
    
    private String caCert;
    
    private Capabilities capabilities;
    
    private Map<String, Object> capacity;
    
    private Map<String, Object> certificatesExpiration;
    
    private String clusterTemplateId;
    
    private String clusterTemplateRevisionId;
    
    private List<ClusterComponentStatus> componentStatuses;
    
    private List<ClusterCondition> conditions;
    
    private String created;
    
    private String creatorId;
    
    private String currentCisRunName;
    
    private String defaultClusterRoleForProjectMembers;
    
    private String defaultPodSecurityPolicyTemplateId;
    
    private String description;
    
    private String desiredAgentImage;
    
    private String desiredAuthImage;
    
    private String dockerRootDir;
    
    private String driver;
    
    private Boolean enableClusterAlerting;
    
    private Boolean enableClusterMonitoring;
    
    private Boolean enableNetworkPolicy;
    
    private ClusterSpec failedSpec;
    
    private GoogleKubernetesEngineConfig googleKubernetesEngineConfig;
    
    private ImportedConfig importedConfig;
    
    private Boolean internal;
    
    private Boolean istioEnabled;
    
    private K3sConfig k3sConfig;
    
    private Map<String, Object> labels;
    
    private Map<String, Object> limits;
    
    private LocalClusterAuthEndpoint localClusterAuthEndpoint;
    
    private MonitoringStatus monitoringStatus;
    
    private DnsLabel name;
    
    private Integer nodeCount;
    
    private Integer nodeVersion;
    
    private List<OwnerReference> ownerReferences;
    
    private List<Question> questions;
    
    private RancherKubernetesEngineConfig rancherKubernetesEngineConfig;
    
    private String removed;
    
    private Map<String, Object> requested;
    
    private ScheduledClusterScan scheduledClusterScan;
    
    private ScheduledClusterScanStatus scheduledClusterScanStatus;
    
    private String state;
    
    private TencentEngineConfig tencentEngineConfig;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private String uuid;
    
    private Info version;
    
    private Boolean windowsPreferedCluster;
    
    public Map<String, Object> getAgentFeatures() {
        return this.agentFeatures;
    }

    public void setAgentFeatures(Map<String, Object> agentFeatures) {
      this.agentFeatures = agentFeatures;
    }
    
    public String getAgentImage() {
        return this.agentImage;
    }

    public void setAgentImage(String agentImage) {
      this.agentImage = agentImage;
    }
    
    public String getAgentImageOverride() {
        return this.agentImageOverride;
    }

    public void setAgentImageOverride(String agentImageOverride) {
      this.agentImageOverride = agentImageOverride;
    }
    
    public Map<String, Object> getAllocatable() {
        return this.allocatable;
    }

    public void setAllocatable(Map<String, Object> allocatable) {
      this.allocatable = allocatable;
    }
    
    public AmazonElasticContainerServiceConfig getAmazonElasticContainerServiceConfig() {
        return this.amazonElasticContainerServiceConfig;
    }

    public void setAmazonElasticContainerServiceConfig(AmazonElasticContainerServiceConfig amazonElasticContainerServiceConfig) {
      this.amazonElasticContainerServiceConfig = amazonElasticContainerServiceConfig;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public Answer getAnswers() {
        return this.answers;
    }

    public void setAnswers(Answer answers) {
      this.answers = answers;
    }
    
    public String getApiEndpoint() {
        return this.apiEndpoint;
    }

    public void setApiEndpoint(String apiEndpoint) {
      this.apiEndpoint = apiEndpoint;
    }
    
    public Boolean getAppliedEnableNetworkPolicy() {
        return this.appliedEnableNetworkPolicy;
    }

    public void setAppliedEnableNetworkPolicy(Boolean appliedEnableNetworkPolicy) {
      this.appliedEnableNetworkPolicy = appliedEnableNetworkPolicy;
    }
    
    public String getAppliedPodSecurityPolicyTemplateId() {
        return this.appliedPodSecurityPolicyTemplateId;
    }

    public void setAppliedPodSecurityPolicyTemplateId(String appliedPodSecurityPolicyTemplateId) {
      this.appliedPodSecurityPolicyTemplateId = appliedPodSecurityPolicyTemplateId;
    }
    
    public ClusterSpec getAppliedSpec() {
        return this.appliedSpec;
    }

    public void setAppliedSpec(ClusterSpec appliedSpec) {
      this.appliedSpec = appliedSpec;
    }
    
    public String getAuthImage() {
        return this.authImage;
    }

    public void setAuthImage(String authImage) {
      this.authImage = authImage;
    }
    
    public AzureKubernetesServiceConfig getAzureKubernetesServiceConfig() {
        return this.azureKubernetesServiceConfig;
    }

    public void setAzureKubernetesServiceConfig(AzureKubernetesServiceConfig azureKubernetesServiceConfig) {
      this.azureKubernetesServiceConfig = azureKubernetesServiceConfig;
    }
    
    public String getCaCert() {
        return this.caCert;
    }

    public void setCaCert(String caCert) {
      this.caCert = caCert;
    }
    
    public Capabilities getCapabilities() {
        return this.capabilities;
    }

    public void setCapabilities(Capabilities capabilities) {
      this.capabilities = capabilities;
    }
    
    public Map<String, Object> getCapacity() {
        return this.capacity;
    }

    public void setCapacity(Map<String, Object> capacity) {
      this.capacity = capacity;
    }
    
    public Map<String, Object> getCertificatesExpiration() {
        return this.certificatesExpiration;
    }

    public void setCertificatesExpiration(Map<String, Object> certificatesExpiration) {
      this.certificatesExpiration = certificatesExpiration;
    }
    
    public String getClusterTemplateId() {
        return this.clusterTemplateId;
    }

    public void setClusterTemplateId(String clusterTemplateId) {
      this.clusterTemplateId = clusterTemplateId;
    }
    
    public String getClusterTemplateRevisionId() {
        return this.clusterTemplateRevisionId;
    }

    public void setClusterTemplateRevisionId(String clusterTemplateRevisionId) {
      this.clusterTemplateRevisionId = clusterTemplateRevisionId;
    }
    
    public List<ClusterComponentStatus> getComponentStatuses() {
        return this.componentStatuses;
    }

    public void setComponentStatuses(List<ClusterComponentStatus> componentStatuses) {
      this.componentStatuses = componentStatuses;
    }
    
    public List<ClusterCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<ClusterCondition> conditions) {
      this.conditions = conditions;
    }
    
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
      this.created = created;
    }
    
    public String getCreatorId() {
        return this.creatorId;
    }

    public void setCreatorId(String creatorId) {
      this.creatorId = creatorId;
    }
    
    public String getCurrentCisRunName() {
        return this.currentCisRunName;
    }

    public void setCurrentCisRunName(String currentCisRunName) {
      this.currentCisRunName = currentCisRunName;
    }
    
    public String getDefaultClusterRoleForProjectMembers() {
        return this.defaultClusterRoleForProjectMembers;
    }

    public void setDefaultClusterRoleForProjectMembers(String defaultClusterRoleForProjectMembers) {
      this.defaultClusterRoleForProjectMembers = defaultClusterRoleForProjectMembers;
    }
    
    public String getDefaultPodSecurityPolicyTemplateId() {
        return this.defaultPodSecurityPolicyTemplateId;
    }

    public void setDefaultPodSecurityPolicyTemplateId(String defaultPodSecurityPolicyTemplateId) {
      this.defaultPodSecurityPolicyTemplateId = defaultPodSecurityPolicyTemplateId;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public String getDesiredAgentImage() {
        return this.desiredAgentImage;
    }

    public void setDesiredAgentImage(String desiredAgentImage) {
      this.desiredAgentImage = desiredAgentImage;
    }
    
    public String getDesiredAuthImage() {
        return this.desiredAuthImage;
    }

    public void setDesiredAuthImage(String desiredAuthImage) {
      this.desiredAuthImage = desiredAuthImage;
    }
    
    public String getDockerRootDir() {
        return this.dockerRootDir;
    }

    public void setDockerRootDir(String dockerRootDir) {
      this.dockerRootDir = dockerRootDir;
    }
    
    public String getDriver() {
        return this.driver;
    }

    public void setDriver(String driver) {
      this.driver = driver;
    }
    
    public Boolean getEnableClusterAlerting() {
        return this.enableClusterAlerting;
    }

    public void setEnableClusterAlerting(Boolean enableClusterAlerting) {
      this.enableClusterAlerting = enableClusterAlerting;
    }
    
    public Boolean getEnableClusterMonitoring() {
        return this.enableClusterMonitoring;
    }

    public void setEnableClusterMonitoring(Boolean enableClusterMonitoring) {
      this.enableClusterMonitoring = enableClusterMonitoring;
    }
    
    public Boolean getEnableNetworkPolicy() {
        return this.enableNetworkPolicy;
    }

    public void setEnableNetworkPolicy(Boolean enableNetworkPolicy) {
      this.enableNetworkPolicy = enableNetworkPolicy;
    }
    
    public ClusterSpec getFailedSpec() {
        return this.failedSpec;
    }

    public void setFailedSpec(ClusterSpec failedSpec) {
      this.failedSpec = failedSpec;
    }
    
    public GoogleKubernetesEngineConfig getGoogleKubernetesEngineConfig() {
        return this.googleKubernetesEngineConfig;
    }

    public void setGoogleKubernetesEngineConfig(GoogleKubernetesEngineConfig googleKubernetesEngineConfig) {
      this.googleKubernetesEngineConfig = googleKubernetesEngineConfig;
    }
    
    public ImportedConfig getImportedConfig() {
        return this.importedConfig;
    }

    public void setImportedConfig(ImportedConfig importedConfig) {
      this.importedConfig = importedConfig;
    }
    
    public Boolean getInternal() {
        return this.internal;
    }

    public void setInternal(Boolean internal) {
      this.internal = internal;
    }
    
    public Boolean getIstioEnabled() {
        return this.istioEnabled;
    }

    public void setIstioEnabled(Boolean istioEnabled) {
      this.istioEnabled = istioEnabled;
    }
    
    public K3sConfig getK3sConfig() {
        return this.k3sConfig;
    }

    public void setK3sConfig(K3sConfig k3sConfig) {
      this.k3sConfig = k3sConfig;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public Map<String, Object> getLimits() {
        return this.limits;
    }

    public void setLimits(Map<String, Object> limits) {
      this.limits = limits;
    }
    
    public LocalClusterAuthEndpoint getLocalClusterAuthEndpoint() {
        return this.localClusterAuthEndpoint;
    }

    public void setLocalClusterAuthEndpoint(LocalClusterAuthEndpoint localClusterAuthEndpoint) {
      this.localClusterAuthEndpoint = localClusterAuthEndpoint;
    }
    
    public MonitoringStatus getMonitoringStatus() {
        return this.monitoringStatus;
    }

    public void setMonitoringStatus(MonitoringStatus monitoringStatus) {
      this.monitoringStatus = monitoringStatus;
    }
    
    public DnsLabel getName() {
        return this.name;
    }

    public void setName(DnsLabel name) {
      this.name = name;
    }
    
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    public void setNodeCount(Integer nodeCount) {
      this.nodeCount = nodeCount;
    }
    
    public Integer getNodeVersion() {
        return this.nodeVersion;
    }

    public void setNodeVersion(Integer nodeVersion) {
      this.nodeVersion = nodeVersion;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public List<Question> getQuestions() {
        return this.questions;
    }

    public void setQuestions(List<Question> questions) {
      this.questions = questions;
    }
    
    public RancherKubernetesEngineConfig getRancherKubernetesEngineConfig() {
        return this.rancherKubernetesEngineConfig;
    }

    public void setRancherKubernetesEngineConfig(RancherKubernetesEngineConfig rancherKubernetesEngineConfig) {
      this.rancherKubernetesEngineConfig = rancherKubernetesEngineConfig;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public Map<String, Object> getRequested() {
        return this.requested;
    }

    public void setRequested(Map<String, Object> requested) {
      this.requested = requested;
    }
    
    public ScheduledClusterScan getScheduledClusterScan() {
        return this.scheduledClusterScan;
    }

    public void setScheduledClusterScan(ScheduledClusterScan scheduledClusterScan) {
      this.scheduledClusterScan = scheduledClusterScan;
    }
    
    public ScheduledClusterScanStatus getScheduledClusterScanStatus() {
        return this.scheduledClusterScanStatus;
    }

    public void setScheduledClusterScanStatus(ScheduledClusterScanStatus scheduledClusterScanStatus) {
      this.scheduledClusterScanStatus = scheduledClusterScanStatus;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public TencentEngineConfig getTencentEngineConfig() {
        return this.tencentEngineConfig;
    }

    public void setTencentEngineConfig(TencentEngineConfig tencentEngineConfig) {
      this.tencentEngineConfig = tencentEngineConfig;
    }
    
    public String getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(String transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public Info getVersion() {
        return this.version;
    }

    public void setVersion(Info version) {
      this.version = version;
    }
    
    public Boolean getWindowsPreferedCluster() {
        return this.windowsPreferedCluster;
    }

    public void setWindowsPreferedCluster(Boolean windowsPreferedCluster) {
      this.windowsPreferedCluster = windowsPreferedCluster;
    }

    @Override
    public String toString() {
        return "Cluster{" +
                "name=" + name +
                ", nodeCount=" + nodeCount +
                ", uuid='" + uuid + '\'' +
                ", version=" + version +
                '}';
    }
}
