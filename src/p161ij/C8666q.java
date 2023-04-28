package p161ij;

import p143hj.AbstractC8046c;

/* renamed from: ij.q */
/* loaded from: classes8.dex */
final class C8666q<A> implements AbstractC8046c<A> {

    /* renamed from: a */
    private final String f19151a;

    /* renamed from: b */
    private final Class<A> f19152b;

    private C8666q(String str, Class<A> cls) {
        if (str == null) {
            throw new NullPointerException("Missing name of attribute key.");
        } else if (cls != null) {
            this.f19151a = str;
            this.f19152b = cls;
        } else {
            throw new NullPointerException("Missing type of attribute.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <A> C8666q<A> m18415a(String str, Class<A> cls) {
        return new C8666q<>(str, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8666q)) {
            return false;
        }
        C8666q qVar = (C8666q) obj;
        if (!this.f19151a.equals(qVar.f19151a) || !this.f19152b.equals(qVar.f19152b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f19151a.hashCode();
    }

    @Override // p143hj.AbstractC8046c
    public String name() {
        return this.f19151a;
    }

    public String toString() {
        return this.f19152b.getName() + "@" + this.f19151a;
    }

    @Override // p143hj.AbstractC8046c
    public Class<A> type() {
        return this.f19152b;
    }
}
