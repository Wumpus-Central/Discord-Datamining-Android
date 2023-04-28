package p158ig;

import java.lang.reflect.Member;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9971q;
import nf.C11084n;
import nf.EnumC11087p;
import p158ig.AbstractC8404c0;
import p158ig.C8442j0;
import p268og.AbstractC11388u0;

@Metadata(m15074d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\u001fB\u0019\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\b\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\tRF\u0010\u0010\u001a4\u00120\u0012.\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002 \r*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\f0\f0\u000b8\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R&\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006 "}, m15073d2 = {"Lig/z;", "D", "E", "V", "", "Lig/c0;", "receiver1", "receiver2", "H", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "invoke", "Lig/j0$b;", "Lig/z$a;", "kotlin.jvm.PlatformType", "w", "Lig/j0$b;", "_getter", "Lkotlin/Lazy;", "Ljava/lang/reflect/Member;", "x", "Lkotlin/Lazy;", "delegateSource", "I", "()Lig/z$a;", "getter", "Lig/p;", "container", "Log/u0;", "descriptor", "<init>", "(Lig/p;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "a", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ig.z */
/* loaded from: classes8.dex */
public class C8538z<D, E, V> extends AbstractC8404c0<V> implements Function2 {

    /* renamed from: w */
    private final C8442j0.C8444b<C8539a<D, E, V>> f18553w;

    /* renamed from: x */
    private final Lazy<Member> f18554x;

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0006\b\u0005\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\n¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\b\u001a\u00028\u00052\u0006\u0010\u0006\u001a\u00028\u00032\u0006\u0010\u0007\u001a\u00028\u0004H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR,\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0001\u0010\r¨\u0006\u0011"}, m15073d2 = {"Lig/z$a;", "D", "E", "V", "Lig/c0$c;", "", "receiver1", "receiver2", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lig/z;", "r", "Lig/z;", "()Lig/z;", "property", "<init>", "(Lig/z;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ig.z$a */
    /* loaded from: classes8.dex */
    public static final class C8539a<D, E, V> extends AbstractC8404c0.AbstractC8407c<V> implements Function2 {

        /* renamed from: r */
        private final C8538z<D, E, V> f18555r;

        /* JADX WARN: Multi-variable type inference failed */
        public C8539a(C8538z<D, E, ? extends V> property) {
            C9971q.m14633g(property, "property");
            this.f18555r = property;
        }

        /* renamed from: D */
        public C8538z<D, E, V> mo14596i() {
            return this.f18555r;
        }

        @Override // kotlin.jvm.functions.Function2
        public V invoke(D d, E e) {
            return mo14596i().m19571H(d, e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8538z(AbstractC8494p container, AbstractC11388u0 descriptor) {
        super(container, descriptor);
        Lazy<Member> b;
        C9971q.m14633g(container, "container");
        C9971q.m14633g(descriptor, "descriptor");
        C8442j0.C8444b<C8539a<D, E, V>> b2 = C8442j0.m19770b(new C8396a0(this));
        C9971q.m14634f(b2, "lazy { Getter(this) }");
        this.f18553w = b2;
        b = C11084n.m10944b(EnumC11087p.PUBLICATION, new C8398b0(this));
        this.f18554x = b;
    }

    /* renamed from: H */
    public V m19571H(D d, E e) {
        return mo14597f().call(d, e);
    }

    /* renamed from: I */
    public C8539a<D, E, V> mo14597f() {
        C8539a<D, E, V> invoke = this.f18553w.invoke();
        C9971q.m14634f(invoke, "_getter()");
        return invoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public V invoke(D d, E e) {
        return m19571H(d, e);
    }
}
