package com.discord.mobile_voice_overlay;

import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m15073d2 = {"<anonymous>", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class MobileVoiceOverlayManagerModule$mobileVoiceOverlay$2 extends AbstractC9973s implements Function0<MobileVoiceOverlay> {
    final /* synthetic */ MobileVoiceOverlayManagerModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileVoiceOverlayManagerModule$mobileVoiceOverlay$2(MobileVoiceOverlayManagerModule mobileVoiceOverlayManagerModule) {
        super(0);
        this.this$0 = mobileVoiceOverlayManagerModule;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final MobileVoiceOverlay invoke() {
        ReactApplicationContext reactApplicationContext;
        reactApplicationContext = this.this$0.getReactApplicationContext();
        C9971q.m14634f(reactApplicationContext, "reactApplicationContext");
        return new MobileVoiceOverlay(reactApplicationContext);
    }
}
