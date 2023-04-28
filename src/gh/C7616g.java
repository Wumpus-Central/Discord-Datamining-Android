package gh;

import bi.AbstractC3583j;
import bi.AbstractC3586l;
import bi.AbstractC3596r;
import fi.C7303o;
import gh.AbstractC7649x;
import gi.AbstractC7674l;
import gi.C7676m;
import java.util.List;
import kotlin.collections.C9905i;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import p013ah.AbstractC1392c;
import p013ah.AbstractC1402i;
import p013ah.C1391b;
import p013ah.C1397f;
import p069dh.AbstractC6463b;
import p086eh.AbstractC6885a;
import p087ei.AbstractC6944n;
import p108fh.C7169d;
import p108fh.C7207l;
import p160ii.C8626a;
import p217lg.C10430j;
import p249nh.C11136b;
import p268og.AbstractC11311d1;
import p268og.AbstractC11327h0;
import p268og.C11337k0;
import p406wg.AbstractC13879c;
import p427xg.AbstractC14146p;
import p427xg.AbstractC14148q;
import p427xg.AbstractC14157u;
import p427xg.C14111d;
import p427xg.C14161x;
import p428xh.C14168b;
import p447yg.AbstractC14386f;
import p447yg.AbstractC14388g;
import p447yg.AbstractC14394j;

/* renamed from: gh.g */
/* loaded from: classes8.dex */
public final class C7616g {

    /* renamed from: gh.g$a */
    /* loaded from: classes8.dex */
    public static final class C7617a implements AbstractC14157u {
        C7617a() {
        }

        @Override // p427xg.AbstractC14157u
        /* renamed from: a */
        public List<AbstractC6885a> mo1498a(C11136b classId) {
            C9971q.m14633g(classId, "classId");
            return null;
        }
    }

    /* renamed from: a */
    public static final C7614f m21878a(AbstractC11327h0 module, AbstractC6944n storageManager, C11337k0 notFoundClasses, C1397f lazyJavaPackageFragmentProvider, AbstractC7633p reflectKotlinClassFinder, C7618h deserializedDescriptorResolver, AbstractC3596r errorReporter) {
        List d;
        C9971q.m14633g(module, "module");
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(notFoundClasses, "notFoundClasses");
        C9971q.m14633g(lazyJavaPackageFragmentProvider, "lazyJavaPackageFragmentProvider");
        C9971q.m14633g(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        C9971q.m14633g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        C9971q.m14633g(errorReporter, "errorReporter");
        C7621i iVar = new C7621i(reflectKotlinClassFinder, deserializedDescriptorResolver);
        C7609d dVar = new C7609d(module, notFoundClasses, storageManager, reflectKotlinClassFinder);
        AbstractC3586l.C3587a aVar = AbstractC3586l.C3587a.f5840a;
        AbstractC13879c.C13880a aVar2 = AbstractC13879c.C13880a.f31277a;
        AbstractC3583j a = AbstractC3583j.f5816a.m34051a();
        C7676m a2 = AbstractC7674l.f16679b.m21676a();
        d = C9905i.m14825d(C7303o.f15781a);
        return new C7614f(storageManager, module, aVar, iVar, dVar, lazyJavaPackageFragmentProvider, notFoundClasses, errorReporter, aVar2, a, a2, new C8626a(d));
    }

    /* renamed from: b */
    public static final C1397f m21877b(AbstractC14146p javaClassFinder, AbstractC11327h0 module, AbstractC6944n storageManager, C11337k0 notFoundClasses, AbstractC7633p reflectKotlinClassFinder, C7618h deserializedDescriptorResolver, AbstractC3596r errorReporter, AbstractC6463b javaSourceElementFactory, AbstractC1402i singleModuleClassResolver, AbstractC7649x packagePartProvider) {
        List i;
        C9971q.m14633g(javaClassFinder, "javaClassFinder");
        C9971q.m14633g(module, "module");
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(notFoundClasses, "notFoundClasses");
        C9971q.m14633g(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        C9971q.m14633g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        C9971q.m14633g(errorReporter, "errorReporter");
        C9971q.m14633g(javaSourceElementFactory, "javaSourceElementFactory");
        C9971q.m14633g(singleModuleClassResolver, "singleModuleClassResolver");
        C9971q.m14633g(packagePartProvider, "packagePartProvider");
        AbstractC14394j DO_NOTHING = AbstractC14394j.f32572a;
        C9971q.m14634f(DO_NOTHING, "DO_NOTHING");
        AbstractC14388g EMPTY = AbstractC14388g.f32565a;
        C9971q.m14634f(EMPTY, "EMPTY");
        AbstractC14386f.C14387a aVar = AbstractC14386f.C14387a.f32564a;
        i = C9906j.m14820i();
        C14168b bVar = new C14168b(storageManager, i);
        AbstractC11311d1.C11312a aVar2 = AbstractC11311d1.C11312a.f25241a;
        AbstractC13879c.C13880a aVar3 = AbstractC13879c.C13880a.f31277a;
        C10430j jVar = new C10430j(module, notFoundClasses);
        C14161x.C14163b bVar2 = C14161x.f31976d;
        C14111d dVar = new C14111d(bVar2.m1479a());
        AbstractC1392c.C1393a aVar4 = AbstractC1392c.C1393a.f415a;
        return new C1397f(new C1391b(storageManager, javaClassFinder, reflectKotlinClassFinder, deserializedDescriptorResolver, DO_NOTHING, errorReporter, EMPTY, aVar, bVar, javaSourceElementFactory, singleModuleClassResolver, packagePartProvider, aVar2, aVar3, module, jVar, dVar, new C7207l(new C7169d(aVar4)), AbstractC14148q.C14149a.f31955a, aVar4, AbstractC7674l.f16679b.m21676a(), bVar2.m1479a(), new C7617a(), null, 8388608, null));
    }

    /* renamed from: c */
    public static /* synthetic */ C1397f m21876c(AbstractC14146p pVar, AbstractC11327h0 h0Var, AbstractC6944n nVar, C11337k0 k0Var, AbstractC7633p pVar2, C7618h hVar, AbstractC3596r rVar, AbstractC6463b bVar, AbstractC1402i iVar, AbstractC7649x xVar, int i, Object obj) {
        AbstractC7649x.C7650a aVar;
        if ((i & 512) != 0) {
            aVar = AbstractC7649x.C7650a.f16654a;
        } else {
            aVar = xVar;
        }
        return m21877b(pVar, h0Var, nVar, k0Var, pVar2, hVar, rVar, bVar, iVar, aVar);
    }
}
