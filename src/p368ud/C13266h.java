package p368ud;

import p066dd.C6446o;

/* renamed from: ud.h */
/* loaded from: classes3.dex */
final class C13266h extends C13265g {

    /* renamed from: c */
    private final boolean f29787c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13266h(C13259c cVar, boolean z) {
        super(cVar);
        this.f29787c = z;
    }

    /* renamed from: h */
    private void m4145h(C13257a aVar) {
        C6446o oVar;
        C6446o oVar2;
        C13259c a = m4152a();
        if (this.f29787c) {
            oVar = a.m4189h();
        } else {
            oVar = a.m4188i();
        }
        if (this.f29787c) {
            oVar2 = a.m4195b();
        } else {
            oVar2 = a.m4194c();
        }
        int e = m4148e((int) oVar2.m25544d());
        C13260d[] d = m4149d();
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        for (int e2 = m4148e((int) oVar.m25544d()); e2 < e; e2++) {
            C13260d dVar = d[e2];
            if (dVar != null) {
                dVar.m4177j();
                int c = dVar.m4184c() - i;
                if (c == 0) {
                    i2++;
                } else {
                    if (c == 1) {
                        i3 = Math.max(i3, i2);
                        i = dVar.m4184c();
                    } else if (dVar.m4184c() >= aVar.m4201c()) {
                        d[e2] = null;
                    } else {
                        i = dVar.m4184c();
                    }
                    i2 = 1;
                }
            }
        }
    }

    /* renamed from: l */
    private void m4141l(C13260d[] dVarArr, C13257a aVar) {
        for (int i = 0; i < dVarArr.length; i++) {
            C13260d dVar = dVarArr[i];
            if (dVar != null) {
                int e = dVar.m4182e() % 30;
                int c = dVar.m4184c();
                if (c > aVar.m4201c()) {
                    dVarArr[i] = null;
                } else {
                    if (!this.f29787c) {
                        c += 2;
                    }
                    int i2 = c % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && e + 1 != aVar.m4203a()) {
                                dVarArr[i] = null;
                            }
                        } else if (e / 3 != aVar.m4202b() || e % 3 != aVar.m4200d()) {
                            dVarArr[i] = null;
                        }
                    } else if ((e * 3) + 1 != aVar.m4199e()) {
                        dVarArr[i] = null;
                    }
                }
            }
        }
    }

    /* renamed from: m */
    private void m4140m() {
        C13260d[] d;
        for (C13260d dVar : m4149d()) {
            if (dVar != null) {
                dVar.m4177j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m4146g(C13257a aVar) {
        C6446o oVar;
        C6446o oVar2;
        boolean z;
        C13260d[] d = m4149d();
        m4140m();
        m4141l(d, aVar);
        C13259c a = m4152a();
        if (this.f29787c) {
            oVar = a.m4189h();
        } else {
            oVar = a.m4188i();
        }
        if (this.f29787c) {
            oVar2 = a.m4195b();
        } else {
            oVar2 = a.m4194c();
        }
        int e = m4148e((int) oVar2.m25544d());
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        for (int e2 = m4148e((int) oVar.m25544d()); e2 < e; e2++) {
            C13260d dVar = d[e2];
            if (dVar != null) {
                int c = dVar.m4184c() - i;
                if (c == 0) {
                    i2++;
                } else {
                    if (c == 1) {
                        i3 = Math.max(i3, i2);
                        i = dVar.m4184c();
                    } else if (c < 0 || dVar.m4184c() >= aVar.m4201c() || c > e2) {
                        d[e2] = null;
                    } else {
                        if (i3 > 2) {
                            c *= i3 - 2;
                        }
                        if (c >= e2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        for (int i4 = 1; i4 <= c && !z; i4++) {
                            if (d[e2 - i4] != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            d[e2] = null;
                        } else {
                            i = dVar.m4184c();
                        }
                    }
                    i2 = 1;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C13257a m4144i() {
        C13260d[] d = m4149d();
        C13258b bVar = new C13258b();
        C13258b bVar2 = new C13258b();
        C13258b bVar3 = new C13258b();
        C13258b bVar4 = new C13258b();
        for (C13260d dVar : d) {
            if (dVar != null) {
                dVar.m4177j();
                int e = dVar.m4182e() % 30;
                int c = dVar.m4184c();
                if (!this.f29787c) {
                    c += 2;
                }
                int i = c % 3;
                if (i == 0) {
                    bVar2.m4197b((e * 3) + 1);
                } else if (i == 1) {
                    bVar4.m4197b(e / 3);
                    bVar3.m4197b(e % 3);
                } else if (i == 2) {
                    bVar.m4197b(e + 1);
                }
            }
        }
        if (bVar.m4198a().length == 0 || bVar2.m4198a().length == 0 || bVar3.m4198a().length == 0 || bVar4.m4198a().length == 0 || bVar.m4198a()[0] <= 0 || bVar2.m4198a()[0] + bVar3.m4198a()[0] < 3 || bVar2.m4198a()[0] + bVar3.m4198a()[0] > 90) {
            return null;
        }
        C13257a aVar = new C13257a(bVar.m4198a()[0], bVar2.m4198a()[0], bVar3.m4198a()[0], bVar4.m4198a()[0]);
        m4141l(d, aVar);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int[] m4143j() {
        C13260d[] d;
        int c;
        C13257a i = m4144i();
        if (i == null) {
            return null;
        }
        m4145h(i);
        int c2 = i.m4201c();
        int[] iArr = new int[c2];
        for (C13260d dVar : m4149d()) {
            if (dVar != null && (c = dVar.m4184c()) < c2) {
                iArr[c] = iArr[c] + 1;
            }
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean m4142k() {
        return this.f29787c;
    }

    @Override // p368ud.C13265g
    public String toString() {
        return "IsLeft: " + this.f29787c + '\n' + super.toString();
    }
}
