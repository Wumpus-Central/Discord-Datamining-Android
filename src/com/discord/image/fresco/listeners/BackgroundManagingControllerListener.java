package com.discord.image.fresco.listeners;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010\u0011\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m15073d2 = {"Lcom/discord/image/fresco/listeners/BackgroundManagingControllerListener;", "Lcom/discord/image/fresco/listeners/ControllerListener;", "draweeView", "Lcom/facebook/drawee/view/SimpleDraweeView;", AppStateModule.APP_STATE_BACKGROUND, "Landroid/graphics/drawable/Drawable;", "showDuringRequest", "", "showAfterSuccess", "showAfterFail", "(Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/graphics/drawable/Drawable;ZZZ)V", "onFailure", "", "id", "", "throwable", "", "onFinalImageSet", "imageInfo", "", "animatable", "Landroid/graphics/drawable/Animatable;", "onSubmit", "callerContext", "showBackgroundBy", "condition", "fresco_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class BackgroundManagingControllerListener extends ControllerListener {
    private final Drawable background;
    private final SimpleDraweeView draweeView;
    private final boolean showAfterFail;
    private final boolean showAfterSuccess;
    private final boolean showDuringRequest;

    public /* synthetic */ BackgroundManagingControllerListener(SimpleDraweeView simpleDraweeView, Drawable drawable, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(simpleDraweeView, drawable, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? true : z3);
    }

    private final void showBackgroundBy(boolean z) {
        if (z) {
            this.draweeView.getHierarchy().m31773u(this.background);
        } else {
            this.draweeView.getHierarchy().m31773u(null);
        }
    }

    @Override // com.discord.image.fresco.listeners.ControllerListener, com.facebook.drawee.controller.ControllerListener
    public void onFailure(String str, Throwable th2) {
        showBackgroundBy(this.showAfterFail);
    }

    @Override // com.discord.image.fresco.listeners.ControllerListener, com.facebook.drawee.controller.ControllerListener
    public void onFinalImageSet(String str, Object obj, Animatable animatable) {
        showBackgroundBy(this.showAfterSuccess);
    }

    @Override // com.discord.image.fresco.listeners.ControllerListener, com.facebook.drawee.controller.ControllerListener
    public void onSubmit(String str, Object obj) {
        showBackgroundBy(this.showDuringRequest);
    }

    public BackgroundManagingControllerListener(SimpleDraweeView draweeView, Drawable background, boolean z, boolean z2, boolean z3) {
        C9677q.m14633g(draweeView, "draweeView");
        C9677q.m14633g(background, "background");
        this.draweeView = draweeView;
        this.background = background;
        this.showDuringRequest = z;
        this.showAfterSuccess = z2;
        this.showAfterFail = z3;
    }
}
