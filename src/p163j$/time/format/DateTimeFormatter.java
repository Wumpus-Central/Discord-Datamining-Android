package p163j$.time.format;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import p163j$.time.AbstractC9209m;
import p163j$.time.C9167b;
import p163j$.time.chrono.AbstractC9175g;
import p163j$.time.chrono.C9176h;
import p163j$.time.temporal.AbstractC9221i;
import p163j$.time.temporal.AbstractC9223k;
import p163j$.time.temporal.EnumC9213a;

/* renamed from: j$.time.format.DateTimeFormatter */
/* loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;

    /* renamed from: f */
    public static final DateTimeFormatter f20149f;

    /* renamed from: a */
    private final C9185f f20150a;

    /* renamed from: b */
    private final Locale f20151b;

    /* renamed from: c */
    private final C9199t f20152c;

    /* renamed from: d */
    private final AbstractC9175g f20153d;

    /* renamed from: e */
    private final AbstractC9209m f20154e;

    static {
        C9195p pVar = new C9195p();
        EnumC9213a aVar = EnumC9213a.YEAR;
        EnumC9201v vVar = EnumC9201v.EXCEEDS_PAD;
        pVar.m16702j(aVar, 4, 10, vVar);
        pVar.m16707e('-');
        EnumC9213a aVar2 = EnumC9213a.MONTH_OF_YEAR;
        pVar.m16700l(aVar2, 2);
        pVar.m16707e('-');
        EnumC9213a aVar3 = EnumC9213a.DAY_OF_MONTH;
        pVar.m16700l(aVar3, 2);
        EnumC9200u uVar = EnumC9200u.STRICT;
        C9176h hVar = C9176h.f20141a;
        DateTimeFormatter s = pVar.m16693s(uVar, hVar);
        ISO_LOCAL_DATE = s;
        C9195p pVar2 = new C9195p();
        pVar2.m16696p();
        pVar2.m16711a(s);
        pVar2.m16704h();
        pVar2.m16693s(uVar, hVar);
        C9195p pVar3 = new C9195p();
        pVar3.m16696p();
        pVar3.m16711a(s);
        pVar3.m16697o();
        pVar3.m16704h();
        pVar3.m16693s(uVar, hVar);
        C9195p pVar4 = new C9195p();
        EnumC9213a aVar4 = EnumC9213a.HOUR_OF_DAY;
        pVar4.m16700l(aVar4, 2);
        pVar4.m16707e(':');
        EnumC9213a aVar5 = EnumC9213a.MINUTE_OF_HOUR;
        pVar4.m16700l(aVar5, 2);
        pVar4.m16697o();
        pVar4.m16707e(':');
        EnumC9213a aVar6 = EnumC9213a.SECOND_OF_MINUTE;
        pVar4.m16700l(aVar6, 2);
        pVar4.m16697o();
        pVar4.m16710b(EnumC9213a.NANO_OF_SECOND);
        DateTimeFormatter s2 = pVar4.m16693s(uVar, null);
        C9195p pVar5 = new C9195p();
        pVar5.m16696p();
        pVar5.m16711a(s2);
        pVar5.m16704h();
        pVar5.m16693s(uVar, null);
        C9195p pVar6 = new C9195p();
        pVar6.m16696p();
        pVar6.m16711a(s2);
        pVar6.m16697o();
        pVar6.m16704h();
        pVar6.m16693s(uVar, null);
        C9195p pVar7 = new C9195p();
        pVar7.m16696p();
        pVar7.m16711a(s);
        pVar7.m16707e('T');
        pVar7.m16711a(s2);
        DateTimeFormatter s3 = pVar7.m16693s(uVar, hVar);
        C9195p pVar8 = new C9195p();
        pVar8.m16696p();
        pVar8.m16711a(s3);
        pVar8.m16704h();
        DateTimeFormatter s4 = pVar8.m16693s(uVar, hVar);
        C9195p pVar9 = new C9195p();
        pVar9.m16711a(s4);
        pVar9.m16697o();
        pVar9.m16707e('[');
        pVar9.m16695q();
        pVar9.m16699m();
        pVar9.m16707e(']');
        pVar9.m16693s(uVar, hVar);
        C9195p pVar10 = new C9195p();
        pVar10.m16711a(s3);
        pVar10.m16697o();
        pVar10.m16704h();
        pVar10.m16697o();
        pVar10.m16707e('[');
        pVar10.m16695q();
        pVar10.m16699m();
        pVar10.m16707e(']');
        pVar10.m16693s(uVar, hVar);
        C9195p pVar11 = new C9195p();
        pVar11.m16696p();
        pVar11.m16702j(aVar, 4, 10, vVar);
        pVar11.m16707e('-');
        pVar11.m16700l(EnumC9213a.DAY_OF_YEAR, 3);
        pVar11.m16697o();
        pVar11.m16704h();
        pVar11.m16693s(uVar, hVar);
        C9195p pVar12 = new C9195p();
        pVar12.m16696p();
        pVar12.m16702j(AbstractC9221i.f20235c, 4, 10, vVar);
        pVar12.m16706f("-W");
        pVar12.m16700l(AbstractC9221i.f20234b, 2);
        pVar12.m16707e('-');
        EnumC9213a aVar7 = EnumC9213a.DAY_OF_WEEK;
        pVar12.m16700l(aVar7, 1);
        pVar12.m16697o();
        pVar12.m16704h();
        pVar12.m16693s(uVar, hVar);
        C9195p pVar13 = new C9195p();
        pVar13.m16696p();
        pVar13.m16709c();
        f20149f = pVar13.m16693s(uVar, null);
        C9195p pVar14 = new C9195p();
        pVar14.m16696p();
        pVar14.m16700l(aVar, 4);
        pVar14.m16700l(aVar2, 2);
        pVar14.m16700l(aVar3, 2);
        pVar14.m16697o();
        pVar14.m16705g("+HHMMss", "Z");
        pVar14.m16693s(uVar, hVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        C9195p pVar15 = new C9195p();
        pVar15.m16696p();
        pVar15.m16694r();
        pVar15.m16697o();
        pVar15.m16703i(aVar7, hashMap);
        pVar15.m16706f(", ");
        pVar15.m16698n();
        pVar15.m16702j(aVar3, 1, 2, EnumC9201v.NOT_NEGATIVE);
        pVar15.m16707e(' ');
        pVar15.m16703i(aVar2, hashMap2);
        pVar15.m16707e(' ');
        pVar15.m16700l(aVar, 4);
        pVar15.m16707e(' ');
        pVar15.m16700l(aVar4, 2);
        pVar15.m16707e(':');
        pVar15.m16700l(aVar5, 2);
        pVar15.m16697o();
        pVar15.m16707e(':');
        pVar15.m16700l(aVar6, 2);
        pVar15.m16698n();
        pVar15.m16707e(' ');
        pVar15.m16705g("+HHMM", "GMT");
        pVar15.m16693s(EnumC9200u.SMART, hVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DateTimeFormatter(C9185f fVar, Locale locale, EnumC9200u uVar, C9176h hVar) {
        C9199t tVar = C9199t.f20198a;
        this.f20150a = fVar;
        this.f20151b = locale;
        this.f20152c = tVar;
        if (uVar != null) {
            this.f20153d = hVar;
            this.f20154e = null;
            return;
        }
        throw new NullPointerException("resolverStyle");
    }

    /* renamed from: a */
    public final String m16723a(AbstractC9223k kVar) {
        StringBuilder sb2 = new StringBuilder(32);
        if (kVar != null) {
            try {
                this.f20150a.mo16712a(new C9197r(kVar, this), sb2);
                return sb2.toString();
            } catch (IOException e) {
                throw new C9167b(e.getMessage(), e);
            }
        } else {
            throw new NullPointerException("temporal");
        }
    }

    /* renamed from: b */
    public final AbstractC9175g m16722b() {
        return this.f20153d;
    }

    /* renamed from: c */
    public final C9199t m16721c() {
        return this.f20152c;
    }

    /* renamed from: d */
    public final Locale m16720d() {
        return this.f20151b;
    }

    /* renamed from: e */
    public final AbstractC9209m m16719e() {
        return this.f20154e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final C9185f m16718f() {
        return this.f20150a.m16716b();
    }

    public final String toString() {
        String fVar = this.f20150a.toString();
        return fVar.startsWith("[") ? fVar : fVar.substring(1, fVar.length() - 1);
    }
}
