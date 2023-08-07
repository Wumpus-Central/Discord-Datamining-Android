package com.discord.mobile_voice_overlay;

import com.discord.mobile_voice_overlay.utils.OverlayViewProvider;
import com.discord.mobile_voice_overlay.views.OverlayTrashWrap;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/discord/mobile_voice_overlay/views/OverlayTrashWrap;", "it", "Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class MobileVoiceOverlay$trashWrapProvider$1 extends s implements Function1<OverlayViewProvider<OverlayTrashWrap>, OverlayTrashWrap> {
    final  MobileVoiceOverlay this$0;

    
    
    public MobileVoiceOverlay$trashWrapProvider$1(MobileVoiceOverlay mobileVoiceOverlay) {
        super(1);
        this.this$0 = mobileVoiceOverlay;
    }

    public final OverlayTrashWrap invoke(OverlayViewProvider<OverlayTrashWrap> it) {
        ReactApplicationContext reactApplicationContext;
        q.h(it, "it");
        reactApplicationContext = this.this$0.context;
        return new OverlayTrashWrap(reactApplicationContext);
    }
}
