package com.discord.media.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9930d;
import kotlin.coroutines.jvm.internal.AbstractC9931e;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
@AbstractC9931e(m14702c = "com.discord.media.utils.MediaResolver", m14701f = "MediaResolver.kt", m14700l = {139, 145}, m14699m = "handleImage")
/* loaded from: classes5.dex */
public final class MediaResolver$handleImage$1 extends AbstractC9930d {
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

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Object invokeSuspend(Object obj) {
        Object handleImage;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleImage = this.this$0.handleImage(null, 0, false, this);
        return handleImage;
    }
}
