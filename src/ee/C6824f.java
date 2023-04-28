package ee;

import ae.EnumC1367b;
import android.graphics.Paint;
import com.henninghall.date_picker.C5897k;
import com.henninghall.date_picker.pickers.AbstractC5907a;
import java.util.ArrayList;
import java.util.Calendar;

/* renamed from: ee.f */
/* loaded from: classes6.dex */
public class C6824f extends AbstractC6825g {
    public C6824f(AbstractC5907a aVar, C5897k kVar) {
        super(aVar, kVar);
    }

    @Override // ee.AbstractC6825g
    /* renamed from: e */
    public String mo24262e() {
        return "LLLL";
    }

    @Override // ee.AbstractC6825g
    /* renamed from: f */
    public int mo24276f() {
        return 1;
    }

    @Override // ee.AbstractC6825g
    /* renamed from: l */
    public Paint.Align mo24261l() {
        return Paint.Align.LEFT;
    }

    @Override // ee.AbstractC6825g
    /* renamed from: o */
    public ArrayList<String> mo24260o() {
        ArrayList<String> arrayList = new ArrayList<>();
        Calendar instance = Calendar.getInstance();
        instance.set(2, 0);
        for (int i = 0; i <= 11; i++) {
            arrayList.add(m24273i(instance));
            instance.add(2, 1);
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
        return true;
    }
}
