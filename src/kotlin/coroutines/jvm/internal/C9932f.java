package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0002\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0002\u001a\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¨\u0006\f"}, m15073d2 = {"Lkotlin/coroutines/jvm/internal/a;", "Ljava/lang/StackTraceElement;", "d", "(Lkotlin/coroutines/jvm/internal/a;)Ljava/lang/StackTraceElement;", "Lkotlin/coroutines/jvm/internal/e;", "b", "", "c", "expected", "actual", "", "a", "kotlin-stdlib"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: kotlin.coroutines.jvm.internal.f */
/* loaded from: classes8.dex */
public final class C9932f {
    /* renamed from: a */
    private static final void m14697a(int i, int i2) {
        if (i2 > i) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
        }
    }

    /* renamed from: b */
    private static final AbstractC9931e m14696b(AbstractC9927a aVar) {
        return (AbstractC9931e) aVar.getClass().getAnnotation(AbstractC9931e.class);
    }

    /* renamed from: c */
    private static final int m14695c(AbstractC9927a aVar) {
        Integer num;
        int i;
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            return i - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static final StackTraceElement m14694d(AbstractC9927a aVar) {
        int i;
        String str;
        C9971q.m14633g(aVar, "<this>");
        AbstractC9931e b = m14696b(aVar);
        if (b == null) {
            return null;
        }
        m14697a(1, b.m14698v());
        int c = m14695c(aVar);
        if (c < 0) {
            i = -1;
        } else {
            i = b.m14700l()[c];
        }
        String b2 = C9934h.f22060a.m14689b(aVar);
        if (b2 == null) {
            str = b.m14702c();
        } else {
            str = b2 + '/' + b.m14702c();
        }
        return new StackTraceElement(str, b.m14699m(), b.m14701f(), i);
    }
}
