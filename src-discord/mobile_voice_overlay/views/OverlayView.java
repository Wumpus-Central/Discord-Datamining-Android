package com.discord.mobile_voice_overlay.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0013\u001a\u00020\u0014H&J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\fH\u0004J\u0006\u0010\u0018\u001a\u00020\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u000eH\u0017J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH&R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/discord/mobile_voice_overlay/views/OverlayView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attributeSetId", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "managedByWindow", "", "overlayAssets", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;", "getOverlayAssets", "()Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;", "setOverlayAssets", "(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;)V", "getInitialLayoutParams", "Landroid/view/WindowManager$LayoutParams;", "initializeWithWindowManager", "", "isManagedByWindow", "removeFromWindowManager", "setAssets", "assets", "setData", "data", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "mobile_voice_overlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class OverlayView extends FrameLayout {
    private boolean managedByWindow;
    private MobileVoiceOverlayAssets overlayAssets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayView(Context context) {
        super(context);
        q.g(context, "context");
    }

    public abstract WindowManager.LayoutParams getInitialLayoutParams();

    /* JADX INFO: Access modifiers changed from: protected */
    public final MobileVoiceOverlayAssets getOverlayAssets() {
        return this.overlayAssets;
    }

    public final void initializeWithWindowManager() {
        Object systemService = getContext().getSystemService("window");
        q.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).addView(this, getInitialLayoutParams());
        this.managedByWindow = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean isManagedByWindow() {
        return this.managedByWindow;
    }

    public final void removeFromWindowManager() {
        Object systemService = getContext().getSystemService("window");
        q.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).removeView(this);
        this.managedByWindow = false;
    }

    public void setAssets(MobileVoiceOverlayAssets assets) {
        q.g(assets, "assets");
        this.overlayAssets = assets;
    }

    public abstract void setData(MobileVoiceOverlayData mobileVoiceOverlayData);

    protected final void setOverlayAssets(MobileVoiceOverlayAssets mobileVoiceOverlayAssets) {
        this.overlayAssets = mobileVoiceOverlayAssets;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.g(context, "context");
    }
}
