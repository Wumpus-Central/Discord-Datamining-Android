package com.discord.mobile_voice_overlay.utils;

import com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData;
import com.discord.mobile_voice_overlay.views.OverlayView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u001f\u0012\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u0015\u001a\u00020\u0012H\u0007J\u001c\u0010\u0016\u001a\u00020\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u0005H\u0007J\u001c\u0010\u0018\u001a\u00020\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u0005H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;", "T", "Lcom/discord/mobile_voice_overlay/views/OverlayView;", "", "initializer", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)V", "assets", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;", "data", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "view", "Lcom/discord/mobile_voice_overlay/views/OverlayView;", "ensureView", "()Lcom/discord/mobile_voice_overlay/views/OverlayView;", "isInOverlay", "", "removeViewFromOverlay", "", "setAssets", "setData", "showViewOnOverlay", "withView", "operation", "withViewOptional", "mobile_voice_overlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OverlayViewProvider<T extends OverlayView> {
    private MobileVoiceOverlayAssets assets;
    private MobileVoiceOverlayData data;
    private final Function1<OverlayViewProvider<T>, T> initializer;
    private T view;

    /* JADX WARN: Multi-variable type inference failed */
    public OverlayViewProvider(Function1<? super OverlayViewProvider<T>, ? extends T> initializer) {
        q.g(initializer, "initializer");
        this.initializer = initializer;
    }

    private final T ensureView() {
        T t10 = this.view;
        if (t10 != null) {
            return t10;
        }
        T invoke = this.initializer.invoke(this);
        MobileVoiceOverlayAssets mobileVoiceOverlayAssets = this.assets;
        if (mobileVoiceOverlayAssets == null) {
            q.y("assets");
            mobileVoiceOverlayAssets = null;
        }
        invoke.setAssets(mobileVoiceOverlayAssets);
        invoke.initializeWithWindowManager();
        MobileVoiceOverlayData mobileVoiceOverlayData = this.data;
        if (mobileVoiceOverlayData != null) {
            invoke.setData(mobileVoiceOverlayData);
        }
        this.view = invoke;
        return invoke;
    }

    private final void withViewOptional(Function1<? super T, Unit> function1) {
        T t10 = this.view;
        if (t10 != null) {
            function1.invoke(t10);
        }
    }

    public final boolean isInOverlay() {
        return this.view != null;
    }

    public final void removeViewFromOverlay() {
        withViewOptional(OverlayViewProvider$removeViewFromOverlay$1.INSTANCE);
        this.view = null;
    }

    public final void setAssets(MobileVoiceOverlayAssets assets) {
        q.g(assets, "assets");
        this.assets = assets;
        withViewOptional(new OverlayViewProvider$setAssets$1(assets));
    }

    public final void setData(MobileVoiceOverlayData data) {
        q.g(data, "data");
        this.data = data;
        withViewOptional(new OverlayViewProvider$setData$1(data));
    }

    public final void showViewOnOverlay() {
        ensureView();
    }

    public final void withView(Function1<? super T, Unit> operation) {
        q.g(operation, "operation");
        operation.invoke(ensureView());
    }
}
