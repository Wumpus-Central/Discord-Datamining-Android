package com.facebook.hermes.intl;

import android.os.Build;
import com.facebook.hermes.intl.AbstractC4845a;
import com.facebook.hermes.intl.C4879j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p078e6.AbstractC6709a;
import p129h5.AbstractC7805b;
import p129h5.C7800a;
import p129h5.C7840i;
import p129h5.C7872n3;

@AbstractC6709a
/* loaded from: classes7.dex */
public class Collator {

    /* renamed from: a */
    private AbstractC4845a.EnumC4848d f7872a;

    /* renamed from: b */
    private AbstractC4845a.EnumC4847c f7873b;

    /* renamed from: c */
    private boolean f7874c;

    /* renamed from: d */
    private String f7875d = "default";

    /* renamed from: e */
    private boolean f7876e;

    /* renamed from: f */
    private AbstractC4845a.EnumC4846b f7877f;

    /* renamed from: g */
    private AbstractC7805b<?> f7878g;

    /* renamed from: h */
    private AbstractC7805b<?> f7879h;

    /* renamed from: i */
    private AbstractC4845a f7880i;

    @AbstractC6709a
    public Collator(List<String> list, Map<String, Object> map) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f7880i = new C4885m();
        } else {
            this.f7880i = new C4883l();
        }
        m31644a(list, map);
        this.f7880i.mo31562b(this.f7878g).mo31558f(this.f7876e).mo31559e(this.f7877f).mo31557g(this.f7873b).mo31560d(this.f7874c);
    }

    /* renamed from: a */
    private void m31644a(List<String> list, Map<String, Object> map) {
        C4879j.EnumC4880a aVar = C4879j.EnumC4880a.STRING;
        this.f7872a = (AbstractC4845a.EnumC4848d) C4879j.m31564d(AbstractC4845a.EnumC4848d.class, C7840i.m21251h(C4879j.m31565c(map, "usage", aVar, C7800a.f17002e, "sort")));
        Object q = C7840i.m21242q();
        C7840i.m21256c(q, "localeMatcher", C4879j.m31565c(map, "localeMatcher", aVar, C7800a.f16998a, "best fit"));
        Object c = C4879j.m31565c(map, "numeric", C4879j.EnumC4880a.BOOLEAN, C7840i.m21255d(), C7840i.m21255d());
        if (!C7840i.m21245n(c)) {
            c = C7840i.m21241r(String.valueOf(C7840i.m21254e(c)));
        }
        C7840i.m21256c(q, "kn", c);
        C7840i.m21256c(q, "kf", C4879j.m31565c(map, "caseFirst", aVar, C7800a.f17001d, C7840i.m21255d()));
        HashMap<String, Object> a = C4878i.m31568a(list, q, Arrays.asList("co", "kf", "kn"));
        AbstractC7805b<?> bVar = (AbstractC7805b) C7840i.m21252g(a).get("locale");
        this.f7878g = bVar;
        this.f7879h = bVar.mo21166d();
        Object a2 = C7840i.m21258a(a, "co");
        if (C7840i.m21249j(a2)) {
            a2 = C7840i.m21241r("default");
        }
        this.f7875d = C7840i.m21251h(a2);
        Object a3 = C7840i.m21258a(a, "kn");
        if (C7840i.m21249j(a3)) {
            this.f7876e = false;
        } else {
            this.f7876e = Boolean.parseBoolean(C7840i.m21251h(a3));
        }
        Object a4 = C7840i.m21258a(a, "kf");
        if (C7840i.m21249j(a4)) {
            a4 = C7840i.m21241r("false");
        }
        this.f7877f = (AbstractC4845a.EnumC4846b) C4879j.m31564d(AbstractC4845a.EnumC4846b.class, C7840i.m21251h(a4));
        if (this.f7872a == AbstractC4845a.EnumC4848d.SEARCH) {
            ArrayList<String> b = this.f7878g.mo21168b("collation");
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<String> it = b.iterator();
            while (it.hasNext()) {
                arrayList.add(C7872n3.m21208e(it.next()));
            }
            arrayList.add(C7872n3.m21208e("search"));
            this.f7878g.mo21164f("co", arrayList);
        }
        Object c2 = C4879j.m31565c(map, "sensitivity", C4879j.EnumC4880a.STRING, C7800a.f17000c, C7840i.m21255d());
        if (!C7840i.m21245n(c2)) {
            this.f7873b = (AbstractC4845a.EnumC4847c) C4879j.m31564d(AbstractC4845a.EnumC4847c.class, C7840i.m21251h(c2));
        } else if (this.f7872a == AbstractC4845a.EnumC4848d.SORT) {
            this.f7873b = AbstractC4845a.EnumC4847c.VARIANT;
        } else {
            this.f7873b = AbstractC4845a.EnumC4847c.LOCALE;
        }
        this.f7874c = C7840i.m21254e(C4879j.m31565c(map, "ignorePunctuation", C4879j.EnumC4880a.BOOLEAN, C7840i.m21255d(), Boolean.FALSE));
    }

    @AbstractC6709a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        String h = C7840i.m21251h(C4879j.m31565c(map, "localeMatcher", C4879j.EnumC4880a.STRING, C7800a.f16998a, "best fit"));
        if (Build.VERSION.SDK_INT < 24 || !h.equals("best fit")) {
            return Arrays.asList(C4875g.m31576h((String[]) list.toArray(new String[list.size()])));
        }
        return Arrays.asList(C4875g.m31580d((String[]) list.toArray(new String[list.size()])));
    }

    @AbstractC6709a
    public double compare(String str, String str2) {
        return this.f7880i.mo31563a(str, str2);
    }

    @AbstractC6709a
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f7879h.mo21163g().replace("-kn-true", "-kn"));
        linkedHashMap.put("usage", this.f7872a.toString());
        AbstractC4845a.EnumC4847c cVar = this.f7873b;
        if (cVar == AbstractC4845a.EnumC4847c.LOCALE) {
            linkedHashMap.put("sensitivity", this.f7880i.mo31561c().toString());
        } else {
            linkedHashMap.put("sensitivity", cVar.toString());
        }
        linkedHashMap.put("ignorePunctuation", Boolean.valueOf(this.f7874c));
        linkedHashMap.put("collation", this.f7875d);
        linkedHashMap.put("numeric", Boolean.valueOf(this.f7876e));
        linkedHashMap.put("caseFirst", this.f7877f.toString());
        return linkedHashMap;
    }
}
