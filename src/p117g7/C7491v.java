package p117g7;

/* renamed from: g7.v */
/* loaded from: classes7.dex */
public final class C7491v {

    /* renamed from: a */
    public final int f16237a;

    /* renamed from: b */
    public final float f16238b;

    public C7491v(int i, float f) {
        this.f16237a = i;
        this.f16238b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7491v.class != obj.getClass()) {
            return false;
        }
        C7491v vVar = (C7491v) obj;
        if (this.f16237a == vVar.f16237a && Float.compare(vVar.f16238b, this.f16238b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f16237a) * 31) + Float.floatToIntBits(this.f16238b);
    }
}
