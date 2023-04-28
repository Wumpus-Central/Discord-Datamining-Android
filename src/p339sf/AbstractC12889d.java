package p339sf;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u0000 \b2\u00020\u0001:\u0001\tJ\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&J\u0014\u0010\u0007\u001a\u00020\u00062\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¨\u0006\n"}, m15073d2 = {"Lsf/d;", "Lkotlin/coroutines/CoroutineContext$b;", "T", "Lkotlin/coroutines/Continuation;", "continuation", "p", "", "l", "h", "b", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: sf.d */
/* loaded from: classes8.dex */
public interface AbstractC12889d extends CoroutineContext.AbstractC9924b {

    /* renamed from: h */
    public static final C12891b f28964h = C12891b.f28965k;

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: sf.d$a */
    /* loaded from: classes8.dex */
    public static final class C12890a {
        /* renamed from: a */
        public static <E extends CoroutineContext.AbstractC9924b> E m5181a(AbstractC12889d dVar, CoroutineContext.AbstractC9926c<E> key) {
            C9971q.m14633g(key, "key");
            if (key instanceof AbstractC12886b) {
                AbstractC12886b bVar = (AbstractC12886b) key;
                if (!bVar.m5189a(dVar.getKey())) {
                    return null;
                }
                E e = (E) bVar.m5188b(dVar);
                if (e instanceof CoroutineContext.AbstractC9924b) {
                    return e;
                }
                return null;
            } else if (AbstractC12889d.f28964h != key) {
                return null;
            } else {
                C9971q.m14635e(dVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return dVar;
            }
        }

        /* renamed from: b */
        public static CoroutineContext m5180b(AbstractC12889d dVar, CoroutineContext.AbstractC9926c<?> key) {
            C9971q.m14633g(key, "key");
            if (key instanceof AbstractC12886b) {
                AbstractC12886b bVar = (AbstractC12886b) key;
                if (!bVar.m5189a(dVar.getKey()) || bVar.m5188b(dVar) == null) {
                    return dVar;
                }
                return C12893f.f28966k;
            } else if (AbstractC12889d.f28964h == key) {
                return C12893f.f28966k;
            } else {
                return dVar;
            }
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m15073d2 = {"Lsf/d$b;", "Lkotlin/coroutines/CoroutineContext$c;", "Lsf/d;", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: sf.d$b */
    /* loaded from: classes8.dex */
    public static final class C12891b implements CoroutineContext.AbstractC9926c<AbstractC12889d> {

        /* renamed from: k */
        static final /* synthetic */ C12891b f28965k = new C12891b();

        private C12891b() {
        }
    }

    /* renamed from: l */
    void mo5183l(Continuation<?> continuation);

    /* renamed from: p */
    <T> Continuation<T> mo5182p(Continuation<? super T> continuation);
}
