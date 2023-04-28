package p228m7;

import p119g9.C7510a;
import p119g9.C7557q0;
import p228m7.AbstractC10534y;
import p228m7.C10527s;

/* renamed from: m7.r */
/* loaded from: classes7.dex */
public final class C10526r implements AbstractC10534y {

    /* renamed from: a */
    private final C10527s f23265a;

    /* renamed from: b */
    private final long f23266b;

    public C10526r(C10527s sVar, long j) {
        this.f23265a = sVar;
        this.f23266b = j;
    }

    /* renamed from: a */
    private C10537z m12950a(long j, long j2) {
        return new C10537z((j * 1000000) / this.f23265a.f23271e, this.f23266b + j2);
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: f */
    public AbstractC10534y.C10535a mo2208f(long j) {
        long j2;
        C7510a.m22364h(this.f23265a.f23277k);
        C10527s sVar = this.f23265a;
        C10527s.C10528a aVar = sVar.f23277k;
        long[] jArr = aVar.f23279a;
        long[] jArr2 = aVar.f23280b;
        int i = C7557q0.m22147i(jArr, sVar.m12940j(j), true, false);
        long j3 = 0;
        if (i == -1) {
            j2 = 0;
        } else {
            j2 = jArr[i];
        }
        if (i != -1) {
            j3 = jArr2[i];
        }
        C10537z a = m12950a(j2, j3);
        if (a.f23296a == j || i == jArr.length - 1) {
            return new AbstractC10534y.C10535a(a);
        }
        int i2 = i + 1;
        return new AbstractC10534y.C10535a(a, m12950a(jArr[i2], jArr2[i2]));
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: h */
    public boolean mo2207h() {
        return true;
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: i */
    public long mo2206i() {
        return this.f23265a.m12943g();
    }
}
