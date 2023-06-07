package com.discord.image.fresco.listeners;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010\u0011\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/discord/image/fresco/listeners/BackgroundManagingControllerListener;", "Lcom/discord/image/fresco/listeners/ControllerListener;", "draweeView", "Lcom/facebook/drawee/view/SimpleDraweeView;", AppStateModule.APP_STATE_BACKGROUND, "Landroid/graphics/drawable/Drawable;", "showDuringRequest", "", "showAfterSuccess", "showAfterFail", "(Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/graphics/drawable/Drawable;ZZZ)V", "onFailure", "", "id", "", "throwable", "", "onFinalImageSet", "imageInfo", "", "animatable", "Landroid/graphics/drawable/Animatable;", "onSubmit", "callerContext", "showBackgroundBy", "condition", "fresco_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BackgroundManagingControllerListener extends ControllerListener {
    private final Drawable background;
    private final SimpleDraweeView draweeView;
    private final boolean showAfterFail;
    private final boolean showAfterSuccess;
    private final boolean showDuringRequest;

    public /* synthetic */ BackgroundManagingControllerListener(SimpleDraweeView simpleDraweeView, Drawable drawable, boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(simpleDraweeView, drawable, (i10 & 4) != 0 ? true : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? true : z12);
    }

    private final void showBackgroundBy(boolean z10) {
        if (z10) {
            this.draweeView.getHierarchy().u(this.background);
        } else {
            this.draweeView.getHierarchy().u(null);
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

    public BackgroundManagingControllerListener(SimpleDraweeView draweeView, Drawable background, boolean z10, boolean z11, boolean z12) {
        q.g(draweeView, "draweeView");
        q.g(background, "background");
        this.draweeView = draweeView;
        this.background = background;
        this.showDuringRequest = z10;
        this.showAfterSuccess = z11;
        this.showAfterFail = z12;
    }
}
