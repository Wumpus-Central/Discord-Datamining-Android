package bi;

import fi.AbstractC7228b1;
import fi.C7303o;
import gi.AbstractC7674l;
import java.util.List;
import kh.AbstractC9869a;
import kh.AbstractC9874c;
import kh.C9879g;
import kh.C9880h;
import kotlin.collections.C9905i;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p070di.AbstractC6483f;
import p087ei.AbstractC6944n;
import p163j$.util.Spliterator;
import p249nh.C11136b;
import p268og.AbstractC11313e;
import p268og.AbstractC11327h0;
import p268og.AbstractC11344l0;
import p268og.AbstractC11347m0;
import p268og.C11337k0;
import p304qg.AbstractC12125a;
import p304qg.AbstractC12126b;
import p304qg.AbstractC12127c;
import p304qg.AbstractC12131e;
import p406wg.AbstractC13879c;
import p428xh.AbstractC14167a;
import pg.AbstractC11666c;
import ph.C11697g;
import th.AbstractC13104g;

/* renamed from: bi.k */
/* loaded from: classes8.dex */
public final class C3585k {

    /* renamed from: a */
    private final AbstractC6944n f5819a;

    /* renamed from: b */
    private final AbstractC11327h0 f5820b;

    /* renamed from: c */
    private final AbstractC3586l f5821c;

    /* renamed from: d */
    private final AbstractC3578h f5822d;

    /* renamed from: e */
    private final AbstractC3562c<AbstractC11666c, AbstractC13104g<?>> f5823e;

    /* renamed from: f */
    private final AbstractC11347m0 f5824f;

    /* renamed from: g */
    private final AbstractC3602v f5825g;

    /* renamed from: h */
    private final AbstractC3596r f5826h;

    /* renamed from: i */
    private final AbstractC13879c f5827i;

    /* renamed from: j */
    private final AbstractC3598s f5828j;

    /* renamed from: k */
    private final Iterable<AbstractC12126b> f5829k;

    /* renamed from: l */
    private final C11337k0 f5830l;

    /* renamed from: m */
    private final AbstractC3583j f5831m;

    /* renamed from: n */
    private final AbstractC12125a f5832n;

    /* renamed from: o */
    private final AbstractC12127c f5833o;

    /* renamed from: p */
    private final C11697g f5834p;

    /* renamed from: q */
    private final AbstractC7674l f5835q;

    /* renamed from: r */
    private final AbstractC14167a f5836r;

    /* renamed from: s */
    private final AbstractC12131e f5837s;

    /* renamed from: t */
    private final List<AbstractC7228b1> f5838t;

    /* renamed from: u */
    private final C3579i f5839u;

