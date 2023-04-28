package bj;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C9906j;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.Decoder;
import p449yi.C14436g;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:80)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:58)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:52)
    */
@Metadata(m15074d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\be\u0010fJ+\u0010\b\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00028\u0000*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH$¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010-\u001a\u00020\nH\u0014¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u00100\u001a\u00020\nH\u0014¢\u0006\u0004\b1\u00102J-\u00106\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00132\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u0001032\b\u00105\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b6\u00107J\u000e\u00109\u001a\u00020\u00022\u0006\u00108\u001a\u00020\nJ\b\u0010:\u001a\u00020\u0012H\u0016J\b\u0010<\u001a\u0004\u0018\u00010;J\u0006\u0010=\u001a\u00020\u0012J\u0006\u0010>\u001a\u00020\u0016J\u0006\u0010?\u001a\u00020\u0019J\u0006\u0010@\u001a\u00020\u000bJ\u0006\u0010A\u001a\u00020\u001eJ\u0006\u0010B\u001a\u00020!J\u0006\u0010C\u001a\u00020$J\u0006\u0010D\u001a\u00020'J\u0006\u0010E\u001a\u00020*J\u000e\u0010F\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\nJ\u0010\u0010H\u001a\u00020G2\u0006\u00108\u001a\u00020\nH\u0016J\u0016\u0010I\u001a\u00020\u00122\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010J\u001a\u00020\u00162\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\u0004\u001a\u00020\u00192\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010K\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010L\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010M\u001a\u00020!2\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010N\u001a\u00020$2\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010O\u001a\u00020'2\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010P\u001a\u00020*2\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010Q\u001a\u00020\u00022\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ;\u0010R\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00132\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u0001032\b\u00105\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\bR\u0010SJC\u0010T\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u0013*\u00020\u000f2\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u0001032\b\u00105\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\bT\u0010SJ\u0017\u0010V\u001a\u00020G2\u0006\u0010U\u001a\u00028\u0000H\u0004¢\u0006\u0004\bV\u0010WJ\u0016\u0010Y\u001a\u00020G2\f\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0004J\u000f\u0010Z\u001a\u00028\u0000H\u0004¢\u0006\u0004\bZ\u0010[R$\u0010`\u001a\u0012\u0012\u0004\u0012\u00028\u00000\\j\b\u0012\u0004\u0012\u00028\u0000`]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010b\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010ZR\u0016\u0010d\u001a\u0004\u0018\u00018\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bc\u0010[¨\u0006g"}, m15073d2 = {"Lbj/b2;", "Tag", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/c;", "E", "tag", "Lkotlin/Function0;", "block", "b0", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "Y", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/Object;", "", "W", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "T", "(Ljava/lang/Object;)Z", "K", "", "L", "(Ljava/lang/Object;)B", "", "U", "(Ljava/lang/Object;)S", "R", "(Ljava/lang/Object;)I", "", "S", "(Ljava/lang/Object;)J", "", "P", "(Ljava/lang/Object;)F", "", "N", "(Ljava/lang/Object;)D", "", "M", "(Ljava/lang/Object;)C", "", "V", "(Ljava/lang/Object;)Ljava/lang/String;", "enumDescriptor", "O", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "inlineDescriptor", "Q", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "previousValue", "J", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "descriptor", "q", "D", "", "j", "w", "H", "s", "h", "l", "t", "v", "x", "z", "e", "", "c", "C", "B", "i", "f", "u", "F", "A", "m", "r", "y", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "n", "name", "a0", "(Ljava/lang/Object;)V", "other", "I", "Z", "()Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "tagStack", "b", "flag", "X", "currentTagOrNull", "<init>", "()V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.b2 */
/* loaded from: classes8.dex */
public abstract class AbstractC3627b2<Tag> implements Decoder, AbstractC10248c {

    /* renamed from: a */
    private final ArrayList<Tag> f5924a = new ArrayList<>();

    /* renamed from: b */
    private boolean f5925b;

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"<anonymous>", "T", "", "Tag", "invoke", "()Ljava/lang/Object;"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: bj.b2$a */
    /* loaded from: classes8.dex */
    static final class C3628a extends AbstractC9973s implements Function0<T> {

        /* renamed from: k */
        final /* synthetic */ AbstractC3627b2<Tag> f5926k;

        /* renamed from: l */
        final /* synthetic */ DeserializationStrategy<T> f5927l;

        /* renamed from: m */
        final /* synthetic */ T f5928m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C3628a(AbstractC3627b2<Tag> b2Var, DeserializationStrategy<? extends T> deserializationStrategy, T t) {
            super(0);
            this.f5926k = b2Var;
            this.f5927l = deserializationStrategy;
            this.f5928m = t;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Void, T] */
        /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            if (this.f5926k.mo13910D()) {
                return this.f5926k.m33949J(this.f5927l, this.f5928m);
            }
            return this.f5926k.mo13902j();
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"<anonymous>", "T", "Tag", "invoke", "()Ljava/lang/Object;"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: bj.b2$b */
    /* loaded from: classes8.dex */
    static final class C3629b extends AbstractC9973s implements Function0<T> {

        /* renamed from: k */
        final /* synthetic */ AbstractC3627b2<Tag> f5929k;

        /* renamed from: l */
        final /* synthetic */ DeserializationStrategy<T> f5930l;

        /* renamed from: m */
        final /* synthetic */ T f5931m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C3629b(AbstractC3627b2<Tag> b2Var, DeserializationStrategy<? extends T> deserializationStrategy, T t) {
            super(0);
            this.f5929k = b2Var;
            this.f5930l = deserializationStrategy;
            this.f5931m = t;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return this.f5929k.m33949J(this.f5930l, this.f5931m);
        }
    }

    public AbstractC3627b2() {
    }

    /* renamed from: b0 */
    private final <E> E m33944b0(Tag tag, Function0<? extends E> function0) {
        m33945a0(tag);
        E e = (E) function0.invoke();
        if (!this.f5925b) {
            m33946Z();
        }
        this.f5925b = false;
        return e;
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: A */
    public final char mo13863A(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        return mo23882M(mo33947Y(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: B */
    public final byte mo13862B(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        return mo23883L(mo33947Y(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: C */
    public final boolean mo13861C(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        return mo23884K(mo33947Y(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: D */
    public boolean mo13910D() {
        Tag X = m33948X();
        if (X == null) {
            return false;
        }
        return mo33012T(X);
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: E */
    public final short mo13860E(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        return mo23877U(mo33947Y(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: F */
    public final double mo13859F(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        return mo23881N(mo33947Y(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: G */
    public abstract <T> T mo13909G(DeserializationStrategy<? extends T> deserializationStrategy);

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: H */
    public final byte mo13908H() {
        return mo23883L(m33946Z());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public final void m33950I(AbstractC3627b2<Tag> other) {
        C9971q.m14633g(other, "other");
        other.f5924a.addAll(this.f5924a);
    }

    /* renamed from: J */
    protected <T> T m33949J(DeserializationStrategy<? extends T> deserializer, T t) {
        C9971q.m14633g(deserializer, "deserializer");
        return (T) mo13909G(deserializer);
    }

    /* renamed from: K */
    protected abstract boolean mo23884K(Tag tag);

    /* renamed from: L */
    protected abstract byte mo23883L(Tag tag);

    /* renamed from: M */
    protected abstract char mo23882M(Tag tag);

    /* renamed from: N */
    protected abstract double mo23881N(Tag tag);

    /* renamed from: O */
    protected abstract int mo23889O(Tag tag, SerialDescriptor serialDescriptor);

    /* renamed from: P */
    protected abstract float mo23880P(Tag tag);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Q */
    public Decoder mo33013Q(Tag tag, SerialDescriptor inlineDescriptor) {
        C9971q.m14633g(inlineDescriptor, "inlineDescriptor");
        m33945a0(tag);
        return this;
    }

    /* renamed from: R */
    protected abstract int mo23879R(Tag tag);

    /* renamed from: S */
    protected abstract long mo23878S(Tag tag);

    /* renamed from: T */
    protected boolean mo33012T(Tag tag) {
        return true;
    }

    /* renamed from: U */
    protected abstract short mo23877U(Tag tag);

    /* renamed from: V */
    protected String mo33011V(Tag tag) {
        Object W = mo23888W(tag);
        C9971q.m14635e(W, "null cannot be cast to non-null type kotlin.String");
        return (String) W;
    }

    /* renamed from: W */
    protected Object mo23888W(Tag tag) {
        throw new C14436g(C9951f0.m14684b(getClass()) + " can't retrieve untyped values");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: X */
    public final Tag m33948X() {
        Object i0;
        i0 = C9914r.m14756i0(this.f5924a);
        return (Tag) i0;
    }

    /* renamed from: Y */
    protected abstract Tag mo33947Y(SerialDescriptor serialDescriptor, int i);

    /* renamed from: Z */
    protected final Tag m33946Z() {
        int k;
        ArrayList<Tag> arrayList = this.f5924a;
        k = C9906j.m14818k(arrayList);
        Tag remove = arrayList.remove(k);
        this.f5925b = true;
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a0 */
    public final void m33945a0(Tag tag) {
        this.f5924a.add(tag);
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: c */
    public void mo13857c(SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: e */
    public final int mo13904e(SerialDescriptor enumDescriptor) {
        C9971q.m14633g(enumDescriptor, "enumDescriptor");
        return mo23889O(m33946Z(), enumDescriptor);
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: f */
    public final long mo13856f(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        return mo23878S(mo33947Y(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: h */
    public final int mo13903h() {
        return mo23879R(m33946Z());
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: i */
    public final int mo13855i(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        return mo23879R(mo33947Y(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: j */
    public final Void mo13902j() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: k */
    public int mo13854k(SerialDescriptor serialDescriptor) {
        return AbstractC10248c.C10249a.m13846a(this, serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: l */
    public final long mo13901l() {
        return mo23878S(m33946Z());
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: m */
    public final String mo13853m(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        return mo33011V(mo33947Y(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: n */
    public final <T> T mo13852n(SerialDescriptor descriptor, int i, DeserializationStrategy<? extends T> deserializer, T t) {
        C9971q.m14633g(descriptor, "descriptor");
        C9971q.m14633g(deserializer, "deserializer");
        return (T) m33944b0(mo33947Y(descriptor, i), new C3628a(this, deserializer, t));
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: p */
    public boolean mo13850p() {
        return AbstractC10248c.C10249a.m13845b(this);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: q */
    public final Decoder mo13900q(SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
        return mo33013Q(m33946Z(), descriptor);
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: r */
    public final Decoder mo13849r(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        return mo33013Q(mo33947Y(descriptor, i), descriptor.mo13677h(i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: s */
    public final short mo13899s() {
        return mo23877U(m33946Z());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: t */
    public final float mo13898t() {
        return mo23880P(m33946Z());
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: u */
    public final float mo13848u(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        return mo23880P(mo33947Y(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: v */
    public final double mo13897v() {
        return mo23881N(m33946Z());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: w */
    public final boolean mo13896w() {
        return mo23884K(m33946Z());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: x */
    public final char mo13895x() {
        return mo23882M(m33946Z());
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: y */
    public final <T> T mo13847y(SerialDescriptor descriptor, int i, DeserializationStrategy<? extends T> deserializer, T t) {
        C9971q.m14633g(descriptor, "descriptor");
        C9971q.m14633g(deserializer, "deserializer");
        return (T) m33944b0(mo33947Y(descriptor, i), new C3629b(this, deserializer, t));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: z */
    public final String mo13894z() {
        return mo33011V(m33946Z());
    }
}
