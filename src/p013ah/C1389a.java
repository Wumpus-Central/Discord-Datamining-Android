package p013ah;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import nf.C11084n;
import nf.EnumC11087p;
import p086eh.AbstractC6914z;
import p268og.AbstractC11320g;
import p268og.AbstractC11346m;
import p427xg.C14164y;
import pg.AbstractC11672g;

/* renamed from: ah.a */
/* loaded from: classes8.dex */
public final class C1389a {

    /* renamed from: ah.a$a */
    /* loaded from: classes8.dex */
    public static final class C0007a extends AbstractC9973s implements Function0<C14164y> {

        /* renamed from: k */
        final /* synthetic */ C1399g f387k;

        /* renamed from: l */
        final /* synthetic */ AbstractC11320g f388l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0007a(C1399g gVar, AbstractC11320g gVar2) {
            super(0);
            this.f387k = gVar;
            this.f388l = gVar2;
        }

        /* renamed from: a */
        public final C14164y invoke() {
            return C1389a.m41214g(this.f387k, this.f388l.getAnnotations());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ah.a$b */
    /* loaded from: classes8.dex */
    public static final class C1390b extends AbstractC9973s implements Function0<C14164y> {

        /* renamed from: k */
        final /* synthetic */ C1399g f389k;

        /* renamed from: l */
        final /* synthetic */ AbstractC11672g f390l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1390b(C1399g gVar, AbstractC11672g gVar2) {
            super(0);
            this.f389k = gVar;
            this.f390l = gVar2;
        }

        /* renamed from: a */
        public final C14164y invoke() {
            return C1389a.m41214g(this.f389k, this.f390l);
        }
    }

    /* renamed from: a */
    public static final C1399g m41220a(C1399g gVar, AbstractC1404k typeParameterResolver) {
        C9971q.m14633g(gVar, "<this>");
        C9971q.m14633g(typeParameterResolver, "typeParameterResolver");
        return new C1399g(gVar.m41174a(), typeParameterResolver, gVar.m41172c());
    }

    /* renamed from: b */
    private static final C1399g m41219b(C1399g gVar, AbstractC11346m mVar, AbstractC6914z zVar, int i, Lazy<C14164y> lazy) {
        AbstractC1404k kVar;
        C1391b a = gVar.m41174a();
        if (zVar != null) {
            kVar = new C1400h(gVar, mVar, zVar, i);
        } else {
            kVar = gVar.m41169f();
        }
        return new C1399g(a, kVar, lazy);
    }

    /* renamed from: c */
    public static final C1399g m41218c(C1399g gVar, AbstractC11320g containingDeclaration, AbstractC6914z zVar, int i) {
        Lazy b;
        C9971q.m14633g(gVar, "<this>");
        C9971q.m14633g(containingDeclaration, "containingDeclaration");
        b = C11084n.m10944b(EnumC11087p.NONE, new C0007a(gVar, containingDeclaration));
        return m41219b(gVar, containingDeclaration, zVar, i, b);
    }

    /* renamed from: d */
    public static /* synthetic */ C1399g m41217d(C1399g gVar, AbstractC11320g gVar2, AbstractC6914z zVar, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            zVar = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m41218c(gVar, gVar2, zVar, i);
    }

    /* renamed from: e */
    public static final C1399g m41216e(C1399g gVar, AbstractC11346m containingDeclaration, AbstractC6914z typeParameterOwner, int i) {
        C9971q.m14633g(gVar, "<this>");
        C9971q.m14633g(containingDeclaration, "containingDeclaration");
        C9971q.m14633g(typeParameterOwner, "typeParameterOwner");
        return m41219b(gVar, containingDeclaration, typeParameterOwner, i, gVar.m41172c());
    }

    /* renamed from: f */
    public static /* synthetic */ C1399g m41215f(C1399g gVar, AbstractC11346m mVar, AbstractC6914z zVar, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m41216e(gVar, mVar, zVar, i);
    }

    /* renamed from: g */
    public static final C14164y m41214g(C1399g gVar, AbstractC11672g additionalAnnotations) {
        C9971q.m14633g(gVar, "<this>");
        C9971q.m14633g(additionalAnnotations, "additionalAnnotations");
        return gVar.m41174a().m41209a().m1666c(gVar.m41173b(), additionalAnnotations);
    }

    /* renamed from: h */
    public static final C1399g m41213h(C1399g gVar, AbstractC11672g additionalAnnotations) {
        Lazy b;
        C9971q.m14633g(gVar, "<this>");
        C9971q.m14633g(additionalAnnotations, "additionalAnnotations");
        if (additionalAnnotations.isEmpty()) {
            return gVar;
        }
        C1391b a = gVar.m41174a();
        AbstractC1404k f = gVar.m41169f();
        b = C11084n.m10944b(EnumC11087p.NONE, new C1390b(gVar, additionalAnnotations));
        return new C1399g(a, f, b);
    }

    /* renamed from: i */
    public static final C1399g m41212i(C1399g gVar, C1391b components) {
        C9971q.m14633g(gVar, "<this>");
        C9971q.m14633g(components, "components");
        return new C1399g(components, gVar.m41169f(), gVar.m41172c());
    }
}
