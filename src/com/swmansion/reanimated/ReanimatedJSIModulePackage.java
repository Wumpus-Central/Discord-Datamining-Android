package com.swmansion.reanimated;

import android.util.Log;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JSIModuleSpec;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public class ReanimatedJSIModulePackage implements JSIModulePackage {
    @Override // com.facebook.react.bridge.JSIModulePackage
    public List<JSIModuleSpec> getJSIModules(ReactApplicationContext reactApplicationContext, JavaScriptContextHolder javaScriptContextHolder) {
        Log.w("[REANIMATED]", "Since 2.5.0, Reanimated autoinstalls on Android - you can remove getJSIModulePackage() override in MainApplication.java.");
        return Arrays.asList(new JSIModuleSpec[0]);
    }
}
