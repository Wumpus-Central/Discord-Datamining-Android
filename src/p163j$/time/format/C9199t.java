package p163j$.time.format;

import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.format.t */
/* loaded from: classes2.dex */
public final class C9199t {

    /* renamed from: a */
    public static final C9199t f20198a = new C9199t();

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    private C9199t() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9199t)) {
            return false;
        }
        ((C9199t) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 182;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
