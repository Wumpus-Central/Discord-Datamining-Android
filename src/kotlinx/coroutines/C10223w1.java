package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0003H\u0003R\u001a\u0010\t\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00038PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u0010"}, m15073d2 = {"Lkotlinx/coroutines/w1;", "Lkotlinx/coroutines/b2;", "Lkotlinx/coroutines/x;", "", "Q0", "l", "Z", "a0", "()Z", "handlesException", "c0", "onCancelComplete", "Lkotlinx/coroutines/Job;", "parent", "<init>", "(Lkotlinx/coroutines/Job;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.w1 */
/* loaded from: classes8.dex */
public class C10223w1 extends C10005b2 implements AbstractC10225x {

    /* renamed from: l */
    private final boolean f22473l = m13971Q0();

    public C10223w1(Job job) {
        super(true);
        m14523k0(job);
    }

    /* renamed from: Q0 */
    private final boolean m13971Q0() {
        C10217v vVar;
        C10005b2 X;
        C10217v vVar2;
        AbstractC10213u e0 = m14527e0();
        if (e0 instanceof C10217v) {
            vVar = (C10217v) e0;
        } else {
            vVar = null;
        }
        if (!(vVar == null || (X = vVar.m14564X()) == null)) {
            while (!X.mo13970a0()) {
                AbstractC10213u e02 = X.m14527e0();
                if (e02 instanceof C10217v) {
                    vVar2 = (C10217v) e02;
                } else {
                    vVar2 = null;
                }
                if (vVar2 != null) {
                    X = vVar2.m14564X();
                    if (X == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.C10005b2
    /* renamed from: a0 */
    public boolean mo13970a0() {
        return this.f22473l;
    }

    @Override // kotlinx.coroutines.C10005b2
    /* renamed from: c0 */
    public boolean mo13969c0() {
        return true;
    }
}
