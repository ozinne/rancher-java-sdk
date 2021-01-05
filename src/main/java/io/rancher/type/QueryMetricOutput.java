package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class QueryMetricOutput extends AbstractType {
    
    private List<String> series;
    
    private String type;
    
    public List<String> getSeries() {
        return this.series;
    }

    public void setSeries(List<String> series) {
      this.series = series;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
}
