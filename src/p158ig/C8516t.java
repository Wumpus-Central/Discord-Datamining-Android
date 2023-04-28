package p158ig;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9971q;
import p107fg.AbstractC7140d;
import p158ig.AbstractC8404c0;
import p158ig.C8442j0;
import p268og.AbstractC11388u0;

@Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\u001bB\u0019\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bRF\u0010\u0011\u001a4\u00120\u0012.\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002 \u000e*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\r0\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, m15073d2 = {"Lig/t;", "D", "E", "V", "Lig/z;", "", "receiver1", "receiver2", "value", "", "K", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Lig/j0$b;", "Lig/t$a;", "kotlin.jvm.PlatformType", "y", "Lig/j0$b;", "_setter", "J", "()Lig/t$a;", "setter", "Lig/p;", "container", "Log/u0;", "descriptor", "<init>", "(Lig/p;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "a", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ig.t */
/* loaded from: classes8.dex */
public final class C8516t<D, E, V> extends C8538z<D, E, V> implements AbstractC7140d {

    /* renamed from: y */
    private final C8442j0.C8444b<C8517a<D, E, V>> f18514y;

    @Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u000b¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00032\u0006\u0010\u0007\u001a\u00028\u00042\u0006\u0010\b\u001a\u00028\u0005H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\nR,\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0001\u0010\u000e¨\u0006\u0012"}, m15073d2 = {"Lig/t$a;", "D", "E", "V", "Lig/c0$d;", "", "receiver1", "receiver2", "value", "", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Lig/t;", "r", "Lig/t;", "()Lig/t;", "property", "<init>", "(Lig/t;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ig.t$a */
    /* loaded from: classes8.dex */
    public static final class C8517a<D, E, V> extends AbstractC8404c0.AbstractC8410d<V> implements Function3 {

        /* renamed from: r */
        private final C8516t<D, E, V> f18515r;

        public C8517a(C8516t<D, E, V> property) {
            C9971q.m14633g(property, "property");
            this.f18515r = property;
        }

        /* renamed from: D */
        public C8516t<D, E, V> mo14596i() {
            return this.f18515r;
        }

        /* renamed from: E */
        public void m19607E(D d, E e, V v) {
            mo14596i().m19609K(d, e, v);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m19607E(obj, obj2, obj3);
            return Unit.f22042a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8516t(AbstractC8494p container, AbstractC11388u0 descriptor) {
        super(container, descriptor);
        C9971q.m14633g(container, "container");
        C9971q.m14633g(descriptor, "descriptor");
        C8442j0.C8444b<C8517a<D, E, V>> b = C8442j0.m19770b(new C8518u(this));
        C9971q.m14634f(b, "lazy { Setter(this) }");
        this.f18514y = b;
    }

    /* renamed from: J */
    public C8517a<D, E, V> mo14612h() {
        C8517a<D, E, V> invoke = this.f18514y.invoke();
        C9971q.m14634f(invoke, "_setter()");
        return invoke;
    }

    /* renamed from: K */
    public void m19609K(D d, E e, V v) {
        mo14612h().call(d, e, v);
    }
}
