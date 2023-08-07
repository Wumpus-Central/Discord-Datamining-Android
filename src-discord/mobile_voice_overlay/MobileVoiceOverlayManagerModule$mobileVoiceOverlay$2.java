package com.discord.mobile_voice_overlay;

import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class MobileVoiceOverlayManagerModule$mobileVoiceOverlay$2 extends s implements Function0<MobileVoiceOverlay> {
    final  MobileVoiceOverlayManagerModule this$0;

    
    
    public MobileVoiceOverlayManagerModule$mobileVoiceOverlay$2(MobileVoiceOverlayManagerModule mobileVoiceOverlayManagerModule) {
        super(0);
        this.this$0 = mobileVoiceOverlayManagerModule;
    }

    
    @Override 
    public final MobileVoiceOverlay invoke() {
        ReactApplicationContext reactApplicationContext;
        reactApplicationContext = this.this$0.getReactApplicationContext();
        q.g(reactApplicationContext, "reactApplicationContext");
        return new MobileVoiceOverlay(reactApplicationContext);
    }
}
