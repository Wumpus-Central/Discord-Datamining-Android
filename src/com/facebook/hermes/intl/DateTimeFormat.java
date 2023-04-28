package com.facebook.hermes.intl;

import android.os.Build;
import com.facebook.hermes.intl.AbstractC4849b;
import com.facebook.hermes.intl.C4879j;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import p078e6.AbstractC6709a;
import p129h5.AbstractC7805b;
import p129h5.C7800a;
import p129h5.C7835h;
import p129h5.C7840i;
import p129h5.C7848j;

@AbstractC6709a
/* loaded from: classes7.dex */
public class DateTimeFormat {

    /* renamed from: a */
    AbstractC4849b f7881a;

    /* renamed from: d */
    private boolean f7884d;

    /* renamed from: e */
    private String f7885e;

    /* renamed from: f */
    private boolean f7886f;

    /* renamed from: g */
    private String f7887g;

    /* renamed from: h */
    private AbstractC4849b.EnumC4854f f7888h;

    /* renamed from: i */
    private AbstractC4849b.EnumC4852d f7889i;

    /* renamed from: j */
    private AbstractC4849b.EnumC4859k f7890j;

    /* renamed from: k */
    private AbstractC4849b.EnumC4851c f7891k;

    /* renamed from: l */
    private AbstractC4849b.EnumC4860l f7892l;

    /* renamed from: m */
    private AbstractC4849b.EnumC4856h f7893m;

    /* renamed from: n */
    private AbstractC4849b.EnumC0116b f7894n;

    /* renamed from: o */
    private AbstractC4849b.EnumC4853e f7895o;

    /* renamed from: p */
    private AbstractC4849b.EnumC4855g f7896p;

    /* renamed from: q */
    private AbstractC4849b.EnumC4857i f7897q;

    /* renamed from: r */
    private AbstractC4849b.EnumC4858j f7898r;

    /* renamed from: b */
    private AbstractC7805b<?> f7882b = null;

    /* renamed from: c */
    private AbstractC7805b<?> f7883c = null;

    /* renamed from: s */
    private Object f7899s = null;

    @AbstractC6709a
    public DateTimeFormat(List<String> list, Map<String, Object> map) {
        String str;
        if (Build.VERSION.SDK_INT >= 24) {
            this.f7881a = new C4889o();
        } else {
            this.f7881a = new C4887n();
        }
        m31641c(list, map);
        AbstractC4849b bVar = this.f7881a;
        AbstractC7805b<?> bVar2 = this.f7882b;
        String str2 = "";
        if (this.f7884d) {
            str = str2;
        } else {
            str = this.f7885e;
        }
        bVar.mo31549g(bVar2, str, !this.f7886f ? this.f7887g : str2, this.f7889i, this.f7890j, this.f7891k, this.f7892l, this.f7893m, this.f7894n, this.f7895o, this.f7896p, this.f7897q, this.f7898r, this.f7888h, this.f7899s);
    }

    /* renamed from: a */
    private Object m31643a() {
        return this.f7881a.mo31550f(this.f7882b);
    }

    /* renamed from: b */
    private Object m31642b(Object obj, String str, String str2) {
        if (C7840i.m21247l(obj)) {
            boolean z = true;
            if (str.equals("date") || str.equals("any")) {
                String[] strArr = {"weekday", "year", "month", "day"};
                for (int i = 0; i < 4; i++) {
                    if (!C7840i.m21245n(C7840i.m21258a(obj, strArr[i]))) {
                        z = false;
                    }
                }
            }
            if (str.equals("time") || str.equals("any")) {
                String[] strArr2 = {"hour", "minute", "second"};
                for (int i2 = 0; i2 < 3; i2++) {
                    if (!C7840i.m21245n(C7840i.m21258a(obj, strArr2[i2]))) {
                        z = false;
                    }
                }
            }
            if (z && (str2.equals("date") || str2.equals("all"))) {
                String[] strArr3 = {"year", "month", "day"};
                for (int i3 = 0; i3 < 3; i3++) {
                    C7840i.m21256c(obj, strArr3[i3], "numeric");
                }
            }
            if (z && (str2.equals("time") || str2.equals("all"))) {
                String[] strArr4 = {"hour", "minute", "second"};
                for (int i4 = 0; i4 < 3; i4++) {
                    C7840i.m21256c(obj, strArr4[i4], "numeric");
                }
            }
            return obj;
        }
        throw new C7848j("Invalid options object !");
    }

