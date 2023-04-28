package p126h2;

import java.util.Arrays;

/* renamed from: h2.k0 */
/* loaded from: classes.dex */
public final class C7767k0<V> {

    /* renamed from: a */
    private final V f16904a;

    /* renamed from: b */
    private final Throwable f16905b;

    public C7767k0(V v) {
        this.f16904a = v;
        this.f16905b = null;
    }

    /* renamed from: a */
    public Throwable m21380a() {
        return this.f16905b;
    }

    /* renamed from: b */
    public V m21379b() {
        return this.f16904a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7767k0)) {
            return false;
        }
        C7767k0 k0Var = (C7767k0) obj;
        if (m21379b() != null && m21379b().equals(k0Var.m21379b())) {
            return true;
        }
        if (m21380a() == null || k0Var.m21380a() == null) {
            return false;
        }
        return m21380a().toString().equals(m21380a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{m21379b(), m21380a()});
    }

    public C7767k0(Throwable th2) {
        this.f16905b = th2;
        this.f16904a = null;
    }
}
