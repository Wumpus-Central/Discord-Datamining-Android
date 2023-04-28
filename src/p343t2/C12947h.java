package p343t2;

/* renamed from: t2.h */
/* loaded from: classes.dex */
public class C12947h {

    /* renamed from: a */
    private float f29037a;

    /* renamed from: b */
    private int f29038b;

    /* renamed from: a */
    public void m4983a(float f) {
        float f2 = this.f29037a + f;
        this.f29037a = f2;
        int i = this.f29038b + 1;
        this.f29038b = i;
        if (i == Integer.MAX_VALUE) {
            this.f29037a = f2 / 2.0f;
            this.f29038b = i / 2;
        }
    }
}
