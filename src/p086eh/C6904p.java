package p086eh;

import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import p249nh.C11137c;

/* renamed from: eh.p */
/* loaded from: classes8.dex */
public final class C6904p {
    /* renamed from: a */
    private static final boolean m23944a(AbstractC6906r rVar) {
        Object t0;
        AbstractC6912x xVar;
        C11137c e;
        t0 = C9914r.m14745t0(rVar.mo3975i());
        AbstractC6888b0 b0Var = (AbstractC6888b0) t0;
        AbstractC6898j jVar = null;
        if (b0Var != null) {
            xVar = b0Var.getType();
        } else {
            xVar = null;
        }
        if (xVar instanceof AbstractC6898j) {
            jVar = (AbstractC6898j) xVar;
        }
        if (jVar == null) {
            return false;
        }
        AbstractC6897i d = jVar.mo3995d();
        if (!(d instanceof AbstractC6895g) || (e = ((AbstractC6895g) d).mo4017e()) == null || !C9971q.m14638b(e.m10803b(), "java.lang.Object")) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r0.equals("toString") != false) goto L_0x003b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        return r3.mo3975i().isEmpty();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r0.equals("hashCode") == false) goto L_0x0044;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean m23943b(p086eh.AbstractC6906r r3) {
        /*
            nh.f r0 = r3.getName()
            java.lang.String r0 = r0.m10771b()
            int r1 = r0.hashCode()
            r2 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            if (r1 == r2) goto L_0x0033
            r2 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
            if (r1 == r2) goto L_0x0025
            r2 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r1 == r2) goto L_0x001c
            goto L_0x0044
        L_0x001c:
            java.lang.String r1 = "hashCode"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003b
            goto L_0x0044
        L_0x0025:
            java.lang.String r1 = "equals"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002e
            goto L_0x0044
        L_0x002e:
            boolean r3 = m23944a(r3)
            goto L_0x0045
        L_0x0033:
            java.lang.String r1 = "toString"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0044
        L_0x003b:
            java.util.List r3 = r3.mo3975i()
            boolean r3 = r3.isEmpty()
            goto L_0x0045
        L_0x0044:
            r3 = 0
        L_0x0045:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p086eh.C6904p.m23943b(eh.r):boolean");
    }

    /* renamed from: c */
    public static final boolean m23942c(AbstractC6905q qVar) {
        C9971q.m14633g(qVar, "<this>");
        if (!qVar.mo3984O().mo4027J() || !(qVar instanceof AbstractC6906r) || !m23943b((AbstractC6906r) qVar)) {
            return false;
        }
        return true;
    }
}
