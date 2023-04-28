package p182ji;

import java.util.ArrayList;

/* renamed from: ji.a */
/* loaded from: classes8.dex */
public final class C9610a extends ArrayList<AbstractC9622m> implements AbstractC9621l {
    public C9610a(int i) {
        super(i);
    }

    /* renamed from: a */
    public /* bridge */ boolean m15925a(AbstractC9622m mVar) {
        return super.contains(mVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj == null ? true : obj instanceof AbstractC9622m)) {
            return false;
        }
        return m15925a((AbstractC9622m) obj);
    }

    /* renamed from: e */
    public /* bridge */ int m15924e() {
        return super.size();
    }

    /* renamed from: f */
    public /* bridge */ int m15923f(AbstractC9622m mVar) {
        return super.indexOf(mVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj == null ? true : obj instanceof AbstractC9622m)) {
            return -1;
        }
        return m15923f((AbstractC9622m) obj);
    }

    /* renamed from: j */
    public /* bridge */ int m15922j(AbstractC9622m mVar) {
        return super.lastIndexOf(mVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj == null ? true : obj instanceof AbstractC9622m)) {
            return -1;
        }
        return m15922j((AbstractC9622m) obj);
    }

    /* renamed from: r */
    public /* bridge */ boolean m15921r(AbstractC9622m mVar) {
        return super.remove(mVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj == null ? true : obj instanceof AbstractC9622m)) {
            return false;
        }
        return m15921r((AbstractC9622m) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return m15924e();
    }
}
