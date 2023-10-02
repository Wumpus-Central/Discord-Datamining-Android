package com.discord.mobile_voice_overlay;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "text", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class MobileVoiceOverlay$selectorDialogProvider$1$1$2 extends s implements Function1<String, Unit> {
    final  MobileVoiceOverlay this$0;

    
    
    public MobileVoiceOverlay$selectorDialogProvider$1$1$2(MobileVoiceOverlay mobileVoiceOverlay) {
        super(1);
        this.this$0 = mobileVoiceOverlay;
    }

    @Override 
    public   Unit invoke(String str) {
        invoke2(str);
        return Unit.f21601a;
    }

    
    public final void invoke2(String text) {
        q.h(text, "text");
        this.this$0.invokeJs("onChannelQueryUpdate", text);
    }
}
