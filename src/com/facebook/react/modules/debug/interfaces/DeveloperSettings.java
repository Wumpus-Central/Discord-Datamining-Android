package com.facebook.react.modules.debug.interfaces;

/* loaded from: classes7.dex */
public interface DeveloperSettings {
    void addMenuItem(String str);

    boolean isAnimationFpsDebugEnabled();

    boolean isDeviceDebugEnabled();

    boolean isElementInspectorEnabled();

    boolean isFpsDebugEnabled();

    boolean isJSDevModeEnabled();

    boolean isJSMinifyEnabled();

    boolean isRemoteJSDebugEnabled();

    boolean isStartSamplingProfilerOnInit();

    void setRemoteJSDebugEnabled(boolean z);
}
