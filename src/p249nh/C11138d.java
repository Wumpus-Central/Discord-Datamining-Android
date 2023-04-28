package p249nh;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.C9894b;
import kotlin.jvm.functions.Function1;

/* renamed from: nh.d */
/* loaded from: classes8.dex */
public final class C11138d {

    /* renamed from: e */
    private static final C11142f f24721e = C11142f.m10764i("<root>");

    /* renamed from: f */
    private static final Pattern f24722f = Pattern.compile("\\.");

    /* renamed from: g */
    private static final Function1<String, C11142f> f24723g = new C11139a();

    /* renamed from: a */
    private final String f24724a;

    /* renamed from: b */
    private transient C11137c f24725b;

    /* renamed from: c */
    private transient C11138d f24726c;

    /* renamed from: d */
    private transient C11142f f24727d;

    /* renamed from: nh.d$a */
    /* loaded from: classes8.dex */
    static class C11139a implements Function1<String, C11142f> {
        C11139a() {
        }

        /* renamed from: a */
        public C11142f invoke(String str) {
            return C11142f.m10768e(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11138d(String str, C11137c cVar) {
        if (str == null) {
            m10793a(0);
        }
        if (cVar == null) {
            m10793a(1);
        }
        this.f24724a = str;
        this.f24725b = cVar;
    }

    /* renamed from: a */
    private static /* synthetic */ void m10793a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i2 = 2;
                break;
            case 9:
            case 15:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                throw new IllegalStateException(format);
            case 9:
            case 15:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: d */
    private void m10790d() {
        int lastIndexOf = this.f24724a.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f24727d = C11142f.m10768e(this.f24724a.substring(lastIndexOf + 1));
            this.f24726c = new C11138d(this.f24724a.substring(0, lastIndexOf));
            return;
        }
        this.f24727d = C11142f.m10768e(this.f24724a);
        this.f24726c = C11137c.f24718c.m10795j();
    }

    /* renamed from: m */
    public static C11138d m10781m(C11142f fVar) {
        if (fVar == null) {
            m10793a(16);
        }
        return new C11138d(fVar.m10771b(), C11137c.f24718c.m10795j(), fVar);
    }

    /* renamed from: b */
    public String m10792b() {
        String str = this.f24724a;
        if (str == null) {
            m10793a(4);
        }
        return str;
    }

    /* renamed from: c */
    public C11138d m10791c(C11142f fVar) {
        String str;
        if (fVar == null) {
            m10793a(9);
        }
        if (m10789e()) {
            str = fVar.m10771b();
        } else {
            str = this.f24724a + "." + fVar.m10771b();
        }
        return new C11138d(str, this, fVar);
    }

    /* renamed from: e */
    public boolean m10789e() {
        return this.f24724a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C11138d) && this.f24724a.equals(((C11138d) obj).f24724a)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean m10788f() {
        return this.f24725b != null || m10792b().indexOf(60) < 0;
    }

    /* renamed from: g */
    public C11138d m10787g() {
        C11138d dVar = this.f24726c;
        if (dVar != null) {
            if (dVar == null) {
                m10793a(7);
            }
            return dVar;
        } else if (!m10789e()) {
            m10790d();
            C11138d dVar2 = this.f24726c;
            if (dVar2 == null) {
                m10793a(8);
            }
            return dVar2;
        } else {
            throw new IllegalStateException("root");
        }
    }

    /* renamed from: h */
    public List<C11142f> m10786h() {
        List<C11142f> emptyList = m10789e() ? Collections.emptyList() : C9894b.m15029f0(f24722f.split(this.f24724a), f24723g);
        if (emptyList == null) {
            m10793a(14);
        }
        return emptyList;
    }

    public int hashCode() {
        return this.f24724a.hashCode();
    }

    /* renamed from: i */
    public C11142f m10785i() {
        C11142f fVar = this.f24727d;
        if (fVar != null) {
            if (fVar == null) {
                m10793a(10);
            }
            return fVar;
        } else if (!m10789e()) {
            m10790d();
            C11142f fVar2 = this.f24727d;
            if (fVar2 == null) {
                m10793a(11);
            }
            return fVar2;
        } else {
            throw new IllegalStateException("root");
        }
    }

    /* renamed from: j */
    public C11142f m10784j() {
        if (m10789e()) {
            C11142f fVar = f24721e;
            if (fVar == null) {
                m10793a(12);
            }
            return fVar;
        }
        C11142f i = m10785i();
        if (i == null) {
            m10793a(13);
        }
        return i;
    }

    /* renamed from: k */
    public boolean m10783k(C11142f fVar) {
        if (fVar == null) {
            m10793a(15);
        }
        if (m10789e()) {
            return false;
        }
        int indexOf = this.f24724a.indexOf(46);
        String str = this.f24724a;
        String b = fVar.m10771b();
        if (indexOf == -1) {
            indexOf = this.f24724a.length();
        }
        return str.regionMatches(0, b, 0, indexOf);
    }

    /* renamed from: l */
    public C11137c m10782l() {
        C11137c cVar = this.f24725b;
        if (cVar != null) {
            if (cVar == null) {
                m10793a(5);
            }
            return cVar;
        }
        C11137c cVar2 = new C11137c(this);
        this.f24725b = cVar2;
        return cVar2;
    }

    public String toString() {
        String b = m10789e() ? f24721e.m10771b() : this.f24724a;
        if (b == null) {
            m10793a(17);
        }
        return b;
    }

    public C11138d(String str) {
        if (str == null) {
            m10793a(2);
        }
        this.f24724a = str;
    }

    private C11138d(String str, C11138d dVar, C11142f fVar) {
        if (str == null) {
            m10793a(3);
        }
        this.f24724a = str;
        this.f24726c = dVar;
        this.f24727d = fVar;
    }
}
