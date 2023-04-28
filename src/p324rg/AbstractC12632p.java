package p324rg;

import fi.AbstractC7267g0;
import fi.AbstractC7299n1;
import fi.C7309p1;
import fi.C7324t;
import fi.EnumC7338w1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import p249nh.C11142f;
import p268og.AbstractC11297a;
import p268og.AbstractC11299a1;
import p268og.AbstractC11301b;
import p268og.AbstractC11319f1;
import p268og.AbstractC11335j1;
import p268og.AbstractC11342k1;
import p268og.AbstractC11346m;
import p268og.AbstractC11363o;
import p268og.AbstractC11387u;
import p268og.AbstractC11396x0;
import p268og.AbstractC11397y;
import p268og.C11373t;
import p268og.EnumC11314e0;
import p286pi.C11768e;
import p324rg.C12619l0;
import p325rh.C12659d;
import p468zh.AbstractC14662f;
import p468zh.C14660d;
import pg.AbstractC11672g;
import pg.C11676i;

/* renamed from: rg.p */
/* loaded from: classes8.dex */
public abstract class AbstractC12632p extends AbstractC12616k implements AbstractC11397y {

    /* renamed from: A */
    private boolean f39327A;

    /* renamed from: B */
    private boolean f39328B;

    /* renamed from: C */
    private boolean f39329C;

    /* renamed from: D */
    private boolean f39330D;

    /* renamed from: E */
    private boolean f39331E;

    /* renamed from: F */
    private boolean f39332F;

    /* renamed from: G */
    private boolean f39333G;

    /* renamed from: H */
    private boolean f39334H;

    /* renamed from: I */
    private Collection<? extends AbstractC11397y> f39335I;

    /* renamed from: J */
    private volatile Function0<Collection<AbstractC11397y>> f39336J;

    /* renamed from: K */
    private final AbstractC11397y f39337K;

    /* renamed from: L */
    private final AbstractC11301b.EnumC11302a f39338L;

    /* renamed from: M */
    private AbstractC11397y f39339M;

    /* renamed from: N */
    protected Map<AbstractC11297a.AbstractC0362a<?>, Object> f39340N;

    /* renamed from: o */
    private List<AbstractC11319f1> f28399o;

    /* renamed from: p */
    private List<AbstractC11335j1> f28400p;

    /* renamed from: q */
    private AbstractC7267g0 f28401q;

    /* renamed from: r */
    private List<AbstractC11396x0> f28402r;

    /* renamed from: s */
    private AbstractC11396x0 f28403s;

    /* renamed from: t */
    private AbstractC11396x0 f28404t;

    /* renamed from: u */
    private EnumC11314e0 f28405u;

    /* renamed from: v */
    private AbstractC11387u f28406v;

    /* renamed from: w */
    private boolean f28407w;

    /* renamed from: x */
    private boolean f28408x;

    /* renamed from: y */
    private boolean f28409y;

    /* renamed from: z */
    private boolean f28410z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rg.p$a */
    /* loaded from: classes8.dex */
    public class C12633a implements Function0<Collection<AbstractC11397y>> {

        /* renamed from: k */
        final /* synthetic */ C7309p1 f28411k;

        C12633a(C7309p1 p1Var) {
            this.f28411k = p1Var;
        }

