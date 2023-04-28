package com.swmansion.reanimated.sensor;

/* loaded from: classes8.dex */
public enum ReanimatedSensorType {
    ACCELEROMETER(10),
    GYROSCOPE(4),
    GRAVITY(9),
    MAGNETIC_FIELD(2),
    ROTATION_VECTOR(11);
    
    private final int type;

    ReanimatedSensorType(int i) {
        this.type = i;
    }

    public static ReanimatedSensorType getInstanceById(int i) {
        if (i == 1) {
            return ACCELEROMETER;
        }
        if (i == 2) {
            return GYROSCOPE;
        }
        if (i == 3) {
            return GRAVITY;
        }
        if (i == 4) {
            return MAGNETIC_FIELD;
        }
        if (i == 5) {
            return ROTATION_VECTOR;
        }
        throw new IllegalArgumentException("[Reanimated] Unknown sensor type");
    }

    public int getType() {
        return this.type;
    }
}
