package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class RancherKubernetesEngineConfig extends AbstractType {
    
    private Integer addonJobTimeout;
    
    private String addons;
    
    private List<String> addonsInclude;
    
    private AuthnConfig authentication;
    
    private AuthzConfig authorization;
    
    private BastionHost bastionHost;
    
    private CloudProvider cloudProvider;
    
    private String clusterName;
    
    private DnsConfig dns;
    
    private Boolean ignoreDockerVersion;
    
    private IngressConfig ingress;
    
    private String kubernetesVersion;
    
    private MonitoringConfig monitoring;
    
    private NetworkConfig network;
    
    private List<RkeConfigNode> nodes;
    
    private String prefixPath;
    
    private List<PrivateRegistry> privateRegistries;
    
    private RestoreConfig restore;
    
    private RotateCertificates rotateCertificates;
    
    private RkeConfigServices services;
    
    private Boolean sshAgentAuth;
    
    private String sshCertPath;
    
    private String sshKeyPath;
    
    private NodeUpgradeStrategy upgradeStrategy;
    
    public Integer getAddonJobTimeout() {
        return this.addonJobTimeout;
    }

    public void setAddonJobTimeout(Integer addonJobTimeout) {
      this.addonJobTimeout = addonJobTimeout;
    }
    
    public String getAddons() {
        return this.addons;
    }

    public void setAddons(String addons) {
      this.addons = addons;
    }
    
    public List<String> getAddonsInclude() {
        return this.addonsInclude;
    }

    public void setAddonsInclude(List<String> addonsInclude) {
      this.addonsInclude = addonsInclude;
    }
    
    public AuthnConfig getAuthentication() {
        return this.authentication;
    }

    public void setAuthentication(AuthnConfig authentication) {
      this.authentication = authentication;
    }
    
    public AuthzConfig getAuthorization() {
        return this.authorization;
    }

    public void setAuthorization(AuthzConfig authorization) {
      this.authorization = authorization;
    }
    
    public BastionHost getBastionHost() {
        return this.bastionHost;
    }

    public void setBastionHost(BastionHost bastionHost) {
      this.bastionHost = bastionHost;
    }
    
    public CloudProvider getCloudProvider() {
        return this.cloudProvider;
    }

    public void setCloudProvider(CloudProvider cloudProvider) {
      this.cloudProvider = cloudProvider;
    }
    
    public String getClusterName() {
        return this.clusterName;
    }

    public void setClusterName(String clusterName) {
      this.clusterName = clusterName;
    }
    
    public DnsConfig getDns() {
        return this.dns;
    }

    public void setDns(DnsConfig dns) {
      this.dns = dns;
    }
    
    public Boolean getIgnoreDockerVersion() {
        return this.ignoreDockerVersion;
    }

    public void setIgnoreDockerVersion(Boolean ignoreDockerVersion) {
      this.ignoreDockerVersion = ignoreDockerVersion;
    }
    
    public IngressConfig getIngress() {
        return this.ingress;
    }

    public void setIngress(IngressConfig ingress) {
      this.ingress = ingress;
    }
    
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    public void setKubernetesVersion(String kubernetesVersion) {
      this.kubernetesVersion = kubernetesVersion;
    }
    
    public MonitoringConfig getMonitoring() {
        return this.monitoring;
    }

    public void setMonitoring(MonitoringConfig monitoring) {
      this.monitoring = monitoring;
    }
    
    public NetworkConfig getNetwork() {
        return this.network;
    }

    public void setNetwork(NetworkConfig network) {
      this.network = network;
    }
    
    public List<RkeConfigNode> getNodes() {
        return this.nodes;
    }

    public void setNodes(List<RkeConfigNode> nodes) {
      this.nodes = nodes;
    }
    
    public String getPrefixPath() {
        return this.prefixPath;
    }

    public void setPrefixPath(String prefixPath) {
      this.prefixPath = prefixPath;
    }
    
    public List<PrivateRegistry> getPrivateRegistries() {
        return this.privateRegistries;
    }

    public void setPrivateRegistries(List<PrivateRegistry> privateRegistries) {
      this.privateRegistries = privateRegistries;
    }
    
    public RestoreConfig getRestore() {
        return this.restore;
    }

    public void setRestore(RestoreConfig restore) {
      this.restore = restore;
    }
    
    public RotateCertificates getRotateCertificates() {
        return this.rotateCertificates;
    }

    public void setRotateCertificates(RotateCertificates rotateCertificates) {
      this.rotateCertificates = rotateCertificates;
    }
    
    public RkeConfigServices getServices() {
        return this.services;
    }

    public void setServices(RkeConfigServices services) {
      this.services = services;
    }
    
    public Boolean getSshAgentAuth() {
        return this.sshAgentAuth;
    }

    public void setSshAgentAuth(Boolean sshAgentAuth) {
      this.sshAgentAuth = sshAgentAuth;
    }
    
    public String getSshCertPath() {
        return this.sshCertPath;
    }

    public void setSshCertPath(String sshCertPath) {
      this.sshCertPath = sshCertPath;
    }
    
    public String getSshKeyPath() {
        return this.sshKeyPath;
    }

    public void setSshKeyPath(String sshKeyPath) {
      this.sshKeyPath = sshKeyPath;
    }
    
    public NodeUpgradeStrategy getUpgradeStrategy() {
        return this.upgradeStrategy;
    }

    public void setUpgradeStrategy(NodeUpgradeStrategy upgradeStrategy) {
      this.upgradeStrategy = upgradeStrategy;
    }
    
}
