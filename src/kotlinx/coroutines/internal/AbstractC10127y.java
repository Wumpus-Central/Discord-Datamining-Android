package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlinx.coroutines.C10149n0;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000R\u001a\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m15073d2 = {"Lkotlinx/coroutines/internal/y;", "", "affected", "c", "", "toString", "that", "", "b", "Lkotlinx/coroutines/internal/d;", "a", "()Lkotlinx/coroutines/internal/d;", "atomicOp", "<init>", "()V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.y */
/* loaded from: classes8.dex */
public abstract class AbstractC10127y {
    /* renamed from: a */
    public abstract AbstractC10086d<?> mo14024a();

    /* renamed from: b */
    public final boolean m14199b(AbstractC10127y yVar) {
        AbstractC10086d<?> a;
        AbstractC10086d<?> a2 = mo14024a();
        if (a2 == null || (a = yVar.mo14024a()) == null || a2.mo14028g() >= a.mo14028g()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public abstract Object mo14023c(Object obj);

    public String toString() {
        return C10149n0.m14165a(this) + '@' + C10149n0.m14164b(this);
    }
}
