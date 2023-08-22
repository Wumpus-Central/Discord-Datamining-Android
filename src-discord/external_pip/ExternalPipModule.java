package com.discord.external_pip;

import com.discord.external_pip.react_events.OnPipModeChangedEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewProps;
import jf.s;
import jf.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;

@ReactModule(name = ExternalPipModule.NAME)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0007J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0007J+\u0010\n\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00022\u0018\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0013\u0012\u0004\u0012\u00020\u00040\u0012ø\u0001\u0000R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/discord/external_pip/ExternalPipModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "isInPipMode", "", "onPipModeChanged", "", "getName", "Lcom/facebook/react/bridge/Promise;", "onResultPromise", "enterPipMode", ViewProps.ENABLED, "setEnabled", "", "numerator", "denominator", "setPipAspectRatio", "force", "Lkotlin/Function1;", "Ljf/s;", "onResult", "Lcom/discord/external_pip/ExternalPipManager;", "manager", "Lcom/discord/external_pip/ExternalPipManager;", "Lcom/discord/reactevents/ReactEvents;", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Companion", "external_pip_release"}, k = 1, mv = {1, 8, 0})

public final class ExternalPipModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "ExternalPip";
    private final ExternalPipManager manager = new ExternalPipManager();
    private final ReactEvents reactEvents = new ReactEvents(x.a("onPipModeChanged", f0.b(OnPipModeChangedEvent.class)));

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/external_pip/ExternalPipModule$Companion;", "", "()V", "NAME", "", "onPipModeChanged", "", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "isInPipMode", "", "(Lcom/facebook/react/bridge/ReactContext;Z)Lkotlin/Unit;", "onUserLeaveHint", "(Lcom/facebook/react/bridge/ReactContext;)Lkotlin/Unit;", "getModule", "Lcom/discord/external_pip/ExternalPipModule;", "external_pip_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ExternalPipModule getModule(ReactContext reactContext) {
            return (ExternalPipModule) reactContext.getNativeModule(ExternalPipModule.class);
        }

        public final Unit onPipModeChanged(ReactContext reactContext, boolean z10) {
            ExternalPipModule module;
            if (reactContext == null || (module = getModule(reactContext)) == null) {
                return null;
            }
            module.onPipModeChanged(z10);
            return Unit.f21213a;
        }

        public final Unit onUserLeaveHint(ReactContext reactContext) {
            ExternalPipModule module;
            if (reactContext == null || (module = getModule(reactContext)) == null) {
                return null;
            }
            module.enterPipMode(false, ExternalPipModule$Companion$onUserLeaveHint$1.INSTANCE);
            return Unit.f21213a;
        }
    }

    
    public ExternalPipModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.h(reactContext, "reactContext");
    }

    
    public final void onPipModeChanged(boolean z10) {
        ReactEvents reactEvents = this.reactEvents;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.g(reactApplicationContext, "reactApplicationContext");
        reactEvents.emitModuleEvent(reactApplicationContext, new OnPipModeChangedEvent(z10));
    }

    @ReactMethod
    public final void enterPipMode(Promise onResultPromise) {
        q.h(onResultPromise, "onResultPromise");
        enterPipMode(true, new ExternalPipModule$enterPipMode$1(onResultPromise));
    }

    @Override 
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public final void setEnabled(boolean z10) {
        this.manager.setEnabled(z10);
    }

    @ReactMethod
    public final void setPipAspectRatio(int i10, int i11) {
        this.manager.setPipAspectRatio(i10, i11);
    }

    public final void enterPipMode(boolean z10, Function1<? super s<Unit>, Unit> onResult) {
        q.h(onResult, "onResult");
        this.manager.enterPipMode(getReactApplicationContext().getCurrentActivity(), z10, onResult);
    }
}
