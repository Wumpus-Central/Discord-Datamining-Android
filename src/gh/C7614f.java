package gh;

import bi.AbstractC3583j;
import bi.AbstractC3586l;
import bi.AbstractC3596r;
import bi.AbstractC3602v;
import bi.C3585k;
import gi.AbstractC7674l;
import gi.C7676m;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.C10619i;
import ng.C11112f;
import ng.C11121i;
import ng.C11131j;
import p013ah.C1397f;
import p013ah.C1403j;
import p069dh.AbstractC6463b;
import p087ei.AbstractC6944n;
import p087ei.C6920f;
import p160ii.C8626a;
import p217lg.AbstractC10420h;
import p249nh.C11142f;
import p268og.AbstractC11327h0;
import p268og.C11337k0;
import p304qg.AbstractC12125a;
import p304qg.AbstractC12127c;
import p324rg.C12610i;
import p324rg.C12649x;
import p406wg.AbstractC13879c;
import p407wh.C13884c;
import p427xg.AbstractC14146p;
import p428xh.C14168b;
import p447yg.AbstractC14388g;
import ph.C11697g;

/* renamed from: gh.f */
/* loaded from: classes8.dex */
public final class C7614f {

    /* renamed from: b */
    public static final C7615a f16608b = new C7615a(null);

    /* renamed from: a */
    private final C3585k f16609a;

    /* renamed from: gh.f$a */
    /* loaded from: classes8.dex */
    public static final class C7615a {

        /* renamed from: gh.f$a$a */
        /* loaded from: classes8.dex */
        public static final class C0240a {

            /* renamed from: a */
            private final C7614f f16610a;

            /* renamed from: b */
            private final C7618h f16611b;

            public C0240a(C7614f deserializationComponentsForJava, C7618h deserializedDescriptorResolver) {
                C9971q.m14633g(deserializationComponentsForJava, "deserializationComponentsForJava");
                C9971q.m14633g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
                this.f16610a = deserializationComponentsForJava;
                this.f16611b = deserializedDescriptorResolver;
            }

            /* renamed from: a */
            public final C7614f m21880a() {
                return this.f16610a;
            }

            /* renamed from: b */
            public final C7618h m21879b() {
                return this.f16611b;
            }
        }

        private C7615a() {
        }

        public /* synthetic */ C7615a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C0240a m21881a(AbstractC7633p kotlinClassFinder, AbstractC7633p jvmBuiltInsKotlinClassFinder, AbstractC14146p javaClassFinder, String moduleName, AbstractC3596r errorReporter, AbstractC6463b javaSourceElementFactory) {
            List i;
            List l;
            C9971q.m14633g(kotlinClassFinder, "kotlinClassFinder");
            C9971q.m14633g(jvmBuiltInsKotlinClassFinder, "jvmBuiltInsKotlinClassFinder");
            C9971q.m14633g(javaClassFinder, "javaClassFinder");
            C9971q.m14633g(moduleName, "moduleName");
            C9971q.m14633g(errorReporter, "errorReporter");
            C9971q.m14633g(javaSourceElementFactory, "javaSourceElementFactory");
            C6920f fVar = new C6920f("DeserializationComponentsForJava.ModuleData");
            C11112f fVar2 = new C11112f(fVar, C11112f.EnumC11113a.FROM_DEPENDENCIES);
            C11142f i2 = C11142f.m10764i('<' + moduleName + '>');
            C9971q.m14634f(i2, "special(\"<$moduleName>\")");
            C12649x xVar = new C12649x(i2, fVar, fVar2, null, null, null, 56, null);
            fVar2.m13424D0(xVar);
            fVar2.m10869I0(xVar, true);
            C7618h hVar = new C7618h();
            C1403j jVar = new C1403j();
            C11337k0 k0Var = new C11337k0(fVar, xVar);
            C1397f c = C7616g.m21876c(javaClassFinder, xVar, fVar, k0Var, kotlinClassFinder, hVar, errorReporter, javaSourceElementFactory, jVar, null, 512, null);
            C7614f a = C7616g.m21878a(xVar, fVar, k0Var, c, kotlinClassFinder, hVar, errorReporter);
            hVar.m21863m(a);
            AbstractC14388g EMPTY = AbstractC14388g.f32565a;
            C9971q.m14634f(EMPTY, "EMPTY");
            C13884c cVar = new C13884c(c, EMPTY);
            jVar.m41160c(cVar);
            C11121i H0 = fVar2.m10870H0();
            C11121i H02 = fVar2.m10870H0();
            AbstractC3586l.C3587a aVar = AbstractC3586l.C3587a.f5840a;
            C7676m a2 = AbstractC7674l.f16679b.m21676a();
            i = C9906j.m14820i();
            C11131j jVar2 = new C11131j(fVar, jvmBuiltInsKotlinClassFinder, xVar, k0Var, H0, H02, aVar, a2, new C14168b(fVar, i));
            xVar.m6138Y0(xVar);
            l = C9906j.m14817l(cVar.m2404a(), jVar2);
            xVar.m6144S0(new C12610i(l, "CompositeProvider@RuntimeModuleData for " + xVar));
            return new C0240a(a, hVar);
        }
    }

    public C7614f(AbstractC6944n storageManager, AbstractC11327h0 moduleDescriptor, AbstractC3586l configuration, C7621i classDataFinder, C7609d annotationAndConstantLoader, C1397f packageFragmentProvider, C11337k0 notFoundClasses, AbstractC3596r errorReporter, AbstractC13879c lookupTracker, AbstractC3583j contractDeserializer, AbstractC7674l kotlinTypeChecker, C8626a typeAttributeTranslators) {
        List i;
        List i2;
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(moduleDescriptor, "moduleDescriptor");
        C9971q.m14633g(configuration, "configuration");
        C9971q.m14633g(classDataFinder, "classDataFinder");
        C9971q.m14633g(annotationAndConstantLoader, "annotationAndConstantLoader");
        C9971q.m14633g(packageFragmentProvider, "packageFragmentProvider");
        C9971q.m14633g(notFoundClasses, "notFoundClasses");
        C9971q.m14633g(errorReporter, "errorReporter");
        C9971q.m14633g(lookupTracker, "lookupTracker");
        C9971q.m14633g(contractDeserializer, "contractDeserializer");
        C9971q.m14633g(kotlinTypeChecker, "kotlinTypeChecker");
        C9971q.m14633g(typeAttributeTranslators, "typeAttributeTranslators");
        AbstractC10420h n = moduleDescriptor.mo6136n();
        C11112f fVar = n instanceof C11112f ? (C11112f) n : null;
        AbstractC3602v.C3603a aVar = AbstractC3602v.C3603a.f5868a;
        C7622j jVar = C7622j.f16622a;
        i = C9906j.m14820i();
        AbstractC12125a aVar2 = (fVar == null || (aVar2 = fVar.m10870H0()) == null) ? AbstractC12125a.C0385a.f27210a : aVar2;
        AbstractC12127c cVar = (fVar == null || (cVar = fVar.m10870H0()) == null) ? AbstractC12127c.C12129b.f27212a : cVar;
        C11697g a = C10619i.f23511a.m12728a();
        i2 = C9906j.m14820i();
        this.f16609a = new C3585k(storageManager, moduleDescriptor, configuration, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, aVar, errorReporter, lookupTracker, jVar, i, notFoundClasses, contractDeserializer, aVar2, cVar, a, kotlinTypeChecker, new C14168b(storageManager, i2), null, typeAttributeTranslators.m18484a(), 262144, null);
    }

    /* renamed from: a */
    public final C3585k m21882a() {
        return this.f16609a;
    }
}
