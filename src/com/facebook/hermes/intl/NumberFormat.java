package com.facebook.hermes.intl;

import android.os.Build;
import com.facebook.hermes.intl.AbstractC4861c;
import com.facebook.hermes.intl.C4879j;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p078e6.AbstractC6709a;
import p129h5.AbstractC7805b;
import p129h5.C7800a;
import p129h5.C7835h;
import p129h5.C7840i;
import p129h5.C7848j;

@AbstractC6709a
/* loaded from: classes7.dex */
public class NumberFormat {

    /* renamed from: v */
    private static String[] f7900v = {"acre", "bit", "byte", "celsius", "centimeter", "day", "degree", "fahrenheit", "fluid-ounce", "foot", "gallon", "gigabit", "gigabyte", "gram", "hectare", "hour", "inch", "kilobit", "kilobyte", "kilogram", "kilometer", "liter", "megabit", "megabyte", "meter", "mile", "mile-scandinavian", "milliliter", "millimeter", "millisecond", "minute", "month", "ounce", "percent", "petabyte", "pound", "second", "stone", "terabit", "terabyte", "week", "yard", "year"};

    /* renamed from: a */
    private AbstractC4861c.EnumC4868h f7901a;

    /* renamed from: f */
    private AbstractC4861c.EnumC4869i f7906f;

    /* renamed from: m */
    private AbstractC4861c.EnumC4866f f7913m;

    /* renamed from: o */
    private AbstractC4861c f7915o;

    /* renamed from: p */
    private boolean f7916p;

    /* renamed from: s */
    private AbstractC4861c.EnumC4863b f7919s;

    /* renamed from: b */
    private String f7902b = null;

    /* renamed from: c */
    private AbstractC4861c.EnumC0117c f7903c = AbstractC4861c.EnumC0117c.SYMBOL;

    /* renamed from: d */
    private AbstractC4861c.EnumC4864d f7904d = AbstractC4861c.EnumC4864d.STANDARD;

    /* renamed from: e */
    private String f7905e = null;

    /* renamed from: g */
    private boolean f7907g = true;

    /* renamed from: h */
    private int f7908h = -1;

    /* renamed from: i */
    private int f7909i = -1;

    /* renamed from: j */
    private int f7910j = -1;

    /* renamed from: k */
    private int f7911k = -1;

    /* renamed from: l */
    private int f7912l = -1;

    /* renamed from: n */
    private AbstractC4861c.EnumC4867g f7914n = AbstractC4861c.EnumC4867g.AUTO;

    /* renamed from: q */
    private String f7917q = null;

    /* renamed from: r */
    private AbstractC4861c.EnumC4865e f7918r = null;

    /* renamed from: t */
    private AbstractC7805b<?> f7920t = null;

    /* renamed from: u */
    private AbstractC7805b<?> f7921u = null;

    @AbstractC6709a
    public NumberFormat(List<String> list, Map<String, Object> map) {
        String str;
        if (Build.VERSION.SDK_INT >= 24) {
            this.f7915o = new C4893q();
        } else {
            this.f7915o = new C4891p();
        }
        m31636a(list, map);
        AbstractC4861c cVar = this.f7915o;
        AbstractC7805b<?> bVar = this.f7920t;
        if (this.f7916p) {
            str = "";
        } else {
            str = this.f7917q;
        }
        cVar.mo31526j(bVar, str, this.f7901a, this.f7904d, this.f7918r, this.f7919s).mo31532d(this.f7902b, this.f7903c).mo31529g(this.f7907g).mo31530f(this.f7908h).mo31531e(this.f7913m, this.f7911k, this.f7912l).mo31528h(this.f7913m, this.f7909i, this.f7910j).mo31525k(this.f7914n).mo31527i(this.f7905e, this.f7906f);
    }

