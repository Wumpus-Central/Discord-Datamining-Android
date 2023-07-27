package com.discord.media_player;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class MediaPlayer$volumeListener$1 extends s implements Function1<Float, Unit> {
    public static final MediaPlayer$volumeListener$1 INSTANCE = new MediaPlayer$volumeListener$1();

    MediaPlayer$volumeListener$1() {
        super(1);
    }

    @Override 
    public   Unit invoke(Float f10) {
        invoke(f10.floatValue());
        return Unit.f20666a;
    }

    public final void invoke(float f10) {
    }
}
