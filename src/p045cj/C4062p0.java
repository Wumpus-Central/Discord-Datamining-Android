package p045cj;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C9921w;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.C10274f;
import nf.C11056b0;
import nf.C11062d0;
import nf.C11070g0;
import nf.C11100z;
import p469zi.C14667a;

@Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0004\u0010\u0005\"\u0018\u0010\n\u001a\u00020\u0007*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0018\u0010\u000b\u001a\u00020\u0007*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\t¨\u0006\f"}, m15073d2 = {"", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "Ljava/util/Set;", "getUnsignedNumberDescriptors$annotations", "()V", "unsignedNumberDescriptors", "", "b", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z", "isUnsignedNumber", "isUnquotedLiteral", "kotlinx-serialization-json"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: cj.p0 */
/* loaded from: classes8.dex */
public final class C4062p0 {

    /* renamed from: a */
    private static final Set<SerialDescriptor> f6687a;

    static {
        Set<SerialDescriptor> i;
        i = C9921w.m14717i(C14667a.m37G(C11056b0.f24571l).getDescriptor(), C14667a.m36H(C11062d0.f24580l).getDescriptor(), C14667a.m38F(C11100z.f24620l).getDescriptor(), C14667a.m35I(C11070g0.f24586l).getDescriptor());
        f6687a = i;
    }

    /* renamed from: a */
    public static final boolean m32915a(SerialDescriptor serialDescriptor) {
        C9971q.m14633g(serialDescriptor, "<this>");
        if (!serialDescriptor.isInline() || !C9971q.m14638b(serialDescriptor, C10274f.m13717l())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m32914b(SerialDescriptor serialDescriptor) {
        C9971q.m14633g(serialDescriptor, "<this>");
        if (!serialDescriptor.isInline() || !f6687a.contains(serialDescriptor)) {
            return false;
        }
        return true;
    }
}
