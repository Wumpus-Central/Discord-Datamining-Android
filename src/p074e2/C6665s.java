package p074e2;

import java.util.HashMap;
import java.util.Map;

/* renamed from: e2.s */
/* loaded from: classes.dex */
public class C6665s {

    /* renamed from: a */
    Boolean f14119a;

    /* renamed from: b */
    Map<String, Map<String, String>> f14120b = new HashMap();

    public C6665s(Boolean bool) {
        this.f14119a = bool;
    }

    /* renamed from: a */
    public void m24783a(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            C6639l.m24863j().mo24885b("Cannot add granular option with any null value", new Object[0]);
            return;
        }
        Map<String, String> map = this.f14120b.get(str);
        if (map == null) {
            map = new HashMap<>();
            this.f14120b.put(str, map);
        }
        map.put(str2, str3);
    }
}
