package com.discord.media.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;


@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.discord.media.utils.MediaResolver", f = "MediaResolver.kt", l = {139, 145}, m = "handleImage")

public final class MediaResolver$handleImage$1 extends d {
    Object L$0;
    Object L$1;
    int label;
     Object result;
    final  MediaResolver this$0;

    
    
    public MediaResolver$handleImage$1(MediaResolver mediaResolver, Continuation<? super MediaResolver$handleImage$1> continuation) {
        super(continuation);
        this.this$0 = mediaResolver;
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        Object handleImage;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleImage = this.this$0.handleImage(null, 0, false, this);
        return handleImage;
    }
}
