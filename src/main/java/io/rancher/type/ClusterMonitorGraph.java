package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.DnsLabel;

import java.util.Map;
import java.util.List;

public class ClusterMonitorGraph extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private String clusterId;
    
    private String created;
    
    private String creatorId;
    
    private String description;
    
    private Map<String, Object> detailsMetricsSelector;
    
    private String displayResourceType;
    
    private String graphType;
    
    private Map<String, Object> labels;
    
    private Map<String, Object> metricsSelector;
    
    private DnsLabel name;
    
    private String namespaceId;
    
    private List<OwnerReference> ownerReferences;
    
    private Integer priority;
    
    private String removed;
    
    private String resourceType;
    
    private String uuid;
    
    private YAxis yAxis;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
      this.clusterId = clusterId;
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
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public Map<String, Object> getDetailsMetricsSelector() {
        return this.detailsMetricsSelector;
    }

    public void setDetailsMetricsSelector(Map<String, Object> detailsMetricsSelector) {
      this.detailsMetricsSelector = detailsMetricsSelector;
    }
    
    public String getDisplayResourceType() {
        return this.displayResourceType;
    }

    public void setDisplayResourceType(String displayResourceType) {
      this.displayResourceType = displayResourceType;
    }
    
    public String getGraphType() {
        return this.graphType;
    }

    public void setGraphType(String graphType) {
      this.graphType = graphType;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public Map<String, Object> getMetricsSelector() {
        return this.metricsSelector;
    }

    public void setMetricsSelector(Map<String, Object> metricsSelector) {
      this.metricsSelector = metricsSelector;
    }
    
    public DnsLabel getName() {
        return this.name;
    }

    public void setName(DnsLabel name) {
      this.name = name;
    }
    
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public void setNamespaceId(String namespaceId) {
      this.namespaceId = namespaceId;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public Integer getPriority() {
        return this.priority;
    }

    public void setPriority(Integer priority) {
      this.priority = priority;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getResourceType() {
        return this.resourceType;
    }

    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public YAxis getYAxis() {
        return this.yAxis;
    }

    public void setYAxis(YAxis yAxis) {
      this.yAxis = yAxis;
    }
    
}
