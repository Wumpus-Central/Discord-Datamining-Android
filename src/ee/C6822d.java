package ee;

import ae.EnumC1367b;
import android.graphics.Paint;
import com.henninghall.date_picker.C5891f;
import com.henninghall.date_picker.C5897k;
import com.henninghall.date_picker.pickers.AbstractC5907a;
import java.util.ArrayList;
import java.util.Calendar;

/* renamed from: ee.d */
/* loaded from: classes6.dex */
public class C6822d extends AbstractC6825g {

    /* renamed from: f */
    private final C5891f f14905f = new C5891f(this.f14906a);

    public C6822d(AbstractC5907a aVar, C5897k kVar) {
        super(aVar, kVar);
    }

    @Override // ee.AbstractC6825g
    /* renamed from: e */
    public String mo24262e() {
        return this.f14906a.f11745p.m26979i() ? "h" : "HH";
    }

    @Override // ee.AbstractC6825g
    /* renamed from: l */
    public Paint.Align mo24261l() {
        return Paint.Align.RIGHT;
    }

    @Override // ee.AbstractC6825g
    /* renamed from: o */
    public ArrayList<String> mo24260o() {
        int i;
        Calendar instance = Calendar.getInstance();
        instance.set(2000, 0, 0, 0, 0, 0);
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f14906a.f11745p.m26979i()) {
            i = 12;
        } else {
            i = 24;
        }
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(this.f14910e.format(instance.getTime()));
            instance.add(11, 1);
        }
        return arrayList;
    }

    @Override // ee.AbstractC6825g
    /* renamed from: t */
    public String mo24264t(String str) {
        return this.f14905f.m26972b(str);
    }

    @Override // ee.AbstractC6825g
    /* renamed from: v */
    public boolean mo24259v() {
        return this.f14906a.m26926z() != EnumC1367b.date;
    }

    @Override // ee.AbstractC6825g
    /* renamed from: w */
    public boolean mo24258w() {
        return true;
    }
}
