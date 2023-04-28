package p368ud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import td.C13054a;

/* renamed from: ud.b */
/* loaded from: classes3.dex */
final class C13258b {

    /* renamed from: a */
    private final Map<Integer, Integer> f29755a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] m4198a() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry<Integer, Integer> entry : this.f29755a.entrySet()) {
            if (entry.getValue().intValue() > i) {
                i = entry.getValue().intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (entry.getValue().intValue() == i) {
                arrayList.add(entry.getKey());
            }
        }
        return C13054a.m4697b(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m4197b(int i) {
        Integer num = this.f29755a.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.f29755a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}
