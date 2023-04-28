package p183jj;

import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;
import p161ij.C8627a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jj.o */
/* loaded from: classes8.dex */
public final class C9670o<V> implements AbstractC9657h<V> {

    /* renamed from: k */
    private final AbstractC8079p<V> f21483k;

    /* renamed from: l */
    private final Map<V, String> f21484l;

    /* renamed from: m */
    private final int f21485m;

    /* renamed from: n */
    private final boolean f21486n;

    /* renamed from: o */
    private final Locale f21487o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9670o(AbstractC8079p<V> pVar, Map<V, String> map) {
        Map map2;
        Class<V> type = pVar.getType();
        if (!type.isEnum()) {
            map2 = new HashMap(map.size());
        } else if (map.size() >= type.getEnumConstants().length) {
            map2 = m15679a(type);
        } else {
            throw new IllegalArgumentException("Not enough text resources defined for enum: " + type.getName());
        }
        map2.putAll(map);
        this.f21483k = pVar;
        this.f21484l = Collections.unmodifiableMap(map2);
        this.f21485m = 0;
        this.f21486n = true;
        this.f21487o = Locale.getDefault();
    }

    /* renamed from: a */
    private static <V, K extends Enum<K>> Map<V, String> m15679a(Class<V> cls) {
        return new EnumMap(cls);
    }

    /* renamed from: h */
    private String m15678h(V v) {
        String str = this.f21484l.get(v);
        if (str == null) {
            return v.toString();
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    private int m15677i(AbstractC8077o oVar, Appendable appendable) {
        String h = m15678h(oVar.mo11371r(this.f21483k));
        appendable.append(h);
        return h.length();
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: b */
    public AbstractC8079p<V> mo15599b() {
        return this.f21483k;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: c */
    public int mo15598c(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar, Set<C9653g> set, boolean z) {
        if (!(appendable instanceof CharSequence)) {
            return m15677i(oVar, appendable);
        }
        CharSequence charSequence = (CharSequence) appendable;
        int length = charSequence.length();
        int i = m15677i(oVar, appendable);
        if (set != null) {
            set.add(new C9653g(this.f21483k, length, charSequence.length()));
        }
        return i;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: d */
    public AbstractC9657h<V> mo15597d(AbstractC8079p<V> pVar) {
        if (this.f21483k == pVar) {
            return this;
        }
        return new C9670o(pVar, this.f21484l);
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: e */
    public void mo15596e(CharSequence charSequence, C9675s sVar, AbstractC8048d dVar, AbstractC9676t<?> tVar, boolean z) {
        int i;
        boolean z2;
        Locale locale;
        int f = sVar.m15664f();
        int length = charSequence.length();
        if (z) {
            i = this.f21485m;
        } else {
            i = ((Integer) dVar.mo15674c(C8627a.f19070s, 0)).intValue();
        }
        if (i > 0) {
            length -= i;
        }
        if (f >= length) {
            sVar.m15659k(f, "Missing chars for: " + this.f21483k.name());
            sVar.m15656n();
            return;
        }
        if (z) {
            z2 = this.f21486n;
        } else {
            z2 = ((Boolean) dVar.mo15674c(C8627a.f19060i, Boolean.TRUE)).booleanValue();
        }
        if (z) {
            locale = this.f21487o;
        } else {
            locale = (Locale) dVar.mo15674c(C8627a.f19054c, Locale.getDefault());
        }
        int i2 = length - f;
        for (V v : this.f21484l.keySet()) {
            String h = m15678h(v);
            if (z2) {
                String upperCase = h.toUpperCase(locale);
                int length2 = h.length();
                if (length2 <= i2) {
                    int i3 = length2 + f;
                    if (upperCase.equals(charSequence.subSequence(f, i3).toString().toUpperCase(locale))) {
                        tVar.mo15648I(this.f21483k, v);
                        sVar.m15658l(i3);
                        return;
                    }
                } else {
                    continue;
                }
            } else {
                int length3 = h.length();
                if (length3 <= i2) {
                    int i4 = length3 + f;
                    if (h.equals(charSequence.subSequence(f, i4).toString())) {
                        tVar.mo15648I(this.f21483k, v);
                        sVar.m15658l(i4);
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
        sVar.m15659k(f, "Element value could not be parsed: " + this.f21483k.name());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9670o)) {
            return false;
        }
        C9670o oVar = (C9670o) obj;
        if (!this.f21483k.equals(oVar.f21483k) || !this.f21484l.equals(oVar.f21484l)) {
            return false;
        }
        return true;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: f */
    public boolean mo15595f() {
        return false;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: g */
    public AbstractC9657h<V> mo15594g(C9637c<?> cVar, AbstractC8048d dVar, int i) {
        return new C9670o(this.f21483k, this.f21484l, ((Integer) dVar.mo15674c(C8627a.f19070s, 0)).intValue(), ((Boolean) dVar.mo15674c(C8627a.f19060i, Boolean.TRUE)).booleanValue(), (Locale) dVar.mo15674c(C8627a.f19054c, Locale.getDefault()));
    }

    public int hashCode() {
        return (this.f21483k.hashCode() * 7) + (this.f21484l.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(512);
        sb2.append(C9670o.class.getName());
        sb2.append("[element=");
        sb2.append(this.f21483k.name());
        sb2.append(", resources=");
        sb2.append(this.f21484l);
        sb2.append(']');
        return sb2.toString();
    }

    private C9670o(AbstractC8079p<V> pVar, Map<V, String> map, int i, boolean z, Locale locale) {
        this.f21483k = pVar;
        this.f21484l = map;
        this.f21485m = i;
        this.f21486n = z;
        this.f21487o = locale;
    }
}
