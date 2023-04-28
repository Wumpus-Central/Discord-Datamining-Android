package p228m7;

import p119g9.C7510a;
import p119g9.C7557q0;
import p228m7.AbstractC10534y;

/* renamed from: m7.w */
/* loaded from: classes7.dex */
public final class C10532w implements AbstractC10534y {

    /* renamed from: a */
    private final long[] f23286a;

    /* renamed from: b */
    private final long[] f23287b;

    /* renamed from: c */
    private final long f23288c;

    /* renamed from: d */
    private final boolean f23289d;

    public C10532w(long[] jArr, long[] jArr2, long j) {
        boolean z;
        boolean z2;
        if (jArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22371a(z);
        int length = jArr2.length;
        if (length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f23289d = z2;
        if (!z2 || jArr2[0] <= 0) {
            this.f23286a = jArr;
            this.f23287b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f23286a = jArr3;
            long[] jArr4 = new long[i];
            this.f23287b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f23288c = j;
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: f */
    public AbstractC10534y.C10535a mo2208f(long j) {
        if (!this.f23289d) {
            return new AbstractC10534y.C10535a(C10537z.f23295c);
        }
        int i = C7557q0.m22147i(this.f23287b, j, true, true);
        C10537z zVar = new C10537z(this.f23287b[i], this.f23286a[i]);
        if (zVar.f23296a == j || i == this.f23287b.length - 1) {
            return new AbstractC10534y.C10535a(zVar);
        }
        int i2 = i + 1;
        return new AbstractC10534y.C10535a(zVar, new C10537z(this.f23287b[i2], this.f23286a[i2]));
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: h */
    public boolean mo2207h() {
        return this.f23289d;
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: i */
    public long mo2206i() {
        return this.f23288c;
    }
}
