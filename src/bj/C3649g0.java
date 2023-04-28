package bj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m15073d2 = {"Lbj/g0;", "Lbj/y0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "keyDesc", "valueDesc", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.g0 */
/* loaded from: classes8.dex */
public final class C3649g0 extends AbstractC3718y0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3649g0(SerialDescriptor keyDesc, SerialDescriptor valueDesc) {
        super("kotlin.collections.HashMap", keyDesc, valueDesc, null);
        C9971q.m14633g(keyDesc, "keyDesc");
        C9971q.m14633g(valueDesc, "valueDesc");
    }
}
