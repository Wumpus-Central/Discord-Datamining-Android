package com.discord.media.utils;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.discord.crash_reporting.CrashReporting;
import gf.x;
import hf.v;
import java.io.File;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.j;
import kotlinx.coroutines.y0;
import mf.d;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 22\u00020\u0001:\u00012B)\u0012\u0006\u0010!\u001a\u00020 \u0012\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020#¢\u0006\u0004\b0\u00101J\u0013\u0010\u0003\u001a\u00020\u0002H\u0083@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J5\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R&\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010'\u001a\n &*\u0004\u0018\u00010\u00110\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0018\u0010/\u001a\u00020\u0015*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lcom/discord/media/utils/MediaResolver;", "", "", "checkFreeSpace", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "inputUri", "Lcom/discord/media/utils/VideoCompressionQuality;", "compressionQuality", "handleVideo", "(Landroid/net/Uri;Lcom/discord/media/utils/VideoCompressionQuality;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "isLowQuality", "handleImage", "(Landroid/net/Uri;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uri", "Ljava/io/File;", "targetFile", "copyToFile", "(Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "tag", "message", "outputUri", "logMediaError", "getMimeType", "cancel", "imageCompressionQuality", "videoCompressionQuality", "resolveToUri", "(Landroid/net/Uri;ILcom/discord/media/utils/VideoCompressionQuality;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lkotlin/Function2;", "onProgress", "Lkotlin/jvm/functions/Function2;", "kotlin.jvm.PlatformType", "cacheDir", "Ljava/io/File;", "Landroid/content/ContentResolver;", "getResolver", "()Landroid/content/ContentResolver;", "resolver", "getRequestId", "(Landroid/net/Uri;)Ljava/lang/String;", "requestId", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V", "Companion", "media_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class MediaResolver {
    @Deprecated
    public static final double FREE_SPACE_PERCENT = 0.2d;
    private final File cacheDir;
    private final Context context;
    private final Function2<Uri, Integer, Unit> onProgress;
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final long HALF_DAY_MILLIS = TimeUnit.HOURS.toMillis(12);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/discord/media/utils/MediaResolver$Companion;", "", "()V", "FREE_SPACE_PERCENT", "", "HALF_DAY_MILLIS", "", "getHALF_DAY_MILLIS", "()J", "media_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getHALF_DAY_MILLIS() {
            return MediaResolver.HALF_DAY_MILLIS;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MediaResolver(Context context, Function2<? super Uri, ? super Integer, Unit> onProgress) {
        q.g(context, "context");
        q.g(onProgress, "onProgress");
        this.context = context;
        this.onProgress = onProgress;
        this.cacheDir = context.getCacheDir();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"UsableSpace"})
    public final Object checkFreeSpace(Continuation<? super Unit> continuation) {
        Object d10;
        Object g10 = j.g(y0.b(), new MediaResolver$checkFreeSpace$2(this, null), continuation);
        d10 = d.d();
        return g10 == d10 ? g10 : Unit.f20684a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object copyToFile(Uri uri, File file, Continuation<? super Uri> continuation) {
        return j.g(y0.b(), new MediaResolver$copyToFile$2(file, this, uri, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object copyToFile$default(MediaResolver mediaResolver, Uri uri, File file, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            file = null;
        }
        return mediaResolver.copyToFile(uri, file, continuation);
    }

    private final String getRequestId(Uri uri) {
        String uri2 = uri.toString();
        q.f(uri2, "toString()");
        return uri2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContentResolver getResolver() {
        ContentResolver contentResolver = this.context.getContentResolver();
        q.f(contentResolver, "context.contentResolver");
        return contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object handleImage(android.net.Uri r11, int r12, boolean r13, kotlin.coroutines.Continuation<? super android.net.Uri> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.discord.media.utils.MediaResolver$handleImage$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.discord.media.utils.MediaResolver$handleImage$1 r0 = (com.discord.media.utils.MediaResolver$handleImage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.discord.media.utils.MediaResolver$handleImage$1 r0 = new com.discord.media.utils.MediaResolver$handleImage$1
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r9 = mf.b.d()
            int r1 = r0.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0041
            if (r1 == r3) goto L_0x0035
            if (r1 != r2) goto L_0x002d
            gf.t.b(r14)
            goto L_0x00ad
        L_0x002d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0035:
            java.lang.Object r11 = r0.L$1
            android.net.Uri r11 = (android.net.Uri) r11
            java.lang.Object r12 = r0.L$0
            com.discord.media.utils.MediaResolver r12 = (com.discord.media.utils.MediaResolver) r12
            gf.t.b(r14)
            goto L_0x0087
        L_0x0041:
            gf.t.b(r14)
            android.content.ContentResolver r14 = r10.getResolver()
            com.discord.media.utils.ContentResolverUtils r1 = com.discord.media.utils.ContentResolverUtils.INSTANCE
            boolean r4 = r1.isHeif(r14, r11)
            r5 = 0
            if (r4 != 0) goto L_0x0062
            boolean r4 = r1.isJpeg(r14, r11)
            if (r4 != 0) goto L_0x0062
            if (r13 == 0) goto L_0x0060
            boolean r14 = r1.isPng(r14, r11)
            if (r14 == 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            r14 = r5
            goto L_0x0063
        L_0x0062:
            r14 = r3
        L_0x0063:
            if (r14 == 0) goto L_0x0068
            if (r13 == 0) goto L_0x0068
            r5 = r3
        L_0x0068:
            if (r14 == 0) goto L_0x009e
            ne.a r1 = ne.a.f22808a
            android.content.Context r2 = r10.context
            r4 = 0
            com.discord.media.utils.MediaResolver$handleImage$compressed$1 r13 = new com.discord.media.utils.MediaResolver$handleImage$compressed$1
            r13.<init>(r12, r5)
            r7 = 4
            r8 = 0
            r0.L$0 = r10
            r0.L$1 = r11
            r0.label = r3
            r3 = r11
            r5 = r13
            r6 = r0
            java.lang.Object r14 = ne.a.b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r14 != r9) goto L_0x0086
            return r9
        L_0x0086:
            r12 = r10
        L_0x0087:
            java.io.File r14 = (java.io.File) r14
            kotlin.jvm.functions.Function2<android.net.Uri, java.lang.Integer, kotlin.Unit> r12 = r12.onProgress
            r13 = 100
            java.lang.Integer r13 = kotlin.coroutines.jvm.internal.b.c(r13)
            r12.invoke(r11, r13)
            android.net.Uri r11 = android.net.Uri.fromFile(r14)
            java.lang.String r12 = "fromFile(this)"
            kotlin.jvm.internal.q.f(r11, r12)
            return r11
        L_0x009e:
            r3 = 0
            r5 = 2
            r6 = 0
            r0.label = r2
            r1 = r10
            r2 = r11
            r4 = r0
            java.lang.Object r14 = copyToFile$default(r1, r2, r3, r4, r5, r6)
            if (r14 != r9) goto L_0x00ad
            return r9
        L_0x00ad:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.media.utils.MediaResolver.handleImage(android.net.Uri, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object handleVideo(android.net.Uri r19, com.discord.media.utils.VideoCompressionQuality r20, kotlin.coroutines.Continuation<? super android.net.Uri> r21) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.media.utils.MediaResolver.handleVideo(android.net.Uri, com.discord.media.utils.VideoCompressionQuality, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void logMediaError(String str, String str2, Uri uri, Uri uri2) {
        Map k10;
        CrashReporting crashReporting = CrashReporting.INSTANCE;
        k10 = v.k(x.a("inputUri", uri.toString()), x.a("outputUri", uri2.toString()));
        CrashReporting.addBreadcrumb$default(crashReporting, str2, k10, null, 4, null);
        crashReporting.captureMessage(str, str2, CrashReporting.ErrorLevel.WARNING);
    }

    public final void cancel(Uri inputUri) {
        q.g(inputUri, "inputUri");
        Transcoder.INSTANCE.cancel(getRequestId(inputUri));
    }

    public final String getMimeType(Uri uri) {
        q.g(uri, "uri");
        return getResolver().getType(uri);
    }

    public final Object resolveToUri(Uri uri, int i10, VideoCompressionQuality videoCompressionQuality, boolean z10, Continuation<? super Uri> continuation) {
        return j.g(y0.b(), new MediaResolver$resolveToUri$2(this, uri, videoCompressionQuality, i10, z10, null), continuation);
    }
}
