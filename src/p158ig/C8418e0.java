package p158ig;

import fi.AbstractC7267g0;
import fi.AbstractC7290k1;
import fi.C7322s1;
import fi.EnumC7338w1;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C9899f;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9972r;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9944c0;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import nf.C11084n;
import nf.C11088q;
import nf.C11089r;
import nf.EnumC11087p;
import p107fg.AbstractC7139c;
import p107fg.C7151j;
import p140hg.C8015b;
import p158ig.C8442j0;
import p268og.AbstractC11313e;
import p268og.AbstractC11316e1;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import p446yf.C14376a;
import ug.C13283d;

@Metadata(m15074d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010&¢\u0006\u0004\b'\u0010(J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0017\u0010\u0018R!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006*²\u0006\u0012\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a8\nX\u008a\u0084\u0002"}, m15073d2 = {"Lig/e0;", "Lkotlin/jvm/internal/r;", "Lfi/g0;", "type", "Lfg/c;", "m", "", "other", "", "equals", "", "hashCode", "", "toString", "k", "Lfi/g0;", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "Lig/j0$a;", "Ljava/lang/reflect/Type;", "l", "Lig/j0$a;", "computeJavaType", "d", "()Lfg/c;", "classifier", "", "Lfg/j;", "n", "j", "()Ljava/util/List;", "arguments", "c", "()Ljava/lang/reflect/Type;", "javaType", "b", "()Z", "isMarkedNullable", "Lkotlin/Function0;", "<init>", "(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/jvm/functions/Function0;)V", "parameterizedTypeArguments", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ig.e0 */
/* loaded from: classes8.dex */
public final class C8418e0 implements AbstractC9972r {

    /* renamed from: o */
    static final /* synthetic */ KProperty<Object>[] f18356o = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C8418e0.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C8418e0.class), "arguments", "getArguments()Ljava/util/List;"))};

    /* renamed from: k */
    private final AbstractC7267g0 f18357k;

    /* renamed from: l */
    private final C8442j0.C8443a<Type> f18358l;

    /* renamed from: m */
    private final C8442j0.C8443a f18359m;

    /* renamed from: n */
    private final C8442j0.C8443a f18360n;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"", "Lfg/j;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ig.e0$a */
    /* loaded from: classes8.dex */
    public static final class C8419a extends AbstractC9973s implements Function0<List<? extends C7151j>> {

        /* renamed from: l */
        final /* synthetic */ Function0<Type> f18362l;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m15073d2 = {"Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.e0$a$a */
        /* loaded from: classes8.dex */
        public static final class C0259a extends AbstractC9973s implements Function0<Type> {

            /* renamed from: k */
            final /* synthetic */ C8418e0 f18363k;

            /* renamed from: l */
            final /* synthetic */ int f18364l;

            /* renamed from: m */
            final /* synthetic */ Lazy<List<Type>> f18365m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0259a(C8418e0 e0Var, int i, Lazy<? extends List<? extends Type>> lazy) {
                super(0);
                this.f18363k = e0Var;
                this.f18364l = i;
                this.f18365m = lazy;
            }

            /* renamed from: a */
            public final Type invoke() {
                Object E;
                Object D;
                Class<?> cls;
                Type c = this.f18363k.mo14614c();
                if (c instanceof Class) {
                    Class cls2 = (Class) c;
                    if (cls2.isArray()) {
                        cls = cls2.getComponentType();
                    } else {
                        cls = Object.class;
                    }
                    C9971q.m14634f(cls, "{\n                      …                        }");
                    return cls;
                } else if (c instanceof GenericArrayType) {
                    if (this.f18364l == 0) {
                        Type genericComponentType = ((GenericArrayType) c).getGenericComponentType();
                        C9971q.m14634f(genericComponentType, "{\n                      …                        }");
                        return genericComponentType;
                    }
                    throw new C8430h0("Array type has been queried for a non-0th argument: " + this.f18363k);
                } else if (c instanceof ParameterizedType) {
                    Type type = (Type) C8419a.m19797b(this.f18365m).get(this.f18364l);
                    if (type instanceof WildcardType) {
                        WildcardType wildcardType = (WildcardType) type;
                        Type[] lowerBounds = wildcardType.getLowerBounds();
                        C9971q.m14634f(lowerBounds, "argument.lowerBounds");
                        E = C9899f.m14964E(lowerBounds);
                        Type type2 = (Type) E;
                        if (type2 == null) {
                            Type[] upperBounds = wildcardType.getUpperBounds();
                            C9971q.m14634f(upperBounds, "argument.upperBounds");
                            D = C9899f.m14966D(upperBounds);
                            type = (Type) D;
                        } else {
                            type = type2;
                        }
                    }
                    C9971q.m14634f(type, "{\n                      …                        }");
                    return type;
                } else {
                    throw new C8430h0("Non-generic type has been queried for arguments: " + this.f18363k);
                }
            }
        }

        @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* renamed from: ig.e0$a$b */
        /* loaded from: classes8.dex */
        public /* synthetic */ class C8420b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f18366a;

            static {
                int[] iArr = new int[EnumC7338w1.values().length];
                try {
                    iArr[EnumC7338w1.INVARIANT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC7338w1.IN_VARIANCE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC7338w1.OUT_VARIANCE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f18366a = iArr;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m15073d2 = {"<anonymous>", "", "Ljava/lang/reflect/Type;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* renamed from: ig.e0$a$c */
        /* loaded from: classes8.dex */
        public static final class C8421c extends AbstractC9973s implements Function0<List<? extends Type>> {

            /* renamed from: k */
            final /* synthetic */ C8418e0 f18367k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8421c(C8418e0 e0Var) {
                super(0);
                this.f18367k = e0Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Type> invoke() {
                Type c = this.f18367k.mo14614c();
                C9971q.m14636d(c);
                return C13283d.m4050d(c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C8419a(Function0<? extends Type> function0) {
            super(0);
            this.f18362l = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final List<Type> m19797b(Lazy<? extends List<? extends Type>> lazy) {
            return (List) lazy.getValue();
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends C7151j> invoke() {
            Lazy b;
            int t;
            C7151j jVar;
            List<? extends C7151j> i;
            List<AbstractC7290k1> L0 = C8418e0.this.m19799o().mo5174L0();
            if (L0.isEmpty()) {
                i = C9906j.m14820i();
                return i;
            }
            b = C11084n.m10944b(EnumC11087p.PUBLICATION, new C8421c(C8418e0.this));
            Function0<Type> function0 = this.f18362l;
            C8418e0 e0Var = C8418e0.this;
            t = C9907k.m14809t(L0, 10);
            ArrayList arrayList = new ArrayList(t);
            int i2 = 0;
            for (Object obj : L0) {
                i2++;
                if (i2 < 0) {
                    C9906j.m14810s();
                }
                AbstractC7290k1 k1Var = (AbstractC7290k1) obj;
                if (k1Var.mo22907a()) {
                    jVar = C7151j.f15543c.m23331c();
                } else {
                    AbstractC7267g0 type = k1Var.getType();
                    C9971q.m14634f(type, "typeProjection.type");
                    C8418e0 e0Var2 = new C8418e0(type, function0 == null ? null : new C0259a(e0Var, i2, b));
                    int i3 = C8420b.f18366a[k1Var.mo22906b().ordinal()];
                    if (i3 == 1) {
                        jVar = C7151j.f15543c.m23330d(e0Var2);
                    } else if (i3 == 2) {
                        jVar = C7151j.f15543c.m23333a(e0Var2);
                    } else if (i3 == 3) {
                        jVar = C7151j.f15543c.m23332b(e0Var2);
                    } else {
                        throw new C11088q();
                    }
                }
                arrayList.add(jVar);
            }
            return arrayList;
        }
    }

    @Metadata(m15074d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m15073d2 = {"Lfg/c;", "a", "()Lfg/c;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ig.e0$b */
    /* loaded from: classes8.dex */
    static final class C8422b extends AbstractC9973s implements Function0<AbstractC7139c> {
        C8422b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC7139c invoke() {
            C8418e0 e0Var = C8418e0.this;
            return e0Var.m19800m(e0Var.m19799o());
        }
    }

    public C8418e0(AbstractC7267g0 type, Function0<? extends Type> function0) {
        C9971q.m14633g(type, "type");
        this.f18357k = type;
        C8442j0.C8443a<Type> aVar = null;
        C8442j0.C8443a<Type> aVar2 = function0 instanceof C8442j0.C8443a ? (C8442j0.C8443a) function0 : null;
        if (aVar2 != null) {
            aVar = aVar2;
        } else if (function0 != null) {
            aVar = C8442j0.m19768d(function0);
        }
        this.f18358l = aVar;
        this.f18359m = C8442j0.m19768d(new C8422b());
        this.f18360n = C8442j0.m19768d(new C8419a(function0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final AbstractC7139c m19800m(AbstractC7267g0 g0Var) {
        Object t0;
        AbstractC7267g0 type;
        AbstractC11326h p = g0Var.mo5172N0().mo4565p();
        if (p instanceof AbstractC11313e) {
            Class<?> p2 = C8503p0.m19644p((AbstractC11313e) p);
            if (p2 == null) {
                return null;
            }
            if (p2.isArray()) {
                t0 = C9914r.m14745t0(g0Var.mo5174L0());
                AbstractC7290k1 k1Var = (AbstractC7290k1) t0;
                if (k1Var == null || (type = k1Var.getType()) == null) {
                    return new C8466m(p2);
                }
                AbstractC7139c m = m19800m(type);
                if (m != null) {
                    return new C8466m(C8503p0.m19654f(C14376a.m737b(C8015b.m20854a(m))));
                }
                throw new C8430h0("Cannot determine classifier for array element type: " + this);
            } else if (C7322s1.m22935l(g0Var)) {
                return new C8466m(p2);
            } else {
                Class<?> e = C13283d.m4049e(p2);
                if (e != null) {
                    p2 = e;
                }
                return new C8466m(p2);
            }
        } else if (p instanceof AbstractC11319f1) {
            return new C8424f0(null, (AbstractC11319f1) p);
        } else {
            if (!(p instanceof AbstractC11316e1)) {
                return null;
            }
            throw new C11089r("An operation is not implemented: Type alias classifiers are not yet supported");
        }
    }

    @Override // kotlin.reflect.KType
    /* renamed from: b */
    public boolean mo14595b() {
        return this.f18357k.mo5171O0();
    }

    @Override // kotlin.jvm.internal.AbstractC9972r
    /* renamed from: c */
    public Type mo14614c() {
        C8442j0.C8443a<Type> aVar = this.f18358l;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    @Override // kotlin.reflect.KType
    /* renamed from: d */
    public AbstractC7139c mo14594d() {
        return (AbstractC7139c) this.f18359m.m19764b(this, f18356o[0]);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8418e0) {
            C8418e0 e0Var = (C8418e0) obj;
            if (C9971q.m14638b(this.f18357k, e0Var.f18357k) && C9971q.m14638b(mo14594d(), e0Var.mo14594d()) && C9971q.m14638b(mo14593j(), e0Var.mo14593j())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f18357k.hashCode() * 31;
        AbstractC7139c d = mo14594d();
        return ((hashCode + (d != null ? d.hashCode() : 0)) * 31) + mo14593j().hashCode();
    }

    @Override // kotlin.reflect.KType
    /* renamed from: j */
    public List<C7151j> mo14593j() {
        T b = this.f18360n.m19764b(this, f18356o[1]);
        C9971q.m14634f(b, "<get-arguments>(...)");
        return (List) b;
    }

    /* renamed from: o */
    public final AbstractC7267g0 m19799o() {
        return this.f18357k;
    }

    public String toString() {
        return C8462l0.f18419a.m19730h(this.f18357k);
    }

    public /* synthetic */ C8418e0(AbstractC7267g0 g0Var, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(g0Var, (i & 2) != 0 ? null : function0);
    }
}
