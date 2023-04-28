package mc;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: mc.c */
/* loaded from: classes3.dex */
public final class C10582c {

    /* renamed from: a */
    private final String f23428a;

    /* renamed from: b */
    private final Map<Class<?>, Object> f23429b;

    /* renamed from: mc.c$b */
    /* loaded from: classes3.dex */
    public static final class C10584b {

        /* renamed from: a */
        private final String f23430a;

        /* renamed from: b */
        private Map<Class<?>, Object> f23431b = null;

        C10584b(String str) {
            this.f23430a = str;
        }

        /* renamed from: a */
        public C10582c m12796a() {
            Map map;
            String str = this.f23430a;
            if (this.f23431b == null) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(new HashMap(this.f23431b));
            }
            return new C10582c(str, map);
        }

        /* renamed from: b */
        public <T extends Annotation> C10584b m12795b(T t) {
            if (this.f23431b == null) {
                this.f23431b = new HashMap();
            }
            this.f23431b.put(t.annotationType(), t);
            return this;
        }
    }

    /* renamed from: a */
    public static C10584b m12800a(String str) {
        return new C10584b(str);
    }

    /* renamed from: d */
    public static C10582c m12797d(String str) {
        return new C10582c(str, Collections.emptyMap());
    }

    /* renamed from: b */
    public String m12799b() {
        return this.f23428a;
    }

    /* renamed from: c */
    public <T extends Annotation> T m12798c(Class<T> cls) {
        return (T) ((Annotation) this.f23429b.get(cls));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10582c)) {
            return false;
        }
        C10582c cVar = (C10582c) obj;
        if (!this.f23428a.equals(cVar.f23428a) || !this.f23429b.equals(cVar.f23429b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f23428a.hashCode() * 31) + this.f23429b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f23428a + ", properties=" + this.f23429b.values() + "}";
    }

    private C10582c(String str, Map<Class<?>, Object> map) {
        this.f23428a = str;
        this.f23429b = map;
    }
}