        /* renamed from: a */
        public Collection<AbstractC11397y> invoke() {
            C11768e eVar = new C11768e();
            for (AbstractC11397y yVar : AbstractC12632p.this.mo6249d()) {
                eVar.add(yVar.mo6167c(this.f28411k));
            }
            return eVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rg.p$b */
    /* loaded from: classes8.dex */
    public static class C12634b implements Function0<List<AbstractC11342k1>> {

        /* renamed from: k */
        final /* synthetic */ List f28413k;

        C12634b(List list) {
            this.f28413k = list;
        }

        /* renamed from: a */
        public List<AbstractC11342k1> invoke() {
            return this.f28413k;
        }
    }

    /* renamed from: rg.p$c */
    /* loaded from: classes8.dex */
    public class C12635c implements AbstractC11397y.AbstractC11398a<AbstractC11397y> {

        /* renamed from: a */
        protected AbstractC7299n1 f28414a;

        /* renamed from: b */
        protected AbstractC11346m f28415b;

        /* renamed from: c */
        protected EnumC11314e0 f28416c;

        /* renamed from: d */
        protected AbstractC11387u f28417d;

        /* renamed from: e */
        protected AbstractC11397y f28418e;

        /* renamed from: f */
        protected AbstractC11301b.EnumC11302a f28419f;

        /* renamed from: g */
        protected List<AbstractC11335j1> f28420g;

        /* renamed from: h */
        protected List<AbstractC11396x0> f28421h;

        /* renamed from: i */
        protected AbstractC11396x0 f28422i;

        /* renamed from: j */
        protected AbstractC11396x0 f28423j;

        /* renamed from: k */
        protected AbstractC7267g0 f28424k;

        /* renamed from: l */
        protected C11142f f28425l;

        /* renamed from: m */
        protected boolean f28426m;

        /* renamed from: n */
        protected boolean f28427n;

        /* renamed from: o */
        protected boolean f28428o;

        /* renamed from: p */
        protected boolean f28429p;

        /* renamed from: q */
        private boolean f28430q;

        /* renamed from: r */
        private List<AbstractC11319f1> f28431r;

        /* renamed from: s */
        private AbstractC11672g f28432s;

        /* renamed from: t */
        private boolean f28433t;

        /* renamed from: u */
        private Map<AbstractC11297a.AbstractC0362a<?>, Object> f28434u;

        /* renamed from: v */
        private Boolean f28435v;

        /* renamed from: w */
        protected boolean f28436w;

        /* renamed from: x */
        final /* synthetic */ AbstractC12632p f28437x;

        public C12635c(AbstractC12632p pVar, AbstractC7299n1 n1Var, AbstractC11346m mVar, EnumC11314e0 e0Var, AbstractC11387u uVar, AbstractC11301b.EnumC11302a aVar, List<AbstractC11335j1> list, List<AbstractC11396x0> list2, AbstractC11396x0 x0Var, AbstractC7267g0 g0Var, C11142f fVar) {
            if (n1Var == null) {
                m6192u(0);
            }
            if (mVar == null) {
                m6192u(1);
            }
            if (e0Var == null) {
                m6192u(2);
            }
            if (uVar == null) {
                m6192u(3);
            }
            if (aVar == null) {
                m6192u(4);
            }
            if (list == null) {
                m6192u(5);
            }
            if (list2 == null) {
                m6192u(6);
            }
            if (g0Var == null) {
                m6192u(7);
            }
            this.f28437x = pVar;
            this.f28418e = null;
            this.f28423j = pVar.f28404t;
            this.f28426m = true;
            this.f28427n = false;
            this.f28428o = false;
            this.f28429p = false;
            this.f28430q = pVar.mo6273A0();
            this.f28431r = null;
            this.f28432s = null;
            this.f28433t = pVar.mo6269F0();
            this.f28434u = new LinkedHashMap();
            this.f28435v = null;
            this.f28436w = false;
            this.f28414a = n1Var;
            this.f28415b = mVar;
            this.f28416c = e0Var;
            this.f28417d = uVar;
            this.f28419f = aVar;
            this.f28420g = list;
            this.f28421h = list2;
            this.f28422i = x0Var;
            this.f28424k = g0Var;
            this.f28425l = fVar;
        }

        /* renamed from: u */
        private static /* synthetic */ void m6192u(int i) {
            String str;
            int i2;
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i2 = 2;
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    i2 = 3;
                    break;
            }
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = "name";
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = "substitution";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new IllegalStateException(format);
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    throw new IllegalArgumentException(format);
            }
        }

        /* renamed from: B */
        public C12635c mo6197p(AbstractC11672g gVar) {
            if (gVar == null) {
                m6192u(35);
            }
            this.f28432s = gVar;
            return this;
        }

        /* renamed from: C */
        public C12635c mo6201l(boolean z) {
            this.f28426m = z;
            return this;
        }

