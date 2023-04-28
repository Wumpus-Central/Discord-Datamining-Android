package com.discord.media.engine;

import com.discord.media.engine.MediaEngine;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9930d;
import kotlin.coroutines.jvm.internal.AbstractC9931e;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
@AbstractC9931e(m14702c = "com.discord.media.engine.MediaEngine$Companion", m14701f = "MediaEngine.kt", m14700l = {711, 714}, m14699m = "encodeThumbnail")
/* loaded from: classes5.dex */
public final class MediaEngine$Companion$encodeThumbnail$1 extends AbstractC9930d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MediaEngine.Companion this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaEngine$Companion$encodeThumbnail$1(MediaEngine.Companion companion, Continuation<? super MediaEngine$Companion$encodeThumbnail$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Object invokeSuspend(Object obj) {
        Object encodeThumbnail;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        encodeThumbnail = this.this$0.encodeThumbnail(null, this);
        return encodeThumbnail;
    }
}
