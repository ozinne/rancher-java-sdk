package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class QueryClusterGraph extends AbstractType {
    
    private String graphID;
    
    private List<String> series;
    
    public String getGraphID() {
        return this.graphID;
    }

    public void setGraphID(String graphID) {
      this.graphID = graphID;
    }
    
    public List<String> getSeries() {
        return this.series;
    }

    public void setSeries(List<String> series) {
      this.series = series;
    }
    
}
