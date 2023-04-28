package com.discord.media.utils;

import android.content.ContentResolver;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9636e;
import kotlin.coroutines.jvm.internal.AbstractC9643k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nf.C10848t;
import tf.C12962d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/net/Uri;", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9636e(m14702c = "com.discord.media.utils.MediaResolver$resolveToUri$2", m14701f = "MediaResolver.kt", m14700l = {57, 60, 61, 62}, m14699m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MediaResolver$resolveToUri$2 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Uri>, Object> {
    final /* synthetic */ int $imageCompressionQuality;
    final /* synthetic */ Uri $inputUri;
    final /* synthetic */ boolean $isLowQuality;
    final /* synthetic */ VideoCompressionQuality $videoCompressionQuality;
    int label;
    final /* synthetic */ MediaResolver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaResolver$resolveToUri$2(MediaResolver mediaResolver, Uri uri, VideoCompressionQuality videoCompressionQuality, int i, boolean z, Continuation<? super MediaResolver$resolveToUri$2> continuation) {
        super(2, continuation);
        this.this$0 = mediaResolver;
        this.$inputUri = uri;
        this.$videoCompressionQuality = videoCompressionQuality;
        this.$imageCompressionQuality = i;
        this.$isLowQuality = z;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaResolver$resolveToUri$2(this.this$0, this.$inputUri, this.$videoCompressionQuality, this.$imageCompressionQuality, this.$isLowQuality, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Uri> continuation) {
        return ((MediaResolver$resolveToUri$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Object invokeSuspend(Object obj) {
        Object d;
        ContentResolver resolver;
        ContentResolver resolver2;
        Object checkFreeSpace;
        d = C12962d.m4646d();
        int i = this.label;
        if (i == 0) {
            C10848t.m10930b(obj);
            MediaResolver mediaResolver = this.this$0;
            this.label = 1;
            checkFreeSpace = mediaResolver.checkFreeSpace(this);
            if (checkFreeSpace == d) {
                return d;
            }
        } else if (i == 1) {
            C10848t.m10930b(obj);
        } else if (i == 2) {
            C10848t.m10930b(obj);
            return (Uri) obj;
        } else if (i == 3) {
            C10848t.m10930b(obj);
            return (Uri) obj;
        } else if (i == 4) {
            C10848t.m10930b(obj);
            return (Uri) obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ContentResolverUtils contentResolverUtils = ContentResolverUtils.INSTANCE;
        resolver = this.this$0.getResolver();
        if (contentResolverUtils.isVideo(resolver, this.$inputUri)) {
            MediaResolver mediaResolver2 = this.this$0;
            Uri uri = this.$inputUri;
            VideoCompressionQuality videoCompressionQuality = this.$videoCompressionQuality;
            this.label = 2;
            obj = mediaResolver2.handleVideo(uri, videoCompressionQuality, this);
            if (obj == d) {
                return d;
            }
            return (Uri) obj;
        }
        resolver2 = this.this$0.getResolver();
        if (contentResolverUtils.isImage(resolver2, this.$inputUri)) {
            MediaResolver mediaResolver3 = this.this$0;
            Uri uri2 = this.$inputUri;
            int i2 = this.$imageCompressionQuality;
            boolean z = this.$isLowQuality;
            this.label = 3;
            obj = mediaResolver3.handleImage(uri2, i2, z, this);
            if (obj == d) {
                return d;
            }
            return (Uri) obj;
        }
        MediaResolver mediaResolver4 = this.this$0;
        Uri uri3 = this.$inputUri;
        this.label = 4;
        obj = MediaResolver.copyToFile$default(mediaResolver4, uri3, null, this, 2, null);
        if (obj == d) {
            return d;
        }
        return (Uri) obj;
    }
}
