package com.discord.image.fresco;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.discord.image.fresco.postprocessors.PostProcessor;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.core.DefaultExecutorSupplier;
import com.facebook.imagepipeline.datasource.b;
import com.facebook.imagepipeline.request.BasePostprocessor;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import ff.s;
import ff.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.p;
import l3.c;
import lf.d;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u001a6\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u001a9\u0010\t\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\r\u001a9\u0010\t\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroid/content/Context;", "", "uri", "Lcom/discord/image/fresco/postprocessors/PostProcessor;", "postProcessor", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "", "onDecodedImage", "fetchDecodedImage", "Landroid/net/Uri;", "", "copyBitmap", "(Landroid/content/Context;Ljava/lang/String;Lcom/discord/image/fresco/postprocessors/PostProcessor;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroid/content/Context;Landroid/net/Uri;Lcom/discord/image/fresco/postprocessors/PostProcessor;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/facebook/imagepipeline/core/DefaultExecutorSupplier;", "executorSupplier", "Lcom/facebook/imagepipeline/core/DefaultExecutorSupplier;", "fresco_release"}, k = 2, mv = {1, 8, 0})

public final class FrescoFetchDecodedImageKt {
    private static final DefaultExecutorSupplier executorSupplier = new DefaultExecutorSupplier(3);

    public static final void fetchDecodedImage(Context context, String str, PostProcessor postProcessor, Function1<? super Bitmap, Unit> onDecodedImage) {
        Object obj;
        q.g(context, "<this>");
        q.g(onDecodedImage, "onDecodedImage");
        try {
            s.a aVar = s.f14778l;
            obj = s.b(Uri.parse(str));
        } catch (Throwable th2) {
            s.a aVar2 = s.f14778l;
            obj = s.b(t.a(th2));
        }
        if (s.g(obj)) {
            obj = null;
        }
        fetchDecodedImage(context, (Uri) obj, postProcessor, onDecodedImage);
    }

    public static  void fetchDecodedImage$default(Context context, String str, PostProcessor postProcessor, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            postProcessor = null;
        }
        fetchDecodedImage(context, str, postProcessor, function1);
    }

    public static  void fetchDecodedImage$default(Context context, Uri uri, PostProcessor postProcessor, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            postProcessor = null;
        }
        fetchDecodedImage(context, uri, postProcessor, function1);
    }

    public static final void fetchDecodedImage(Context context, Uri uri, PostProcessor postProcessor, final Function1<? super Bitmap, Unit> onDecodedImage) {
        q.g(context, "<this>");
        q.g(onDecodedImage, "onDecodedImage");
        BasePostprocessor basePostprocessor = null;
        if (uri == null) {
            onDecodedImage.invoke(null);
            return;
        }
        ImageRequestBuilder s10 = ImageRequestBuilder.s(uri);
        if (postProcessor != null) {
            basePostprocessor = postProcessor.create();
        }
        c.a().d(s10.A(basePostprocessor).a(), context).g(new b() { 
            @Override 
            protected void onFailureImpl(DataSource<CloseableReference<v4.c>> dataSource) {
                q.g(dataSource, "dataSource");
                onDecodedImage.invoke(null);
            }

            @Override 
            protected void onNewResultImpl(Bitmap bitmap) {
                onDecodedImage.invoke(bitmap);
            }
        }, executorSupplier.a());
    }

    public static  Object fetchDecodedImage$default(Context context, String str, PostProcessor postProcessor, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            postProcessor = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return fetchDecodedImage(context, str, postProcessor, z10, continuation);
    }

    public static  Object fetchDecodedImage$default(Context context, Uri uri, PostProcessor postProcessor, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            postProcessor = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return fetchDecodedImage(context, uri, postProcessor, z10, continuation);
    }

    public static final Object fetchDecodedImage(Context context, String str, PostProcessor postProcessor, boolean z10, Continuation<? super Bitmap> continuation) {
        Object obj;
        try {
            s.a aVar = s.f14778l;
            obj = s.b(Uri.parse(str));
        } catch (Throwable th2) {
            s.a aVar2 = s.f14778l;
            obj = s.b(t.a(th2));
        }
        if (s.g(obj)) {
            obj = null;
        }
        return fetchDecodedImage(context, (Uri) obj, postProcessor, z10, continuation);
    }

    public static final Object fetchDecodedImage(Context context, Uri uri, PostProcessor postProcessor, final boolean z10, Continuation<? super Bitmap> continuation) {
        Continuation c10;
        Object d10;
        c10 = lf.c.c(continuation);
        final p pVar = new p(c10, 1);
        pVar.C();
        BasePostprocessor basePostprocessor = null;
        if (uri == null) {
            pVar.resumeWith(s.b(null));
        } else {
            ImageRequestBuilder s10 = ImageRequestBuilder.s(uri);
            if (postProcessor != null) {
                basePostprocessor = postProcessor.create();
            }
            DataSource<CloseableReference<v4.c>> d11 = c.a().d(s10.A(basePostprocessor).a(), context);
            d11.g(new b() { 
                @Override 
                protected void onFailureImpl(DataSource<CloseableReference<v4.c>> dataSource) {
                    q.g(dataSource, "dataSource");
                    pVar.resumeWith(s.b(null));
                }

                @Override 
                protected void onNewResultImpl(Bitmap bitmap) {
                    CancellableContinuation<Bitmap> cancellableContinuation = pVar;
                    s.a aVar = s.f14778l;
                    if (z10 && bitmap != null) {
                        bitmap = Bitmap.createBitmap(bitmap);
                    }
                    cancellableContinuation.resumeWith(s.b(bitmap));
                }
            }, executorSupplier.a());
            pVar.n(new FrescoFetchDecodedImageKt$fetchDecodedImage$6$1(d11));
        }
        Object w10 = pVar.w();
        d10 = d.d();
        if (w10 == d10) {
            g.c(continuation);
        }
        return w10;
    }
}
