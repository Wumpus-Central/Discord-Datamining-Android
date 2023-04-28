package kotlinx.serialization.internal;

import bj.AbstractC3699s1;
import bj.C3674l2;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.CompositeEncoder;
import nf.C11070g0;
import nf.C11073h0;
import p469zi.C14667a;

@Metadata(m15074d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u0005*\u00020\u0002H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u0002H\u0014ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0014J-\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0006H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001d"}, m15073d2 = {"Lkotlinx/serialization/internal/l;", "Lkotlinx/serialization/KSerializer;", "Lnf/h0;", "Lbj/s1;", "Lnf/g0;", "Lbj/l2;", "", "v", "([S)I", "y", "([S)Lbj/l2;", "w", "()[S", "Lkotlinx/serialization/encoding/c;", "decoder", "index", "builder", "", "checkIndex", "", "x", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", "size", "z", "(Lkotlinx/serialization/encoding/CompositeEncoder;[SI)V", "<init>", "()V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.internal.l */
/* loaded from: classes8.dex */
public final class C10265l extends AbstractC3699s1<C11070g0, C11073h0, C3674l2> {

    /* renamed from: c */
    public static final C10265l f22542c = new C10265l();

    private C10265l() {
        super(C14667a.m35I(C11070g0.f24586l));
    }

    @Override // bj.AbstractC3618a
    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo13776e(Object obj) {
        return m13771v(((C11073h0) obj).m10958z());
    }

    @Override // bj.AbstractC3618a
    /* renamed from: k */
    public /* bridge */ /* synthetic */ Object mo13774k(Object obj) {
        return m13768y(((C11073h0) obj).m10958z());
    }

    @Override // bj.AbstractC3699s1
    /* renamed from: r */
    public /* bridge */ /* synthetic */ C11073h0 mo13773r() {
        return C11073h0.m10973a(m13770w());
    }

    @Override // bj.AbstractC3699s1
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo13772u(CompositeEncoder compositeEncoder, C11073h0 h0Var, int i) {
        m13767z(compositeEncoder, h0Var.m10958z(), i);
    }

    /* renamed from: v */
    protected int m13771v(short[] collectionSize) {
        C9971q.m14633g(collectionSize, "$this$collectionSize");
        return C11073h0.m10964t(collectionSize);
    }

    /* renamed from: w */
    protected short[] m13770w() {
        return C11073h0.m10972b(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public void mo13775h(AbstractC10248c decoder, int i, C3674l2 builder, boolean z) {
        C9971q.m14633g(decoder, "decoder");
        C9971q.m14633g(builder, "builder");
        builder.m33836e(C11070g0.m10978b(decoder.mo13849r(getDescriptor(), i).mo13899s()));
    }

    /* renamed from: y */
    protected C3674l2 m13768y(short[] toBuilder) {
        C9971q.m14633g(toBuilder, "$this$toBuilder");
        return new C3674l2(toBuilder, null);
    }

    /* renamed from: z */
    protected void m13767z(CompositeEncoder encoder, short[] content, int i) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.mo13883e(getDescriptor(), i2).mo13875o(C11073h0.m10966r(content, i2));
        }
    }
}
