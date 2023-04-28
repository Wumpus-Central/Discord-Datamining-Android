package pg;

import kotlin.jvm.internal.C9971q;

/* renamed from: pg.i */
/* loaded from: classes8.dex */
public final class C11676i {
    /* renamed from: a */
    public static final AbstractC11672g m9044a(AbstractC11672g first, AbstractC11672g second) {
        C9971q.m14633g(first, "first");
        C9971q.m14633g(second, "second");
        if (first.isEmpty()) {
            return second;
        }
        if (second.isEmpty()) {
            return first;
        }
        return new C11679k(first, second);
    }
}
