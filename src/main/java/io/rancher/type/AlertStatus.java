package io.rancher.type;

import io.rancher.base.AbstractType;

public class AlertStatus extends AbstractType {
    
    private String alertState;
    
    public String getAlertState() {
        return this.alertState;
    }

    public void setAlertState(String alertState) {
      this.alertState = alertState;
    }
    
}