    /* JADX WARN: Multi-variable type inference failed */
    public C3585k(AbstractC6944n storageManager, AbstractC11327h0 moduleDescriptor, AbstractC3586l configuration, AbstractC3578h classDataFinder, AbstractC3562c<? extends AbstractC11666c, ? extends AbstractC13104g<?>> annotationAndConstantLoader, AbstractC11347m0 packageFragmentProvider, AbstractC3602v localClassifierTypeSettings, AbstractC3596r errorReporter, AbstractC13879c lookupTracker, AbstractC3598s flexibleTypeDeserializer, Iterable<? extends AbstractC12126b> fictitiousClassDescriptorFactories, C11337k0 notFoundClasses, AbstractC3583j contractDeserializer, AbstractC12125a additionalClassPartsProvider, AbstractC12127c platformDependentDeclarationFilter, C11697g extensionRegistryLite, AbstractC7674l kotlinTypeChecker, AbstractC14167a samConversionResolver, AbstractC12131e platformDependentTypeTransformer, List<? extends AbstractC7228b1> typeAttributeTranslators) {
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(moduleDescriptor, "moduleDescriptor");
        C9971q.m14633g(configuration, "configuration");
        C9971q.m14633g(classDataFinder, "classDataFinder");
        C9971q.m14633g(annotationAndConstantLoader, "annotationAndConstantLoader");
        C9971q.m14633g(packageFragmentProvider, "packageFragmentProvider");
        C9971q.m14633g(localClassifierTypeSettings, "localClassifierTypeSettings");
        C9971q.m14633g(errorReporter, "errorReporter");
        C9971q.m14633g(lookupTracker, "lookupTracker");
        C9971q.m14633g(flexibleTypeDeserializer, "flexibleTypeDeserializer");
        C9971q.m14633g(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        C9971q.m14633g(notFoundClasses, "notFoundClasses");
        C9971q.m14633g(contractDeserializer, "contractDeserializer");
        C9971q.m14633g(additionalClassPartsProvider, "additionalClassPartsProvider");
        C9971q.m14633g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        C9971q.m14633g(extensionRegistryLite, "extensionRegistryLite");
        C9971q.m14633g(kotlinTypeChecker, "kotlinTypeChecker");
        C9971q.m14633g(samConversionResolver, "samConversionResolver");
        C9971q.m14633g(platformDependentTypeTransformer, "platformDependentTypeTransformer");
        C9971q.m14633g(typeAttributeTranslators, "typeAttributeTranslators");
        this.f5819a = storageManager;
        this.f5820b = moduleDescriptor;
        this.f5821c = configuration;
        this.f5822d = classDataFinder;
        this.f5823e = annotationAndConstantLoader;
        this.f5824f = packageFragmentProvider;
        this.f5825g = localClassifierTypeSettings;
        this.f5826h = errorReporter;
        this.f5827i = lookupTracker;
        this.f5828j = flexibleTypeDeserializer;
        this.f5829k = fictitiousClassDescriptorFactories;
        this.f5830l = notFoundClasses;
        this.f5831m = contractDeserializer;
        this.f5832n = additionalClassPartsProvider;
        this.f5833o = platformDependentDeclarationFilter;
        this.f5834p = extensionRegistryLite;
        this.f5835q = kotlinTypeChecker;
        this.f5836r = samConversionResolver;
        this.f5837s = platformDependentTypeTransformer;
        this.f5838t = typeAttributeTranslators;
        this.f5839u = new C3579i(this);
    }

    /* renamed from: a */
    public final C3588m m34049a(AbstractC11344l0 descriptor, AbstractC9874c nameResolver, C9879g typeTable, C9880h versionRequirementTable, AbstractC9869a metadataVersion, AbstractC6483f fVar) {
        List i;
        C9971q.m14633g(descriptor, "descriptor");
        C9971q.m14633g(nameResolver, "nameResolver");
        C9971q.m14633g(typeTable, "typeTable");
        C9971q.m14633g(versionRequirementTable, "versionRequirementTable");
        C9971q.m14633g(metadataVersion, "metadataVersion");
        i = C9906j.m14820i();
        return new C3588m(this, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, fVar, null, i);
    }

    /* renamed from: b */
    public final AbstractC11313e m34048b(C11136b classId) {
        C9971q.m14633g(classId, "classId");
        return C3579i.m34056e(this.f5839u, classId, null, 2, null);
    }

    /* renamed from: c */
    public final AbstractC12125a m34047c() {
        return this.f5832n;
    }

    /* renamed from: d */
    public final AbstractC3562c<AbstractC11666c, AbstractC13104g<?>> m34046d() {
        return this.f5823e;
    }

    /* renamed from: e */
    public final AbstractC3578h m34045e() {
        return this.f5822d;
    }

    /* renamed from: f */
    public final C3579i m34044f() {
        return this.f5839u;
    }

    /* renamed from: g */
    public final AbstractC3586l m34043g() {
        return this.f5821c;
    }

    /* renamed from: h */
    public final AbstractC3583j m34042h() {
        return this.f5831m;
    }

    /* renamed from: i */
    public final AbstractC3596r m34041i() {
        return this.f5826h;
    }

    /* renamed from: j */
    public final C11697g m34040j() {
        return this.f5834p;
    }

    /* renamed from: k */
    public final Iterable<AbstractC12126b> m34039k() {
        return this.f5829k;
    }

    /* renamed from: l */
    public final AbstractC3598s m34038l() {
        return this.f5828j;
    }

    /* renamed from: m */
    public final AbstractC7674l m34037m() {
        return this.f5835q;
    }

    /* renamed from: n */
    public final AbstractC3602v m34036n() {
        return this.f5825g;
    }

    /* renamed from: o */
    public final AbstractC13879c m34035o() {
        return this.f5827i;
    }

    /* renamed from: p */
    public final AbstractC11327h0 m34034p() {
        return this.f5820b;
    }

    /* renamed from: q */
    public final C11337k0 m34033q() {
        return this.f5830l;
    }

    /* renamed from: r */
    public final AbstractC11347m0 m34032r() {
        return this.f5824f;
    }

    /* renamed from: s */
    public final AbstractC12127c m34031s() {
        return this.f5833o;
    }

    /* renamed from: t */
    public final AbstractC12131e m34030t() {
        return this.f5837s;
    }

    /* renamed from: u */
    public final AbstractC6944n m34029u() {
        return this.f5819a;
    }

    /* renamed from: v */
    public final List<AbstractC7228b1> m34028v() {
        return this.f5838t;
    }

    public /* synthetic */ C3585k(AbstractC6944n nVar, AbstractC11327h0 h0Var, AbstractC3586l lVar, AbstractC3578h hVar, AbstractC3562c cVar, AbstractC11347m0 m0Var, AbstractC3602v vVar, AbstractC3596r rVar, AbstractC13879c cVar2, AbstractC3598s sVar, Iterable iterable, C11337k0 k0Var, AbstractC3583j jVar, AbstractC12125a aVar, AbstractC12127c cVar3, C11697g gVar, AbstractC7674l lVar2, AbstractC14167a aVar2, AbstractC12131e eVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, h0Var, lVar, hVar, cVar, m0Var, vVar, rVar, cVar2, sVar, iterable, k0Var, jVar, (i & 8192) != 0 ? AbstractC12125a.C0385a.f27210a : aVar, (i & Spliterator.SUBSIZED) != 0 ? AbstractC12127c.C12128a.f27211a : cVar3, gVar, (65536 & i) != 0 ? AbstractC7674l.f16679b.m21676a() : lVar2, aVar2, (262144 & i) != 0 ? AbstractC12131e.C12132a.f27214a : eVar, (i & 524288) != 0 ? C9905i.m14825d(C7303o.f15781a) : list);
    }
}
