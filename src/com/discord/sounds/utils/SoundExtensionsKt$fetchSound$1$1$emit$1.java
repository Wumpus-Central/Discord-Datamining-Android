package com.discord.sounds.utils;

import com.discord.file_downloader.DownloadState;
import com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9930d;
import kotlin.coroutines.jvm.internal.AbstractC9931e;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
@AbstractC9931e(m14702c = "com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1", m14701f = "SoundExtensions.kt", m14700l = {47, 57, 63}, m14699m = "emit")
/* loaded from: classes7.dex */
public final class SoundExtensionsKt$fetchSound$1$1$emit$1 extends AbstractC9930d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SoundExtensionsKt$fetchSound$1.AnonymousClass1<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SoundExtensionsKt$fetchSound$1$1$emit$1(SoundExtensionsKt$fetchSound$1.AnonymousClass1<? super T> r1, Continuation<? super SoundExtensionsKt$fetchSound$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = r1;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((DownloadState) null, (Continuation<? super Unit>) this);
    }
}
