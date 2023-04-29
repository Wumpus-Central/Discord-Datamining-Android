package com.discord.portals;

import android.app.Activity;
import android.widget.FrameLayout;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.l;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\f"}, d2 = {"Lcom/discord/portals/PortalViewModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "unregisterView", "", "portal", "", "PortalViewManager", "portals_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PortalViewModule extends ReactContextBaseJavaModule {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Lcom/discord/portals/PortalViewModule$PortalViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Landroid/widget/FrameLayout;", "()V", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "portal", "", "portalView", "", "portals_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class PortalViewManager extends ViewGroupManager<FrameLayout> {
        @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
        public String getName() {
            return "DCDPortalView";
        }

        @ReactProp(name = "portal")
        public final void portal(FrameLayout portalView, double d10) {
            q.g(portalView, "portalView");
            l.d(CoroutineViewUtilsKt.getAttachedScope(portalView), null, null, new PortalViewModule$PortalViewManager$portal$1(d10, portalView, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.uimanager.ViewManager
        public FrameLayout createViewInstance(ThemedReactContext reactContext) {
            q.g(reactContext, "reactContext");
            return new FrameLayout(reactContext);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortalViewModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unregisterView$lambda$0(double d10) {
        PortalViewContextManager.INSTANCE.unregisterView(d10);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DCDPortalViewManager";
    }

    @ReactMethod
    public final void unregisterView(final double d10) {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new Runnable() { // from class: com.discord.portals.a
                @Override // java.lang.Runnable
                public final void run() {
                    PortalViewModule.unregisterView$lambda$0(d10);
                }
            });
        }
    }
}
