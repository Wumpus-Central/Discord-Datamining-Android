package p012ab;

import bb.C3430a;
import com.google.android.gms.common.api.Scope;
import p384v9.C13456a;

/* renamed from: ab.e */
/* loaded from: classes3.dex */
public final class C1355e {

    /* renamed from: a */
    public static final C13456a.C13464g<C3430a> f294a;

    /* renamed from: b */
    public static final C13456a.C13464g<C3430a> f295b;

    /* renamed from: c */
    public static final C13456a.AbstractC0437a<C3430a, C1351a> f296c;

    /* renamed from: d */
    static final C13456a.AbstractC0437a<C3430a, C1354d> f297d;

    /* renamed from: e */
    public static final Scope f298e = new Scope("profile");

    /* renamed from: f */
    public static final Scope f299f = new Scope("email");

    /* renamed from: g */
    public static final C13456a<C1351a> f300g;

    /* renamed from: h */
    public static final C13456a<C1354d> f301h;

    static {
        C13456a.C13464g<C3430a> gVar = new C13456a.C13464g<>();
        f294a = gVar;
        C13456a.C13464g<C3430a> gVar2 = new C13456a.C13464g<>();
        f295b = gVar2;
        C1352b bVar = new C1352b();
        f296c = bVar;
        C1353c cVar = new C1353c();
        f297d = cVar;
        f300g = new C13456a<>("SignIn.API", bVar, gVar);
        f301h = new C13456a<>("SignIn.INTERNAL_API", cVar, gVar2);
    }
}
