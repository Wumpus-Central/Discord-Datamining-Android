package fi;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p087ei.AbstractC6944n;
import p217lg.AbstractC10420h;
import p268og.AbstractC11313e;
import p268og.AbstractC11326h;
import p268og.AbstractC11346m;
import p286pi.C11768e;
import p388vh.C13508c;

/* renamed from: fi.b */
/* loaded from: classes8.dex */
public abstract class AbstractC7225b extends AbstractC7257g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7225b(AbstractC6944n nVar) {
        super(nVar);
        if (nVar == null) {
            m23168v(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m23168v(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto L_0x000c
            if (r9 == r1) goto L_0x000c
            if (r9 == r0) goto L_0x000c
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L_0x000e
        L_0x000c:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        L_0x000e:
            r4 = 2
            if (r9 == r2) goto L_0x0017
            if (r9 == r1) goto L_0x0017
            if (r9 == r0) goto L_0x0017
            r5 = r1
            goto L_0x0018
        L_0x0017:
            r5 = r4
        L_0x0018:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L_0x002f
            if (r9 == r4) goto L_0x002a
            if (r9 == r1) goto L_0x002f
            if (r9 == r0) goto L_0x002f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L_0x0031
        L_0x002a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L_0x0031
        L_0x002f:
            r5[r7] = r6
        L_0x0031:
            if (r9 == r2) goto L_0x003f
            if (r9 == r1) goto L_0x003a
            if (r9 == r0) goto L_0x003a
            r5[r2] = r6
            goto L_0x0043
        L_0x003a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L_0x0043
        L_0x003f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L_0x0043:
            if (r9 == r2) goto L_0x0054
            if (r9 == r4) goto L_0x0050
            if (r9 == r1) goto L_0x0054
            if (r9 == r0) goto L_0x0054
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L_0x0054
        L_0x0050:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L_0x0054:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L_0x0064
            if (r9 == r1) goto L_0x0064
            if (r9 == r0) goto L_0x0064
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L_0x0069
        L_0x0064:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L_0x0069:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: fi.AbstractC7225b.m23168v(int):void");
    }

    @Override // fi.AbstractC7294m
    /* renamed from: e */
    protected boolean mo6387e(AbstractC11326h hVar) {
        if (hVar == null) {
            m23168v(2);
        }
        if (!(hVar instanceof AbstractC11313e) || !m23007c(mo12762w(), hVar)) {
            return false;
        }
        return true;
    }

    @Override // fi.AbstractC7257g
    /* renamed from: i */
    protected AbstractC7267g0 mo6385i() {
        if (AbstractC10420h.m13364t0(mo12762w())) {
            return null;
        }
        return mo4567n().m13387i();
    }

    @Override // fi.AbstractC7257g
    /* renamed from: j */
    protected Collection<AbstractC7267g0> mo23077j(boolean z) {
        AbstractC11346m b = mo12762w().mo6104b();
        if (!(b instanceof AbstractC11313e)) {
            List emptyList = Collections.emptyList();
            if (emptyList == null) {
                m23168v(3);
            }
            return emptyList;
        }
        C11768e eVar = new C11768e();
        AbstractC11313e eVar2 = (AbstractC11313e) b;
        eVar.add(eVar2.mo6166p());
        AbstractC11313e j0 = eVar2.mo6112j0();
        if (z && j0 != null) {
            eVar.add(j0.mo6166p());
        }
        return eVar;
    }

    @Override // fi.AbstractC7268g1
    /* renamed from: n */
    public AbstractC10420h mo4567n() {
        AbstractC10420h j = C13508c.m3531j(mo12762w());
        if (j == null) {
            m23168v(1);
        }
        return j;
    }

    /* renamed from: w */
    public abstract AbstractC11313e mo12762w();
}
