package p408wi;

import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C9933g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.C10156p;
import p120gc.AbstractFutureC7576b;
import p120gc.C7577c;
import p120gc.C7578d;
import tf.C13076c;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a#\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m15073d2 = {"Ljava/util/concurrent/ExecutionException;", "", "c", "T", "Lgc/b;", "b", "(Lgc/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-guava"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: wi.a */
/* loaded from: classes8.dex */
public final class C13889a {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, m15073d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, m15072k = 3, m15071mv = {1, 6, 0}, m15069xi = 48)
    /* renamed from: wi.a$a */
    /* loaded from: classes8.dex */
    public static final class C0448a extends AbstractC9973s implements Function1<Throwable, Unit> {

        /* renamed from: k */
        final /* synthetic */ AbstractFutureC7576b<T> f31318k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0448a(AbstractFutureC7576b<T> bVar) {
            super(1);
            this.f31318k = bVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f22042a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            this.f31318k.cancel(false);
        }
    }

    /* renamed from: b */
    public static final <T> Object m2379b(AbstractFutureC7576b<T> bVar, Continuation<? super T> continuation) {
        Continuation c;
        Object d;
        try {
            if (bVar.isDone()) {
                return C7578d.m21973a(bVar);
            }
            c = C13076c.m4647c(continuation);
            C10156p pVar = new C10156p(c, 1);
            pVar.m14150C();
            bVar.mo1409a(new RunnableC13890b(bVar, pVar), C7577c.m21974a());
            pVar.mo14131k(new C0448a(bVar));
            Object y = pVar.m14117y();
            d = C13080d.m4646d();
            if (y == d) {
                C9933g.m14691c(continuation);
            }
            return y;
        } catch (ExecutionException e) {
            throw m2378c(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final Throwable m2378c(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        C9971q.m14636d(cause);
        return cause;
    }
}
