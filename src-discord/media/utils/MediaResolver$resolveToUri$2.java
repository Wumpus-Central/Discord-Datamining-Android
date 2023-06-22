package com.discord.media.utils;

import android.content.ContentResolver;
import android.net.Uri;
import kg.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qg.d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/net/Uri;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.media.utils.MediaResolver$resolveToUri$2", f = "MediaResolver.kt", l = {57, 60, 61, 62}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class MediaResolver$resolveToUri$2 extends k implements Function2<CoroutineScope, Continuation<? super Uri>, Object> {
    final /* synthetic */ int $imageCompressionQuality;
    final /* synthetic */ Uri $inputUri;
    final /* synthetic */ boolean $isLowQuality;
    final /* synthetic */ VideoCompressionQuality $videoCompressionQuality;
    int label;
    final /* synthetic */ MediaResolver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaResolver$resolveToUri$2(MediaResolver mediaResolver, Uri uri, VideoCompressionQuality videoCompressionQuality, int i10, boolean z10, Continuation<? super MediaResolver$resolveToUri$2> continuation) {
        super(2, continuation);
        this.this$0 = mediaResolver;
        this.$inputUri = uri;
        this.$videoCompressionQuality = videoCompressionQuality;
        this.$imageCompressionQuality = i10;
        this.$isLowQuality = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaResolver$resolveToUri$2(this.this$0, this.$inputUri, this.$videoCompressionQuality, this.$imageCompressionQuality, this.$isLowQuality, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Uri> continuation) {
        return ((MediaResolver$resolveToUri$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f22113a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        ContentResolver resolver;
        ContentResolver resolver2;
        Object checkFreeSpace;
        d10 = d.d();
        int i10 = this.label;
        if (i10 == 0) {
            t.b(obj);
            MediaResolver mediaResolver = this.this$0;
            this.label = 1;
            checkFreeSpace = mediaResolver.checkFreeSpace(this);
            if (checkFreeSpace == d10) {
                return d10;
            }
        } else if (i10 == 1) {
            t.b(obj);
        } else if (i10 == 2) {
            t.b(obj);
            return (Uri) obj;
        } else if (i10 == 3) {
            t.b(obj);
            return (Uri) obj;
        } else if (i10 == 4) {
            t.b(obj);
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
            if (obj == d10) {
                return d10;
            }
            return (Uri) obj;
        }
        resolver2 = this.this$0.getResolver();
        if (contentResolverUtils.isImage(resolver2, this.$inputUri)) {
            MediaResolver mediaResolver3 = this.this$0;
            Uri uri2 = this.$inputUri;
            int i11 = this.$imageCompressionQuality;
            boolean z10 = this.$isLowQuality;
            this.label = 3;
            obj = mediaResolver3.handleImage(uri2, i11, z10, this);
            if (obj == d10) {
                return d10;
            }
            return (Uri) obj;
        }
        MediaResolver mediaResolver4 = this.this$0;
        Uri uri3 = this.$inputUri;
        this.label = 4;
        obj = MediaResolver.copyToFile$default(mediaResolver4, uri3, null, this, 2, null);
        if (obj == d10) {
            return d10;
        }
        return (Uri) obj;
    }
}
