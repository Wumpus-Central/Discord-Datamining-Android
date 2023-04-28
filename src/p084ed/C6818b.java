package p084ed;

import p066dd.AbstractC6443l;

/* renamed from: ed.b */
/* loaded from: classes3.dex */
public final class C6818b implements AbstractC6443l {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e A[LOOP:0: B:28:0x005c->B:29:0x005e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    @Override // p066dd.AbstractC6443l
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.zxing.Result mo1767a(p066dd.C6434c r11, java.util.Map<p066dd.EnumC6436e, ?> r12) {
        /*
            r10 = this;
            gd.a r0 = new gd.a
            hd.b r11 = r11.m25568a()
            r0.<init>(r11)
            r11 = 0
            r1 = 0
            ed.a r2 = r0.m21972a(r11)     // Catch: f -> 0x0025, j -> 0x002b
            dd.o[] r3 = r2.m20892b()     // Catch: f -> 0x0025, j -> 0x002b
            fd.a r4 = new fd.a     // Catch: f -> 0x0021, j -> 0x0023
            r4.<init>()     // Catch: f -> 0x0021, j -> 0x0023
            hd.e r2 = r4.m23348c(r2)     // Catch: f -> 0x0021, j -> 0x0023
            r4 = r3
            r3 = r1
            r1 = r2
            r2 = r3
            goto L_0x002f
        L_0x0021:
            r2 = move-exception
            goto L_0x0027
        L_0x0023:
            r2 = move-exception
            goto L_0x002d
        L_0x0025:
            r2 = move-exception
            r3 = r1
        L_0x0027:
            r4 = r3
            r3 = r2
            r2 = r1
            goto L_0x002f
        L_0x002b:
            r2 = move-exception
            r3 = r1
        L_0x002d:
            r4 = r3
            r3 = r1
        L_0x002f:
            if (r1 != 0) goto L_0x004e
            r1 = 1
            ed.a r0 = r0.m21972a(r1)     // Catch: f -> 0x0044, j -> 0x0046
            dd.o[] r4 = r0.m20892b()     // Catch: f -> 0x0044, j -> 0x0046
            fd.a r1 = new fd.a     // Catch: f -> 0x0044, j -> 0x0046
            r1.<init>()     // Catch: f -> 0x0044, j -> 0x0046
            hd.e r1 = r1.m23348c(r0)     // Catch: f -> 0x0044, j -> 0x0046
            goto L_0x004e
        L_0x0044:
            r11 = move-exception
            goto L_0x0047
        L_0x0046:
            r11 = move-exception
        L_0x0047:
            if (r2 != 0) goto L_0x004d
            if (r3 == 0) goto L_0x004c
            throw r3
        L_0x004c:
            throw r11
        L_0x004d:
            throw r2
        L_0x004e:
            r6 = r4
            if (r12 == 0) goto L_0x0066
            dd.e r0 = p066dd.EnumC6436e.NEED_RESULT_POINT_CALLBACK
            java.lang.Object r12 = r12.get(r0)
            dd.p r12 = (p066dd.AbstractC6447p) r12
            if (r12 == 0) goto L_0x0066
            int r0 = r6.length
        L_0x005c:
            if (r11 >= r0) goto L_0x0066
            r2 = r6[r11]
            r12.m25542a(r2)
            int r11 = r11 + 1
            goto L_0x005c
        L_0x0066:
            com.google.zxing.Result r11 = new com.google.zxing.Result
            java.lang.String r3 = r1.m20899h()
            byte[] r4 = r1.m20902e()
            int r5 = r1.m20904c()
            dd.a r7 = p066dd.EnumC6432a.AZTEC
            long r8 = java.lang.System.currentTimeMillis()
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.util.List r12 = r1.m20906a()
            if (r12 == 0) goto L_0x0089
            dd.n r0 = p066dd.EnumC6445n.BYTE_SEGMENTS
            r11.m27001h(r0, r12)
        L_0x0089:
            java.lang.String r12 = r1.m20905b()
            if (r12 == 0) goto L_0x0094
            dd.n r0 = p066dd.EnumC6445n.ERROR_CORRECTION_LEVEL
            r11.m27001h(r0, r12)
        L_0x0094:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p084ed.C6818b.mo1767a(dd.c, java.util.Map):com.google.zxing.Result");
    }

    @Override // p066dd.AbstractC6443l
    public void reset() {
    }
}
