package p070di;

import bi.C3566d0;
import bi.C3588m;
import fi.AbstractC7267g0;
import java.util.ArrayList;
import java.util.List;
import kh.C9878f;
import kotlin.collections.C9905i;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import p159ih.C8593q;
import p159ih.C8603s;
import p324rg.AbstractC12588b;
import p388vh.C13508c;
import pg.AbstractC11666c;

/* renamed from: di.m */
/* loaded from: classes8.dex */
public final class C6508m extends AbstractC12588b {

    /* renamed from: u */
    private final C3588m f13650u;

    /* renamed from: v */
    private final C8603s f13651v;

    /* renamed from: w */
    private final C6464a f13652w;

    /* renamed from: di.m$a */
    /* loaded from: classes8.dex */
    static final class C6509a extends AbstractC9973s implements Function0<List<? extends AbstractC11666c>> {
        C6509a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends AbstractC11666c> invoke() {
            List<? extends AbstractC11666c> D0;
            D0 = C9914r.m14790D0(C6508m.this.f13650u.m34019c().m34046d().mo21930g(C6508m.this.m25396O0(), C6508m.this.f13650u.m34015g()));
            return D0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C6508m(bi.C3588m r12, p159ih.C8603s r13, int r14) {
        /*
            r11 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.C9971q.m14633g(r12, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.C9971q.m14633g(r13, r0)
            ei.n r2 = r12.m34014h()
            og.m r3 = r12.m34017e()
            pg.g$a r0 = pg.AbstractC11672g.f26044g
            pg.g r4 = r0.m9048b()
            kh.c r0 = r12.m34015g()
            int r1 = r13.m18654O()
            nh.f r5 = bi.C3613x.m33979b(r0, r1)
            bi.a0 r0 = bi.C3557a0.f5765a
            ih.s$c r1 = r13.m18648U()
            java.lang.String r6 = "proto.variance"
            kotlin.jvm.internal.C9971q.m14634f(r1, r6)
            fi.w1 r6 = r0.m34102d(r1)
            boolean r7 = r13.m18653P()
            og.a1 r9 = p268og.AbstractC11299a1.f25230a
            og.d1$a r10 = p268og.AbstractC11311d1.C11312a.f25241a
            r1 = r11
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f13650u = r12
            r11.f13651v = r13
            di.a r13 = new di.a
            ei.n r12 = r12.m34014h()
            di.m$a r14 = new di.m$a
            r14.<init>()
            r13.<init>(r12, r14)
            r11.f13652w = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p070di.C6508m.<init>(bi.m, ih.s, int):void");
    }

    @Override // p324rg.AbstractC12598e
    /* renamed from: L0 */
    protected List<AbstractC7267g0> mo6334L0() {
        int t;
        List<AbstractC7267g0> d;
        List<C8593q> s = C9878f.m15112s(this.f13651v, this.f13650u.m34012j());
        if (s.isEmpty()) {
            d = C9905i.m14825d(C13508c.m3531j(this).m13356y());
            return d;
        }
        C3566d0 i = this.f13650u.m34013i();
        t = C9907k.m14809t(s, 10);
        ArrayList arrayList = new ArrayList(t);
        for (C8593q qVar : s) {
            arrayList.add(i.m34081q(qVar));
        }
        return arrayList;
    }

    /* renamed from: N0 */
    public C6464a getAnnotations() {
        return this.f13652w;
    }

    /* renamed from: O0 */
    public final C8603s m25396O0() {
        return this.f13651v;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: P0 */
    public Void mo6335K0(AbstractC7267g0 type) {
        C9971q.m14633g(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
