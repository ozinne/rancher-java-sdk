package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class ProjectTestInput extends AbstractType {
    
    private CustomTargetConfig customTargetConfig;
    
    private ElasticsearchConfig elasticsearchConfig;
    
    private FluentForwarderConfig fluentForwarderConfig;
    
    private KafkaConfig kafkaConfig;
    
    private Map<String, Object> outputTags;
    
    private String projectId;
    
    private SplunkConfig splunkConfig;
    
    private SyslogConfig syslogConfig;
    
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
    
    public FluentForwarderConfig getFluentForwarderConfig() {
        return this.fluentForwarderConfig;
    }

    public void setFluentForwarderConfig(FluentForwarderConfig fluentForwarderConfig) {
      this.fluentForwarderConfig = fluentForwarderConfig;
    }
    
    public KafkaConfig getKafkaConfig() {
        return this.kafkaConfig;
    }

    public void setKafkaConfig(KafkaConfig kafkaConfig) {
      this.kafkaConfig = kafkaConfig;
    }
    
    public Map<String, Object> getOutputTags() {
        return this.outputTags;
    }

    public void setOutputTags(Map<String, Object> outputTags) {
      this.outputTags = outputTags;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
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
