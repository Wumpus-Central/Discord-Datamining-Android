package p044ce;

import ae.EnumC1367b;
import ae.EnumC1368c;
import ae.EnumC1369d;
import android.view.View;
import com.henninghall.date_picker.C5895i;
import com.henninghall.date_picker.C5897k;
import com.henninghall.date_picker.pickers.AbstractC5907a;
import de.AbstractC6457j;
import de.C6453f;
import de.C6454g;
import ee.AbstractC6825g;
import ee.C6819a;
import ee.C6820b;
import ee.C6821c;
import ee.C6822d;
import ee.C6823e;
import ee.C6824f;
import ee.C6827h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p035c2.C3755a;

/* renamed from: ce.h */
/* loaded from: classes6.dex */
public class C3995h {

    /* renamed from: a */
    private final C5897k f6560a;

    /* renamed from: b */
    private final C3755a f6561b;

    /* renamed from: c */
    private final C3755a f6562c;

    /* renamed from: d */
    private C6822d f6563d;

    /* renamed from: e */
    private C6821c f6564e;

    /* renamed from: f */
    private C6823e f6565f;

    /* renamed from: g */
    private C6819a f6566g;

    /* renamed from: h */
    private C6820b f6567h;

    /* renamed from: i */
    private C6824f f6568i;

    /* renamed from: j */
    private C6827h f6569j;

    /* renamed from: k */
    private View f6570k;

    /* renamed from: l */
    private final C3990c f6571l;

    /* renamed from: m */
    private HashMap<EnumC1369d, AbstractC6825g> f6572m = m33129z();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ce.h$a */
    /* loaded from: classes6.dex */
    public class C3996a implements AbstractC5907a.AbstractC5908b {
        C3996a() {
        }

