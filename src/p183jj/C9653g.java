package p183jj;

import p143hj.AbstractC8079p;

/* renamed from: jj.g */
/* loaded from: classes8.dex */
public final class C9653g {

    /* renamed from: a */
    private final AbstractC8079p<?> f21409a;

    /* renamed from: b */
    private final int f21410b;

    /* renamed from: c */
    private final int f21411c;

    public C9653g(AbstractC8079p<?> pVar, int i, int i2) {
        if (pVar == null) {
            throw new NullPointerException("Missing chronological element.");
        } else if (i < 0) {
            throw new IllegalArgumentException("Negative start index: " + i + " (" + pVar.name() + ")");
        } else if (i2 > i) {
            this.f21409a = pVar;
            this.f21410b = i;
            this.f21411c = i2;
        } else {
            throw new IllegalArgumentException("End index " + i2 + " must be greater than start index " + i + " (" + pVar.name() + ")");
        }
    }

    /* renamed from: a */
    public AbstractC8079p<?> m15772a() {
        return this.f21409a;
    }

    /* renamed from: b */
    public int m15771b() {
        return this.f21411c;
    }

    /* renamed from: c */
    public int m15770c() {
        return this.f21410b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9653g)) {
            return false;
        }
        C9653g gVar = (C9653g) obj;
        if (this.f21409a.equals(gVar.f21409a) && this.f21410b == gVar.f21410b && this.f21411c == gVar.f21411c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f21409a.hashCode() + ((this.f21410b | (this.f21411c << 16)) * 37);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(80);
        sb2.append(C9653g.class.getName());
        sb2.append("[element=");
        sb2.append(this.f21409a.name());
        sb2.append(",start-index=");
        sb2.append(this.f21410b);
        sb2.append(",end-index=");
        sb2.append(this.f21411c);
        sb2.append(']');
        return sb2.toString();
    }
}
