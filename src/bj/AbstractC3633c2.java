package bj;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C9906j;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import p449yi.AbstractC14437h;
import p449yi.C14436g;

@Metadata(m15074d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\bb\u0010cJ\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001b\u0010\n\u001a\u00028\u0000*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H$¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020 H\u0014¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020#H\u0014¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\bH\u0014¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020(H\u0014¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020+H\u0014¢\u0006\u0004\b,\u0010-J'\u00100\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0006H\u0014¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u00020\u00022\u0006\u0010\f\u001a\u00028\u00002\u0006\u00102\u001a\u00020\u0004H\u0014¢\u0006\u0004\b3\u00104J\u000e\u00106\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0004J\b\u00107\u001a\u00020\u000fH\u0016J\b\u00108\u001a\u00020\u000fH\u0016J\u000e\u00109\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\bJ\u000e\u0010:\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0017J\u000e\u0010;\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u001aJ\u000e\u0010<\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010=\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u001dJ\u000e\u0010>\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020 J\u000e\u0010?\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020#J\u000e\u0010@\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020(J\u000e\u0010A\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020+J\u0016\u0010B\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010C\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u0004H\u0016J\u000e\u0010D\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u0004J\u0010\u0010E\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u0004H\u0014J\u001e\u0010F\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bJ\u001e\u0010G\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0017J\u001e\u0010H\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001aJ\u001e\u0010I\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J\u001e\u0010J\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001dJ\u001e\u0010K\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020 J\u001e\u0010L\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020#J\u001e\u0010M\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020(J\u001e\u0010N\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020+J\u0016\u0010O\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J;\u0010R\u001a\u00020\u000f\"\u0004\b\u0001\u0010\u001b2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00010P2\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\bR\u0010SJA\u0010T\u001a\u00020\u000f\"\b\b\u0001\u0010\u001b*\u00020\r2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00010P2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\bT\u0010SJ\u0017\u0010V\u001a\u00020\u000f2\u0006\u0010U\u001a\u00028\u0000H\u0004¢\u0006\u0004\bV\u0010\u0013J\u000f\u0010W\u001a\u00028\u0000H\u0004¢\u0006\u0004\bW\u0010XR$\u0010]\u001a\u0012\u0012\u0004\u0012\u00028\u00000Yj\b\u0012\u0004\u0012\u00028\u0000`Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010_\u001a\u00028\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b^\u0010XR\u0016\u0010a\u001a\u0004\u0018\u00018\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b`\u0010X¨\u0006d"}, m15073d2 = {"Lbj/c2;", "Tag", "Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "desc", "", "index", "", "G", "Z", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/Object;", "tag", "", "value", "", "V", "(Ljava/lang/Object;Ljava/lang/Object;)V", "R", "(Ljava/lang/Object;)V", "S", "P", "(Ljava/lang/Object;I)V", "", "J", "(Ljava/lang/Object;B)V", "", "T", "(Ljava/lang/Object;S)V", "", "Q", "(Ljava/lang/Object;J)V", "", "N", "(Ljava/lang/Object;F)V", "", "L", "(Ljava/lang/Object;D)V", "I", "(Ljava/lang/Object;Z)V", "", "K", "(Ljava/lang/Object;C)V", "", "U", "(Ljava/lang/Object;Ljava/lang/String;)V", "enumDescriptor", "ordinal", "M", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "inlineDescriptor", "O", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "descriptor", "j", "w", "m", "q", "g", "o", "B", "k", "u", "f", "v", "F", "i", "b", "c", "W", "y", "n", "C", "x", "E", "s", "D", "l", "z", "e", "Lyi/h;", "serializer", "t", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V", "p", "name", "b0", "a0", "()Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "tagStack", "X", "currentTag", "Y", "currentTagOrNull", "<init>", "()V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.c2 */
/* loaded from: classes8.dex */
public abstract class AbstractC3633c2<Tag> implements Encoder, CompositeEncoder {

    /* renamed from: a */
    private final ArrayList<Tag> f5932a = new ArrayList<>();

    /* renamed from: G */
    private final boolean m33936G(SerialDescriptor serialDescriptor, int i) {
        m33918b0(mo33920Z(serialDescriptor, i));
        return true;
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: A */
    public boolean mo13893A(SerialDescriptor serialDescriptor, int i) {
        return CompositeEncoder.C10243a.m13919a(this, serialDescriptor, i);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: B */
    public final void mo13892B(int i) {
        m33928P(m33919a0(), i);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: C */
    public final void mo13891C(SerialDescriptor descriptor, int i, short s) {
        C9971q.m14633g(descriptor, "descriptor");
        m33925T(mo33920Z(descriptor, i), s);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: D */
    public final void mo13890D(SerialDescriptor descriptor, int i, double d) {
        C9971q.m14633g(descriptor, "descriptor");
        m33931L(mo33920Z(descriptor, i), d);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: E */
    public final void mo13889E(SerialDescriptor descriptor, int i, long j) {
        C9971q.m14633g(descriptor, "descriptor");
        m33927Q(mo33920Z(descriptor, i), j);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: F */
    public final void mo13888F(String value) {
        C9971q.m14633g(value, "value");
        m33924U(m33919a0(), value);
    }

    /* renamed from: H */
    public <T> void m33935H(AbstractC14437h<? super T> hVar, T t) {
        Encoder.C10245a.m13912c(this, hVar, t);
    }

    /* renamed from: I */
    protected void m33934I(Tag tag, boolean z) {
        mo23864V(tag, Boolean.valueOf(z));
    }

    /* renamed from: J */
    protected void m33933J(Tag tag, byte b) {
        mo23864V(tag, Byte.valueOf(b));
    }

    /* renamed from: K */
    protected void m33932K(Tag tag, char c) {
        mo23864V(tag, Character.valueOf(c));
    }

    /* renamed from: L */
    protected void m33931L(Tag tag, double d) {
        mo23864V(tag, Double.valueOf(d));
    }

    /* renamed from: M */
    protected abstract void mo23866M(Tag tag, SerialDescriptor serialDescriptor, int i);

    /* renamed from: N */
    protected void m33930N(Tag tag, float f) {
        mo23864V(tag, Float.valueOf(f));
    }

    /* renamed from: O */
    protected Encoder m33929O(Tag tag, SerialDescriptor inlineDescriptor) {
        C9971q.m14633g(inlineDescriptor, "inlineDescriptor");
        m33918b0(tag);
        return this;
    }

    /* renamed from: P */
    protected void m33928P(Tag tag, int i) {
        mo23864V(tag, Integer.valueOf(i));
    }

    /* renamed from: Q */
    protected void m33927Q(Tag tag, long j) {
        mo23864V(tag, Long.valueOf(j));
    }

    /* renamed from: R */
    protected void m33926R(Tag tag) {
    }

    /* renamed from: S */
    protected abstract void mo23865S(Tag tag);

    /* renamed from: T */
    protected void m33925T(Tag tag, short s) {
        mo23864V(tag, Short.valueOf(s));
    }

    /* renamed from: U */
    protected void m33924U(Tag tag, String value) {
        C9971q.m14633g(value, "value");
        mo23864V(tag, value);
    }

    /* renamed from: V */
    protected abstract void mo23864V(Tag tag, Object obj);

    /* renamed from: W */
    protected void m33923W(SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
    }

    /* renamed from: X */
    protected final Tag m33922X() {
        Object g0;
        g0 = C9914r.m14758g0(this.f5932a);
        return (Tag) g0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Y */
    public final Tag m33921Y() {
        Object i0;
        i0 = C9914r.m14756i0(this.f5932a);
        return (Tag) i0;
    }

    /* renamed from: Z */
    protected abstract Tag mo33920Z(SerialDescriptor serialDescriptor, int i);

    /* renamed from: a0 */
    protected final Tag m33919a0() {
        int k;
        if (!this.f5932a.isEmpty()) {
            ArrayList<Tag> arrayList = this.f5932a;
            k = C9906j.m14818k(arrayList);
            return arrayList.remove(k);
        }
        throw new C14436g("No tag in stack for requested element");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: b */
    public CompositeEncoder mo13885b(SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
        return this;
    }

    /* renamed from: b0 */
    protected final void m33918b0(Tag tag) {
        this.f5932a.add(tag);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: c */
    public final void mo13884c(SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
        if (!this.f5932a.isEmpty()) {
            m33919a0();
        }
        m33923W(descriptor);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: e */
    public final Encoder mo13883e(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        return m33929O(mo33920Z(descriptor, i), descriptor.mo13677h(i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: f */
    public final void mo13882f(double d) {
        m33931L(m33919a0(), d);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: g */
    public final void mo13881g(byte b) {
        m33933J(m33919a0(), b);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: h */
    public CompositeEncoder mo13880h(SerialDescriptor serialDescriptor, int i) {
        return Encoder.C10245a.m13914a(this, serialDescriptor, i);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: i */
    public final void mo13916i(SerialDescriptor enumDescriptor, int i) {
        C9971q.m14633g(enumDescriptor, "enumDescriptor");
        mo23866M(m33919a0(), enumDescriptor, i);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: j */
    public final Encoder mo13879j(SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
        return m33929O(m33919a0(), descriptor);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: k */
    public final void mo13878k(long j) {
        m33927Q(m33919a0(), j);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: l */
    public final void mo13877l(SerialDescriptor descriptor, int i, char c) {
        C9971q.m14633g(descriptor, "descriptor");
        m33932K(mo33920Z(descriptor, i), c);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: m */
    public void mo13915m() {
        mo23865S(m33919a0());
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: n */
    public final void mo13876n(SerialDescriptor descriptor, int i, byte b) {
        C9971q.m14633g(descriptor, "descriptor");
        m33933J(mo33920Z(descriptor, i), b);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: o */
    public final void mo13875o(short s) {
        m33925T(m33919a0(), s);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: p */
    public <T> void mo13874p(SerialDescriptor descriptor, int i, AbstractC14437h<? super T> serializer, T t) {
        C9971q.m14633g(descriptor, "descriptor");
        C9971q.m14633g(serializer, "serializer");
        if (m33936G(descriptor, i)) {
            m33935H(serializer, t);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: q */
    public final void mo13873q(boolean z) {
        m33934I(m33919a0(), z);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: r */
    public abstract <T> void mo13872r(AbstractC14437h<? super T> hVar, T t);

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: s */
    public final void mo13871s(SerialDescriptor descriptor, int i, float f) {
        C9971q.m14633g(descriptor, "descriptor");
        m33930N(mo33920Z(descriptor, i), f);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: t */
    public <T> void mo13870t(SerialDescriptor descriptor, int i, AbstractC14437h<? super T> serializer, T t) {
        C9971q.m14633g(descriptor, "descriptor");
        C9971q.m14633g(serializer, "serializer");
        if (m33936G(descriptor, i)) {
            mo13872r(serializer, t);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: u */
    public final void mo13869u(float f) {
        m33930N(m33919a0(), f);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: v */
    public final void mo13868v(char c) {
        m33932K(m33919a0(), c);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: w */
    public void mo13867w() {
        m33926R(m33922X());
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: x */
    public final void mo13866x(SerialDescriptor descriptor, int i, int i2) {
        C9971q.m14633g(descriptor, "descriptor");
        m33928P(mo33920Z(descriptor, i), i2);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: y */
    public final void mo13865y(SerialDescriptor descriptor, int i, boolean z) {
        C9971q.m14633g(descriptor, "descriptor");
        m33934I(mo33920Z(descriptor, i), z);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: z */
    public final void mo13864z(SerialDescriptor descriptor, int i, String value) {
        C9971q.m14633g(descriptor, "descriptor");
        C9971q.m14633g(value, "value");
        m33924U(mo33920Z(descriptor, i), value);
    }
}
