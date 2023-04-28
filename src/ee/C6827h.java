package ee;

import ae.EnumC1367b;
import android.graphics.Paint;
import com.henninghall.date_picker.C5892g;
import com.henninghall.date_picker.C5897k;
import com.henninghall.date_picker.pickers.AbstractC5907a;
import java.util.ArrayList;
import java.util.Calendar;

/* renamed from: ee.h */
/* loaded from: classes6.dex */
public class C6827h extends AbstractC6825g {

    /* renamed from: f */
    private int f14912f = 1900;

    /* renamed from: g */
    private int f14913g = 2100;

    public C6827h(AbstractC5907a aVar, C5897k kVar) {
        super(aVar, kVar);
    }

    /* renamed from: x */
    private int m24257x() {
        if (this.f14906a.m26929w() == null) {
            return this.f14913g;
        }
        return this.f14906a.m26929w().get(1);
    }

    /* renamed from: y */
    private int m24256y() {
        if (this.f14906a.m26928x() == null) {
            return this.f14912f;
        }
        return this.f14906a.m26928x().get(1);
    }

    @Override // ee.AbstractC6825g
    /* renamed from: e */
    public String mo24262e() {
        return C5892g.m26963h(this.f14906a.m26930v());
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
        Calendar instance = Calendar.getInstance();
        int y = m24256y();
        int x = m24257x() - y;
        instance.set(1, y);
        for (int i = 0; i <= x; i++) {
            arrayList.add(m24273i(instance));
            instance.add(1, 1);
        }
        return arrayList;
    }

    @Override // ee.AbstractC6825g
    /* renamed from: v */
    public boolean mo24259v() {
        return this.f14906a.m26926z() == EnumC1367b.date;
    }

    @Override // ee.AbstractC6825g
    /* renamed from: w */
    public boolean mo24258w() {
        return false;
    }
}
