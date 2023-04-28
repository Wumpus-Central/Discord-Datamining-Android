package com.th3rdwave.safeareacontext;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class Rect {

    /* renamed from: a */
    float f12943a;

    /* renamed from: b */
    float f12944b;

    /* renamed from: c */
    float f12945c;

    /* renamed from: d */
    float f12946d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Rect(float f, float f2, float f3, float f4) {
        this.f12943a = f;
        this.f12944b = f2;
        this.f12945c = f3;
        this.f12946d = f4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m25783a(Rect rect) {
        if (this == rect) {
            return true;
        }
        return this.f12943a == rect.f12943a && this.f12944b == rect.f12944b && this.f12945c == rect.f12945c && this.f12946d == rect.f12946d;
    }
}
