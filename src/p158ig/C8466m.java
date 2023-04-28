package p158ig;

import bi.C3604w;
import fi.AbstractC7267g0;
import fi.AbstractC7304o0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kh.C9877e;
import kotlin.Metadata;
import kotlin.collections.C9899f;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9944c0;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9964l0;
import kotlin.jvm.internal.C9965m;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import nf.C11088q;
import p070di.C6467d;
import p141hh.C8019a;
import p158ig.AbstractC8494p;
import p158ig.C8442j0;
import p159ih.C8544c;
import p159ih.C8581n;
import p217lg.AbstractC10420h;
import p217lg.C10414c;
import p217lg.C10415d;
import p218lh.C10440a;
import p249nh.C11136b;
import p249nh.C11137c;
import p249nh.C11142f;
import p268og.AbstractC11309d;
import p268og.AbstractC11313e;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import p268og.AbstractC11343l;
import p268og.AbstractC11346m;
import p268og.AbstractC11388u0;
import p268og.AbstractC11397y;
import p268og.C11393x;
import p268og.EnumC11317f;
import p286pi.C11754a;
import p325rh.C12661e;
import p326ri.C12718u;
import p326ri.C12719v;
import p388vh.C13508c;
import p406wg.EnumC13881d;
import p446yf.C14376a;
import p448yh.AbstractC14411h;
import p448yh.AbstractC14416k;
import ph.AbstractC11702i;
import tg.C13086f;
import tg.C13092k;
import ug.C13283d;

