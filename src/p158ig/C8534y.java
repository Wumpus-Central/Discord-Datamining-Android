package p158ig;

import java.lang.reflect.Member;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import nf.C11084n;
import nf.EnumC11087p;
import p107fg.AbstractC7148h;
import p158ig.AbstractC8404c0;
import p158ig.C8442j0;
import p268og.AbstractC11388u0;

@Metadata(m15074d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001#B\u0019\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cB+\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001b\u0010\"J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\u0007R:\u0010\u000e\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \u000b*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\n0\n0\t8\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, m15073d2 = {"Lig/y;", "T", "V", "Lfg/h;", "Lig/c0;", "receiver", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "invoke", "Lig/j0$b;", "Lig/y$a;", "kotlin.jvm.PlatformType", "w", "Lig/j0$b;", "_getter", "Lkotlin/Lazy;", "Ljava/lang/reflect/Member;", "x", "Lkotlin/Lazy;", "delegateSource", "H", "()Lig/y$a;", "getter", "Lig/p;", "container", "Log/u0;", "descriptor", "<init>", "(Lig/p;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lig/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ig.y */
/* loaded from: classes8.dex */
public class C8534y<T, V> extends AbstractC8404c0<V> implements AbstractC7148h<T, V> {

    /* renamed from: w */
    private final C8442j0.C8444b<C8535a<T, V>> f18548w;

    /* renamed from: x */
    private final Lazy<Member> f18549x;

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0006\b\u0003\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0006\u001a\u00028\u00032\u0006\u0010\u0005\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m15073d2 = {"Lig/y$a;", "T", "V", "Lig/c0$c;", "Lfg/h$a;", "receiver", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lig/y;", "r", "Lig/y;", "D", "()Lig/y;", "property", "<init>", "(Lig/y;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ig.y$a */
    /* loaded from: classes8.dex */
    public static final class C8535a<T, V> extends AbstractC8404c0.AbstractC8407c<V> implements AbstractC7148h.AbstractC7149a<T, V> {

        /* renamed from: r */
        private final C8534y<T, V> f18550r;

        /* JADX WARN: Multi-variable type inference failed */
        public C8535a(C8534y<T, ? extends V> property) {
            C9971q.m14633g(property, "property");
            this.f18550r = property;
        }

        /* renamed from: D */
        public C8534y<T, V> mo14596i() {
            return this.f18550r;
        }

        @Override // kotlin.jvm.functions.Function1
        public V invoke(T t) {
            return mo14596i().get(t);
        }
    }

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \u0003*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"T", "V", "Lig/y$a;", "kotlin.jvm.PlatformType", "a", "()Lig/y$a;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ig.y$b */
    /* loaded from: classes8.dex */
    static final class C8536b extends AbstractC9973s implements Function0<C8535a<T, ? extends V>> {

        /* renamed from: k */
        final /* synthetic */ C8534y<T, V> f18551k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C8536b(C8534y<T, ? extends V> yVar) {
            super(0);
            this.f18551k = yVar;
        }

        /* renamed from: a */
        public final C8535a<T, V> invoke() {
            return new C8535a<>(this.f18551k);
        }
    }

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"T", "V", "Ljava/lang/reflect/Member;", "a", "()Ljava/lang/reflect/Member;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ig.y$c */
    /* loaded from: classes8.dex */
    static final class C8537c extends AbstractC9973s implements Function0<Member> {

        /* renamed from: k */
        final /* synthetic */ C8534y<T, V> f18552k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C8537c(C8534y<T, ? extends V> yVar) {
            super(0);
            this.f18552k = yVar;
        }

        /* renamed from: a */
        public final Member invoke() {
            return this.f18552k.m19823A();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8534y(AbstractC8494p container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Lazy<Member> b;
        C9971q.m14633g(container, "container");
        C9971q.m14633g(name, "name");
        C9971q.m14633g(signature, "signature");
        C8442j0.C8444b<C8535a<T, V>> b2 = C8442j0.m19770b(new C8536b(this));
        C9971q.m14634f(b2, "lazy { Getter(this) }");
        this.f18548w = b2;
        b = C11084n.m10944b(EnumC11087p.PUBLICATION, new C8537c(this));
        this.f18549x = b;
    }

    /* renamed from: H */
    public C8535a<T, V> mo14597f() {
        C8535a<T, V> invoke = this.f18548w.invoke();
        C9971q.m14634f(invoke, "_getter()");
        return invoke;
    }

    @Override // p107fg.AbstractC7148h
    public V get(T t) {
        return mo14597f().call(t);
    }

    @Override // kotlin.jvm.functions.Function1
    public V invoke(T t) {
        return get(t);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8534y(AbstractC8494p container, AbstractC11388u0 descriptor) {
        super(container, descriptor);
        Lazy<Member> b;
        C9971q.m14633g(container, "container");
        C9971q.m14633g(descriptor, "descriptor");
        C8442j0.C8444b<C8535a<T, V>> b2 = C8442j0.m19770b(new C8536b(this));
        C9971q.m14634f(b2, "lazy { Getter(this) }");
        this.f18548w = b2;
        b = C11084n.m10944b(EnumC11087p.PUBLICATION, new C8537c(this));
        this.f18549x = b;
    }
}
