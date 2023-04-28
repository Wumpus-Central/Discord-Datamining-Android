package ee;

import ae.EnumC1367b;
import android.graphics.Paint;
import com.henninghall.date_picker.C5892g;
import com.henninghall.date_picker.C5897k;
import com.henninghall.date_picker.C5899l;
import com.henninghall.date_picker.pickers.AbstractC5907a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

/* renamed from: ee.c */
/* loaded from: classes6.dex */
public class C6821c extends AbstractC6825g {

    /* renamed from: h */
    private static int f14902h = Calendar.getInstance().getActualMaximum(6);

    /* renamed from: f */
    private String f14903f;

    /* renamed from: g */
    private HashMap<String, String> f14904g;

    public C6821c(AbstractC5907a aVar, C5897k kVar) {
        super(aVar, kVar);
    }

    /* renamed from: A */
    private Calendar m24289A() {
        Calendar calendar;
        Calendar w = this.f14906a.m26929w();
        Calendar x = this.f14906a.m26928x();
        if (w != null) {
            Calendar calendar2 = (Calendar) w.clone();
            m24285E(calendar2);
            return calendar2;
        }
        if (x != null) {
            calendar = (Calendar) x.clone();
            m24285E(calendar);
            calendar.add(5, calendar.getActualMaximum(6) / 2);
        } else {
            calendar = (Calendar) m24288B().clone();
            calendar.setTime(new Date());
            calendar.add(5, f14902h / 2);
        }
        return calendar;
    }

    /* renamed from: B */
    private Calendar m24288B() {
        Calendar instance = Calendar.getInstance();
        int y = this.f14906a.m26927y();
        boolean z = true;
        if (y <= 1) {
            return instance;
        }
        int intValue = Integer.valueOf(new SimpleDateFormat("mm", this.f14906a.m26931u()).format(instance.getTime())).intValue() % y;
        int i = y - intValue;
        int i2 = -intValue;
        if (y / 2 <= intValue) {
            z = false;
        }
        if (z) {
            i = i2;
        }
        instance.add(12, i);
        return (Calendar) instance.clone();
    }

    /* renamed from: C */
    private Calendar m24287C() {
        Calendar w = this.f14906a.m26929w();
        Calendar x = this.f14906a.m26928x();
        if (x != null) {
            Calendar calendar = (Calendar) x.clone();
            m24285E(calendar);
            return calendar;
        } else if (w != null) {
            Calendar calendar2 = (Calendar) w.clone();
            m24285E(calendar2);
            calendar2.add(5, (-calendar2.getActualMaximum(6)) / 2);
            return calendar2;
        } else {
            Calendar calendar3 = (Calendar) m24288B().clone();
            calendar3.add(5, (-f14902h) / 2);
            return calendar3;
        }
    }

    /* renamed from: D */
    private String m24286D(Calendar calendar) {
        return this.f14910e.format(calendar.getTime());
    }

    /* renamed from: E */
    private void m24285E(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    /* renamed from: F */
    private String m24284F(String str) {
        String k = C5899l.m26915k(this.f14906a.m26931u());
        if (Character.isUpperCase(str.charAt(0))) {
            return C5899l.m26925a(k);
        }
        return k;
    }

    /* renamed from: x */
    private String m24283x(Calendar calendar) {
        return m24282y().format(calendar.getTime());
    }

    /* renamed from: y */
    private SimpleDateFormat m24282y() {
        return new SimpleDateFormat(m24281z(), this.f14906a.m26931u());
    }

    /* renamed from: z */
    private String m24281z() {
        return C5892g.m26967d(this.f14906a.m26930v());
    }

    @Override // ee.AbstractC6825g
    /* renamed from: e */
    public String mo24262e() {
        return C5892g.m26969b(this.f14906a.m26931u()).replace("EEEE", "EEE").replace("MMMM", "MMM");
    }

    @Override // ee.AbstractC6825g
    /* renamed from: l */
    public Paint.Align mo24261l() {
        return Paint.Align.RIGHT;
    }

    @Override // ee.AbstractC6825g
    /* renamed from: o */
    public ArrayList<String> mo24260o() {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f14904g = new HashMap<>();
        Calendar C = m24287C();
        Calendar A = m24289A();
        while (!C.after(A)) {
            String D = m24286D(C);
            arrayList.add(D);
            this.f14904g.put(D, m24283x(C));
            if (C5899l.m26918h(C)) {
                this.f14903f = D;
            }
            C.add(5, 1);
        }
        return arrayList;
    }

    @Override // ee.AbstractC6825g
    /* renamed from: t */
    public String mo24264t(String str) {
        if (str.equals(this.f14903f)) {
            return m24284F(str);
        }
        return this.f14904g.get(str);
    }

    @Override // ee.AbstractC6825g
    /* renamed from: v */
    public boolean mo24259v() {
        return this.f14906a.m26926z() == EnumC1367b.datetime;
    }

    @Override // ee.AbstractC6825g
    /* renamed from: w */
    public boolean mo24258w() {
        return false;
    }
}
