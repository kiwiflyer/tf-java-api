//
// Automatically generated.
//
package net.juniper.tungsten.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.tungsten.api.ApiPropertyBase;

public class SnmpParameters extends ApiPropertyBase {
    EnabledSensorParams enabled_sensor_params;
    public SnmpParameters() {
    }
    public SnmpParameters(EnabledSensorParams enabled_sensor_params) {
        this.enabled_sensor_params = enabled_sensor_params;
    }
    
    public EnabledSensorParams getEnabledSensorParams() {
        return enabled_sensor_params;
    }
    
    public void setEnabledSensorParams(EnabledSensorParams enabled_sensor_params) {
        this.enabled_sensor_params = enabled_sensor_params;
    }
    
}