    /* renamed from: c */
    private void m31641c(List<String> list, Map<String, Object> map) {
        Object obj;
        AbstractC4849b.EnumC4854f fVar;
        List asList = Arrays.asList("ca", "nu", "hc");
        Object b = m31642b(map, "any", "date");
        Object q = C7840i.m21242q();
        C4879j.EnumC4880a aVar = C4879j.EnumC4880a.STRING;
        C7840i.m21256c(q, "localeMatcher", C4879j.m31565c(b, "localeMatcher", aVar, C7800a.f16998a, "best fit"));
        Object c = C4879j.m31565c(b, "calendar", aVar, C7840i.m21255d(), C7840i.m21255d());
        if (C7840i.m21245n(c) || m31640d(C7840i.m21251h(c))) {
            C7840i.m21256c(q, "ca", c);
            Object c2 = C4879j.m31565c(b, "numberingSystem", aVar, C7840i.m21255d(), C7840i.m21255d());
            if (C7840i.m21245n(c2) || m31640d(C7840i.m21251h(c2))) {
                C7840i.m21256c(q, "nu", c2);
                Object c3 = C4879j.m31565c(b, "hour12", C4879j.EnumC4880a.BOOLEAN, C7840i.m21255d(), C7840i.m21255d());
                Object c4 = C4879j.m31565c(b, "hourCycle", aVar, new String[]{"h11", "h12", "h23", "h24"}, C7840i.m21255d());
                if (!C7840i.m21245n(c3)) {
                    c4 = C7840i.m21257b();
                }
                C7840i.m21256c(q, "hc", c4);
                HashMap<String, Object> a = C4878i.m31568a(list, q, asList);
                AbstractC7805b<?> bVar = (AbstractC7805b) C7840i.m21252g(a).get("locale");
                this.f7882b = bVar;
                this.f7883c = bVar.mo21166d();
                Object a2 = C7840i.m21258a(a, "ca");
                if (!C7840i.m21249j(a2)) {
                    this.f7884d = false;
                    this.f7885e = C7840i.m21251h(a2);
                } else {
                    this.f7884d = true;
                    this.f7885e = this.f7881a.mo31548h(this.f7882b);
                }
                Object a3 = C7840i.m21258a(a, "nu");
                if (!C7840i.m21249j(a3)) {
                    this.f7886f = false;
                    this.f7887g = C7840i.m21251h(a3);
                } else {
                    this.f7886f = true;
                    this.f7887g = this.f7881a.mo31554b(this.f7882b);
                }
                Object a4 = C7840i.m21258a(a, "hc");
                Object a5 = C7840i.m21258a(b, "timeZone");
                if (C7840i.m21245n(a5)) {
                    obj = m31643a();
                } else {
                    obj = m31639e(a5.toString());
                }
                this.f7899s = obj;
                this.f7889i = (AbstractC4849b.EnumC4852d) C4879j.m31564d(AbstractC4849b.EnumC4852d.class, C7840i.m21251h(C4879j.m31565c(b, "formatMatcher", aVar, new String[]{"basic", "best fit"}, "best fit")));
                this.f7890j = (AbstractC4849b.EnumC4859k) C4879j.m31564d(AbstractC4849b.EnumC4859k.class, C4879j.m31565c(b, "weekday", aVar, new String[]{"long", "short", "narrow"}, C7840i.m21255d()));
                this.f7891k = (AbstractC4849b.EnumC4851c) C4879j.m31564d(AbstractC4849b.EnumC4851c.class, C4879j.m31565c(b, "era", aVar, new String[]{"long", "short", "narrow"}, C7840i.m21255d()));
                this.f7892l = (AbstractC4849b.EnumC4860l) C4879j.m31564d(AbstractC4849b.EnumC4860l.class, C4879j.m31565c(b, "year", aVar, new String[]{"numeric", "2-digit"}, C7840i.m21255d()));
                this.f7893m = (AbstractC4849b.EnumC4856h) C4879j.m31564d(AbstractC4849b.EnumC4856h.class, C4879j.m31565c(b, "month", aVar, new String[]{"numeric", "2-digit", "long", "short", "narrow"}, C7840i.m21255d()));
                this.f7894n = (AbstractC4849b.EnumC0116b) C4879j.m31564d(AbstractC4849b.EnumC0116b.class, C4879j.m31565c(b, "day", aVar, new String[]{"numeric", "2-digit"}, C7840i.m21255d()));
                Object c5 = C4879j.m31565c(b, "hour", aVar, new String[]{"numeric", "2-digit"}, C7840i.m21255d());
                this.f7895o = (AbstractC4849b.EnumC4853e) C4879j.m31564d(AbstractC4849b.EnumC4853e.class, c5);
                this.f7896p = (AbstractC4849b.EnumC4855g) C4879j.m31564d(AbstractC4849b.EnumC4855g.class, C4879j.m31565c(b, "minute", aVar, new String[]{"numeric", "2-digit"}, C7840i.m21255d()));
                this.f7897q = (AbstractC4849b.EnumC4857i) C4879j.m31564d(AbstractC4849b.EnumC4857i.class, C4879j.m31565c(b, "second", aVar, new String[]{"numeric", "2-digit"}, C7840i.m21255d()));
                this.f7898r = (AbstractC4849b.EnumC4858j) C4879j.m31564d(AbstractC4849b.EnumC4858j.class, C4879j.m31565c(b, "timeZoneName", aVar, new String[]{"long", "short"}, C7840i.m21255d()));
                if (C7840i.m21245n(c5)) {
                    this.f7888h = AbstractC4849b.EnumC4854f.UNDEFINED;
                    return;
                }
                AbstractC4849b.EnumC4854f d = this.f7881a.mo31552d(this.f7882b);
                if (C7840i.m21249j(a4)) {
                    fVar = d;
                } else {
                    fVar = (AbstractC4849b.EnumC4854f) C4879j.m31564d(AbstractC4849b.EnumC4854f.class, a4);
                }
                if (!C7840i.m21245n(c3)) {
                    if (C7840i.m21254e(c3)) {
                        fVar = AbstractC4849b.EnumC4854f.H11;
                        if (!(d == fVar || d == AbstractC4849b.EnumC4854f.H23)) {
                            fVar = AbstractC4849b.EnumC4854f.H12;
                        }
                    } else {
                        fVar = (d == AbstractC4849b.EnumC4854f.H11 || d == AbstractC4849b.EnumC4854f.H23) ? AbstractC4849b.EnumC4854f.H23 : AbstractC4849b.EnumC4854f.H24;
                    }
                }
                this.f7888h = fVar;
                return;
            }
            throw new C7848j("Invalid numbering system !");
        }
        throw new C7848j("Invalid calendar option !");
    }

