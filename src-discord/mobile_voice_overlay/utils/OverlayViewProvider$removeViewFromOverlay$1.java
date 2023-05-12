package com.discord.mobile_voice_overlay.utils;

import com.discord.mobile_voice_overlay.views.OverlayView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "Lcom/discord/mobile_voice_overlay/views/OverlayView;", "v", "invoke", "(Lcom/discord/mobile_voice_overlay/views/OverlayView;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class OverlayViewProvider$removeViewFromOverlay$1 extends s implements Function1<T, Unit> {
    public static final OverlayViewProvider$removeViewFromOverlay$1 INSTANCE = new OverlayViewProvider$removeViewFromOverlay$1();

    OverlayViewProvider$removeViewFromOverlay$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((OverlayView) obj);
        return Unit.f22036a;
    }

    /* JADX WARN: Incorrect types in method signature: (TT;)V */
    public final void invoke(OverlayView v10) {
        q.g(v10, "v");
        v10.removeFromWindowManager();
    }
}
