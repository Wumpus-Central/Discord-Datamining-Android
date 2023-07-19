package com.discord.blur;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.util.ReactFindViewUtil;
import com.facebook.react.viewmanagers.DCDVisualEffectViewManagerDelegate;
import com.facebook.react.viewmanagers.DCDVisualEffectViewManagerInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@ReactModule(name = BlurViewManager.NAME)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0014J,\u0010\b\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J$\u0010\u0011\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\fH\u0017J\u001a\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013H\u0017J\u001f\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0002\u0010\u001cR*\u0010\u0005\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/discord/blur/BlurViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/blur/BlurView;", "Lcom/facebook/react/viewmanagers/DCDVisualEffectViewManagerInterface;", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDVisualEffectViewManagerDelegate;", "kotlin.jvm.PlatformType", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactTag", "", "initialProps", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "getDelegate", "getName", "", "setBlurAmount", "", "blurView", BlurViewManager.PROP_BLUR_AMOUNT, "setBlurTargetViewNativeId", BlurViewManager.PROP_BLUR_TARGET_VIEW_NATIVE_ID, "setOverlayColor", ViewProps.COLOR, "(Lcom/discord/blur/BlurView;Ljava/lang/Integer;)V", "Companion", "blur_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class BlurViewManager extends ViewGroupManager<BlurView> implements DCDVisualEffectViewManagerInterface<BlurView> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "DCDVisualEffectView";
    private static final String PROP_BLUR_AMOUNT = "blurAmount";
    private static final String PROP_BLUR_TARGET_VIEW_NATIVE_ID = "blurTargetViewNativeId";
    private static final String PROP_OVERLAY_COLOR = "overlayColor";
    private final DCDVisualEffectViewManagerDelegate<BlurView, BlurViewManager> delegate = new DCDVisualEffectViewManagerDelegate<>(this);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t*\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discord/blur/BlurViewManager$Companion;", "", "()V", "NAME", "", "PROP_BLUR_AMOUNT", "PROP_BLUR_TARGET_VIEW_NATIVE_ID", "PROP_OVERLAY_COLOR", "getBlurTargetView", "Landroid/view/ViewGroup;", "Lcom/discord/blur/BlurView;", BlurViewManager.PROP_BLUR_TARGET_VIEW_NATIVE_ID, "blur_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        
        public final ViewGroup getBlurTargetView(BlurView blurView, String str) {
            ReactContext reactContext;
            Activity currentActivity;
            Window window;
            View decorView;
            ViewGroup viewGroup;
            Context context = blurView.getContext();
            ViewGroup viewGroup2 = null;
            if (context instanceof ReactContext) {
                reactContext = (ReactContext) context;
            } else {
                reactContext = null;
            }
            if (reactContext == null || (currentActivity = reactContext.getCurrentActivity()) == null || (window = currentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null || (viewGroup = (ViewGroup) decorView.findViewById(16908290)) == null) {
                return blurView;
            }
            if (str != null) {
                View findView = ReactFindViewUtil.findView(viewGroup, str);
                if (findView instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) findView;
                }
                if (viewGroup2 != null) {
                    return viewGroup2;
                }
            }
            return viewGroup;
        }

        static  ViewGroup getBlurTargetView$default(Companion companion, BlurView blurView, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return companion.getBlurTargetView(blurView, str);
        }
    }

    @Override 
    public String getName() {
        return NAME;
    }

    
    @Override 
    public DCDVisualEffectViewManagerDelegate<BlurView, BlurViewManager> getDelegate() {
        return this.delegate;
    }

    @ReactProp(name = PROP_BLUR_AMOUNT)
    public void setBlurAmount(BlurView blurView, int i10) {
        q.g(blurView, "blurView");
        blurView.setBlurRadius(i10);
    }

    @ReactProp(name = PROP_BLUR_TARGET_VIEW_NATIVE_ID)
    public void setBlurTargetViewNativeId(BlurView blurView, String str) {
        q.g(blurView, "blurView");
        blurView.setBlurTarget(Companion.getBlurTargetView(blurView, str));
    }

    @ReactProp(customType = "Color", name = PROP_OVERLAY_COLOR)
    public void setOverlayColor(BlurView blurView, Integer num) {
        q.g(blurView, "blurView");
        if (num != null) {
            blurView.setOverlayColor(num.intValue());
        }
    }

    
    @Override 
    public BlurView createViewInstance(ThemedReactContext reactContext) {
        q.g(reactContext, "reactContext");
        return new BlurView(reactContext);
    }

    
    @Override 
    public BlurView createViewInstance(int i10, ThemedReactContext reactContext, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper) {
        q.g(reactContext, "reactContext");
        View createViewInstance = super.createViewInstance(i10, reactContext, reactStylesDiffMap, stateWrapper);
        BlurView blurView = (BlurView) createViewInstance;
        if ((reactStylesDiffMap != null ? reactStylesDiffMap.getString(PROP_BLUR_TARGET_VIEW_NATIVE_ID) : null) == null) {
            Companion companion = Companion;
            q.f(blurView, "blurView");
            blurView.setBlurTarget(Companion.getBlurTargetView$default(companion, blurView, null, 1, null));
        }
        q.f(createViewInstance, "super.createViewInstance…)\n            }\n        }");
        return blurView;
    }
}
