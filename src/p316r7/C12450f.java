package p316r7;

import p119g9.C7570y;
import p228m7.AbstractC10515j;

/* renamed from: r7.f */
/* loaded from: classes7.dex */
final class C12450f {

    /* renamed from: a */
    private final C7570y f28065a = new C7570y(8);

    /* renamed from: b */
    private int f28066b;

    /* renamed from: a */
    private long m6706a(AbstractC10515j jVar) {
        int i = 0;
        jVar.mo12930n(this.f28065a.m22012d(), 0, 1);
        int i2 = this.f28065a.m22012d()[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        jVar.mo12930n(this.f28065a.m22012d(), 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.f28065a.m22012d()[i] & 255) + (i5 << 8);
        }
        this.f28066b += i4 + 1;
        return i5;
    }

    /* renamed from: b */
    public boolean m6705b(AbstractC10515j jVar) {
        long a;
        int i;
        long length = jVar.getLength();
        int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j = 1024;
        if (i2 != 0 && length <= 1024) {
            j = length;
        }
        int i3 = (int) j;
        jVar.mo12930n(this.f28065a.m22012d(), 0, 4);
        long F = this.f28065a.m22027F();
        this.f28066b = 4;
        while (F != 440786851) {
            int i4 = this.f28066b + 1;
            this.f28066b = i4;
            if (i4 == i3) {
                return false;
            }
            jVar.mo12930n(this.f28065a.m22012d(), 0, 1);
            F = ((F << 8) & (-256)) | (this.f28065a.m22012d()[0] & 255);
        }
        long a2 = m6706a(jVar);
        long j2 = this.f28066b;
        if (a2 == Long.MIN_VALUE) {
            return false;
        }
        if (i2 != 0 && j2 + a2 >= length) {
            return false;
        }
        while (true) {
            int i5 = this.f28066b;
            long j3 = j2 + a2;
            if (i5 < j3) {
                if (m6706a(jVar) != Long.MIN_VALUE && (a = m6706a(jVar)) >= 0 && a <= 2147483647L) {
                    if (i != 0) {
                        int i6 = (int) a;
                        jVar.mo12934i(i6);
                        this.f28066b += i6;
                    }
                }
            } else if (i5 == j3) {
                return true;
            } else {
                return false;
            }
        }
    }
}
