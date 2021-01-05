package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class QueryGraphInput extends AbstractType {
    
    private Map<String, Object> filters;
    
    private String from;
    
    private String interval;
    
    private Boolean isDetails;
    
    private Map<String, Object> metricParams;
    
    private String to;
    
    public Map<String, Object> getFilters() {
        return this.filters;
    }

    public void setFilters(Map<String, Object> filters) {
      this.filters = filters;
    }
    
    public String getFrom() {
        return this.from;
    }

    public void setFrom(String from) {
      this.from = from;
    }
    
    public String getInterval() {
        return this.interval;
    }

    public void setInterval(String interval) {
      this.interval = interval;
    }
    
    public Boolean getIsDetails() {
        return this.isDetails;
    }

    public void setIsDetails(Boolean isDetails) {
      this.isDetails = isDetails;
    }
    
    public Map<String, Object> getMetricParams() {
        return this.metricParams;
    }

    public void setMetricParams(Map<String, Object> metricParams) {
      this.metricParams = metricParams;
    }
    
    public String getTo() {
        return this.to;
    }

    public void setTo(String to) {
      this.to = to;
    }
    
}
