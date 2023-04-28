package com.facebook.react.bridge;

import com.facebook.react.common.ReactConstants;
import p414x3.C13925a;

/* loaded from: classes7.dex */
public class DynamicFromObject implements Dynamic {
    private Object mObject;

    public DynamicFromObject(Object obj) {
        this.mObject = obj;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableArray asArray() {
        return (ReadableArray) this.mObject;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean asBoolean() {
        return ((Boolean) this.mObject).booleanValue();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public double asDouble() {
        return ((Double) this.mObject).doubleValue();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public int asInt() {
        return ((Double) this.mObject).intValue();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableMap asMap() {
        return (ReadableMap) this.mObject;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public String asString() {
        return (String) this.mObject;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableType getType() {
        if (isNull()) {
            return ReadableType.Null;
        }
        Object obj = this.mObject;
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if (obj instanceof Number) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        C13925a.m2288j(ReactConstants.TAG, "Unmapped object type " + this.mObject.getClass().getName());
        return ReadableType.Null;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean isNull() {
        return this.mObject == null;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public void recycle() {
    }
}
