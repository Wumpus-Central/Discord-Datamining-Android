package net.time4j.history;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: net.time4j.history.n */
/* loaded from: classes8.dex */
public abstract class EnumC10944n extends Enum<EnumC10944n> {

    /* renamed from: k */
    public static final EnumC10944n f24301k;

    /* renamed from: l */
    public static final EnumC10944n f24302l;

    /* renamed from: m */
    public static final EnumC10944n f24303m;

    /* renamed from: n */
    public static final EnumC10944n f24304n;

    /* renamed from: o */
    public static final EnumC10944n f24305o;

    /* renamed from: p */
    public static final EnumC10944n f24306p;

    /* renamed from: q */
    public static final EnumC10944n f24307q;

    /* renamed from: r */
    public static final EnumC10944n f24308r;

    /* renamed from: s */
    public static final EnumC10944n f24309s;

    /* renamed from: t */
    private static final /* synthetic */ EnumC10944n[] f24310t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: net.time4j.history.n$a */
    /* loaded from: classes8.dex */
    static class C10945a extends EnumC10944n {
        C10945a(String str, int i) {
            super(str, i, null);
        }

        @Override // net.time4j.history.EnumC10944n
        /* renamed from: a */
        int mo11486a(C10954o oVar, C10934h hVar) {
            return hVar.m11542e();
        }

        @Override // net.time4j.history.EnumC10944n
        /* renamed from: b */
        C10934h mo11484b(EnumC10937j jVar, int i) {
            return C10934h.m11540g(jVar, i, 1, 1);
        }
    }

    static {
        C10945a aVar = new C10945a("BEGIN_OF_JANUARY", 0);
        f24301k = aVar;
        EnumC10944n bVar = new EnumC10944n("BEGIN_OF_MARCH", 1) { // from class: net.time4j.history.n.b
            @Override // net.time4j.history.EnumC10944n
            /* renamed from: b */
            C10934h mo11484b(EnumC10937j jVar, int i) {
                return C10934h.m11540g(jVar, i, 3, 1);
            }
        };
        f24302l = bVar;
        EnumC10944n cVar = new EnumC10944n("BEGIN_OF_SEPTEMBER", 2) { // from class: net.time4j.history.n.c
            @Override // net.time4j.history.EnumC10944n
            /* renamed from: a */
            int mo11486a(C10954o oVar, C10934h hVar) {
                EnumC10937j c = hVar.m11544c();
                int e = hVar.m11542e();
                int i = e + 1;
                if (hVar.compareTo(oVar.m11480d(c, i)) >= 0) {
                    return i;
                }
                return e;
            }

            @Override // net.time4j.history.EnumC10944n
            /* renamed from: b */
            C10934h mo11484b(EnumC10937j jVar, int i) {
                return C10934h.m11540g(jVar, i - 1, 9, 1);
            }
        };
        f24303m = cVar;
        EnumC10944n dVar = new EnumC10944n("CHRISTMAS_STYLE", 3) { // from class: net.time4j.history.n.d
            @Override // net.time4j.history.EnumC10944n
            /* renamed from: a */
            int mo11486a(C10954o oVar, C10934h hVar) {
                int e = hVar.m11542e();
                int i = e + 1;
                if (hVar.compareTo(oVar.m11480d(hVar.m11544c(), i)) >= 0) {
                    return i;
                }
                return e;
            }

            @Override // net.time4j.history.EnumC10944n
            /* renamed from: b */
            C10934h mo11484b(EnumC10937j jVar, int i) {
                return C10934h.m11540g(jVar, i - 1, 12, 25);
            }
        };
        f24304n = dVar;
        EnumC10944n eVar = new EnumC10944n("EASTER_STYLE", 4) { // from class: net.time4j.history.n.e
            @Override // net.time4j.history.EnumC10944n
            /* renamed from: b */
            C10934h mo11484b(EnumC10937j jVar, int i) {
                int i2;
                int a = EnumC10931e.EASTERN.m11555a(jVar.m11528a(i)) - 1;
                if (a > 31) {
                    a -= 31;
                    i2 = 4;
                } else {
                    i2 = 3;
                }
                return C10934h.m11540g(jVar, i, i2, a);
            }
        };
        f24305o = eVar;
        EnumC10944n fVar = new EnumC10944n("GOOD_FRIDAY", 5) { // from class: net.time4j.history.n.f
            @Override // net.time4j.history.EnumC10944n
            /* renamed from: b */
            C10934h mo11484b(EnumC10937j jVar, int i) {
                int i2;
                int a = EnumC10931e.EASTERN.m11555a(jVar.m11528a(i)) - 2;
                if (a > 31) {
                    a -= 31;
                    i2 = 4;
                } else {
                    i2 = 3;
                }
                return C10934h.m11540g(jVar, i, i2, a);
            }
        };
        f24306p = fVar;
        EnumC10944n gVar = new EnumC10944n("MARIA_ANUNCIATA", 6) { // from class: net.time4j.history.n.g
            @Override // net.time4j.history.EnumC10944n
            /* renamed from: b */
            C10934h mo11484b(EnumC10937j jVar, int i) {
                return C10934h.m11540g(jVar, i, 3, 25);
            }
        };
        f24307q = gVar;
        EnumC10944n hVar = new EnumC10944n("CALCULUS_PISANUS", 7) { // from class: net.time4j.history.n.h
            @Override // net.time4j.history.EnumC10944n
            /* renamed from: a */
            int mo11486a(C10954o oVar, C10934h hVar2) {
                int e = hVar2.m11542e() - 1;
                if (hVar2.compareTo(mo11484b(hVar2.m11544c(), e)) < 0) {
                    return e - 1;
                }
                return e;
            }

            @Override // net.time4j.history.EnumC10944n
            /* renamed from: b */
            C10934h mo11484b(EnumC10937j jVar, int i) {
                return EnumC10944n.f24307q.mo11484b(jVar, i + 1);
            }

            @Override // net.time4j.history.EnumC10944n
            /* renamed from: c */
            int mo11485c(boolean z, C10954o oVar, EnumC10937j jVar, int i, int i2, int i3) {
                return EnumC10944n.f24307q.mo11485c(z, oVar, jVar, i + 1, i2, i3);
            }
        };
        f24308r = hVar;
        EnumC10944n iVar = new EnumC10944n("EPIPHANY", 8) { // from class: net.time4j.history.n.i
            @Override // net.time4j.history.EnumC10944n
            /* renamed from: b */
            C10934h mo11484b(EnumC10937j jVar, int i) {
                return C10934h.m11540g(jVar, i, 1, 6);
            }
        };
        f24309s = iVar;
        f24310t = new EnumC10944n[]{aVar, bVar, cVar, dVar, eVar, fVar, gVar, hVar, iVar};
    }

