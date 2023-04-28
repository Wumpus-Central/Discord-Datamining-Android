package kotlinx.coroutines;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9906j;
import kotlin.coroutines.Continuation;

@Metadata(m15074d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a?\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001\"\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m15073d2 = {"T", "", "Lkotlinx/coroutines/q0;", "deferreds", "", "a", "([Lkotlinx/coroutines/q0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.f */
/* loaded from: classes8.dex */
public final class C10024f {
    /* renamed from: a */
    public static final <T> Object m14463a(AbstractC10161q0<? extends T>[] q0VarArr, Continuation<? super List<? extends T>> continuation) {
        List i;
        if (!(q0VarArr.length == 0)) {
            return new C10018e(q0VarArr).m14482b(continuation);
        }
        i = C9906j.m14820i();
        return i;
    }
}
