package com.discord.media.engine;

import com.discord.media.engine.MediaEngine;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;


@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.discord.media.engine.MediaEngine$Companion", f = "MediaEngine.kt", l = {729, 732}, m = "encodeThumbnail")

public final class MediaEngine$Companion$encodeThumbnail$1 extends d {
    Object L$0;
    int label;
     Object result;
    final  MediaEngine.Companion this$0;

    
    
    public MediaEngine$Companion$encodeThumbnail$1(MediaEngine.Companion companion, Continuation<? super MediaEngine$Companion$encodeThumbnail$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        Object encodeThumbnail;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        encodeThumbnail = this.this$0.encodeThumbnail(null, this);
        return encodeThumbnail;
    }
}
