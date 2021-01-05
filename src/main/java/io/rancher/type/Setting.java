package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.DnsLabel;

import java.util.Map;
import java.util.List;

public class Setting extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private String created;
    
    private String creatorId;
    
    private Boolean customized;
    
    private String default_;
    
    private Map<String, Object> labels;
    
    private DnsLabel name;
    
    private List<OwnerReference> ownerReferences;
    
    private String removed;
    
    private String source;
    
    private String uuid;
    
    private String value;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
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
    
    public Boolean getCustomized() {
        return this.customized;
    }

    public void setCustomized(Boolean customized) {
      this.customized = customized;
    }

    public String getDefault_() {
        return default_;
    }

    public void setDefault_(String default_) {
        this.default_ = default_;
    }

    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public DnsLabel getName() {
        return this.name;
    }

    public void setName(DnsLabel name) {
      this.name = name;
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
    
    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
      this.source = source;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
      this.value = value;
    }
    
}