        @Override // com.henninghall.date_picker.pickers.AbstractC5907a.AbstractC5908b
        /* renamed from: a */
        public void mo26892a(AbstractC5907a aVar, int i, int i2) {
            boolean z;
            if (C3995h.this.f6560a.f11745p.m26979i()) {
                String n = C3995h.this.f6563d.m24269n(i);
                String n2 = C3995h.this.f6563d.m24269n(i2);
                if ((!n.equals("12") || !n2.equals("11")) && (!n.equals("11") || !n2.equals("12"))) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C3995h.this.f6566g.f14909d.mo26895a((C3995h.this.f6566g.f14909d.getValue() + 1) % 2, false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ce.h$b */
    /* loaded from: classes6.dex */
    public class C3997b extends HashMap<EnumC1369d, AbstractC6825g> {
        C3997b() {
            put(EnumC1369d.DAY, C3995h.this.f6564e);
            put(EnumC1369d.YEAR, C3995h.this.f6569j);
            put(EnumC1369d.MONTH, C3995h.this.f6568i);
            put(EnumC1369d.DATE, C3995h.this.f6567h);
            put(EnumC1369d.HOUR, C3995h.this.f6563d);
            put(EnumC1369d.MINUTE, C3995h.this.f6565f);
            put(EnumC1369d.AM_PM, C3995h.this.f6566g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3995h(C5897k kVar, View view) {
        this.f6560a = kVar;
        this.f6570k = view;
        this.f6571l = new C3990c(view);
        this.f6569j = new C6827h(m33132w(C5895i.f11727l), kVar);
        this.f6568i = new C6824f(m33132w(C5895i.f11723h), kVar);
        this.f6567h = new C6820b(m33132w(C5895i.f11717b), kVar);
        this.f6564e = new C6821c(m33132w(C5895i.f11718c), kVar);
        this.f6565f = new C6823e(m33132w(C5895i.f11722g), kVar);
        this.f6566g = new C6819a(m33132w(C5895i.f11716a), kVar);
        this.f6563d = new C6822d(m33132w(C5895i.f11721f), kVar);
        this.f6561b = (C3755a) view.findViewById(C5895i.f11720e);
        this.f6562c = (C3755a) view.findViewById(C5895i.f11719d);
        m33142m();
    }

    /* renamed from: i */
    private void m33146i() {
        Iterator<EnumC1369d> it = this.f6560a.f11745p.m26986b().iterator();
        while (it.hasNext()) {
            this.f6571l.m33181a(m33130y(it.next()).f14909d.getView());
        }
    }

    /* renamed from: m */
    private void m33142m() {
        this.f6563d.f14909d.setOnValueChangeListenerInScrolling(new C3996a());
    }

    /* renamed from: n */
    private List<AbstractC6825g> m33141n() {
        return new ArrayList(Arrays.asList(this.f6569j, this.f6568i, this.f6567h, this.f6564e, this.f6563d, this.f6565f, this.f6566g));
    }

    /* renamed from: o */
    private String m33140o() {
        ArrayList<AbstractC6825g> v = m33133v();
        if (this.f6560a.m26926z() != EnumC1367b.date) {
            return this.f6564e.mo24262e();
        }
        return v.get(0).mo24262e() + " " + v.get(1).mo24262e() + " " + v.get(2).mo24262e();
    }

    /* renamed from: p */
    private String m33139p(int i) {
        ArrayList<AbstractC6825g> v = m33133v();
        StringBuilder sb2 = new StringBuilder();
        for (int i2 = 0; i2 < 3; i2++) {
            if (i2 != 0) {
                sb2.append(" ");
            }
            AbstractC6825g gVar = v.get(i2);
            if (gVar instanceof C6820b) {
                sb2.append(gVar.m24272j(i));
            } else {
                sb2.append(gVar.m24270m());
            }
        }
        return sb2.toString();
    }

    /* renamed from: q */
    private String m33138q(int i) {
        if (this.f6560a.m26926z() == EnumC1367b.date) {
            return m33139p(i);
        }
        return this.f6564e.m24270m();
    }

    /* renamed from: v */
    private ArrayList<AbstractC6825g> m33133v() {
        ArrayList<AbstractC6825g> arrayList = new ArrayList<>();
        Iterator<EnumC1369d> it = this.f6560a.f11745p.m26986b().iterator();
        while (it.hasNext()) {
            arrayList.add(m33130y(it.next()));
        }
        return arrayList;
    }

    /* renamed from: w */
    private AbstractC5907a m33132w(int i) {
        return (AbstractC5907a) this.f6570k.findViewById(i);
    }

    /* renamed from: z */
    private HashMap<EnumC1369d, AbstractC6825g> m33129z() {
        return new C3997b();
    }

    /* renamed from: A */
    public boolean m33158A() {
        for (AbstractC6825g gVar : m33141n()) {
            if (gVar.f14909d.mo26893c()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m33157B() {
        int o = this.f6560a.m26937o();
        m33145j(new C6453f(o));
        if (this.f6560a.m26954D() == EnumC1368c.iosClone) {
            this.f6561b.setDividerHeight(o);
            this.f6562c.setDividerHeight(o);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void m33156C() {
        int e = this.f6560a.f11745p.m26983e();
        m33145j(new C6454g(e));
        if (this.f6560a.m26954D() == EnumC1368c.iosClone) {
            this.f6561b.setShownCount(e);
            this.f6562c.setShownCount(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public void m33155D() {
        this.f6571l.m33180b();
        EnumC1368c D = this.f6560a.m26954D();
        EnumC1368c cVar = EnumC1368c.iosClone;
        if (D == cVar) {
            this.f6571l.m33181a(this.f6561b);
        }
        m33146i();
        if (this.f6560a.m26954D() == cVar) {
            this.f6571l.m33181a(this.f6562c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m33145j(AbstractC6457j jVar) {
        for (AbstractC6825g gVar : m33141n()) {
            jVar.mo25539a(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m33144k(AbstractC6457j jVar) {
        for (AbstractC6825g gVar : m33141n()) {
            if (!gVar.mo24259v()) {
                jVar.mo25539a(gVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m33143l(AbstractC6457j jVar) {
        for (AbstractC6825g gVar : m33141n()) {
            if (gVar.mo24259v()) {
                jVar.mo25539a(gVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public String m33137r() {
        return m33136s(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public String m33136s(int i) {
        return m33138q(i) + " " + m33131x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public String m33135t() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<AbstractC6825g> it = m33133v().iterator();
        while (it.hasNext()) {
            sb2.append(it.next().m24279b());
        }
        return sb2.toString();
    }

    /* renamed from: u */
    public String m33134u() {
        return m33140o() + " " + this.f6563d.mo24262e() + " " + this.f6565f.mo24262e() + this.f6566g.mo24262e();
    }

    /* renamed from: x */
    String m33131x() {
        return this.f6563d.m24270m() + " " + this.f6565f.m24270m() + this.f6566g.m24270m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public AbstractC6825g m33130y(EnumC1369d dVar) {
        return this.f6572m.get(dVar);
    }
}
