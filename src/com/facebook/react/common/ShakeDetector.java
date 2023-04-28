package com.facebook.react.common;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.TimeUnit;
import p059d6.C6399a;

/* loaded from: classes7.dex */
public class ShakeDetector implements SensorEventListener {
    private static final long MIN_TIME_BETWEEN_SAMPLES_NS;
    private static final float REQUIRED_FORCE = 13.042845f;
    private static final float SHAKING_WINDOW_NS;
    private float mAccelerationX;
    private float mAccelerationY;
    private float mAccelerationZ;
    private long mLastShakeTimestamp;
    private long mLastTimestamp;
    private int mMinNumShakes;
    private int mNumShakes;
    private SensorManager mSensorManager;
    private final ShakeListener mShakeListener;

    /* loaded from: classes7.dex */
    public interface ShakeListener {
        void onShake();
    }

    static {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        MIN_TIME_BETWEEN_SAMPLES_NS = timeUnit.convert(20L, TimeUnit.MILLISECONDS);
        SHAKING_WINDOW_NS = (float) timeUnit.convert(3L, TimeUnit.SECONDS);
    }

    public ShakeDetector(ShakeListener shakeListener) {
        this(shakeListener, 1);
    }

    private boolean atLeastRequiredForce(float f) {
        return Math.abs(f) > REQUIRED_FORCE;
    }

    private void maybeDispatchShake(long j) {
        if (this.mNumShakes >= this.mMinNumShakes * 8) {
            reset();
            this.mShakeListener.onShake();
        }
        if (((float) (j - this.mLastShakeTimestamp)) > SHAKING_WINDOW_NS) {
            reset();
        }
    }

    private void recordShake(long j) {
        this.mLastShakeTimestamp = j;
        this.mNumShakes++;
    }

    private void reset() {
        this.mNumShakes = 0;
        this.mAccelerationX = 0.0f;
        this.mAccelerationY = 0.0f;
        this.mAccelerationZ = 0.0f;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        long j = sensorEvent.timestamp;
        if (j - this.mLastTimestamp >= MIN_TIME_BETWEEN_SAMPLES_NS) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2] - 9.80665f;
            this.mLastTimestamp = j;
            if (atLeastRequiredForce(f) && this.mAccelerationX * f <= 0.0f) {
                recordShake(sensorEvent.timestamp);
                this.mAccelerationX = f;
            } else if (atLeastRequiredForce(f2) && this.mAccelerationY * f2 <= 0.0f) {
                recordShake(sensorEvent.timestamp);
                this.mAccelerationY = f2;
            } else if (atLeastRequiredForce(f3) && this.mAccelerationZ * f3 <= 0.0f) {
                recordShake(sensorEvent.timestamp);
                this.mAccelerationZ = f3;
            }
            maybeDispatchShake(sensorEvent.timestamp);
        }
    }

    public void start(SensorManager sensorManager) {
        C6399a.m25622c(sensorManager);
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        if (defaultSensor != null) {
            this.mSensorManager = sensorManager;
            this.mLastTimestamp = -1L;
            sensorManager.registerListener(this, defaultSensor, 2);
            this.mLastShakeTimestamp = MIN_TIME_BETWEEN_SAMPLES_NS;
            reset();
        }
    }

    public void stop() {
        SensorManager sensorManager = this.mSensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.mSensorManager = null;
        }
    }

    public ShakeDetector(ShakeListener shakeListener, int i) {
        this.mShakeListener = shakeListener;
        this.mMinNumShakes = i;
    }
}
