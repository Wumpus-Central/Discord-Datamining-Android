package com.discord.media.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.discord.media.utils.MediaResolver", f = "MediaResolver.kt", l = {139, 145}, m = "handleImage")
/* loaded from: classes8.dex */
public final class MediaResolver$handleImage$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MediaResolver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaResolver$handleImage$1(MediaResolver mediaResolver, Continuation<? super MediaResolver$handleImage$1> continuation) {
        super(continuation);
        this.this$0 = mediaResolver;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object handleImage;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleImage = this.this$0.handleImage(null, 0, false, this);
        return handleImage;
    }
}