@Metadata(m15074d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00052\u00020\u0006:\u0001BB\u0015\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b@\u0010AJ\b\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0016J\u0013\u0010\u0017\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016R \u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR9\u0010(\u001a$\u0012 \u0012\u001e #*\u000e\u0018\u00010\"R\b\u0012\u0004\u0012\u00028\u00000\u00000\"R\b\u0012\u0004\u0012\u00028\u00000\u00000!8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020)0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0016\u0010/\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u00101\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010.R\u0014\u00105\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020:8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010<¨\u0006C"}, m15073d2 = {"Lig/m;", "", "T", "Lig/p;", "Lkotlin/reflect/KClass;", "Lig/n;", "Lig/g0;", "", "R", "Lnh/f;", "name", "", "Log/u0;", "D", "Log/y;", "z", "", "index", "A", "value", "", "e", "other", "equals", "hashCode", "", "toString", "Ljava/lang/Class;", "n", "Ljava/lang/Class;", "i", "()Ljava/lang/Class;", "jClass", "Lig/j0$b;", "Lig/m$a;", "kotlin.jvm.PlatformType", "o", "Lig/j0$b;", "N", "()Lig/j0$b;", "data", "Log/l;", "y", "()Ljava/util/Collection;", "constructorDescriptors", "l", "()Ljava/lang/String;", "simpleName", "k", "qualifiedName", "Lnh/b;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "classId", "Log/e;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "Lyh/h;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "memberScope", "getStaticScope$kotlin_reflection", "staticScope", "<init>", "(Ljava/lang/Class;)V", "a", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ig.m */
/* loaded from: classes8.dex */
public final class C8466m<T> extends AbstractC8494p implements KClass<T>, AbstractC8489n, AbstractC8428g0 {

    /* renamed from: n */
    private final Class<T> f18424n;

    /* renamed from: o */
    private final C8442j0.C8444b<C8466m<T>.C8467a> f18425o;

    @Metadata(m15074d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\bG\u0010HJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002R\u001b\u0010\f\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u0014R-\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\u00198FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\t\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR%\u0010$\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030!0\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\t\u001a\u0004\b#\u0010\u001dR#\u0010*\u001a\u0004\u0018\u00018\u00008FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010\u001f\u001a\u0004\b'\u0010(R!\u0010.\u001a\b\u0012\u0004\u0012\u00020+0\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\t\u001a\u0004\b-\u0010\u0011R!\u00102\u001a\b\u0012\u0004\u0012\u00020/0\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\t\u001a\u0004\b1\u0010\u0011R)\u00105\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000!0\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\t\u001a\u0004\b4\u0010\u0011R%\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\"\u0010\u001dR%\u00108\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b%\u0010\u001dR%\u0010:\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\t\u001a\u0004\b0\u0010\u001dR%\u0010<\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\t\u001a\u0004\b3\u0010\u001dR%\u0010>\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\t\u001a\u0004\b\u0016\u0010\u001dR%\u0010@\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\t\u001a\u0004\b\u001b\u0010\u001dR%\u0010C\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\t\u001a\u0004\bB\u0010\u001dR%\u0010F\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bD\u0010\t\u001a\u0004\bE\u0010\u001d¨\u0006I"}, m15073d2 = {"Lig/m$a;", "Lig/p$b;", "Lig/p;", "Ljava/lang/Class;", "jClass", "", "f", "Log/e;", "d", "Lig/j0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "", "", "e", "getAnnotations", "()Ljava/util/List;", "annotations", "o", "()Ljava/lang/String;", "simpleName", "g", "n", "qualifiedName", "", "Lkotlin/reflect/KFunction;", "h", "getConstructors", "()Ljava/util/Collection;", "getConstructors$annotations", "()V", "constructors", "Lkotlin/reflect/KClass;", "i", "getNestedClasses", "nestedClasses", "j", "Lig/j0$b;", "getObjectInstance", "()Ljava/lang/Object;", "getObjectInstance$annotations", "objectInstance", "Lfg/i;", "k", "getTypeParameters", "typeParameters", "Lkotlin/reflect/KType;", "l", "getSupertypes", "supertypes", "m", "getSealedSubclasses", "sealedSubclasses", "Lig/l;", "declaredNonStaticMembers", "declaredStaticMembers", "p", "inheritedNonStaticMembers", "q", "inheritedStaticMembers", "r", "allNonStaticMembers", "s", "allStaticMembers", "t", "getDeclaredMembers", "declaredMembers", "u", "getAllMembers", "allMembers", "<init>", "(Lig/m;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ig.m$a */
    /* loaded from: classes8.dex */
    public final class C8467a extends AbstractC8494p.AbstractC8496b {

        /* renamed from: w */
        static final /* synthetic */ KProperty<Object>[] f18426w = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C8467a.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C8467a.class), "annotations", "getAnnotations()Ljava/util/List;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C8467a.class), "simpleName", "getSimpleName()Ljava/lang/String;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C8467a.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C8467a.class), "constructors", "getConstructors()Ljava/util/Collection;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C8467a.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C8467a.class), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C8467a.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C8467a.class), "supertypes", "getSupertypes()Ljava/util/List;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C8467a.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C8467a.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C8467a.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C8467a.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C8467a.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C8467a.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C8467a.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C8467a.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C8467a.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};

        /* renamed from: d */
        private final C8442j0.C8443a f18427d;

        /* renamed from: f */
        private final C8442j0.C8443a f18429f;

        /* renamed from: g */
        private final C8442j0.C8443a f18430g;

        /* renamed from: h */
        private final C8442j0.C8443a f18431h;

        /* renamed from: j */
        private final C8442j0.C8444b f18433j;

        /* renamed from: k */
        private final C8442j0.C8443a f18434k;

        /* renamed from: l */
        private final C8442j0.C8443a f18435l;

        /* renamed from: n */
        private final C8442j0.C8443a f18437n;

        /* renamed from: o */
        private final C8442j0.C8443a f18438o;

        /* renamed from: p */
        private final C8442j0.C8443a f18439p;

        /* renamed from: q */
        private final C8442j0.C8443a f18440q;

        /* renamed from: e */
        private final C8442j0.C8443a f18428e = C8442j0.m19768d(new C8470d(this));

        /* renamed from: i */
        private final C8442j0.C8443a f18432i = C8442j0.m19768d(new C8478l(this));

        /* renamed from: m */
        private final C8442j0.C8443a f18436m = C8442j0.m19768d(new C8480o(this));

        /* renamed from: r */
        private final C8442j0.C8443a f18441r = C8442j0.m19768d(new C8468b(this));

        /* renamed from: s */
        private final C8442j0.C8443a f18442s = C8442j0.m19768d(new C8469c(this));

        /* renamed from: t */
        private final C8442j0.C8443a f18443t = C8442j0.m19768d(new C8472f(this));

        /* renamed from: u */
        private final C8442j0.C8443a f18444u = C8442j0.m19768d(new C0262a(this));

        @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m15073d2 = {"", "T", "", "Lig/l;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.m$a$a */
        /* loaded from: classes8.dex */
        static final class C0262a extends AbstractC9973s implements Function0<List<? extends AbstractC8453l<?>>> {

            /* renamed from: k */
            final /* synthetic */ C8466m<T>.C8467a f18446k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0262a(C8466m<T>.C8467a aVar) {
                super(0);
                this.f18446k = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AbstractC8453l<?>> invoke() {
                List<? extends AbstractC8453l<?>> o0;
                o0 = C9914r.m14750o0(this.f18446k.m19714g(), this.f18446k.m19713h());
                return o0;
            }
        }

        @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m15073d2 = {"", "T", "", "Lig/l;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.m$a$b */
        /* loaded from: classes8.dex */
        static final class C8468b extends AbstractC9973s implements Function0<List<? extends AbstractC8453l<?>>> {

            /* renamed from: k */
            final /* synthetic */ C8466m<T>.C8467a f18447k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8468b(C8466m<T>.C8467a aVar) {
                super(0);
                this.f18447k = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AbstractC8453l<?>> invoke() {
                List<? extends AbstractC8453l<?>> o0;
                o0 = C9914r.m14750o0(this.f18447k.m19712i(), this.f18447k.m19709l());
                return o0;
            }
        }

        @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m15073d2 = {"", "T", "", "Lig/l;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.m$a$c */
        /* loaded from: classes8.dex */
        static final class C8469c extends AbstractC9973s implements Function0<List<? extends AbstractC8453l<?>>> {

            /* renamed from: k */
            final /* synthetic */ C8466m<T>.C8467a f18448k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8469c(C8466m<T>.C8467a aVar) {
                super(0);
                this.f18448k = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AbstractC8453l<?>> invoke() {
                List<? extends AbstractC8453l<?>> o0;
                o0 = C9914r.m14750o0(this.f18448k.m19711j(), this.f18448k.m19708m());
                return o0;
            }
        }

        @Metadata(m15074d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m15073d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "T", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* renamed from: ig.m$a$d */
        /* loaded from: classes8.dex */
        static final class C8470d extends AbstractC9973s implements Function0<List<? extends Annotation>> {

            /* renamed from: k */
            final /* synthetic */ C8466m<T>.C8467a f18449k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8470d(C8466m<T>.C8467a aVar) {
                super(0);
                this.f18449k = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Annotation> invoke() {
                return C8503p0.m19655e(this.f18449k.m19710k());
            }
        }

        @Metadata(m15074d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m15073d2 = {"<anonymous>", "", "Lkotlin/reflect/KFunction;", "T", "kotlin.jvm.PlatformType", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* renamed from: ig.m$a$e */
        /* loaded from: classes8.dex */
        static final class C8471e extends AbstractC9973s implements Function0<List<? extends KFunction<? extends T>>> {

            /* renamed from: k */
            final /* synthetic */ C8466m<T> f18450k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8471e(C8466m<T> mVar) {
                super(0);
                this.f18450k = mVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<KFunction<T>> invoke() {
                int t;
                Collection<AbstractC11343l> y = this.f18450k.mo19601y();
                C8466m<T> mVar = this.f18450k;
                t = C9907k.m14809t(y, 10);
                ArrayList arrayList = new ArrayList(t);
                for (AbstractC11343l lVar : y) {
                    arrayList.add(new C8505q(mVar, lVar));
                }
                return arrayList;
            }
        }

        @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m15073d2 = {"", "T", "", "Lig/l;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.m$a$f */
        /* loaded from: classes8.dex */
        static final class C8472f extends AbstractC9973s implements Function0<List<? extends AbstractC8453l<?>>> {

            /* renamed from: k */
            final /* synthetic */ C8466m<T>.C8467a f18451k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8472f(C8466m<T>.C8467a aVar) {
                super(0);
                this.f18451k = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AbstractC8453l<?>> invoke() {
                List<? extends AbstractC8453l<?>> o0;
                o0 = C9914r.m14750o0(this.f18451k.m19712i(), this.f18451k.m19711j());
                return o0;
            }
        }

        @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m15073d2 = {"", "T", "", "Lig/l;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/Collection;"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.m$a$g */
        /* loaded from: classes8.dex */
        static final class C8473g extends AbstractC9973s implements Function0<Collection<? extends AbstractC8453l<?>>> {

            /* renamed from: k */
            final /* synthetic */ C8466m<T> f18452k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8473g(C8466m<T> mVar) {
                super(0);
                this.f18452k = mVar;
            }

            /* renamed from: a */
            public final Collection<AbstractC8453l<?>> invoke() {
                C8466m<T> mVar = this.f18452k;
                return mVar.m19685B(mVar.m19722P(), AbstractC8494p.EnumC8498c.DECLARED);
            }
        }

        @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m15073d2 = {"", "T", "", "Lig/l;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/Collection;"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.m$a$h */
        /* loaded from: classes8.dex */
        static final class C8474h extends AbstractC9973s implements Function0<Collection<? extends AbstractC8453l<?>>> {

            /* renamed from: k */
            final /* synthetic */ C8466m<T> f18453k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8474h(C8466m<T> mVar) {
                super(0);
                this.f18453k = mVar;
            }

            /* renamed from: a */
            public final Collection<AbstractC8453l<?>> invoke() {
                C8466m<T> mVar = this.f18453k;
                return mVar.m19685B(mVar.m19721Q(), AbstractC8494p.EnumC8498c.DECLARED);
            }
        }

        @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"", "T", "Log/e;", "kotlin.jvm.PlatformType", "a", "()Log/e;"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.m$a$i */
        /* loaded from: classes8.dex */
        static final class C8475i extends AbstractC9973s implements Function0<AbstractC11313e> {

            /* renamed from: k */
            final /* synthetic */ C8466m<T> f18454k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8475i(C8466m<T> mVar) {
                super(0);
                this.f18454k = mVar;
            }

            /* renamed from: a */
            public final AbstractC11313e invoke() {
                AbstractC11313e eVar;
                C11136b M = this.f18454k.m19725M();
                C13092k a = this.f18454k.m19724N().invoke().m19667a();
                if (M.m10807k()) {
                    eVar = a.m4617a().m34048b(M);
                } else {
                    eVar = C11393x.m10149a(a.m4616b(), M);
                }
                if (eVar != null) {
                    return eVar;
                }
                this.f18454k.m19720R();
                throw null;
            }
        }

        @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m15073d2 = {"", "T", "", "Lig/l;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/Collection;"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.m$a$j */
        /* loaded from: classes8.dex */
        static final class C8476j extends AbstractC9973s implements Function0<Collection<? extends AbstractC8453l<?>>> {

            /* renamed from: k */
            final /* synthetic */ C8466m<T> f18455k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8476j(C8466m<T> mVar) {
                super(0);
                this.f18455k = mVar;
            }

            /* renamed from: a */
            public final Collection<AbstractC8453l<?>> invoke() {
                C8466m<T> mVar = this.f18455k;
                return mVar.m19685B(mVar.m19722P(), AbstractC8494p.EnumC8498c.INHERITED);
            }
        }

        @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m15073d2 = {"", "T", "", "Lig/l;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/Collection;"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.m$a$k */
        /* loaded from: classes8.dex */
        static final class C8477k extends AbstractC9973s implements Function0<Collection<? extends AbstractC8453l<?>>> {

            /* renamed from: k */
            final /* synthetic */ C8466m<T> f18456k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8477k(C8466m<T> mVar) {
                super(0);
                this.f18456k = mVar;
            }

            /* renamed from: a */
            public final Collection<AbstractC8453l<?>> invoke() {
                C8466m<T> mVar = this.f18456k;
                return mVar.m19685B(mVar.m19721Q(), AbstractC8494p.EnumC8498c.INHERITED);
            }
        }

        @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a6\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00000\u00000\u0003 \u0004*\u001a\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00000\u00000\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m15073d2 = {"", "T", "", "Lig/m;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.m$a$l */
        /* loaded from: classes8.dex */
        static final class C8478l extends AbstractC9973s implements Function0<List<? extends C8466m<? extends Object>>> {

            /* renamed from: k */
            final /* synthetic */ C8466m<T>.C8467a f18457k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8478l(C8466m<T>.C8467a aVar) {
                super(0);
                this.f18457k = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends C8466m<? extends Object>> invoke() {
                AbstractC14411h R = this.f18457k.m19710k().mo6170R();
                C9971q.m14634f(R, "descriptor.unsubstitutedInnerClassesScope");
                Collection a = AbstractC14416k.C14417a.m645a(R, null, null, 3, null);
                ArrayList<AbstractC11346m> arrayList = new ArrayList();
                for (T t : a) {
                    if (!C12661e.m6065B((AbstractC11346m) t)) {
                        arrayList.add(t);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (AbstractC11346m mVar : arrayList) {
                    AbstractC11313e eVar = mVar instanceof AbstractC11313e ? (AbstractC11313e) mVar : null;
                    Class<?> p = eVar != null ? C8503p0.m19644p(eVar) : null;
                    C8466m mVar2 = p != null ? new C8466m(p) : null;
                    if (mVar2 != null) {
                        arrayList2.add(mVar2);
                    }
                }
                return arrayList2;
            }
        }

        @Metadata(m15074d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* renamed from: ig.m$a$m */
        /* loaded from: classes8.dex */
        static final class C0263m extends AbstractC9973s implements Function0<T> {

            /* renamed from: k */
            final /* synthetic */ C8466m<T>.C8467a f18458k;

            /* renamed from: l */
            final /* synthetic */ C8466m<T> f18459l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0263m(C8466m<T>.C8467a aVar, C8466m<T> mVar) {
                super(0);
                this.f18458k = aVar;
                this.f18459l = mVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                Field field;
                AbstractC11313e k = this.f18458k.m19710k();
                if (k.mo6116g() != EnumC11317f.OBJECT) {
                    return null;
                }
                if (!k.mo6119X() || C10415d.m13454a(C10414c.f22824a, k)) {
                    field = this.f18459l.mo14611i().getDeclaredField("INSTANCE");
                } else {
                    field = this.f18459l.mo14611i().getEnclosingClass().getDeclaredField(k.getName().m10771b());
                }
                T t = (T) field.get(null);
                C9971q.m14635e(t, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                return t;
            }
        }

        @Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "T", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* renamed from: ig.m$a$n */
        /* loaded from: classes8.dex */
        static final class C8479n extends AbstractC9973s implements Function0<String> {

            /* renamed from: k */
            final /* synthetic */ C8466m<T> f18460k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8479n(C8466m<T> mVar) {
                super(0);
                this.f18460k = mVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                if (this.f18460k.mo14611i().isAnonymousClass()) {
                    return null;
                }
                C11136b M = this.f18460k.m19725M();
                if (M.m10807k()) {
                    return null;
                }
                return M.m10816b().m10803b();
            }
        }

        @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a&\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003 \u0004*\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m15073d2 = {"", "T", "", "Lig/m;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.m$a$o */
        /* loaded from: classes8.dex */
        static final class C8480o extends AbstractC9973s implements Function0<List<? extends C8466m<? extends T>>> {

            /* renamed from: k */
            final /* synthetic */ C8466m<T>.C8467a f18461k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8480o(C8466m<T>.C8467a aVar) {
                super(0);
                this.f18461k = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<C8466m<? extends T>> invoke() {
                Collection<AbstractC11313e> x = this.f18461k.m19710k().mo6107x();
                C9971q.m14634f(x, "descriptor.sealedSubclasses");
                ArrayList arrayList = new ArrayList();
                for (AbstractC11313e eVar : x) {
                    C9971q.m14635e(eVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class<?> p = C8503p0.m19644p(eVar);
                    C8466m mVar = p != null ? new C8466m(p) : null;
                    if (mVar != null) {
                        arrayList.add(mVar);
                    }
                }
                return arrayList;
            }
        }

        @Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "T", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* renamed from: ig.m$a$p */
        /* loaded from: classes8.dex */
        static final class C8481p extends AbstractC9973s implements Function0<String> {

            /* renamed from: k */
            final /* synthetic */ C8466m<T> f18462k;

            /* renamed from: l */
            final /* synthetic */ C8466m<T>.C8467a f18463l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8481p(C8466m<T> mVar, C8466m<T>.C8467a aVar) {
                super(0);
                this.f18462k = mVar;
                this.f18463l = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                if (this.f18462k.mo14611i().isAnonymousClass()) {
                    return null;
                }
                C11136b M = this.f18462k.m19725M();
                if (M.m10807k()) {
                    return this.f18463l.m19715f(this.f18462k.mo14611i());
                }
                String b = M.m10808j().m10771b();
                C9971q.m14634f(b, "classId.shortClassName.asString()");
                return b;
            }
        }

        @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m15073d2 = {"", "T", "", "Lig/e0;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.m$a$q */
        /* loaded from: classes8.dex */
        static final class C8482q extends AbstractC9973s implements Function0<List<? extends C8418e0>> {

            /* renamed from: k */
            final /* synthetic */ C8466m<T>.C8467a f18464k;

            /* renamed from: l */
            final /* synthetic */ C8466m<T> f18465l;

            /* JADX INFO: Access modifiers changed from: package-private */
            @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"", "T", "Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, m15072k = 3, m15071mv = {1, 8, 0})
            /* renamed from: ig.m$a$q$a */
            /* loaded from: classes8.dex */
            public static final class C0264a extends AbstractC9973s implements Function0<Type> {

                /* renamed from: k */
                final /* synthetic */ AbstractC7267g0 f18466k;

                /* renamed from: l */
                final /* synthetic */ C8466m<T>.C8467a f18467l;

                /* renamed from: m */
                final /* synthetic */ C8466m<T> f18468m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0264a(AbstractC7267g0 g0Var, C8466m<T>.C8467a aVar, C8466m<T> mVar) {
                    super(0);
                    this.f18466k = g0Var;
                    this.f18467l = aVar;
                    this.f18468m = mVar;
                }

                /* renamed from: a */
                public final Type invoke() {
                    int O;
                    AbstractC11326h p = this.f18466k.mo5172N0().mo4565p();
                    if (p instanceof AbstractC11313e) {
                        Class<?> p2 = C8503p0.m19644p((AbstractC11313e) p);
                        if (p2 == null) {
                            throw new C8430h0("Unsupported superclass of " + this.f18467l + ": " + p);
                        } else if (C9971q.m14638b(this.f18468m.mo14611i().getSuperclass(), p2)) {
                            Type genericSuperclass = this.f18468m.mo14611i().getGenericSuperclass();
                            C9971q.m14634f(genericSuperclass, "{\n                      …ass\n                    }");
                            return genericSuperclass;
                        } else {
                            Class<?>[] interfaces = this.f18468m.mo14611i().getInterfaces();
                            C9971q.m14634f(interfaces, "jClass.interfaces");
                            O = C9899f.m14948O(interfaces, p2);
                            if (O >= 0) {
                                Type type = this.f18468m.mo14611i().getGenericInterfaces()[O];
                                C9971q.m14634f(type, "{\n                      …ex]\n                    }");
                                return type;
                            }
                            throw new C8430h0("No superclass of " + this.f18467l + " in Java reflection for " + p);
                        }
                    } else {
                        throw new C8430h0("Supertype not a class: " + p);
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"", "T", "Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, m15072k = 3, m15071mv = {1, 8, 0})
            /* renamed from: ig.m$a$q$b */
            /* loaded from: classes8.dex */
            public static final class C8483b extends AbstractC9973s implements Function0<Type> {

                /* renamed from: k */
                public static final C8483b f18469k = new C8483b();

                C8483b() {
                    super(0);
                }

                /* renamed from: a */
                public final Type invoke() {
                    return Object.class;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8482q(C8466m<T>.C8467a aVar, C8466m<T> mVar) {
                super(0);
                this.f18464k = aVar;
                this.f18465l = mVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends C8418e0> invoke() {
                boolean z;
                Collection<AbstractC7267g0> m = this.f18464k.m19710k().mo6111k().mo4568m();
                C9971q.m14634f(m, "descriptor.typeConstructor.supertypes");
                ArrayList arrayList = new ArrayList(m.size());
                C8466m<T>.C8467a aVar = this.f18464k;
                C8466m<T> mVar = this.f18465l;
                for (AbstractC7267g0 kotlinType : m) {
                    C9971q.m14634f(kotlinType, "kotlinType");
                    arrayList.add(new C8418e0(kotlinType, new C0264a(kotlinType, aVar, mVar)));
                }
                if (!AbstractC10420h.m13364t0(this.f18464k.m19710k())) {
                    boolean z2 = true;
                    if (!arrayList.isEmpty()) {
                        Iterator<T> it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            EnumC11317f g = C12661e.m6049e(((C8418e0) it.next()).m19799o()).mo6116g();
                            C9971q.m14634f(g, "getClassDescriptorForType(it.type).kind");
                            if (g == EnumC11317f.INTERFACE || g == EnumC11317f.ANNOTATION_CLASS) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (!z) {
                                z2 = false;
                                break;
                            }
                        }
                    }
                    if (z2) {
                        AbstractC7304o0 i = C13508c.m3531j(this.f18464k.m19710k()).m13387i();
                        C9971q.m14634f(i, "descriptor.builtIns.anyType");
                        arrayList.add(new C8418e0(i, C8483b.f18469k));
                    }
                }
                return C11754a.m8687c(arrayList);
            }
        }

        @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m15073d2 = {"", "T", "", "Lig/f0;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.m$a$r */
        /* loaded from: classes8.dex */
        static final class C8484r extends AbstractC9973s implements Function0<List<? extends C8424f0>> {

            /* renamed from: k */
            final /* synthetic */ C8466m<T>.C8467a f18470k;

            /* renamed from: l */
            final /* synthetic */ C8466m<T> f18471l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8484r(C8466m<T>.C8467a aVar, C8466m<T> mVar) {
                super(0);
                this.f18470k = aVar;
                this.f18471l = mVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends C8424f0> invoke() {
                int t;
                List<AbstractC11319f1> r = this.f18470k.m19710k().mo6109r();
                C9971q.m14634f(r, "descriptor.declaredTypeParameters");
                C8466m<T> mVar = this.f18471l;
                t = C9907k.m14809t(r, 10);
                ArrayList arrayList = new ArrayList(t);
                for (AbstractC11319f1 descriptor : r) {
                    C9971q.m14634f(descriptor, "descriptor");
                    arrayList.add(new C8424f0(mVar, descriptor));
                }
                return arrayList;
            }
        }

        public C8467a() {
            super();
            this.f18427d = C8442j0.m19768d(new C8475i(C8466m.this));
            this.f18429f = C8442j0.m19768d(new C8481p(C8466m.this, this));
            this.f18430g = C8442j0.m19768d(new C8479n(C8466m.this));
            this.f18431h = C8442j0.m19768d(new C8471e(C8466m.this));
            this.f18433j = C8442j0.m19770b(new C0263m(this, C8466m.this));
            this.f18434k = C8442j0.m19768d(new C8484r(this, C8466m.this));
            this.f18435l = C8442j0.m19768d(new C8482q(this, C8466m.this));
            this.f18437n = C8442j0.m19768d(new C8473g(C8466m.this));
            this.f18438o = C8442j0.m19768d(new C8474h(C8466m.this));
            this.f18439p = C8442j0.m19768d(new C8476j(C8466m.this));
            this.f18440q = C8442j0.m19768d(new C8477k(C8466m.this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public final String m19715f(Class<?> cls) {
            String J0;
            String K0;
            String K02;
            String name = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                C9971q.m14634f(name, "name");
                K02 = C12719v.m5712K0(name, enclosingMethod.getName() + '$', null, 2, null);
                return K02;
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                C9971q.m14634f(name, "name");
                K0 = C12719v.m5712K0(name, enclosingConstructor.getName() + '$', null, 2, null);
                return K0;
            }
            C9971q.m14634f(name, "name");
            J0 = C12719v.m5714J0(name, '$', null, 2, null);
            return J0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public final Collection<AbstractC8453l<?>> m19711j() {
            T b = this.f18438o.m19764b(this, f18426w[11]);
            C9971q.m14634f(b, "<get-declaredStaticMembers>(...)");
            return (Collection) b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public final Collection<AbstractC8453l<?>> m19709l() {
            T b = this.f18439p.m19764b(this, f18426w[12]);
            C9971q.m14634f(b, "<get-inheritedNonStaticMembers>(...)");
            return (Collection) b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public final Collection<AbstractC8453l<?>> m19708m() {
            T b = this.f18440q.m19764b(this, f18426w[13]);
            C9971q.m14634f(b, "<get-inheritedStaticMembers>(...)");
            return (Collection) b;
        }

        /* renamed from: g */
        public final Collection<AbstractC8453l<?>> m19714g() {
            T b = this.f18441r.m19764b(this, f18426w[14]);
            C9971q.m14634f(b, "<get-allNonStaticMembers>(...)");
            return (Collection) b;
        }

        /* renamed from: h */
        public final Collection<AbstractC8453l<?>> m19713h() {
            T b = this.f18442s.m19764b(this, f18426w[15]);
            C9971q.m14634f(b, "<get-allStaticMembers>(...)");
            return (Collection) b;
        }

        /* renamed from: i */
        public final Collection<AbstractC8453l<?>> m19712i() {
            T b = this.f18437n.m19764b(this, f18426w[10]);
            C9971q.m14634f(b, "<get-declaredNonStaticMembers>(...)");
            return (Collection) b;
        }

        /* renamed from: k */
        public final AbstractC11313e m19710k() {
            T b = this.f18427d.m19764b(this, f18426w[0]);
            C9971q.m14634f(b, "<get-descriptor>(...)");
            return (AbstractC11313e) b;
        }

        /* renamed from: n */
        public final String m19707n() {
            return (String) this.f18430g.m19764b(this, f18426w[3]);
        }

        /* renamed from: o */
        public final String m19706o() {
            return (String) this.f18429f.m19764b(this, f18426w[2]);
        }
    }

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: ig.m$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C8485b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18472a;

        static {
            int[] iArr = new int[C8019a.EnumC0249a.values().length];
            try {
                iArr[C8019a.EnumC0249a.FILE_FACADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C8019a.EnumC0249a.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C8019a.EnumC0249a.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C8019a.EnumC0249a.SYNTHETIC_CLASS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C8019a.EnumC0249a.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C8019a.EnumC0249a.CLASS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f18472a = iArr;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e \u0004*\u000e\u0018\u00010\u0002R\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002R\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m15073d2 = {"", "T", "Lig/m$a;", "Lig/m;", "kotlin.jvm.PlatformType", "a", "()Lig/m$a;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ig.m$c */
    /* loaded from: classes8.dex */
    static final class C8486c extends AbstractC9973s implements Function0<C8466m<T>.C8467a> {

        /* renamed from: k */
        final /* synthetic */ C8466m<T> f18473k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8486c(C8466m<T> mVar) {
            super(0);
            this.f18473k = mVar;
        }

        /* renamed from: a */
        public final C8466m<T>.C8467a invoke() {
            return new C8467a();
        }
    }

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: ig.m$d */
    /* loaded from: classes8.dex */
    /* synthetic */ class C8487d extends C9965m implements Function2<C3604w, C8581n, AbstractC11388u0> {

        /* renamed from: k */
        public static final C8487d f18474k = new C8487d();

        C8487d() {
            super(2);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e, kotlin.reflect.KCallable
        public final String getName() {
            return "loadProperty";
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final KDeclarationContainer getOwner() {
            return C9951f0.m14684b(C3604w.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        /* renamed from: i */
        public final AbstractC11388u0 invoke(C3604w p0, C8581n p1) {
            C9971q.m14633g(p0, "p0");
            C9971q.m14633g(p1, "p1");
            return p0.m33988l(p1);
        }
    }

    public C8466m(Class<T> jClass) {
        C9971q.m14633g(jClass, "jClass");
        this.f18424n = jClass;
        C8442j0.C8444b<C8466m<T>.C8467a> b = C8442j0.m19770b(new C8486c(this));
        C9971q.m14634f(b, "lazy { Data() }");
        this.f18425o = b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public final C11136b m19725M() {
        return C8488m0.f18475a.m19694c(mo14611i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public final Void m19720R() {
        C8019a.EnumC0249a aVar;
        int i;
        C8019a d;
        C13086f a = C13086f.f29393c.m4627a(mo14611i());
        if (a == null || (d = a.mo4630d()) == null) {
            aVar = null;
        } else {
            aVar = d.m20842c();
        }
        if (aVar == null) {
            i = -1;
        } else {
            i = C8485b.f18472a[aVar.ordinal()];
        }
        switch (i) {
            case -1:
            case 6:
                throw new C8430h0("Unresolved class: " + mo14611i());
            case 0:
            default:
                throw new C11088q();
            case 1:
            case 2:
            case 3:
                throw new UnsupportedOperationException("Packages and file facades are not yet supported in Kotlin reflection. Meanwhile please use Java reflection to inspect this class: " + mo14611i());
            case 4:
                throw new UnsupportedOperationException("This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection library has no idea what declarations it has. Please use Java reflection to inspect this class: " + mo14611i());
            case 5:
                throw new C8430h0("Unknown class: " + mo14611i() + " (kind = " + aVar + ')');
        }
    }

    @Override // p158ig.AbstractC8494p
    /* renamed from: A */
    public AbstractC11388u0 mo19605A(int i) {
        C6467d dVar;
        Class<?> declaringClass;
        if (!C9971q.m14638b(mo14611i().getSimpleName(), "DefaultImpls") || (declaringClass = mo14611i().getDeclaringClass()) == null || !declaringClass.isInterface()) {
            AbstractC11313e O = getDescriptor();
            if (O instanceof C6467d) {
                dVar = (C6467d) O;
            } else {
                dVar = null;
            }
            if (dVar == null) {
                return null;
            }
            C8544c b1 = dVar.m25514b1();
            AbstractC11702i.C11709f<C8544c, List<C8581n>> classLocalVariable = C10440a.f22984j;
            C9971q.m14634f(classLocalVariable, "classLocalVariable");
            C8581n nVar = (C8581n) C9877e.m15131b(b1, classLocalVariable, i);
            if (nVar != null) {
                return (AbstractC11388u0) C8503p0.m19652h(mo14611i(), nVar, dVar.m25515a1().m34015g(), dVar.m25515a1().m34012j(), dVar.m25512d1(), C8487d.f18474k);
            }
            return null;
        }
        KClass e = C14376a.m734e(declaringClass);
        C9971q.m14635e(e, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
        return ((C8466m) e).mo19605A(i);
    }

    @Override // p158ig.AbstractC8494p
    /* renamed from: D */
    public Collection<AbstractC11388u0> mo19603D(C11142f name) {
        List o0;
        C9971q.m14633g(name, "name");
        AbstractC14411h P = m19722P();
        EnumC13881d dVar = EnumC13881d.FROM_REFLECTION;
        o0 = C9914r.m14750o0(P.mo627a(name, dVar), m19721Q().mo627a(name, dVar));
        return o0;
    }

    /* renamed from: N */
    public final C8442j0.C8444b<C8466m<T>.C8467a> m19724N() {
        return this.f18425o;
    }

    /* renamed from: O */
    public AbstractC11313e getDescriptor() {
        return this.f18425o.invoke().m19710k();
    }

    /* renamed from: P */
    public final AbstractC14411h m19722P() {
        return getDescriptor().mo6166p().mo5161o();
    }

    /* renamed from: Q */
    public final AbstractC14411h m19721Q() {
        AbstractC14411h i0 = getDescriptor().mo6113i0();
        C9971q.m14634f(i0, "descriptor.staticScope");
        return i0;
    }

    @Override // kotlin.reflect.KClass
    /* renamed from: e */
    public boolean mo14600e(Object obj) {
        Integer c = C13283d.m4051c(mo14611i());
        if (c != null) {
            return C9964l0.m14648i(obj, c.intValue());
        }
        Class g = C13283d.m4047g(mo14611i());
        if (g == null) {
            g = mo14611i();
        }
        return g.isInstance(obj);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8466m) && C9971q.m14638b(C14376a.m736c(this), C14376a.m736c((KClass) obj));
    }

    public int hashCode() {
        return C14376a.m736c(this).hashCode();
    }

    @Override // kotlin.jvm.internal.AbstractC9952g
    /* renamed from: i */
    public Class<T> mo14611i() {
        return this.f18424n;
    }

    @Override // kotlin.reflect.KClass
    /* renamed from: k */
    public String mo14599k() {
        return this.f18425o.invoke().m19707n();
    }

    @Override // kotlin.reflect.KClass
    /* renamed from: l */
    public String mo14598l() {
        return this.f18425o.invoke().m19706o();
    }

    public String toString() {
        String str;
        String C;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("class ");
        C11136b M = m19725M();
        C11137c h = M.m10810h();
        C9971q.m14634f(h, "classId.packageFqName");
        if (h.m10801d()) {
            str = "";
        } else {
            str = h.m10803b() + '.';
        }
        String b = M.m10809i().m10803b();
        C9971q.m14634f(b, "classId.relativeClassName.asString()");
        C = C12718u.m5741C(b, '.', '$', false, 4, null);
        sb2.append(str + C);
        return sb2.toString();
    }

    @Override // p158ig.AbstractC8494p
    /* renamed from: y */
    public Collection<AbstractC11343l> mo19601y() {
        List i;
        AbstractC11313e O = getDescriptor();
        if (O.mo6116g() == EnumC11317f.INTERFACE || O.mo6116g() == EnumC11317f.OBJECT) {
            i = C9906j.m14820i();
            return i;
        }
        Collection<AbstractC11309d> l = O.mo6110l();
        C9971q.m14634f(l, "descriptor.constructors");
        return l;
    }

    @Override // p158ig.AbstractC8494p
    /* renamed from: z */
    public Collection<AbstractC11397y> mo19600z(C11142f name) {
        List o0;
        C9971q.m14633g(name, "name");
        AbstractC14411h P = m19722P();
        EnumC13881d dVar = EnumC13881d.FROM_REFLECTION;
        o0 = C9914r.m14750o0(P.mo626d(name, dVar), m19721Q().mo626d(name, dVar));
        return o0;
    }
}
