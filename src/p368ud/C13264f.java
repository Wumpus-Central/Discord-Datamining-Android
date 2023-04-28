package p368ud;

import java.util.Formatter;

/* renamed from: ud.f */
/* loaded from: classes3.dex */
final class C13264f {

    /* renamed from: a */
    private final C13257a f29781a;

    /* renamed from: b */
    private final C13265g[] f29782b;

    /* renamed from: c */
    private C13259c f29783c;

    /* renamed from: d */
    private final int f29784d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13264f(C13257a aVar, C13259c cVar) {
        this.f29781a = aVar;
        int a = aVar.m4203a();
        this.f29784d = a;
        this.f29783c = cVar;
        this.f29782b = new C13265g[a + 2];
    }

    /* renamed from: a */
    private void m4169a(C13265g gVar) {
        if (gVar != null) {
            ((C13266h) gVar).m4146g(this.f29781a);
        }
    }

    /* renamed from: b */
    private static boolean m4168b(C13260d dVar, C13260d dVar2) {
        if (dVar2 == null || !dVar2.m4180g() || dVar2.m4186a() != dVar.m4186a()) {
            return false;
        }
        dVar.m4178i(dVar2.m4184c());
        return true;
    }

    /* renamed from: c */
    private static int m4167c(int i, int i2, C13260d dVar) {
        if (dVar == null) {
            return i2;
        }
        if (dVar.m4180g()) {
            return i2;
        }
        if (!dVar.m4179h(i)) {
            return i2 + 1;
        }
        dVar.m4178i(i);
        return 0;
    }

    /* renamed from: d */
    private int m4166d() {
        int f = m4164f();
        if (f == 0) {
            return 0;
        }
        for (int i = 1; i < this.f29784d + 1; i++) {
            C13260d[] d = this.f29782b[i].m4149d();
            for (int i2 = 0; i2 < d.length; i2++) {
                C13260d dVar = d[i2];
                if (dVar != null && !dVar.m4180g()) {
                    m4165e(i, i2, d);
                }
            }
        }
        return f;
    }

    /* renamed from: e */
    private void m4165e(int i, int i2, C13260d[] dVarArr) {
        C13260d[] dVarArr2;
        C13260d dVar = dVarArr[i2];
        C13260d[] d = this.f29782b[i - 1].m4149d();
        C13265g gVar = this.f29782b[i + 1];
        if (gVar != null) {
            dVarArr2 = gVar.m4149d();
        } else {
            dVarArr2 = d;
        }
        C13260d[] dVarArr3 = new C13260d[14];
        dVarArr3[2] = d[i2];
        dVarArr3[3] = dVarArr2[i2];
        if (i2 > 0) {
            int i3 = i2 - 1;
            dVarArr3[0] = dVarArr[i3];
            dVarArr3[4] = d[i3];
            dVarArr3[5] = dVarArr2[i3];
        }
        if (i2 > 1) {
            int i4 = i2 - 2;
            dVarArr3[8] = dVarArr[i4];
            dVarArr3[10] = d[i4];
            dVarArr3[11] = dVarArr2[i4];
        }
        if (i2 < dVarArr.length - 1) {
            int i5 = i2 + 1;
            dVarArr3[1] = dVarArr[i5];
            dVarArr3[6] = d[i5];
            dVarArr3[7] = dVarArr2[i5];
        }
        if (i2 < dVarArr.length - 2) {
            int i6 = i2 + 2;
            dVarArr3[9] = dVarArr[i6];
            dVarArr3[12] = d[i6];
            dVarArr3[13] = dVarArr2[i6];
        }
        for (int i7 = 0; i7 < 14 && !m4168b(dVar, dVarArr3[i7]); i7++) {
        }
    }

    /* renamed from: f */
    private int m4164f() {
        m4163g();
        return m4162h() + m4161i();
    }

    /* renamed from: g */
    private void m4163g() {
        C13265g[] gVarArr = this.f29782b;
        C13265g gVar = gVarArr[0];
        if (!(gVar == null || gVarArr[this.f29784d + 1] == null)) {
            C13260d[] d = gVar.m4149d();
            C13260d[] d2 = this.f29782b[this.f29784d + 1].m4149d();
            for (int i = 0; i < d.length; i++) {
                C13260d dVar = d[i];
                if (!(dVar == null || d2[i] == null || dVar.m4184c() != d2[i].m4184c())) {
                    for (int i2 = 1; i2 <= this.f29784d; i2++) {
                        C13260d dVar2 = this.f29782b[i2].m4149d()[i];
                        if (dVar2 != null) {
                            dVar2.m4178i(d[i].m4184c());
                            if (!dVar2.m4180g()) {
                                this.f29782b[i2].m4149d()[i] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private int m4162h() {
        C13265g gVar = this.f29782b[0];
        if (gVar == null) {
            return 0;
        }
        C13260d[] d = gVar.m4149d();
        int i = 0;
        for (int i2 = 0; i2 < d.length; i2++) {
            C13260d dVar = d[i2];
            if (dVar != null) {
                int c = dVar.m4184c();
                int i3 = 0;
                for (int i4 = 1; i4 < this.f29784d + 1 && i3 < 2; i4++) {
                    C13260d dVar2 = this.f29782b[i4].m4149d()[i2];
                    if (dVar2 != null) {
                        i3 = m4167c(c, i3, dVar2);
                        if (!dVar2.m4180g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: i */
    private int m4161i() {
        C13265g[] gVarArr = this.f29782b;
        int i = this.f29784d;
        if (gVarArr[i + 1] == null) {
            return 0;
        }
        C13260d[] d = gVarArr[i + 1].m4149d();
        int i2 = 0;
        for (int i3 = 0; i3 < d.length; i3++) {
            C13260d dVar = d[i3];
            if (dVar != null) {
                int c = dVar.m4184c();
                int i4 = 0;
                for (int i5 = this.f29784d + 1; i5 > 0 && i4 < 2; i5--) {
                    C13260d dVar2 = this.f29782b[i5].m4149d()[i3];
                    if (dVar2 != null) {
                        i4 = m4167c(c, i4, dVar2);
                        if (!dVar2.m4180g()) {
                            i2++;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m4160j() {
        return this.f29784d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m4159k() {
        return this.f29781a.m4202b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public int m4158l() {
        return this.f29781a.m4201c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public C13259c m4157m() {
        return this.f29783c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public C13265g m4156n(int i) {
        return this.f29782b[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public C13265g[] m4155o() {
        m4169a(this.f29782b[0]);
        m4169a(this.f29782b[this.f29784d + 1]);
        int i = 928;
        while (true) {
            int d = m4166d();
            if (d <= 0 || d >= i) {
                break;
            }
            i = d;
        }
        return this.f29782b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m4154p(C13259c cVar) {
        this.f29783c = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m4153q(int i, C13265g gVar) {
        this.f29782b[i] = gVar;
    }

    public String toString() {
        C13265g[] gVarArr = this.f29782b;
        C13265g gVar = gVarArr[0];
        if (gVar == null) {
            gVar = gVarArr[this.f29784d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i = 0; i < gVar.m4149d().length; i++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i));
                for (int i2 = 0; i2 < this.f29784d + 2; i2++) {
                    C13265g gVar2 = this.f29782b[i2];
                    if (gVar2 == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        C13260d dVar = gVar2.m4149d()[i];
                        if (dVar == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(dVar.m4184c()), Integer.valueOf(dVar.m4182e()));
                        }
                    }
                }
                formatter.format("%n", new Object[0]);
            } finally {
                try {
                    throw th;
                } catch (Throwable th2) {
                }
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
