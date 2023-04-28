package ee;

import ae.EnumC1367b;
import android.graphics.Paint;
import com.henninghall.date_picker.C5897k;
import com.henninghall.date_picker.pickers.AbstractC5907a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: ee.g */
/* loaded from: classes6.dex */
public abstract class AbstractC6825g {

    /* renamed from: a */
    protected final C5897k f14906a;

    /* renamed from: b */
    private Calendar f14907b;

    /* renamed from: c */
    private ArrayList<String> f14908c = new ArrayList<>();

    /* renamed from: d */
    public AbstractC5907a f14909d;

    /* renamed from: e */
    public SimpleDateFormat f14910e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ee.g$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C6826a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14911a;

        static {
            int[] iArr = new int[EnumC1367b.values().length];
            f14911a = iArr;
            try {
                iArr[EnumC1367b.date.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14911a[EnumC1367b.time.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14911a[EnumC1367b.datetime.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AbstractC6825g(AbstractC5907a aVar, C5897k kVar) {
        this.f14906a = kVar;
        this.f14909d = aVar;
        this.f14910e = new SimpleDateFormat(mo24262e(), kVar.m26931u());
        aVar.setTextAlign(mo24261l());
        aVar.setWrapSelectorWheel(mo24258w());
    }

    /* renamed from: c */
    private String[] m24278c(ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(mo24264t(it.next()));
        }
        return (String[]) arrayList2.toArray(new String[0]);
    }

    /* renamed from: d */
    private SimpleDateFormat m24277d(Locale locale) {
        return new SimpleDateFormat(mo24262e(), locale);
    }

    /* renamed from: g */
    private int m24275g() {
        return this.f14909d.getValue();
    }

    /* renamed from: h */
    private int m24274h(Calendar calendar) {
        this.f14910e.setTimeZone(this.f14906a.m26955C());
        return this.f14908c.indexOf(this.f14910e.format(calendar.getTime()));
    }

    /* renamed from: k */
    private String m24271k(Calendar calendar, Locale locale) {
        return m24277d(locale).format(calendar.getTime());
    }

    /* renamed from: p */
    private void m24268p() {
        this.f14909d.setMinValue(0);
        this.f14909d.setMaxValue(0);
        ArrayList<String> o = mo24260o();
        this.f14908c = o;
        this.f14909d.setDisplayedValues(m24278c(o));
        this.f14909d.setMaxValue(this.f14908c.size() - 1);
    }

    /* renamed from: a */
    public void m24280a(Calendar calendar) {
        this.f14909d.mo26894b(m24274h(calendar));
    }

    /* renamed from: b */
    public String m24279b() {
        return mo24264t(m24269n(m24275g()));
    }

    /* renamed from: e */
    public abstract String mo24262e();

    /* renamed from: f */
    public int mo24276f() {
        EnumC1367b z = this.f14906a.m26926z();
        if (this.f14906a.f11745p.m26980h()) {
            return 10;
        }
        if (C6826a.f14911a[z.ordinal()] != 1) {
            return 5;
        }
        return 15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public String m24273i(Calendar calendar) {
        return m24271k(calendar, this.f14906a.m26931u());
    }

    /* renamed from: j */
    public String m24272j(int i) {
        if (!mo24259v()) {
            return this.f14910e.format(this.f14907b.getTime());
        }
        int size = this.f14908c.size();
        return m24269n(((m24275g() + size) - i) % size);
    }

    /* renamed from: l */
    public abstract Paint.Align mo24261l();

    /* renamed from: m */
    public String m24270m() {
        if (!mo24259v()) {
            return this.f14910e.format(this.f14907b.getTime());
        }
        return m24269n(m24275g());
    }

    /* renamed from: n */
    public String m24269n(int i) {
        return this.f14908c.get(i);
    }

    /* renamed from: o */
    public abstract ArrayList<String> mo24260o();

    /* renamed from: q */
    public void m24267q() {
        this.f14910e = new SimpleDateFormat(mo24262e(), this.f14906a.m26931u());
        if (mo24259v()) {
            m24268p();
        }
    }

    /* renamed from: r */
    public void m24266r() {
        this.f14909d.setItemPaddingHorizontal(mo24276f());
    }

    /* renamed from: s */
    public void m24265s(Calendar calendar) {
        this.f14910e.setTimeZone(this.f14906a.m26955C());
        this.f14907b = calendar;
        int h = m24274h(calendar);
        if (h <= -1) {
            return;
        }
        if (this.f14909d.getValue() == 0) {
            this.f14909d.setValue(h);
        } else {
            this.f14909d.mo26894b(h);
        }
    }

    /* renamed from: t */
    public String mo24264t(String str) {
        return str;
    }

    /* renamed from: u */
    public void m24263u() {
        int i;
        if (mo24259v()) {
            i = 0;
        } else {
            i = 8;
        }
        this.f14909d.setVisibility(i);
    }

    /* renamed from: v */
    public abstract boolean mo24259v();

    /* renamed from: w */
    public abstract boolean mo24258w();
}
