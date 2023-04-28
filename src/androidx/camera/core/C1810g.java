package androidx.camera.core;

import androidx.camera.core.AbstractC1926u;

/* renamed from: androidx.camera.core.g */
/* loaded from: classes.dex */
final class C1810g extends AbstractC1926u.AbstractC1927a {

    /* renamed from: a */
    private final int f1705a;

    /* renamed from: b */
    private final Throwable f1706b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1810g(int i, Throwable th2) {
        this.f1705a = i;
        this.f1706b = th2;
    }

    @Override // androidx.camera.core.AbstractC1926u.AbstractC1927a
    /* renamed from: c */
    public Throwable mo39500c() {
        return this.f1706b;
    }

    @Override // androidx.camera.core.AbstractC1926u.AbstractC1927a
    /* renamed from: d */
    public int mo39499d() {
        return this.f1705a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1926u.AbstractC1927a)) {
            return false;
        }
        AbstractC1926u.AbstractC1927a aVar = (AbstractC1926u.AbstractC1927a) obj;
        if (this.f1705a == aVar.mo39499d()) {
            Throwable th2 = this.f1706b;
            if (th2 == null) {
                if (aVar.mo39500c() == null) {
                    return true;
                }
            } else if (th2.equals(aVar.mo39500c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = (this.f1705a ^ 1000003) * 1000003;
        Throwable th2 = this.f1706b;
        if (th2 == null) {
            i = 0;
        } else {
            i = th2.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "StateError{code=" + this.f1705a + ", cause=" + this.f1706b + "}";
    }
}
