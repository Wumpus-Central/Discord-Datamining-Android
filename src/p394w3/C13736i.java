package p394w3;

import java.util.Arrays;

/* renamed from: w3.i */
/* loaded from: classes7.dex */
public final class C13736i {

    /* renamed from: w3.i$b */
    /* loaded from: classes7.dex */
    public static final class C13738b {

        /* renamed from: a */
        private final String f30704a;

        /* renamed from: b */
        private final C13739a f30705b;

        /* renamed from: c */
        private C13739a f30706c;

        /* renamed from: d */
        private boolean f30707d;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w3.i$b$a */
        /* loaded from: classes7.dex */
        public static final class C13739a {

            /* renamed from: a */
            String f30708a;

            /* renamed from: b */
            Object f30709b;

            /* renamed from: c */
            C13739a f30710c;

            private C13739a() {
            }
        }

        /* renamed from: d */
        private C13739a m2842d() {
            C13739a aVar = new C13739a();
            this.f30706c.f30710c = aVar;
            this.f30706c = aVar;
            return aVar;
        }

        /* renamed from: e */
        private C13738b m2841e(String str, Object obj) {
            C13739a d = m2842d();
            d.f30709b = obj;
            d.f30708a = (String) C13740j.m2834g(str);
            return this;
        }

        /* renamed from: a */
        public C13738b m2845a(String str, int i) {
            return m2841e(str, String.valueOf(i));
        }

        /* renamed from: b */
        public C13738b m2844b(String str, Object obj) {
            return m2841e(str, obj);
        }

        /* renamed from: c */
        public C13738b m2843c(String str, boolean z) {
            return m2841e(str, String.valueOf(z));
        }

        public String toString() {
            boolean z = this.f30707d;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f30704a);
            sb2.append('{');
            String str = "";
            for (C13739a aVar = this.f30705b.f30710c; aVar != null; aVar = aVar.f30710c) {
                Object obj = aVar.f30709b;
                if (!z || obj != null) {
                    sb2.append(str);
                    String str2 = aVar.f30708a;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }

        private C13738b(String str) {
            C13739a aVar = new C13739a();
            this.f30705b = aVar;
            this.f30706c = aVar;
            this.f30707d = false;
            this.f30704a = (String) C13740j.m2834g(str);
        }
    }

    /* renamed from: a */
    public static boolean m2848a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m2847b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: c */
    public static C13738b m2846c(Object obj) {
        return new C13738b(obj.getClass().getSimpleName());
    }
}
