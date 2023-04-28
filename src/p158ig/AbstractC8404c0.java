package p158ig;

import gg.C7590b;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9947e;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9944c0;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import mh.AbstractC10609d;
import mh.C10619i;
import nf.C11088q;
import p107fg.AbstractC7140d;
import p140hg.C8014a;
import p158ig.AbstractC8447k;
import p158ig.C8442j0;
import p180jg.AbstractC9579e;
import p180jg.C9602i;
import p218lh.C10440a;
import p268og.AbstractC11313e;
import p268og.AbstractC11346m;
import p268og.AbstractC11386t0;
import p268og.AbstractC11388u0;
import p268og.AbstractC11390v0;
import p268og.AbstractC11392w0;
import p325rh.C12659d;
import p427xg.C14139k;
import pg.AbstractC11672g;

@Metadata(m15074d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b \u0018\u0000 <*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004JKLMB\u0019\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010D\u001a\u00020)¢\u0006\u0004\bE\u0010FB5\b\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0010\u0012\b\u0010G\u001a\u0004\u0018\u00010)\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bE\u0010HB+\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0010\u0012\b\u00100\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bE\u0010IJ\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0004J(\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0004J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0016\u0010\"\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010-\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010)0)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0013\u00100\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00103\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u00106\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00028\u0000078&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0018\u0010>\u001a\u0006\u0012\u0002\b\u00030;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001a\u0010@\u001a\b\u0012\u0002\b\u0003\u0018\u00010;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010=R\u0014\u0010A\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u00102R\u0014\u0010D\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006N"}, m15073d2 = {"Lig/c0;", "V", "Lig/l;", "Lkotlin/reflect/KProperty;", "Ljava/lang/reflect/Member;", "A", "fieldOrMethod", "", "receiver1", "receiver2", "C", "other", "", "equals", "", "hashCode", "", "toString", "Lig/p;", "o", "Lig/p;", "v", "()Lig/p;", "container", "p", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "q", "G", "signature", "r", "Ljava/lang/Object;", "rawBoundReceiver", "Lig/j0$b;", "Ljava/lang/reflect/Field;", "s", "Lig/j0$b;", "_javaField", "Lig/j0$a;", "Log/u0;", "kotlin.jvm.PlatformType", "t", "Lig/j0$a;", "_descriptor", "B", "()Ljava/lang/Object;", "boundReceiver", "z", "()Z", "isBound", "F", "()Ljava/lang/reflect/Field;", "javaField", "Lig/c0$c;", "E", "()Lig/c0$c;", "getter", "Ljg/e;", "u", "()Ljg/e;", "caller", "w", "defaultCaller", "isSuspend", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lig/p;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "descriptorInitialValue", "(Lig/p;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "(Lig/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "b", "c", "d", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ig.c0 */
/* loaded from: classes8.dex */
public abstract class AbstractC8404c0<V> extends AbstractC8453l<V> implements KProperty<V> {

    /* renamed from: u */
    public static final C8406b f18334u = new C8406b(null);

    /* renamed from: v */
    private static final Object f18335v = new Object();

    /* renamed from: o */
    private final AbstractC8494p f18336o;

    /* renamed from: p */
    private final String f18337p;

    /* renamed from: q */
    private final String f18338q;

    /* renamed from: r */
    private final Object f18339r;

    /* renamed from: s */
    private final C8442j0.C8444b<Field> f18340s;

    /* renamed from: t */
    private final C8442j0.C8443a<AbstractC11388u0> f18341t;

    @Metadata(m15074d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005B\u0007¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, m15073d2 = {"Lig/c0$a;", "PropertyType", "ReturnType", "Lig/l;", "Lkotlin/reflect/KProperty$a;", "Lkotlin/reflect/KFunction;", "Lig/c0;", "B", "()Lig/c0;", "property", "Lig/p;", "v", "()Lig/p;", "container", "Ljg/e;", "w", "()Ljg/e;", "defaultCaller", "", "z", "()Z", "isBound", "isInline", "isExternal", "isOperator", "isInfix", "isSuspend", "Log/t0;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "descriptor", "<init>", "()V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ig.c0$a */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC8405a<PropertyType, ReturnType> extends AbstractC8453l<ReturnType> implements KFunction<ReturnType>, KProperty.AbstractC9987a<PropertyType> {
        /* renamed from: A */
        public abstract AbstractC11386t0 mo19814A();

        /* renamed from: B */
        public abstract AbstractC8404c0<PropertyType> mo19569B();

        @Override // kotlin.reflect.KFunction
        public boolean isExternal() {
            return mo19814A().isExternal();
        }

        @Override // kotlin.reflect.KFunction
        public boolean isInfix() {
            return mo19814A().isInfix();
        }

        @Override // kotlin.reflect.KFunction
        public boolean isInline() {
            return mo19814A().isInline();
        }

        @Override // kotlin.reflect.KFunction
        public boolean isOperator() {
            return mo19814A().isOperator();
        }

        @Override // kotlin.reflect.KCallable
        public boolean isSuspend() {
            return mo19814A().isSuspend();
        }

        @Override // p158ig.AbstractC8453l
        /* renamed from: v */
        public AbstractC8494p mo19628v() {
            return mo19569B().mo19628v();
        }

        @Override // p158ig.AbstractC8453l
        /* renamed from: w */
        public AbstractC9579e<?> mo19627w() {
            return null;
        }

        @Override // p158ig.AbstractC8453l
        /* renamed from: z */
        public boolean mo19625z() {
            return mo19569B().mo19625z();
        }
    }

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m15073d2 = {"Lig/c0$b;", "", "<init>", "()V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ig.c0$b */
    /* loaded from: classes8.dex */
    public static final class C8406b {
        private C8406b() {
        }

        public /* synthetic */ C8406b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001b\u0010\u0011\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m15073d2 = {"Lig/c0$c;", "V", "Lig/c0$a;", "Lkotlin/reflect/KProperty$b;", "", "toString", "", "other", "", "equals", "", "hashCode", "Log/v0;", "o", "Lig/j0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", "descriptor", "Ljg/e;", "p", "Lig/j0$b;", "u", "()Ljg/e;", "caller", "getName", "()Ljava/lang/String;", "name", "<init>", "()V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ig.c0$c */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC8407c<V> extends AbstractC8405a<V, V> implements KProperty.AbstractC9988b<V> {

        /* renamed from: q */
        static final /* synthetic */ KProperty<Object>[] f18342q = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(AbstractC8407c.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(AbstractC8407c.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* renamed from: o */
        private final C8442j0.C8443a f18343o = C8442j0.m19768d(new C8409b(this));

        /* renamed from: p */
        private final C8442j0.C8444b f18344p = C8442j0.m19770b(new C8408a(this));

        @Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"V", "Ljg/e;", "kotlin.jvm.PlatformType", "a", "()Ljg/e;"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.c0$c$a */
        /* loaded from: classes8.dex */
        static final class C8408a extends AbstractC9973s implements Function0<AbstractC9579e<?>> {

            /* renamed from: k */
            final /* synthetic */ AbstractC8407c<V> f18345k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C8408a(AbstractC8407c<? extends V> cVar) {
                super(0);
                this.f18345k = cVar;
            }

            /* renamed from: a */
            public final AbstractC9579e<?> invoke() {
                return C8416d0.m19808a(this.f18345k, true);
            }
        }

        @Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"V", "Log/v0;", "kotlin.jvm.PlatformType", "a", "()Log/v0;"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.c0$c$b */
        /* loaded from: classes8.dex */
        static final class C8409b extends AbstractC9973s implements Function0<AbstractC11390v0> {

            /* renamed from: k */
            final /* synthetic */ AbstractC8407c<V> f18346k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C8409b(AbstractC8407c<? extends V> cVar) {
                super(0);
                this.f18346k = cVar;
            }

            /* renamed from: a */
            public final AbstractC11390v0 invoke() {
                AbstractC11390v0 f = this.f18346k.mo19569B().mo19626x().mo6437f();
                return f == null ? C12659d.m6081d(this.f18346k.mo19569B().mo19626x(), AbstractC11672g.f26044g.m9048b()) : f;
            }
        }

        /* renamed from: C */
        public AbstractC11390v0 mo19626x() {
            T b = this.f18343o.m19764b(this, f18342q[0]);
            C9971q.m14634f(b, "<get-descriptor>(...)");
            return (AbstractC11390v0) b;
        }

        public boolean equals(Object obj) {
            return (obj instanceof AbstractC8407c) && C9971q.m14638b(mo19569B(), ((AbstractC8407c) obj).mo19569B());
        }

        @Override // kotlin.reflect.KCallable
        public String getName() {
            return "<get-" + mo19569B().getName() + '>';
        }

        public int hashCode() {
            return mo19569B().hashCode();
        }

        public String toString() {
            return "getter of " + mo19569B();
        }

        @Override // p158ig.AbstractC8453l
        /* renamed from: u */
        public AbstractC9579e<?> mo19629u() {
            T b = this.f18344p.m19764b(this, f18342q[1]);
            C9971q.m14634f(b, "<get-caller>(...)");
            return (AbstractC9579e) b;
        }
    }

    @Metadata(m15074d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001b\u0010\u0012\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m15073d2 = {"Lig/c0$d;", "V", "Lig/c0$a;", "", "Lfg/d$a;", "", "toString", "", "other", "", "equals", "", "hashCode", "Log/w0;", "o", "Lig/j0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", "descriptor", "Ljg/e;", "p", "Lig/j0$b;", "u", "()Ljg/e;", "caller", "getName", "()Ljava/lang/String;", "name", "<init>", "()V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ig.c0$d */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC8410d<V> extends AbstractC8405a<V, Unit> implements AbstractC7140d.AbstractC7141a<V> {

        /* renamed from: q */
        static final /* synthetic */ KProperty<Object>[] f18347q = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(AbstractC8410d.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(AbstractC8410d.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* renamed from: o */
        private final C8442j0.C8443a f18348o = C8442j0.m19768d(new C8412b(this));

        /* renamed from: p */
        private final C8442j0.C8444b f18349p = C8442j0.m19770b(new C8411a(this));

        @Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"V", "Ljg/e;", "kotlin.jvm.PlatformType", "a", "()Ljg/e;"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.c0$d$a */
        /* loaded from: classes8.dex */
        static final class C8411a extends AbstractC9973s implements Function0<AbstractC9579e<?>> {

            /* renamed from: k */
            final /* synthetic */ AbstractC8410d<V> f18350k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8411a(AbstractC8410d<V> dVar) {
                super(0);
                this.f18350k = dVar;
            }

            /* renamed from: a */
            public final AbstractC9579e<?> invoke() {
                return C8416d0.m19808a(this.f18350k, false);
            }
        }

        @Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"V", "Log/w0;", "kotlin.jvm.PlatformType", "a", "()Log/w0;"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.c0$d$b */
        /* loaded from: classes8.dex */
        static final class C8412b extends AbstractC9973s implements Function0<AbstractC11392w0> {

            /* renamed from: k */
            final /* synthetic */ AbstractC8410d<V> f18351k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8412b(AbstractC8410d<V> dVar) {
                super(0);
                this.f18351k = dVar;
            }

            /* renamed from: a */
            public final AbstractC11392w0 invoke() {
                AbstractC11392w0 h = this.f18351k.mo19569B().mo19626x().mo6436h();
                if (h != null) {
                    return h;
                }
                AbstractC11388u0 D = this.f18351k.mo19569B().mo19626x();
                AbstractC11672g.C11673a aVar = AbstractC11672g.f26044g;
                return C12659d.m6080e(D, aVar.m9048b(), aVar.m9048b());
            }
        }

        /* renamed from: C */
        public AbstractC11392w0 mo19626x() {
            T b = this.f18348o.m19764b(this, f18347q[0]);
            C9971q.m14634f(b, "<get-descriptor>(...)");
            return (AbstractC11392w0) b;
        }

        public boolean equals(Object obj) {
            return (obj instanceof AbstractC8410d) && C9971q.m14638b(mo19569B(), ((AbstractC8410d) obj).mo19569B());
        }

        @Override // kotlin.reflect.KCallable
        public String getName() {
            return "<set-" + mo19569B().getName() + '>';
        }

        public int hashCode() {
            return mo19569B().hashCode();
        }

        public String toString() {
            return "setter of " + mo19569B();
        }

        @Override // p158ig.AbstractC8453l
        /* renamed from: u */
        public AbstractC9579e<?> mo19629u() {
            T b = this.f18349p.m19764b(this, f18347q[1]);
            C9971q.m14634f(b, "<get-caller>(...)");
            return (AbstractC9579e) b;
        }
    }

    @Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"V", "Log/u0;", "kotlin.jvm.PlatformType", "a", "()Log/u0;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ig.c0$e */
    /* loaded from: classes8.dex */
    static final class C8413e extends AbstractC9973s implements Function0<AbstractC11388u0> {

        /* renamed from: k */
        final /* synthetic */ AbstractC8404c0<V> f18352k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C8413e(AbstractC8404c0<? extends V> c0Var) {
            super(0);
            this.f18352k = c0Var;
        }

        /* renamed from: a */
        public final AbstractC11388u0 invoke() {
            return this.f18352k.mo19628v().m19670w(this.f18352k.getName(), this.f18352k.m19818G());
        }
    }

    @Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m15073d2 = {"V", "Ljava/lang/reflect/Field;", "a", "()Ljava/lang/reflect/Field;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ig.c0$f */
    /* loaded from: classes8.dex */
    static final class C8414f extends AbstractC9973s implements Function0<Field> {

        /* renamed from: k */
        final /* synthetic */ AbstractC8404c0<V> f18353k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C8414f(AbstractC8404c0<? extends V> c0Var) {
            super(0);
            this.f18353k = c0Var;
        }

        /* renamed from: a */
        public final Field invoke() {
            Class<?> cls;
            AbstractC8447k f = C8488m0.f18475a.m19691f(this.f18353k.mo19626x());
            if (f instanceof AbstractC8447k.C8450c) {
                AbstractC8447k.C8450c cVar = (AbstractC8447k.C8450c) f;
                AbstractC11388u0 b = cVar.m19759b();
                AbstractC10609d.C10610a d = C10619i.m12725d(C10619i.f23511a, cVar.m19756e(), cVar.m19757d(), cVar.m19754g(), false, 8, null);
                if (d == null) {
                    return null;
                }
                AbstractC8404c0<V> c0Var = this.f18353k;
                if (C14139k.m1531e(b) || C10619i.m12723f(cVar.m19756e())) {
                    cls = c0Var.mo19628v().mo14611i().getEnclosingClass();
                } else {
                    AbstractC11346m b2 = b.mo6104b();
                    if (b2 instanceof AbstractC11313e) {
                        cls = C8503p0.m19644p((AbstractC11313e) b2);
                    } else {
                        cls = c0Var.mo19628v().mo14611i();
                    }
                }
                if (cls == null) {
                    return null;
                }
                try {
                    return cls.getDeclaredField(d.mo12733c());
                } catch (NoSuchFieldException unused) {
                    return null;
                }
            } else if (f instanceof AbstractC8447k.C8448a) {
                return ((AbstractC8447k.C8448a) f).m19762b();
            } else {
                if ((f instanceof AbstractC8447k.C8449b) || (f instanceof AbstractC8447k.C8451d)) {
                    return null;
                }
                throw new C11088q();
            }
        }
    }

    private AbstractC8404c0(AbstractC8494p pVar, String str, String str2, AbstractC11388u0 u0Var, Object obj) {
        this.f18336o = pVar;
        this.f18337p = str;
        this.f18338q = str2;
        this.f18339r = obj;
        C8442j0.C8444b<Field> b = C8442j0.m19770b(new C8414f(this));
        C9971q.m14634f(b, "lazy {\n        when (val…y -> null\n        }\n    }");
        this.f18340s = b;
        C8442j0.C8443a<AbstractC11388u0> c = C8442j0.m19769c(u0Var, new C8413e(this));
        C9971q.m14634f(c, "lazySoft(descriptorIniti…or(name, signature)\n    }");
        this.f18341t = c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public final Member m19823A() {
        if (!mo19626x().mo6432z()) {
            return null;
        }
        AbstractC8447k f = C8488m0.f18475a.m19691f(mo19626x());
        if (f instanceof AbstractC8447k.C8450c) {
            AbstractC8447k.C8450c cVar = (AbstractC8447k.C8450c) f;
            if (cVar.m19755f().m13255F()) {
                C10440a.C10442c A = cVar.m19755f().m13260A();
                if (!A.m13285A() || !A.m13272z()) {
                    return null;
                }
                return mo19628v().m19671v(cVar.m19757d().getString(A.m13273y()), cVar.m19757d().getString(A.m13274x()));
            }
        }
        return m19819F();
    }

    /* renamed from: B */
    public final Object m19822B() {
        return C9602i.m15944a(this.f18339r, mo19626x());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public final Object m19821C(Member member, Object obj, Object obj2) {
        Object obj3;
        boolean z;
        boolean z2;
        AccessibleObject accessibleObject;
        try {
            Object obj4 = f18335v;
            if ((obj == obj4 || obj2 == obj4) && mo19626x().mo6264M() == null) {
                throw new RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            if (mo19625z()) {
                obj3 = m19822B();
            } else {
                obj3 = obj;
            }
            if (obj3 != obj4) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                obj3 = null;
            }
            if (!mo19625z()) {
                obj = obj2;
            }
            if (obj != obj4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                obj = null;
            }
            if (member instanceof AccessibleObject) {
                accessibleObject = (AccessibleObject) member;
            } else {
                accessibleObject = null;
            }
            if (accessibleObject != null) {
                accessibleObject.setAccessible(C8014a.m20855a(this));
            }
            if (member == null) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(obj3);
            }
            if (member instanceof Method) {
                int length = ((Method) member).getParameterTypes().length;
                if (length == 0) {
                    return ((Method) member).invoke(null, new Object[0]);
                }
                if (length == 1) {
                    Method method = (Method) member;
                    Object[] objArr = new Object[1];
                    if (obj3 == null) {
                        Class<?> cls = ((Method) member).getParameterTypes()[0];
                        C9971q.m14634f(cls, "fieldOrMethod.parameterTypes[0]");
                        obj3 = C8503p0.m19653g(cls);
                    }
                    objArr[0] = obj3;
                    return method.invoke(null, objArr);
                } else if (length == 2) {
                    Method method2 = (Method) member;
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = obj3;
                    if (obj == null) {
                        Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                        C9971q.m14634f(cls2, "fieldOrMethod.parameterTypes[1]");
                        obj = C8503p0.m19653g(cls2);
                    }
                    objArr2[1] = obj;
                    return method2.invoke(null, objArr2);
                } else {
                    throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
                }
            } else {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
        } catch (IllegalAccessException e) {
            throw new C7590b(e);
        }
    }

    /* renamed from: D */
    public AbstractC11388u0 mo19626x() {
        AbstractC11388u0 invoke = this.f18341t.invoke();
        C9971q.m14634f(invoke, "_descriptor()");
        return invoke;
    }

    /* renamed from: E */
    public abstract AbstractC8407c<V> mo19572E();

    /* renamed from: F */
    public final Field m19819F() {
        return this.f18340s.invoke();
    }

    /* renamed from: G */
    public final String m19818G() {
        return this.f18338q;
    }

    public boolean equals(Object obj) {
        AbstractC8404c0<?> d = C8503p0.m19656d(obj);
        if (d != null && C9971q.m14638b(mo19628v(), d.mo19628v()) && C9971q.m14638b(getName(), d.getName()) && C9971q.m14638b(this.f18338q, d.f18338q) && C9971q.m14638b(this.f18339r, d.f18339r)) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.KCallable
    public String getName() {
        return this.f18337p;
    }

    public int hashCode() {
        return (((mo19628v().hashCode() * 31) + getName().hashCode()) * 31) + this.f18338q.hashCode();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isSuspend() {
        return false;
    }

    public String toString() {
        return C8462l0.f18419a.m19731g(mo19626x());
    }

    @Override // p158ig.AbstractC8453l
    /* renamed from: u */
    public AbstractC9579e<?> mo19629u() {
        return mo19572E().mo19629u();
    }

    @Override // p158ig.AbstractC8453l
    /* renamed from: v */
    public AbstractC8494p mo19628v() {
        return this.f18336o;
    }

    @Override // p158ig.AbstractC8453l
    /* renamed from: w */
    public AbstractC9579e<?> mo19627w() {
        return mo19572E().mo19627w();
    }

    @Override // p158ig.AbstractC8453l
    /* renamed from: z */
    public boolean mo19625z() {
        return !C9971q.m14638b(this.f18339r, AbstractC9947e.NO_RECEIVER);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC8404c0(AbstractC8494p container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        C9971q.m14633g(container, "container");
        C9971q.m14633g(name, "name");
        C9971q.m14633g(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC8404c0(p158ig.AbstractC8494p r8, p268og.AbstractC11388u0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.C9971q.m14633g(r8, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.C9971q.m14633g(r9, r0)
            nh.f r0 = r9.getName()
            java.lang.String r3 = r0.m10771b()
            java.lang.String r0 = "descriptor.name.asString()"
            kotlin.jvm.internal.C9971q.m14634f(r3, r0)
            ig.m0 r0 = p158ig.C8488m0.f18475a
            ig.k r0 = r0.m19691f(r9)
            java.lang.String r4 = r0.mo19753a()
            java.lang.Object r6 = kotlin.jvm.internal.AbstractC9947e.NO_RECEIVER
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p158ig.AbstractC8404c0.<init>(ig.p, og.u0):void");
    }
}
