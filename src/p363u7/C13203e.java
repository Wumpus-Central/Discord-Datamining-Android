package p363u7;

import java.util.Arrays;
import p119g9.C7510a;
import p119g9.C7570y;
import p228m7.AbstractC10515j;

/* renamed from: u7.e */
/* loaded from: classes7.dex */
final class C13203e {

    /* renamed from: a */
    private final C13204f f29617a = new C13204f();

    /* renamed from: b */
    private final C7570y f29618b = new C7570y(new byte[65025], 0);

    /* renamed from: c */
    private int f29619c = -1;

    /* renamed from: d */
    private int f29620d;

    /* renamed from: e */
    private boolean f29621e;

    /* renamed from: a */
    private int m4343a(int i) {
        int i2;
        int i3 = 0;
        this.f29620d = 0;
        do {
            int i4 = this.f29620d;
            int i5 = i + i4;
            C13204f fVar = this.f29617a;
            if (i5 >= fVar.f29628g) {
                break;
            }
            int[] iArr = fVar.f29631j;
            this.f29620d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* renamed from: b */
    public C13204f m4342b() {
        return this.f29617a;
    }

    /* renamed from: c */
    public C7570y m4341c() {
        return this.f29618b;
    }

    /* renamed from: d */
    public boolean m4340d(AbstractC10515j jVar) {
        boolean z;
        boolean z2;
        int i;
        if (jVar != null) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        if (this.f29621e) {
            this.f29621e = false;
            this.f29618b.m22021L(0);
        }
        while (!this.f29621e) {
            if (this.f29619c < 0) {
                if (!this.f29617a.m4334d(jVar) || !this.f29617a.m4336b(jVar, true)) {
                    return false;
                }
                C13204f fVar = this.f29617a;
                int i2 = fVar.f29629h;
                if ((fVar.f29623b & 1) == 1 && this.f29618b.m22010f() == 0) {
                    i2 += m4343a(0);
                    i = this.f29620d + 0;
                } else {
                    i = 0;
                }
                jVar.mo12932k(i2);
                this.f29619c = i;
            }
            int a = m4343a(this.f29619c);
            int i3 = this.f29619c + this.f29620d;
            if (a > 0) {
                C7570y yVar = this.f29618b;
                yVar.m22013c(yVar.m22010f() + a);
                jVar.readFully(this.f29618b.m22012d(), this.f29618b.m22010f(), a);
                C7570y yVar2 = this.f29618b;
                yVar2.m22018O(yVar2.m22010f() + a);
                if (this.f29617a.f29631j[i3 - 1] != 255) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f29621e = z2;
            }
            if (i3 == this.f29617a.f29628g) {
                i3 = -1;
            }
            this.f29619c = i3;
        }
        return true;
    }

    /* renamed from: e */
    public void m4339e() {
        this.f29617a.m4335c();
        this.f29618b.m22021L(0);
        this.f29619c = -1;
        this.f29621e = false;
    }

    /* renamed from: f */
    public void m4338f() {
        if (this.f29618b.m22012d().length != 65025) {
            C7570y yVar = this.f29618b;
            yVar.m22019N(Arrays.copyOf(yVar.m22012d(), Math.max(65025, this.f29618b.m22010f())), this.f29618b.m22010f());
        }
    }
}
