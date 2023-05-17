package com.discord.image.fresco.listeners;

import android.graphics.drawable.Animatable;
import com.facebook.drawee.controller.ControllerListener;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B)\u0012\"\u0010\u0003\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0004\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\u0002\u0010\u0005J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J&\u0010\u000e\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u0013\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0014\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\u0015\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016R \u0010\u0006\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/discord/image/fresco/listeners/CompoundControllerListener;", "Lcom/facebook/drawee/controller/ControllerListener;", "", "listeners", "", "([Lcom/facebook/drawee/controller/ControllerListener;)V", "_listeners", "[Lcom/facebook/drawee/controller/ControllerListener;", "onFailure", "", "id", "", "throwable", "", "onFinalImageSet", "imageInfo", "animatable", "Landroid/graphics/drawable/Animatable;", "onIntermediateImageFailed", "onIntermediateImageSet", "onRelease", "onSubmit", "callerContext", "fresco_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CompoundControllerListener implements ControllerListener<Object> {
    private final ControllerListener<Object>[] _listeners;

    public CompoundControllerListener(ControllerListener<Object>... listeners) {
        q.g(listeners, "listeners");
        this._listeners = listeners;
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onFailure(String str, Throwable th2) {
        for (ControllerListener<Object> controllerListener : this._listeners) {
            controllerListener.onFailure(str, th2);
        }
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onFinalImageSet(String str, Object obj, Animatable animatable) {
        for (ControllerListener<Object> controllerListener : this._listeners) {
            controllerListener.onFinalImageSet(str, obj, animatable);
        }
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onIntermediateImageFailed(String str, Throwable th2) {
        for (ControllerListener<Object> controllerListener : this._listeners) {
            controllerListener.onIntermediateImageFailed(str, th2);
        }
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onIntermediateImageSet(String str, Object obj) {
        for (ControllerListener<Object> controllerListener : this._listeners) {
            controllerListener.onIntermediateImageSet(str, obj);
        }
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onRelease(String str) {
        for (ControllerListener<Object> controllerListener : this._listeners) {
            controllerListener.onRelease(str);
        }
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onSubmit(String str, Object obj) {
        for (ControllerListener<Object> controllerListener : this._listeners) {
            controllerListener.onSubmit(str, obj);
        }
    }
}
