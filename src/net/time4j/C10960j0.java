package net.time4j;

import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import net.time4j.base.AbstractC10814d;
import net.time4j.base.AbstractC10816e;
import p161ij.AbstractC8639i;
import p161ij.AbstractC8661p;
import p161ij.EnumC8656k;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: net.time4j.j0 */
/* loaded from: classes8.dex */
public final class C10960j0 {

    /* renamed from: k */
    private static final AbstractC8639i f24322k;

    /* renamed from: l */
    private static final ConcurrentMap<Locale, C10960j0> f24323l;

    /* renamed from: m */
    private static final AbstractC11036w[] f24324m;

    /* renamed from: n */
    private static final AbstractC11036w[] f24325n;

    /* renamed from: o */
    private static final Set<AbstractC11036w> f24326o;

    /* renamed from: p */
    private static final long f24327p;

    /* renamed from: a */
    private final AbstractC8661p f24328a;

    /* renamed from: b */
    private final Locale f24329b;

    /* renamed from: c */
    private final AbstractC10816e<?> f24330c;

    /* renamed from: d */
    private final char f24331d;

    /* renamed from: e */
    private final String f24332e;

    /* renamed from: f */
    private final AbstractC11036w f24333f;

    /* renamed from: g */
    private final boolean f24334g;

    /* renamed from: h */
    private final boolean f24335h;

    /* renamed from: i */
    private final String f24336i;

    /* renamed from: j */
    private final String f24337j;

    static {
        AbstractC8639i iVar = null;
        int i = 0;
        for (AbstractC8639i iVar2 : AbstractC10814d.m12187c().mo12183g(AbstractC8639i.class)) {
            int length = iVar2.mo10676a().length;
            if (length >= i) {
                iVar = iVar2;
                i = length;
            }
        }
        if (iVar == null) {
            iVar = AbstractC8639i.f19111a;
        }
        f24322k = iVar;
        f24323l = new ConcurrentHashMap();
        EnumC10882f fVar = EnumC10882f.f24151n;
        EnumC10882f fVar2 = EnumC10882f.f24153p;
        EnumC10882f fVar3 = EnumC10882f.f24155r;
        EnumC10899g gVar = EnumC10899g.f24189k;
        EnumC10899g gVar2 = EnumC10899g.f24190l;
        EnumC10899g gVar3 = EnumC10899g.f24191m;
        AbstractC11036w[] wVarArr = {fVar, fVar2, EnumC10882f.f24154q, fVar3, gVar, gVar2, gVar3};
        f24324m = wVarArr;
        f24325n = new AbstractC11036w[]{fVar, fVar2, fVar3, gVar, gVar2, gVar3};
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, wVarArr);
        hashSet.add(EnumC10899g.f24194p);
        f24326o = Collections.unmodifiableSet(hashSet);
        f24327p = 63072000L;
    }

    private C10960j0(Locale locale, AbstractC10816e<?> eVar, char c, String str, AbstractC11036w wVar, boolean z, boolean z2, String str2, String str3) {
        if (wVar == null) {
            throw new NullPointerException("Missing zero time unit.");
        } else if (eVar != null) {
            this.f24328a = AbstractC8661p.m18418f(locale, EnumC8656k.CARDINALS);
            this.f24329b = locale;
            this.f24330c = eVar;
            this.f24331d = c;
            this.f24333f = wVar;
            this.f24332e = str;
            this.f24334g = z;
            this.f24335h = z2;
            this.f24336i = str2;
            this.f24337j = str3;
        } else {
            throw new NullPointerException("Missing reference clock.");
        }
    }

    /* renamed from: b */
    public static C10960j0 m11466b(Locale locale) {
        ConcurrentMap<Locale, C10960j0> concurrentMap = f24323l;
        C10960j0 j0Var = concurrentMap.get(locale);
        if (j0Var != null) {
            return j0Var;
        }
        C10978p0 p0Var = C10978p0.f24389e;
        AbstractC8639i iVar = f24322k;
        C10960j0 j0Var2 = new C10960j0(locale, p0Var, iVar.mo10671f(locale), iVar.mo10672e(locale), EnumC10899g.f24191m, false, false, null, null);
        C10960j0 putIfAbsent = concurrentMap.putIfAbsent(locale, j0Var2);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        return j0Var2;
    }

    /* renamed from: a */
    public Locale m11467a() {
        return this.f24329b;
    }

    /* renamed from: c */
    public String m11465c() {
        return C10986s0.m11354h(m11467a()).m11360b();
    }
}
