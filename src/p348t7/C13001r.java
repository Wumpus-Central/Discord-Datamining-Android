package p348t7;

import p119g9.C7510a;
import p119g9.C7557q0;

/* renamed from: t7.r */
/* loaded from: classes7.dex */
final class C13001r {

    /* renamed from: a */
    public final C12998o f29222a;

    /* renamed from: b */
    public final int f29223b;

    /* renamed from: c */
    public final long[] f29224c;

    /* renamed from: d */
    public final int[] f29225d;

    /* renamed from: e */
    public final int f29226e;

    /* renamed from: f */
    public final long[] f29227f;

    /* renamed from: g */
    public final int[] f29228g;

    /* renamed from: h */
    public final long f29229h;

    public C13001r(C12998o oVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (iArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22371a(z);
        if (jArr.length == jArr2.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        C7510a.m22371a(z2);
        C7510a.m22371a(iArr2.length == jArr2.length ? true : z3);
        this.f29222a = oVar;
        this.f29224c = jArr;
        this.f29225d = iArr;
        this.f29226e = i;
        this.f29227f = jArr2;
        this.f29228g = iArr2;
        this.f29229h = j;
        this.f29223b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* renamed from: a */
    public int m4766a(long j) {
        for (int i = C7557q0.m22147i(this.f29227f, j, true, false); i >= 0; i--) {
            if ((this.f29228g[i] & 1) != 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int m4765b(long j) {
        for (int e = C7557q0.m22155e(this.f29227f, j, true, false); e < this.f29227f.length; e++) {
            if ((this.f29228g[e] & 1) != 0) {
                return e;
            }
        }
        return -1;
    }
}
