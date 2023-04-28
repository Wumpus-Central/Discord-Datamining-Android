package p390w;

import p390w.AbstractC13662r0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w.c */
/* loaded from: classes.dex */
public final class C13578c<T> extends AbstractC13662r0.AbstractC13663a<T> {

    /* renamed from: a */
    private final String f30367a;

    /* renamed from: b */
    private final Class<T> f30368b;

    /* renamed from: c */
    private final Object f30369c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13578c(String str, Class<T> cls, Object obj) {
        if (str != null) {
            this.f30367a = str;
            if (cls != null) {
                this.f30368b = cls;
                this.f30369c = obj;
                return;
            }
            throw new NullPointerException("Null valueClass");
        }
        throw new NullPointerException("Null id");
    }

    @Override // p390w.AbstractC13662r0.AbstractC13663a
    /* renamed from: c */
    public String mo3100c() {
        return this.f30367a;
    }

    @Override // p390w.AbstractC13662r0.AbstractC13663a
    /* renamed from: d */
    public Object mo3099d() {
        return this.f30369c;
    }

    @Override // p390w.AbstractC13662r0.AbstractC13663a
    /* renamed from: e */
    public Class<T> mo3098e() {
        return this.f30368b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC13662r0.AbstractC13663a)) {
            return false;
        }
        AbstractC13662r0.AbstractC13663a aVar = (AbstractC13662r0.AbstractC13663a) obj;
        if (this.f30367a.equals(aVar.mo3100c()) && this.f30368b.equals(aVar.mo3098e())) {
            Object obj2 = this.f30369c;
            if (obj2 == null) {
                if (aVar.mo3099d() == null) {
                    return true;
                }
            } else if (obj2.equals(aVar.mo3099d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (((this.f30367a.hashCode() ^ 1000003) * 1000003) ^ this.f30368b.hashCode()) * 1000003;
        Object obj = this.f30369c;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Option{id=" + this.f30367a + ", valueClass=" + this.f30368b + ", token=" + this.f30369c + "}";
    }
}
