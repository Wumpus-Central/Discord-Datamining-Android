package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.Decoder;
import p449yi.C14436g;

@Metadata(m15074d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0012\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b6\u00107J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J/\u0010#\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u0010\u0010'\u001a\u00020&2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u0016\u0010)\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0016\u0010*\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0016\u0010+\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0016\u0010,\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0016\u0010-\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0016\u0010.\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0016\u0010/\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0016\u00100\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0016\u00101\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0018\u00102\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eH\u0016J=\u00103\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001f2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\b\u0010\"\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b3\u00104JC\u00105\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001f*\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000e2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000 2\b\u0010\"\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b5\u00104¨\u00068"}, m15073d2 = {"Lkotlinx/serialization/encoding/a;", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/c;", "", "J", "", "D", "", "j", "w", "", "H", "", "s", "", "h", "", "l", "", "t", "", "v", "", "x", "", "z", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "enumDescriptor", "e", "descriptor", "q", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "previousValue", "I", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "b", "", "c", "index", "C", "B", "E", "i", "f", "u", "F", "A", "m", "r", "y", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "n", "<init>", "()V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.encoding.a */
/* loaded from: classes8.dex */
public abstract class AbstractC10246a implements Decoder, AbstractC10248c {
    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: A */
    public final char mo13863A(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        return mo13895x();
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: B */
    public final byte mo13862B(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        return mo13908H();
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: C */
    public final boolean mo13861C(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        return mo13896w();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: D */
    public boolean mo13910D() {
        return true;
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: E */
    public final short mo13860E(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        return mo13899s();
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: F */
    public final double mo13859F(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        return mo13897v();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: G */
    public <T> T mo13909G(DeserializationStrategy<? extends T> deserializationStrategy) {
        return (T) Decoder.C10244a.m13918a(this, deserializationStrategy);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: H */
    public abstract byte mo13908H();

    /* renamed from: I */
    public <T> T m13907I(DeserializationStrategy<? extends T> deserializer, T t) {
        C9971q.m14633g(deserializer, "deserializer");
        return (T) mo13909G(deserializer);
    }

    /* renamed from: J */
    public Object m13906J() {
        throw new C14436g(C9951f0.m14684b(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: b */
    public AbstractC10248c mo13905b(SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
        return this;
    }

    /* renamed from: c */
    public void mo13857c(SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: e */
    public int mo13904e(SerialDescriptor enumDescriptor) {
        C9971q.m14633g(enumDescriptor, "enumDescriptor");
        Object J = m13906J();
        C9971q.m14635e(J, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) J).intValue();
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: f */
    public final long mo13856f(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        return mo13901l();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: h */
    public abstract int mo13903h();

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: i */
    public final int mo13855i(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        return mo13903h();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: j */
    public Void mo13902j() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: k */
    public int mo13854k(SerialDescriptor serialDescriptor) {
        return AbstractC10248c.C10249a.m13846a(this, serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: l */
    public abstract long mo13901l();

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: m */
    public final String mo13853m(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        return mo13894z();
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: n */
    public final <T> T mo13852n(SerialDescriptor descriptor, int i, DeserializationStrategy<? extends T> deserializer, T t) {
        C9971q.m14633g(descriptor, "descriptor");
        C9971q.m14633g(deserializer, "deserializer");
        if (deserializer.getDescriptor().mo13683b() || mo13910D()) {
            return (T) m13907I(deserializer, t);
        }
        return (T) mo13902j();
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: p */
    public boolean mo13850p() {
        return AbstractC10248c.C10249a.m13845b(this);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: q */
    public Decoder mo13900q(SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: r */
    public Decoder mo13849r(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        return mo13900q(descriptor.mo13677h(i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: s */
    public abstract short mo13899s();

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: t */
    public float mo13898t() {
        Object J = m13906J();
        C9971q.m14635e(J, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) J).floatValue();
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: u */
    public final float mo13848u(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        return mo13898t();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: v */
    public double mo13897v() {
        Object J = m13906J();
        C9971q.m14635e(J, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) J).doubleValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: w */
    public boolean mo13896w() {
        Object J = m13906J();
        C9971q.m14635e(J, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) J).booleanValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: x */
    public char mo13895x() {
        Object J = m13906J();
        C9971q.m14635e(J, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) J).charValue();
    }

    /* renamed from: y */
    public <T> T mo13847y(SerialDescriptor descriptor, int i, DeserializationStrategy<? extends T> deserializer, T t) {
        C9971q.m14633g(descriptor, "descriptor");
        C9971q.m14633g(deserializer, "deserializer");
        return (T) m13907I(deserializer, t);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: z */
    public String mo13894z() {
        Object J = m13906J();
        C9971q.m14635e(J, "null cannot be cast to non-null type kotlin.String");
        return (String) J;
    }
}
