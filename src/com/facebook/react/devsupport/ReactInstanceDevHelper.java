package com.facebook.react.devsupport;

import android.app.Activity;
import android.view.View;
import com.facebook.react.bridge.JavaJSExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;

/* loaded from: classes7.dex */
public interface ReactInstanceDevHelper {
    View createRootView(String str);

    void destroyRootView(View view);

    Activity getCurrentActivity();

    JavaScriptExecutorFactory getJavaScriptExecutorFactory();

    void onJSBundleLoadedFromServer();

    void onReloadWithJSDebugger(JavaJSExecutor.Factory factory);

    void toggleElementInspector();
}
