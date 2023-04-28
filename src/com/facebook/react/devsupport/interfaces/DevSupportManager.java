package com.facebook.react.devsupport.interfaces;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.SurfaceDelegate;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import java.io.File;

/* loaded from: classes7.dex */
public interface DevSupportManager extends JSExceptionHandler {

    /* loaded from: classes7.dex */
    public interface PackagerLocationCustomizer {
        void run(Runnable runnable);
    }

    void addCustomDevOption(String str, DevOptionHandler devOptionHandler);

    View createRootView(String str);

    SurfaceDelegate createSurfaceDelegate(String str);

    void destroyRootView(View view);

    File downloadBundleResourceFromUrlSync(String str, File file);

    Activity getCurrentActivity();

    DeveloperSettings getDevSettings();

    boolean getDevSupportEnabled();

    String getDownloadedJSBundleFile();

    String getJSBundleURLForRemoteDebugging();

    int getLastErrorCookie();

    StackFrame[] getLastErrorStack();

    String getLastErrorTitle();

    ErrorType getLastErrorType();

    RedBoxHandler getRedBoxHandler();

    String getSourceMapUrl();

    String getSourceUrl();

    void handleReloadJS();

    boolean hasUpToDateJSBundleInCache();

    void hideRedboxDialog();

    void isPackagerRunning(PackagerStatusCallback packagerStatusCallback);

    void loadSplitBundleFromServer(String str, DevSplitBundleCallback devSplitBundleCallback);

    void onNewReactContextCreated(ReactContext reactContext);

    void onReactInstanceDestroyed(ReactContext reactContext);

    Pair<String, StackFrame[]> processErrorCustomizers(Pair<String, StackFrame[]> pair);

    void registerErrorCustomizer(ErrorCustomizer errorCustomizer);

    void reloadJSFromServer(String str);

    void reloadJSFromServer(String str, BundleLoadCallback bundleLoadCallback);

    void reloadSettings();

    void setDevSupportEnabled(boolean z);

    void setFpsDebugEnabled(boolean z);

    void setHotModuleReplacementEnabled(boolean z);

    void setPackagerLocationCustomizer(PackagerLocationCustomizer packagerLocationCustomizer);

    void setRemoteJSDebugEnabled(boolean z);

    void showDevOptionsDialog();

    void showNewJSError(String str, ReadableArray readableArray, int i);

    void showNewJavaError(String str, Throwable th2);

    void startInspector();

    void stopInspector();

    void toggleElementInspector();

    void updateJSError(String str, ReadableArray readableArray, int i);
}
