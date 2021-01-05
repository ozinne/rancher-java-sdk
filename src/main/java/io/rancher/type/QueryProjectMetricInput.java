package io.rancher.type;

import io.rancher.base.AbstractType;

public class QueryProjectMetricInput extends AbstractType {
    
    private String expr;
    
    private String from;
    
    private String interval;
    
    private String projectId;
    
    private String to;
    
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
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public String getTo() {
        return this.to;
    }

    public void setTo(String to) {
      this.to = to;
    }
    
}
