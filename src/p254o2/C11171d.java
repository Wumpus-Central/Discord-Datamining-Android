package p254o2;

import p343t2.C12943d;
import p343t2.C12948i;

/* renamed from: o2.d */
/* loaded from: classes.dex */
public class C11171d {

    /* renamed from: a */
    private final float[] f24852a;

    /* renamed from: b */
    private final int[] f24853b;

    public C11171d(float[] fArr, int[] iArr) {
        this.f24852a = fArr;
        this.f24853b = iArr;
    }

    /* renamed from: a */
    public int[] m10614a() {
        return this.f24853b;
    }

    /* renamed from: b */
    public float[] m10613b() {
        return this.f24852a;
    }

    /* renamed from: c */
    public int m10612c() {
        return this.f24853b.length;
    }

    /* renamed from: d */
    public void m10611d(C11171d dVar, C11171d dVar2, float f) {
        if (dVar.f24853b.length == dVar2.f24853b.length) {
            for (int i = 0; i < dVar.f24853b.length; i++) {
                this.f24852a[i] = C12948i.m4974i(dVar.f24852a[i], dVar2.f24852a[i], f);
                this.f24853b[i] = C12943d.m5017c(f, dVar.f24853b[i], dVar2.f24853b[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.f24853b.length + " vs " + dVar2.f24853b.length + ")");
    }
}
