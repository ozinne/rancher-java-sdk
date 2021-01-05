package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class MonitoringStatus extends AbstractType {
    
    private List<MonitoringCondition> conditions;
    
    private String grafanaEndpoint;
    
    public List<MonitoringCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<MonitoringCondition> conditions) {
      this.conditions = conditions;
    }
    
    public String getGrafanaEndpoint() {
        return this.grafanaEndpoint;
    }

    public void setGrafanaEndpoint(String grafanaEndpoint) {
      this.grafanaEndpoint = grafanaEndpoint;
    }
    
}
