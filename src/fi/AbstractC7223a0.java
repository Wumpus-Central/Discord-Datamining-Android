package fi;

import java.util.List;
import kotlin.jvm.internal.C9971q;
import p182ji.AbstractC9616g;
import p305qh.AbstractC12137c;
import p305qh.AbstractC12161f;
import p448yh.AbstractC14411h;

/* renamed from: fi.a0 */
/* loaded from: classes8.dex */
public abstract class AbstractC7223a0 extends AbstractC7335v1 implements AbstractC9616g {

    /* renamed from: l */
    private final AbstractC7304o0 f15663l;

    /* renamed from: m */
    private final AbstractC7304o0 f15664m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7223a0(AbstractC7304o0 lowerBound, AbstractC7304o0 upperBound) {
        super(null);
        C9971q.m14633g(lowerBound, "lowerBound");
        C9971q.m14633g(upperBound, "upperBound");
        this.f15663l = lowerBound;
        this.f15664m = upperBound;
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: L0 */
    public List<AbstractC7290k1> mo5174L0() {
        return mo22897U0().mo5174L0();
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: M0 */
    public C7232c1 mo5173M0() {
        return mo22897U0().mo5173M0();
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: N0 */
    public AbstractC7268g1 mo5172N0() {
        return mo22897U0().mo5172N0();
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: O0 */
    public boolean mo5171O0() {
        return mo22897U0().mo5171O0();
    }

    /* renamed from: U0 */
    public abstract AbstractC7304o0 mo22897U0();

    /* renamed from: V0 */
    public final AbstractC7304o0 m23170V0() {
        return this.f15663l;
    }

    /* renamed from: W0 */
    public final AbstractC7304o0 m23169W0() {
        return this.f15664m;
    }

    /* renamed from: X0 */
    public abstract String mo22896X0(AbstractC12137c cVar, AbstractC12161f fVar);

    @Override // fi.AbstractC7267g0
    /* renamed from: o */
    public AbstractC14411h mo5161o() {
        return mo22897U0().mo5161o();
    }

    public String toString() {
        return AbstractC12137c.f27233j.mo7613w(this);
    }
}
