package com.swmansion.reanimated.sensor;

import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.swmansion.reanimated.NativeProxy;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class ReanimatedSensorContainer {
    private final WeakReference<ReactApplicationContext> reactContext;
    private int nextSensorId = 0;
    private final HashMap<Integer, ReanimatedSensor> sensors = new HashMap<>();

    public ReanimatedSensorContainer(WeakReference<ReactApplicationContext> weakReference) {
        this.reactContext = weakReference;
    }

    public int registerSensor(ReanimatedSensorType reanimatedSensorType, int i, NativeProxy.SensorSetter sensorSetter) {
        ReanimatedSensor reanimatedSensor = new ReanimatedSensor(this.reactContext, reanimatedSensorType, i, sensorSetter);
        if (!reanimatedSensor.initialize()) {
            return -1;
        }
        int i2 = this.nextSensorId;
        this.nextSensorId = i2 + 1;
        this.sensors.put(Integer.valueOf(i2), reanimatedSensor);
        return i2;
    }

    public void unregisterSensor(int i) {
        ReanimatedSensor reanimatedSensor = this.sensors.get(Integer.valueOf(i));
        if (reanimatedSensor != null) {
            reanimatedSensor.cancel();
            this.sensors.remove(Integer.valueOf(i));
            return;
        }
        Log.e("Reanimated", "Tried to unregister nonexistent sensor");
    }
}
