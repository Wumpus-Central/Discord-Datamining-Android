package p163j$.util.concurrent;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.l */
/* loaded from: classes2.dex */
public final class C9263l implements Map.Entry {

    /* renamed from: a */
    final Object f20333a;

    /* renamed from: b */
    Object f20334b;

    /* renamed from: c */
    final ConcurrentHashMap f20335c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9263l(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f20333a = obj;
        this.f20334b = obj2;
        this.f20335c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f20333a) || key.equals(obj2)) && (value == (obj3 = this.f20334b) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f20333a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f20334b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f20333a.hashCode() ^ this.f20334b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f20334b;
        this.f20334b = obj;
        this.f20335c.put(this.f20333a, obj);
        return obj2;
    }

    public final String toString() {
        return this.f20333a + "=" + this.f20334b;
    }
}
