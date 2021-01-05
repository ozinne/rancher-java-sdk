package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class ClusterLoggingSpec extends AbstractType {
    
    private String clusterId;
    
    private CustomTargetConfig customTargetConfig;
    
    private String displayName;
    
    private ElasticsearchConfig elasticsearchConfig;
    
    private Boolean enableJSONParsing;
    
    private FluentForwarderConfig fluentForwarderConfig;
    
    private Boolean includeSystemComponent;
    
    private KafkaConfig kafkaConfig;
    
    private Integer outputFlushInterval;
    
    private Map<String, Object> outputTags;
    
    private SplunkConfig splunkConfig;
    
    private SyslogConfig syslogConfig;
    
    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
      this.clusterId = clusterId;
    }
    
    public CustomTargetConfig getCustomTargetConfig() {
        return this.customTargetConfig;
    }

    public void setCustomTargetConfig(CustomTargetConfig customTargetConfig) {
      this.customTargetConfig = customTargetConfig;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
      this.displayName = displayName;
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
    
    public SplunkConfig getSplunkConfig() {
        return this.splunkConfig;
    }

    public void setSplunkConfig(SplunkConfig splunkConfig) {
      this.splunkConfig = splunkConfig;
    }
    
    public SyslogConfig getSyslogConfig() {
        return this.syslogConfig;
    }

    public void setSyslogConfig(SyslogConfig syslogConfig) {
      this.syslogConfig = syslogConfig;
    }
    
}
