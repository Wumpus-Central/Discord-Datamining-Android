package ng;

import bi.AbstractC3556a;
import bi.AbstractC3583j;
import bi.AbstractC3586l;
import bi.AbstractC3592p;
import bi.AbstractC3596r;
import bi.AbstractC3598s;
import bi.AbstractC3602v;
import bi.C3564d;
import bi.C3585k;
import bi.C3591o;
import ci.C4018a;
import ci.C4021c;
import gh.AbstractC7633p;
import gi.AbstractC7674l;
import java.io.InputStream;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mg.C10597a;
import p087ei.AbstractC6944n;
import p249nh.C11137c;
import p268og.AbstractC11327h0;
import p268og.C11337k0;
import p304qg.AbstractC12125a;
import p304qg.AbstractC12127c;
import p406wg.AbstractC13879c;
import p428xh.AbstractC14167a;

/* renamed from: ng.j */
/* loaded from: classes8.dex */
public final class C11131j extends AbstractC3556a {

    /* renamed from: f */
    public static final C11132a f24700f = new C11132a(null);

    /* renamed from: ng.j$a */
    /* loaded from: classes8.dex */
    public static final class C11132a {
        private C11132a() {
        }

        public /* synthetic */ C11132a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11131j(AbstractC6944n storageManager, AbstractC7633p finder, AbstractC11327h0 moduleDescriptor, C11337k0 notFoundClasses, AbstractC12125a additionalClassPartsProvider, AbstractC12127c platformDependentDeclarationFilter, AbstractC3586l deserializationConfiguration, AbstractC7674l kotlinTypeChecker, AbstractC14167a samConversionResolver) {
        super(storageManager, finder, moduleDescriptor);
        List l;
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(finder, "finder");
        C9971q.m14633g(moduleDescriptor, "moduleDescriptor");
        C9971q.m14633g(notFoundClasses, "notFoundClasses");
        C9971q.m14633g(additionalClassPartsProvider, "additionalClassPartsProvider");
        C9971q.m14633g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        C9971q.m14633g(deserializationConfiguration, "deserializationConfiguration");
        C9971q.m14633g(kotlinTypeChecker, "kotlinTypeChecker");
        C9971q.m14633g(samConversionResolver, "samConversionResolver");
        C3591o oVar = new C3591o(this);
        C4018a aVar = C4018a.f6609n;
        C3564d dVar = new C3564d(moduleDescriptor, notFoundClasses, aVar);
        AbstractC3602v.C3603a aVar2 = AbstractC3602v.C3603a.f5868a;
        AbstractC3596r DO_NOTHING = AbstractC3596r.f5862a;
        C9971q.m14634f(DO_NOTHING, "DO_NOTHING");
        AbstractC13879c.C13880a aVar3 = AbstractC13879c.C13880a.f31277a;
        AbstractC3598s.C3599a aVar4 = AbstractC3598s.C3599a.f5863a;
        l = C9906j.m14817l(new C10597a(storageManager, moduleDescriptor), new C11108e(storageManager, moduleDescriptor, null, 4, null));
        m34107i(new C3585k(storageManager, moduleDescriptor, deserializationConfiguration, oVar, dVar, this, aVar2, DO_NOTHING, aVar3, aVar4, l, notFoundClasses, AbstractC3583j.f5816a.m34051a(), additionalClassPartsProvider, platformDependentDeclarationFilter, aVar.m41154e(), kotlinTypeChecker, samConversionResolver, null, null, 786432, null));
    }

    @Override // bi.AbstractC3556a
    /* renamed from: d */
    protected AbstractC3592p mo10829d(C11137c fqName) {
        C9971q.m14633g(fqName, "fqName");
        InputStream a = m34110f().mo4626a(fqName);
        if (a != null) {
            return C4021c.f6611y.m33072a(fqName, m34108h(), m34109g(), a, false);
        }
        return null;
    }
}
