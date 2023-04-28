package p249nh;

import java.util.List;

/* renamed from: nh.c */
/* loaded from: classes8.dex */
public final class C11137c {

    /* renamed from: c */
    public static final C11137c f24718c = new C11137c("");

    /* renamed from: a */
    private final C11138d f24719a;

    /* renamed from: b */
    private transient C11137c f24720b;

    public C11137c(String str) {
        if (str == null) {
            m10804a(1);
        }
        this.f24719a = new C11138d(str, this);
    }

    /* renamed from: a */
    private static /* synthetic */ void m10804a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            case 8:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(format);
            case 8:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: k */
    public static C11137c m10794k(C11142f fVar) {
        if (fVar == null) {
            m10804a(13);
        }
        return new C11137c(C11138d.m10781m(fVar));
    }

    /* renamed from: b */
    public String m10803b() {
        String b = this.f24719a.m10792b();
        if (b == null) {
            m10804a(4);
        }
        return b;
    }

    /* renamed from: c */
    public C11137c m10802c(C11142f fVar) {
        if (fVar == null) {
            m10804a(8);
        }
        return new C11137c(this.f24719a.m10791c(fVar), this);
    }

    /* renamed from: d */
    public boolean m10801d() {
        return this.f24719a.m10789e();
    }

    /* renamed from: e */
    public C11137c m10800e() {
        C11137c cVar = this.f24720b;
        if (cVar != null) {
            if (cVar == null) {
                m10804a(6);
            }
            return cVar;
        } else if (!m10801d()) {
            C11137c cVar2 = new C11137c(this.f24719a.m10787g());
            this.f24720b = cVar2;
            return cVar2;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C11137c) && this.f24719a.equals(((C11137c) obj).f24719a)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public List<C11142f> m10799f() {
        List<C11142f> h = this.f24719a.m10786h();
        if (h == null) {
            m10804a(11);
        }
        return h;
    }

    /* renamed from: g */
    public C11142f m10798g() {
        C11142f i = this.f24719a.m10785i();
        if (i == null) {
            m10804a(9);
        }
        return i;
    }

    /* renamed from: h */
    public C11142f m10797h() {
        C11142f j = this.f24719a.m10784j();
        if (j == null) {
            m10804a(10);
        }
        return j;
    }

    public int hashCode() {
        return this.f24719a.hashCode();
    }

    /* renamed from: i */
    public boolean m10796i(C11142f fVar) {
        if (fVar == null) {
            m10804a(12);
        }
        return this.f24719a.m10783k(fVar);
    }

    /* renamed from: j */
    public C11138d m10795j() {
        C11138d dVar = this.f24719a;
        if (dVar == null) {
            m10804a(5);
        }
        return dVar;
    }

    public String toString() {
        return this.f24719a.toString();
    }

    public C11137c(C11138d dVar) {
        if (dVar == null) {
            m10804a(2);
        }
        this.f24719a = dVar;
    }

    private C11137c(C11138d dVar, C11137c cVar) {
        if (dVar == null) {
            m10804a(3);
        }
        this.f24719a = dVar;
        this.f24720b = cVar;
    }
}