    /* renamed from: a */
    private void m31636a(List<String> list, Map<String, Object> map) {
        Object obj;
        Object obj2;
        int i;
        Object q = C7840i.m21242q();
        C4879j.EnumC4880a aVar = C4879j.EnumC4880a.STRING;
        C7840i.m21256c(q, "localeMatcher", C4879j.m31565c(map, "localeMatcher", aVar, C7800a.f16998a, "best fit"));
        Object c = C4879j.m31565c(map, "numberingSystem", aVar, C7840i.m21255d(), C7840i.m21255d());
        if (C7840i.m21245n(c) || m31635b(C7840i.m21251h(c))) {
            C7840i.m21256c(q, "nu", c);
            HashMap<String, Object> a = C4878i.m31568a(list, q, Collections.singletonList("nu"));
            AbstractC7805b<?> bVar = (AbstractC7805b) C7840i.m21252g(a).get("locale");
            this.f7920t = bVar;
            this.f7921u = bVar.mo21166d();
            Object a2 = C7840i.m21258a(a, "nu");
            if (!C7840i.m21249j(a2)) {
                this.f7916p = false;
                this.f7917q = C7840i.m21251h(a2);
            } else {
                this.f7916p = true;
                this.f7917q = this.f7915o.mo31534b(this.f7920t);
            }
            m31629h(map);
            if (this.f7901a == AbstractC4861c.EnumC4868h.CURRENCY) {
                if (Build.VERSION.SDK_INT >= 24) {
                    i = C4893q.m31522n(this.f7902b);
                } else {
                    i = C4891p.m31544n(this.f7902b);
                }
                double d = i;
                obj = C7840i.m21243p(d);
                obj2 = C7840i.m21243p(d);
            } else {
                obj = C7840i.m21243p(0.0d);
                if (this.f7901a == AbstractC4861c.EnumC4868h.PERCENT) {
                    obj2 = C7840i.m21243p(0.0d);
                } else {
                    obj2 = C7840i.m21243p(3.0d);
                }
            }
            this.f7918r = (AbstractC4861c.EnumC4865e) C4879j.m31564d(AbstractC4861c.EnumC4865e.class, C7840i.m21251h(C4879j.m31565c(map, "notation", aVar, new String[]{"standard", "scientific", "engineering", "compact"}, "standard")));
            m31630g(map, obj, obj2);
            Object c2 = C4879j.m31565c(map, "compactDisplay", aVar, new String[]{"short", "long"}, "short");
            if (this.f7918r == AbstractC4861c.EnumC4865e.COMPACT) {
                this.f7919s = (AbstractC4861c.EnumC4863b) C4879j.m31564d(AbstractC4861c.EnumC4863b.class, C7840i.m21251h(c2));
            }
            this.f7907g = C7840i.m21254e(C4879j.m31565c(map, "useGrouping", C4879j.EnumC4880a.BOOLEAN, C7840i.m21255d(), C7840i.m21244o(true)));
            this.f7914n = (AbstractC4861c.EnumC4867g) C4879j.m31564d(AbstractC4861c.EnumC4867g.class, C7840i.m21251h(C4879j.m31565c(map, "signDisplay", aVar, new String[]{"auto", ReactScrollViewHelper.OVER_SCROLL_NEVER, ReactScrollViewHelper.OVER_SCROLL_ALWAYS, "exceptZero"}, "auto")));
            return;
        }
        throw new C7848j("Invalid numbering system !");
    }

    /* renamed from: b */
    private boolean m31635b(String str) {
        return C7835h.m21267o(str, 0, str.length() - 1);
    }

    /* renamed from: c */
    private boolean m31634c(String str) {
        return Arrays.binarySearch(f7900v, str) >= 0;
    }

    /* renamed from: d */
    private boolean m31633d(String str) {
        return m31631f(str).matches("^[A-Z][A-Z][A-Z]$");
    }

