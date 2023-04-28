package kotlinx.serialization.internal;

import bj.AbstractC3699s1;
import bj.C3656h2;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.CompositeEncoder;
import nf.C11056b0;
import nf.C11059c0;
import p469zi.C14667a;

@Metadata(m15074d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u0005*\u00020\u0002H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u0002H\u0014ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0014J-\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0006H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001d"}, m15073d2 = {"Lkotlinx/serialization/internal/j;", "Lkotlinx/serialization/KSerializer;", "Lnf/c0;", "Lbj/s1;", "Lnf/b0;", "Lbj/h2;", "", "v", "([I)I", "y", "([I)Lbj/h2;", "w", "()[I", "Lkotlinx/serialization/encoding/c;", "decoder", "index", "builder", "", "checkIndex", "", "x", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", "size", "z", "(Lkotlinx/serialization/encoding/CompositeEncoder;[II)V", "<init>", "()V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.internal.j */
/* loaded from: classes8.dex */
public final class C10263j extends AbstractC3699s1<C11056b0, C11059c0, C3656h2> {

    /* renamed from: c */
    public static final C10263j f22540c = new C10263j();

    private C10263j() {
        super(C14667a.m37G(C11056b0.f24571l));
    }

    @Override // bj.AbstractC3618a
    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo13776e(Object obj) {
        return m13786v(((C11059c0) obj).m11010z());
    }

    @Override // bj.AbstractC3618a
    /* renamed from: k */
    public /* bridge */ /* synthetic */ Object mo13774k(Object obj) {
        return m13783y(((C11059c0) obj).m11010z());
    }

    @Override // bj.AbstractC3699s1
    /* renamed from: r */
    public /* bridge */ /* synthetic */ C11059c0 mo13773r() {
        return C11059c0.m11025a(m13785w());
    }

    @Override // bj.AbstractC3699s1
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo13772u(CompositeEncoder compositeEncoder, C11059c0 c0Var, int i) {
        m13782z(compositeEncoder, c0Var.m11010z(), i);
    }

    /* renamed from: v */
    protected int m13786v(int[] collectionSize) {
        C9971q.m14633g(collectionSize, "$this$collectionSize");
        return C11059c0.m11016t(collectionSize);
    }

    /* renamed from: w */
    protected int[] m13785w() {
        return C11059c0.m11024b(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public void mo13775h(AbstractC10248c decoder, int i, C3656h2 builder, boolean z) {
        C9971q.m14633g(decoder, "decoder");
        C9971q.m14633g(builder, "builder");
        builder.m33876e(C11056b0.m11030b(decoder.mo13849r(getDescriptor(), i).mo13903h()));
    }

    /* renamed from: y */
    protected C3656h2 m13783y(int[] toBuilder) {
        C9971q.m14633g(toBuilder, "$this$toBuilder");
        return new C3656h2(toBuilder, null);
    }

    /* renamed from: z */
    protected void m13782z(CompositeEncoder encoder, int[] content, int i) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.mo13883e(getDescriptor(), i2).mo13892B(C11059c0.m11018r(content, i2));
        }
    }
}
