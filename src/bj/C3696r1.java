package bj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m15073d2 = {"Lbj/r1;", "Lbj/u0;", "", "c", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "serialName", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "primitive", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.r1 */
/* loaded from: classes8.dex */
public final class C3696r1 extends AbstractC3704u0 {

    /* renamed from: c */
    private final String f6014c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3696r1(SerialDescriptor primitive) {
        super(primitive, null);
        C9971q.m14633g(primitive, "primitive");
        this.f6014c = primitive.mo13676i() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public String mo13676i() {
        return this.f6014c;
    }
}
