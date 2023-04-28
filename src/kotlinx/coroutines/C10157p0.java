package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.C10089e0;
import kotlinx.coroutines.internal.C10123v;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0002\"\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004\"\u001a\u0010\b\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0006\u001a\u0004\b\u0003\u0010\u0007¨\u0006\t"}, m15073d2 = {"Lkotlinx/coroutines/s0;", "b", "", "a", "Z", "defaultMainDelayOptIn", "Lkotlinx/coroutines/s0;", "()Lkotlinx/coroutines/s0;", "DefaultDelay", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.p0 */
/* loaded from: classes8.dex */
public final class C10157p0 {

    /* renamed from: a */
    private static final boolean f22365a = C10089e0.m14325e("kotlinx.coroutines.main.delay", false);

    /* renamed from: b */
    private static final AbstractC10169s0 f22366b = m14114b();

    /* renamed from: a */
    public static final AbstractC10169s0 m14115a() {
        return f22366b;
    }

    /* renamed from: b */
    private static final AbstractC10169s0 m14114b() {
        if (!f22365a) {
            return RunnableC10153o0.f22357r;
        }
        AbstractC10034f2 c = C10230y0.m13945c();
        if (C10123v.m14209c(c) || !(c instanceof AbstractC10169s0)) {
            return RunnableC10153o0.f22357r;
        }
        return (AbstractC10169s0) c;
    }
}
