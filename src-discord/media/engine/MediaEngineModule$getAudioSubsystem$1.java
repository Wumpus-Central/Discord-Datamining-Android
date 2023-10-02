package com.discord.media.engine;

import com.facebook.react.bridge.Callback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "subsystem", "", "audioLayer", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class MediaEngineModule$getAudioSubsystem$1 extends s implements Function2<String, String, Unit> {
    final  Callback $callback;

    
    
    public MediaEngineModule$getAudioSubsystem$1(Callback callback) {
        super(2);
        this.$callback = callback;
    }

    @Override 
    public   Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.f21601a;
    }

    
    public final void invoke2(String subsystem, String audioLayer) {
        q.h(subsystem, "subsystem");
        q.h(audioLayer, "audioLayer");
        this.$callback.invoke(subsystem, audioLayer);
    }
}
