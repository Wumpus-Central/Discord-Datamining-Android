package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.AbstractC10163q2;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0006\u001a\u00020\u00052\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR$\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, m15073d2 = {"Lkotlinx/coroutines/internal/k0;", "", "Lkotlinx/coroutines/q2;", "element", "value", "", "a", "Lkotlin/coroutines/CoroutineContext;", "context", "b", "Lkotlin/coroutines/CoroutineContext;", "", "[Ljava/lang/Object;", "values", "c", "[Lkotlinx/coroutines/q2;", "elements", "", "d", "I", "i", "n", "<init>", "(Lkotlin/coroutines/CoroutineContext;I)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.k0 */
/* loaded from: classes8.dex */
public final class C10104k0 {

    /* renamed from: a */
    public final CoroutineContext f22296a;

    /* renamed from: b */
    private final Object[] f22297b;

    /* renamed from: c */
    private final AbstractC10163q2<Object>[] f22298c;

    /* renamed from: d */
    private int f22299d;

    public C10104k0(CoroutineContext coroutineContext, int i) {
        this.f22296a = coroutineContext;
        this.f22297b = new Object[i];
        this.f22298c = new AbstractC10163q2[i];
    }

    /* renamed from: a */
    public final void m14272a(AbstractC10163q2<?> q2Var, Object obj) {
        Object[] objArr = this.f22297b;
        int i = this.f22299d;
        objArr[i] = obj;
        AbstractC10163q2<Object>[] q2VarArr = this.f22298c;
        this.f22299d = i + 1;
        q2VarArr[i] = q2Var;
    }

    /* renamed from: b */
    public final void m14271b(CoroutineContext coroutineContext) {
        int length = this.f22298c.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                AbstractC10163q2<Object> q2Var = this.f22298c[length];
                C9971q.m14636d(q2Var);
                q2Var.m14109U(coroutineContext, this.f22297b[length]);
                if (i >= 0) {
                    length = i;
                } else {
                    return;
                }
            }
        }
    }
}
