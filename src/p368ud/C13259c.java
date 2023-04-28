package p368ud;

import p066dd.C6441j;
import p066dd.C6446o;
import p137hd.C7997b;

/* renamed from: ud.c */
/* loaded from: classes3.dex */
final class C13259c {

    /* renamed from: a */
    private final C7997b f29756a;

    /* renamed from: b */
    private final C6446o f29757b;

    /* renamed from: c */
    private final C6446o f29758c;

    /* renamed from: d */
    private final C6446o f29759d;

    /* renamed from: e */
    private final C6446o f29760e;

    /* renamed from: f */
    private final int f29761f;

    /* renamed from: g */
    private final int f29762g;

    /* renamed from: h */
    private final int f29763h;

    /* renamed from: i */
    private final int f29764i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13259c(C7997b bVar, C6446o oVar, C6446o oVar2, C6446o oVar3, C6446o oVar4) {
        boolean z = false;
        boolean z2 = oVar == null || oVar2 == null;
        z = (oVar3 == null || oVar4 == null) ? true : z;
        if (!z2 || !z) {
            if (z2) {
                oVar = new C6446o(0.0f, oVar3.m25544d());
                oVar2 = new C6446o(0.0f, oVar4.m25544d());
            } else if (z) {
                oVar3 = new C6446o(bVar.m20917m() - 1, oVar.m25544d());
                oVar4 = new C6446o(bVar.m20917m() - 1, oVar2.m25544d());
            }
            this.f29756a = bVar;
            this.f29757b = oVar;
            this.f29758c = oVar2;
            this.f29759d = oVar3;
            this.f29760e = oVar4;
            this.f29761f = (int) Math.min(oVar.m25545c(), oVar2.m25545c());
            this.f29762g = (int) Math.max(oVar3.m25545c(), oVar4.m25545c());
            this.f29763h = (int) Math.min(oVar.m25544d(), oVar3.m25544d());
            this.f29764i = (int) Math.max(oVar2.m25544d(), oVar4.m25544d());
            return;
        }
        throw C6441j.m25551a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static C13259c m4187j(C13259c cVar, C13259c cVar2) {
        return cVar == null ? cVar2 : cVar2 == null ? cVar : new C13259c(cVar.f29756a, cVar.f29757b, cVar.f29758c, cVar2.f29759d, cVar2.f29760e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p368ud.C13259c m4196a(int r13, int r14, boolean r15) {
        /*
            r12 = this;
            dd.o r0 = r12.f29757b
            dd.o r1 = r12.f29758c
            dd.o r2 = r12.f29759d
            dd.o r3 = r12.f29760e
            if (r13 <= 0) goto L_0x0029
            if (r15 == 0) goto L_0x000e
            r4 = r0
            goto L_0x000f
        L_0x000e:
            r4 = r2
        L_0x000f:
            float r5 = r4.m25544d()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L_0x0018
            r5 = 0
        L_0x0018:
            dd.o r13 = new dd.o
            float r4 = r4.m25545c()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L_0x0026
            r8 = r13
            goto L_0x002a
        L_0x0026:
            r10 = r13
            r8 = r0
            goto L_0x002b
        L_0x0029:
            r8 = r0
        L_0x002a:
            r10 = r2
        L_0x002b:
            if (r14 <= 0) goto L_0x005b
            if (r15 == 0) goto L_0x0032
            dd.o r13 = r12.f29758c
            goto L_0x0034
        L_0x0032:
            dd.o r13 = r12.f29760e
        L_0x0034:
            float r0 = r13.m25544d()
            int r0 = (int) r0
            int r0 = r0 + r14
            hd.b r14 = r12.f29756a
            int r14 = r14.m20920j()
            if (r0 < r14) goto L_0x004a
            hd.b r14 = r12.f29756a
            int r14 = r14.m20920j()
            int r0 = r14 + (-1)
        L_0x004a:
            dd.o r14 = new dd.o
            float r13 = r13.m25545c()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L_0x0058
            r9 = r14
            goto L_0x005c
        L_0x0058:
            r11 = r14
            r9 = r1
            goto L_0x005d
        L_0x005b:
            r9 = r1
        L_0x005c:
            r11 = r3
        L_0x005d:
            ud.c r13 = new ud.c
            hd.b r7 = r12.f29756a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p368ud.C13259c.m4196a(int, int, boolean):ud.c");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C6446o m4195b() {
        return this.f29758c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C6446o m4194c() {
        return this.f29760e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m4193d() {
        return this.f29762g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m4192e() {
        return this.f29764i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m4191f() {
        return this.f29761f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m4190g() {
        return this.f29763h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C6446o m4189h() {
        return this.f29757b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C6446o m4188i() {
        return this.f29759d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13259c(C13259c cVar) {
        this.f29756a = cVar.f29756a;
        this.f29757b = cVar.m4189h();
        this.f29758c = cVar.m4195b();
        this.f29759d = cVar.m4188i();
        this.f29760e = cVar.m4194c();
        this.f29761f = cVar.m4191f();
        this.f29762g = cVar.m4193d();
        this.f29763h = cVar.m4190g();
        this.f29764i = cVar.m4192e();
    }
}
