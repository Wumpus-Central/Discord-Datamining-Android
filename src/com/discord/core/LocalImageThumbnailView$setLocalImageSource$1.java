package com.discord.core;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Size;
import android.widget.ImageView;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.discord.crash_reporting.CrashReporting;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9636e;
import kotlin.coroutines.jvm.internal.AbstractC9643k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9677q;
import kotlinx.coroutines.AbstractC9742f2;
import kotlinx.coroutines.C9840j;
import kotlinx.coroutines.C9946y0;
import kotlinx.coroutines.CoroutineScope;
import nf.C10848t;
import nf.C10853x;
import p268of.C11053v;
import tf.C12962d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9636e(m14702c = "com.discord.core.LocalImageThumbnailView$setLocalImageSource$1", m14701f = "LocalImageThumbnailView.kt", m14700l = {82, 101}, m14699m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LocalImageThumbnailView$setLocalImageSource$1 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $heightDp;
    final /* synthetic */ Uri $uri;
    final /* synthetic */ int $widthDp;
    int label;
    final /* synthetic */ LocalImageThumbnailView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    @AbstractC9636e(m14702c = "com.discord.core.LocalImageThumbnailView$setLocalImageSource$1$1", m14701f = "LocalImageThumbnailView.kt", m14700l = {}, m14699m = "invokeSuspend")
    /* renamed from: com.discord.core.LocalImageThumbnailView$setLocalImageSource$1$1 */
    /* loaded from: classes4.dex */
    public static final class C33471 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ boolean $isBitmapEmpty;
        final /* synthetic */ Uri $uri;
        int label;
        final /* synthetic */ LocalImageThumbnailView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33471(LocalImageThumbnailView localImageThumbnailView, boolean z, Uri uri, Bitmap bitmap, Continuation<? super C33471> continuation) {
            super(2, continuation);
            this.this$0 = localImageThumbnailView;
            this.$isBitmapEmpty = z;
            this.$uri = uri;
            this.$bitmap = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C33471(this.this$0, this.$isBitmapEmpty, this.$uri, this.$bitmap, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33471) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
        public final Object invokeSuspend(Object obj) {
            ImageView imageView;
            SimpleDraweeView simpleDraweeView;
            C12962d.m4646d();
            if (this.label == 0) {
                C10848t.m10930b(obj);
                this.this$0.toggleImages(this.$isBitmapEmpty);
                if (this.$isBitmapEmpty) {
                    LocalImageThumbnailView localImageThumbnailView = this.this$0;
                    simpleDraweeView = localImageThumbnailView.simpleDraweeView;
                    localImageThumbnailView.loadDefaultBitmap(simpleDraweeView, this.$uri);
                } else {
                    imageView = this.this$0.imageView;
                    imageView.setImageBitmap(this.$bitmap);
                }
                return Unit.f25780a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    @AbstractC9636e(m14702c = "com.discord.core.LocalImageThumbnailView$setLocalImageSource$1$2", m14701f = "LocalImageThumbnailView.kt", m14700l = {}, m14699m = "invokeSuspend")
    /* renamed from: com.discord.core.LocalImageThumbnailView$setLocalImageSource$1$2 */
    /* loaded from: classes4.dex */
    public static final class C33482 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Uri $uri;
        int label;
        final /* synthetic */ LocalImageThumbnailView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33482(LocalImageThumbnailView localImageThumbnailView, Uri uri, Continuation<? super C33482> continuation) {
            super(2, continuation);
            this.this$0 = localImageThumbnailView;
            this.$uri = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C33482(this.this$0, this.$uri, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33482) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
        public final Object invokeSuspend(Object obj) {
            SimpleDraweeView simpleDraweeView;
            C12962d.m4646d();
            if (this.label == 0) {
                C10848t.m10930b(obj);
                this.this$0.toggleImages(true);
                LocalImageThumbnailView localImageThumbnailView = this.this$0;
                simpleDraweeView = localImageThumbnailView.simpleDraweeView;
                localImageThumbnailView.loadDefaultBitmap(simpleDraweeView, this.$uri);
                return Unit.f25780a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalImageThumbnailView$setLocalImageSource$1(int i, int i2, LocalImageThumbnailView localImageThumbnailView, Uri uri, Continuation<? super LocalImageThumbnailView$setLocalImageSource$1> continuation) {
        super(2, continuation);
        this.$widthDp = i;
        this.$heightDp = i2;
        this.this$0 = localImageThumbnailView;
        this.$uri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalImageThumbnailView$setLocalImageSource$1(this.$widthDp, this.$heightDp, this.this$0, this.$uri, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LocalImageThumbnailView$setLocalImageSource$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Object invokeSuspend(Object obj) {
        Object d;
        Map k;
        Size size;
        Bitmap thumbnail;
        int i;
        boolean z;
        boolean z2;
        d = C12962d.m4646d();
        int i2 = this.label;
        try {
            if (i2 == 0) {
                C10848t.m10930b(obj);
                int dpToPx = SizeUtilsKt.getDpToPx(this.$widthDp);
                int dpToPx2 = SizeUtilsKt.getDpToPx(this.$heightDp);
                if (dpToPx == 0 || dpToPx2 == 0) {
                    size = new Size(ItemTouchHelper.AbstractC1928c.DEFAULT_DRAG_ANIMATION_DURATION, ItemTouchHelper.AbstractC1928c.DEFAULT_DRAG_ANIMATION_DURATION);
                } else {
                    size = new Size(dpToPx, dpToPx2);
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    thumbnail = this.this$0.getContext().getContentResolver().loadThumbnail(this.$uri, size, null);
                } else {
                    ContentResolver contentResolver = this.this$0.getContext().getContentResolver();
                    String lastPathSegment = this.$uri.getLastPathSegment();
                    C9677q.m14636d(lastPathSegment);
                    thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, Long.parseLong(lastPathSegment), 1, null);
                }
                if (thumbnail != null) {
                    i = thumbnail.getAllocationByteCount();
                } else {
                    i = 0;
                }
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                AbstractC9742f2 c = C9946y0.m13945c();
                LocalImageThumbnailView localImageThumbnailView = this.this$0;
                if (z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C33471 r12 = new C33471(localImageThumbnailView, z2, this.$uri, thumbnail, null);
                this.label = 1;
                if (C9840j.m14192g(c, r12, this) == d) {
                    return d;
                }
            } else if (i2 == 1) {
                C10848t.m10930b(obj);
            } else if (i2 == 2) {
                C10848t.m10930b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Exception e) {
            CrashReporting crashReporting = CrashReporting.INSTANCE;
            k = C11053v.m10248k(C10853x.m10921a("exception", e.toString()), C10853x.m10921a("url", this.$uri.toString()));
            CrashReporting.addBreadcrumb$default(crashReporting, "DCDLocalImageThumbnail - Failed to load thumbnail", k, null, 4, null);
            AbstractC9742f2 c2 = C9946y0.m13945c();
            C33482 r1 = new C33482(this.this$0, this.$uri, null);
            this.label = 2;
            if (C9840j.m14192g(c2, r1, this) == d) {
                return d;
            }
        }
        return Unit.f25780a;
    }
}
