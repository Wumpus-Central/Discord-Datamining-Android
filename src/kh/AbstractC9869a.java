package kh;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C9897e;
import kotlin.collections.C9899f;
import kotlin.collections.C9906j;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: kh.a */
/* loaded from: classes8.dex */
public abstract class AbstractC9869a {

    /* renamed from: f */
    public static final C0300a f21994f = new C0300a(null);

    /* renamed from: a */
    private final int[] f21995a;

    /* renamed from: b */
    private final int f21996b;

    /* renamed from: c */
    private final int f21997c;

    /* renamed from: d */
    private final int f21998d;

    /* renamed from: e */
    private final List<Integer> f21999e;

    /* renamed from: kh.a$a */
    /* loaded from: classes8.dex */
    public static final class C0300a {
        private C0300a() {
        }

        public /* synthetic */ C0300a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AbstractC9869a(int... numbers) {
        Integer J;
        int i;
        Integer J2;
        int i2;
        Integer J3;
        List<Integer> list;
        List c;
        C9971q.m14633g(numbers, "numbers");
        this.f21995a = numbers;
        J = C9899f.m14954J(numbers, 0);
        int i3 = -1;
        if (J != null) {
            i = J.intValue();
        } else {
            i = -1;
        }
        this.f21996b = i;
        J2 = C9899f.m14954J(numbers, 1);
        if (J2 != null) {
            i2 = J2.intValue();
        } else {
            i2 = -1;
        }
        this.f21997c = i2;
        J3 = C9899f.m14954J(numbers, 2);
        this.f21998d = J3 != null ? J3.intValue() : i3;
        if (numbers.length <= 3) {
            list = C9906j.m14820i();
        } else if (numbers.length <= 1024) {
            c = C9897e.m14992c(numbers);
            list = C9914r.m14790D0(c.subList(3, numbers.length));
        } else {
            throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + numbers.length + '.');
        }
        this.f21999e = list;
    }

    /* renamed from: a */
    public final int m15154a() {
        return this.f21996b;
    }

    /* renamed from: b */
    public final int m15153b() {
        return this.f21997c;
    }

    /* renamed from: c */
    public final boolean m15152c(int i, int i2, int i3) {
        int i4 = this.f21996b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.f21997c;
        if (i5 > i2) {
            return true;
        }
        if (i5 >= i2 && this.f21998d >= i3) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m15151d(AbstractC9869a version) {
        C9971q.m14633g(version, "version");
        return m15152c(version.f21996b, version.f21997c, version.f21998d);
    }

    /* renamed from: e */
    public final boolean m15150e(int i, int i2, int i3) {
        int i4 = this.f21996b;
        if (i4 < i) {
            return true;
        }
        if (i4 > i) {
            return false;
        }
        int i5 = this.f21997c;
        if (i5 < i2) {
            return true;
        }
        if (i5 <= i2 && this.f21998d <= i3) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj != null && C9971q.m14638b(getClass(), obj.getClass())) {
            AbstractC9869a aVar = (AbstractC9869a) obj;
            if (this.f21996b == aVar.f21996b && this.f21997c == aVar.f21997c && this.f21998d == aVar.f21998d && C9971q.m14638b(this.f21999e, aVar.f21999e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean m15149f(AbstractC9869a ourVersion) {
        C9971q.m14633g(ourVersion, "ourVersion");
        int i = this.f21996b;
        if (i == 0) {
            if (ourVersion.f21996b == 0 && this.f21997c == ourVersion.f21997c) {
                return true;
            }
        } else if (i == ourVersion.f21996b && this.f21997c <= ourVersion.f21997c) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final int[] m15148g() {
        return this.f21995a;
    }

    public int hashCode() {
        int i = this.f21996b;
        int i2 = i + (i * 31) + this.f21997c;
        int i3 = i2 + (i2 * 31) + this.f21998d;
        return i3 + (i3 * 31) + this.f21999e.hashCode();
    }

    public String toString() {
        String e0;
        boolean z;
        int[] g = m15148g();
        ArrayList arrayList = new ArrayList();
        for (int i : g) {
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        if (arrayList.isEmpty()) {
            return "unknown";
        }
        e0 = C9914r.m14760e0(arrayList, ".", null, null, 0, null, null, 62, null);
        return e0;
    }
}
