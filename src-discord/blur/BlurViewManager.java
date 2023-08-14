package com.discord.blur;

import android.os.Build;
import android.view.ViewGroup;
import com.discord.react.utilities.InitialPropsViewGroupManager;
import com.discord.theme.utils.ColorUtilsKt;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0001\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J$\u0010\r\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\u001a\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0017J\u001c\u0010\u0017\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u000fH\u0017J\u001a\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0017R*\u0010\u0005\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/discord/blur/BlurViewManager;", "Lcom/discord/react/utilities/InitialPropsViewGroupManager;", "Landroid/view/ViewGroup;", "Lcom/facebook/react/viewmanagers/DCDVisualEffectViewManagerInterface;", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDVisualEffectViewManagerDelegate;", "kotlin.jvm.PlatformType", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "initialProps", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "getDelegate", "getName", "", "setBlurAmount", "", "blurView", BlurViewManager.PROP_BLUR_AMOUNT, "", "setBlurTargetViewNativeId", BlurViewManager.PROP_BLUR_TARGET_VIEW_NATIVE_ID, "setBlurTintIOSParityCompensationRgba", BlurViewManager.PROP_BLUR_TINT_IOS_PARITY_RGBA, "setBlurTintRgba", BlurViewManager.PROP_BLUR_TINT_RGBA, "Companion", "blur_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class BlurViewManager extends InitialPropsViewGroupManager<ViewGroup> implements DCDVisualEffectViewManagerInterface<ViewGroup> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "DCDVisualEffectView";
    private static final String PROP_BLUR_AMOUNT = "blurAmount";
    private static final String PROP_BLUR_TARGET_VIEW_NATIVE_ID = "blurTargetViewNativeId";
    private static final String PROP_BLUR_TINT_IOS_PARITY_RGBA = "blurTintIOSParityCompensationRgba";
    private static final String PROP_BLUR_TINT_RGBA = "blurTintRgba";
    private final DCDVisualEffectViewManagerDelegate<ViewGroup, BlurViewManager> delegate = new DCDVisualEffectViewManagerDelegate<>(this);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\b\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discord/blur/BlurViewManager$Companion;", "", "()V", "NAME", "", "PROP_BLUR_AMOUNT", "PROP_BLUR_TARGET_VIEW_NATIVE_ID", "PROP_BLUR_TINT_IOS_PARITY_RGBA", "PROP_BLUR_TINT_RGBA", "isHardwareBlurEnabled", "", "isHardwareBlurEnabled$blur_release", "blur_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isHardwareBlurEnabled$blur_release() {
            return Build.VERSION.SDK_INT >= 31;
        }
    }

    @Override 
    public ViewGroup createViewInstance(ThemedReactContext reactContext, ReactStylesDiffMap reactStylesDiffMap) {
        String str;
        String str2;
        Float f10;
        boolean z10;
        q.h(reactContext, "reactContext");
        String str3 = null;
        if (reactStylesDiffMap != null) {
            str = reactStylesDiffMap.getString(PROP_BLUR_TARGET_VIEW_NATIVE_ID);
        } else {
            str = null;
        }
        if (reactStylesDiffMap != null) {
            str2 = reactStylesDiffMap.getString(PROP_BLUR_TINT_RGBA);
        } else {
            str2 = null;
        }
        if (reactStylesDiffMap != null) {
            f10 = Float.valueOf(reactStylesDiffMap.getFloat(PROP_BLUR_AMOUNT, -1.0f));
        } else {
            f10 = null;
        }
        if (reactStylesDiffMap != null) {
            str3 = reactStylesDiffMap.getString(PROP_BLUR_TINT_IOS_PARITY_RGBA);
        }
        boolean z11 = true;
        if (str != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (f10 == null || q.b(f10, -1.0f)) {
                z11 = false;
            }
            if (!z11) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (Companion.isHardwareBlurEnabled$blur_release()) {
                return new BlurViewHardwareAccelerated(reactContext, str, ColorUtilsKt.rgbaToArgb(str2), ColorUtilsKt.rgbaToArgb(str3), f10.floatValue());
            } else {
                return new BlurView(reactContext, str, ColorUtilsKt.rgbaToArgb(str2), ColorUtilsKt.rgbaToArgb(str3), f10.floatValue());
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @Override 
    public String getName() {
        return NAME;
    }

    
    @Override 
    public DCDVisualEffectViewManagerDelegate<ViewGroup, BlurViewManager> getDelegate() {
        return this.delegate;
    }

    @ReactProp(name = PROP_BLUR_AMOUNT)
    public void setBlurAmount(ViewGroup blurView, float f10) {
        q.h(blurView, "blurView");
        if (blurView instanceof BlurViewAPI) {
            ((BlurViewAPI) blurView).setBlurAmount(blurView.getId(), f10);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @ReactProp(name = PROP_BLUR_TARGET_VIEW_NATIVE_ID)
    public void setBlurTargetViewNativeId(ViewGroup blurView, String str) {
        q.h(blurView, "blurView");
        if (blurView instanceof BlurViewAPI) {
            if (str != null) {
                ((BlurViewAPI) blurView).setBlurTargetNativeId(str);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @ReactProp(name = PROP_BLUR_TINT_IOS_PARITY_RGBA)
    public void setBlurTintIOSParityCompensationRgba(ViewGroup viewGroup, String str) {
        if (viewGroup instanceof BlurViewAPI) {
            ((BlurViewAPI) viewGroup).setBlurTintIOSParityCompensation(ColorUtilsKt.rgbaToArgb(str));
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @ReactProp(name = PROP_BLUR_TINT_RGBA)
    public void setBlurTintRgba(ViewGroup blurView, String str) {
        q.h(blurView, "blurView");
        if (blurView instanceof BlurViewAPI) {
            ((BlurViewAPI) blurView).setBlurTint(ColorUtilsKt.rgbaToArgb(str));
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
