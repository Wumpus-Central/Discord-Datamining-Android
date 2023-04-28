package com.budiyev.android.codescanner;

import com.google.zxing.Result;
import p066dd.C6440i;
import p066dd.C6442k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.budiyev.android.codescanner.e */
/* loaded from: classes.dex */
public final class C4177e {

    /* renamed from: a */
    private final byte[] f7064a;

    /* renamed from: b */
    private final C4184i f7065b;

    /* renamed from: c */
    private final C4184i f7066c;

    /* renamed from: d */
    private final C4184i f7067d;

    /* renamed from: e */
    private final C4187l f7068e;

    /* renamed from: f */
    private final int f7069f;

    /* renamed from: g */
    private final boolean f7070g;

    public C4177e(byte[] bArr, C4184i iVar, C4184i iVar2, C4184i iVar3, C4187l lVar, int i, boolean z) {
        this.f7064a = bArr;
        this.f7065b = iVar;
        this.f7066c = iVar2;
        this.f7067d = iVar3;
        this.f7068e = lVar;
        this.f7069f = i;
        this.f7070g = z;
    }

    /* renamed from: a */
    public Result m32442a(C6440i iVar) {
        int i;
        int i2;
        int a = this.f7065b.m32417a();
        int b = this.f7065b.m32416b();
        int i3 = this.f7069f;
        byte[] q = C4189n.m32389q(this.f7064a, a, b, i3);
        if (i3 == 90 || i3 == 270) {
            i = a;
            i2 = b;
        } else {
            i2 = a;
            i = b;
        }
        C4187l m = C4189n.m32393m(i2, i, this.f7068e, this.f7066c, this.f7067d);
        int h = m.m32408h();
        int d = m.m32412d();
        if (h < 1 || d < 1) {
            return null;
        }
        return C4189n.m32398h(iVar, new C6442k(q, i2, i, m.m32411e(), m.m32409g(), h, d, this.f7070g));
    }
}
