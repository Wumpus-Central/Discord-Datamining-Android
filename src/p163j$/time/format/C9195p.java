package p163j$.time.format;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import p163j$.time.AbstractC9209m;
import p163j$.time.ZoneOffset;
import p163j$.time.chrono.C9176h;
import p163j$.time.temporal.AbstractC9221i;
import p163j$.time.temporal.AbstractC9222j;
import p163j$.time.temporal.AbstractC9223k;
import p163j$.time.temporal.AbstractC9224l;
import p163j$.time.temporal.AbstractC9226n;
import p163j$.time.temporal.EnumC9213a;

/* renamed from: j$.time.format.p */
/* loaded from: classes2.dex */
public final class C9195p {

    /* renamed from: f */
    private static final C9180a f20183f = new AbstractC9226n() { // from class: j$.time.format.a
        @Override // p163j$.time.temporal.AbstractC9226n
        /* renamed from: a */
        public final Object mo16624a(AbstractC9223k kVar) {
            int i = C9195p.f20184g;
            AbstractC9209m mVar = (AbstractC9209m) kVar.mo16632d(AbstractC9222j.m16636j());
            if (mVar == null || (mVar instanceof ZoneOffset)) {
                return null;
            }
            return mVar;
        }
    };

    /* renamed from: g */
    public static final /* synthetic */ int f20184g = 0;

    /* renamed from: a */
    private C9195p f20185a;

    /* renamed from: b */
    private final C9195p f20186b;

    /* renamed from: c */
    private final ArrayList f20187c;

    /* renamed from: d */
    private final boolean f20188d;

