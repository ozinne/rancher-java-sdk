package io.rancher.type;

import io.rancher.base.AbstractType;

import java.lang.reflect.Array;
import java.util.List;

public class TimeSeries extends AbstractType {
    
    private String name;
    
    private List<Float> points;
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public List<Float> getPoints() {
        return points;
    }

    public void setPoints(List<Float> points) {
        this.points = points;
    }
}
