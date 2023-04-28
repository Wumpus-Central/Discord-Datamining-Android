package p216lf;

import android.content.Context;
import android.net.Uri;
import id.zelory.compressor.constraint.Compression;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.C10129j;
import kotlinx.coroutines.C10230y0;
import kotlinx.coroutines.CoroutineScope;
import nf.C11093t;
import p232mf.AbstractC10594a;
import p232mf.C10596c;
import tf.C13080d;

@Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010JC\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m15073d2 = {"Llf/a;", "", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "imageFileUri", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/Function1;", "Lid/zelory/compressor/constraint/Compression;", "", "compressionPatch", "Ljava/io/File;", "a", "(Landroid/content/Context;Landroid/net/Uri;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "compressor_release"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: lf.a */
/* loaded from: classes8.dex */
public final class C10408a {

    /* renamed from: a */
    public static final C10408a f22811a = new C10408a();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15075bv = {1, 0, 3}, m15074d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m15073d2 = {"<anonymous>", "", "Lid/zelory/compressor/constraint/Compression;", "invoke"}, m15072k = 3, m15071mv = {1, 1, 16})
    /* renamed from: lf.a$a */
    /* loaded from: classes8.dex */
    public static final class C0324a extends AbstractC9973s implements Function1<Compression, Unit> {

        /* renamed from: k */
        public static final C0324a f22812k = new C0324a();

        C0324a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Compression compression) {
            invoke2(compression);
            return Unit.f22042a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Compression receiver) {
            C9971q.m14632h(receiver, "$receiver");
            C10596c.m12778b(receiver, 0, 0, null, 0, 15, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15075bv = {1, 0, 3}, m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"<anonymous>", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, m15072k = 3, m15071mv = {1, 1, 16})
    @AbstractC9931e(m14702c = "id.zelory.compressor.Compressor$compress$6", m14701f = "Compressor.kt", m14700l = {}, m14699m = "invokeSuspend")
    /* renamed from: lf.a$b */
    /* loaded from: classes8.dex */
    public static final class C10409b extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super File>, Object> {

        /* renamed from: k */
        private CoroutineScope f22813k;

        /* renamed from: l */
        int f22814l;

        /* renamed from: m */
        final /* synthetic */ Function1 f22815m;

        /* renamed from: n */
        final /* synthetic */ Context f22816n;

        /* renamed from: o */
        final /* synthetic */ Uri f22817o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10409b(Function1 function1, Context context, Uri uri, Continuation continuation) {
            super(2, continuation);
            this.f22815m = function1;
            this.f22816n = context;
            this.f22817o = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Continuation<Unit> create(Object obj, Continuation<?> completion) {
            C9971q.m14632h(completion, "completion");
            C10409b bVar = new C10409b(this.f22815m, this.f22816n, this.f22817o, completion);
            bVar.f22813k = (CoroutineScope) obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
            return ((C10409b) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Object invokeSuspend(Object obj) {
            C13080d.m4646d();
            if (this.f22814l == 0) {
                C11093t.m10930b(obj);
                Compression compression = new Compression();
                this.f22815m.invoke(compression);
                File d = C10411c.m13468d(this.f22816n, this.f22817o);
                for (AbstractC10594a aVar : compression.m19869b()) {
                    while (!aVar.isSatisfied(d)) {
                        d = aVar.satisfy(d);
                    }
                }
                return d;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private C10408a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static /* synthetic */ Object m13472b(C10408a aVar, Context context, Uri uri, CoroutineContext coroutineContext, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            coroutineContext = C10230y0.m13946b();
        }
        if ((i & 8) != 0) {
            function1 = C0324a.f22812k;
        }
        return aVar.m13473a(context, uri, coroutineContext, function1, continuation);
    }

    /* renamed from: a */
    public final Object m13473a(Context context, Uri uri, CoroutineContext coroutineContext, Function1<? super Compression, Unit> function1, Continuation<? super File> continuation) {
        return C10129j.m14192g(coroutineContext, new C10409b(function1, context, uri, null), continuation);
    }
}
