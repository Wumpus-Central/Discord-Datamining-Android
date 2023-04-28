package com.google.android.exoplayer2.source.dash;

import p028b8.C3398c;
import p079e7.C6722k;
import p079e7.C6725l;
import p119g9.C7557q0;
import p152i7.C8223h;
import p153i8.AbstractC8278o0;
import p229m8.C10543e;

/* renamed from: com.google.android.exoplayer2.source.dash.d */
/* loaded from: classes7.dex */
final class C5238d implements AbstractC8278o0 {

    /* renamed from: k */
    private final C6722k f9447k;

    /* renamed from: m */
    private long[] f9449m;

    /* renamed from: n */
    private boolean f9450n;

    /* renamed from: o */
    private C10543e f9451o;

    /* renamed from: p */
    private boolean f9452p;

    /* renamed from: q */
    private int f9453q;

    /* renamed from: l */
    private final C3398c f9448l = new C3398c();

    /* renamed from: r */
    private long f9454r = -9223372036854775807L;

    public C5238d(C10543e eVar, C6722k kVar, boolean z) {
        this.f9447k = kVar;
        this.f9451o = eVar;
        this.f9449m = eVar.f23333b;
        m29894d(eVar, z);
    }

    @Override // p153i8.AbstractC8278o0
    /* renamed from: a */
    public void mo12456a() {
    }

    /* renamed from: b */
    public String m29896b() {
        return this.f9451o.m12850a();
    }

    /* renamed from: c */
    public void m29895c(long j) {
        boolean z = true;
        int e = C7557q0.m22155e(this.f9449m, j, true, false);
        this.f9453q = e;
        if (!this.f9450n || e != this.f9449m.length) {
            z = false;
        }
        if (!z) {
            j = -9223372036854775807L;
        }
        this.f9454r = j;
    }

    /* renamed from: d */
    public void m29894d(C10543e eVar, boolean z) {
        long j;
        int i = this.f9453q;
        if (i == 0) {
            j = -9223372036854775807L;
        } else {
            j = this.f9449m[i - 1];
        }
        this.f9450n = z;
        this.f9451o = eVar;
        long[] jArr = eVar.f23333b;
        this.f9449m = jArr;
        long j2 = this.f9454r;
        if (j2 != -9223372036854775807L) {
            m29895c(j2);
        } else if (j != -9223372036854775807L) {
            this.f9453q = C7557q0.m22155e(jArr, j, false, false);
        }
    }

    @Override // p153i8.AbstractC8278o0
    /* renamed from: e */
    public boolean mo12452e() {
        return true;
    }

    @Override // p153i8.AbstractC8278o0
    /* renamed from: j */
    public int mo12451j(C6725l lVar, C8223h hVar, boolean z) {
        if (z || !this.f9452p) {
            lVar.f14361b = this.f9447k;
            this.f9452p = true;
            return -5;
        }
        int i = this.f9453q;
        if (i != this.f9449m.length) {
            this.f9453q = i + 1;
            byte[] a = this.f9448l.m34517a(this.f9451o.f23332a[i]);
            hVar.m20285o(a.length);
            hVar.f17798m.put(a);
            hVar.f17800o = this.f9449m[i];
            hVar.m20297m(1);
            return -4;
        } else if (this.f9450n) {
            return -3;
        } else {
            hVar.m20297m(4);
            return -4;
        }
    }

    @Override // p153i8.AbstractC8278o0
    /* renamed from: s */
    public int mo12450s(long j) {
        int max = Math.max(this.f9453q, C7557q0.m22155e(this.f9449m, j, true, false));
        int i = max - this.f9453q;
        this.f9453q = max;
        return i;
    }
}
