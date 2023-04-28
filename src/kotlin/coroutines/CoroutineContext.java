package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import p339sf.AbstractC12889d;
import p339sf.C12887c;
import p339sf.C12893f;

@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J*\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\nH&¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002J\u0014\u0010\u0010\u001a\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¨\u0006\u0013"}, m15073d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "Lkotlin/coroutines/CoroutineContext$b;", "E", "Lkotlin/coroutines/CoroutineContext$c;", "key", "i", "(Lkotlin/coroutines/CoroutineContext$c;)Lkotlin/coroutines/CoroutineContext$b;", "R", "initial", "Lkotlin/Function2;", "operation", "w0", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "context", "f0", "j0", "b", "c", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes8.dex */
public interface CoroutineContext {

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: kotlin.coroutines.CoroutineContext$a */
    /* loaded from: classes8.dex */
    public static final class C9923a {

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"Lkotlin/coroutines/CoroutineContext;", "acc", "Lkotlin/coroutines/CoroutineContext$b;", "element", "a", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext;"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: kotlin.coroutines.CoroutineContext$a$a */
        /* loaded from: classes8.dex */
        public static final class C0303a extends AbstractC9973s implements Function2<CoroutineContext, AbstractC9924b, CoroutineContext> {

            /* renamed from: k */
            public static final C0303a f22058k = new C0303a();

            C0303a() {
                super(2);
            }

            /* renamed from: a */
            public final CoroutineContext invoke(CoroutineContext acc, AbstractC9924b element) {
                C12887c cVar;
                C9971q.m14633g(acc, "acc");
                C9971q.m14633g(element, "element");
                CoroutineContext j0 = acc.mo3483j0(element.getKey());
                C12893f fVar = C12893f.f28966k;
                if (j0 == fVar) {
                    return element;
                }
                AbstractC12889d.C12891b bVar = AbstractC12889d.f28964h;
                AbstractC12889d dVar = (AbstractC12889d) j0.mo3484i(bVar);
                if (dVar == null) {
                    cVar = new C12887c(j0, element);
                } else {
                    CoroutineContext j02 = j0.mo3483j0(bVar);
                    if (j02 == fVar) {
                        return new C12887c(element, dVar);
                    }
                    cVar = new C12887c(new C12887c(j02, element), dVar);
                }
                return cVar;
            }
        }

        /* renamed from: a */
        public static CoroutineContext m14712a(CoroutineContext coroutineContext, CoroutineContext context) {
            C9971q.m14633g(context, "context");
            if (context == C12893f.f28966k) {
                return coroutineContext;
            }
            return (CoroutineContext) context.mo3482w0(coroutineContext, C0303a.f22058k);
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m15073d2 = {"Lkotlin/coroutines/CoroutineContext$b;", "Lkotlin/coroutines/CoroutineContext;", "E", "Lkotlin/coroutines/CoroutineContext$c;", "key", "i", "(Lkotlin/coroutines/CoroutineContext$c;)Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$c;", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: kotlin.coroutines.CoroutineContext$b */
    /* loaded from: classes8.dex */
    public interface AbstractC9924b extends CoroutineContext {

        @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* renamed from: kotlin.coroutines.CoroutineContext$b$a */
        /* loaded from: classes8.dex */
        public static final class C9925a {
            /* renamed from: a */
            public static <R> R m14710a(AbstractC9924b bVar, R r, Function2<? super R, ? super AbstractC9924b, ? extends R> operation) {
                C9971q.m14633g(operation, "operation");
                return (R) operation.invoke(r, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: b */
            public static <E extends AbstractC9924b> E m14709b(AbstractC9924b bVar, AbstractC9926c<E> key) {
                C9971q.m14633g(key, "key");
                if (!C9971q.m14638b(bVar.getKey(), key)) {
                    return null;
                }
                C9971q.m14635e(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            /* renamed from: c */
            public static CoroutineContext m14708c(AbstractC9924b bVar, AbstractC9926c<?> key) {
                C9971q.m14633g(key, "key");
                if (C9971q.m14638b(bVar.getKey(), key)) {
                    return C12893f.f28966k;
                }
                return bVar;
            }

            /* renamed from: d */
            public static CoroutineContext m14707d(AbstractC9924b bVar, CoroutineContext context) {
                C9971q.m14633g(context, "context");
                return C9923a.m14712a(bVar, context);
            }
        }

        AbstractC9926c<?> getKey();

        @Override // kotlin.coroutines.CoroutineContext
        /* renamed from: i */
        <E extends AbstractC9924b> E mo3484i(AbstractC9926c<E> cVar);
    }

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, m15073d2 = {"Lkotlin/coroutines/CoroutineContext$c;", "Lkotlin/coroutines/CoroutineContext$b;", "E", "", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: kotlin.coroutines.CoroutineContext$c */
    /* loaded from: classes8.dex */
    public interface AbstractC9926c<E extends AbstractC9924b> {
    }

    /* renamed from: f0 */
    CoroutineContext mo3485f0(CoroutineContext coroutineContext);

    /* renamed from: i */
    <E extends AbstractC9924b> E mo3484i(AbstractC9926c<E> cVar);

    /* renamed from: j0 */
    CoroutineContext mo3483j0(AbstractC9926c<?> cVar);

    /* renamed from: w0 */
    <R> R mo3482w0(R r, Function2<? super R, ? super AbstractC9924b, ? extends R> function2);
}
