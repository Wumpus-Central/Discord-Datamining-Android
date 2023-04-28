package p142hi;

import fi.AbstractC7299n1;
import fi.C7309p1;
import gi.AbstractC7664g;
import kotlin.jvm.internal.C9971q;
import p268og.AbstractC11313e;
import p324rg.C12608h;
import p448yh.AbstractC14411h;

/* renamed from: hi.a */
/* loaded from: classes8.dex */
public final class C8028a extends C12608h {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C8028a(p249nh.C11142f r21) {
        /*
            r20 = this;
            r9 = r20
            java.lang.String r0 = "name"
            r2 = r21
            kotlin.jvm.internal.C9971q.m14633g(r2, r0)
            hi.k r10 = p142hi.C8039k.f17408a
            og.h0 r1 = r10.m20769i()
            og.e0 r3 = p268og.EnumC11314e0.OPEN
            og.f r4 = p268og.EnumC11317f.CLASS
            java.util.List r5 = kotlin.collections.C9904h.m14862i()
            og.a1 r11 = p268og.AbstractC11299a1.f25230a
            r7 = 0
            ei.n r8 = p087ei.C6920f.f15067e
            r0 = r20
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            pg.g$a r0 = pg.AbstractC11672g.f26044g
            pg.g r0 = r0.m9048b()
            r1 = 1
            rg.f r0 = p324rg.C12604f.m6371n1(r9, r0, r1, r11)
            java.util.List r2 = kotlin.collections.C9904h.m14862i()
            og.u r3 = p268og.C11373t.f25298d
            r0.m6369q1(r2, r3)
            java.lang.String r2 = "create(this, Annotations…          )\n            }"
            kotlin.jvm.internal.C9971q.m14634f(r0, r2)
            hi.g r2 = p142hi.EnumC8035g.SCOPE_FOR_ERROR_CLASS
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            nh.f r4 = r0.getName()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "errorConstructor.name.toString()"
            kotlin.jvm.internal.C9971q.m14634f(r4, r5)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = ""
            r3[r1] = r4
            hi.f r1 = p142hi.C8039k.m20776b(r2, r3)
            hi.h r2 = new hi.h
            hi.j r14 = p142hi.EnumC8038j.ERROR_CLASS
            java.lang.String[] r3 = new java.lang.String[r5]
            hi.i r12 = r10.m20773e(r14, r3)
            r15 = 0
            r16 = 0
            java.lang.String[] r3 = new java.lang.String[r5]
            r18 = 24
            r19 = 0
            r11 = r2
            r13 = r1
            r17 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r0.m6244g1(r2)
            java.util.Set r2 = kotlin.collections.C9919u.m14735c(r0)
            r9.m6359K0(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p142hi.C8028a.<init>(nh.f):void");
    }

    @Override // p324rg.AbstractC12582a
    /* renamed from: G0 */
    public AbstractC11313e mo6167c(C7309p1 substitutor) {
        C9971q.m14633g(substitutor, "substitutor");
        return this;
    }

    @Override // p324rg.AbstractC12582a, p324rg.AbstractC12644t
    /* renamed from: I */
    public AbstractC14411h mo6163I(AbstractC7299n1 typeSubstitution, AbstractC7664g kotlinTypeRefiner) {
        C9971q.m14633g(typeSubstitution, "typeSubstitution");
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        EnumC8035g gVar = EnumC8035g.SCOPE_FOR_ERROR_CLASS;
        String fVar = getName().toString();
        C9971q.m14634f(fVar, "name.toString()");
        return C8039k.m20776b(gVar, fVar, typeSubstitution.toString());
    }

    @Override // p324rg.C12608h
    public String toString() {
        String b = getName().m10771b();
        C9971q.m14634f(b, "name.asString()");
        return b;
    }
}
