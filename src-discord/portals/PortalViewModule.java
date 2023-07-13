package com.discord.portals;

import android.app.Activity;
import android.widget.FrameLayout;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.DCDPortalViewManagerDelegate;
import com.facebook.react.viewmanagers.DCDPortalViewManagerInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.l;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, d2 = {"Lcom/discord/portals/PortalViewModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "unregisterView", "", "portal", "", "Companion", "PortalViewManager", "portals_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class PortalViewModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "DCDPortalViewManager";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/portals/PortalViewModule$Companion;", "", "()V", "NAME", "", "portals_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0014J$\u0010\u000b\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0017R*\u0010\u0005\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/portals/PortalViewModule$PortalViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Landroid/widget/FrameLayout;", "Lcom/facebook/react/viewmanagers/DCDPortalViewManagerInterface;", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDPortalViewManagerDelegate;", "kotlin.jvm.PlatformType", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getDelegate", "getName", "", "setPortal", "", "portalView", "portal", "", "Companion", "portals_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ReactModule(name = PortalViewManager.NAME)
    
    public static final class PortalViewManager extends ViewGroupManager<FrameLayout> implements DCDPortalViewManagerInterface<FrameLayout> {
        public static final Companion Companion = new Companion(null);
        public static final String NAME = "DCDPortalView";
        private final DCDPortalViewManagerDelegate<FrameLayout, PortalViewManager> delegate = new DCDPortalViewManagerDelegate<>(this);

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/portals/PortalViewModule$PortalViewManager$Companion;", "", "()V", "NAME", "", "portals_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        
        public static final class Companion {
            private Companion() {
            }

            public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override 
        public String getName() {
            return NAME;
        }

        
        @Override 
        public FrameLayout createViewInstance(ThemedReactContext reactContext) {
            q.g(reactContext, "reactContext");
            return new FrameLayout(reactContext);
        }

        
        @Override 
        public DCDPortalViewManagerDelegate<FrameLayout, PortalViewManager> getDelegate() {
            return this.delegate;
        }

        @ReactProp(name = "portal")
        public void setPortal(FrameLayout portalView, double d10) {
            q.g(portalView, "portalView");
            l.d(CoroutineViewUtilsKt.getAttachedScope(portalView), null, null, new PortalViewModule$PortalViewManager$setPortal$1(d10, portalView, null), 3, null);
        }
    }

    
    public PortalViewModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
    }

    
    public static final void unregisterView$lambda$0(double d10) {
        PortalViewContextManager.INSTANCE.unregisterView(d10);
    }

    @Override 
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public final void unregisterView(final double d10) {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new Runnable() { 
                @Override 
                public final void run() {
                    PortalViewModule.unregisterView$lambda$0(d10);
                }
            });
        }
    }
}
