package com.discord.blur;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import com.discord.blur.BlurViewAPI;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import eightbitlab.com.blurview.a;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B3\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0015\u001a\u00020\b\u0012\b\b\u0001\u0010\u0017\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b&\u0010'J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0003H\u0014J\u0012\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Lcom/discord/blur/BlurView;", "Leightbitlab/com/blurview/a;", "Lcom/discord/blur/BlurViewAPI;", "", "maybeUpdate", "maybeUpdateBlurEnabled", "onAttachedToWindow", "onDetachedFromWindow", "", ViewProps.COLOR, "setBlurTint", "setBlurTintIOSParityCompensation", "rectId", "", "blurAmount", "setBlurAmount", "", "nativeId", "setBlurTargetNativeId", "blurTargetNativeId", "Ljava/lang/String;", "blurTint", "I", "blurTintIOSParityCompensation", "F", "", "blurEnabled", "Z", "blurViewPropertiesDirty", "Ljava/lang/ref/WeakReference;", "Lcom/discord/blur/BlurViewAPI$Target;", "blurTarget", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function0;", "blurTargetChangeListener", "Lkotlin/jvm/functions/Function0;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Ljava/lang/String;IIF)V", "Companion", "blur_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"ViewConstructor"})

public final class BlurView extends a implements BlurViewAPI {
    public static final Companion Companion = new Companion(null);
    private float blurAmount;
    private final Function0<Unit> blurTargetChangeListener;
    private String blurTargetNativeId;
    private int blurTint;
    private int blurTintIOSParityCompensation;
    private boolean blurEnabled = true;
    private boolean blurViewPropertiesDirty = true;
    private WeakReference<BlurViewAPI.Target> blurTarget = new WeakReference<>(null);

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    
    
    static final class AnonymousClass1 extends s implements Function0<Unit> {
        AnonymousClass1() {
            super(0);
        }

        @Override 
        
        public final void invoke2() {
            BlurView.this.maybeUpdate();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\b\tJ)\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\bH\u0000¢\u0006\u0002\b\u000eJ1\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\u0000¢\u0006\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/discord/blur/BlurView$Companion;", "", "()V", "mapBlurTint", "", "blurAmountTint", "blurTint", "blurAmount", "", "mapBlurTint$blur_release", "mapRadius", "radius", "maxRadius", "minRadius", "mapRadius$blur_release", "updateListener", "", "blurTargetChangeListener", "Lkotlin/Function0;", "attached", "", "maybeUpdate", "updateListener$blur_release", "blur_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static  float mapRadius$blur_release$default(Companion companion, float f10, float f11, float f12, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                f11 = 24.0f;
            }
            if ((i10 & 4) != 0) {
                f12 = 0.0f;
            }
            return companion.mapRadius$blur_release(f10, f11, f12);
        }

        public final int mapBlurTint$blur_release(int i10, int i11, float f10) {
            return androidx.core.graphics.a.g(i11, ColorUtilsKt.argbWithAdjustedAlpha(i10, f10));
        }

        public final float mapRadius$blur_release(float f10, float f11, float f12) {
            return Math.max(f12, Math.min(1.0f, f10)) * f11;
        }

        public final void updateListener$blur_release(Function0<Unit> blurTargetChangeListener, boolean z10, Function0<Unit> maybeUpdate) {
            q.h(blurTargetChangeListener, "blurTargetChangeListener");
            q.h(maybeUpdate, "maybeUpdate");
            if (z10) {
                BlurViewTargetRegistry.INSTANCE.addChangeListener(blurTargetChangeListener);
            } else {
                BlurViewTargetRegistry.INSTANCE.removeChangeListener(blurTargetChangeListener);
            }
            if (z10) {
                maybeUpdate.invoke();
            }
        }
    }

    
    public BlurView(Context context, String blurTargetNativeId, int i10, int i11, float f10) {
        super(context);
        q.h(context, "context");
        q.h(blurTargetNativeId, "blurTargetNativeId");
        this.blurTargetNativeId = blurTargetNativeId;
        this.blurTint = i10;
        this.blurTintIOSParityCompensation = i11;
        this.blurAmount = f10;
        BlurView$blurTargetChangeListener$1 blurView$blurTargetChangeListener$1 = new BlurView$blurTargetChangeListener$1(this);
        this.blurTargetChangeListener = blurView$blurTargetChangeListener$1;
        Companion.updateListener$blur_release(blurView$blurTargetChangeListener$1, true, new AnonymousClass1());
    }

    public static final  void access$maybeUpdate(BlurView blurView) {
        blurView.maybeUpdate();
    }

    
    public final void maybeUpdate() {
        ViewGroup viewRef;
        BlurViewAPI.Target target = BlurViewTargetRegistry.INSTANCE.get(this.blurTargetNativeId);
        if (target != null && this.blurViewPropertiesDirty) {
            if (!q.c(this.blurTarget.get(), target)) {
                this.blurTarget = new WeakReference<>(target);
                setupWith(target.getViewRef()).d(target.getViewRef().getBackground());
            }
            maybeUpdateBlurEnabled();
            Companion companion = Companion;
            setOverlayColor(companion.mapBlurTint$blur_release(this.blurTintIOSParityCompensation, this.blurTint, this.blurAmount));
            setBlurRadius(Companion.mapRadius$blur_release$default(companion, this.blurAmount, 0.0f, 0.0f, 6, null));
            BlurViewAPI.Target target2 = this.blurTarget.get();
            if (!(target2 == null || (viewRef = target2.getViewRef()) == null)) {
                viewRef.invalidate();
            }
            invalidate();
            this.blurViewPropertiesDirty = false;
        }
    }

    private final void maybeUpdateBlurEnabled() {
        boolean z10 = this.blurEnabled;
        if (z10 && this.blurAmount <= 0.0f) {
            this.blurEnabled = false;
            setBlurEnabled(false);
        } else if (!z10 && this.blurAmount > 0.0f) {
            this.blurEnabled = true;
            setBlurEnabled(true);
        }
    }

    @Override 
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Companion.updateListener$blur_release(this.blurTargetChangeListener, true, new BlurView$onAttachedToWindow$1(this));
    }

    @Override 
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Companion.updateListener$blur_release(this.blurTargetChangeListener, false, new BlurView$onDetachedFromWindow$1(this));
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
