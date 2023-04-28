package p318r9;

/* renamed from: r9.b */
/* loaded from: classes5.dex */
public class C12468b {

    /* renamed from: b */
    static int f28125b = 31;

    /* renamed from: a */
    private int f28126a = 1;

    /* renamed from: a */
    public C12468b m6653a(Object obj) {
        this.f28126a = (f28125b * this.f28126a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* renamed from: b */
    public int m6652b() {
        return this.f28126a;
    }

    /* renamed from: c */
    public final C12468b m6651c(boolean z) {
        this.f28126a = (f28125b * this.f28126a) + (z ? 1 : 0);
        return this;
    }
}
