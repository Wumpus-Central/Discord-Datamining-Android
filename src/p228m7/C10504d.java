package p228m7;

import java.util.Arrays;
import p119g9.C7557q0;
import p228m7.AbstractC10534y;

/* renamed from: m7.d */
/* loaded from: classes7.dex */
public final class C10504d implements AbstractC10534y {

    /* renamed from: a */
    public final int f23206a;

    /* renamed from: b */
    public final int[] f23207b;

    /* renamed from: c */
    public final long[] f23208c;

    /* renamed from: d */
    public final long[] f23209d;

    /* renamed from: e */
    public final long[] f23210e;

    /* renamed from: f */
    private final long f23211f;

    public C10504d(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f23207b = iArr;
        this.f23208c = jArr;
        this.f23209d = jArr2;
        this.f23210e = jArr3;
        int length = iArr.length;
        this.f23206a = length;
        if (length > 0) {
            this.f23211f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f23211f = 0L;
        }
    }

    /* renamed from: a */
    public int m12998a(long j) {
        return C7557q0.m22147i(this.f23210e, j, true, true);
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: f */
    public AbstractC10534y.C10535a mo2208f(long j) {
        int a = m12998a(j);
        C10537z zVar = new C10537z(this.f23210e[a], this.f23208c[a]);
        if (zVar.f23296a >= j || a == this.f23206a - 1) {
            return new AbstractC10534y.C10535a(zVar);
        }
        int i = a + 1;
        return new AbstractC10534y.C10535a(zVar, new C10537z(this.f23210e[i], this.f23208c[i]));
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: h */
    public boolean mo2207h() {
        return true;
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: i */
    public long mo2206i() {
        return this.f23211f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f23206a + ", sizes=" + Arrays.toString(this.f23207b) + ", offsets=" + Arrays.toString(this.f23208c) + ", timeUs=" + Arrays.toString(this.f23210e) + ", durationsUs=" + Arrays.toString(this.f23209d) + ")";
    }
}
