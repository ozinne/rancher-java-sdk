package io.rancher.type;

import io.rancher.base.AbstractType;

public class MetricRule extends AbstractType {
    
    private String comparison;
    
    private String description;
    
    private String duration;
    
    private String expression;
    
    private Float thresholdValue;
    
    public String getComparison() {
        return this.comparison;
    }

    public void setComparison(String comparison) {
      this.comparison = comparison;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public String getDuration() {
        return this.duration;
    }

    public void setDuration(String duration) {
      this.duration = duration;
    }
    
    public String getExpression() {
        return this.expression;
    }

    public void setExpression(String expression) {
      this.expression = expression;
    }
    
    public Float getThresholdValue() {
        return this.thresholdValue;
    }

    public void setThresholdValue(Float thresholdValue) {
      this.thresholdValue = thresholdValue;
    }
    
}
