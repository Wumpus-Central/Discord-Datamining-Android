package com.discord.media.utils;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class Transcoder$convertCompress$3$3 extends s implements Function1<Throwable, Unit> {
    final  String $requestId;

    
    
    public Transcoder$convertCompress$3$3(String str) {
        super(1);
        this.$requestId = str;
    }

    @Override 
    public   Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f20670a;
    }

    
    public final void invoke2(Throwable th2) {
        Transcoder.INSTANCE.cancel(this.$requestId);
    }
}
