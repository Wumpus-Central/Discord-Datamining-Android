package bi;

import java.util.List;
import kh.AbstractC9869a;
import kh.AbstractC9874c;
import kh.C9879g;
import kh.C9880h;
import kh.C9882i;
import kotlin.jvm.internal.C9971q;
import p070di.AbstractC6483f;
import p087ei.AbstractC6944n;
import p159ih.C8603s;
import p268og.AbstractC11346m;

/* renamed from: bi.m */
/* loaded from: classes8.dex */
public final class C3588m {

    /* renamed from: a */
    private final C3585k f5841a;

    /* renamed from: b */
    private final AbstractC9874c f5842b;

    /* renamed from: c */
    private final AbstractC11346m f5843c;

    /* renamed from: d */
    private final C9879g f5844d;

    /* renamed from: e */
    private final C9880h f5845e;

    /* renamed from: f */
    private final AbstractC9869a f5846f;

    /* renamed from: g */
    private final AbstractC6483f f5847g;

    /* renamed from: h */
    private final C3566d0 f5848h;

    /* renamed from: i */
    private final C3604w f5849i;

    public C3588m(C3585k components, AbstractC9874c nameResolver, AbstractC11346m containingDeclaration, C9879g typeTable, C9880h versionRequirementTable, AbstractC9869a metadataVersion, AbstractC6483f fVar, C3566d0 d0Var, List<C8603s> typeParameters) {
        String str;
        C9971q.m14633g(components, "components");
        C9971q.m14633g(nameResolver, "nameResolver");
        C9971q.m14633g(containingDeclaration, "containingDeclaration");
        C9971q.m14633g(typeTable, "typeTable");
        C9971q.m14633g(versionRequirementTable, "versionRequirementTable");
        C9971q.m14633g(metadataVersion, "metadataVersion");
        C9971q.m14633g(typeParameters, "typeParameters");
        this.f5841a = components;
        this.f5842b = nameResolver;
        this.f5843c = containingDeclaration;
        this.f5844d = typeTable;
        this.f5845e = versionRequirementTable;
        this.f5846f = metadataVersion;
        this.f5847g = fVar;
        this.f5848h = new C3566d0(this, d0Var, typeParameters, "Deserializer for \"" + containingDeclaration.getName() + '\"', (fVar == null || (str = fVar.mo21814a()) == null) ? "[container not found]" : str);
        this.f5849i = new C3604w(this);
    }

    /* renamed from: b */
    public static /* synthetic */ C3588m m34020b(C3588m mVar, AbstractC11346m mVar2, List list, AbstractC9874c cVar, C9879g gVar, C9880h hVar, AbstractC9869a aVar, int i, Object obj) {
        if ((i & 4) != 0) {
            cVar = mVar.f5842b;
        }
        if ((i & 8) != 0) {
            gVar = mVar.f5844d;
        }
        if ((i & 16) != 0) {
            hVar = mVar.f5845e;
        }
        if ((i & 32) != 0) {
            aVar = mVar.f5846f;
        }
        return mVar.m34021a(mVar2, list, cVar, gVar, hVar, aVar);
    }

    /* renamed from: a */
    public final C3588m m34021a(AbstractC11346m descriptor, List<C8603s> typeParameterProtos, AbstractC9874c nameResolver, C9879g typeTable, C9880h hVar, AbstractC9869a metadataVersion) {
        C9971q.m14633g(descriptor, "descriptor");
        C9971q.m14633g(typeParameterProtos, "typeParameterProtos");
        C9971q.m14633g(nameResolver, "nameResolver");
        C9971q.m14633g(typeTable, "typeTable");
        C9880h versionRequirementTable = hVar;
        C9971q.m14633g(versionRequirementTable, "versionRequirementTable");
        C9971q.m14633g(metadataVersion, "metadataVersion");
        C3585k kVar = this.f5841a;
        if (!C9882i.m15105b(metadataVersion)) {
            versionRequirementTable = this.f5845e;
        }
        return new C3588m(kVar, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, this.f5847g, this.f5848h, typeParameterProtos);
    }

    /* renamed from: c */
    public final C3585k m34019c() {
        return this.f5841a;
    }

    /* renamed from: d */
    public final AbstractC6483f m34018d() {
        return this.f5847g;
    }

    /* renamed from: e */
    public final AbstractC11346m m34017e() {
        return this.f5843c;
    }

    /* renamed from: f */
    public final C3604w m34016f() {
        return this.f5849i;
    }

    /* renamed from: g */
    public final AbstractC9874c m34015g() {
        return this.f5842b;
    }

    /* renamed from: h */
    public final AbstractC6944n m34014h() {
        return this.f5841a.m34029u();
    }

    /* renamed from: i */
    public final C3566d0 m34013i() {
        return this.f5848h;
    }

    /* renamed from: j */
    public final C9879g m34012j() {
        return this.f5844d;
    }

    /* renamed from: k */
    public final C9880h m34011k() {
        return this.f5845e;
    }
}
