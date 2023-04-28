package p158ig;

import fi.AbstractC7267g0;
import gg.C7589a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C9899f;
import kotlin.collections.C9907k;
import kotlin.collections.C9910n;
import kotlin.collections.C9914r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KCallable;
import kotlin.reflect.KType;
import kotlin.reflect.KVisibility;
import p107fg.AbstractC7144f;
import p107fg.AbstractC7150i;
import p140hg.C8015b;
import p140hg.C8016c;
import p158ig.C8442j0;
import p180jg.AbstractC9579e;
import p268og.AbstractC11301b;
import p268og.AbstractC11319f1;
import p268og.AbstractC11335j1;
import p268og.AbstractC11370r0;
import p268og.AbstractC11387u;
import p268og.AbstractC11396x0;
import p268og.AbstractC11397y;
import p268og.EnumC11314e0;
import p303qf.C12120c;
import p446yf.C14376a;
import p467zg.AbstractC14646a;

@Metadata(m15074d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\bM\u0010NJ%\u0010\b\u001a\u00028\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J'\u0010\u0010\u001a\u00028\u00002\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u000f\"\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0012\u001a\u00028\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\tJ3\u0010\u0015\u001a\u00028\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R.\u0010\u001d\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0019 \u001a*\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00180\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR.\u0010 \u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u001a*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001e0\u001e0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\"\u0010#\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010!0!0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001cR.\u0010&\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020$ \u001a*\n\u0012\u0004\u0012\u00020$\u0018\u00010\u00180\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001cR\u0018\u0010*\u001a\u0006\u0012\u0002\b\u00030'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001a\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0014\u00100\u001a\u00020-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00106R\u0014\u0010<\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020=0\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u00106R\u0016\u0010C\u001a\u0004\u0018\u00010@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010D\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u00103R\u0014\u0010E\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u00103R\u0014\u0010F\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u00103R\u0014\u0010H\u001a\u0002018DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bG\u00103R\u0014\u0010L\u001a\u00020I8&X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006O"}, m15073d2 = {"Lig/l;", "R", "Lkotlin/reflect/KCallable;", "Lig/g0;", "", "Lfg/f;", "", "args", "o", "(Ljava/util/Map;)Ljava/lang/Object;", "Lkotlin/reflect/KType;", "type", "r", "Ljava/lang/reflect/Type;", "s", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "callBy", "Lkotlin/coroutines/Continuation;", "continuationArgument", "q", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lig/j0$a;", "", "", "kotlin.jvm.PlatformType", "k", "Lig/j0$a;", "_annotations", "Ljava/util/ArrayList;", "l", "_parameters", "Lig/e0;", "m", "_returnType", "Lig/f0;", "n", "_typeParameters", "Ljg/e;", "u", "()Ljg/e;", "caller", "w", "defaultCaller", "Lig/p;", "v", "()Lig/p;", "container", "", "z", "()Z", "isBound", "getAnnotations", "()Ljava/util/List;", "annotations", "getParameters", "parameters", "getReturnType", "()Lkotlin/reflect/KType;", "returnType", "Lfg/i;", "getTypeParameters", "typeParameters", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "visibility", "isFinal", "isOpen", "isAbstract", "y", "isAnnotationConstructor", "Log/b;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "<init>", "()V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ig.l */
/* loaded from: classes8.dex */
public abstract class AbstractC8453l<R> implements KCallable<R>, AbstractC8428g0 {

    /* renamed from: k */
    private final C8442j0.C8443a<List<Annotation>> f18406k;

    /* renamed from: l */
    private final C8442j0.C8443a<ArrayList<AbstractC7144f>> f18407l;

    /* renamed from: m */
    private final C8442j0.C8443a<C8418e0> f18408m;

    /* renamed from: n */
    private final C8442j0.C8443a<List<C8424f0>> f18409n;

    @Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0004 \u0001H\n¢\u0006\u0002\b\u0005"}, m15073d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "R", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: ig.l$a */
    /* loaded from: classes8.dex */
    static final class C8454a extends AbstractC9973s implements Function0<List<? extends Annotation>> {

        /* renamed from: k */
        final /* synthetic */ AbstractC8453l<R> f18410k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C8454a(AbstractC8453l<? extends R> lVar) {
            super(0);
            this.f18410k = lVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Annotation> invoke() {
            return C8503p0.m19655e(this.f18410k.mo19626x());
        }
    }

    @Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"R", "Ljava/util/ArrayList;", "Lfg/f;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/ArrayList;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ig.l$b */
    /* loaded from: classes8.dex */
    static final class C8455b extends AbstractC9973s implements Function0<ArrayList<AbstractC7144f>> {

        /* renamed from: k */
        final /* synthetic */ AbstractC8453l<R> f18411k;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m15073d2 = {"R", "Log/r0;", "a", "()Log/r0;"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.l$b$a */
        /* loaded from: classes8.dex */
        public static final class C8456a extends AbstractC9973s implements Function0<AbstractC11370r0> {

            /* renamed from: k */
            final /* synthetic */ AbstractC11396x0 f18412k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8456a(AbstractC11396x0 x0Var) {
                super(0);
                this.f18412k = x0Var;
            }

            /* renamed from: a */
            public final AbstractC11370r0 invoke() {
                return this.f18412k;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m15073d2 = {"R", "Log/r0;", "a", "()Log/r0;"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.l$b$b */
        /* loaded from: classes8.dex */
        public static final class C0261b extends AbstractC9973s implements Function0<AbstractC11370r0> {

            /* renamed from: k */
            final /* synthetic */ AbstractC11396x0 f18413k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0261b(AbstractC11396x0 x0Var) {
                super(0);
                this.f18413k = x0Var;
            }

            /* renamed from: a */
            public final AbstractC11370r0 invoke() {
                return this.f18413k;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m15073d2 = {"R", "Log/r0;", "a", "()Log/r0;"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.l$b$c */
        /* loaded from: classes8.dex */
        public static final class C8457c extends AbstractC9973s implements Function0<AbstractC11370r0> {

            /* renamed from: k */
            final /* synthetic */ AbstractC11301b f18414k;

            /* renamed from: l */
            final /* synthetic */ int f18415l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8457c(AbstractC11301b bVar, int i) {
                super(0);
                this.f18414k = bVar;
                this.f18415l = i;
            }

            /* renamed from: a */
            public final AbstractC11370r0 invoke() {
                AbstractC11335j1 j1Var = this.f18414k.mo6242i().get(this.f18415l);
                C9971q.m14634f(j1Var, "descriptor.valueParameters[i]");
                return j1Var;
            }
        }

        @Metadata(m15074d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m15073d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.l$b$d */
        /* loaded from: classes8.dex */
        public static final class C8458d<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int d;
                d = C12120c.m7778d(((AbstractC7144f) t).getName(), ((AbstractC7144f) t2).getName());
                return d;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C8455b(AbstractC8453l<? extends R> lVar) {
            super(0);
            this.f18411k = lVar;
        }

        /* renamed from: a */
        public final ArrayList<AbstractC7144f> invoke() {
            int i;
            AbstractC11301b x = this.f18411k.mo19626x();
            ArrayList<AbstractC7144f> arrayList = new ArrayList<>();
            int i2 = 0;
            if (!this.f18411k.mo19625z()) {
                AbstractC11396x0 i3 = C8503p0.m19651i(x);
                if (i3 != null) {
                    arrayList.add(new C8527w(this.f18411k, 0, AbstractC7144f.EnumC7145a.INSTANCE, new C8456a(i3)));
                    i = 1;
                } else {
                    i = 0;
                }
                AbstractC11396x0 M = x.mo6264M();
                if (M != null) {
                    arrayList.add(new C8527w(this.f18411k, i, AbstractC7144f.EnumC7145a.EXTENSION_RECEIVER, new C0261b(M)));
                    i++;
                }
            } else {
                i = 0;
            }
            int size = x.mo6242i().size();
            while (i2 < size) {
                arrayList.add(new C8527w(this.f18411k, i, AbstractC7144f.EnumC7145a.VALUE, new C8457c(x, i2)));
                i2++;
                i++;
            }
            if (this.f18411k.m19744y() && (x instanceof AbstractC14646a) && arrayList.size() > 1) {
                C9910n.m14805x(arrayList, new C8458d());
            }
            arrayList.trimToSize();
            return arrayList;
        }
    }

    @Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"R", "Lig/e0;", "kotlin.jvm.PlatformType", "a", "()Lig/e0;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ig.l$c */
    /* loaded from: classes8.dex */
    static final class C8459c extends AbstractC9973s implements Function0<C8418e0> {

        /* renamed from: k */
        final /* synthetic */ AbstractC8453l<R> f18416k;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m15073d2 = {"R", "Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.l$c$a */
        /* loaded from: classes8.dex */
        public static final class C8460a extends AbstractC9973s implements Function0<Type> {

            /* renamed from: k */
            final /* synthetic */ AbstractC8453l<R> f18417k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C8460a(AbstractC8453l<? extends R> lVar) {
                super(0);
                this.f18417k = lVar;
            }

            /* renamed from: a */
            public final Type invoke() {
                Type s = this.f18417k.m19745s();
                return s == null ? this.f18417k.mo19629u().getReturnType() : s;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C8459c(AbstractC8453l<? extends R> lVar) {
            super(0);
            this.f18416k = lVar;
        }

        /* renamed from: a */
        public final C8418e0 invoke() {
            AbstractC7267g0 returnType = this.f18416k.mo19626x().getReturnType();
            C9971q.m14636d(returnType);
            return new C8418e0(returnType, new C8460a(this.f18416k));
        }
    }

    @Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"R", "", "Lig/f0;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ig.l$d */
    /* loaded from: classes8.dex */
    static final class C8461d extends AbstractC9973s implements Function0<List<? extends C8424f0>> {

        /* renamed from: k */
        final /* synthetic */ AbstractC8453l<R> f18418k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C8461d(AbstractC8453l<? extends R> lVar) {
            super(0);
            this.f18418k = lVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends C8424f0> invoke() {
            int t;
            List<AbstractC11319f1> typeParameters = this.f18418k.mo19626x().getTypeParameters();
            C9971q.m14634f(typeParameters, "descriptor.typeParameters");
            AbstractC8453l<R> lVar = this.f18418k;
            t = C9907k.m14809t(typeParameters, 10);
            ArrayList arrayList = new ArrayList(t);
            for (AbstractC11319f1 descriptor : typeParameters) {
                C9971q.m14634f(descriptor, "descriptor");
                arrayList.add(new C8424f0(lVar, descriptor));
            }
            return arrayList;
        }
    }

    public AbstractC8453l() {
        C8442j0.C8443a<List<Annotation>> d = C8442j0.m19768d(new C8454a(this));
        C9971q.m14634f(d, "lazySoft { descriptor.computeAnnotations() }");
        this.f18406k = d;
        C8442j0.C8443a<ArrayList<AbstractC7144f>> d2 = C8442j0.m19768d(new C8455b(this));
        C9971q.m14634f(d2, "lazySoft {\n        val d…ze()\n        result\n    }");
        this.f18407l = d2;
        C8442j0.C8443a<C8418e0> d3 = C8442j0.m19768d(new C8459c(this));
        C9971q.m14634f(d3, "lazySoft {\n        KType…eturnType\n        }\n    }");
        this.f18408m = d3;
        C8442j0.C8443a<List<C8424f0>> d4 = C8442j0.m19768d(new C8461d(this));
        C9971q.m14634f(d4, "lazySoft {\n        descr…this, descriptor) }\n    }");
        this.f18409n = d4;
    }

    /* renamed from: o */
    private final R m19748o(Map<AbstractC7144f, ? extends Object> map) {
        int t;
        Object obj;
        List<AbstractC7144f> parameters = getParameters();
        t = C9907k.m14809t(parameters, 10);
        ArrayList arrayList = new ArrayList(t);
        for (AbstractC7144f fVar : parameters) {
            if (map.containsKey(fVar)) {
                obj = map.get(fVar);
                if (obj == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + fVar + ')');
                }
            } else if (fVar.mo19583n()) {
                obj = null;
            } else if (fVar.mo19587a()) {
                obj = m19746r(fVar.getType());
            } else {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + fVar);
            }
            arrayList.add(obj);
        }
        AbstractC9579e<?> w = mo19627w();
        if (w != null) {
            try {
                return (R) w.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e) {
                throw new C7589a(e);
            }
        } else {
            throw new C8430h0("This callable does not support a default call: " + mo19626x());
        }
    }

    /* renamed from: r */
    private final Object m19746r(KType kType) {
        Class b = C14376a.m737b(C8015b.m20853b(kType));
        if (b.isArray()) {
            Object newInstance = Array.newInstance(b.getComponentType(), 0);
            C9971q.m14634f(newInstance, "type.jvmErasure.java.run…\"\n            )\n        }");
            return newInstance;
        }
        throw new C8430h0("Cannot instantiate the default empty array of type " + b.getSimpleName() + ", because it is not an array type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final Type m19745s() {
        AbstractC11397y yVar;
        Object i0;
        ParameterizedType parameterizedType;
        Type type;
        Object h0;
        WildcardType wildcardType;
        Type[] lowerBounds;
        Object D;
        AbstractC11301b x = mo19626x();
        if (x instanceof AbstractC11397y) {
            yVar = (AbstractC11397y) x;
        } else {
            yVar = null;
        }
        boolean z = false;
        if (yVar != null && yVar.isSuspend()) {
            z = true;
        }
        if (!z) {
            return null;
        }
        i0 = C9914r.m14756i0(mo19629u().mo15932a());
        if (i0 instanceof ParameterizedType) {
            parameterizedType = (ParameterizedType) i0;
        } else {
            parameterizedType = null;
        }
        if (parameterizedType != null) {
            type = parameterizedType.getRawType();
        } else {
            type = null;
        }
        if (!C9971q.m14638b(type, Continuation.class)) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C9971q.m14634f(actualTypeArguments, "continuationType.actualTypeArguments");
        h0 = C9899f.m14929h0(actualTypeArguments);
        if (h0 instanceof WildcardType) {
            wildcardType = (WildcardType) h0;
        } else {
            wildcardType = null;
        }
        if (wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null) {
            return null;
        }
        D = C9899f.m14966D(lowerBounds);
        return (Type) D;
    }

    @Override // kotlin.reflect.KCallable
    public R call(Object... args) {
        C9971q.m14633g(args, "args");
        try {
            return (R) mo19629u().call(args);
        } catch (IllegalAccessException e) {
            throw new C7589a(e);
        }
    }

    @Override // kotlin.reflect.KCallable
    public R callBy(Map<AbstractC7144f, ? extends Object> args) {
        C9971q.m14633g(args, "args");
        if (m19744y()) {
            return m19748o(args);
        }
        return m19747q(args, null);
    }

    @Override // p107fg.AbstractC7138b
    public List<Annotation> getAnnotations() {
        List<Annotation> invoke = this.f18406k.invoke();
        C9971q.m14634f(invoke, "_annotations()");
        return invoke;
    }

    @Override // kotlin.reflect.KCallable
    public List<AbstractC7144f> getParameters() {
        ArrayList<AbstractC7144f> invoke = this.f18407l.invoke();
        C9971q.m14634f(invoke, "_parameters()");
        return invoke;
    }

    @Override // kotlin.reflect.KCallable
    public KType getReturnType() {
        C8418e0 invoke = this.f18408m.invoke();
        C9971q.m14634f(invoke, "_returnType()");
        return invoke;
    }

    @Override // kotlin.reflect.KCallable
    public List<AbstractC7150i> getTypeParameters() {
        List<C8424f0> invoke = this.f18409n.invoke();
        C9971q.m14634f(invoke, "_typeParameters()");
        return invoke;
    }

    @Override // kotlin.reflect.KCallable
    public KVisibility getVisibility() {
        AbstractC11387u visibility = mo19626x().getVisibility();
        C9971q.m14634f(visibility, "descriptor.visibility");
        return C8503p0.m19643q(visibility);
    }

    @Override // kotlin.reflect.KCallable
    public boolean isAbstract() {
        return mo19626x().mo6108s() == EnumC11314e0.ABSTRACT;
    }

    @Override // kotlin.reflect.KCallable
    public boolean isFinal() {
        return mo19626x().mo6108s() == EnumC11314e0.FINAL;
    }

    @Override // kotlin.reflect.KCallable
    public boolean isOpen() {
        return mo19626x().mo6108s() == EnumC11314e0.OPEN;
    }

    /* renamed from: q */
    public final R m19747q(Map<AbstractC7144f, ? extends Object> args, Continuation<?> continuation) {
        C9971q.m14633g(args, "args");
        List<AbstractC7144f> parameters = getParameters();
        ArrayList arrayList = new ArrayList(parameters.size());
        ArrayList arrayList2 = new ArrayList(1);
        Iterator<AbstractC7144f> it = parameters.iterator();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (true) {
            Object obj = null;
            if (it.hasNext()) {
                AbstractC7144f next = it.next();
                if (i != 0 && i % 32 == 0) {
                    arrayList2.add(Integer.valueOf(i2));
                    i2 = 0;
                }
                if (args.containsKey(next)) {
                    arrayList.add(args.get(next));
                } else if (next.mo19583n()) {
                    if (!C8503p0.m19649k(next.getType())) {
                        obj = C8503p0.m19653g(C8016c.m20847f(next.getType()));
                    }
                    arrayList.add(obj);
                    i2 = (1 << (i % 32)) | i2;
                    z = true;
                } else if (next.mo19587a()) {
                    arrayList.add(m19746r(next.getType()));
                } else {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + next);
                }
                if (next.mo19586g() == AbstractC7144f.EnumC7145a.VALUE) {
                    i++;
                }
            } else {
                if (continuation != null) {
                    arrayList.add(continuation);
                }
                if (!z) {
                    Object[] array = arrayList.toArray(new Object[0]);
                    return call(Arrays.copyOf(array, array.length));
                }
                arrayList2.add(Integer.valueOf(i2));
                AbstractC9579e<?> w = mo19627w();
                if (w != null) {
                    arrayList.addAll(arrayList2);
                    arrayList.add(null);
                    try {
                        return (R) w.call(arrayList.toArray(new Object[0]));
                    } catch (IllegalAccessException e) {
                        throw new C7589a(e);
                    }
                } else {
                    throw new C8430h0("This callable does not support a default call: " + mo19626x());
                }
            }
        }
    }

    /* renamed from: u */
    public abstract AbstractC9579e<?> mo19629u();

    /* renamed from: v */
    public abstract AbstractC8494p mo19628v();

    /* renamed from: w */
    public abstract AbstractC9579e<?> mo19627w();

    /* renamed from: x */
    public abstract AbstractC11301b mo19626x();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean m19744y() {
        return C9971q.m14638b(getName(), "<init>") && mo19628v().mo14611i().isAnnotation();
    }

    /* renamed from: z */
    public abstract boolean mo19625z();
}