        /* renamed from: D */
        public C12635c mo6198o(AbstractC11396x0 x0Var) {
            this.f28423j = x0Var;
            return this;
        }

        /* renamed from: E */
        public C12635c mo6212a() {
            this.f28429p = true;
            return this;
        }

        /* renamed from: F */
        public C12635c mo6195r(AbstractC11396x0 x0Var) {
            this.f28422i = x0Var;
            return this;
        }

        /* renamed from: G */
        public C12635c m6228G(boolean z) {
            this.f28435v = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: H */
        public C12635c mo6207f() {
            this.f28433t = true;
            return this;
        }

        /* renamed from: I */
        public C12635c mo6204i() {
            this.f28430q = true;
            return this;
        }

        /* renamed from: J */
        public C12635c m6225J(boolean z) {
            this.f28436w = z;
            return this;
        }

        /* renamed from: K */
        public C12635c mo6196q(AbstractC11301b.EnumC11302a aVar) {
            if (aVar == null) {
                m6192u(14);
            }
            this.f28419f = aVar;
            return this;
        }

        /* renamed from: L */
        public C12635c mo6209d(EnumC11314e0 e0Var) {
            if (e0Var == null) {
                m6192u(10);
            }
            this.f28416c = e0Var;
            return this;
        }

        /* renamed from: M */
        public C12635c mo6208e(C11142f fVar) {
            if (fVar == null) {
                m6192u(17);
            }
            this.f28425l = fVar;
            return this;
        }

        /* renamed from: N */
        public C12635c mo6205h(AbstractC11301b bVar) {
            this.f28418e = (AbstractC11397y) bVar;
            return this;
        }

        /* renamed from: O */
        public C12635c mo6194s(AbstractC11346m mVar) {
            if (mVar == null) {
                m6192u(8);
            }
            this.f28415b = mVar;
            return this;
        }

        /* renamed from: P */
        public C12635c mo6202k() {
            this.f28428o = true;
            return this;
        }

        /* renamed from: Q */
        public C12635c mo6199n(AbstractC7267g0 g0Var) {
            if (g0Var == null) {
                m6192u(23);
            }
            this.f28424k = g0Var;
            return this;
        }

        /* renamed from: R */
        public C12635c mo6193t() {
            this.f28427n = true;
            return this;
        }

        /* renamed from: S */
        public C12635c mo6206g(AbstractC7299n1 n1Var) {
            if (n1Var == null) {
                m6192u(37);
            }
            this.f28414a = n1Var;
            return this;
        }

        /* renamed from: T */
        public C12635c mo6200m(List<AbstractC11319f1> list) {
            if (list == null) {
                m6192u(21);
            }
            this.f28431r = list;
            return this;
        }

        /* renamed from: U */
        public C12635c mo6210c(List<AbstractC11335j1> list) {
            if (list == null) {
                m6192u(19);
            }
            this.f28420g = list;
            return this;
        }

        /* renamed from: V */
        public C12635c mo6203j(AbstractC11387u uVar) {
            if (uVar == null) {
                m6192u(12);
            }
            this.f28417d = uVar;
            return this;
        }

        @Override // p268og.AbstractC11397y.AbstractC11398a
        /* renamed from: b */
        public <V> AbstractC11397y.AbstractC11398a<AbstractC11397y> mo6211b(AbstractC11297a.AbstractC0362a<V> aVar, V v) {
            if (aVar == null) {
                m6192u(39);
            }
            this.f28434u.put(aVar, v);
            return this;
        }

        @Override // p268og.AbstractC11397y.AbstractC11398a
        public AbstractC11397y build() {
            return this.f28437x.mo6263M0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12632p(AbstractC11346m mVar, AbstractC11397y yVar, AbstractC11672g gVar, C11142f fVar, AbstractC11301b.EnumC11302a aVar, AbstractC11299a1 a1Var) {
        super(mVar, gVar, fVar, a1Var);
        if (mVar == null) {
            m6267I(0);
        }
        if (gVar == null) {
            m6267I(1);
        }
        if (fVar == null) {
            m6267I(2);
        }
        if (aVar == null) {
            m6267I(3);
        }
        if (a1Var == null) {
            m6267I(4);
        }
        this.f28406v = C11373t.f25303i;
        this.f28407w = false;
        this.f28408x = false;
        this.f28409y = false;
        this.f28410z = false;
        this.f39327A = false;
        this.f39328B = false;
        this.f39329C = false;
        this.f39330D = false;
        this.f39331E = false;
        this.f39332F = false;
        this.f39333G = true;
        this.f39334H = false;
        this.f39335I = null;
        this.f39336J = null;
        this.f39339M = null;
        this.f39340N = null;
        this.f39337K = yVar == null ? this : yVar;
        this.f39338L = aVar;
    }

    /* renamed from: I */
    private static /* synthetic */ void m6267I(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i2 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(format);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: N0 */
    private AbstractC11299a1 m6262N0(boolean z, AbstractC11397y yVar) {
        AbstractC11299a1 a1Var;
        if (z) {
            if (yVar == null) {
                yVar = mo6162a();
            }
            a1Var = yVar.mo6102j();
        } else {
            a1Var = AbstractC11299a1.f25230a;
        }
        if (a1Var == null) {
            m6267I(27);
        }
        return a1Var;
    }

    /* renamed from: O0 */
    public static List<AbstractC11335j1> m6261O0(AbstractC11397y yVar, List<AbstractC11335j1> list, C7309p1 p1Var) {
        if (list == null) {
            m6267I(28);
        }
        if (p1Var == null) {
            m6267I(29);
        }
        return m6260P0(yVar, list, p1Var, false, false, null);
    }

    /* renamed from: P0 */
    public static List<AbstractC11335j1> m6260P0(AbstractC11397y yVar, List<AbstractC11335j1> list, C7309p1 p1Var, boolean z, boolean z2, boolean[] zArr) {
        AbstractC7267g0 g0Var;
        C12634b bVar;
        AbstractC11335j1 j1Var;
        AbstractC11299a1 a1Var;
        if (list == null) {
            m6267I(30);
        }
        if (p1Var == null) {
            m6267I(31);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (AbstractC11335j1 j1Var2 : list) {
            AbstractC7267g0 type = j1Var2.getType();
            EnumC7338w1 w1Var = EnumC7338w1.IN_VARIANCE;
            AbstractC7267g0 p = p1Var.m22970p(type, w1Var);
            AbstractC7267g0 r0 = j1Var2.mo6304r0();
            if (r0 == null) {
                g0Var = null;
            } else {
                g0Var = p1Var.m22970p(r0, w1Var);
            }
            if (p == null) {
                return null;
            }
            if (!((p == j1Var2.getType() && r0 == g0Var) || zArr == null)) {
                zArr[0] = true;
            }
            if (j1Var2 instanceof C12619l0.C12621b) {
                bVar = new C12634b(((C12619l0.C12621b) j1Var2).m6301N0());
            } else {
                bVar = null;
            }
            if (z) {
                j1Var = null;
            } else {
                j1Var = j1Var2;
            }
            int index = j1Var2.getIndex();
            AbstractC11672g annotations = j1Var2.getAnnotations();
            C11142f name = j1Var2.getName();
            boolean y0 = j1Var2.mo6303y0();
            boolean o0 = j1Var2.mo6305o0();
            boolean l0 = j1Var2.mo6306l0();
            if (z2) {
                a1Var = j1Var2.mo6102j();
            } else {
                a1Var = AbstractC11299a1.f25230a;
            }
            arrayList.add(C12619l0.m6309K0(yVar, j1Var, index, annotations, name, p, y0, o0, l0, g0Var, a1Var, bVar));
        }
        return arrayList;
    }

    /* renamed from: T0 */
    private void m6257T0() {
        Function0<Collection<AbstractC11397y>> function0 = this.f39336J;
        if (function0 != null) {
            this.f39335I = function0.invoke();
            this.f39336J = null;
        }
    }

    /* renamed from: a1 */
    private void m6252a1(boolean z) {
        this.f39331E = z;
    }

    /* renamed from: b1 */
    private void m6251b1(boolean z) {
        this.f39330D = z;
    }

    /* renamed from: d1 */
    private void m6248d1(AbstractC11397y yVar) {
        this.f39339M = yVar;
    }

    /* renamed from: A */
    public boolean mo6274A() {
        return this.f39327A;
    }

    @Override // p268og.AbstractC11397y
    /* renamed from: A0 */
    public boolean mo6273A0() {
        return this.f39330D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B0 */
    public void mo6272B0(Collection<? extends AbstractC11301b> collection) {
        if (collection == 0) {
            m6267I(17);
        }
        this.f39335I = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((AbstractC11397y) it.next()).mo6269F0()) {
                this.f39331E = true;
                return;
            }
        }
    }

    /* renamed from: C0 */
    public <R, D> R mo6105C0(AbstractC11363o<R, D> oVar, D d) {
        return oVar.mo6314k(this, d);
    }

    @Override // p268og.AbstractC11397y
    /* renamed from: F0 */
    public boolean mo6269F0() {
        return this.f39331E;
    }

    @Override // p268og.AbstractC11297a
    /* renamed from: J */
    public AbstractC11396x0 mo6266J() {
        return this.f28404t;
    }

    /* renamed from: K0 */
    public AbstractC11397y mo6270E0(AbstractC11346m mVar, EnumC11314e0 e0Var, AbstractC11387u uVar, AbstractC11301b.EnumC11302a aVar, boolean z) {
        AbstractC11397y build = mo6238u().mo6194s(mVar).mo6209d(e0Var).mo6203j(uVar).mo6196q(aVar).mo6201l(z).build();
        if (build == null) {
            m6267I(26);
        }
        return build;
    }

    /* renamed from: L0 */
    protected abstract AbstractC12632p mo71L0(AbstractC11346m mVar, AbstractC11397y yVar, AbstractC11301b.EnumC11302a aVar, C11142f fVar, AbstractC11672g gVar, AbstractC11299a1 a1Var);

    @Override // p268og.AbstractC11297a
    /* renamed from: M */
    public AbstractC11396x0 mo6264M() {
        return this.f28403s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: M0 */
    public AbstractC11397y mo6263M0(C12635c cVar) {
        AbstractC11672g gVar;
        List<AbstractC11319f1> list;
        C12605f0 f0Var;
        AbstractC11396x0 x0Var;
        AbstractC7267g0 p;
        boolean z;
        boolean z2;
        AbstractC11397y yVar;
        boolean z3;
        boolean z4;
        boolean z5;
        if (cVar == null) {
            m6267I(25);
        }
        boolean[] zArr = new boolean[1];
        if (cVar.f28432s != null) {
            gVar = C11676i.m9044a(getAnnotations(), cVar.f28432s);
        } else {
            gVar = getAnnotations();
        }
        AbstractC11346m mVar = cVar.f28415b;
        AbstractC11397y yVar2 = cVar.f28418e;
        AbstractC12632p L0 = mo71L0(mVar, yVar2, cVar.f28419f, cVar.f28425l, gVar, m6262N0(cVar.f28428o, yVar2));
        if (cVar.f28431r == null) {
            list = getTypeParameters();
        } else {
            list = cVar.f28431r;
        }
        zArr[0] = zArr[0] | (!list.isEmpty());
        ArrayList arrayList = new ArrayList(list.size());
        C7309p1 c = C7324t.m22916c(list, cVar.f28414a, L0, arrayList, zArr);
        if (c == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!cVar.f28421h.isEmpty()) {
            for (AbstractC11396x0 x0Var2 : cVar.f28421h) {
                AbstractC7267g0 p2 = c.m22970p(x0Var2.getType(), EnumC7338w1.IN_VARIANCE);
                if (p2 == null) {
                    return null;
                }
                arrayList2.add(C12659d.m6083b(L0, p2, ((AbstractC14662f) x0Var2.getValue()).mo47a(), x0Var2.getAnnotations()));
                boolean z6 = zArr[0];
                if (p2 != x0Var2.getType()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zArr[0] = z5 | z6;
            }
        }
        AbstractC11396x0 x0Var3 = cVar.f28422i;
        if (x0Var3 != null) {
            AbstractC7267g0 p3 = c.m22970p(x0Var3.getType(), EnumC7338w1.IN_VARIANCE);
            if (p3 == null) {
                return null;
            }
            C12605f0 f0Var2 = new C12605f0(L0, new C14660d(L0, p3, cVar.f28422i.getValue()), cVar.f28422i.getAnnotations());
            boolean z7 = zArr[0];
            if (p3 != cVar.f28422i.getType()) {
                z4 = true;
            } else {
                z4 = false;
            }
            zArr[0] = z4 | z7;
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        AbstractC11396x0 x0Var4 = cVar.f28423j;
        if (x0Var4 != 0) {
            AbstractC11396x0 c2 = x0Var4.mo6167c(c);
            if (c2 == null) {
                return null;
            }
            boolean z8 = zArr[0];
            if (c2 != cVar.f28423j) {
                z3 = true;
            } else {
                z3 = false;
            }
            zArr[0] = z8 | z3;
            x0Var = c2;
        } else {
            x0Var = null;
        }
        List<AbstractC11335j1> P0 = m6260P0(L0, cVar.f28420g, c, cVar.f28429p, cVar.f28428o, zArr);
        if (P0 == null || (p = c.m22970p(cVar.f28424k, EnumC7338w1.OUT_VARIANCE)) == null) {
            return null;
        }
        boolean z9 = zArr[0];
        if (p != cVar.f28424k) {
            z = true;
        } else {
            z = false;
        }
        boolean z10 = z9 | z;
        zArr[0] = z10;
        if (!z10 && cVar.f28436w) {
            return this;
        }
        L0.mo6259R0(f0Var, x0Var, arrayList2, arrayList, P0, p, cVar.f28416c, cVar.f28417d);
        L0.m6246f1(this.f28407w);
        L0.m6250c1(this.f28408x);
        L0.m6253X0(this.f28409y);
        L0.m6247e1(this.f28410z);
        L0.m6241i1(this.f39327A);
        L0.m6243h1(this.f39332F);
        L0.m6254W0(this.f39328B);
        L0.m6255V0(this.f39329C);
        L0.mo79Y0(this.f39333G);
        L0.m6251b1(cVar.f28430q);
        L0.m6252a1(cVar.f28433t);
        if (cVar.f28435v != null) {
            z2 = cVar.f28435v.booleanValue();
        } else {
            z2 = this.f39334H;
        }
        L0.mo78Z0(z2);
        if (!cVar.f28434u.isEmpty() || this.f39340N != null) {
            Map<AbstractC11297a.AbstractC0362a<?>, Object> map = cVar.f28434u;
            Map<AbstractC11297a.AbstractC0362a<?>, Object> map2 = this.f39340N;
            if (map2 != null) {
                for (Map.Entry<AbstractC11297a.AbstractC0362a<?>, Object> entry : map2.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map.size() == 1) {
                L0.f39340N = Collections.singletonMap(map.keySet().iterator().next(), map.values().iterator().next());
            } else {
                L0.f39340N = map;
            }
        }
        if (cVar.f28427n || mo6239p0() != null) {
            if (mo6239p0() != null) {
                yVar = mo6239p0();
            } else {
                yVar = this;
            }
            L0.m6248d1(yVar.mo6167c(c));
        }
        if (cVar.f28426m && !mo6162a().mo6249d().isEmpty()) {
            if (cVar.f28414a.mo22911f()) {
                Function0<Collection<AbstractC11397y>> function0 = this.f39336J;
                if (function0 != null) {
                    L0.f39336J = function0;
                } else {
                    L0.mo6272B0(mo6249d());
                }
            } else {
                L0.f39336J = new C12633a(c);
            }
        }
        return L0;
    }

    /* renamed from: Q0 */
    public boolean mo70Q0() {
        return this.f39333G;
    }

    /* renamed from: R0 */
    public AbstractC12632p mo6259R0(AbstractC11396x0 x0Var, AbstractC11396x0 x0Var2, List<AbstractC11396x0> list, List<? extends AbstractC11319f1> list2, List<AbstractC11335j1> list3, AbstractC7267g0 g0Var, EnumC11314e0 e0Var, AbstractC11387u uVar) {
        List<AbstractC11319f1> D0;
        List<AbstractC11335j1> D02;
        if (list == null) {
            m6267I(5);
        }
        if (list2 == null) {
            m6267I(6);
        }
        if (list3 == null) {
            m6267I(7);
        }
        if (uVar == null) {
            m6267I(8);
        }
        D0 = C9914r.m14790D0(list2);
        this.f28399o = D0;
        D02 = C9914r.m14790D0(list3);
        this.f28400p = D02;
        this.f28401q = g0Var;
        this.f28405u = e0Var;
        this.f28406v = uVar;
        this.f28403s = x0Var;
        this.f28404t = x0Var2;
        this.f28402r = list;
        for (int i = 0; i < list2.size(); i++) {
            AbstractC11319f1 f1Var = (AbstractC11319f1) list2.get(i);
            if (f1Var.getIndex() != i) {
                throw new IllegalStateException(f1Var + " index is " + f1Var.getIndex() + " but position is " + i);
            }
        }
        for (int i2 = 0; i2 < list3.size(); i2++) {
            AbstractC11335j1 j1Var = list3.get(i2);
            if (j1Var.getIndex() != i2 + 0) {
                throw new IllegalStateException(j1Var + "index is " + j1Var.getIndex() + " but position is " + i2);
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: S0 */
    public C12635c m6258S0(C7309p1 p1Var) {
        if (p1Var == null) {
            m6267I(24);
        }
        return new C12635c(this, p1Var.m22976j(), mo6104b(), mo6108s(), getVisibility(), mo6245g(), mo6242i(), mo6237u0(), mo6264M(), getReturnType(), null);
    }

    /* renamed from: U0 */
    public <V> void m6256U0(AbstractC11297a.AbstractC0362a<V> aVar, Object obj) {
        if (this.f39340N == null) {
            this.f39340N = new LinkedHashMap();
        }
        this.f39340N.put(aVar, obj);
    }

    @Override // p268og.AbstractC11310d0
    /* renamed from: V */
    public boolean mo6120V() {
        return this.f39329C;
    }

    /* renamed from: V0 */
    public void m6255V0(boolean z) {
        this.f39329C = z;
    }

    /* renamed from: W0 */
    public void m6254W0(boolean z) {
        this.f39328B = z;
    }

    /* renamed from: X0 */
    public void m6253X0(boolean z) {
        this.f28409y = z;
    }

    /* renamed from: Y0 */
    public void mo79Y0(boolean z) {
        this.f39333G = z;
    }

    /* renamed from: Z0 */
    public void mo78Z0(boolean z) {
        this.f39334H = z;
    }

    /* renamed from: c1 */
    public void m6250c1(boolean z) {
        this.f28408x = z;
    }

    /* renamed from: d */
    public Collection<? extends AbstractC11397y> mo6249d() {
        m6257T0();
        Collection<? extends AbstractC11397y> collection = this.f39335I;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            m6267I(14);
        }
        return collection;
    }

    @Override // p268og.AbstractC11297a
    /* renamed from: d0 */
    public boolean mo57d0() {
        return this.f39334H;
    }

    /* renamed from: e1 */
    public void m6247e1(boolean z) {
        this.f28410z = z;
    }

    /* renamed from: f1 */
    public void m6246f1(boolean z) {
        this.f28407w = z;
    }

    @Override // p268og.AbstractC11301b
    /* renamed from: g */
    public AbstractC11301b.EnumC11302a mo6245g() {
        AbstractC11301b.EnumC11302a aVar = this.f39338L;
        if (aVar == null) {
            m6267I(21);
        }
        return aVar;
    }

    /* renamed from: g1 */
    public void m6244g1(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m6267I(11);
        }
        this.f28401q = g0Var;
    }

    public AbstractC7267g0 getReturnType() {
        return this.f28401q;
    }

    @Override // p268og.AbstractC11297a
    public List<AbstractC11319f1> getTypeParameters() {
        List<AbstractC11319f1> list = this.f28399o;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // p268og.AbstractC11367q, p268og.AbstractC11310d0
    public AbstractC11387u getVisibility() {
        AbstractC11387u uVar = this.f28406v;
        if (uVar == null) {
            m6267I(16);
        }
        return uVar;
    }

    @Override // p268og.AbstractC11310d0
    /* renamed from: h0 */
    public boolean mo6114h0() {
        return this.f39328B;
    }

    /* renamed from: h1 */
    public void m6243h1(boolean z) {
        this.f39332F = z;
    }

    @Override // p268og.AbstractC11297a
    /* renamed from: i */
    public List<AbstractC11335j1> mo6242i() {
        List<AbstractC11335j1> list = this.f28400p;
        if (list == null) {
            m6267I(19);
        }
        return list;
    }

    /* renamed from: i1 */
    public void m6241i1(boolean z) {
        this.f39327A = z;
    }

    public boolean isExternal() {
        return this.f28409y;
    }

    @Override // p268og.AbstractC11397y
    public boolean isInfix() {
        if (this.f28408x) {
            return true;
        }
        for (AbstractC11397y yVar : mo6162a().mo6249d()) {
            if (yVar.isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.f28410z;
    }

    @Override // p268og.AbstractC11397y
    public boolean isOperator() {
        if (this.f28407w) {
            return true;
        }
        for (AbstractC11397y yVar : mo6162a().mo6249d()) {
            if (yVar.isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.f39332F;
    }

    /* renamed from: j1 */
    public void m6240j1(AbstractC11387u uVar) {
        if (uVar == null) {
            m6267I(10);
        }
        this.f28406v = uVar;
    }

    @Override // p268og.AbstractC11397y
    /* renamed from: p0 */
    public AbstractC11397y mo6239p0() {
        return this.f39339M;
    }

    @Override // p268og.AbstractC11310d0
    /* renamed from: s */
    public EnumC11314e0 mo6108s() {
        EnumC11314e0 e0Var = this.f28405u;
        if (e0Var == null) {
            m6267I(15);
        }
        return e0Var;
    }

    /* renamed from: s0 */
    public <V> V mo55s0(AbstractC11297a.AbstractC0362a<V> aVar) {
        Map<AbstractC11297a.AbstractC0362a<?>, Object> map = this.f39340N;
        if (map == null) {
            return null;
        }
        return (V) map.get(aVar);
    }

    /* renamed from: u */
    public AbstractC11397y.AbstractC11398a<? extends AbstractC11397y> mo6238u() {
        C12635c S0 = m6258S0(C7309p1.f15790b);
        if (S0 == null) {
            m6267I(23);
        }
        return S0;
    }

    @Override // p268og.AbstractC11297a
    /* renamed from: u0 */
    public List<AbstractC11396x0> mo6237u0() {
        List<AbstractC11396x0> list = this.f28402r;
        if (list == null) {
            m6267I(13);
        }
        return list;
    }

    @Override // p268og.AbstractC11397y, p268og.AbstractC11308c1
    /* renamed from: c */
    public AbstractC11397y mo6167c(C7309p1 p1Var) {
        if (p1Var == null) {
            m6267I(22);
        }
        return p1Var.m22975k() ? this : m6258S0(p1Var).mo6205h(mo6162a()).mo6202k().m6225J(true).build();
    }

    @Override // p324rg.AbstractC12616k, p324rg.AbstractC12612j, p268og.AbstractC11346m
    /* renamed from: a */
    public AbstractC11397y mo6162a() {
        AbstractC11397y yVar = this.f39337K;
        AbstractC11397y a = yVar == this ? this : yVar.mo6162a();
        if (a == null) {
            m6267I(20);
        }
        return a;
    }
}
