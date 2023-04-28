package p288q;

import android.util.Size;
import p288q.C11840j0;
import p390w.C13619k2;

/* renamed from: q.d */
/* loaded from: classes.dex */
final class C11801d extends C11840j0.AbstractC11850h {

    /* renamed from: a */
    private final String f26336a;

    /* renamed from: b */
    private final Class<?> f26337b;

    /* renamed from: c */
    private final C13619k2 f26338c;

    /* renamed from: d */
    private final Size f26339d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11801d(String str, Class<?> cls, C13619k2 k2Var, Size size) {
        if (str != null) {
            this.f26336a = str;
            if (cls != null) {
                this.f26337b = cls;
                if (k2Var != null) {
                    this.f26338c = k2Var;
                    this.f26339d = size;
                    return;
                }
                throw new NullPointerException("Null sessionConfig");
            }
            throw new NullPointerException("Null useCaseType");
        }
        throw new NullPointerException("Null useCaseId");
    }

    @Override // p288q.C11840j0.AbstractC11850h
    /* renamed from: c */
    C13619k2 mo8454c() {
        return this.f26338c;
    }

    @Override // p288q.C11840j0.AbstractC11850h
    /* renamed from: d */
    Size mo8453d() {
        return this.f26339d;
    }

    @Override // p288q.C11840j0.AbstractC11850h
    /* renamed from: e */
    String mo8452e() {
        return this.f26336a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11840j0.AbstractC11850h)) {
            return false;
        }
        C11840j0.AbstractC11850h hVar = (C11840j0.AbstractC11850h) obj;
        if (this.f26336a.equals(hVar.mo8452e()) && this.f26337b.equals(hVar.mo8451f()) && this.f26338c.equals(hVar.mo8454c())) {
            Size size = this.f26339d;
            if (size == null) {
                if (hVar.mo8453d() == null) {
                    return true;
                }
            } else if (size.equals(hVar.mo8453d())) {
                return true;
            }
        }
        return false;
    }

    @Override // p288q.C11840j0.AbstractC11850h
    /* renamed from: f */
    Class<?> mo8451f() {
        return this.f26337b;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((this.f26336a.hashCode() ^ 1000003) * 1000003) ^ this.f26337b.hashCode()) * 1000003) ^ this.f26338c.hashCode()) * 1000003;
        Size size = this.f26339d;
        if (size == null) {
            i = 0;
        } else {
            i = size.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f26336a + ", useCaseType=" + this.f26337b + ", sessionConfig=" + this.f26338c + ", surfaceResolution=" + this.f26339d + "}";
    }
}
