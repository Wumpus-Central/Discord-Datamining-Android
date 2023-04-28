package kotlinx.coroutines;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.Sequence;
import nf.C11067f;
import nf.C11090s;
import nf.C11093t;
import p306qi.C12193m;
import p306qi.C12200o;

@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\"\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\n"}, m15073d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "a", "", "Lkotlinx/coroutines/g0;", "Ljava/util/List;", "handlers", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.h0 */
/* loaded from: classes8.dex */
public final class C10073h0 {

    /* renamed from: a */
    private static final List<AbstractC10068g0> f22260a;

    static {
        Sequence c;
        List<AbstractC10068g0> E;
        c = C12193m.m7450c(ServiceLoader.load(AbstractC10068g0.class, AbstractC10068g0.class.getClassLoader()).iterator());
        E = C12200o.m7436E(c);
        f22260a = E;
    }

    /* renamed from: a */
    public static final void m14352a(CoroutineContext coroutineContext, Throwable th2) {
        for (AbstractC10068g0 g0Var : f22260a) {
            try {
                g0Var.mo4547b0(coroutineContext, th2);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, C10077i0.m14349b(th2, th3));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            C11090s.C11091a aVar = C11090s.f24606l;
            C11067f.m10981a(th2, new C10214u0(coroutineContext));
            C11090s.m10940b(Unit.f22042a);
        } catch (Throwable th4) {
            C11090s.C11091a aVar2 = C11090s.f24606l;
            C11090s.m10940b(C11093t.m10931a(th4));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }
}
