package gh;

import bi.C3600t;
import kh.AbstractC9874c;
import kh.C9877e;
import kotlin.jvm.internal.C9971q;
import mh.C10612e;
import p070di.AbstractC6483f;
import p070di.EnumC6482e;
import p159ih.C8575l;
import p218lh.C10440a;
import p249nh.C11136b;
import p249nh.C11142f;
import p268og.AbstractC11304b1;
import p326ri.C12719v;
import p407wh.C13885d;
import ph.AbstractC11702i;

/* renamed from: gh.l */
/* loaded from: classes8.dex */
public final class C7624l implements AbstractC6483f {

    /* renamed from: b */
    private final C13885d f16623b;

    /* renamed from: c */
    private final C13885d f16624c;

    /* renamed from: d */
    private final C3600t<C10612e> f16625d;

    /* renamed from: e */
    private final boolean f16626e;

    /* renamed from: f */
    private final EnumC6482e f16627f;

    /* renamed from: g */
    private final AbstractC7637r f16628g;

    /* renamed from: h */
    private final String f16629h;

    public C7624l(C13885d className, C13885d dVar, C8575l packageProto, AbstractC9874c nameResolver, C3600t<C10612e> tVar, boolean z, EnumC6482e abiStability, AbstractC7637r rVar) {
        String str;
        C9971q.m14633g(className, "className");
        C9971q.m14633g(packageProto, "packageProto");
        C9971q.m14633g(nameResolver, "nameResolver");
        C9971q.m14633g(abiStability, "abiStability");
        this.f16623b = className;
        this.f16624c = dVar;
        this.f16625d = tVar;
        this.f16626e = z;
        this.f16627f = abiStability;
        this.f16628g = rVar;
        AbstractC11702i.C11709f<C8575l, Integer> packageModuleName = C10440a.f22987m;
        C9971q.m14634f(packageModuleName, "packageModuleName");
        Integer num = (Integer) C9877e.m15132a(packageProto, packageModuleName);
        this.f16629h = (num == null || (str = nameResolver.getString(num.intValue())) == null) ? "main" : str;
    }

    @Override // p070di.AbstractC6483f
    /* renamed from: a */
    public String mo21814a() {
        return "Class '" + m21858d().m10816b().m10803b() + '\'';
    }

    @Override // p268og.AbstractC11299a1
    /* renamed from: b */
    public AbstractC11304b1 mo4612b() {
        AbstractC11304b1 NO_SOURCE_FILE = AbstractC11304b1.f25237a;
        C9971q.m14634f(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    /* renamed from: d */
    public final C11136b m21858d() {
        return new C11136b(m21857e().m2396g(), m21854h());
    }

    /* renamed from: e */
    public C13885d m21857e() {
        return this.f16623b;
    }

    /* renamed from: f */
    public C13885d m21856f() {
        return this.f16624c;
    }

    /* renamed from: g */
    public final AbstractC7637r m21855g() {
        return this.f16628g;
    }

    /* renamed from: h */
    public final C11142f m21854h() {
        String M0;
        String f = m21857e().m2397f();
        C9971q.m14634f(f, "className.internalName");
        M0 = C12719v.m5708M0(f, '/', null, 2, null);
        C11142f f2 = C11142f.m10767f(M0);
        C9971q.m14634f(f2, "identifier(className.int….substringAfterLast('/'))");
        return f2;
    }

    public String toString() {
        return C7624l.class.getSimpleName() + ": " + m21857e();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7624l(gh.AbstractC7637r r11, p159ih.C8575l r12, kh.AbstractC9874c r13, bi.C3600t<mh.C10612e> r14, boolean r15, p070di.EnumC6482e r16) {
        /*
            r10 = this;
            java.lang.String r0 = "kotlinClass"
            r9 = r11
            kotlin.jvm.internal.C9971q.m14633g(r11, r0)
            java.lang.String r0 = "packageProto"
            r4 = r12
            kotlin.jvm.internal.C9971q.m14633g(r12, r0)
            java.lang.String r0 = "nameResolver"
            r5 = r13
            kotlin.jvm.internal.C9971q.m14633g(r13, r0)
            java.lang.String r0 = "abiStability"
            r8 = r16
            kotlin.jvm.internal.C9971q.m14633g(r8, r0)
            nh.b r0 = r11.mo4628k()
            wh.d r2 = p407wh.C13885d.m2401b(r0)
            java.lang.String r0 = "byClassId(kotlinClass.classId)"
            kotlin.jvm.internal.C9971q.m14634f(r2, r0)
            hh.a r0 = r11.mo4630d()
            java.lang.String r0 = r0.m20840e()
            r1 = 0
            if (r0 == 0) goto L_0x0040
            int r3 = r0.length()
            if (r3 <= 0) goto L_0x0039
            r3 = 1
            goto L_0x003a
        L_0x0039:
            r3 = 0
        L_0x003a:
            if (r3 == 0) goto L_0x0040
            wh.d r1 = p407wh.C13885d.m2399d(r0)
        L_0x0040:
            r3 = r1
            r1 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gh.C7624l.<init>(gh.r, ih.l, kh.c, bi.t, boolean, di.e):void");
    }
}
