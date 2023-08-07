package com.discord.blur;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.util.ReactFindViewUtil;
import eightbitlab.com.blurview.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB'\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/discord/blur/BlurView;", "Leightbitlab/com/blurview/a;", "", "maybeUpdate", "Landroid/view/ViewGroup;", "getBlurTargetView", "", "blurOverlayColor", "setBlurOverlayColor", "", "blurAmount", "setBlurAmount", "", "nativeId", "setBlurTargetNativeId", "blurTargetNativeId", "Ljava/lang/String;", "I", "F", "", "blurViewPropertiesDirty", "Z", "blurTarget", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Ljava/lang/String;IF)V", "Companion", "blur_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"ViewConstructor"})

public final class BlurView extends a {
    public static final Companion Companion = new Companion(null);
    private float blurAmount;
    private int blurOverlayColor;
    private ViewGroup blurTarget;
    private String blurTargetNativeId;
    private boolean blurViewPropertiesDirty = true;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0002¨\u0006\u0007"}, d2 = {"Lcom/discord/blur/BlurView$Companion;", "", "()V", "mapRadius", "", "radius", "maxRadius", "blur_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float mapRadius(float f10, float f11) {
            return Math.max(1 / f11, Math.min(1.0f, f10)) * f11;
        }

        static  float mapRadius$default(Companion companion, float f10, float f11, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                f11 = 24.0f;
            }
            return companion.mapRadius(f10, f11);
        }
    }

    
    public BlurView(Context context, String blurTargetNativeId, int i10, float f10) {
        super(context);
        q.h(context, "context");
        q.h(blurTargetNativeId, "blurTargetNativeId");
        this.blurTargetNativeId = blurTargetNativeId;
        this.blurOverlayColor = i10;
        this.blurAmount = f10;
        maybeUpdate();
    }

    private final ViewGroup getBlurTargetView() {
        ReactContext reactContext;
        Activity currentActivity;
        Window window;
        View decorView;
        ViewGroup viewGroup;
        Context context = getContext();
        ViewGroup viewGroup2 = null;
        if (context instanceof ReactContext) {
            reactContext = (ReactContext) context;
        } else {
            reactContext = null;
        }
        if (reactContext == null || (currentActivity = reactContext.getCurrentActivity()) == null || (window = currentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null || (viewGroup = (ViewGroup) decorView.findViewById(16908290)) == null) {
            return this;
        }
        View findView = ReactFindViewUtil.findView(viewGroup, this.blurTargetNativeId);
        if (findView instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) findView;
        }
        if (viewGroup2 == null) {
            return viewGroup;
        }
        return viewGroup2;
    }

    private final void maybeUpdate() {
        if (this.blurViewPropertiesDirty) {
            ViewGroup blurTargetView = getBlurTargetView();
            if (!q.c(this.blurTarget, blurTargetView)) {
                this.blurTarget = blurTargetView;
                setupWith(blurTargetView).c(blurTargetView.getBackground());
            }
            setOverlayColor(this.blurOverlayColor);
            setBlurRadius(this.blurAmount);
            ViewGroup viewGroup = this.blurTarget;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
            invalidate();
            this.blurViewPropertiesDirty = false;
        }
    }

    public final void setBlurAmount(float f10) {
        boolean z10;
        float mapRadius$default = Companion.mapRadius$default(Companion, f10, 0.0f, 2, null);
        if (this.blurAmount == mapRadius$default) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.blurAmount = mapRadius$default;
            this.blurViewPropertiesDirty = true;
        }
        maybeUpdate();
    }

    public final void setBlurOverlayColor(int i10) {
        if (this.blurOverlayColor != i10) {
            this.blurOverlayColor = i10;
            this.blurViewPropertiesDirty = true;
        }
        maybeUpdate();
    }

    public final void setBlurTargetNativeId(String nativeId) {
        q.h(nativeId, "nativeId");
        if (!q.c(this.blurTargetNativeId, nativeId)) {
            this.blurTargetNativeId = nativeId;
            this.blurViewPropertiesDirty = true;
        }
        maybeUpdate();
    }
}
