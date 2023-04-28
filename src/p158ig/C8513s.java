package p158ig;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import p107fg.AbstractC7142e;
import p158ig.AbstractC8404c0;
import p158ig.C8442j0;
import p268og.AbstractC11388u0;

@Metadata(m15074d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u001fB\u0019\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B+\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0017\u0010\u001eJ\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\b\u0010\tR:\u0010\u000f\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \f*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000b0\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, m15073d2 = {"Lig/s;", "T", "V", "Lig/y;", "Lfg/e;", "receiver", "value", "", "J", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lig/j0$b;", "Lig/s$a;", "kotlin.jvm.PlatformType", "y", "Lig/j0$b;", "_setter", "I", "()Lig/s$a;", "setter", "Lig/p;", "container", "Log/u0;", "descriptor", "<init>", "(Lig/p;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lig/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ig.s */
/* loaded from: classes8.dex */
public final class C8513s<T, V> extends C8534y<T, V> implements AbstractC7142e<T, V> {

    /* renamed from: y */
    private final C8442j0.C8444b<C8514a<T, V>> f18511y;

    @Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m15073d2 = {"Lig/s$a;", "T", "V", "Lig/c0$d;", "Lfg/e$a;", "receiver", "value", "", "E", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lig/s;", "r", "Lig/s;", "D", "()Lig/s;", "property", "<init>", "(Lig/s;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ig.s$a */
    /* loaded from: classes8.dex */
    public static final class C8514a<T, V> extends AbstractC8404c0.AbstractC8410d<V> implements AbstractC7142e.AbstractC7143a<T, V> {

        /* renamed from: r */
        private final C8513s<T, V> f18512r;

        public C8514a(C8513s<T, V> property) {
            C9971q.m14633g(property, "property");
            this.f18512r = property;
        }

        /* renamed from: D */
        public C8513s<T, V> mo14596i() {
            return this.f18512r;
        }

        /* renamed from: E */
        public void m19612E(T t, V v) {
            mo14596i().m19614J(t, v);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2) {
            m19612E(obj, obj2);
            return Unit.f22042a;
        }
    }

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \u0003*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"T", "V", "Lig/s$a;", "kotlin.jvm.PlatformType", "a", "()Lig/s$a;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ig.s$b */
    /* loaded from: classes8.dex */
    static final class C8515b extends AbstractC9973s implements Function0<C8514a<T, V>> {

        /* renamed from: k */
        final /* synthetic */ C8513s<T, V> f18513k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8515b(C8513s<T, V> sVar) {
            super(0);
            this.f18513k = sVar;
        }

        /* renamed from: a */
        public final C8514a<T, V> invoke() {
            return new C8514a<>(this.f18513k);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8513s(AbstractC8494p container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        C9971q.m14633g(container, "container");
        C9971q.m14633g(name, "name");
        C9971q.m14633g(signature, "signature");
        C8442j0.C8444b<C8514a<T, V>> b = C8442j0.m19770b(new C8515b(this));
        C9971q.m14634f(b, "lazy { Setter(this) }");
        this.f18511y = b;
    }

    /* renamed from: I */
    public C8514a<T, V> mo14612h() {
        C8514a<T, V> invoke = this.f18511y.invoke();
        C9971q.m14634f(invoke, "_setter()");
        return invoke;
    }

    /* renamed from: J */
    public void m19614J(T t, V v) {
        mo14612h().call(t, v);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8513s(AbstractC8494p container, AbstractC11388u0 descriptor) {
        super(container, descriptor);
        C9971q.m14633g(container, "container");
        C9971q.m14633g(descriptor, "descriptor");
        C8442j0.C8444b<C8514a<T, V>> b = C8442j0.m19770b(new C8515b(this));
        C9971q.m14634f(b, "lazy { Setter(this) }");
        this.f18511y = b;
    }
}
