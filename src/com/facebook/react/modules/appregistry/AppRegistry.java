package com.facebook.react.modules.appregistry;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes7.dex */
public interface AppRegistry extends JavaScriptModule {
    void runApplication(String str, WritableMap writableMap);

    void startHeadlessTask(int i, String str, WritableMap writableMap);

    void unmountApplicationComponentAtRootTag(int i);
}
