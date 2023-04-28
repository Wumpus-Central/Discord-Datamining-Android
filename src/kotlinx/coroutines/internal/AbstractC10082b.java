package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H&R&\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m15073d2 = {"Lkotlinx/coroutines/internal/b;", "", "Lkotlinx/coroutines/internal/d;", "op", "c", "failure", "", "a", "Lkotlinx/coroutines/internal/d;", "b", "()Lkotlinx/coroutines/internal/d;", "d", "(Lkotlinx/coroutines/internal/d;)V", "atomicOp", "<init>", "()V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.b */
/* loaded from: classes8.dex */
public abstract class AbstractC10082b {

    /* renamed from: a */
    public AbstractC10086d<?> f22268a;

    /* renamed from: a */
    public abstract void mo14243a(AbstractC10086d<?> dVar, Object obj);

    /* renamed from: b */
    public final AbstractC10086d<?> m14338b() {
        AbstractC10086d<?> dVar = this.f22268a;
        if (dVar != null) {
            return dVar;
        }
        C9971q.m14615y("atomicOp");
        return null;
    }

    /* renamed from: c */
    public abstract Object mo14242c(AbstractC10086d<?> dVar);

    /* renamed from: d */
    public final void m14337d(AbstractC10086d<?> dVar) {
        this.f22268a = dVar;
    }
}
