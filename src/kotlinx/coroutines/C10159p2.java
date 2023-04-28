package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000¨\u0006\u0004"}, m15073d2 = {"Lkotlinx/coroutines/Job;", "parent", "Lkotlinx/coroutines/x;", "a", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.p2 */
/* loaded from: classes8.dex */
public final class C10159p2 {
    /* renamed from: a */
    public static final AbstractC10225x m14111a(Job job) {
        return new C10155o2(job);
    }

    /* renamed from: b */
    public static /* synthetic */ AbstractC10225x m14110b(Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return m14111a(job);
    }
}
