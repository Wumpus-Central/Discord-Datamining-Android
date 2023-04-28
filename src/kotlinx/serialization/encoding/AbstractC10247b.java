package kotlinx.serialization.encoding;

import bj.C3636d1;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import p449yi.AbstractC14437h;

@Metadata(m15074d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b/\u00100J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0019H\u0016J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u001bH\u0016J\u0010\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nJ\u001e\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000eJ\u001e\u0010 \u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0010J\u001e\u0010!\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bJ\u001e\u0010\"\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0013J\u001e\u0010#\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0015J\u001e\u0010$\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0017J\u001e\u0010%\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0019J\u001e\u0010&\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u001bJ\u0016\u0010'\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bJ;\u0010+\u001a\u00020\u0006\"\u0004\b\u0000\u0010(2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b+\u0010,JA\u0010.\u001a\u00020\u0006\"\b\b\u0000\u0010(*\u00020-2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)2\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b.\u0010,¨\u00061"}, m15073d2 = {"Lkotlinx/serialization/encoding/b;", "Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "b", "", "c", "", "index", "", "G", "value", "q", "", "g", "", "o", "B", "", "k", "", "u", "", "f", "", "v", "", "F", "j", "y", "n", "C", "x", "E", "s", "D", "l", "z", "e", "T", "Lyi/h;", "serializer", "t", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V", "", "p", "<init>", "()V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.encoding.b */
/* loaded from: classes8.dex */
public abstract class AbstractC10247b implements Encoder, CompositeEncoder {
    /* renamed from: A */
    public boolean mo13893A(SerialDescriptor serialDescriptor, int i) {
        return CompositeEncoder.C10243a.m13919a(this, serialDescriptor, i);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: B */
    public abstract void mo13892B(int i);

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: C */
    public final void mo13891C(SerialDescriptor descriptor, int i, short s) {
        C9971q.m14633g(descriptor, "descriptor");
        if (mo13887G(descriptor, i)) {
            mo13875o(s);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: D */
    public final void mo13890D(SerialDescriptor descriptor, int i, double d) {
        C9971q.m14633g(descriptor, "descriptor");
        if (mo13887G(descriptor, i)) {
            mo13882f(d);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: E */
    public final void mo13889E(SerialDescriptor descriptor, int i, long j) {
        C9971q.m14633g(descriptor, "descriptor");
        if (mo13887G(descriptor, i)) {
            mo13878k(j);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: F */
    public abstract void mo13888F(String str);

    /* renamed from: G */
    public boolean mo13887G(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        return true;
    }

    /* renamed from: H */
    public <T> void m13886H(AbstractC14437h<? super T> hVar, T t) {
        Encoder.C10245a.m13912c(this, hVar, t);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: b */
    public CompositeEncoder mo13885b(SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
        return this;
    }

    /* renamed from: c */
    public void mo13884c(SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: e */
    public final Encoder mo13883e(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        if (mo13887G(descriptor, i)) {
            return mo13879j(descriptor.mo13677h(i));
        }
        return C3636d1.f5935a;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: f */
    public abstract void mo13882f(double d);

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: g */
    public abstract void mo13881g(byte b);

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: h */
    public CompositeEncoder mo13880h(SerialDescriptor serialDescriptor, int i) {
        return Encoder.C10245a.m13914a(this, serialDescriptor, i);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: j */
    public Encoder mo13879j(SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: k */
    public abstract void mo13878k(long j);

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: l */
    public final void mo13877l(SerialDescriptor descriptor, int i, char c) {
        C9971q.m14633g(descriptor, "descriptor");
        if (mo13887G(descriptor, i)) {
            mo13868v(c);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: n */
    public final void mo13876n(SerialDescriptor descriptor, int i, byte b) {
        C9971q.m14633g(descriptor, "descriptor");
        if (mo13887G(descriptor, i)) {
            mo13881g(b);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: o */
    public abstract void mo13875o(short s);

    /* renamed from: p */
    public <T> void mo13874p(SerialDescriptor descriptor, int i, AbstractC14437h<? super T> serializer, T t) {
        C9971q.m14633g(descriptor, "descriptor");
        C9971q.m14633g(serializer, "serializer");
        if (mo13887G(descriptor, i)) {
            m13886H(serializer, t);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: q */
    public abstract void mo13873q(boolean z);

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: r */
    public <T> void mo13872r(AbstractC14437h<? super T> hVar, T t) {
        Encoder.C10245a.m13911d(this, hVar, t);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: s */
    public final void mo13871s(SerialDescriptor descriptor, int i, float f) {
        C9971q.m14633g(descriptor, "descriptor");
        if (mo13887G(descriptor, i)) {
            mo13869u(f);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: t */
    public <T> void mo13870t(SerialDescriptor descriptor, int i, AbstractC14437h<? super T> serializer, T t) {
        C9971q.m14633g(descriptor, "descriptor");
        C9971q.m14633g(serializer, "serializer");
        if (mo13887G(descriptor, i)) {
            mo13872r(serializer, t);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: u */
    public abstract void mo13869u(float f);

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: v */
    public abstract void mo13868v(char c);

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: w */
    public void mo13867w() {
        Encoder.C10245a.m13913b(this);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: x */
    public final void mo13866x(SerialDescriptor descriptor, int i, int i2) {
        C9971q.m14633g(descriptor, "descriptor");
        if (mo13887G(descriptor, i)) {
            mo13892B(i2);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: y */
    public final void mo13865y(SerialDescriptor descriptor, int i, boolean z) {
        C9971q.m14633g(descriptor, "descriptor");
        if (mo13887G(descriptor, i)) {
            mo13873q(z);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: z */
    public final void mo13864z(SerialDescriptor descriptor, int i, String value) {
        C9971q.m14633g(descriptor, "descriptor");
        C9971q.m14633g(value, "value");
        if (mo13887G(descriptor, i)) {
            mo13888F(value);
        }
    }
}
