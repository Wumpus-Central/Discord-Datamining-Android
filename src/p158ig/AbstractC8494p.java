package p158ig;

import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.SortedMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9952g;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9944c0;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import p158ig.C8442j0;
import p249nh.C11142f;
import p267of.C11288u;
import p268og.AbstractC11301b;
import p268og.AbstractC11343l;
import p268og.AbstractC11387u;
import p268og.AbstractC11388u0;
import p268og.AbstractC11397y;
import p268og.C11373t;
import p305qh.AbstractC12137c;
import p326ri.C12718u;
import p326ri.C12719v;
import tg.C13085e;
import tg.C13092k;
import ug.C13283d;

@Metadata(m15074d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u0000 =2\u00020\u0001:\u0003>?@B\u0007¢\u0006\u0004\b;\u0010<JG\u0010\u000b\u001a\u0004\u0018\u00010\n*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\r\u001a\u0004\u0018\u00010\n*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010*\u0006\u0012\u0002\b\u00030\u00022\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000fH\u0002J*\u0010\u0017\u001a\u00020\u00162\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\bH\u0002J\u001a\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J$\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002J\u0014\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0004\u001a\u00020\u001eH&J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001f2\u0006\u0010\u0004\u001a\u00020\u001eH&J\u0012\u0010%\u001a\u0004\u0018\u00010 2\u0006\u0010$\u001a\u00020\u0019H&J\"\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030*0\u001f2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0004J\u0016\u0010-\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0003J\u0016\u0010.\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0003J\u0018\u0010/\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003J \u00101\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u00100\u001a\u00020\bJ\u0014\u00102\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0003J\u0014\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0003R\u0018\u00106\u001a\u0006\u0012\u0002\b\u00030\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002070\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006A"}, m15073d2 = {"Lig/p;", "Lkotlin/jvm/internal/g;", "Ljava/lang/Class;", "", "name", "", "parameterTypes", "returnType", "", "isStaticDefault", "Ljava/lang/reflect/Method;", "G", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "J", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "", "Ljava/lang/reflect/Constructor;", "I", "", "result", "desc", "isConstructor", "", "q", "E", "", "begin", ViewProps.END, "H", "F", "Lnh/f;", "", "Log/u0;", "D", "Log/y;", "z", "index", "A", "Lyh/h;", "scope", "Lig/p$c;", "belonginess", "Lig/l;", "B", "signature", "w", "u", "v", "isMember", "t", "r", "s", "C", "()Ljava/lang/Class;", "methodOwner", "Log/l;", "y", "()Ljava/util/Collection;", "constructorDescriptors", "<init>", "()V", "k", "a", "b", "c", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ig.p */
/* loaded from: classes8.dex */
public abstract class AbstractC8494p implements AbstractC9952g {

    /* renamed from: k */
    public static final C8495a f18479k = new C8495a(null);

    /* renamed from: l */
    private static final Class<?> f18480l = DefaultConstructorMarker.class;

    /* renamed from: m */
    private static final Regex f18481m = new Regex("<v#(\\d+)>");

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\t\u001a\u0012\u0012\u0002\b\u0003 \b*\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, m15073d2 = {"Lig/p$a;", "", "Lkotlin/text/Regex;", "LOCAL_PROPERTY_SIGNATURE", "Lkotlin/text/Regex;", "a", "()Lkotlin/text/Regex;", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "<init>", "()V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ig.p$a */
    /* loaded from: classes8.dex */
    public static final class C8495a {
        private C8495a() {
        }

        public /* synthetic */ C8495a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Regex m19668a() {
            return AbstractC8494p.f18481m;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b¦\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m15073d2 = {"Lig/p$b;", "", "Ltg/k;", "a", "Lig/j0$a;", "getModuleData", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", "moduleData", "<init>", "(Lig/p;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ig.p$b */
    /* loaded from: classes8.dex */
    public abstract class AbstractC8496b {

        /* renamed from: c */
        static final /* synthetic */ KProperty<Object>[] f18482c = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(AbstractC8496b.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* renamed from: a */
        private final C8442j0.C8443a f18483a;

        @Metadata(m15074d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m15073d2 = {"Ltg/k;", "kotlin.jvm.PlatformType", "a", "()Ltg/k;"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.p$b$a */
        /* loaded from: classes8.dex */
        static final class C8497a extends AbstractC9973s implements Function0<C13092k> {

            /* renamed from: k */
            final /* synthetic */ AbstractC8494p f18485k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8497a(AbstractC8494p pVar) {
                super(0);
                this.f18485k = pVar;
            }

            /* renamed from: a */
            public final C13092k invoke() {
                return C8433i0.m19781a(this.f18485k.mo14611i());
            }
        }

        public AbstractC8496b() {
            this.f18483a = C8442j0.m19768d(new C8497a(AbstractC8494p.this));
        }

        /* renamed from: a */
        public final C13092k m19667a() {
            T b = this.f18483a.m19764b(this, f18482c[0]);
            C9971q.m14634f(b, "<get-moduleData>(...)");
            return (C13092k) b;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0084\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m15073d2 = {"Lig/p$c;", "", "Log/b;", "member", "", "b", "<init>", "(Ljava/lang/String;I)V", "k", "l", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ig.p$c */
    /* loaded from: classes8.dex */
    protected enum EnumC8498c {
        DECLARED,
        INHERITED;

        /* renamed from: b */
        public final boolean m19664b(AbstractC11301b member) {
            boolean z;
            C9971q.m14633g(member, "member");
            boolean a = member.mo6245g().m10224a();
            if (this == DECLARED) {
                z = true;
            } else {
                z = false;
            }
            if (a == z) {
                return true;
            }
            return false;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"Log/y;", "descriptor", "", "a", "(Log/y;)Ljava/lang/CharSequence;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ig.p$d */
    /* loaded from: classes8.dex */
    static final class C8499d extends AbstractC9973s implements Function1<AbstractC11397y, CharSequence> {

        /* renamed from: k */
        public static final C8499d f18489k = new C8499d();

        C8499d() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(AbstractC11397y descriptor) {
            C9971q.m14633g(descriptor, "descriptor");
            return AbstractC12137c.f27233j.mo7630q(descriptor) + " | " + C8488m0.f18475a.m19690g(descriptor).mo19774a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"Log/u0;", "descriptor", "", "a", "(Log/u0;)Ljava/lang/CharSequence;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ig.p$e */
    /* loaded from: classes8.dex */
    public static final class C8500e extends AbstractC9973s implements Function1<AbstractC11388u0, CharSequence> {

        /* renamed from: k */
        public static final C8500e f18490k = new C8500e();

        C8500e() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(AbstractC11388u0 descriptor) {
            C9971q.m14633g(descriptor, "descriptor");
            return AbstractC12137c.f27233j.mo7630q(descriptor) + " | " + C8488m0.f18475a.m19691f(descriptor).mo19753a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m15073d2 = {"Log/u;", "kotlin.jvm.PlatformType", "first", "second", "", "invoke", "(Lorg/jetbrains/kotlin/descriptors/DescriptorVisibility;Lorg/jetbrains/kotlin/descriptors/DescriptorVisibility;)Ljava/lang/Integer;", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ig.p$f */
    /* loaded from: classes8.dex */
    public static final class C8501f extends AbstractC9973s implements Function2<AbstractC11387u, AbstractC11387u, Integer> {

        /* renamed from: k */
        public static final C8501f f18491k = new C8501f();

        C8501f() {
            super(2);
        }

        /* renamed from: a */
        public final Integer invoke(AbstractC11387u uVar, AbstractC11387u uVar2) {
            Integer d = C11373t.m10172d(uVar, uVar2);
            return Integer.valueOf(d == null ? 0 : d.intValue());
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m15073d2 = {"ig/p$g", "Lig/g;", "Log/l;", "descriptor", "", "data", "Lig/l;", "visitConstructorDescriptor", "(Lorg/jetbrains/kotlin/descriptors/ConstructorDescriptor;Lkotlin/Unit;)Lig/l;", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ig.p$g */
    /* loaded from: classes8.dex */
    public static final class C8502g extends C8427g {
        C8502g(AbstractC8494p pVar) {
            super(pVar);
        }

        /* renamed from: r */
        public AbstractC8453l<?> mo6323a(AbstractC11343l descriptor, Unit data) {
            C9971q.m14633g(descriptor, "descriptor");
            C9971q.m14633g(data, "data");
            throw new IllegalStateException("No constructors should appear here: " + descriptor);
        }
    }

    /* renamed from: E */
    private final List<Class<?>> m19684E(String str) {
        boolean L;
        int i;
        int Y;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (str.charAt(i2) != ')') {
            int i3 = i2;
            while (str.charAt(i3) == '[') {
                i3++;
            }
            char charAt = str.charAt(i3);
            L = C12719v.m5711L("VZCBSIFJD", charAt, false, 2, null);
            if (L) {
                i = i3 + 1;
            } else if (charAt == 'L') {
                Y = C12719v.m5687Y(str, ';', i2, false, 4, null);
                i = Y + 1;
            } else {
                throw new C8430h0("Unknown type prefix in the method signature: " + str);
            }
            arrayList.add(m19681H(str, i2, i));
            i2 = i;
        }
        return arrayList;
    }

    /* renamed from: F */
    private final Class<?> m19683F(String str) {
        int Y;
        Y = C12719v.m5687Y(str, ')', 0, false, 6, null);
        return m19681H(str, Y + 1, str.length());
    }

    /* renamed from: G */
    private final Method m19682G(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z) {
        Method G;
        if (z) {
            clsArr[0] = cls;
        }
        Method J = m19679J(cls, str, clsArr, cls2);
        if (J != null) {
            return J;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (!(superclass == null || (G = m19682G(superclass, str, clsArr, cls2, z)) == null)) {
            return G;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        C9971q.m14634f(interfaces, "interfaces");
        for (Class<?> superInterface : interfaces) {
            C9971q.m14634f(superInterface, "superInterface");
            Method G2 = m19682G(superInterface, str, clsArr, cls2, z);
            if (G2 != null) {
                return G2;
            }
            if (z) {
                Class<?> a = C13085e.m4634a(C13283d.m4048f(superInterface), superInterface.getName() + "$DefaultImpls");
                if (a != null) {
                    clsArr[0] = superInterface;
                    Method J2 = m19679J(a, str, clsArr, cls2);
                    if (J2 != null) {
                        return J2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    /* renamed from: H */
    private final Class<?> m19681H(String str, int i, int i2) {
        String C;
        char charAt = str.charAt(i);
        if (charAt == 'L') {
            ClassLoader f = C13283d.m4048f(mo14611i());
            String substring = str.substring(i + 1, i2 - 1);
            C9971q.m14634f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            C = C12718u.m5741C(substring, '/', '.', false, 4, null);
            Class<?> loadClass = f.loadClass(C);
            C9971q.m14634f(loadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
            return loadClass;
        } else if (charAt == '[') {
            return C8503p0.m19654f(m19681H(str, i + 1, i2));
        } else {
            if (charAt == 'V') {
                Class<?> TYPE = Void.TYPE;
                C9971q.m14634f(TYPE, "TYPE");
                return TYPE;
            } else if (charAt == 'Z') {
                return Boolean.TYPE;
            } else {
                if (charAt == 'C') {
                    return Character.TYPE;
                }
                if (charAt == 'B') {
                    return Byte.TYPE;
                }
                if (charAt == 'S') {
                    return Short.TYPE;
                }
                if (charAt == 'I') {
                    return Integer.TYPE;
                }
                if (charAt == 'F') {
                    return Float.TYPE;
                }
                if (charAt == 'J') {
                    return Long.TYPE;
                }
                if (charAt == 'D') {
                    return Double.TYPE;
                }
                throw new C8430h0("Unknown type prefix in the method signature: " + str);
            }
        }
    }

    /* renamed from: I */
    private final Constructor<?> m19680I(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: J */
    private final Method m19679J(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        boolean z;
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (C9971q.m14638b(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            C9971q.m14634f(declaredMethods, "declaredMethods");
            for (Method method : declaredMethods) {
                if (!C9971q.m14638b(method.getName(), str) || !C9971q.m14638b(method.getReturnType(), cls2) || !Arrays.equals(method.getParameterTypes(), clsArr)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: q */
    private final void m19676q(List<Class<?>> list, String str, boolean z) {
        List<Class<?>> E = m19684E(str);
        list.addAll(E);
        int size = ((E.size() + 32) - 1) / 32;
        for (int i = 0; i < size; i++) {
            Class<?> TYPE = Integer.TYPE;
            C9971q.m14634f(TYPE, "TYPE");
            list.add(TYPE);
        }
        if (z) {
            Class<?> DEFAULT_CONSTRUCTOR_MARKER = f18480l;
            list.remove(DEFAULT_CONSTRUCTOR_MARKER);
            C9971q.m14634f(DEFAULT_CONSTRUCTOR_MARKER, "DEFAULT_CONSTRUCTOR_MARKER");
            list.add(DEFAULT_CONSTRUCTOR_MARKER);
            return;
        }
        list.add(Object.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final int m19669x(Function2 tmp0, Object obj, Object obj2) {
        C9971q.m14633g(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* renamed from: A */
    public abstract AbstractC11388u0 mo19605A(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x001e A[SYNTHETIC] */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection<p158ig.AbstractC8453l<?>> m19685B(p448yh.AbstractC14411h r8, p158ig.AbstractC8494p.EnumC8498c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.C9971q.m14633g(r8, r0)
            java.lang.String r0 = "belonginess"
            kotlin.jvm.internal.C9971q.m14633g(r9, r0)
            ig.p$g r0 = new ig.p$g
            r0.<init>(r7)
            r1 = 3
            r2 = 0
            java.util.Collection r8 = p448yh.AbstractC14416k.C14417a.m645a(r8, r2, r2, r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x001e:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0053
            java.lang.Object r3 = r8.next()
            og.m r3 = (p268og.AbstractC11346m) r3
            boolean r4 = r3 instanceof p268og.AbstractC11301b
            if (r4 == 0) goto L_0x004c
            r4 = r3
            og.b r4 = (p268og.AbstractC11301b) r4
            og.u r5 = r4.getVisibility()
            og.u r6 = p268og.C11373t.f25302h
            boolean r5 = kotlin.jvm.internal.C9971q.m14638b(r5, r6)
            if (r5 != 0) goto L_0x004c
            boolean r4 = r9.m19664b(r4)
            if (r4 == 0) goto L_0x004c
            kotlin.Unit r4 = kotlin.Unit.f22042a
            java.lang.Object r3 = r3.mo6105C0(r0, r4)
            ig.l r3 = (p158ig.AbstractC8453l) r3
            goto L_0x004d
        L_0x004c:
            r3 = r2
        L_0x004d:
            if (r3 == 0) goto L_0x001e
            r1.add(r3)
            goto L_0x001e
        L_0x0053:
            java.util.List r8 = kotlin.collections.C9904h.m14898D0(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p158ig.AbstractC8494p.m19685B(yh.h, ig.p$c):java.util.Collection");
    }

    /* renamed from: C */
    protected Class<?> mo19604C() {
        Class<?> g = C13283d.m4047g(mo14611i());
        return g == null ? mo14611i() : g;
    }

    /* renamed from: D */
    public abstract Collection<AbstractC11388u0> mo19603D(C11142f fVar);

    /* renamed from: r */
    public final Constructor<?> m19675r(String desc) {
        C9971q.m14633g(desc, "desc");
        return m19680I(mo14611i(), m19684E(desc));
    }

    /* renamed from: s */
    public final Constructor<?> m19674s(String desc) {
        C9971q.m14633g(desc, "desc");
        Class<?> i = mo14611i();
        ArrayList arrayList = new ArrayList();
        m19676q(arrayList, desc, true);
        Unit unit = Unit.f22042a;
        return m19680I(i, arrayList);
    }

    /* renamed from: t */
    public final Method m19673t(String name, String desc, boolean z) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(desc, "desc");
        if (C9971q.m14638b(name, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(mo14611i());
        }
        m19676q(arrayList, desc, false);
        Class<?> C = mo19604C();
        return m19682G(C, name + "$default", (Class[]) arrayList.toArray(new Class[0]), m19683F(desc), z);
    }

    /* renamed from: u */
    public final AbstractC11397y m19672u(String name, String signature) {
        Collection<AbstractC11397y> collection;
        Object r0;
        String e0;
        String str;
        C9971q.m14633g(name, "name");
        C9971q.m14633g(signature, "signature");
        if (C9971q.m14638b(name, "<init>")) {
            collection = C9914r.m14790D0(mo19601y());
        } else {
            C11142f f = C11142f.m10767f(name);
            C9971q.m14634f(f, "identifier(name)");
            collection = mo19600z(f);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (C9971q.m14638b(C8488m0.f18475a.m19690g((AbstractC11397y) obj).mo19774a(), signature)) {
                arrayList.add(obj);
            }
        }
        boolean z = true;
        if (arrayList.size() != 1) {
            e0 = C9914r.m14760e0(collection, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, 0, null, C8499d.f18489k, 30, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Function '");
            sb2.append(name);
            sb2.append("' (JVM signature: ");
            sb2.append(signature);
            sb2.append(") not resolved in ");
            sb2.append(this);
            sb2.append(':');
            if (e0.length() != 0) {
                z = false;
            }
            if (z) {
                str = " no members found";
            } else {
                str = '\n' + e0;
            }
            sb2.append(str);
            throw new C8430h0(sb2.toString());
        }
        r0 = C9914r.m14747r0(arrayList);
        return (AbstractC11397y) r0;
    }

    /* renamed from: v */
    public final Method m19671v(String name, String desc) {
        Method G;
        C9971q.m14633g(name, "name");
        C9971q.m14633g(desc, "desc");
        if (C9971q.m14638b(name, "<init>")) {
            return null;
        }
        Class<?>[] clsArr = (Class[]) m19684E(desc).toArray(new Class[0]);
        Class<?> F = m19683F(desc);
        Method G2 = m19682G(mo19604C(), name, clsArr, F, false);
        if (G2 != null) {
            return G2;
        }
        if (!mo19604C().isInterface() || (G = m19682G(Object.class, name, clsArr, F, false)) == null) {
            return null;
        }
        return G;
    }

    /* renamed from: w */
    public final AbstractC11388u0 m19670w(String name, String signature) {
        Object r0;
        SortedMap g;
        Object f0;
        String e0;
        String str;
        Object U;
        C9971q.m14633g(name, "name");
        C9971q.m14633g(signature, "signature");
        MatchResult f = f18481m.m14584f(signature);
        boolean z = true;
        if (f != null) {
            String str2 = f.mo5842a().m14590a().mo5841b().get(1);
            AbstractC11388u0 A = mo19605A(Integer.parseInt(str2));
            if (A != null) {
                return A;
            }
            throw new C8430h0("Local property #" + str2 + " not found in " + mo14611i());
        }
        C11142f f2 = C11142f.m10767f(name);
        C9971q.m14634f(f2, "identifier(name)");
        Collection<AbstractC11388u0> D = mo19603D(f2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : D) {
            if (C9971q.m14638b(C8488m0.f18475a.m19691f((AbstractC11388u0) obj).mo19753a(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new C8430h0("Property '" + name + "' (JVM signature: " + signature + ") not resolved in " + this);
        } else if (arrayList.size() != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : arrayList) {
                AbstractC11387u visibility = ((AbstractC11388u0) obj2).getVisibility();
                Object obj3 = linkedHashMap.get(visibility);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    linkedHashMap.put(visibility, obj3);
                }
                ((List) obj3).add(obj2);
            }
            g = C11288u.m10252g(linkedHashMap, new C8492o(C8501f.f18491k));
            Collection values = g.values();
            C9971q.m14634f(values, "properties\n             …\n                }.values");
            f0 = C9914r.m14759f0(values);
            List mostVisibleProperties = (List) f0;
            if (mostVisibleProperties.size() == 1) {
                C9971q.m14634f(mostVisibleProperties, "mostVisibleProperties");
                U = C9914r.m14770U(mostVisibleProperties);
                return (AbstractC11388u0) U;
            }
            C11142f f3 = C11142f.m10767f(name);
            C9971q.m14634f(f3, "identifier(name)");
            e0 = C9914r.m14760e0(mo19603D(f3), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, 0, null, C8500e.f18490k, 30, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Property '");
            sb2.append(name);
            sb2.append("' (JVM signature: ");
            sb2.append(signature);
            sb2.append(") not resolved in ");
            sb2.append(this);
            sb2.append(':');
            if (e0.length() != 0) {
                z = false;
            }
            if (z) {
                str = " no members found";
            } else {
                str = '\n' + e0;
            }
            sb2.append(str);
            throw new C8430h0(sb2.toString());
        } else {
            r0 = C9914r.m14747r0(arrayList);
            return (AbstractC11388u0) r0;
        }
    }

    /* renamed from: y */
    public abstract Collection<AbstractC11343l> mo19601y();

    /* renamed from: z */
    public abstract Collection<AbstractC11397y> mo19600z(C11142f fVar);
}
