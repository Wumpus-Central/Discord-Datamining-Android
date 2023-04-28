package cd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cd.a */
/* loaded from: classes3.dex */
public final class C3978a extends AbstractC3983f {

    /* renamed from: a */
    private final String f6536a;

    /* renamed from: b */
    private final String f6537b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3978a(String str, String str2) {
        if (str != null) {
            this.f6536a = str;
            if (str2 != null) {
                this.f6537b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Override // cd.AbstractC3983f
    /* renamed from: b */
    public String mo33201b() {
        return this.f6536a;
    }

    @Override // cd.AbstractC3983f
    /* renamed from: c */
    public String mo33200c() {
        return this.f6537b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3983f)) {
            return false;
        }
        AbstractC3983f fVar = (AbstractC3983f) obj;
        if (!this.f6536a.equals(fVar.mo33201b()) || !this.f6537b.equals(fVar.mo33200c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f6536a.hashCode() ^ 1000003) * 1000003) ^ this.f6537b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f6536a + ", version=" + this.f6537b + "}";
    }
}
