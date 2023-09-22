package com.discord.lifecycle;

import com.discord.lifecycle.react.events.OnHostDestroyEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import pf.x;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/lifecycle/AppLifecycleManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "getName", "", "onHostDestroy", "", "onHostPause", "onHostResume", "lifecycle_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class AppLifecycleManagerModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    private final ReactEvents reactEvents = new ReactEvents(x.a("onHostDestroy", f0.b(OnHostDestroyEvent.class)));

    
    public AppLifecycleManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.h(reactContext, "reactContext");
        reactContext.addLifecycleEventListener(this);
    }

    @Override 
    public String getName() {
        return "DCDAppLifecycleManager";
    }

    @Override 
    public void onHostDestroy() {
        ReactEvents reactEvents = this.reactEvents;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.g(reactApplicationContext, "reactApplicationContext");
        reactEvents.emitModuleEvent(reactApplicationContext, new OnHostDestroyEvent());
    }

    @Override 
    public void onHostPause() {
    }

    @Override 
    public void onHostResume() {
    }
}
