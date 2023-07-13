package com.discord.blur;

import android.app.Activity;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.DCDVisualEffectViewManagerDelegate;
import com.facebook.react.viewmanagers.DCDVisualEffectViewManagerInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@ReactModule(name = BlurViewManager.NAME)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0014J$\u0010\u000b\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0017J\u001f\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0002\u0010\u0015R*\u0010\u0005\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/discord/blur/BlurViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/blur/BlurView;", "Lcom/facebook/react/viewmanagers/DCDVisualEffectViewManagerInterface;", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDVisualEffectViewManagerDelegate;", "kotlin.jvm.PlatformType", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getDelegate", "getName", "", "setBlurAmount", "", "blurView", "blurAmount", "", "setOverlayColor", ViewProps.COLOR, "(Lcom/discord/blur/BlurView;Ljava/lang/Integer;)V", "Companion", "blur_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class BlurViewManager extends ViewGroupManager<BlurView> implements DCDVisualEffectViewManagerInterface<BlurView> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "DCDVisualEffectView";
    private final DCDVisualEffectViewManagerDelegate<BlurView, BlurViewManager> delegate = new DCDVisualEffectViewManagerDelegate<>(this);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/blur/BlurViewManager$Companion;", "", "()V", "NAME", "", "blur_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
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
    public BlurView createViewInstance(ThemedReactContext reactContext) {
        q.g(reactContext, "reactContext");
        Activity currentActivity = reactContext.getCurrentActivity();
        return new BlurView(reactContext, currentActivity != null ? currentActivity.getWindow() : null);
    }

    
    @Override 
    public DCDVisualEffectViewManagerDelegate<BlurView, BlurViewManager> getDelegate() {
        return this.delegate;
    }

    @ReactProp(name = "blurAmount")
    public void setBlurAmount(BlurView blurView, int i10) {
        q.g(blurView, "blurView");
        blurView.setBlurRadius(i10);
    }

    @ReactProp(customType = "Color", name = "overlayColor")
    public void setOverlayColor(BlurView blurView, Integer num) {
        q.g(blurView, "blurView");
        if (num != null) {
            blurView.setOverlayColor(num.intValue());
        }
    }
}
