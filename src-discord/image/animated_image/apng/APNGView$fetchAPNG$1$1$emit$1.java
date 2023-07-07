package com.discord.image.animated_image.apng;

import com.discord.file_downloader.DownloadState;
import com.discord.image.animated_image.apng.APNGView$fetchAPNG$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1", f = "APNGView.kt", l = {91, 101, 107}, m = "emit")
/* loaded from: classes6.dex */
public final class APNGView$fetchAPNG$1$1$emit$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ APNGView$fetchAPNG$1.AnonymousClass1<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public APNGView$fetchAPNG$1$1$emit$1(APNGView$fetchAPNG$1.AnonymousClass1<? super T> r12, Continuation<? super APNGView$fetchAPNG$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = r12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((DownloadState) null, (Continuation<? super Unit>) this);
    }
}
