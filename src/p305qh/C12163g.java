package p305qh;

import fi.AbstractC7267g0;
import java.lang.reflect.Field;
import java.util.Set;
import kotlin.collections.C9921w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9944c0;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.C9977w;
import kotlin.properties.AbstractC9983c;
import kotlin.properties.C9981a;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import p249nh.C11137c;
import p268og.AbstractC11335j1;
import p305qh.AbstractC12134b;
import p305qh.AbstractC12137c;
import p305qh.AbstractC12161f;
import p326ri.C12718u;
import pg.AbstractC11666c;

/* renamed from: qh.g */
/* loaded from: classes8.dex */
public final class C12163g implements AbstractC12161f {

    /* renamed from: X */
    static final /* synthetic */ KProperty<Object>[] f39149X = {C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "withDefinedIn", "getWithDefinedIn()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "modifiers", "getModifiers()Ljava/util/Set;")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "startFromName", "getStartFromName()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "debugMode", "getDebugMode()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "verbose", "getVerbose()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "unitReturnType", "getUnitReturnType()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "withoutReturnType", "getWithoutReturnType()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "enhancedTypes", "getEnhancedTypes()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "renderDefaultModality", "getRenderDefaultModality()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "receiverAfterName", "getReceiverAfterName()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), C9951f0.m14681e(new C9977w(C9951f0.m14684b(C12163g.class), "informativeErrorType", "getInformativeErrorType()Z"))};

    /* renamed from: E */
    private final ReadWriteProperty f39154E;

    /* renamed from: F */
    private final ReadWriteProperty f39155F;

    /* renamed from: H */
    private final ReadWriteProperty f39157H;

    /* renamed from: I */
    private final ReadWriteProperty f39158I;

    /* renamed from: J */
    private final ReadWriteProperty f39159J;

    /* renamed from: N */
    private final ReadWriteProperty f39163N;

    /* renamed from: O */
    private final ReadWriteProperty f39164O;

    /* renamed from: P */
    private final ReadWriteProperty f39165P;

    /* renamed from: Q */
    private final ReadWriteProperty f39166Q;

    /* renamed from: R */
    private final ReadWriteProperty f39167R;

    /* renamed from: S */
    private final ReadWriteProperty f39168S;

    /* renamed from: T */
    private final ReadWriteProperty f39169T;

    /* renamed from: U */
    private final ReadWriteProperty f39170U;

    /* renamed from: V */
    private final ReadWriteProperty f39171V;

    /* renamed from: W */
    private final ReadWriteProperty f39172W;

    /* renamed from: a */
    private boolean f27276a;

    /* renamed from: c */
    private final ReadWriteProperty f27278c;

    /* renamed from: d */
    private final ReadWriteProperty f27279d;

    /* renamed from: f */
    private final ReadWriteProperty f27281f;

    /* renamed from: g */
    private final ReadWriteProperty f27282g;

    /* renamed from: h */
    private final ReadWriteProperty f27283h;

    /* renamed from: i */
    private final ReadWriteProperty f27284i;

    /* renamed from: j */
    private final ReadWriteProperty f27285j;

    /* renamed from: k */
    private final ReadWriteProperty f27286k;

    /* renamed from: l */
    private final ReadWriteProperty f27287l;

    /* renamed from: m */
    private final ReadWriteProperty f27288m;

    /* renamed from: n */
    private final ReadWriteProperty f27289n;

    /* renamed from: o */
    private final ReadWriteProperty f27290o;

    /* renamed from: p */
    private final ReadWriteProperty f27291p;

    /* renamed from: q */
    private final ReadWriteProperty f27292q;

    /* renamed from: r */
    private final ReadWriteProperty f27293r;

    /* renamed from: s */
    private final ReadWriteProperty f27294s;

    /* renamed from: t */
    private final ReadWriteProperty f27295t;

    /* renamed from: u */
    private final ReadWriteProperty f27296u;

    /* renamed from: v */
    private final ReadWriteProperty f27297v;

    /* renamed from: w */
    private final ReadWriteProperty f27298w;

    /* renamed from: z */
    private final ReadWriteProperty f27301z;

    /* renamed from: b */
    private final ReadWriteProperty f27277b = m7526m0(AbstractC12134b.C12136c.f27223a);

    /* renamed from: e */
    private final ReadWriteProperty f27280e = m7526m0(EnumC12159e.f27261m);

    /* renamed from: x */
    private final ReadWriteProperty f27299x = m7526m0(C12166c.f27304k);

    /* renamed from: y */
    private final ReadWriteProperty f27300y = m7526m0(C12164a.f27302k);

    /* renamed from: A */
    private final ReadWriteProperty f39150A = m7526m0(EnumC12169j.RENDER_OPEN);

    /* renamed from: B */
    private final ReadWriteProperty f39151B = m7526m0(AbstractC12137c.AbstractC12149l.C12150a.f27246a);

    /* renamed from: C */
    private final ReadWriteProperty f39152C = m7526m0(EnumC12172m.PLAIN);

    /* renamed from: D */
    private final ReadWriteProperty f39153D = m7526m0(EnumC12170k.ALL);

    /* renamed from: G */
    private final ReadWriteProperty f39156G = m7526m0(EnumC12171l.DEBUG);

    /* renamed from: K */
    private final ReadWriteProperty f39160K = m7526m0(C12167h.f27305a.m7510a());

    /* renamed from: L */
    private final ReadWriteProperty f39161L = m7526m0(null);

    /* renamed from: M */
    private final ReadWriteProperty f39162M = m7526m0(EnumC12133a.NO_ARGUMENTS);

    /* renamed from: qh.g$a */
    /* loaded from: classes8.dex */
    static final class C12164a extends AbstractC9973s implements Function1<AbstractC11335j1, String> {

        /* renamed from: k */
        public static final C12164a f27302k = new C12164a();

        C12164a() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(AbstractC11335j1 it) {
            C9971q.m14633g(it, "it");
            return "...";
        }
    }

    /* renamed from: qh.g$b */
    /* loaded from: classes8.dex */
    public static final class C12165b extends AbstractC9983c<T> {

        /* renamed from: a */
        final /* synthetic */ C12163g f27303a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12165b(Object obj, C12163g gVar) {
            super(obj);
            this.f27303a = gVar;
        }

        @Override // kotlin.properties.AbstractC9983c
        protected boolean beforeChange(KProperty<?> property, T t, T t2) {
            C9971q.m14633g(property, "property");
            if (!this.f27303a.m7530k0()) {
                return true;
            }
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
    }

    /* renamed from: qh.g$c */
    /* loaded from: classes8.dex */
    static final class C12166c extends AbstractC9973s implements Function1<AbstractC7267g0, AbstractC7267g0> {

        /* renamed from: k */
        public static final C12166c f27304k = new C12166c();

        C12166c() {
            super(1);
        }

        /* renamed from: a */
        public final AbstractC7267g0 invoke(AbstractC7267g0 it) {
            C9971q.m14633g(it, "it");
            return it;
        }
    }

    public C12163g() {
        Set d;
        Boolean bool = Boolean.TRUE;
        this.f27278c = m7526m0(bool);
        this.f27279d = m7526m0(bool);
        Boolean bool2 = Boolean.FALSE;
        this.f27281f = m7526m0(bool2);
        this.f27282g = m7526m0(bool2);
        this.f27283h = m7526m0(bool2);
        this.f27284i = m7526m0(bool2);
        this.f27285j = m7526m0(bool2);
        this.f27286k = m7526m0(bool);
        this.f27287l = m7526m0(bool2);
        this.f27288m = m7526m0(bool2);
        this.f27289n = m7526m0(bool2);
        this.f27290o = m7526m0(bool);
        this.f27291p = m7526m0(bool);
        this.f27292q = m7526m0(bool2);
        this.f27293r = m7526m0(bool2);
        this.f27294s = m7526m0(bool2);
        this.f27295t = m7526m0(bool2);
        this.f27296u = m7526m0(bool2);
        this.f27297v = m7526m0(bool2);
        this.f27298w = m7526m0(bool2);
        this.f27301z = m7526m0(bool);
        this.f39154E = m7526m0(bool2);
        this.f39155F = m7526m0(bool2);
        this.f39157H = m7526m0(bool2);
        this.f39158I = m7526m0(bool2);
        d = C9921w.m14722d();
        this.f39159J = m7526m0(d);
        this.f39163N = m7526m0(bool2);
        this.f39164O = m7526m0(bool);
        this.f39165P = m7526m0(bool);
        this.f39166Q = m7526m0(bool2);
        this.f39167R = m7526m0(bool);
        this.f39168S = m7526m0(bool);
        this.f39169T = m7526m0(bool2);
        this.f39170U = m7526m0(bool2);
        this.f39171V = m7526m0(bool2);
        this.f39172W = m7526m0(bool);
    }

    /* renamed from: m0 */
    private final <T> ReadWriteProperty<C12163g, T> m7526m0(T t) {
        C9981a aVar = C9981a.f22098a;
        return new C12165b(t, this);
    }

    /* renamed from: A */
    public boolean m7577A() {
        return ((Boolean) this.f39167R.getValue(this, f39149X[42])).booleanValue();
    }

    /* renamed from: B */
    public boolean m7576B() {
        return AbstractC12161f.C12162a.m7579a(this);
    }

    /* renamed from: C */
    public boolean m7575C() {
        return AbstractC12161f.C12162a.m7578b(this);
    }

    /* renamed from: D */
    public boolean m7574D() {
        return ((Boolean) this.f27296u.getValue(this, f39149X[19])).booleanValue();
    }

    /* renamed from: E */
    public boolean m7573E() {
        return ((Boolean) this.f39172W.getValue(this, f39149X[47])).booleanValue();
    }

    /* renamed from: F */
    public Set<EnumC12159e> m7572F() {
        return (Set) this.f27280e.getValue(this, f39149X[3]);
    }

    /* renamed from: G */
    public boolean m7571G() {
        return ((Boolean) this.f27289n.getValue(this, f39149X[12])).booleanValue();
    }

    /* renamed from: H */
    public EnumC12169j m7570H() {
        return (EnumC12169j) this.f39150A.getValue(this, f39149X[25]);
    }

    /* renamed from: I */
    public EnumC12170k m7569I() {
        return (EnumC12170k) this.f39153D.getValue(this, f39149X[28]);
    }

    /* renamed from: J */
    public boolean m7568J() {
        return ((Boolean) this.f39168S.getValue(this, f39149X[43])).booleanValue();
    }

    /* renamed from: K */
    public boolean m7567K() {
        return ((Boolean) this.f39170U.getValue(this, f39149X[45])).booleanValue();
    }

    /* renamed from: L */
    public EnumC12171l m7566L() {
        return (EnumC12171l) this.f39156G.getValue(this, f39149X[31]);
    }

    /* renamed from: M */
    public boolean m7565M() {
        return ((Boolean) this.f39154E.getValue(this, f39149X[29])).booleanValue();
    }

    /* renamed from: N */
    public boolean m7564N() {
        return ((Boolean) this.f39155F.getValue(this, f39149X[30])).booleanValue();
    }

    /* renamed from: O */
    public boolean m7563O() {
        return ((Boolean) this.f27292q.getValue(this, f39149X[15])).booleanValue();
    }

    /* renamed from: P */
    public boolean m7562P() {
        return ((Boolean) this.f39164O.getValue(this, f39149X[39])).booleanValue();
    }

    /* renamed from: Q */
    public boolean m7561Q() {
        return ((Boolean) this.f39157H.getValue(this, f39149X[32])).booleanValue();
    }

    /* renamed from: R */
    public boolean m7560R() {
        return ((Boolean) this.f27291p.getValue(this, f39149X[14])).booleanValue();
    }

    /* renamed from: S */
    public boolean m7559S() {
        return ((Boolean) this.f27290o.getValue(this, f39149X[13])).booleanValue();
    }

    /* renamed from: T */
    public boolean m7558T() {
        return ((Boolean) this.f27293r.getValue(this, f39149X[16])).booleanValue();
    }

    /* renamed from: U */
    public boolean m7557U() {
        return ((Boolean) this.f39166Q.getValue(this, f39149X[41])).booleanValue();
    }

    /* renamed from: V */
    public boolean m7556V() {
        return ((Boolean) this.f39165P.getValue(this, f39149X[40])).booleanValue();
    }

    /* renamed from: W */
    public boolean m7555W() {
        return ((Boolean) this.f27301z.getValue(this, f39149X[24])).booleanValue();
    }

    /* renamed from: X */
    public boolean m7554X() {
        return ((Boolean) this.f27282g.getValue(this, f39149X[5])).booleanValue();
    }

    /* renamed from: Y */
    public boolean m7553Y() {
        return ((Boolean) this.f27281f.getValue(this, f39149X[4])).booleanValue();
    }

    /* renamed from: Z */
    public EnumC12172m m7552Z() {
        return (EnumC12172m) this.f39152C.getValue(this, f39149X[27]);
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: a */
    public void mo7551a(EnumC12170k kVar) {
        C9971q.m14633g(kVar, "<set-?>");
        this.f39153D.setValue(this, f39149X[28], kVar);
    }

    /* renamed from: a0 */
    public Function1<AbstractC7267g0, AbstractC7267g0> m7550a0() {
        return (Function1) this.f27299x.getValue(this, f39149X[22]);
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: b */
    public void mo7549b(boolean z) {
        this.f27281f.setValue(this, f39149X[4], Boolean.valueOf(z));
    }

    /* renamed from: b0 */
    public boolean m7548b0() {
        return ((Boolean) this.f27295t.getValue(this, f39149X[18])).booleanValue();
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: c */
    public void mo7547c(boolean z) {
        this.f27278c.setValue(this, f39149X[1], Boolean.valueOf(z));
    }

    /* renamed from: c0 */
    public boolean m7546c0() {
        return ((Boolean) this.f27286k.getValue(this, f39149X[9])).booleanValue();
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: d */
    public boolean mo7545d() {
        return ((Boolean) this.f27288m.getValue(this, f39149X[11])).booleanValue();
    }

    /* renamed from: d0 */
    public AbstractC12137c.AbstractC12149l m7544d0() {
        return (AbstractC12137c.AbstractC12149l) this.f39151B.getValue(this, f39149X[26]);
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: e */
    public void mo7543e(boolean z) {
        this.f27298w.setValue(this, f39149X[21], Boolean.valueOf(z));
    }

    /* renamed from: e0 */
    public boolean m7542e0() {
        return ((Boolean) this.f27285j.getValue(this, f39149X[8])).booleanValue();
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: f */
    public void mo7541f(boolean z) {
        this.f39154E.setValue(this, f39149X[29], Boolean.valueOf(z));
    }

    /* renamed from: f0 */
    public boolean m7540f0() {
        return ((Boolean) this.f27278c.getValue(this, f39149X[1])).booleanValue();
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: g */
    public Set<C11137c> mo7539g() {
        return (Set) this.f39160K.getValue(this, f39149X[35]);
    }

    /* renamed from: g0 */
    public boolean m7538g0() {
        return ((Boolean) this.f27279d.getValue(this, f39149X[2])).booleanValue();
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: h */
    public boolean mo7537h() {
        return ((Boolean) this.f27283h.getValue(this, f39149X[6])).booleanValue();
    }

    /* renamed from: h0 */
    public boolean m7536h0() {
        return ((Boolean) this.f27287l.getValue(this, f39149X[10])).booleanValue();
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: i */
    public EnumC12133a mo7535i() {
        return (EnumC12133a) this.f39162M.getValue(this, f39149X[37]);
    }

    /* renamed from: i0 */
    public boolean m7534i0() {
        return ((Boolean) this.f27298w.getValue(this, f39149X[21])).booleanValue();
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: j */
    public void mo7533j(Set<C11137c> set) {
        C9971q.m14633g(set, "<set-?>");
        this.f39160K.setValue(this, f39149X[35], set);
    }

    /* renamed from: j0 */
    public boolean m7532j0() {
        return ((Boolean) this.f27297v.getValue(this, f39149X[20])).booleanValue();
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: k */
    public void mo7531k(EnumC12172m mVar) {
        C9971q.m14633g(mVar, "<set-?>");
        this.f39152C.setValue(this, f39149X[27], mVar);
    }

    /* renamed from: k0 */
    public final boolean m7530k0() {
        return this.f27276a;
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: l */
    public void mo7529l(Set<? extends EnumC12159e> set) {
        C9971q.m14633g(set, "<set-?>");
        this.f27280e.setValue(this, f39149X[3], set);
    }

    /* renamed from: l0 */
    public final void m7528l0() {
        this.f27276a = true;
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: m */
    public void mo7527m(boolean z) {
        this.f27283h.setValue(this, f39149X[6], Boolean.valueOf(z));
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: n */
    public void mo7525n(boolean z) {
        this.f39155F.setValue(this, f39149X[30], Boolean.valueOf(z));
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: o */
    public void mo7524o(AbstractC12134b bVar) {
        C9971q.m14633g(bVar, "<set-?>");
        this.f27277b.setValue(this, f39149X[0], bVar);
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: p */
    public void mo7523p(boolean z) {
        this.f27297v.setValue(this, f39149X[20], Boolean.valueOf(z));
    }

    /* renamed from: q */
    public final C12163g m7522q() {
        AbstractC9983c cVar;
        boolean z;
        C12163g gVar = new C12163g();
        Field[] declaredFields = C12163g.class.getDeclaredFields();
        C9971q.m14634f(declaredFields, "this::class.java.declaredFields");
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                if (obj instanceof AbstractC9983c) {
                    cVar = (AbstractC9983c) obj;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    String name = field.getName();
                    C9971q.m14634f(name, "field.name");
                    C12718u.m5736H(name, "is", false, 2, null);
                    KClass b = C9951f0.m14684b(C12163g.class);
                    String name2 = field.getName();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("get");
                    String name3 = field.getName();
                    C9971q.m14634f(name3, "field.name");
                    if (name3.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String substring = name3.substring(1);
                        C9971q.m14634f(substring, "this as java.lang.String).substring(startIndex)");
                        name3 = upperCase + substring;
                    }
                    sb2.append(name3);
                    field.set(gVar, gVar.m7526m0(cVar.getValue(this, new C9944c0(b, name2, sb2.toString()))));
                }
            }
        }
        return gVar;
    }

    /* renamed from: r */
    public boolean m7521r() {
        return ((Boolean) this.f27294s.getValue(this, f39149X[17])).booleanValue();
    }

    /* renamed from: s */
    public boolean m7520s() {
        return ((Boolean) this.f39163N.getValue(this, f39149X[38])).booleanValue();
    }

    /* renamed from: t */
    public Function1<AbstractC11666c, Boolean> m7519t() {
        return (Function1) this.f39161L.getValue(this, f39149X[36]);
    }

    /* renamed from: u */
    public boolean m7518u() {
        return ((Boolean) this.f39171V.getValue(this, f39149X[46])).booleanValue();
    }

    /* renamed from: v */
    public boolean m7517v() {
        return ((Boolean) this.f27284i.getValue(this, f39149X[7])).booleanValue();
    }

    /* renamed from: w */
    public AbstractC12134b m7516w() {
        return (AbstractC12134b) this.f27277b.getValue(this, f39149X[0]);
    }

    /* renamed from: x */
    public Function1<AbstractC11335j1, String> m7515x() {
        return (Function1) this.f27300y.getValue(this, f39149X[23]);
    }

    /* renamed from: y */
    public boolean m7514y() {
        return ((Boolean) this.f39158I.getValue(this, f39149X[33])).booleanValue();
    }

    /* renamed from: z */
    public Set<C11137c> m7513z() {
        return (Set) this.f39159J.getValue(this, f39149X[34]);
    }
}
