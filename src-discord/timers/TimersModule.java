package com.discord.timers;

import com.discord.reactevents.ReactEvents;
import com.discord.timers.reactevents.IntervalEvent;
import com.discord.timers.reactevents.TimerEvent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import nf.x;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000fH\u0007J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/discord/timers/TimersModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "timersManager", "Lcom/discord/timers/TimersManager;", "addListener", "", "type", "", "clearInterval", "id", "", "clearTimeout", "getName", "onCatalystInstanceDestroy", "removeListeners", "count", "setInterval", "timeout", "", "setTimeout", "react_timers_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimersModule extends ReactContextBaseJavaModule {
    private final ReactEvents reactEvents = new ReactEvents(x.a("timer", f0.b(TimerEvent.class)), x.a("interval", f0.b(IntervalEvent.class)));
    private final TimersManager timersManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimersModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
        this.timersManager = new TimersManager(reactContext);
    }

    @ReactMethod
    public final void addListener(String type) {
        q.g(type, "type");
    }

    @ReactMethod
    public final void clearInterval(int i10) {
        this.timersManager.clearInterval(i10);
    }

    @ReactMethod
    public final void clearTimeout(int i10) {
        this.timersManager.clearTimeout(i10);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "TimersModule";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.timersManager.clean();
    }

    @ReactMethod
    public final void removeListeners(int i10) {
    }

    @ReactMethod
    public final void setInterval(int i10, double d10) {
        this.timersManager.setInterval(i10, d10, new TimersModule$setInterval$1(this, i10));
    }

    @ReactMethod
    public final void setTimeout(int i10, double d10) {
        this.timersManager.setTimeout(i10, d10, new TimersModule$setTimeout$1(this, i10));
    }
}
