package p407wh;

import p249nh.C11136b;
import p249nh.C11137c;

/* renamed from: wh.d */
/* loaded from: classes8.dex */
public class C13885d {

    /* renamed from: a */
    private final String f31297a;

    /* renamed from: b */
    private C11137c f31298b;

    private C13885d(String str) {
        if (str == null) {
            m2402a(5);
        }
        this.f31297a = str;
    }

    /* renamed from: a */
    private static /* synthetic */ void m2402a(int i) {
        String str = (i == 3 || i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 3 || i == 6 || i == 7 || i == 8) {
            throw new IllegalStateException(format);
        }
    }

    /* renamed from: b */
    public static C13885d m2401b(C11136b bVar) {
        if (bVar == null) {
            m2402a(1);
        }
        C11137c h = bVar.m10810h();
        String replace = bVar.m10809i().m10803b().replace('.', '$');
        if (h.m10801d()) {
            return new C13885d(replace);
        }
        return new C13885d(h.m10803b().replace('.', '/') + "/" + replace);
    }

    /* renamed from: c */
    public static C13885d m2400c(C11137c cVar) {
        if (cVar == null) {
            m2402a(2);
        }
        C13885d dVar = new C13885d(cVar.m10803b().replace('.', '/'));
        dVar.f31298b = cVar;
        return dVar;
    }

    /* renamed from: d */
    public static C13885d m2399d(String str) {
        if (str == null) {
            m2402a(0);
        }
        return new C13885d(str);
    }

    /* renamed from: e */
    public C11137c m2398e() {
        return new C11137c(this.f31297a.replace('/', '.'));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f31297a.equals(((C13885d) obj).f31297a);
    }

    /* renamed from: f */
    public String m2397f() {
        String str = this.f31297a;
        if (str == null) {
            m2402a(8);
        }
        return str;
    }

    /* renamed from: g */
    public C11137c m2396g() {
        int lastIndexOf = this.f31297a.lastIndexOf("/");
        if (lastIndexOf != -1) {
            return new C11137c(this.f31297a.substring(0, lastIndexOf).replace('/', '.'));
        }
        C11137c cVar = C11137c.f24718c;
        if (cVar == null) {
            m2402a(7);
        }
        return cVar;
    }

    public int hashCode() {
        return this.f31297a.hashCode();
    }

    public String toString() {
        return this.f31297a;
    }
}
