package com.discord.blur;

import com.discord.react.utilities.InitialPropsViewGroupManager;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.DCDVisualEffectViewManagerDelegate;
import com.facebook.react.viewmanagers.DCDVisualEffectViewManagerInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@ReactModule(name = BlurViewManager.NAME)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J$\u0010\r\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\u001a\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0017J\u001f\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0002\u0010\u001aR*\u0010\u0005\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/discord/blur/BlurViewManager;", "Lcom/discord/react/utilities/InitialPropsViewGroupManager;", "Lcom/discord/blur/BlurView;", "Lcom/facebook/react/viewmanagers/DCDVisualEffectViewManagerInterface;", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDVisualEffectViewManagerDelegate;", "kotlin.jvm.PlatformType", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "initialProps", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "getDelegate", "getName", "", "setBlurAmount", "", "blurView", BlurViewManager.PROP_BLUR_AMOUNT, "", "setBlurTargetViewNativeId", BlurViewManager.PROP_BLUR_TARGET_VIEW_NATIVE_ID, "setOverlayColor", "blurOverlayColor", "", "(Lcom/discord/blur/BlurView;Ljava/lang/Integer;)V", "Companion", "blur_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class BlurViewManager extends InitialPropsViewGroupManager<BlurView> implements DCDVisualEffectViewManagerInterface<BlurView> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "DCDVisualEffectView";
    private static final String PROP_BLUR_AMOUNT = "blurAmount";
    private static final String PROP_BLUR_OVERLAY_COLOR = "overlayColor";
    private static final String PROP_BLUR_TARGET_VIEW_NATIVE_ID = "blurTargetViewNativeId";
    private final DCDVisualEffectViewManagerDelegate<BlurView, BlurViewManager> delegate = new DCDVisualEffectViewManagerDelegate<>(this);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/discord/blur/BlurViewManager$Companion;", "", "()V", "NAME", "", "PROP_BLUR_AMOUNT", "PROP_BLUR_OVERLAY_COLOR", "PROP_BLUR_TARGET_VIEW_NATIVE_ID", "blur_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
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
    public BlurView createViewInstance(ThemedReactContext reactContext, ReactStylesDiffMap reactStylesDiffMap) {
        q.h(reactContext, "reactContext");
        Float f10 = null;
        String string = reactStylesDiffMap != null ? reactStylesDiffMap.getString(PROP_BLUR_TARGET_VIEW_NATIVE_ID) : null;
        Integer valueOf = reactStylesDiffMap != null ? Integer.valueOf(reactStylesDiffMap.getInt(PROP_BLUR_OVERLAY_COLOR, -1)) : null;
        if (reactStylesDiffMap != null) {
            f10 = Float.valueOf(reactStylesDiffMap.getFloat(PROP_BLUR_AMOUNT, -1.0f));
        }
        boolean z10 = true;
        if (string != null) {
            if ((valueOf == null || valueOf.intValue() == -1) ? false : true) {
                if (f10 == null || q.b(f10, -1.0f)) {
                    z10 = false;
                }
                if (z10) {
                    return new BlurView(reactContext, string, valueOf.intValue(), f10.floatValue());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    
    @Override 
    public DCDVisualEffectViewManagerDelegate<BlurView, BlurViewManager> getDelegate() {
        return this.delegate;
    }

    @ReactProp(name = PROP_BLUR_AMOUNT)
    public void setBlurAmount(BlurView blurView, float f10) {
        q.h(blurView, "blurView");
        blurView.setBlurAmount(f10);
    }

    @ReactProp(name = PROP_BLUR_TARGET_VIEW_NATIVE_ID)
    public void setBlurTargetViewNativeId(BlurView blurView, String str) {
        q.h(blurView, "blurView");
        if (str != null) {
            blurView.setBlurTargetNativeId(str);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @ReactProp(customType = "Color", name = PROP_BLUR_OVERLAY_COLOR)
    public void setOverlayColor(BlurView blurView, Integer num) {
        q.h(blurView, "blurView");
        if (num != null) {
            blurView.setBlurOverlayColor(num.intValue());
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
