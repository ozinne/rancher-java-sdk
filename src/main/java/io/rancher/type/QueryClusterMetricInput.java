package io.rancher.type;

import io.rancher.base.AbstractType;

public class QueryClusterMetricInput extends AbstractType {
    
    private String clusterId;
    
    private String expr;
    
    private String from;
    
    private String interval;
    
    private String to;
    
    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
      this.clusterId = clusterId;
    }
    
    public String getExpr() {
        return this.expr;
    }

    public void setExpr(String expr) {
      this.expr = expr;
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
    
    public String getTo() {
        return this.to;
    }

    public void setTo(String to) {
      this.to = to;
    }
    
}
