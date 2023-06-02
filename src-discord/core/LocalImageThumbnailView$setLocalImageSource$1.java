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
import jg.t;
import jg.x;
import kg.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.j;
import kotlinx.coroutines.y0;
import pg.d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.core.LocalImageThumbnailView$setLocalImageSource$1", f = "LocalImageThumbnailView.kt", l = {82, 101}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class LocalImageThumbnailView$setLocalImageSource$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $heightDp;
    final /* synthetic */ Uri $uri;
    final /* synthetic */ int $widthDp;
    int label;
    final /* synthetic */ LocalImageThumbnailView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.discord.core.LocalImageThumbnailView$setLocalImageSource$1$1", f = "LocalImageThumbnailView.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.discord.core.LocalImageThumbnailView$setLocalImageSource$1$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ boolean $isBitmapEmpty;
        final /* synthetic */ Uri $uri;
        int label;
        final /* synthetic */ LocalImageThumbnailView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LocalImageThumbnailView localImageThumbnailView, boolean z10, Uri uri, Bitmap bitmap, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = localImageThumbnailView;
            this.$isBitmapEmpty = z10;
            this.$uri = uri;
            this.$bitmap = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$isBitmapEmpty, this.$uri, this.$bitmap, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22080a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ImageView imageView;
            SimpleDraweeView simpleDraweeView;
            d.d();
            if (this.label == 0) {
                t.b(obj);
                this.this$0.toggleImages(this.$isBitmapEmpty);
                if (this.$isBitmapEmpty) {
                    LocalImageThumbnailView localImageThumbnailView = this.this$0;
                    simpleDraweeView = localImageThumbnailView.simpleDraweeView;
                    localImageThumbnailView.loadDefaultBitmap(simpleDraweeView, this.$uri);
                } else {
                    imageView = this.this$0.imageView;
                    imageView.setImageBitmap(this.$bitmap);
                }
                return Unit.f22080a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.discord.core.LocalImageThumbnailView$setLocalImageSource$1$2", f = "LocalImageThumbnailView.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.discord.core.LocalImageThumbnailView$setLocalImageSource$1$2  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Uri $uri;
        int label;
        final /* synthetic */ LocalImageThumbnailView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(LocalImageThumbnailView localImageThumbnailView, Uri uri, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = localImageThumbnailView;
            this.$uri = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$uri, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f22080a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            SimpleDraweeView simpleDraweeView;
            d.d();
            if (this.label == 0) {
                t.b(obj);
                this.this$0.toggleImages(true);
                LocalImageThumbnailView localImageThumbnailView = this.this$0;
                simpleDraweeView = localImageThumbnailView.simpleDraweeView;
                localImageThumbnailView.loadDefaultBitmap(simpleDraweeView, this.$uri);
                return Unit.f22080a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalImageThumbnailView$setLocalImageSource$1(int i10, int i11, LocalImageThumbnailView localImageThumbnailView, Uri uri, Continuation<? super LocalImageThumbnailView$setLocalImageSource$1> continuation) {
        super(2, continuation);
        this.$widthDp = i10;
        this.$heightDp = i11;
        this.this$0 = localImageThumbnailView;
        this.$uri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalImageThumbnailView$setLocalImageSource$1(this.$widthDp, this.$heightDp, this.this$0, this.$uri, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LocalImageThumbnailView$setLocalImageSource$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22080a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        Map k10;
        Size size;
        Bitmap thumbnail;
        int i10;
        boolean z10;
        boolean z11;
        d10 = d.d();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                t.b(obj);
                int dpToPx = SizeUtilsKt.getDpToPx(this.$widthDp);
                int dpToPx2 = SizeUtilsKt.getDpToPx(this.$heightDp);
                if (dpToPx == 0 || dpToPx2 == 0) {
                    size = new Size(ItemTouchHelper.c.DEFAULT_DRAG_ANIMATION_DURATION, ItemTouchHelper.c.DEFAULT_DRAG_ANIMATION_DURATION);
                } else {
                    size = new Size(dpToPx, dpToPx2);
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    thumbnail = this.this$0.getContext().getContentResolver().loadThumbnail(this.$uri, size, null);
                } else {
                    ContentResolver contentResolver = this.this$0.getContext().getContentResolver();
                    String lastPathSegment = this.$uri.getLastPathSegment();
                    q.d(lastPathSegment);
                    thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, Long.parseLong(lastPathSegment), 1, null);
                }
                if (thumbnail != null) {
                    i10 = thumbnail.getAllocationByteCount();
                } else {
                    i10 = 0;
                }
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f2 c10 = y0.c();
                LocalImageThumbnailView localImageThumbnailView = this.this$0;
                if (z10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AnonymousClass1 r12 = new AnonymousClass1(localImageThumbnailView, z11, this.$uri, thumbnail, null);
                this.label = 1;
                if (j.g(c10, r12, this) == d10) {
                    return d10;
                }
            } else if (i11 == 1) {
                t.b(obj);
            } else if (i11 == 2) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Exception e10) {
            CrashReporting crashReporting = CrashReporting.INSTANCE;
            k10 = v.k(x.a("exception", e10.toString()), x.a("url", this.$uri.toString()));
            CrashReporting.addBreadcrumb$default(crashReporting, "DCDLocalImageThumbnail - Failed to load thumbnail", k10, null, 4, null);
            f2 c11 = y0.c();
            AnonymousClass2 r13 = new AnonymousClass2(this.this$0, this.$uri, null);
            this.label = 2;
            if (j.g(c11, r13, this) == d10) {
                return d10;
            }
        }
        return Unit.f22080a;
    }
}
