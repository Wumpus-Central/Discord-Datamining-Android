package p390w;

import p390w.AbstractC13647o2;

/* renamed from: w.f */
/* loaded from: classes.dex */
final class C13592f extends AbstractC13647o2.AbstractC13648a {

    /* renamed from: a */
    private final Throwable f30386a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13592f(Throwable th2) {
        if (th2 != null) {
            this.f30386a = th2;
            return;
        }
        throw new NullPointerException("Null error");
    }

    @Override // p390w.AbstractC13647o2.AbstractC13648a
    /* renamed from: a */
    public Throwable mo3118a() {
        return this.f30386a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC13647o2.AbstractC13648a) {
            return this.f30386a.equals(((AbstractC13647o2.AbstractC13648a) obj).mo3118a());
        }
        return false;
    }

    public int hashCode() {
        return this.f30386a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ErrorWrapper{error=" + this.f30386a + "}";
    }
}
