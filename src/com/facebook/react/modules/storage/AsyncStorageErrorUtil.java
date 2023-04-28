package com.facebook.react.modules.storage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes7.dex */
public class AsyncStorageErrorUtil {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static WritableMap getDBError(String str) {
        return getError(str, "Database Error");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static WritableMap getError(String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", str2);
        if (str != null) {
            createMap.putString("key", str);
        }
        return createMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static WritableMap getInvalidKeyError(String str) {
        return getError(str, "Invalid key");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static WritableMap getInvalidValueError(String str) {
        return getError(str, "Invalid Value");
    }
}
