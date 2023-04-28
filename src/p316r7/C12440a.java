package p316r7;

import java.util.ArrayDeque;
import p079e7.C6728o;
import p119g9.C7510a;
import p228m7.AbstractC10515j;

/* renamed from: r7.a */
/* loaded from: classes7.dex */
final class C12440a implements AbstractC12443c {

    /* renamed from: a */
    private final byte[] f27989a = new byte[8];

    /* renamed from: b */
    private final ArrayDeque<C12441b> f27990b = new ArrayDeque<>();

    /* renamed from: c */
    private final C12451g f27991c = new C12451g();

    /* renamed from: d */
    private AbstractC12442b f27992d;

    /* renamed from: e */
    private int f27993e;

    /* renamed from: f */
    private int f27994f;

    /* renamed from: g */
    private long f27995g;

    /* renamed from: r7.a$b */
    /* loaded from: classes7.dex */
    private static final class C12441b {

        /* renamed from: a */
        private final int f27996a;

        /* renamed from: b */
        private final long f27997b;

        private C12441b(int i, long j) {
            this.f27996a = i;
            this.f27997b = j;
        }
    }

    /* renamed from: c */
    private long m6773c(AbstractC10515j jVar) {
        jVar.mo12936f();
        while (true) {
            jVar.mo12930n(this.f27989a, 0, 4);
            int c = C12451g.m6702c(this.f27989a[0]);
            if (c != -1 && c <= 4) {
                int a = (int) C12451g.m6704a(this.f27989a, c, false);
                if (this.f27992d.mo6726f(a)) {
                    jVar.mo12932k(c);
                    return a;
                }
            }
            jVar.mo12932k(1);
        }
    }

    /* renamed from: d */
    private double m6772d(AbstractC10515j jVar, int i) {
        long e = m6771e(jVar, i);
        if (i == 4) {
            return Float.intBitsToFloat((int) e);
        }
        return Double.longBitsToDouble(e);
    }

    /* renamed from: e */
    private long m6771e(AbstractC10515j jVar, int i) {
        jVar.readFully(this.f27989a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.f27989a[i2] & 255);
        }
        return j;
    }

    /* renamed from: f */
    private static String m6770f(AbstractC10515j jVar, int i) {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        jVar.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    @Override // p316r7.AbstractC12443c
    /* renamed from: a */
    public boolean mo6767a(AbstractC10515j jVar) {
        C7510a.m22364h(this.f27992d);
        while (true) {
            C12441b peek = this.f27990b.peek();
            if (peek == null || jVar.getPosition() < peek.f27997b) {
                if (this.f27993e == 0) {
                    long d = this.f27991c.m6701d(jVar, true, false, 4);
                    if (d == -2) {
                        d = m6773c(jVar);
                    }
                    if (d == -1) {
                        return false;
                    }
                    this.f27994f = (int) d;
                    this.f27993e = 1;
                }
                if (this.f27993e == 1) {
                    this.f27995g = this.f27991c.m6701d(jVar, false, true, 8);
                    this.f27993e = 2;
                }
                int d2 = this.f27992d.mo6728d(this.f27994f);
                if (d2 == 0) {
                    jVar.mo12932k((int) this.f27995g);
                    this.f27993e = 0;
                } else if (d2 == 1) {
                    long position = jVar.getPosition();
                    this.f27990b.push(new C12441b(this.f27994f, this.f27995g + position));
                    this.f27992d.mo6724h(this.f27994f, position, this.f27995g);
                    this.f27993e = 0;
                    return true;
                } else if (d2 == 2) {
                    long j = this.f27995g;
                    if (j <= 8) {
                        this.f27992d.mo6729c(this.f27994f, m6771e(jVar, (int) j));
                        this.f27993e = 0;
                        return true;
                    }
                    throw new C6728o("Invalid integer size: " + this.f27995g);
                } else if (d2 == 3) {
                    long j2 = this.f27995g;
                    if (j2 <= 2147483647L) {
                        this.f27992d.mo6725g(this.f27994f, m6770f(jVar, (int) j2));
                        this.f27993e = 0;
                        return true;
                    }
                    throw new C6728o("String element size: " + this.f27995g);
                } else if (d2 == 4) {
                    this.f27992d.mo6727e(this.f27994f, (int) this.f27995g, jVar);
                    this.f27993e = 0;
                    return true;
                } else if (d2 == 5) {
                    long j3 = this.f27995g;
                    if (j3 == 4 || j3 == 8) {
                        this.f27992d.mo6730b(this.f27994f, m6772d(jVar, (int) j3));
                        this.f27993e = 0;
                        return true;
                    }
                    throw new C6728o("Invalid float size: " + this.f27995g);
                } else {
                    throw new C6728o("Invalid element type " + d2);
                }
            } else {
                this.f27992d.mo6731a(this.f27990b.pop().f27996a);
                return true;
            }
        }
    }

    @Override // p316r7.AbstractC12443c
    /* renamed from: b */
    public void mo6766b(AbstractC12442b bVar) {
        this.f27992d = bVar;
    }

    @Override // p316r7.AbstractC12443c
    public void reset() {
        this.f27993e = 0;
        this.f27990b.clear();
        this.f27991c.m6700e();
    }
}
