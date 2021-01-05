package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;
import java.util.List;

public class ClusterLogging extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private ClusterLoggingSpec appliedSpec;
    
    private String clusterId;
    
    private List<LoggingCondition> conditions;
    
    private String created;
    
    private String creatorId;
    
    private CustomTargetConfig customTargetConfig;
    
    private ElasticsearchConfig elasticsearchConfig;
    
    private Boolean enableJSONParsing;
    
    private ClusterLoggingSpec failedSpec;
    
    private FluentForwarderConfig fluentForwarderConfig;
    
    private Boolean includeSystemComponent;
    
    private KafkaConfig kafkaConfig;
    
    private Map<String, Object> labels;
    
    private String name;
    
    private String namespaceId;
    
    private Integer outputFlushInterval;
    
    private Map<String, Object> outputTags;
    
    private List<OwnerReference> ownerReferences;
    
    private String removed;
    
    private SplunkConfig splunkConfig;
    
    private String state;
    
    private SyslogConfig syslogConfig;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private String uuid;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public ClusterLoggingSpec getAppliedSpec() {
        return this.appliedSpec;
    }

    public void setAppliedSpec(ClusterLoggingSpec appliedSpec) {
      this.appliedSpec = appliedSpec;
    }
    
    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
      this.clusterId = clusterId;
    }
    
    public List<LoggingCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<LoggingCondition> conditions) {
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
    
    public CustomTargetConfig getCustomTargetConfig() {
        return this.customTargetConfig;
    }

    public void setCustomTargetConfig(CustomTargetConfig customTargetConfig) {
      this.customTargetConfig = customTargetConfig;
    }
    
    public ElasticsearchConfig getElasticsearchConfig() {
        return this.elasticsearchConfig;
    }

    public void setElasticsearchConfig(ElasticsearchConfig elasticsearchConfig) {
      this.elasticsearchConfig = elasticsearchConfig;
    }
    
    public Boolean getEnableJSONParsing() {
        return this.enableJSONParsing;
    }

    public void setEnableJSONParsing(Boolean enableJSONParsing) {
      this.enableJSONParsing = enableJSONParsing;
    }
    
    public ClusterLoggingSpec getFailedSpec() {
        return this.failedSpec;
    }

    public void setFailedSpec(ClusterLoggingSpec failedSpec) {
      this.failedSpec = failedSpec;
    }
    
    public FluentForwarderConfig getFluentForwarderConfig() {
        return this.fluentForwarderConfig;
    }

    public void setFluentForwarderConfig(FluentForwarderConfig fluentForwarderConfig) {
      this.fluentForwarderConfig = fluentForwarderConfig;
    }
    
    public Boolean getIncludeSystemComponent() {
        return this.includeSystemComponent;
    }

    public void setIncludeSystemComponent(Boolean includeSystemComponent) {
      this.includeSystemComponent = includeSystemComponent;
    }
    
    public KafkaConfig getKafkaConfig() {
        return this.kafkaConfig;
    }

    public void setKafkaConfig(KafkaConfig kafkaConfig) {
      this.kafkaConfig = kafkaConfig;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public void setNamespaceId(String namespaceId) {
      this.namespaceId = namespaceId;
    }
    
    public Integer getOutputFlushInterval() {
        return this.outputFlushInterval;
    }

    public void setOutputFlushInterval(Integer outputFlushInterval) {
      this.outputFlushInterval = outputFlushInterval;
    }
    
    public Map<String, Object> getOutputTags() {
        return this.outputTags;
    }

    public void setOutputTags(Map<String, Object> outputTags) {
      this.outputTags = outputTags;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public SplunkConfig getSplunkConfig() {
        return this.splunkConfig;
    }

    public void setSplunkConfig(SplunkConfig splunkConfig) {
      this.splunkConfig = splunkConfig;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public SyslogConfig getSyslogConfig() {
        return this.syslogConfig;
    }

    public void setSyslogConfig(SyslogConfig syslogConfig) {
      this.syslogConfig = syslogConfig;
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
    
}
