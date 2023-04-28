package kotlinx.coroutines.internal;

import kotlin.Metadata;
import nf.C11090s;
import nf.C11093t;

@Metadata(m15074d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, m15073d2 = {"", "a", "Z", "()Z", "ANDROID_DETECTED", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.j */
/* loaded from: classes8.dex */
public final class C10101j {

    /* renamed from: a */
    private static final boolean f22295a;

    static {
        Object obj;
        try {
            C11090s.C11091a aVar = C11090s.f24606l;
            obj = C11090s.m10940b(Class.forName("android.os.Build"));
        } catch (Throwable th2) {
            C11090s.C11091a aVar2 = C11090s.f24606l;
            obj = C11090s.m10940b(C11093t.m10931a(th2));
        }
        f22295a = C11090s.m10934h(obj);
    }

    /* renamed from: a */
    public static final boolean m14278a() {
        return f22295a;
    }
}
