package net.time4j.history;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.C10892f0;
import net.time4j.EnumC10882f;
import p143hj.AbstractC8046c;
import p143hj.AbstractC8078o0;
import p143hj.AbstractC8079p;
import p143hj.EnumC8042a0;
import p161ij.AbstractC8669t;
import p161ij.C8627a;
import p183jj.C9661l;
import p219lj.EnumC10455a;
import p234mj.EnumC10669b;

/* renamed from: net.time4j.history.d */
/* loaded from: classes8.dex */
public final class C10929d implements AbstractC8078o0, Serializable {

    /* renamed from: A */
    public static final C10929d f38933A;

    /* renamed from: B */
    public static final C10929d f38934B;

    /* renamed from: C */
    public static final C10929d f38935C;

    /* renamed from: D */
    private static final long f38936D;

    /* renamed from: E */
    private static final C10929d f38937E;

    /* renamed from: F */
    private static final C10929d f38938F;

    /* renamed from: G */
    private static final Map<String, C10929d> f38939G;
    private static final long serialVersionUID = 4100690610730913643L;

    /* renamed from: z */
    public static final AbstractC8046c<EnumC10455a> f24251z = C8627a.m18482e("YEAR_DEFINITION", EnumC10455a.class);

    /* renamed from: k */
    private final transient EnumC10669b f24252k;

    /* renamed from: l */
    private final transient List<C10932f> f24253l;

    /* renamed from: m */
    private final transient C10924a f24254m;

    /* renamed from: n */
    private final transient C10954o f24255n;

    /* renamed from: o */
    private final transient C10933g f24256o;

    /* renamed from: p */
    private final transient AbstractC8079p<C10934h> f24257p;

    /* renamed from: q */
    private final transient AbstractC8079p<EnumC10937j> f24258q;

    /* renamed from: r */
    private final transient AbstractC8669t<Integer> f24259r;

    /* renamed from: s */
    private final transient AbstractC8079p<Integer> f24260s;

    /* renamed from: t */
    private final transient AbstractC8079p<Integer> f24261t;

    /* renamed from: u */
    private final transient AbstractC8669t<Integer> f24262u;

    /* renamed from: v */
    private final transient AbstractC8669t<Integer> f24263v;

    /* renamed from: w */
    private final transient AbstractC8669t<Integer> f24264w;

    /* renamed from: x */
    private final transient AbstractC8079p<Integer> f24265x;

    /* renamed from: y */
    private final transient Set<AbstractC8079p<?>> f24266y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.history.d$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C10930a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24267a;

        /* renamed from: b */
        static final /* synthetic */ int[] f24268b;

        /* renamed from: c */
        static final /* synthetic */ int[] f24269c;

