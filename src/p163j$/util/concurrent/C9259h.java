package p163j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.h */
/* loaded from: classes2.dex */
public final class C9259h extends C9264m {

    /* renamed from: e */
    final C9264m[] f20329e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9259h(C9264m[] mVarArr) {
        super(-1, null, null, null);
        this.f20329e = mVarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
        if ((r0 instanceof p163j$.util.concurrent.C9259h) == false) goto L_0x0030;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
        r0 = ((p163j$.util.concurrent.C9259h) r0).f20329e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:
        return r0.mo16560a(r5, r6);
     */
    @Override // p163j$.util.concurrent.C9264m
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p163j$.util.concurrent.C9264m mo16560a(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            j$.util.concurrent.m[] r0 = r4.f20329e
        L_0x0002:
            r1 = 0
            if (r6 == 0) goto L_0x0039
            if (r0 == 0) goto L_0x0039
            int r2 = r0.length
            if (r2 == 0) goto L_0x0039
            int r2 = r2 + (-1)
            r2 = r2 & r5
            j$.util.concurrent.m r0 = p163j$.util.concurrent.ConcurrentHashMap.tabAt(r0, r2)
            if (r0 != 0) goto L_0x0014
            goto L_0x0039
        L_0x0014:
            int r2 = r0.f20336a
            if (r2 != r5) goto L_0x0025
            java.lang.Object r3 = r0.f20337b
            if (r3 == r6) goto L_0x0024
            if (r3 == 0) goto L_0x0025
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0025
        L_0x0024:
            return r0
        L_0x0025:
            if (r2 >= 0) goto L_0x0035
            boolean r1 = r0 instanceof p163j$.util.concurrent.C9259h
            if (r1 == 0) goto L_0x0030
            j$.util.concurrent.h r0 = (p163j$.util.concurrent.C9259h) r0
            j$.util.concurrent.m[] r0 = r0.f20329e
            goto L_0x0002
        L_0x0030:
            j$.util.concurrent.m r5 = r0.mo16560a(r5, r6)
            return r5
        L_0x0035:
            j$.util.concurrent.m r0 = r0.f20339d
            if (r0 != 0) goto L_0x0014
        L_0x0039:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p163j$.util.concurrent.C9259h.mo16560a(int, java.lang.Object):j$.util.concurrent.m");
    }
}
