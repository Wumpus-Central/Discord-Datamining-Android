package p077e5;

import p415x4.AbstractC13933d;

/* renamed from: e5.a */
/* loaded from: classes7.dex */
public class C6707a implements AbstractC6708b {

    /* renamed from: a */
    private final AbstractC13933d f14263a;

    /* renamed from: b */
    private long f14264b = -1;

    public C6707a(AbstractC13933d dVar) {
        this.f14263a = dVar;
    }

    @Override // p077e5.AbstractC6708b
    /* renamed from: a */
    public long mo24590a(long j) {
        long d = m24592d();
        long j2 = 0;
        if (d == 0) {
            return -1L;
        }
        if (!m24591e() && j / m24592d() >= this.f14263a.mo1343b()) {
            return -1L;
        }
        long j3 = j % d;
        int a = this.f14263a.mo1344a();
        for (int i = 0; i < a && j2 <= j3; i++) {
            j2 += this.f14263a.mo1336i(i);
        }
        return j + (j2 - j3);
    }

    @Override // p077e5.AbstractC6708b
    /* renamed from: b */
    public int mo24589b(long j, long j2) {
        long d = m24592d();
        if (d == 0) {
            return m24593c(0L);
        }
        if (m24591e() || j / d < this.f14263a.mo1343b()) {
            return m24593c(j % d);
        }
        return -1;
    }

    /* renamed from: c */
    int m24593c(long j) {
        int i = 0;
        long j2 = 0;
        do {
            j2 += this.f14263a.mo1336i(i);
            i++;
        } while (j >= j2);
        return i - 1;
    }

    /* renamed from: d */
    public long m24592d() {
        long j = this.f14264b;
        if (j != -1) {
            return j;
        }
        this.f14264b = 0L;
        int a = this.f14263a.mo1344a();
        for (int i = 0; i < a; i++) {
            this.f14264b += this.f14263a.mo1336i(i);
        }
        return this.f14264b;
    }

    /* renamed from: e */
    public boolean m24591e() {
        return this.f14263a.mo1343b() == 0;
    }
}
