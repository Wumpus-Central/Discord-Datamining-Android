package androidx.camera.core;

import androidx.camera.core.AbstractC1926u;

/* renamed from: androidx.camera.core.f */
/* loaded from: classes.dex */
final class C1806f extends AbstractC1926u {

    /* renamed from: a */
    private final AbstractC1926u.EnumC1928b f1701a;

    /* renamed from: b */
    private final AbstractC1926u.AbstractC1927a f1702b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1806f(AbstractC1926u.EnumC1928b bVar, AbstractC1926u.AbstractC1927a aVar) {
        if (bVar != null) {
            this.f1701a = bVar;
            this.f1702b = aVar;
            return;
        }
        throw new NullPointerException("Null type");
    }

    @Override // androidx.camera.core.AbstractC1926u
    /* renamed from: c */
    public AbstractC1926u.AbstractC1927a mo39504c() {
        return this.f1702b;
    }

    @Override // androidx.camera.core.AbstractC1926u
    /* renamed from: d */
    public AbstractC1926u.EnumC1928b mo39503d() {
        return this.f1701a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1926u)) {
            return false;
        }
        AbstractC1926u uVar = (AbstractC1926u) obj;
        if (this.f1701a.equals(uVar.mo39503d())) {
            AbstractC1926u.AbstractC1927a aVar = this.f1702b;
            if (aVar == null) {
                if (uVar.mo39504c() == null) {
                    return true;
                }
            } else if (aVar.equals(uVar.mo39504c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.f1701a.hashCode() ^ 1000003) * 1000003;
        AbstractC1926u.AbstractC1927a aVar = this.f1702b;
        if (aVar == null) {
            i = 0;
        } else {
            i = aVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "CameraState{type=" + this.f1701a + ", error=" + this.f1702b + "}";
    }
}
