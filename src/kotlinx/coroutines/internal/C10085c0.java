package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.AbstractC9927a;
import nf.C11090s;
import nf.C11093t;

@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001c\u0010\b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007\"\u001c\u0010\n\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007*\f\b\u0000\u0010\f\"\u00020\u000b2\u00020\u000b*\f\b\u0000\u0010\u000e\"\u00020\r2\u00020\r¨\u0006\u000f"}, m15073d2 = {"", "E", "exception", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "baseContinuationImplClassName", "b", "stackTraceRecoveryClassName", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "CoroutineStackFrame", "Ljava/lang/StackTraceElement;", "StackTraceElement", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.c0 */
/* loaded from: classes8.dex */
public final class C10085c0 {

    /* renamed from: a */
    private static final String f22272a;

    /* renamed from: b */
    private static final String f22273b;

    static {
        Object obj;
        Object obj2;
        try {
            C11090s.C11091a aVar = C11090s.f24606l;
            obj = C11090s.m10940b(AbstractC9927a.class.getCanonicalName());
        } catch (Throwable th2) {
            C11090s.C11091a aVar2 = C11090s.f24606l;
            obj = C11090s.m10940b(C11093t.m10931a(th2));
        }
        if (C11090s.m10937e(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f22272a = (String) obj;
        try {
            obj2 = C11090s.m10940b(C10085c0.class.getCanonicalName());
        } catch (Throwable th3) {
            C11090s.C11091a aVar3 = C11090s.f24606l;
            obj2 = C11090s.m10940b(C11093t.m10931a(th3));
        }
        if (C11090s.m10937e(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f22273b = (String) obj2;
    }

    /* renamed from: a */
    public static final <E extends Throwable> E m14334a(E e) {
        return e;
    }
}
