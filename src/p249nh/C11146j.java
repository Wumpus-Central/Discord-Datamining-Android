package p249nh;

import eg.C6884j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C9907k;
import kotlin.jvm.internal.C9971q;
import nf.C11098x;
import p267of.C11288u;

/* renamed from: nh.j */
/* loaded from: classes8.dex */
public final class C11146j {

    /* renamed from: a */
    private static final C11137c f24803a;

    /* renamed from: b */
    private static final C11137c f24804b;

    static {
        C11137c cVar = new C11137c("java.lang");
        f24803a = cVar;
        C11137c c = cVar.m10802c(C11142f.m10767f("annotation"));
        C9971q.m14634f(c, "JAVA_LANG_PACKAGE.child(…identifier(\"annotation\"))");
        f24804b = c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final C11136b m10736k(String str) {
        return new C11136b(C11145i.f24751a.m10759b(), C11142f.m10767f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final C11136b m10735l(String str) {
        return new C11136b(C11145i.f24751a.m10755f(), C11142f.m10767f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final C11136b m10734m(String str) {
        return new C11136b(C11145i.f24751a.m10758c(), C11142f.m10767f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final C11136b m10733n(String str) {
        return new C11136b(C11145i.f24751a.m10757d(), C11142f.m10767f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final C11136b m10732o(String str) {
        return new C11136b(C11145i.f24751a.m10756e(), C11142f.m10767f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static final <K, V> Map<V, K> m10731p(Map<K, ? extends V> map) {
        int t;
        int d;
        int c;
        Set<Map.Entry<K, ? extends V>> entrySet = map.entrySet();
        t = C9907k.m14809t(entrySet, 10);
        d = C11288u.m10255d(t);
        c = C6884j.m23961c(d, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(c);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair a = C11098x.m10921a(entry.getValue(), entry.getKey());
            linkedHashMap.put(a.m15065c(), a.m15064d());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final C11136b m10730q(C11142f fVar) {
        C11145i iVar = C11145i.f24751a;
        C11137c h = iVar.m10760a().m10810h();
        return new C11136b(h, C11142f.m10767f(fVar.m10769d() + iVar.m10760a().m10808j().m10769d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final C11136b m10729r(String str) {
        return new C11136b(C11145i.f24751a.m10754g(), C11142f.m10767f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final C11136b m10728s(String str) {
        return new C11136b(C11145i.f24751a.m10753h(), C11142f.m10767f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final C11136b m10727t(C11136b bVar) {
        C11137c f = C11145i.f24751a.m10755f();
        return new C11136b(f, C11142f.m10767f('U' + bVar.m10808j().m10769d()));
    }
}
