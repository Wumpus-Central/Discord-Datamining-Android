package p390w;

import java.util.HashMap;
import java.util.Map;

/* renamed from: w.c1 */
/* loaded from: classes.dex */
public final class C13581c1 {

    /* renamed from: a */
    private static final Object f30370a = new Object();

    /* renamed from: b */
    private static final Map<Object, AbstractC13706z> f30371b = new HashMap();

    /* renamed from: a */
    public static void m3314a(Object obj, AbstractC13706z zVar) {
        synchronized (f30370a) {
            f30371b.put(obj, zVar);
        }
    }

    /* renamed from: b */
    public static AbstractC13706z m3313b(Object obj) {
        AbstractC13706z zVar;
        synchronized (f30370a) {
            zVar = f30371b.get(obj);
        }
        if (zVar == null) {
            return AbstractC13706z.f30602a;
        }
        return zVar;
    }
}
