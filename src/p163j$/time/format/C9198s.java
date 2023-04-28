package p163j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.s */
/* loaded from: classes2.dex */
public final class C9198s {

    /* renamed from: a */
    private final Map f20197a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9198s(Map map) {
        Comparator comparator;
        Comparator comparator2;
        this.f20197a = map;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                int i = C9181b.f20156c;
                hashMap2.put((String) entry2.getValue(), new AbstractMap.SimpleImmutableEntry((String) entry2.getValue(), (Long) entry2.getKey()));
            }
            ArrayList arrayList2 = new ArrayList(hashMap2.values());
            comparator2 = C9181b.f20155b;
            Collections.sort(arrayList2, comparator2);
            hashMap.put((EnumC9202w) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            hashMap.put(null, arrayList);
        }
        comparator = C9181b.f20155b;
        Collections.sort(arrayList, comparator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final String m16685a(long j, EnumC9202w wVar) {
        Map map = (Map) this.f20197a.get(wVar);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }
}
