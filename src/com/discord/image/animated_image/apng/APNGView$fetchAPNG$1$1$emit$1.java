package com.discord.image.animated_image.apng;

import com.discord.file_downloader.DownloadState;
import com.discord.image.animated_image.apng.APNGView$fetchAPNG$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9635d;
import kotlin.coroutines.jvm.internal.AbstractC9636e;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
@AbstractC9636e(m14702c = "com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1", m14701f = "APNGView.kt", m14700l = {91, 101, 107}, m14699m = "emit")
/* loaded from: classes5.dex */
public final class APNGView$fetchAPNG$1$1$emit$1 extends AbstractC9635d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ APNGView$fetchAPNG$1.C34131<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public APNGView$fetchAPNG$1$1$emit$1(APNGView$fetchAPNG$1.C34131<? super T> r1, Continuation<? super APNGView$fetchAPNG$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = r1;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((DownloadState) null, (Continuation<? super Unit>) this);
    }
}
