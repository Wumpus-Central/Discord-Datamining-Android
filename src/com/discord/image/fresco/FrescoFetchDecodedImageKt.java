package com.discord.image.fresco;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.discord.image.fresco.postprocessors.PostProcessor;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.core.DefaultExecutorSupplier;
import com.facebook.imagepipeline.datasource.AbstractC3890b;
import com.facebook.imagepipeline.request.BasePostprocessor;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C9638g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9677q;
import kotlinx.coroutines.C9868p;
import kotlinx.coroutines.CancellableContinuation;
import nf.C10845s;
import nf.C10848t;
import p209l4.C10061c;
import p381v5.AbstractC13330c;
import tf.C12957c;
import tf.C12962d;

@Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u001a6\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u001a9\u0010\t\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\r\u001a9\u0010\t\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m15073d2 = {"Landroid/content/Context;", "", "uri", "Lcom/discord/image/fresco/postprocessors/PostProcessor;", "postProcessor", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "", "onDecodedImage", "fetchDecodedImage", "Landroid/net/Uri;", "", "copyBitmap", "(Landroid/content/Context;Ljava/lang/String;Lcom/discord/image/fresco/postprocessors/PostProcessor;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroid/content/Context;Landroid/net/Uri;Lcom/discord/image/fresco/postprocessors/PostProcessor;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/facebook/imagepipeline/core/DefaultExecutorSupplier;", "executorSupplier", "Lcom/facebook/imagepipeline/core/DefaultExecutorSupplier;", "fresco_release"}, m15072k = 2, m15071mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class FrescoFetchDecodedImageKt {
    private static final DefaultExecutorSupplier executorSupplier = new DefaultExecutorSupplier(3);

    public static final void fetchDecodedImage(Context context, String str, PostProcessor postProcessor, Function1<? super Bitmap, Unit> onDecodedImage) {
        Object obj;
        C9677q.m14633g(context, "<this>");
        C9677q.m14633g(onDecodedImage, "onDecodedImage");
        try {
            C10845s.C10846a aVar = C10845s.f28533l;
            obj = C10845s.m10940b(Uri.parse(str));
        } catch (Throwable th2) {
            C10845s.C10846a aVar2 = C10845s.f28533l;
            obj = C10845s.m10940b(C10848t.m10931a(th2));
        }
        if (C10845s.m10935g(obj)) {
            obj = null;
        }
        fetchDecodedImage(context, (Uri) obj, postProcessor, onDecodedImage);
    }

    public static /* synthetic */ void fetchDecodedImage$default(Context context, String str, PostProcessor postProcessor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            postProcessor = null;
        }
        fetchDecodedImage(context, str, postProcessor, function1);
    }

    public static /* synthetic */ void fetchDecodedImage$default(Context context, Uri uri, PostProcessor postProcessor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            postProcessor = null;
        }
        fetchDecodedImage(context, uri, postProcessor, function1);
    }

    public static final void fetchDecodedImage(Context context, Uri uri, PostProcessor postProcessor, final Function1<? super Bitmap, Unit> onDecodedImage) {
        C9677q.m14633g(context, "<this>");
        C9677q.m14633g(onDecodedImage, "onDecodedImage");
        BasePostprocessor basePostprocessor = null;
        if (uri == null) {
            onDecodedImage.invoke(null);
            return;
        }
        ImageRequestBuilder s = ImageRequestBuilder.m30874s(uri);
        if (postProcessor != null) {
            basePostprocessor = postProcessor.create();
        }
        C10061c.m13589a().m31487d(s.m30902A(basePostprocessor).m30892a(), context).mo32018d(new AbstractC3890b() { // from class: com.discord.image.fresco.FrescoFetchDecodedImageKt$fetchDecodedImage$2
            @Override // com.facebook.datasource.AbstractC3749b
            protected void onFailureImpl(DataSource<CloseableReference<AbstractC13330c>> dataSource) {
                C9677q.m14633g(dataSource, "dataSource");
                onDecodedImage.invoke(null);
            }

            @Override // com.facebook.imagepipeline.datasource.AbstractC3890b
            protected void onNewResultImpl(Bitmap bitmap) {
                onDecodedImage.invoke(bitmap);
            }
        }, executorSupplier.mo6962d());
    }

    public static /* synthetic */ Object fetchDecodedImage$default(Context context, String str, PostProcessor postProcessor, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            postProcessor = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return fetchDecodedImage(context, str, postProcessor, z, continuation);
    }

    public static /* synthetic */ Object fetchDecodedImage$default(Context context, Uri uri, PostProcessor postProcessor, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            postProcessor = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return fetchDecodedImage(context, uri, postProcessor, z, continuation);
    }

    public static final Object fetchDecodedImage(Context context, String str, PostProcessor postProcessor, boolean z, Continuation<? super Bitmap> continuation) {
        Object obj;
        try {
            C10845s.C10846a aVar = C10845s.f28533l;
            obj = C10845s.m10940b(Uri.parse(str));
        } catch (Throwable th2) {
            C10845s.C10846a aVar2 = C10845s.f28533l;
            obj = C10845s.m10940b(C10848t.m10931a(th2));
        }
        if (C10845s.m10935g(obj)) {
            obj = null;
        }
        return fetchDecodedImage(context, (Uri) obj, postProcessor, z, continuation);
    }

    public static final Object fetchDecodedImage(Context context, Uri uri, PostProcessor postProcessor, final boolean z, Continuation<? super Bitmap> continuation) {
        Continuation c;
        Object d;
        c = C12957c.m4647c(continuation);
        final C9868p pVar = new C9868p(c, 1);
        pVar.m14150C();
        BasePostprocessor basePostprocessor = null;
        if (uri == null) {
            pVar.resumeWith(C10845s.m10940b(null));
        } else {
            ImageRequestBuilder s = ImageRequestBuilder.m30874s(uri);
            if (postProcessor != null) {
                basePostprocessor = postProcessor.create();
            }
            DataSource<CloseableReference<AbstractC13330c>> d2 = C10061c.m13589a().m31487d(s.m30902A(basePostprocessor).m30892a(), context);
            d2.mo32018d(new AbstractC3890b() { // from class: com.discord.image.fresco.FrescoFetchDecodedImageKt$fetchDecodedImage$6$subscriber$1
                @Override // com.facebook.datasource.AbstractC3749b
                protected void onFailureImpl(DataSource<CloseableReference<AbstractC13330c>> dataSource) {
                    C9677q.m14633g(dataSource, "dataSource");
                    pVar.resumeWith(C10845s.m10940b(null));
                }

                @Override // com.facebook.imagepipeline.datasource.AbstractC3890b
                protected void onNewResultImpl(Bitmap bitmap) {
                    CancellableContinuation<Bitmap> cancellableContinuation = pVar;
                    C10845s.C10846a aVar = C10845s.f28533l;
                    if (z && bitmap != null) {
                        bitmap = Bitmap.createBitmap(bitmap);
                    }
                    cancellableContinuation.resumeWith(C10845s.m10940b(bitmap));
                }
            }, executorSupplier.mo6962d());
            pVar.mo14131k(new FrescoFetchDecodedImageKt$fetchDecodedImage$6$1(d2));
        }
        Object y = pVar.m14117y();
        d = C12962d.m4646d();
        if (y == d) {
            C9638g.m14691c(continuation);
        }
        return y;
    }
}
