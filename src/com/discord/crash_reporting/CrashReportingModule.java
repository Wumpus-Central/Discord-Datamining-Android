package com.discord.crash_reporting;

import com.discord.crash_reporting.react_events.CrashReportEvent;
import com.discord.crash_reporting.system_logs.SystemLogReport;
import com.discord.crash_reporting.system_logs.SystemLogUtils;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import io.sentry.react.RNSentryModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import nf.C11098x;

@Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\fH\u0007J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0015\u001a\u00020\fH\u0007J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, m15073d2 = {"Lcom/discord/crash_reporting/CrashReportingModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "sentryModule", "Lio/sentry/react/RNSentryModule;", "getSentryModule", "()Lio/sentry/react/RNSentryModule;", "addListener", "", "type", "", "crash", "getDidCrashDuringPreviousExecution", "callback", "Lcom/facebook/react/bridge/Callback;", "getName", "getSystemLog", "initializeManager", "removeListeners", "count", "", "setUser", "user", "Lcom/facebook/react/bridge/ReadableMap;", "crash_reporting_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class CrashReportingModule extends ReactContextBaseJavaModule {
    private final ReactEvents reactEvents = new ReactEvents(C11098x.m10921a("DCDCrashlyticsCrashReports", C9951f0.m14684b(CrashReportEvent.class)));

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrashReportingModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9971q.m14633g(reactContext, "reactContext");
    }

    private final RNSentryModule getSentryModule() {
        NativeModule nativeModule = getReactApplicationContext().getNativeModule(RNSentryModule.class);
        C9971q.m14636d(nativeModule);
        return (RNSentryModule) nativeModule;
    }

    @ReactMethod
    public final void addListener(String type) {
        C9971q.m14633g(type, "type");
        if (C9971q.m14638b(CrashReporting.INSTANCE.isCrashedLastRun(), Boolean.TRUE)) {
            SystemLogReport systemLogReport = SystemLogReport.INSTANCE;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            C9971q.m14634f(reactApplicationContext, "reactApplicationContext");
            systemLogReport.reportLastCrash$crash_reporting_release(reactApplicationContext, new CrashReportingModule$addListener$1(this));
        }
    }

    @ReactMethod
    public final void crash() {
        getSentryModule().crash();
    }

    @ReactMethod
    public final void getDidCrashDuringPreviousExecution(Callback callback) {
        C9971q.m14633g(callback, "callback");
        Boolean isCrashedLastRun = CrashReporting.INSTANCE.isCrashedLastRun();
        if (isCrashedLastRun != null) {
            callback.invoke(isCrashedLastRun);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CrashlyticsManager";
    }

    @ReactMethod
    public final void getSystemLog(Callback callback) {
        C9971q.m14633g(callback, "callback");
        SystemLogUtils systemLogUtils = SystemLogUtils.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9971q.m14634f(reactApplicationContext, "reactApplicationContext");
        callback.invoke(systemLogUtils.fetch(reactApplicationContext));
    }

    @ReactMethod
    public final void initializeManager() {
        SystemLogUtils systemLogUtils = SystemLogUtils.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9971q.m14634f(reactApplicationContext, "reactApplicationContext");
        systemLogUtils.initSystemLogCapture(reactApplicationContext);
    }

    @ReactMethod
    public final void removeListeners(int i) {
    }

    @ReactMethod
    public final void setUser(ReadableMap user) {
        C9971q.m14633g(user, "user");
    }
}
