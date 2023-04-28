package com.th3rdwave.safeareacontext;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class EdgeInsets {

    /* renamed from: a */
    float f12939a;

    /* renamed from: b */
    float f12940b;

    /* renamed from: c */
    float f12941c;

    /* renamed from: d */
    float f12942d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public EdgeInsets(float f, float f2, float f3, float f4) {
        this.f12939a = f;
        this.f12940b = f2;
        this.f12941c = f3;
        this.f12942d = f4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m25784a(EdgeInsets edgeInsets) {
        if (this == edgeInsets) {
            return true;
        }
        return this.f12939a == edgeInsets.f12939a && this.f12940b == edgeInsets.f12940b && this.f12941c == edgeInsets.f12941c && this.f12942d == edgeInsets.f12942d;
    }
}
