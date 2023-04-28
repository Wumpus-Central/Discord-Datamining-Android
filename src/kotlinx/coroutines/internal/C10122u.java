package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.AbstractC10034f2;
import p306qi.C12193m;
import p306qi.C12200o;

@Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, m15073d2 = {"Lkotlinx/coroutines/internal/u;", "", "Lkotlinx/coroutines/f2;", "a", "", "b", "Z", "FAST_SERVICE_LOADER_ENABLED", "c", "Lkotlinx/coroutines/f2;", "dispatcher", "<init>", "()V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.u */
/* loaded from: classes8.dex */
public final class C10122u {

    /* renamed from: a */
    public static final C10122u f22329a;

    /* renamed from: b */
    private static final boolean f22330b = C10089e0.m14325e("kotlinx.coroutines.fast.service.loader", true);

    /* renamed from: c */
    public static final AbstractC10034f2 f22331c;

    static {
        C10122u uVar = new C10122u();
        f22329a = uVar;
        f22331c = uVar.m14212a();
    }

    private C10122u() {
    }

    /* renamed from: a */
    private final AbstractC10034f2 m14212a() {
        List<AbstractC10121t> list;
        Object obj;
        AbstractC10034f2 e;
        Sequence c;
        try {
            if (f22330b) {
                list = C10099i.f22293a.m14295c();
            } else {
                c = C12193m.m7450c(ServiceLoader.load(AbstractC10121t.class, AbstractC10121t.class.getClassLoader()).iterator());
                list = C12200o.m7436E(c);
            }
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                obj = it.next();
                if (it.hasNext()) {
                    int c2 = ((AbstractC10121t) obj).mo4549c();
                    do {
                        Object next = it.next();
                        int c3 = ((AbstractC10121t) next).mo4549c();
                        if (c2 < c3) {
                            obj = next;
                            c2 = c3;
                        }
                    } while (it.hasNext());
                }
            }
            AbstractC10121t tVar = (AbstractC10121t) obj;
            if (tVar == null || (e = C10123v.m14207e(tVar, list)) == null) {
                return C10123v.m14210b(null, null, 3, null);
            }
            return e;
        } catch (Throwable th2) {
            return C10123v.m14210b(th2, null, 2, null);
        }
    }
}
