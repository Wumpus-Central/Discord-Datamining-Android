package p228m7;

/* renamed from: m7.z */
/* loaded from: classes7.dex */
public final class C10537z {

    /* renamed from: c */
    public static final C10537z f23295c = new C10537z(0, 0);

    /* renamed from: a */
    public final long f23296a;

    /* renamed from: b */
    public final long f23297b;

    public C10537z(long j, long j2) {
        this.f23296a = j;
        this.f23297b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10537z.class != obj.getClass()) {
            return false;
        }
        C10537z zVar = (C10537z) obj;
        if (this.f23296a == zVar.f23296a && this.f23297b == zVar.f23297b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f23296a) * 31) + ((int) this.f23297b);
    }

    public String toString() {
        return "[timeUs=" + this.f23296a + ", position=" + this.f23297b + "]";
    }
}
