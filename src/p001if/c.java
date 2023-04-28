package p001if;

/* renamed from: if.c */
/* loaded from: classes8.dex */
public class c {

    /* renamed from: a */
    private int f18314a;

    /* renamed from: b */
    private int f18315b;

    /* renamed from: c */
    private int f18316c;

    public c(int i, int i2, int i3) {
        this.f18314a = i;
        this.f18315b = i2;
        this.f18316c = i3;
    }

    /* renamed from: a */
    public int m19839a() {
        return this.f18315b;
    }

    /* renamed from: b */
    public int m19838b() {
        return this.f18316c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f18314a == cVar.f18314a && this.f18315b == cVar.f18315b && this.f18316c == cVar.f18316c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f18314a * 31) + this.f18315b) * 31) + this.f18316c;
    }
}
