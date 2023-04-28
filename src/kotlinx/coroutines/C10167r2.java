package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nR(\u0010\u000f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u0011"}, m15073d2 = {"Lkotlinx/coroutines/r2;", "", "Lkotlinx/coroutines/e1;", "a", "()Lkotlinx/coroutines/e1;", "", "c", "()V", "eventLoop", "d", "(Lkotlinx/coroutines/e1;)V", "Ljava/lang/ThreadLocal;", "Lkotlinx/coroutines/internal/CommonThreadLocal;", "b", "Ljava/lang/ThreadLocal;", "ref", "<init>", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.r2 */
/* loaded from: classes8.dex */
public final class C10167r2 {

    /* renamed from: a */
    public static final C10167r2 f22370a = new C10167r2();

    /* renamed from: b */
    private static final ThreadLocal<AbstractC10022e1> f22371b = new ThreadLocal<>();

    private C10167r2() {
    }

    /* renamed from: a */
    public final AbstractC10022e1 m14103a() {
        return f22371b.get();
    }

    /* renamed from: b */
    public final AbstractC10022e1 m14102b() {
        ThreadLocal<AbstractC10022e1> threadLocal = f22371b;
        AbstractC10022e1 e1Var = threadLocal.get();
        if (e1Var != null) {
            return e1Var;
        }
        AbstractC10022e1 a = C10074h1.m14351a();
        threadLocal.set(a);
        return a;
    }

    /* renamed from: c */
    public final void m14101c() {
        f22371b.set(null);
    }

    /* renamed from: d */
    public final void m14100d(AbstractC10022e1 e1Var) {
        f22371b.set(e1Var);
    }
}
