package kotlinx.serialization.internal;

import bj.AbstractC3699s1;
import bj.C3665j2;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.CompositeEncoder;
import nf.C11062d0;
import nf.C11065e0;
import p469zi.C14667a;

@Metadata(m15074d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u0005*\u00020\u0002H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u0002H\u0014ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0014J-\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0006H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001d"}, m15073d2 = {"Lkotlinx/serialization/internal/k;", "Lkotlinx/serialization/KSerializer;", "Lnf/e0;", "Lbj/s1;", "Lnf/d0;", "Lbj/j2;", "", "v", "([J)I", "y", "([J)Lbj/j2;", "w", "()[J", "Lkotlinx/serialization/encoding/c;", "decoder", "index", "builder", "", "checkIndex", "", "x", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", "size", "z", "(Lkotlinx/serialization/encoding/CompositeEncoder;[JI)V", "<init>", "()V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.internal.k */
/* loaded from: classes8.dex */
public final class C10264k extends AbstractC3699s1<C11062d0, C11065e0, C3665j2> {

    /* renamed from: c */
    public static final C10264k f22541c = new C10264k();

    private C10264k() {
        super(C14667a.m36H(C11062d0.f24580l));
    }

    @Override // bj.AbstractC3618a
    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo13776e(Object obj) {
        return m13781v(((C11065e0) obj).m10983z());
    }

    @Override // bj.AbstractC3618a
    /* renamed from: k */
    public /* bridge */ /* synthetic */ Object mo13774k(Object obj) {
        return m13778y(((C11065e0) obj).m10983z());
    }

    @Override // bj.AbstractC3699s1
    /* renamed from: r */
    public /* bridge */ /* synthetic */ C11065e0 mo13773r() {
        return C11065e0.m10998a(m13780w());
    }

    @Override // bj.AbstractC3699s1
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo13772u(CompositeEncoder compositeEncoder, C11065e0 e0Var, int i) {
        m13777z(compositeEncoder, e0Var.m10983z(), i);
    }

    /* renamed from: v */
    protected int m13781v(long[] collectionSize) {
        C9971q.m14633g(collectionSize, "$this$collectionSize");
        return C11065e0.m10989t(collectionSize);
    }

    /* renamed from: w */
    protected long[] m13780w() {
        return C11065e0.m10997b(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public void mo13775h(AbstractC10248c decoder, int i, C3665j2 builder, boolean z) {
        C9971q.m14633g(decoder, "decoder");
        C9971q.m14633g(builder, "builder");
        builder.m33857e(C11062d0.m11005b(decoder.mo13849r(getDescriptor(), i).mo13901l()));
    }

    /* renamed from: y */
    protected C3665j2 m13778y(long[] toBuilder) {
        C9971q.m14633g(toBuilder, "$this$toBuilder");
        return new C3665j2(toBuilder, null);
    }

    /* renamed from: z */
    protected void m13777z(CompositeEncoder encoder, long[] content, int i) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.mo13883e(getDescriptor(), i2).mo13878k(C11065e0.m10991r(content, i2));
        }
    }
}
