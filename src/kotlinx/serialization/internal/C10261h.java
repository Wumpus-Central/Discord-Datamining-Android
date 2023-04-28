package kotlinx.serialization.internal;

import bj.AbstractC3699s1;
import bj.C3719y1;
import kotlin.Metadata;
import kotlin.jvm.internal.C9958i0;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.CompositeEncoder;
import p469zi.C14667a;

@Metadata(m15074d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0014J\f\u0010\b\u001a\u00020\u0005*\u00020\u0002H\u0014J\b\u0010\t\u001a\u00020\u0002H\u0014J(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J \u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0014¨\u0006\u0019"}, m15073d2 = {"Lkotlinx/serialization/internal/h;", "Lkotlinx/serialization/KSerializer;", "", "Lbj/s1;", "", "Lbj/y1;", "", "v", "y", "w", "Lkotlinx/serialization/encoding/c;", "decoder", "index", "builder", "", "checkIndex", "", "x", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", "size", "z", "<init>", "()V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.internal.h */
/* loaded from: classes8.dex */
public final class C10261h extends AbstractC3699s1<Short, short[], C3719y1> {

    /* renamed from: c */
    public static final C10261h f22538c = new C10261h();

    private C10261h() {
        super(C14667a.m40D(C9958i0.f22087a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public int mo13776e(short[] sArr) {
        C9971q.m14633g(sArr, "<this>");
        return sArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public short[] mo13773r() {
        return new short[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public void mo13775h(AbstractC10248c decoder, int i, C3719y1 builder, boolean z) {
        C9971q.m14633g(decoder, "decoder");
        C9971q.m14633g(builder, "builder");
        builder.m33746e(decoder.mo13860E(getDescriptor(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public C3719y1 mo13774k(short[] sArr) {
        C9971q.m14633g(sArr, "<this>");
        return new C3719y1(sArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public void mo13772u(CompositeEncoder encoder, short[] content, int i) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.mo13891C(getDescriptor(), i2, content[i2]);
        }
    }
}
