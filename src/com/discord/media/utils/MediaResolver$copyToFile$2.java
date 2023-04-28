package com.discord.media.utils;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9636e;
import kotlin.coroutines.jvm.internal.AbstractC9643k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9677q;
import kotlinx.coroutines.CoroutineScope;
import nf.C10848t;
import tf.C12962d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/net/Uri;", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9636e(m14702c = "com.discord.media.utils.MediaResolver$copyToFile$2", m14701f = "MediaResolver.kt", m14700l = {}, m14699m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MediaResolver$copyToFile$2 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Uri>, Object> {
    final /* synthetic */ File $targetFile;
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ MediaResolver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaResolver$copyToFile$2(File file, MediaResolver mediaResolver, Uri uri, Continuation<? super MediaResolver$copyToFile$2> continuation) {
        super(2, continuation);
        this.$targetFile = file;
        this.this$0 = mediaResolver;
        this.$uri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaResolver$copyToFile$2(this.$targetFile, this.this$0, this.$uri, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Uri> continuation) {
        return ((MediaResolver$copyToFile$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Object invokeSuspend(Object obj) {
        ContentResolver resolver;
        ContentResolver resolver2;
        C12962d.m4646d();
        if (this.label == 0) {
            C10848t.m10930b(obj);
            File file = this.$targetFile;
            if (file == null) {
                ContentResolverUtils contentResolverUtils = ContentResolverUtils.INSTANCE;
                resolver2 = this.this$0.getResolver();
                file = ContentResolverUtils.createTempFile$default(contentResolverUtils, resolver2, this.$uri, null, null, 6, null);
            }
            MediaResolver mediaResolver = this.this$0;
            Uri uri = this.$uri;
            resolver = mediaResolver.getResolver();
            InputStream inputStream = resolver.openInputStream(uri);
            if (inputStream != null) {
                try {
                    C9677q.m14634f(inputStream, "inputStream");
                    FileUtilsKt.writeTo(inputStream, file);
                    Unit unit = Unit.f25780a;
                    th = null;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            Uri fromFile = Uri.fromFile(file);
            C9677q.m14634f(fromFile, "fromFile(this)");
            return fromFile;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
