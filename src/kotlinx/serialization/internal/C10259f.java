package kotlinx.serialization.internal;

import bj.AbstractC3699s1;
import bj.C3672l0;
import kotlin.Metadata;
import kotlin.jvm.internal.C9970p;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.CompositeEncoder;
import p469zi.C14667a;

@Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\f\u0010\u0006\u001a\u00020\u0004*\u00020\u0002H\u0014J\f\u0010\u0007\u001a\u00020\u0005*\u00020\u0002H\u0014J\b\u0010\b\u001a\u00020\u0002H\u0014J(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0014J \u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0004H\u0014¨\u0006\u0018"}, m15073d2 = {"Lkotlinx/serialization/internal/f;", "Lkotlinx/serialization/KSerializer;", "", "Lbj/s1;", "", "Lbj/l0;", "v", "y", "w", "Lkotlinx/serialization/encoding/c;", "decoder", "index", "builder", "", "checkIndex", "", "x", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", "size", "z", "<init>", "()V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.internal.f */
/* loaded from: classes8.dex */
public final class C10259f extends AbstractC3699s1<Integer, int[], C3672l0> {

    /* renamed from: c */
    public static final C10259f f22536c = new C10259f();

    private C10259f() {
        super(C14667a.m42B(C9970p.f22094a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public int mo13776e(int[] iArr) {
        C9971q.m14633g(iArr, "<this>");
        return iArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public int[] mo13773r() {
        return new int[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public void mo13775h(AbstractC10248c decoder, int i, C3672l0 builder, boolean z) {
        C9971q.m14633g(decoder, "decoder");
        C9971q.m14633g(builder, "builder");
        builder.m33852e(decoder.mo13855i(getDescriptor(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public C3672l0 mo13774k(int[] iArr) {
        C9971q.m14633g(iArr, "<this>");
        return new C3672l0(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public void mo13772u(CompositeEncoder encoder, int[] content, int i) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.mo13866x(getDescriptor(), i2, content[i2]);
        }
    }
}