        static {
            int[] iArr = new int[EnumC10455a.values().length];
            f24269c = iArr;
            try {
                iArr[EnumC10455a.DUAL_DATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24269c[EnumC10455a.AFTER_NEW_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24269c[EnumC10455a.BEFORE_NEW_YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EnumC10937j.values().length];
            f24268b = iArr2;
            try {
                iArr2[EnumC10937j.HISPANIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24268b[EnumC10937j.BYZANTINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24268b[EnumC10937j.AB_URBE_CONDITA.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[EnumC10669b.values().length];
            f24267a = iArr3;
            try {
                iArr3[EnumC10669b.PROLEPTIC_GREGORIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24267a[EnumC10669b.PROLEPTIC_JULIAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24267a[EnumC10669b.PROLEPTIC_BYZANTINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f24267a[EnumC10669b.SWEDEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f24267a[EnumC10669b.INTRODUCTION_ON_1582_10_15.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f24267a[EnumC10669b.SINGLE_CUTOVER_DATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        EnumC10669b bVar = EnumC10669b.PROLEPTIC_GREGORIAN;
        EnumC10926c cVar = EnumC10926c.f24247k;
        f38933A = new C10929d(bVar, Collections.singletonList(new C10932f(Long.MIN_VALUE, cVar, cVar)));
        EnumC10669b bVar2 = EnumC10669b.PROLEPTIC_JULIAN;
        EnumC10926c cVar2 = EnumC10926c.f24248l;
        C10929d dVar = new C10929d(bVar2, Collections.singletonList(new C10932f(Long.MIN_VALUE, cVar2, cVar2)));
        f38934B = dVar;
        EnumC10669b bVar3 = EnumC10669b.PROLEPTIC_BYZANTINE;
        List singletonList = Collections.singletonList(new C10932f(Long.MIN_VALUE, cVar2, cVar2));
        EnumC10944n nVar = EnumC10944n.f24303m;
        f38935C = new C10929d(bVar3, singletonList, null, new C10954o(nVar, ViewDefaults.NUMBER_OF_LINES), C10933g.m11552c(C10892f0.m11835v0().m20709O()));
        long longValue = ((Long) C10892f0.m11875L0(1582, 10, 15).mo11371r(EnumC8042a0.MODIFIED_JULIAN_DATE)).longValue();
        f38936D = longValue;
        f38937E = m11589F(longValue);
        ArrayList arrayList = new ArrayList();
        EnumC10926c cVar3 = EnumC10926c.f24249m;
        arrayList.add(new C10932f(-57959L, cVar2, cVar3));
        arrayList.add(new C10932f(-53575L, cVar3, cVar2));
        arrayList.add(new C10932f(-38611L, cVar2, cVar));
        C10929d dVar2 = new C10929d(EnumC10669b.SWEDEN, Collections.unmodifiableList(arrayList));
        f38938F = dVar2;
        HashMap hashMap = new HashMap();
        EnumC10937j jVar = EnumC10937j.AD;
        C10892f0 d = dVar.m11578d(C10934h.m11540g(jVar, 988, 3, 1));
        C10892f0 d2 = dVar.m11578d(C10934h.m11540g(jVar, 1382, 12, 24));
        C10892f0 d3 = dVar.m11578d(C10934h.m11540g(jVar, 1421, 12, 24));
        C10892f0 d4 = dVar.m11578d(C10934h.m11540g(jVar, 1699, 12, 31));
        C10929d E = m11590E();
        EnumC10944n nVar2 = EnumC10944n.f24301k;
        C10954o d5 = nVar2.m11487d(1383);
        EnumC10944n nVar3 = EnumC10944n.f24304n;
        hashMap.put("ES", E.m11584K(d5.m11482b(nVar3.m11487d(1556))).m11585J(C10933g.m11549f(d2)));
        hashMap.put("PT", m11590E().m11584K(nVar2.m11487d(1422).m11482b(nVar3.m11487d(1556))).m11585J(C10933g.m11549f(d3)));
        hashMap.put("FR", m11588G(C10892f0.m11875L0(1582, 12, 20)).m11584K(EnumC10944n.f24305o.m11487d(1567)));
        hashMap.put("DE", m11590E().m11584K(nVar3.m11487d(1544)));
        hashMap.put("DE-BAYERN", m11588G(C10892f0.m11875L0(1583, 10, 16)).m11584K(nVar3.m11487d(1544)));
        hashMap.put("DE-PREUSSEN", m11588G(C10892f0.m11875L0(1610, 9, 2)).m11584K(nVar3.m11487d(1559)));
        hashMap.put("DE-PROTESTANT", m11588G(C10892f0.m11875L0(1700, 3, 1)).m11584K(nVar3.m11487d(1559)));
        hashMap.put("NL", m11588G(C10892f0.m11875L0(1583, 1, 1)));
        hashMap.put("AT", m11588G(C10892f0.m11875L0(1584, 1, 17)));
        hashMap.put("CH", m11588G(C10892f0.m11875L0(1584, 1, 22)));
        hashMap.put("HU", m11588G(C10892f0.m11875L0(1587, 11, 1)));
        C10929d G = m11588G(C10892f0.m11875L0(1700, 3, 1));
        EnumC10944n nVar4 = EnumC10944n.f24307q;
        hashMap.put("DK", G.m11584K(nVar4.m11487d(1623)));
        hashMap.put("NO", m11588G(C10892f0.m11875L0(1700, 3, 1)).m11584K(nVar4.m11487d(1623)));
        hashMap.put("IT", m11590E().m11584K(nVar3.m11487d(1583)));
        hashMap.put("IT-FLORENCE", m11590E().m11584K(nVar4.m11487d(1749)));
        hashMap.put("IT-PISA", m11590E().m11584K(EnumC10944n.f24308r.m11487d(1749)));
        C10929d E2 = m11590E();
        EnumC10944n nVar5 = EnumC10944n.f24302l;
        hashMap.put("IT-VENICE", E2.m11584K(nVar5.m11487d(1798)));
        hashMap.put("GB", m11588G(C10892f0.m11875L0(1752, 9, 14)).m11584K(nVar3.m11487d(1087).m11482b(nVar2.m11487d(1155)).m11482b(nVar4.m11487d(1752))));
        hashMap.put("GB-SCT", m11588G(C10892f0.m11875L0(1752, 9, 14)).m11584K(nVar3.m11487d(1087).m11482b(nVar2.m11487d(1155)).m11482b(nVar4.m11487d(1600))));
        hashMap.put("RU", m11588G(C10892f0.m11875L0(1918, 2, 14)).m11584K(nVar2.m11487d(988).m11482b(nVar5.m11487d(1493)).m11482b(nVar.m11487d(1700))).m11585J(C10933g.m11553b(d, d4)));
        hashMap.put("SE", dVar2);
        f38939G = Collections.unmodifiableMap(hashMap);
    }

    private C10929d(EnumC10669b bVar, List<C10932f> list) {
        this(bVar, list, null, null, C10933g.f24277d);
    }

    /* renamed from: A */
    private boolean m11594A(C10934h hVar) {
        int a = hVar.m11544c().m11528a(hVar.m11542e());
        if (this == f38935C) {
            if (a < -5508 || ((a == -5508 && hVar.m11543d() < 9) || a > 999979465)) {
                return true;
            }
            return false;
        } else if (this == f38934B) {
            if (Math.abs(a) > 999979465) {
                return true;
            }
            return false;
        } else if (this == f38933A) {
            if (Math.abs(a) > 999999999) {
                return true;
            }
            return false;
        } else if (a < -44 || a > 9999) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: D */
    public static C10929d m11591D(Locale locale) {
        C10929d dVar;
        String country = locale.getCountry();
        if (!locale.getVariant().isEmpty()) {
            country = country + "-" + locale.getVariant();
            dVar = f38939G.get(country);
        } else {
            dVar = null;
        }
        if (dVar == null) {
            dVar = f38939G.get(country);
        }
        if (dVar == null) {
            return m11590E();
        }
        return dVar;
    }

    /* renamed from: E */
    public static C10929d m11590E() {
        return f38937E;
    }

    /* renamed from: F */
    private static C10929d m11589F(long j) {
        EnumC10669b bVar;
        if (j == f38936D) {
            bVar = EnumC10669b.INTRODUCTION_ON_1582_10_15;
        } else {
            bVar = EnumC10669b.SINGLE_CUTOVER_DATE;
        }
        return new C10929d(bVar, Collections.singletonList(new C10932f(j, EnumC10926c.f24248l, EnumC10926c.f24247k)));
    }

    /* renamed from: G */
    public static C10929d m11588G(C10892f0 f0Var) {
        if (f0Var.equals(C10892f0.m11835v0().m20709O())) {
            return f38934B;
        }
        if (f0Var.equals(C10892f0.m11835v0().m20708P())) {
            return f38933A;
        }
        long longValue = ((Long) f0Var.mo11371r(EnumC8042a0.MODIFIED_JULIAN_DATE)).longValue();
        m11579c(longValue);
        if (longValue == f38936D) {
            return f38937E;
        }
        return m11589F(longValue);
    }

    /* renamed from: H */
    public static C10929d m11587H() {
        return f38938F;
    }

    /* renamed from: c */
    private static void m11579c(long j) {
        if (j < f38936D) {
            throw new IllegalArgumentException("Gregorian calendar did not exist before 1582-10-15");
        }
    }

    /* renamed from: j */
    public static C10929d m11572j(String str) {
        int i;
        C10929d dVar;
        C10929d dVar2;
        int i2;
        if (str.startsWith("historic-")) {
            String[] split = str.substring(9).split(":");
            if (split.length != 0) {
                EnumC10669b valueOf = EnumC10669b.valueOf(split[0]);
                switch (C10930a.f24267a[valueOf.ordinal()]) {
                    case 1:
                        return f38933A;
                    case 2:
                        return f38934B;
                    case 3:
                        return f38935C;
                    case 4:
                        dVar = m11587H();
                        i = 1;
                        break;
                    case 5:
                        if (m11563s(split, str).equals(C10892f0.m11875L0(1582, 10, 15))) {
                            dVar = m11590E();
                            i = 2;
                            break;
                        } else {
                            throw new IllegalArgumentException("Inconsistent cutover date: " + str);
                        }
                    case 6:
                        dVar = m11588G(m11563s(split, str));
                        i = 2;
                        break;
                    default:
                        throw new UnsupportedOperationException(valueOf.name());
                }
                String[] split2 = split[i].split("=");
                if (split2[0].equals("ancient-julian-leap-years")) {
                    String str2 = split2[1];
                    String substring = str2.substring(1, str2.length() - 1);
                    if (!substring.isEmpty()) {
                        String[] split3 = substring.split(",");
                        int[] iArr = new int[split3.length];
                        for (int i3 = 0; i3 < split3.length; i3++) {
                            iArr[i3] = 1 - Integer.parseInt(split3[i3]);
                        }
                        dVar = dVar.m11586I(C10924a.m11604f(iArr));
                    }
                }
                String[] split4 = split[i + 1].split("=");
                if (split4[0].equals("new-year-strategy")) {
                    String str3 = split4[1];
                    C10954o oVar = null;
                    for (String str4 : str3.substring(1, str3.length() - 1).split(",")) {
                        String[] split5 = str4.split("->");
                        EnumC10944n valueOf2 = EnumC10944n.valueOf(split5[0]);
                        if (split5.length == 2) {
                            i2 = Integer.parseInt(split5[1]);
                        } else {
                            i2 = ViewDefaults.NUMBER_OF_LINES;
                        }
                        if (oVar != null) {
                            oVar = oVar.m11482b(valueOf2.m11487d(i2));
                        } else if (valueOf2 != EnumC10944n.f24301k || i2 != 567) {
                            oVar = valueOf2.m11487d(i2);
                        }
                    }
                    dVar = dVar.m11584K(oVar);
                }
                String[] split6 = split[i + 2].split("=");
                if (!split6[0].equals("era-preference")) {
                    return dVar;
                }
                String str5 = split6[1];
                String substring2 = str5.substring(1, str5.length() - 1);
                if (substring2.equals("default")) {
                    return dVar;
                }
                String[] split7 = substring2.split(",");
                try {
                    EnumC10937j valueOf3 = EnumC10937j.valueOf(split7[0].substring(5));
                    C10892f0 i4 = C9661l.m15711i(split7[1].substring(7));
                    C10892f0 i5 = C9661l.m15711i(split7[2].substring(5));
                    int i6 = C10930a.f24268b[valueOf3.ordinal()];
                    if (i6 == 1) {
                        dVar2 = dVar.m11585J(C10933g.m11550e(i4, i5));
                    } else if (i6 == 2) {
                        dVar2 = dVar.m11585J(C10933g.m11553b(i4, i5));
                    } else if (i6 == 3) {
                        dVar2 = dVar.m11585J(C10933g.m11554a(i4, i5));
                    } else {
                        throw new IllegalArgumentException("BC/AD not allowed as era preference: " + str);
                    }
                    return dVar2;
                } catch (ParseException unused) {
                    throw new IllegalArgumentException("Invalid date syntax: " + str);
                }
            } else {
                throw new IllegalArgumentException("Invalid variant description.");
            }
        } else {
            throw new IllegalArgumentException("Variant does not start with \"historic-\": " + str);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    /* renamed from: s */
    private static C10892f0 m11563s(String[] strArr, String str) {
        String[] split = strArr[1].split("=");
        if (split.length == 2) {
            if (split[0].equals("cutover")) {
                try {
                    return C9661l.f21449m.m15893D(split[1]);
                } catch (ParseException unused) {
                }
            }
            throw new IllegalArgumentException("Invalid cutover definition: " + str);
        }
        throw new IllegalArgumentException("Invalid syntax in variant description: " + str);
    }

    /* renamed from: u */
    private AbstractC10925b m11561u() {
        C10924a aVar = this.f24254m;
        if (aVar != null) {
            return aVar.m11606d();
        }
        return EnumC10926c.f24248l;
    }

    private Object writeReplace() {
        return new SPX(this, 3);
    }

    /* renamed from: z */
    private static boolean m11556z(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: B */
    public boolean m11593B(C10934h hVar) {
        AbstractC10925b k;
        if (hVar == null || m11594A(hVar) || (k = m11571k(hVar)) == null || !k.mo11595d(hVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public AbstractC8669t<Integer> m11592C() {
        return this.f24262u;
    }

    /* renamed from: I */
    public C10929d m11586I(C10924a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Missing ancient julian leap years.");
        } else if (!m11557y()) {
            return this;
        } else {
            return new C10929d(this.f24252k, this.f24253l, aVar, this.f24255n, this.f24256o);
        }
    }

    /* renamed from: J */
    public C10929d m11585J(C10933g gVar) {
        if (gVar.equals(this.f24256o) || !m11557y()) {
            return this;
        }
        return new C10929d(this.f24252k, this.f24253l, this.f24254m, this.f24255n, gVar);
    }

    /* renamed from: K */
    public C10929d m11584K(C10954o oVar) {
        if (oVar.equals(C10954o.f24311d)) {
            if (this.f24255n == null) {
                return this;
            }
            return new C10929d(this.f24252k, this.f24253l, this.f24254m, null, this.f24256o);
        } else if (!m11557y()) {
            return this;
        } else {
            return new C10929d(this.f24252k, this.f24253l, this.f24254m, oVar, this.f24256o);
        }
    }

    /* renamed from: L */
    public AbstractC8079p<Integer> m11583L(EnumC10455a aVar) {
        int i = C10930a.f24269c[aVar.ordinal()];
        if (i == 1) {
            return this.f24259r;
        }
        if (i == 2) {
            return this.f24260s;
        }
        if (i == 3) {
            return this.f24261t;
        }
        throw new UnsupportedOperationException(aVar.name());
    }

    /* renamed from: M */
    public AbstractC8669t<Integer> m11582M() {
        return this.f24259r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C10934h m11581a(C10934h hVar) {
        AbstractC10925b k = m11571k(hVar);
        if (k == null) {
            return hVar;
        }
        int b = k.mo11597b(hVar);
        if (b < hVar.m11545b()) {
            return C10934h.m11540g(hVar.m11544c(), hVar.m11542e(), hVar.m11543d(), b);
        }
        return hVar;
    }

    /* renamed from: b */
    public AbstractC8079p<Integer> m11580b() {
        return this.f24265x;
    }

    /* renamed from: d */
    public C10892f0 m11578d(C10934h hVar) {
        if (!m11594A(hVar)) {
            AbstractC10925b k = m11571k(hVar);
            if (k != null) {
                return C10892f0.m11869Q0(k.mo11598a(hVar), EnumC8042a0.MODIFIED_JULIAN_DATE);
            }
            throw new IllegalArgumentException("Invalid historic date: " + hVar);
        }
        throw new IllegalArgumentException("Out of supported range: " + hVar);
    }

    /* renamed from: e */
    public C10934h m11577e(C10892f0 f0Var) {
        C10934h hVar;
        long longValue = ((Long) f0Var.mo11371r(EnumC8042a0.MODIFIED_JULIAN_DATE)).longValue();
        int size = this.f24253l.size() - 1;
        while (true) {
            if (size < 0) {
                hVar = null;
                break;
            }
            C10932f fVar = this.f24253l.get(size);
            if (longValue >= fVar.f24273a) {
                hVar = fVar.f24274b.mo11596c(longValue);
                break;
            }
            size--;
        }
        if (hVar == null) {
            hVar = m11561u().mo11596c(longValue);
        }
        EnumC10937j d = this.f24256o.m11551d(hVar, f0Var);
        if (d != hVar.m11544c()) {
            hVar = C10934h.m11540g(d, d.m11527b(hVar.m11544c(), hVar.m11542e()), hVar.m11543d(), hVar.m11545b());
        }
        if (!m11594A(hVar)) {
            return hVar;
        }
        throw new IllegalArgumentException("Out of supported range: " + hVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10929d) {
            C10929d dVar = (C10929d) obj;
            if (this.f24252k == dVar.f24252k && m11556z(this.f24254m, dVar.f24254m) && m11556z(this.f24255n, dVar.f24255n) && this.f24256o.equals(dVar.f24256o)) {
                if (this.f24252k != EnumC10669b.SINGLE_CUTOVER_DATE || this.f24253l.get(0).f24273a == dVar.f24253l.get(0).f24273a) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: f */
    public AbstractC8079p<C10934h> m11576f() {
        return this.f24257p;
    }

    /* renamed from: g */
    public AbstractC8079p<Integer> m11575g() {
        return this.f24263v;
    }

    /* renamed from: h */
    public AbstractC8079p<Integer> m11574h() {
        return this.f24264w;
    }

    public int hashCode() {
        EnumC10669b bVar = this.f24252k;
        if (bVar != EnumC10669b.SINGLE_CUTOVER_DATE) {
            return bVar.hashCode();
        }
        long j = this.f24253l.get(0).f24273a;
        return (int) (j ^ (j << 32));
    }

    /* renamed from: i */
    public AbstractC8079p<EnumC10937j> m11573i() {
        return this.f24258q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public AbstractC10925b m11571k(C10934h hVar) {
        for (int size = this.f24253l.size() - 1; size >= 0; size--) {
            C10932f fVar = this.f24253l.get(size);
            if (hVar.compareTo(fVar.f24275c) >= 0) {
                return fVar.f24274b;
            }
            if (hVar.compareTo(fVar.f24276d) > 0) {
                return null;
            }
        }
        return m11561u();
    }

    @Override // p143hj.AbstractC8078o0
    /* renamed from: l */
    public String mo11570l() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("historic-");
        sb2.append(this.f24252k.name());
        int i = C10930a.f24267a[this.f24252k.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            sb2.append(":no-cutover");
        } else {
            if (i == 5 || i == 6) {
                sb2.append(":cutover=");
                sb2.append(m11564r());
            }
            sb2.append(":ancient-julian-leap-years=");
            C10924a aVar = this.f24254m;
            if (aVar != null) {
                int[] e = aVar.m11605e();
                sb2.append('[');
                sb2.append(e[0]);
                for (int i2 = 1; i2 < e.length; i2++) {
                    sb2.append(',');
                    sb2.append(e[i2]);
                }
                sb2.append(']');
            } else {
                sb2.append("[]");
            }
            sb2.append(":new-year-strategy=");
            sb2.append(m11559w());
            sb2.append(":era-preference=");
            sb2.append(m11566p());
        }
        return sb2.toString();
    }

    /* renamed from: m */
    public C10924a m11569m() {
        C10924a aVar = this.f24254m;
        if (aVar != null) {
            return aVar;
        }
        throw new UnsupportedOperationException("No historic julian leap years were defined.");
    }

    /* renamed from: n */
    public C10934h m11568n(EnumC10937j jVar, int i) {
        C10934h d = m11559w().m11480d(jVar, i);
        if (m11593B(d)) {
            EnumC10937j d2 = this.f24256o.m11551d(d, m11578d(d));
            if (d2 != jVar) {
                return C10934h.m11540g(d2, d2.m11527b(d.m11544c(), d.m11542e()), d.m11543d(), d.m11545b());
            }
            return d;
        }
        throw new IllegalArgumentException("Cannot determine valid New Year: " + jVar + "-" + i);
    }

    /* renamed from: o */
    public Set<AbstractC8079p<?>> m11567o() {
        return this.f24266y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public C10933g m11566p() {
        return this.f24256o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public List<C10932f> m11565q() {
        return this.f24253l;
    }

    /* renamed from: r */
    public C10892f0 m11564r() {
        List<C10932f> list = this.f24253l;
        long j = list.get(list.size() - 1).f24273a;
        if (j != Long.MIN_VALUE) {
            return C10892f0.m11869Q0(j, EnumC8042a0.MODIFIED_JULIAN_DATE);
        }
        throw new UnsupportedOperationException("Proleptic history without any gregorian reform date.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public EnumC10669b m11562t() {
        return this.f24252k;
    }

    public String toString() {
        return "ChronoHistory[" + mo11570l() + "]";
    }

    /* renamed from: v */
    public int m11560v(EnumC10937j jVar, int i) {
        C10934h hVar;
        C10934h hVar2;
        try {
            C10954o oVar = this.f24255n;
            int i2 = 1;
            if (oVar == null) {
                hVar2 = C10934h.m11540g(jVar, i, 1, 1);
                hVar = C10934h.m11540g(jVar, i, 12, 31);
            } else {
                hVar2 = oVar.m11480d(jVar, i);
                if (jVar != EnumC10937j.BC) {
                    C10934h d = this.f24255n.m11480d(jVar, i + 1);
                    if (jVar == EnumC10937j.BYZANTINE) {
                        hVar = this.f24255n.m11480d(EnumC10937j.AD, jVar.m11528a(i));
                        if (hVar.compareTo(hVar2) > 0) {
                        }
                    }
                    hVar = d;
                } else if (i == 1) {
                    hVar = this.f24255n.m11480d(EnumC10937j.AD, 1);
                } else {
                    hVar = this.f24255n.m11480d(jVar, i - 1);
                }
                i2 = 0;
            }
            return (int) (EnumC10882f.f24155r.m11892c(m11578d(hVar2), m11578d(hVar)) + i2);
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    /* renamed from: w */
    public C10954o m11559w() {
        C10954o oVar = this.f24255n;
        return oVar == null ? C10954o.f24311d : oVar;
    }

    /* renamed from: x */
    public boolean m11558x() {
        return this.f24254m != null;
    }

    /* renamed from: y */
    public boolean m11557y() {
        List<C10932f> list = this.f24253l;
        return list.get(list.size() - 1).f24273a > Long.MIN_VALUE;
    }

    private C10929d(EnumC10669b bVar, List<C10932f> list, C10924a aVar, C10954o oVar, C10933g gVar) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("At least one cutover event must be present in chronological history.");
        } else if (bVar == null) {
            throw new NullPointerException("Missing historic variant.");
        } else if (gVar != null) {
            this.f24252k = bVar;
            this.f24253l = list;
            this.f24254m = aVar;
            this.f24255n = oVar;
            this.f24256o = gVar;
            C10935i iVar = new C10935i(this);
            this.f24257p = iVar;
            C10939k kVar = new C10939k(this);
            this.f24258q = kVar;
            C10941l lVar = new C10941l('y', 1, 999999999, this, 2);
            this.f24259r = lVar;
            C10941l lVar2 = new C10941l((char) 0, 1, 999999999, this, 6);
            this.f24260s = lVar2;
            C10941l lVar3 = new C10941l((char) 0, 1, 999999999, this, 7);
            this.f24261t = lVar3;
            C10941l lVar4 = new C10941l('M', 1, 12, this, 3);
            this.f24262u = lVar4;
            C10941l lVar5 = new C10941l('d', 1, 31, this, 4);
            this.f24263v = lVar5;
            C10941l lVar6 = new C10941l('D', 1, 365, this, 5);
            this.f24264w = lVar6;
            C10941l lVar7 = new C10941l((char) 0, 1, 10000000, this, 8);
            this.f24265x = lVar7;
            HashSet hashSet = new HashSet();
            hashSet.add(iVar);
            hashSet.add(kVar);
            hashSet.add(lVar);
            hashSet.add(lVar2);
            hashSet.add(lVar3);
            hashSet.add(lVar4);
            hashSet.add(lVar5);
            hashSet.add(lVar6);
            hashSet.add(lVar7);
            this.f24266y = Collections.unmodifiableSet(hashSet);
        } else {
            throw new NullPointerException("Missing era preference.");
        }
    }
}
