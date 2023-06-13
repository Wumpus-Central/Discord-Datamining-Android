package com.discord.mobile_voice_overlay.views;

import android.content.Context;
import com.discord.mobile_voice_overlay.MobileVoiceOverlay;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class OverlayMenuBubbleDialog$setData$6 extends s implements Function0<Unit> {
    final /* synthetic */ OverlayMenuBubbleDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayMenuBubbleDialog$setData$6(OverlayMenuBubbleDialog overlayMenuBubbleDialog) {
        super(0);
        this.this$0 = overlayMenuBubbleDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MobileVoiceOverlay.Companion companion = MobileVoiceOverlay.Companion;
        Context context = this.this$0.getContext();
        q.f(context, "context");
        MobileVoiceOverlay.Companion.startHeadlessTask$default(companion, context, "ToggleSelfMute", null, 4, null);
    }
}
