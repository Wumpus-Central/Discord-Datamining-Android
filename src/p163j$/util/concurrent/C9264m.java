package p163j$.util.concurrent;

import java.util.Map;

/* renamed from: j$.util.concurrent.m */
/* loaded from: classes2.dex */
class C9264m implements Map.Entry {

    /* renamed from: a */
    final int f20336a;

    /* renamed from: b */
    final Object f20337b;

    /* renamed from: c */
    volatile Object f20338c;

    /* renamed from: d */
    volatile C9264m f20339d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9264m(int i, Object obj, Object obj2, C9264m mVar) {
        this.f20336a = i;
        this.f20337b = obj;
        this.f20338c = obj2;
        this.f20339d = mVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C9264m mo16560a(int i, Object obj) {
        Object obj2;
        if (obj == null) {
            return null;
        }
        C9264m mVar = this;
        do {
            if (mVar.f20336a == i && ((obj2 = mVar.f20337b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return mVar;
            }
            mVar = mVar.f20339d;
        } while (mVar != null);
        return null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f20337b) || key.equals(obj2)) && (value == (obj3 = this.f20338c) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f20337b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f20338c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f20337b.hashCode() ^ this.f20338c.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.f20337b + "=" + this.f20338c;
    }
}
