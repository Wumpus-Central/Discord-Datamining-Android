package p045cj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import nf.C11090s;
import nf.C11093t;
import p326ri.C12717t;

@Metadata(m15074d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, m15073d2 = {"", "a", "I", "MAX_CHARS_IN_POOL", "kotlinx-serialization-json"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: cj.d */
/* loaded from: classes8.dex */
public final class C4032d {

    /* renamed from: a */
    private static final int f6628a;

    static {
        Object obj;
        int i;
        Integer m;
        try {
            C11090s.C11091a aVar = C11090s.f24606l;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            C9971q.m14634f(property, "getProperty(\"kotlinx.ser…lization.json.pool.size\")");
            m = C12717t.m5747m(property);
            obj = C11090s.m10940b(m);
        } catch (Throwable th2) {
            C11090s.C11091a aVar2 = C11090s.f24606l;
            obj = C11090s.m10940b(C11093t.m10931a(th2));
        }
        if (C11090s.m10935g(obj)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 2097152;
        }
        f6628a = i;
    }
}