    /* renamed from: d */
    private boolean m31640d(String str) {
        return C7835h.m21267o(str, 0, str.length() - 1);
    }

    @AbstractC6709a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        String h = C7840i.m21251h(C4879j.m31565c(map, "localeMatcher", C4879j.EnumC4880a.STRING, C7800a.f16998a, "best fit"));
        String[] strArr = new String[list.size()];
        if (Build.VERSION.SDK_INT < 24 || !h.equals("best fit")) {
            return Arrays.asList(C4875g.m31576h((String[]) list.toArray(strArr)));
        }
        return Arrays.asList(C4875g.m31580d((String[]) list.toArray(strArr)));
    }

    /* renamed from: e */
    public String m31639e(String str) {
        String[] availableIDs;
        for (String str2 : TimeZone.getAvailableIDs()) {
            if (m31638f(str2).equals(m31638f(str))) {
                return str2;
            }
        }
        throw new C7848j("Invalid timezone name!");
    }

    /* renamed from: f */
    public String m31638f(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < 'A' || charAt > 'Z') {
                sb2.append(charAt);
            } else {
                sb2.append((char) (charAt + ' '));
            }
        }
        return sb2.toString();
    }

    @AbstractC6709a
    public String format(double d) {
        return this.f7881a.mo31553c(d);
    }

    @AbstractC6709a
    public List<Map<String, String>> formatToParts(double d) {
        String str;
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator a = this.f7881a.mo31555a(d);
        StringBuilder sb2 = new StringBuilder();
        for (char first = a.first(); first != 65535; first = a.next()) {
            sb2.append(first);
            if (a.getIndex() + 1 == a.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = a.getAttributes().keySet().iterator();
                if (it.hasNext()) {
                    str = this.f7881a.mo31551e(it.next(), sb2.toString());
                } else {
                    str = "literal";
                }
                String sb3 = sb2.toString();
                sb2.setLength(0);
                HashMap hashMap = new HashMap();
                hashMap.put("type", str);
                hashMap.put("value", sb3);
                arrayList.add(hashMap);
            }
        }
        return arrayList;
    }

    @AbstractC6709a
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f7883c.mo21163g());
        linkedHashMap.put("numberingSystem", this.f7887g);
        linkedHashMap.put("calendar", this.f7885e);
        linkedHashMap.put("timeZone", this.f7899s);
        AbstractC4849b.EnumC4854f fVar = this.f7888h;
        if (fVar != AbstractC4849b.EnumC4854f.UNDEFINED) {
            linkedHashMap.put("hourCycle", fVar.toString());
            AbstractC4849b.EnumC4854f fVar2 = this.f7888h;
            if (fVar2 == AbstractC4849b.EnumC4854f.H11 || fVar2 == AbstractC4849b.EnumC4854f.H12) {
                linkedHashMap.put("hour12", Boolean.TRUE);
            } else {
                linkedHashMap.put("hour12", Boolean.FALSE);
            }
        }
        AbstractC4849b.EnumC4859k kVar = this.f7890j;
        if (kVar != AbstractC4849b.EnumC4859k.UNDEFINED) {
            linkedHashMap.put("weekday", kVar.toString());
        }
        AbstractC4849b.EnumC4851c cVar = this.f7891k;
        if (cVar != AbstractC4849b.EnumC4851c.UNDEFINED) {
            linkedHashMap.put("era", cVar.toString());
        }
        AbstractC4849b.EnumC4860l lVar = this.f7892l;
        if (lVar != AbstractC4849b.EnumC4860l.UNDEFINED) {
            linkedHashMap.put("year", lVar.toString());
        }
        AbstractC4849b.EnumC4856h hVar = this.f7893m;
        if (hVar != AbstractC4849b.EnumC4856h.UNDEFINED) {
            linkedHashMap.put("month", hVar.toString());
        }
        AbstractC4849b.EnumC0116b bVar = this.f7894n;
        if (bVar != AbstractC4849b.EnumC0116b.UNDEFINED) {
            linkedHashMap.put("day", bVar.toString());
        }
        AbstractC4849b.EnumC4853e eVar = this.f7895o;
        if (eVar != AbstractC4849b.EnumC4853e.UNDEFINED) {
            linkedHashMap.put("hour", eVar.toString());
        }
        AbstractC4849b.EnumC4855g gVar = this.f7896p;
        if (gVar != AbstractC4849b.EnumC4855g.UNDEFINED) {
            linkedHashMap.put("minute", gVar.toString());
        }
        AbstractC4849b.EnumC4857i iVar = this.f7897q;
        if (iVar != AbstractC4849b.EnumC4857i.UNDEFINED) {
            linkedHashMap.put("second", iVar.toString());
        }
        AbstractC4849b.EnumC4858j jVar = this.f7898r;
        if (jVar != AbstractC4849b.EnumC4858j.UNDEFINED) {
            linkedHashMap.put("timeZoneName", jVar.toString());
        }
        return linkedHashMap;
    }
}
