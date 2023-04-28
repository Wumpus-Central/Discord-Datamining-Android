package com.swmansion.reanimated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes8.dex */
public class MapUtils {
    public static int getInt(ReadableMap readableMap, String str, String str2) {
        try {
            return readableMap.getInt(str);
        } catch (NoSuchKeyException unused) {
            throw new JSApplicationCausedNativeException(str2);
        }
    }

    public static String getString(ReadableMap readableMap, String str, String str2) {
        try {
            return readableMap.getString(str);
        } catch (NoSuchKeyException unused) {
            throw new JSApplicationCausedNativeException(str2);
        }
    }
}
