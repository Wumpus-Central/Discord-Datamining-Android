package com.facebook.react.fabric;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.soloader.SoLoader;
import p130h6.C7927a;

/* loaded from: classes7.dex */
public class FabricSoLoader {
    private static volatile boolean sDidInit = false;

    public static void staticInit() {
        if (!sDidInit) {
            C7927a.m21142c(0L, "FabricSoLoader.staticInit::load:fabricjni");
            ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
            SoLoader.m30787r("fabricjni");
            ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
            C7927a.m21138g(0L);
            sDidInit = true;
        }
    }
}
