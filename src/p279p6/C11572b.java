package p279p6;

/* renamed from: p6.b */
/* loaded from: classes7.dex */
public final class C11572b {

    /* renamed from: a */
    private final String f25816a;

    private C11572b(String str) {
        if (str != null) {
            this.f25816a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    /* renamed from: b */
    public static C11572b m9324b(String str) {
        return new C11572b(str);
    }

    /* renamed from: a */
    public String m9325a() {
        return this.f25816a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11572b)) {
            return false;
        }
        return this.f25816a.equals(((C11572b) obj).f25816a);
    }

    public int hashCode() {
        return this.f25816a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f25816a + "\"}";
    }
}
