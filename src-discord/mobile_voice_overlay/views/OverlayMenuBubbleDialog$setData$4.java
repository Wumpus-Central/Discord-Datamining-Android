package com.discord.mobile_voice_overlay.views;

import android.content.Context;
import android.content.Intent;
import androidx.core.os.d;
import com.discord.mobile_voice_overlay.MobileVoiceOverlay;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData;
import com.discord.react_activities.ReactActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import nf.x;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class OverlayMenuBubbleDialog$setData$4 extends s implements Function0<Unit> {
    final /* synthetic */ MobileVoiceOverlayData $data;
    final /* synthetic */ OverlayMenuBubbleDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayMenuBubbleDialog$setData$4(OverlayMenuBubbleDialog overlayMenuBubbleDialog, MobileVoiceOverlayData mobileVoiceOverlayData) {
        super(0);
        this.this$0 = overlayMenuBubbleDialog;
        this.$data = mobileVoiceOverlayData;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Context context = this.this$0.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", null, this.this$0.getContext(), ReactActivity.Registry.getMainActivity());
        intent.addCategory("android.intent.category.HOME");
        intent.addFlags(268435456);
        context.startActivity(intent);
        MobileVoiceOverlay.Companion companion = MobileVoiceOverlay.Companion;
        Context context2 = this.this$0.getContext();
        q.f(context2, "context");
        companion.startHeadlessTask(context2, "SelectChannel", d.a(x.a("channelId", String.valueOf(this.$data.m454getChannelIdo4g7jtM()))));
    }
}