    /* renamed from: e */
    private int f20189e;

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.format.a] */
    static {
        HashMap hashMap = new HashMap();
        hashMap.put('G', EnumC9213a.ERA);
        hashMap.put('y', EnumC9213a.YEAR_OF_ERA);
        hashMap.put('u', EnumC9213a.YEAR);
        AbstractC9224l lVar = AbstractC9221i.f20233a;
        hashMap.put('Q', lVar);
        hashMap.put('q', lVar);
        EnumC9213a aVar = EnumC9213a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', EnumC9213a.DAY_OF_YEAR);
        hashMap.put('d', EnumC9213a.DAY_OF_MONTH);
        hashMap.put('F', EnumC9213a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        EnumC9213a aVar2 = EnumC9213a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', EnumC9213a.AMPM_OF_DAY);
        hashMap.put('H', EnumC9213a.HOUR_OF_DAY);
        hashMap.put('k', EnumC9213a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', EnumC9213a.HOUR_OF_AMPM);
        hashMap.put('h', EnumC9213a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', EnumC9213a.MINUTE_OF_HOUR);
        hashMap.put('s', EnumC9213a.SECOND_OF_MINUTE);
        EnumC9213a aVar3 = EnumC9213a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', EnumC9213a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', EnumC9213a.NANO_OF_DAY);
    }

    public C9195p() {
        this.f20185a = this;
        this.f20187c = new ArrayList();
        this.f20189e = -1;
        this.f20186b = null;
        this.f20188d = false;
    }

    private C9195p(C9195p pVar) {
        this.f20185a = this;
        this.f20187c = new ArrayList();
        this.f20189e = -1;
        this.f20186b = pVar;
        this.f20188d = true;
    }

    /* renamed from: d */
    private int m16708d(AbstractC9186g gVar) {
        if (gVar != null) {
            C9195p pVar = this.f20185a;
            pVar.getClass();
            pVar.f20187c.add(gVar);
            C9195p pVar2 = this.f20185a;
            pVar2.f20189e = -1;
            return pVar2.f20187c.size() - 1;
        }
        throw new NullPointerException("pp");
    }

    /* renamed from: k */
    private void m16701k(C9189j jVar) {
        C9189j jVar2;
        EnumC9201v vVar;
        C9195p pVar = this.f20185a;
        int i = pVar.f20189e;
        if (i >= 0) {
            C9189j jVar3 = (C9189j) pVar.f20187c.get(i);
            int i2 = jVar.f20168b;
            int i3 = jVar.f20169c;
            if (i2 == i3) {
                vVar = jVar.f20170d;
                if (vVar == EnumC9201v.NOT_NEGATIVE) {
                    jVar2 = jVar3.m16713d(i3);
                    m16708d(jVar.m16714c());
                    this.f20185a.f20189e = i;
                    this.f20185a.f20187c.set(i, jVar2);
                    return;
                }
            }
            jVar2 = jVar3.m16714c();
            this.f20185a.f20189e = m16708d(jVar);
            this.f20185a.f20187c.set(i, jVar2);
            return;
        }
        pVar.f20189e = m16708d(jVar);
    }

    /* renamed from: a */
    public final void m16711a(DateTimeFormatter dateTimeFormatter) {
        m16708d(dateTimeFormatter.m16718f());
    }

    /* renamed from: b */
    public final void m16710b(EnumC9213a aVar) {
        m16708d(new C9187h(aVar));
    }

    /* renamed from: c */
    public final void m16709c() {
        m16708d(new C9188i());
    }

    /* renamed from: e */
    public final void m16707e(char c) {
        m16708d(new C9184e(c));
    }

    /* renamed from: f */
    public final void m16706f(String str) {
        if (str.length() > 0) {
            m16708d(str.length() == 1 ? new C9184e(str.charAt(0)) : new C9192m(str));
        }
    }

    /* renamed from: g */
    public final void m16705g(String str, String str2) {
        m16708d(new C9190k(str, str2));
    }

    /* renamed from: h */
    public final void m16704h() {
        m16708d(C9190k.f20173d);
    }

    /* renamed from: i */
    public final void m16703i(EnumC9213a aVar, HashMap hashMap) {
        if (aVar != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
            EnumC9202w wVar = EnumC9202w.FULL;
            m16708d(new C9193n(aVar, wVar, new C9181b(new C9198s(Collections.singletonMap(wVar, linkedHashMap)))));
            return;
        }
        throw new NullPointerException("field");
    }

    /* renamed from: j */
    public final C9195p m16702j(AbstractC9224l lVar, int i, int i2, EnumC9201v vVar) {
        if (i == i2 && vVar == EnumC9201v.NOT_NEGATIVE) {
            m16700l(lVar, i2);
            return this;
        } else if (lVar == null) {
            throw new NullPointerException("field");
        } else if (vVar == null) {
            throw new NullPointerException("signStyle");
        } else if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        } else if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i2);
        } else if (i2 >= i) {
            m16701k(new C9189j(lVar, i, i2, vVar));
            return this;
        } else {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
        }
    }

    /* renamed from: l */
    public final void m16700l(AbstractC9224l lVar, int i) {
        if (lVar == null) {
            throw new NullPointerException("field");
        } else if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
        } else {
            m16701k(new C9189j(lVar, i, i, EnumC9201v.NOT_NEGATIVE));
        }
    }

    /* renamed from: m */
    public final void m16699m() {
        m16708d(new C9194o(f20183f));
    }

    /* renamed from: n */
    public final void m16698n() {
        C9195p pVar = this.f20185a;
        if (pVar.f20186b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        } else if (pVar.f20187c.size() > 0) {
            C9195p pVar2 = this.f20185a;
            C9185f fVar = new C9185f(pVar2.f20187c, pVar2.f20188d);
            this.f20185a = this.f20185a.f20186b;
            m16708d(fVar);
        } else {
            this.f20185a = this.f20185a.f20186b;
        }
    }

    /* renamed from: o */
    public final void m16697o() {
        C9195p pVar = this.f20185a;
        pVar.f20189e = -1;
        this.f20185a = new C9195p(pVar);
    }

    /* renamed from: p */
    public final void m16696p() {
        m16708d(EnumC9191l.INSENSITIVE);
    }

    /* renamed from: q */
    public final void m16695q() {
        m16708d(EnumC9191l.SENSITIVE);
    }

    /* renamed from: r */
    public final void m16694r() {
        m16708d(EnumC9191l.LENIENT);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final DateTimeFormatter m16693s(EnumC9200u uVar, C9176h hVar) {
        Locale locale = Locale.getDefault();
        if (locale != null) {
            while (this.f20185a.f20186b != null) {
                m16698n();
            }
            C9185f fVar = new C9185f(this.f20187c, false);
            C9199t tVar = C9199t.f20198a;
            return new DateTimeFormatter(fVar, locale, uVar, hVar);
        }
        throw new NullPointerException("locale");
    }
}
