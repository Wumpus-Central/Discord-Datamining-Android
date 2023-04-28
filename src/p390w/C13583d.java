package p390w;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w.d */
/* loaded from: classes.dex */
public final class C13583d extends AbstractC13586d1 {

    /* renamed from: a */
    private final Object f30375a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13583d(Object obj) {
        if (obj != null) {
            this.f30375a = obj;
            return;
        }
        throw new NullPointerException("Null value");
    }

    @Override // p390w.AbstractC13586d1
    /* renamed from: b */
    public Object mo3303b() {
        return this.f30375a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC13586d1) {
            return this.f30375a.equals(((AbstractC13586d1) obj).mo3303b());
        }
        return false;
    }

    public int hashCode() {
        return this.f30375a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f30375a + "}";
    }
}
