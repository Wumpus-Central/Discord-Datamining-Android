package com.discord.blur;

import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J0\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¨\u0006\u0013"}, d2 = {"Lcom/discord/blur/BlurViewTarget;", "Lcom/discord/blur/BlurViewTargetBase;", "context", "Landroid/content/Context;", "blurTargetNativeId", "", "(Landroid/content/Context;Ljava/lang/String;)V", "addBlurRect", "", "rectId", "", "windowX", "windowY", "width", "height", "removeBlurRect", "setBlurAmount", "blurAmount", "", "blur_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})

public final class BlurViewTarget extends BlurViewTargetBase {
    
    public BlurViewTarget(Context context, String blurTargetNativeId) {
        super(context, blurTargetNativeId);
        q.h(context, "context");
        q.h(blurTargetNativeId, "blurTargetNativeId");
    }

    @Override 
    public void addBlurRect(int i10, int i11, int i12, int i13, int i14) {
    }

    @Override 
    public void removeBlurRect(int i10) {
    }

    @Override 
    public void setBlurAmount(int i10, float f10) {
    }
}
