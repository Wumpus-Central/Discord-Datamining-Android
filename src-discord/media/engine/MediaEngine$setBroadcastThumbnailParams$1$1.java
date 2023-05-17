package com.discord.media.engine;

import android.graphics.Bitmap;
import com.discord.media.engine.MediaEngine;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.l;
import nf.t;
import tf.d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MediaEngine$setBroadcastThumbnailParams$1$1 extends s implements Function1<Bitmap, Unit> {
    final /* synthetic */ Function1<String, Unit> $callback;
    final /* synthetic */ MediaEngine this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.discord.media.engine.MediaEngine$setBroadcastThumbnailParams$1$1$1", f = "MediaEngine.kt", l = {455}, m = "invokeSuspend")
    /* renamed from: com.discord.media.engine.MediaEngine$setBroadcastThumbnailParams$1$1$1  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ Function1<String, Unit> $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Bitmap bitmap, Function1<? super String, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$bitmap = bitmap;
            this.$callback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$bitmap, this.$callback, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22036a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = d.d();
            int i10 = this.label;
            if (i10 == 0) {
                t.b(obj);
                MediaEngine.Companion companion = MediaEngine.Companion;
                Bitmap bitmap = this.$bitmap;
                this.label = 1;
                obj = companion.encodeThumbnail(bitmap, this);
                if (obj == d10) {
                    return d10;
                }
            } else if (i10 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.$callback.invoke((String) obj);
            return Unit.f22036a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaEngine$setBroadcastThumbnailParams$1$1(MediaEngine mediaEngine, Function1<? super String, Unit> function1) {
        super(1);
        this.this$0 = mediaEngine;
        this.$callback = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.f22036a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Bitmap bitmap) {
        CoroutineScope coroutineScope;
        q.g(bitmap, "bitmap");
        coroutineScope = this.this$0.coroutineScope;
        l.d(coroutineScope, null, null, new AnonymousClass1(bitmap, this.$callback, null), 3, null);
    }
}
