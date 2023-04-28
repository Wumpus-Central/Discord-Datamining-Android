package com.swmansion.reanimated.sensor;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.reactnativecommunity.webview.RNCWebViewManager;
import com.swmansion.reanimated.NativeProxy;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public class ReanimatedSensor {
    int interval;
    ReanimatedSensorListener listener;
    Sensor sensor;
    SensorManager sensorManager;
    ReanimatedSensorType sensorType;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReanimatedSensor(WeakReference<ReactApplicationContext> weakReference, ReanimatedSensorType reanimatedSensorType, int i, NativeProxy.SensorSetter sensorSetter) {
        this.listener = new ReanimatedSensorListener(sensorSetter, i);
        weakReference.get();
        this.sensorManager = (SensorManager) weakReference.get().getSystemService("sensor");
        this.sensorType = reanimatedSensorType;
        if (i == -1) {
            this.interval = 2;
        } else {
            this.interval = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void cancel() {
        this.sensorManager.unregisterListener(this.listener, this.sensor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean initialize() {
        Sensor defaultSensor = this.sensorManager.getDefaultSensor(this.sensorType.getType());
        this.sensor = defaultSensor;
        if (defaultSensor == null) {
            return false;
        }
        this.sensorManager.registerListener(this.listener, defaultSensor, this.interval * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
        return true;
    }
}
