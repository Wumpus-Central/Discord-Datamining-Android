package bj;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p014aj.AbstractC1429h;
import p014aj.C1422f;

@Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m15073d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "typeParams", "", "a", "(Lkotlinx/serialization/descriptors/SerialDescriptor;[Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "kotlinx-serialization-core"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: bj.o1 */
/* loaded from: classes8.dex */
public final class C3685o1 {
    /* renamed from: a */
    public static final int m33813a(SerialDescriptor serialDescriptor, SerialDescriptor[] typeParams) {
        int i;
        C9971q.m14633g(serialDescriptor, "<this>");
        C9971q.m14633g(typeParams, "typeParams");
        int hashCode = (serialDescriptor.mo13676i().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable<SerialDescriptor> a = C1422f.m41135a(serialDescriptor);
        Iterator<SerialDescriptor> it = a.iterator();
        int i2 = 1;
        int i3 = 1;
        while (true) {
            int i4 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i5 = i3 * 31;
            String i6 = it.next().mo13676i();
            if (i6 != null) {
                i4 = i6.hashCode();
            }
            i3 = i5 + i4;
        }
        for (SerialDescriptor serialDescriptor2 : a) {
            int i7 = i2 * 31;
            AbstractC1429h g = serialDescriptor2.mo13678g();
            if (g != null) {
                i = g.hashCode();
            } else {
                i = 0;
            }
            i2 = i7 + i;
        }
        return (((hashCode * 31) + i3) * 31) + i2;
    }
}
