package com.discord.media.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;


@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.discord.media.utils.MediaResolver", f = "MediaResolver.kt", l = {104, 113, 121, 124}, m = "handleVideo")

public final class MediaResolver$handleVideo$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
     Object result;
    final  MediaResolver this$0;

    
    
    public MediaResolver$handleVideo$1(MediaResolver mediaResolver, Continuation<? super MediaResolver$handleVideo$1> continuation) {
        super(continuation);
        this.this$0 = mediaResolver;
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        Object handleVideo;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleVideo = this.this$0.handleVideo(null, null, this);
        return handleVideo;
    }
}
