package com.swmansion.reanimated.sensor;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.swmansion.reanimated.NativeProxy;

/* loaded from: classes8.dex */
public class ReanimatedSensorListener implements SensorEventListener {
    private final double interval;
    private NativeProxy.SensorSetter setter;
    private double lastRead = System.currentTimeMillis();
    private float[] rotation = new float[9];
    private float[] orientation = new float[3];
    private float[] quaternion = new float[4];

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReanimatedSensorListener(NativeProxy.SensorSetter sensorSetter, double d) {
        this.setter = sensorSetter;
        this.interval = d;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        double currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastRead >= this.interval) {
            int type = sensorEvent.sensor.getType();
            this.lastRead = currentTimeMillis;
            if (type == 11) {
                SensorManager.getQuaternionFromVector(this.quaternion, sensorEvent.values);
                SensorManager.getRotationMatrixFromVector(this.rotation, sensorEvent.values);
                SensorManager.getOrientation(this.rotation, this.orientation);
                float[] fArr = this.quaternion;
                float[] fArr2 = this.orientation;
                this.setter.sensorSetter(new float[]{fArr[1], fArr[2], fArr[3], fArr[0], fArr2[0], fArr2[1], fArr2[2]});
                return;
            }
            this.setter.sensorSetter(sensorEvent.values);
        }
    }
}
