package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.internal.C10092g;
import kotlinx.coroutines.internal.C10107m;
import kotlinx.coroutines.internal.RunnableC10105l;
import p339sf.AbstractC12885a;
import p339sf.AbstractC12886b;
import p339sf.AbstractC12889d;

@Metadata(m15074d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u001c\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\f\u001a\u00060\nj\u0002`\u000bH&J\u001c\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0017J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0012\u0010\u0014\u001a\u00020\r2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011J\b\u0010\u0016\u001a\u00020\u0015H\u0016¨\u0006\u001a"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineDispatcher;", "Lsf/a;", "Lsf/d;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "I0", "", "parallelism", "J0", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "G0", "H0", "T", "Lkotlin/coroutines/Continuation;", "continuation", "p", "l", "", "toString", "<init>", "()V", "a", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* loaded from: classes8.dex */
public abstract class CoroutineDispatcher extends AbstractC12885a implements AbstractC12889d {

    /* renamed from: l */
    public static final C9995a f22118l = new C9995a(null);

    @Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineDispatcher$a;", "Lsf/b;", "Lsf/d;", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "()V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.CoroutineDispatcher$a */
    /* loaded from: classes8.dex */
    public static final class C9995a extends AbstractC12886b<AbstractC12889d, CoroutineDispatcher> {

        @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"Lkotlin/coroutines/CoroutineContext$b;", "it", "Lkotlinx/coroutines/CoroutineDispatcher;", "a", "(Lkotlin/coroutines/CoroutineContext$b;)Lkotlinx/coroutines/CoroutineDispatcher;"}, m15072k = 3, m15071mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.CoroutineDispatcher$a$a */
        /* loaded from: classes8.dex */
        static final class C0306a extends AbstractC9973s implements Function1<CoroutineContext.AbstractC9924b, CoroutineDispatcher> {

            /* renamed from: k */
            public static final C0306a f22119k = new C0306a();

            C0306a() {
                super(1);
            }

            /* renamed from: a */
            public final CoroutineDispatcher invoke(CoroutineContext.AbstractC9924b bVar) {
                if (bVar instanceof CoroutineDispatcher) {
                    return (CoroutineDispatcher) bVar;
                }
                return null;
            }
        }

        private C9995a() {
            super(AbstractC12889d.f28964h, C0306a.f22119k);
        }

        public /* synthetic */ C9995a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CoroutineDispatcher() {
        super(AbstractC12889d.f28964h);
    }

    /* renamed from: G0 */
    public abstract void mo4546G0(CoroutineContext coroutineContext, Runnable runnable);

    /* renamed from: H0 */
    public void mo14052H0(CoroutineContext coroutineContext, Runnable runnable) {
        mo4546G0(coroutineContext, runnable);
    }

    /* renamed from: I0 */
    public boolean mo4545I0(CoroutineContext coroutineContext) {
        return true;
    }

    /* renamed from: J0 */
    public CoroutineDispatcher m14573J0(int i) {
        C10107m.m14268a(i);
        return new RunnableC10105l(this, i);
    }

    @Override // p339sf.AbstractC12885a, kotlin.coroutines.CoroutineContext.AbstractC9924b, kotlin.coroutines.CoroutineContext
    /* renamed from: i */
    public <E extends CoroutineContext.AbstractC9924b> E mo3484i(CoroutineContext.AbstractC9926c<E> cVar) {
        return (E) AbstractC12889d.C12890a.m5181a(this, cVar);
    }

    @Override // p339sf.AbstractC12885a, kotlin.coroutines.CoroutineContext
    /* renamed from: j0 */
    public CoroutineContext mo3483j0(CoroutineContext.AbstractC9926c<?> cVar) {
        return AbstractC12889d.C12890a.m5180b(this, cVar);
    }

    @Override // p339sf.AbstractC12889d
    /* renamed from: l */
    public final void mo5183l(Continuation<?> continuation) {
        ((C10092g) continuation).m14314t();
    }

    @Override // p339sf.AbstractC12889d
    /* renamed from: p */
    public final <T> Continuation<T> mo5182p(Continuation<? super T> continuation) {
        return new C10092g(this, continuation);
    }

    public String toString() {
        return C10149n0.m14165a(this) + '@' + C10149n0.m14164b(this);
    }
}
