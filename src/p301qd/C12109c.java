package p301qd;

import p066dd.C6446o;

/* renamed from: qd.c */
/* loaded from: classes3.dex */
public final class C12109c {

    /* renamed from: a */
    private final int f27163a;

    /* renamed from: b */
    private final int[] f27164b;

    /* renamed from: c */
    private final C6446o[] f27165c;

    public C12109c(int i, int[] iArr, int i2, int i3, int i4) {
        this.f27163a = i;
        this.f27164b = iArr;
        float f = i4;
        this.f27165c = new C6446o[]{new C6446o(i2, f), new C6446o(i3, f)};
    }

    /* renamed from: a */
    public C6446o[] m7819a() {
        return this.f27165c;
    }

    /* renamed from: b */
    public int[] m7818b() {
        return this.f27164b;
    }

    /* renamed from: c */
    public int m7817c() {
        return this.f27163a;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C12109c) && this.f27163a == ((C12109c) obj).f27163a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f27163a;
    }
}
