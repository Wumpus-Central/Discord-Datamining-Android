package mg;

import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p217lg.C10434k;
import p249nh.C11137c;
import p249nh.C11142f;

/* JADX WARN: Init of enum r can be incorrect */
/* JADX WARN: Init of enum s can be incorrect */
/* renamed from: mg.c */
/* loaded from: classes8.dex */
public enum EnumC10600c {
    Function(C10434k.f22894u, "Function", false, false),
    SuspendFunction(C10434k.f22886m, "SuspendFunction", true, false),
    KFunction(r8, "KFunction", false, true),
    KSuspendFunction(r8, "KSuspendFunction", true, true);
    

    /* renamed from: o */
    public static final C10601a f23473o = new C10601a(null);

    /* renamed from: k */
    private final C11137c f23479k;

    /* renamed from: l */
    private final String f23480l;

    /* renamed from: m */
    private final boolean f23481m;

    /* renamed from: n */
    private final boolean f23482n;

    /* renamed from: mg.c$a */
    /* loaded from: classes8.dex */
    public static final class C10601a {

        /* renamed from: mg.c$a$a */
        /* loaded from: classes8.dex */
        public static final class C0342a {

            /* renamed from: a */
            private final EnumC10600c f23483a;

            /* renamed from: b */
            private final int f23484b;

            public C0342a(EnumC10600c kind, int i) {
                C9971q.m14633g(kind, "kind");
                this.f23483a = kind;
                this.f23484b = i;
            }

            /* renamed from: a */
            public final EnumC10600c m12752a() {
                return this.f23483a;
            }

            /* renamed from: b */
            public final int m12751b() {
                return this.f23484b;
            }

            /* renamed from: c */
            public final EnumC10600c m12750c() {
                return this.f23483a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0342a)) {
                    return false;
                }
                C0342a aVar = (C0342a) obj;
                return this.f23483a == aVar.f23483a && this.f23484b == aVar.f23484b;
            }

            public int hashCode() {
                return (this.f23483a.hashCode() * 31) + this.f23484b;
            }

            public String toString() {
                return "KindWithArity(kind=" + this.f23483a + ", arity=" + this.f23484b + ')';
            }
        }

        private C10601a() {
        }

        public /* synthetic */ C10601a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        private final Integer m12753d(String str) {
            boolean z;
            boolean z2;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            int length = str.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                int charAt = str.charAt(i2) - '0';
                if (charAt < 0 || charAt >= 10) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    return null;
                }
                i = (i * 10) + charAt;
            }
            return Integer.valueOf(i);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[LOOP:0: B:3:0x0011->B:13:0x0032, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0030 A[SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final mg.EnumC10600c m12756a(p249nh.C11137c r9, java.lang.String r10) {
            /*
                r8 = this;
                java.lang.String r0 = "packageFqName"
                kotlin.jvm.internal.C9971q.m14633g(r9, r0)
                java.lang.String r0 = "className"
                kotlin.jvm.internal.C9971q.m14633g(r10, r0)
                mg.c[] r0 = mg.EnumC10600c.values()
                int r1 = r0.length
                r2 = 0
                r3 = r2
            L_0x0011:
                r4 = 0
                if (r3 >= r1) goto L_0x0035
                r5 = r0[r3]
                nh.c r6 = r5.m12758c()
                boolean r6 = kotlin.jvm.internal.C9971q.m14638b(r6, r9)
                if (r6 == 0) goto L_0x002d
                java.lang.String r6 = r5.m12759b()
                r7 = 2
                boolean r4 = p326ri.C12707l.m5813H(r10, r6, r2, r7, r4)
                if (r4 == 0) goto L_0x002d
                r4 = 1
                goto L_0x002e
            L_0x002d:
                r4 = r2
            L_0x002e:
                if (r4 == 0) goto L_0x0032
                r4 = r5
                goto L_0x0035
            L_0x0032:
                int r3 = r3 + 1
                goto L_0x0011
            L_0x0035:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: mg.EnumC10600c.C10601a.m12756a(nh.c, java.lang.String):mg.c");
        }

        /* renamed from: b */
        public final EnumC10600c m12755b(String className, C11137c packageFqName) {
            C9971q.m14633g(className, "className");
            C9971q.m14633g(packageFqName, "packageFqName");
            C0342a c = m12754c(className, packageFqName);
            if (c != null) {
                return c.m12750c();
            }
            return null;
        }

        /* renamed from: c */
        public final C0342a m12754c(String className, C11137c packageFqName) {
            C9971q.m14633g(className, "className");
            C9971q.m14633g(packageFqName, "packageFqName");
            EnumC10600c a = m12756a(packageFqName, className);
            if (a == null) {
                return null;
            }
            String substring = className.substring(a.m12759b().length());
            C9971q.m14634f(substring, "this as java.lang.String).substring(startIndex)");
            Integer d = m12753d(substring);
            if (d != null) {
                return new C0342a(a, d.intValue());
            }
            return null;
        }
    }

    static {
        C11137c cVar = C10434k.f22891r;
    }

    EnumC10600c(C11137c cVar, String str, boolean z, boolean z2) {
        this.f23479k = cVar;
        this.f23480l = str;
        this.f23481m = z;
        this.f23482n = z2;
    }

    /* renamed from: b */
    public final String m12759b() {
        return this.f23480l;
    }

    /* renamed from: c */
    public final C11137c m12758c() {
        return this.f23479k;
    }

    /* renamed from: d */
    public final C11142f m12757d(int i) {
        C11142f f = C11142f.m10767f(this.f23480l + i);
        C9971q.m14634f(f, "identifier(\"$classNamePrefix$arity\")");
        return f;
    }
}
