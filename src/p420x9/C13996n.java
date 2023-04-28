package p420x9;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: x9.n */
/* loaded from: classes5.dex */
public final class C13996n {

    /* renamed from: x9.n$a */
    /* loaded from: classes5.dex */
    public static final class C13997a {

        /* renamed from: a */
        private final List<String> f31570a = new ArrayList();

        /* renamed from: b */
        private final Object f31571b;

        /* synthetic */ C13997a(Object obj, C14024w0 w0Var) {
            C14004p.m2051j(obj);
            this.f31571b = obj;
        }

        /* renamed from: a */
        public C13997a m2068a(String str, Object obj) {
            List<String> list = this.f31570a;
            C14004p.m2051j(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(str.length() + 1 + valueOf.length());
            sb2.append(str);
            sb2.append("=");
            sb2.append(valueOf);
            list.add(sb2.toString());
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f31571b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f31570a.size();
            for (int i = 0; i < size; i++) {
                sb2.append(this.f31570a.get(i));
                if (i < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    /* renamed from: a */
    public static boolean m2072a(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            if (bundle == bundle2) {
                return true;
            }
            return false;
        } else if (bundle.size() != bundle2.size()) {
            return false;
        } else {
            Set<String> keySet = bundle.keySet();
            if (!keySet.containsAll(bundle2.keySet())) {
                return false;
            }
            for (String str : keySet) {
                if (!m2071b(bundle.get(str), bundle2.get(str))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    public static boolean m2071b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: c */
    public static int m2070c(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: d */
    public static C13997a m2069d(Object obj) {
        return new C13997a(obj, null);
    }
}
