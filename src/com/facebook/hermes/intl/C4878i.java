package com.facebook.hermes.intl;

import android.os.Build;
import com.facebook.hermes.intl.C4875g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p129h5.C7840i;
import p129h5.C7872n3;

/* renamed from: com.facebook.hermes.intl.i */
/* loaded from: classes7.dex */
public class C4878i {
    /* renamed from: a */
    public static HashMap<String, Object> m31568a(List<String> list, Object obj, List<String> list2) {
        C4875g.C4876a aVar;
        HashMap<String, Object> hashMap = new HashMap<>();
        String h = C7840i.m21251h(C7840i.m21258a(obj, "localeMatcher"));
        if (Build.VERSION.SDK_INT < 24 || h.equals("lookup")) {
            aVar = C4875g.m31578f((String[]) list.toArray(new String[list.size()]));
        } else {
            aVar = C4875g.m31581c((String[]) list.toArray(new String[list.size()]));
        }
        HashSet<String> hashSet = new HashSet();
        for (String str : list2) {
            Object b = C7840i.m21257b();
            Object obj2 = b;
            if (!aVar.f8067b.isEmpty()) {
                obj2 = b;
                if (aVar.f8067b.containsKey(str)) {
                    String str2 = aVar.f8067b.get(str);
                    boolean isEmpty = str2.isEmpty();
                    String str3 = str2;
                    if (isEmpty) {
                        str3 = C7840i.m21241r("true");
                    }
                    hashSet.add(str);
                    obj2 = str3;
                }
            }
            if (C7840i.m21252g(obj).containsKey(str)) {
                Object a = C7840i.m21258a(obj, str);
                if (C7840i.m21246m(a) && C7840i.m21251h(a).isEmpty()) {
                    a = C7840i.m21244o(true);
                }
                if (!C7840i.m21245n(a) && !a.equals(obj2)) {
                    hashSet.remove(str);
                    obj2 = a;
                }
            }
            if (!C7840i.m21249j(obj2)) {
                obj2 = C7872n3.m21207f(str, obj2);
            }
            if (!C7840i.m21246m(obj2) || C7872n3.m21210c(str, C7840i.m21251h(obj2), aVar.f8066a)) {
                hashMap.put(str, obj2);
            } else {
                hashMap.put(str, C7840i.m21257b());
            }
        }
        for (String str4 : hashSet) {
            ArrayList<String> arrayList = new ArrayList<>();
            String h2 = C7840i.m21251h(C7872n3.m21207f(str4, C7840i.m21241r(aVar.f8067b.get(str4))));
            if (!C7840i.m21246m(h2) || C7872n3.m21210c(str4, C7840i.m21251h(h2), aVar.f8066a)) {
                arrayList.add(h2);
                aVar.f8066a.mo21164f(str4, arrayList);
            }
        }
        hashMap.put("locale", aVar.f8066a);
        return hashMap;
    }
}
