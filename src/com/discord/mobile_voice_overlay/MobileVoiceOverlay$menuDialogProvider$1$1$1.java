package com.discord.mobile_voice_overlay;

import com.discord.mobile_voice_overlay.views.OverlayDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "it", "Lcom/discord/mobile_voice_overlay/views/OverlayDialog;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
final class MobileVoiceOverlay$menuDialogProvider$1$1$1 extends AbstractC9679s implements Function1<OverlayDialog, Unit> {
    final /* synthetic */ MobileVoiceOverlay this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileVoiceOverlay$menuDialogProvider$1$1$1(MobileVoiceOverlay mobileVoiceOverlay) {
        super(1);
        this.this$0 = mobileVoiceOverlay;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OverlayDialog overlayDialog) {
        invoke2(overlayDialog);
        return Unit.f25780a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OverlayDialog it) {
        C9677q.m14633g(it, "it");
        this.this$0.closeMenuDialog();
    }
}
