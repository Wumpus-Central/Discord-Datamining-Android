package com.discord.blur;

import android.content.Context;
import android.view.ViewGroup;
import com.discord.blur.BlurViewAPI;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0010H\u0014J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/discord/blur/BlurViewTargetBase;", "Lcom/facebook/react/views/view/ReactViewGroup;", "Lcom/discord/blur/BlurViewAPI$Target;", "context", "Landroid/content/Context;", "blurTargetNativeId", "", "(Landroid/content/Context;Ljava/lang/String;)V", "self", "getSelf", "()Lcom/discord/blur/BlurViewAPI$Target;", "viewRef", "Landroid/view/ViewGroup;", "getViewRef", "()Landroid/view/ViewGroup;", "onAttachedToWindow", "", "onDetachedFromWindow", "setBlurTargetNativeId", "nativeId", "blur_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public abstract class BlurViewTargetBase extends ReactViewGroup implements BlurViewAPI.Target {
    private String blurTargetNativeId;

    
    public BlurViewTargetBase(Context context, String blurTargetNativeId) {
        super(context);
        q.h(context, "context");
        q.h(blurTargetNativeId, "blurTargetNativeId");
        this.blurTargetNativeId = blurTargetNativeId;
        BlurViewTargetRegistry.INSTANCE.add(blurTargetNativeId, getSelf());
    }

    private final BlurViewAPI.Target getSelf() {
        return this;
    }

    @Override 
    public ViewGroup getViewRef() {
        return this;
    }

    
    @Override 
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        BlurViewTargetRegistry.INSTANCE.add(this.blurTargetNativeId, getSelf());
    }

    @Override 
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BlurViewTargetRegistry.INSTANCE.remove(this.blurTargetNativeId);
    }

    @Override 
    public void setBlurTargetNativeId(String nativeId) {
        q.h(nativeId, "nativeId");
        if (!q.c(this.blurTargetNativeId, nativeId)) {
            this.blurTargetNativeId = nativeId;
            BlurViewTargetRegistry.INSTANCE.add(nativeId, getSelf());
        }
    }
}
