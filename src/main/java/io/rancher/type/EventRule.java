package io.rancher.type;

import io.rancher.base.AbstractType;

public class EventRule extends AbstractType {
    
    private String eventType;
    
    private String resourceKind;
    
    public String getEventType() {
        return this.eventType;
    }

    public void setEventType(String eventType) {
      this.eventType = eventType;
    }
    
    public String getResourceKind() {
        return this.resourceKind;
    }

    public void setResourceKind(String resourceKind) {
      this.resourceKind = resourceKind;
    }
    
}
