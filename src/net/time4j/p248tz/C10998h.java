package net.time4j.p248tz;

import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import net.time4j.base.AbstractC10811a;
import net.time4j.base.AbstractC10817f;
import net.time4j.base.AbstractC10818g;
import net.time4j.base.C10812b;
import net.time4j.base.C10813c;
import p163j$.util.DesugarTimeZone;
import p163j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.tz.h */
/* loaded from: classes8.dex */
public final class C10998h extends AbstractC11002l {
    private static final long serialVersionUID = -8432968264242113551L;

    /* renamed from: F */
    private final transient C11028p f38944F;

    /* renamed from: id */
    private final AbstractC11001k f24447id;
    private final boolean strict;

    /* renamed from: tz */
    private final TimeZone f38945tz;

    C10998h() {
        this.f24447id = null;
        this.f38945tz = null;
        this.strict = false;
        this.f38944F = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public static TimeZone m11330R(String str) {
        if (str.equals("Z")) {
            return DesugarTimeZone.getTimeZone("GMT+00:00");
        }
        if (str.startsWith("UTC")) {
            return DesugarTimeZone.getTimeZone("GMT" + str.substring(3));
        } else if (!str.startsWith("UT")) {
            return DesugarTimeZone.getTimeZone(str);
        } else {
            return DesugarTimeZone.getTimeZone("GMT" + str.substring(2));
        }
    }

    /* renamed from: S */
    private static C11028p m11329S(int i) {
        return C11028p.m11181p(C10813c.m12202a(i, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA));
    }

    private Object readResolve() {
        AbstractC11001k kVar = this.f24447id;
        if (kVar == null) {
            return new C10998h();
        }
        return new C10998h(kVar, this.f38945tz, this.strict);
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: A */
    public C11028p mo11323A(AbstractC10811a aVar, AbstractC10818g gVar) {
        int i;
        int i2;
        int i3;
        int i4;
        TimeZone timeZone;
        C11028p pVar = this.f38944F;
        if (pVar != null) {
            return pVar;
        }
        int m = aVar.mo11643m();
        int n = aVar.mo11642n();
        int o = aVar.mo11641o();
        if (gVar.mo11640p() == 24) {
            long l = C10812b.m12204l(C10813c.m12197f(C10812b.m12205k(aVar), 1L));
            int i5 = C10812b.m12207i(l);
            int h = C10812b.m12208h(l);
            i = C10812b.m12209g(l);
            n = h;
            m = i5;
        } else {
            i = o;
        }
        int i6 = 0;
        if (m > 0) {
            i2 = m;
            i3 = 1;
        } else {
            i3 = 0;
            i2 = 1 - m;
        }
        int c = C10812b.m12213c(m, n, i) + 1;
        if (c == 8) {
            i4 = 1;
        } else {
            i4 = c;
        }
        if (gVar.mo11640p() != 24) {
            i6 = (((gVar.mo11640p() * 3600) + (gVar.mo11644j() * 60) + gVar.mo11648g()) * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA) + (gVar.mo11655a() / 1000000);
        }
        if (this.f24447id == null) {
            timeZone = TimeZone.getDefault();
        } else {
            timeZone = this.f38945tz;
        }
        return m11329S(timeZone.getOffset(i3, i2, n - 1, i, i4, i6));
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: B */
    public C11028p mo11322B(AbstractC10817f fVar) {
        TimeZone timeZone;
        if (this.f24447id == null) {
            timeZone = TimeZone.getDefault();
        } else {
            C11028p pVar = this.f38944F;
            if (pVar != null) {
                return pVar;
            }
            timeZone = this.f38945tz;
        }
        return m11329S(timeZone.getOffset(fVar.mo11325h() * 1000));
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: E */
    public AbstractC11027o mo11319E() {
        return this.strict ? AbstractC11002l.f24454o : AbstractC11002l.f24453n;
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: I */
    public boolean mo11315I(AbstractC10817f fVar) {
        TimeZone timeZone;
        if (this.f38944F != null) {
            return false;
        }
        if (this.f24447id == null) {
            timeZone = TimeZone.getDefault();
        } else {
            timeZone = this.f38945tz;
        }
        return timeZone.inDaylightTime(new Date(fVar.mo11325h() * 1000));
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: J */
    public boolean mo11314J() {
        return this.f38944F != null;
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: K */
    public boolean mo11313K(AbstractC10811a aVar, AbstractC10818g gVar) {
        TimeZone timeZone;
        if (this.f38944F != null) {
            return false;
        }
        int m = aVar.mo11643m();
        int n = aVar.mo11642n();
        int o = aVar.mo11641o();
        int p = gVar.mo11640p();
        int j = gVar.mo11644j();
        int g = gVar.mo11648g();
        int a = gVar.mo11655a() / 1000000;
        if (this.f24447id == null) {
            timeZone = TimeZone.getDefault();
        } else {
            timeZone = this.f38945tz;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.set(14, a);
        gregorianCalendar.set(m, n - 1, o, p, j, g);
        if (gregorianCalendar.get(1) == m && gregorianCalendar.get(2) + 1 == n && gregorianCalendar.get(5) == o && gregorianCalendar.get(11) == p && gregorianCalendar.get(12) == j && gregorianCalendar.get(13) == g && gregorianCalendar.get(14) == a) {
            return false;
        }
        return true;
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: Q */
    public AbstractC11002l mo11307Q(AbstractC11027o oVar) {
        if (this.f24447id == null || mo11319E() == oVar) {
            return this;
        }
        if (oVar == AbstractC11002l.f24453n) {
            return new C10998h(this.f24447id, this.f38945tz, false);
        }
        if (oVar == AbstractC11002l.f24454o) {
            return new C10998h(this.f24447id, this.f38945tz, true);
        }
        throw new UnsupportedOperationException(oVar.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public boolean m11328T() {
        TimeZone timeZone;
        if (this.f24447id == null) {
            timeZone = TimeZone.getDefault();
        } else {
            timeZone = this.f38945tz;
        }
        return timeZone.getID().equals("GMT");
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10998h) {
            C10998h hVar = (C10998h) obj;
            if (this.f24447id == null) {
                if (hVar.f24447id == null) {
                    return true;
                }
                return false;
            } else if (this.f38945tz.equals(hVar.f38945tz) && this.strict == hVar.strict) {
                C11028p pVar = this.f38944F;
                if (pVar != null) {
                    return pVar.equals(hVar.f38944F);
                }
                if (hVar.f38944F == null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f24447id == null) {
            return 0;
        }
        return this.f38945tz.hashCode();
    }

    public String toString() {
        TimeZone timeZone;
        if (this.f24447id == null) {
            timeZone = TimeZone.getDefault();
        } else {
            timeZone = this.f38945tz;
        }
        StringBuilder sb2 = new StringBuilder((int) Spliterator.NONNULL);
        sb2.append('[');
        sb2.append(C10998h.class.getName());
        sb2.append(':');
        sb2.append(timeZone);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: w */
    public String mo11289w(EnumC10994d dVar, Locale locale) {
        TimeZone timeZone;
        if (this.f24447id == null) {
            timeZone = TimeZone.getDefault();
        } else {
            timeZone = this.f38945tz;
        }
        return timeZone.getDisplayName(dVar.m11331b(), !dVar.m11332a(), locale);
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: y */
    public AbstractC11008m mo11287y() {
        C11028p pVar = this.f38944F;
        if (pVar == null) {
            return null;
        }
        return pVar.m11186k();
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: z */
    public AbstractC11001k mo11286z() {
        AbstractC11001k kVar = this.f24447id;
        if (kVar == null) {
            return new C10995e(TimeZone.getDefault().getID());
        }
        return kVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10998h(AbstractC11001k kVar) {
        this(kVar, TimeZone.getDefault(), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10998h(AbstractC11001k kVar, String str) {
        this(kVar, m11330R(str), false);
    }

    private C10998h(AbstractC11001k kVar, TimeZone timeZone, boolean z) {
        this.f24447id = kVar;
        TimeZone timeZone2 = (TimeZone) timeZone.clone();
        this.f38945tz = timeZone2;
        this.strict = z;
        if (timeZone2.useDaylightTime()) {
            this.f38944F = null;
            return;
        }
        String id2 = timeZone2.getID();
        if (id2.startsWith("GMT") || id2.startsWith("Etc/") || id2.equals("Greenwich") || id2.equals("UCT") || id2.equals("UTC") || id2.equals("Universal") || id2.equals("Zulu")) {
            this.f38944F = m11329S(timeZone2.getOffset(System.currentTimeMillis()));
        } else {
            this.f38944F = null;
        }
    }
}
