package com.discord.blur;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.FrameLayout;
import com.discord.blur.BlurViewAPI;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0016\u001a\u00020\u000fH\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0014J\b\u0010\u0018\u001a\u00020\u000fH\u0014J0\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0014J\u0018\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0006H\u0016J\u0012\u0010#\u001a\u00020\u000f2\b\b\u0001\u0010$\u001a\u00020\bH\u0016J\u0012\u0010%\u001a\u00020\u000f2\b\b\u0001\u0010$\u001a\u00020\bH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/discord/blur/BlurViewHardwareAccelerated;", "Landroid/widget/FrameLayout;", "Lcom/discord/blur/BlurViewAPI;", "context", "Landroid/content/Context;", "blurTargetNativeId", "", "blurTint", "", "blurTintIOSParityCompensation", "blurAmount", "", "(Landroid/content/Context;Ljava/lang/String;IIF)V", "blurTargetChangeListener", "Lkotlin/Function0;", "", "blurViewHeight", "blurViewLocation", "", "blurViewPropertiesDirty", "", "blurViewWidth", "maybeUpdate", "onAttachedToWindow", "onDetachedFromWindow", ViewProps.ON_LAYOUT, "changed", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "setBlurAmount", "rectId", "setBlurTargetNativeId", "nativeId", "setBlurTint", ViewProps.COLOR, "setBlurTintIOSParityCompensation", "blur_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})

public final class BlurViewHardwareAccelerated extends FrameLayout implements BlurViewAPI {
    private float blurAmount;
    private final Function0<Unit> blurTargetChangeListener;
    private String blurTargetNativeId;
    private int blurTint;
    private int blurTintIOSParityCompensation;
    private boolean blurViewPropertiesDirty = true;
    private int blurViewWidth = -1;
    private int blurViewHeight = -1;
    private int[] blurViewLocation = new int[2];

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    
    
    static final class AnonymousClass1 extends s implements Function0<Unit> {
        AnonymousClass1() {
            super(0);
        }

        @Override 
        
        public final void invoke2() {
            BlurViewHardwareAccelerated.this.maybeUpdate();
        }
    }

    
    public BlurViewHardwareAccelerated(Context context, String blurTargetNativeId, int i10, int i11, float f10) {
        super(context);
        q.h(context, "context");
        q.h(blurTargetNativeId, "blurTargetNativeId");
        this.blurTargetNativeId = blurTargetNativeId;
        this.blurTint = i10;
        this.blurTintIOSParityCompensation = i11;
        this.blurAmount = f10;
        BlurViewHardwareAccelerated$blurTargetChangeListener$1 blurViewHardwareAccelerated$blurTargetChangeListener$1 = new BlurViewHardwareAccelerated$blurTargetChangeListener$1(this);
        this.blurTargetChangeListener = blurViewHardwareAccelerated$blurTargetChangeListener$1;
        BlurView.Companion.updateListener$blur_release(blurViewHardwareAccelerated$blurTargetChangeListener$1, true, new AnonymousClass1());
    }

    
    public final void maybeUpdate() {
        boolean z10;
        if (this.blurViewWidth == -1 || this.blurViewHeight == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        BlurViewAPI.Target target = BlurViewTargetRegistry.INSTANCE.get(this.blurTargetNativeId);
        if (target != null && !z10 && this.blurViewPropertiesDirty) {
            target.setBlurAmount(getId(), this.blurAmount);
            int id2 = getId();
            int[] iArr = this.blurViewLocation;
            target.addBlurRect(id2, iArr[0], iArr[1], this.blurViewWidth, this.blurViewHeight);
            setBackgroundColor(BlurView.Companion.mapBlurTint$blur_release(this.blurTintIOSParityCompensation, this.blurTint, this.blurAmount));
            this.blurViewPropertiesDirty = false;
        }
    }

    @Override 
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        BlurView.Companion.updateListener$blur_release(this.blurTargetChangeListener, true, new BlurViewHardwareAccelerated$onAttachedToWindow$1(this));
    }

    @Override 
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BlurView.Companion.updateListener$blur_release(this.blurTargetChangeListener, false, new BlurViewHardwareAccelerated$onDetachedFromWindow$1(this));
        BlurViewAPI.Target target = BlurViewTargetRegistry.INSTANCE.get(this.blurTargetNativeId);
        if (target != null) {
            target.removeBlurRect(getId());
        }
    }

    @Override 
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.blurViewWidth == getWidth() && this.blurViewHeight == getHeight()) {
            z11 = false;
        } else {
            z11 = true;
        }
        int[] iArr = this.blurViewLocation;
        int i14 = iArr[0];
        int i15 = iArr[1];
        getLocationInWindow(iArr);
        int[] iArr2 = this.blurViewLocation;
        if (!(iArr2[0] == i14 && iArr2[1] == i15 && !z11)) {
            this.blurViewWidth = getWidth();
            this.blurViewHeight = getHeight();
            this.blurViewPropertiesDirty = true;
        }
        maybeUpdate();
    }

    @Override 
    public void setBlurAmount(int i10, float f10) {
        boolean z10;
        if (this.blurAmount == f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.blurAmount = f10;
            this.blurViewPropertiesDirty = true;
        }
        maybeUpdate();
    }

    @Override 
    public void setBlurTargetNativeId(String nativeId) {
        q.h(nativeId, "nativeId");
        if (!q.c(this.blurTargetNativeId, nativeId)) {
            this.blurTargetNativeId = nativeId;
            this.blurViewPropertiesDirty = true;
        }
        maybeUpdate();
    }

    @Override 
    public void setBlurTint(int i10) {
        if (this.blurTint != i10) {
            this.blurTint = i10;
            this.blurViewPropertiesDirty = true;
        }
        maybeUpdate();
    }

    @Override 
    public void setBlurTintIOSParityCompensation(int i10) {
        if (this.blurTintIOSParityCompensation != i10) {
            this.blurTintIOSParityCompensation = i10;
            this.blurViewPropertiesDirty = true;
        }
        maybeUpdate();
    }
}