    private EnumC10944n(String str, int i) {
    }

    public static EnumC10944n valueOf(String str) {
        return (EnumC10944n) Enum.valueOf(EnumC10944n.class, str);
    }

    public static EnumC10944n[] values() {
        return (EnumC10944n[]) f24310t.clone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo11486a(C10954o oVar, C10934h hVar) {
        int e = hVar.m11542e();
        if (hVar.compareTo(mo11484b(hVar.m11544c(), e)) < 0) {
            return e - 1;
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract C10934h mo11484b(EnumC10937j jVar, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r7.m11546a(r6) >= 0) goto L_0x0045;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (r2.m11546a(r6) >= 0) goto L_0x002d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
        if (r9 > r8) goto L_0x004b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
        if (r5 == false) goto L_?;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
        throw new java.lang.IllegalArgumentException("Invalid date due to changing new year rule (year too short to cover month and day-of-month): " + r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
        return r8;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo11485c(boolean r5, net.time4j.history.C10954o r6, net.time4j.history.EnumC10937j r7, int r8, int r9, int r10) {
        /*
            r4 = this;
            r0 = 5
            if (r9 < r0) goto L_0x0008
            r0 = 8
            if (r9 > r0) goto L_0x0008
            return r8
        L_0x0008:
            net.time4j.history.h r0 = r4.mo11484b(r7, r8)
            int r1 = r8 + 1
            net.time4j.history.h r6 = r6.m11480d(r7, r1)
            net.time4j.history.h r2 = net.time4j.history.C10934h.m11540g(r7, r8, r9, r10)
            r3 = 4
            if (r9 > r3) goto L_0x002f
            net.time4j.history.h r7 = net.time4j.history.C10934h.m11540g(r7, r1, r9, r10)
            int r9 = r2.compareTo(r0)
            if (r9 < 0) goto L_0x0025
            r9 = r8
            goto L_0x0026
        L_0x0025:
            r9 = r1
        L_0x0026:
            int r6 = r7.compareTo(r6)
            if (r6 < 0) goto L_0x002d
            goto L_0x0045
        L_0x002d:
            r8 = r1
            goto L_0x0045
        L_0x002f:
            int r1 = r8 + (-1)
            net.time4j.history.h r7 = net.time4j.history.C10934h.m11540g(r7, r1, r9, r10)
            int r7 = r7.compareTo(r0)
            if (r7 < 0) goto L_0x003d
            r9 = r1
            goto L_0x003e
        L_0x003d:
            r9 = r8
        L_0x003e:
            int r6 = r2.compareTo(r6)
            if (r6 < 0) goto L_0x0045
            goto L_0x002d
        L_0x0045:
            if (r9 > r8) goto L_0x004b
            if (r5 == 0) goto L_0x004a
            r8 = r9
        L_0x004a:
            return r8
        L_0x004b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Invalid date due to changing new year rule (year too short to cover month and day-of-month): "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.history.EnumC10944n.mo11485c(boolean, net.time4j.history.o, net.time4j.history.j, int, int, int):int");
    }

    /* renamed from: d */
    public C10954o m11487d(int i) {
        if (i > 567) {
            C10954o oVar = new C10954o(this, i);
            EnumC10944n nVar = f24301k;
            if (this != nVar) {
                return new C10954o(nVar, 567).m11482b(oVar);
            }
            return oVar;
        }
        throw new IllegalArgumentException("Defining New-Year-strategy is not supported before Council of Tours in AD 567.");
    }

    /* synthetic */ EnumC10944n(String str, int i, C10945a aVar) {
        this(str, i);
    }
}
