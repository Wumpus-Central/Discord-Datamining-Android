package p390w;

import p390w.AbstractC13658q2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w.g */
/* loaded from: classes.dex */
public final class C13596g extends AbstractC13658q2 {

    /* renamed from: a */
    private final AbstractC13658q2.EnumC13660b f30391a;

    /* renamed from: b */
    private final AbstractC13658q2.EnumC13659a f30392b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13596g(AbstractC13658q2.EnumC13660b bVar, AbstractC13658q2.EnumC13659a aVar) {
        if (bVar != null) {
            this.f30391a = bVar;
            if (aVar != null) {
                this.f30392b = aVar;
                return;
            }
            throw new NullPointerException("Null configSize");
        }
        throw new NullPointerException("Null configType");
    }

    @Override // p390w.AbstractC13658q2
    /* renamed from: b */
    public AbstractC13658q2.EnumC13659a mo3106b() {
        return this.f30392b;
    }

    @Override // p390w.AbstractC13658q2
    /* renamed from: c */
    public AbstractC13658q2.EnumC13660b mo3105c() {
        return this.f30391a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC13658q2)) {
            return false;
        }
        AbstractC13658q2 q2Var = (AbstractC13658q2) obj;
        if (!this.f30391a.equals(q2Var.mo3105c()) || !this.f30392b.equals(q2Var.mo3106b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f30391a.hashCode() ^ 1000003) * 1000003) ^ this.f30392b.hashCode();
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.f30391a + ", configSize=" + this.f30392b + "}";
    }
}
