package p368ud;

import java.util.Formatter;

/* renamed from: ud.g */
/* loaded from: classes3.dex */
class C13265g {

    /* renamed from: a */
    private final C13259c f29785a;

    /* renamed from: b */
    private final C13260d[] f29786b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13265g(C13259c cVar) {
        this.f29785a = new C13259c(cVar);
        this.f29786b = new C13260d[(cVar.m4192e() - cVar.m4190g()) + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C13259c m4152a() {
        return this.f29785a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final C13260d m4151b(int i) {
        return this.f29786b[m4148e(i)];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final C13260d m4150c(int i) {
        C13260d dVar;
        C13260d dVar2;
        C13260d b = m4151b(i);
        if (b != null) {
            return b;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int e = m4148e(i) - i2;
            if (e >= 0 && (dVar2 = this.f29786b[e]) != null) {
                return dVar2;
            }
            int e2 = m4148e(i) + i2;
            C13260d[] dVarArr = this.f29786b;
            if (e2 < dVarArr.length && (dVar = dVarArr[e2]) != null) {
                return dVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final C13260d[] m4149d() {
        return this.f29786b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final int m4148e(int i) {
        return i - this.f29785a.m4190g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m4147f(int i, C13260d dVar) {
        this.f29786b[m4148e(i)] = dVar;
    }

    public String toString() {
        C13260d[] dVarArr;
        Formatter formatter = new Formatter();
        try {
            int i = 0;
            for (C13260d dVar : this.f29786b) {
                if (dVar == null) {
                    formatter.format("%3d:    |   %n", Integer.valueOf(i));
                    i++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i), Integer.valueOf(dVar.m4184c()), Integer.valueOf(dVar.m4182e()));
                    i++;
                }
            }
            String formatter2 = formatter.toString();
            formatter.close();
            return formatter2;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    formatter.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }
}
