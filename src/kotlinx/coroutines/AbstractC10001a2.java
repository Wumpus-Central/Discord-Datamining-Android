package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m15073d2 = {"Lkotlinx/coroutines/a2;", "Lkotlinx/coroutines/b0;", "Lkotlinx/coroutines/a1;", "Lkotlinx/coroutines/p1;", "", "dispose", "", "toString", "Lkotlinx/coroutines/b2;", "n", "Lkotlinx/coroutines/b2;", "X", "()Lkotlinx/coroutines/b2;", "Y", "(Lkotlinx/coroutines/b2;)V", "job", "", "b", "()Z", "isActive", "Lkotlinx/coroutines/g2;", "d", "()Lkotlinx/coroutines/g2;", "list", "<init>", "()V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.a2 */
/* loaded from: classes8.dex */
public abstract class AbstractC10001a2 extends AbstractC10003b0 implements AbstractC10000a1, AbstractC10158p1 {

    /* renamed from: n */
    public C10005b2 f22125n;

    /* renamed from: X */
    public final C10005b2 m14564X() {
        C10005b2 b2Var = this.f22125n;
        if (b2Var != null) {
            return b2Var;
        }
        C9971q.m14615y("job");
        return null;
    }

    /* renamed from: Y */
    public final void m14563Y(C10005b2 b2Var) {
        this.f22125n = b2Var;
    }

    @Override // kotlinx.coroutines.AbstractC10158p1
    /* renamed from: b */
    public boolean mo14113b() {
        return true;
    }

    @Override // kotlinx.coroutines.AbstractC10158p1
    /* renamed from: d */
    public C10071g2 mo14112d() {
        return null;
    }

    @Override // kotlinx.coroutines.AbstractC10000a1
    public void dispose() {
        m14564X().m14558C0(this);
    }

    @Override // kotlinx.coroutines.internal.C10110p
    public String toString() {
        return C10149n0.m14165a(this) + '@' + C10149n0.m14164b(this) + "[job@" + C10149n0.m14164b(m14564X()) + ']';
    }
}