    /* renamed from: e */
    private boolean m31632e(String str) {
        if (m31634c(str)) {
            return true;
        }
        int indexOf = str.indexOf("-per-");
        if (indexOf >= 0 && str.indexOf("-per-", indexOf + 1) < 0 && m31634c(str.substring(0, indexOf)) && m31634c(str.substring(indexOf + 5))) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private String m31631f(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < 'a' || charAt > 'z') {
                sb2.append(charAt);
            } else {
                sb2.append((char) (charAt - ' '));
            }
        }
        return sb2.toString();
    }

    /* renamed from: g */
    private void m31630g(Map<String, Object> map, Object obj, Object obj2) {
        Object b = C4879j.m31566b(map, "minimumIntegerDigits", C7840i.m21243p(1.0d), C7840i.m21243p(21.0d), C7840i.m21243p(1.0d));
        Object a = C7840i.m21258a(map, "minimumFractionDigits");
        Object a2 = C7840i.m21258a(map, "maximumFractionDigits");
        Object a3 = C7840i.m21258a(map, "minimumSignificantDigits");
        Object a4 = C7840i.m21258a(map, "maximumSignificantDigits");
        this.f7908h = (int) Math.floor(C7840i.m21253f(b));
        if (!C7840i.m21245n(a3) || !C7840i.m21245n(a4)) {
            this.f7913m = AbstractC4861c.EnumC4866f.SIGNIFICANT_DIGITS;
            Object a5 = C4879j.m31567a(a3, C7840i.m21243p(1.0d), C7840i.m21243p(21.0d), C7840i.m21243p(1.0d));
            Object a6 = C4879j.m31567a(a4, a5, C7840i.m21243p(21.0d), C7840i.m21243p(21.0d));
            this.f7911k = (int) Math.floor(C7840i.m21253f(a5));
            this.f7912l = (int) Math.floor(C7840i.m21253f(a6));
        } else if (!C7840i.m21245n(a) || !C7840i.m21245n(a2)) {
            this.f7913m = AbstractC4861c.EnumC4866f.FRACTION_DIGITS;
            Object a7 = C4879j.m31567a(a, C7840i.m21243p(0.0d), C7840i.m21243p(20.0d), obj);
            Object a8 = C4879j.m31567a(a2, a7, C7840i.m21243p(20.0d), C7840i.m21243p(Math.max(C7840i.m21253f(a7), C7840i.m21253f(obj2))));
            this.f7909i = (int) Math.floor(C7840i.m21253f(a7));
            this.f7910j = (int) Math.floor(C7840i.m21253f(a8));
        } else {
            AbstractC4861c.EnumC4865e eVar = this.f7918r;
            if (eVar == AbstractC4861c.EnumC4865e.COMPACT) {
                this.f7913m = AbstractC4861c.EnumC4866f.COMPACT_ROUNDING;
            } else if (eVar == AbstractC4861c.EnumC4865e.ENGINEERING) {
                this.f7913m = AbstractC4861c.EnumC4866f.FRACTION_DIGITS;
                this.f7910j = 5;
            } else {
                this.f7913m = AbstractC4861c.EnumC4866f.FRACTION_DIGITS;
                this.f7909i = (int) Math.floor(C7840i.m21253f(obj));
                this.f7910j = (int) Math.floor(C7840i.m21253f(obj2));
            }
        }
    }

    /* renamed from: h */
    private void m31629h(Map<String, Object> map) {
        C4879j.EnumC4880a aVar = C4879j.EnumC4880a.STRING;
        this.f7901a = (AbstractC4861c.EnumC4868h) C4879j.m31564d(AbstractC4861c.EnumC4868h.class, C7840i.m21251h(C4879j.m31565c(map, "style", aVar, new String[]{"decimal", "percent", "currency", "unit"}, "decimal")));
        Object c = C4879j.m31565c(map, "currency", aVar, C7840i.m21255d(), C7840i.m21255d());
        if (C7840i.m21245n(c)) {
            if (this.f7901a == AbstractC4861c.EnumC4868h.CURRENCY) {
                throw new C7848j("Expected currency style !");
            }
        } else if (!m31633d(C7840i.m21251h(c))) {
            throw new C7848j("Malformed currency code !");
        }
        Object c2 = C4879j.m31565c(map, "currencyDisplay", aVar, new String[]{"symbol", "narrowSymbol", "code", "name"}, "symbol");
        Object c3 = C4879j.m31565c(map, "currencySign", aVar, new String[]{"accounting", "standard"}, "standard");
        Object c4 = C4879j.m31565c(map, "unit", aVar, C7840i.m21255d(), C7840i.m21255d());
        if (C7840i.m21245n(c4)) {
            if (this.f7901a == AbstractC4861c.EnumC4868h.UNIT) {
                throw new C7848j("Expected unit !");
            }
        } else if (!m31632e(C7840i.m21251h(c4))) {
            throw new C7848j("Malformed unit identifier !");
        }
        Object c5 = C4879j.m31565c(map, "unitDisplay", aVar, new String[]{"long", "short", "narrow"}, "short");
        AbstractC4861c.EnumC4868h hVar = this.f7901a;
        if (hVar == AbstractC4861c.EnumC4868h.CURRENCY) {
            this.f7902b = m31631f(C7840i.m21251h(c));
            this.f7903c = (AbstractC4861c.EnumC0117c) C4879j.m31564d(AbstractC4861c.EnumC0117c.class, C7840i.m21251h(c2));
            this.f7904d = (AbstractC4861c.EnumC4864d) C4879j.m31564d(AbstractC4861c.EnumC4864d.class, C7840i.m21251h(c3));
        } else if (hVar == AbstractC4861c.EnumC4868h.UNIT) {
            this.f7905e = C7840i.m21251h(c4);
            this.f7906f = (AbstractC4861c.EnumC4869i) C4879j.m31564d(AbstractC4861c.EnumC4869i.class, C7840i.m21251h(c5));
        }
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

    @AbstractC6709a
    public String format(double d) {
        return this.f7915o.mo31533c(d);
    }

    @AbstractC6709a
    public List<Map<String, String>> formatToParts(double d) {
        String str;
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator a = this.f7915o.mo31535a(d);
        StringBuilder sb2 = new StringBuilder();
        for (char first = a.first(); first != 65535; first = a.next()) {
            sb2.append(first);
            if (a.getIndex() + 1 == a.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = a.getAttributes().keySet().iterator();
                if (it.hasNext()) {
                    str = this.f7915o.mo31524l(it.next(), d);
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
        linkedHashMap.put("locale", this.f7921u.mo21163g());
        linkedHashMap.put("numberingSystem", this.f7917q);
        linkedHashMap.put("style", this.f7901a.toString());
        AbstractC4861c.EnumC4868h hVar = this.f7901a;
        if (hVar == AbstractC4861c.EnumC4868h.CURRENCY) {
            linkedHashMap.put("currency", this.f7902b);
            linkedHashMap.put("currencyDisplay", this.f7903c.toString());
            linkedHashMap.put("currencySign", this.f7904d.toString());
        } else if (hVar == AbstractC4861c.EnumC4868h.UNIT) {
            linkedHashMap.put("unit", this.f7905e);
            linkedHashMap.put("unitDisplay", this.f7906f.toString());
        }
        int i = this.f7908h;
        if (i != -1) {
            linkedHashMap.put("minimumIntegerDigits", Integer.valueOf(i));
        }
        AbstractC4861c.EnumC4866f fVar = this.f7913m;
        if (fVar == AbstractC4861c.EnumC4866f.SIGNIFICANT_DIGITS) {
            int i2 = this.f7912l;
            if (i2 != -1) {
                linkedHashMap.put("minimumSignificantDigits", Integer.valueOf(i2));
            }
            int i3 = this.f7911k;
            if (i3 != -1) {
                linkedHashMap.put("maximumSignificantDigits", Integer.valueOf(i3));
            }
        } else if (fVar == AbstractC4861c.EnumC4866f.FRACTION_DIGITS) {
            int i4 = this.f7909i;
            if (i4 != -1) {
                linkedHashMap.put("minimumFractionDigits", Integer.valueOf(i4));
            }
            int i5 = this.f7910j;
            if (i5 != -1) {
                linkedHashMap.put("maximumFractionDigits", Integer.valueOf(i5));
            }
        }
        linkedHashMap.put("useGrouping", Boolean.valueOf(this.f7907g));
        linkedHashMap.put("notation", this.f7918r.toString());
        if (this.f7918r == AbstractC4861c.EnumC4865e.COMPACT) {
            linkedHashMap.put("compactDisplay", this.f7919s.toString());
        }
        linkedHashMap.put("signDisplay", this.f7914n.toString());
        return linkedHashMap;
    }
}
