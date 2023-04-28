package p183jj;

import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import net.time4j.base.AbstractC10814d;
import p143hj.AbstractC8046c;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8075n;
import p143hj.AbstractC8077o;
import p143hj.C8087x;
import p161ij.AbstractC8639i;
import p161ij.C8627a;
import p161ij.EnumC8637g;
import p161ij.EnumC8641j;
import p161ij.EnumC8658m;
import p161ij.EnumC8671v;
import p163j$.util.concurrent.ConcurrentHashMap;
import p250nj.C11158f;
import p250nj.EnumC11154d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jj.b */
/* loaded from: classes8.dex */
public final class C9634b implements AbstractC8048d {

    /* renamed from: g */
    static final AbstractC8046c<String> f21315g = C8627a.m18482e("PLUS_SIGN", String.class);

    /* renamed from: h */
    static final AbstractC8046c<String> f21316h = C8627a.m18482e("MINUS_SIGN", String.class);

    /* renamed from: i */
    private static final AbstractC8639i f21317i;

    /* renamed from: j */
    private static final char f21318j;

    /* renamed from: k */
    private static final ConcurrentMap<String, C9635a> f21319k;

    /* renamed from: l */
    private static final C9635a f21320l;

    /* renamed from: a */
    private final Map<String, Object> f21321a;

    /* renamed from: b */
    private final C8627a f21322b;

    /* renamed from: c */
    private final Locale f21323c;

    /* renamed from: d */
    private final int f21324d;

    /* renamed from: e */
    private final int f21325e;

    /* renamed from: f */
    private final AbstractC8075n<AbstractC8077o> f21326f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jj.b$a */
    /* loaded from: classes8.dex */
    public static class C9635a {

        /* renamed from: a */
        private final EnumC8641j f21327a;

        /* renamed from: b */
        private final char f21328b;

        /* renamed from: c */
        private final char f21329c;

        /* renamed from: d */
        private final String f21330d;

        /* renamed from: e */
        private final String f21331e;

        C9635a(EnumC8641j jVar, char c, char c2, String str, String str2) {
            this.f21327a = jVar;
            this.f21328b = c;
            this.f21329c = c2;
            this.f21330d = str;
            this.f21331e = str2;
        }
    }

