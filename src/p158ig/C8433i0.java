package p158ig;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p163j$.util.concurrent.ConcurrentHashMap;
import tg.C13092k;
import ug.C13283d;

@Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000\"&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0006¨\u0006\b"}, m15073d2 = {"Ljava/lang/Class;", "Ltg/k;", "a", "Ljava/util/concurrent/ConcurrentMap;", "Lig/q0;", "Ljava/lang/ref/WeakReference;", "Ljava/util/concurrent/ConcurrentMap;", "moduleByClassLoader", "kotlin-reflection"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: ig.i0 */
/* loaded from: classes8.dex */
public final class C8433i0 {

    /* renamed from: a */
    private static final ConcurrentMap<C8509q0, WeakReference<C13092k>> f18379a = new ConcurrentHashMap();

    /* renamed from: a */
    public static final C13092k m19781a(Class<?> cls) {
        C9971q.m14633g(cls, "<this>");
        ClassLoader f = C13283d.m4048f(cls);
        C8509q0 q0Var = new C8509q0(f);
        ConcurrentMap<C8509q0, WeakReference<C13092k>> concurrentMap = f18379a;
        WeakReference<C13092k> weakReference = concurrentMap.get(q0Var);
        if (weakReference != null) {
            C13092k kVar = weakReference.get();
            if (kVar != null) {
                return kVar;
            }
            concurrentMap.remove(q0Var, weakReference);
        }
        C13092k a = C13092k.f29400c.m4614a(f);
        while (true) {
            try {
                ConcurrentMap<C8509q0, WeakReference<C13092k>> concurrentMap2 = f18379a;
                WeakReference<C13092k> putIfAbsent = concurrentMap2.putIfAbsent(q0Var, new WeakReference<>(a));
                if (putIfAbsent == null) {
                    return a;
                }
                C13092k kVar2 = putIfAbsent.get();
                if (kVar2 != null) {
                    return kVar2;
                }
                concurrentMap2.remove(q0Var, putIfAbsent);
            } finally {
                q0Var.m19621a(null);
            }
        }
    }
}