    static {
        char c;
        AbstractC8639i iVar = null;
        int i = 0;
        for (AbstractC8639i iVar2 : AbstractC10814d.m12187c().mo12183g(AbstractC8639i.class)) {
            int length = iVar2.mo10676a().length;
            if (length > i) {
                iVar = iVar2;
                i = length;
            }
        }
        if (iVar == null) {
            iVar = C11158f.f24835d;
        }
        f21317i = iVar;
        if (Boolean.getBoolean("net.time4j.format.iso.decimal.dot")) {
            c = '.';
        } else {
            c = ',';
        }
        f21318j = c;
        f21319k = new ConcurrentHashMap();
        f21320l = new C9635a(EnumC8641j.f19112k, '0', c, "+", "-");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9634b(C8627a aVar, Locale locale) {
        this(aVar, locale, 0, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C9634b m15915d(C8087x<?> xVar, C8627a aVar, Locale locale) {
        C8627a.C8628b bVar = new C8627a.C8628b(xVar);
        bVar.m18477d(C8627a.f19057f, EnumC8637g.SMART);
        bVar.m18477d(C8627a.f19058g, EnumC8671v.WIDE);
        bVar.m18477d(C8627a.f19059h, EnumC8658m.FORMAT);
        bVar.m18479b(C8627a.f19067p, ' ');
        bVar.m18475f(aVar);
        return new C9634b(bVar.m18480a(), locale).m15905n(locale);
    }

    /* renamed from: j */
    private static boolean m15909j(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static C9634b m15908k(C9634b bVar, C9634b bVar2) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(bVar2.f21321a);
        hashMap.putAll(bVar.f21321a);
        return new C9634b(new C8627a.C8628b().m18475f(bVar2.f21322b).m18475f(bVar.f21322b).m18480a(), Locale.ROOT, 0, 0, null, hashMap).m15905n(bVar.f21323c);
    }

    @Override // p143hj.AbstractC8048d
    /* renamed from: a */
    public boolean mo15676a(AbstractC8046c<?> cVar) {
        if (this.f21321a.containsKey(cVar.name())) {
            return true;
        }
        return this.f21322b.mo15676a(cVar);
    }

    @Override // p143hj.AbstractC8048d
    /* renamed from: b */
    public <A> A mo15675b(AbstractC8046c<A> cVar) {
        if (this.f21321a.containsKey(cVar.name())) {
            return cVar.type().cast(this.f21321a.get(cVar.name()));
        }
        return (A) this.f21322b.mo15675b(cVar);
    }

    @Override // p143hj.AbstractC8048d
    /* renamed from: c */
    public <A> A mo15674c(AbstractC8046c<A> cVar, A a) {
        if (this.f21321a.containsKey(cVar.name())) {
            return cVar.type().cast(this.f21321a.get(cVar.name()));
        }
        return (A) this.f21322b.mo15674c(cVar, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C8627a m15914e() {
        return this.f21322b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9634b)) {
            return false;
        }
        C9634b bVar = (C9634b) obj;
        if (!this.f21322b.equals(bVar.f21322b) || !this.f21323c.equals(bVar.f21323c) || this.f21324d != bVar.f21324d || this.f21325e != bVar.f21325e || !m15909j(this.f21326f, bVar.f21326f) || !this.f21321a.equals(bVar.f21321a)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public AbstractC8075n<AbstractC8077o> m15913f() {
        return this.f21326f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m15912g() {
        return this.f21324d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public Locale m15911h() {
        return this.f21323c;
    }

    public int hashCode() {
        return (this.f21322b.hashCode() * 7) + (this.f21321a.hashCode() * 37);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m15910i() {
        return this.f21325e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public C9634b m15907l(C8627a aVar) {
        return new C9634b(aVar, this.f21323c, this.f21324d, this.f21325e, this.f21326f, this.f21321a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public <A> C9634b m15906m(AbstractC8046c<A> cVar, A a) {
        HashMap hashMap = new HashMap(this.f21321a);
        if (a == null) {
            hashMap.remove(cVar.name());
        } else {
            hashMap.put(cVar.name(), a);
        }
        return new C9634b(this.f21322b, this.f21323c, this.f21324d, this.f21325e, this.f21326f, hashMap);
    }

    /* renamed from: n */
    C9634b m15905n(Locale locale) {
        String str;
        String str2;
        C8627a.C8628b bVar = new C8627a.C8628b();
        bVar.m18475f(this.f21322b);
        String a = EnumC11154d.m10689a(locale);
        String country = locale.getCountry();
        if (!a.isEmpty() || !country.isEmpty()) {
            if (!country.isEmpty()) {
                a = a + "_" + country;
            }
            C9635a aVar = f21319k.get(a);
            if (aVar == null) {
                try {
                    AbstractC8639i iVar = f21317i;
                    aVar = new C9635a(iVar.mo10673d(locale), iVar.mo10671f(locale), iVar.mo10675b(locale), iVar.mo10674c(locale), iVar.mo10672e(locale));
                } catch (RuntimeException unused) {
                    aVar = f21320l;
                }
                C9635a putIfAbsent = f21319k.putIfAbsent(a, aVar);
                if (putIfAbsent != null) {
                    aVar = putIfAbsent;
                }
            }
            bVar.m18477d(C8627a.f19063l, aVar.f21327a);
            bVar.m18479b(C8627a.f19064m, aVar.f21328b);
            bVar.m18479b(C8627a.f19066o, aVar.f21329c);
            str = aVar.f21330d;
            str2 = aVar.f21331e;
        } else {
            locale = Locale.ROOT;
            bVar.m18477d(C8627a.f19063l, EnumC8641j.f19112k);
            bVar.m18479b(C8627a.f19066o, f21318j);
            str = "+";
            str2 = "-";
        }
        bVar.m18473h(locale);
        HashMap hashMap = new HashMap(this.f21321a);
        hashMap.put(f21315g.name(), str);
        hashMap.put(f21316h.name(), str2);
        return new C9634b(bVar.m18480a(), locale, this.f21324d, this.f21325e, this.f21326f, hashMap);
    }

    public String toString() {
        return C9634b.class.getName() + "[attributes=" + this.f21322b + ",locale=" + this.f21323c + ",level=" + this.f21324d + ",section=" + this.f21325e + ",print-condition=" + this.f21326f + ",other=" + this.f21321a + ']';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9634b(C8627a aVar, Locale locale, int i, int i2, AbstractC8075n<AbstractC8077o> nVar) {
        if (aVar != null) {
            this.f21322b = aVar;
            this.f21323c = locale == null ? Locale.ROOT : locale;
            this.f21324d = i;
            this.f21325e = i2;
            this.f21326f = nVar;
            this.f21321a = Collections.emptyMap();
            return;
        }
        throw new NullPointerException("Missing format attributes.");
    }

    private C9634b(C8627a aVar, Locale locale, int i, int i2, AbstractC8075n<AbstractC8077o> nVar, Map<String, Object> map) {
        if (aVar != null) {
            this.f21322b = aVar;
            this.f21323c = locale == null ? Locale.ROOT : locale;
            this.f21324d = i;
            this.f21325e = i2;
            this.f21326f = nVar;
            this.f21321a = Collections.unmodifiableMap(map);
            return;
        }
        throw new NullPointerException("Missing format attributes.");
    }
}
