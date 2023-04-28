package ee;

import ae.EnumC1367b;
import android.graphics.Paint;
import com.henninghall.date_picker.C5892g;
import com.henninghall.date_picker.C5897k;
import com.henninghall.date_picker.pickers.AbstractC5907a;
import java.util.ArrayList;
import java.util.Calendar;

/* renamed from: ee.b */
/* loaded from: classes6.dex */
public class C6820b extends AbstractC6825g {
    public C6820b(AbstractC5907a aVar, C5897k kVar) {
        super(aVar, kVar);
    }

    @Override // ee.AbstractC6825g
    /* renamed from: e */
    public String mo24262e() {
        return C5892g.m26970a(this.f14906a.m26930v());
    }

    @Override // ee.AbstractC6825g
    /* renamed from: l */
    public Paint.Align mo24261l() {
        return Paint.Align.RIGHT;
    }

    @Override // ee.AbstractC6825g
    /* renamed from: o */
    public ArrayList<String> mo24260o() {
        Calendar instance = Calendar.getInstance();
        ArrayList<String> arrayList = new ArrayList<>();
        instance.set(2, 0);
        instance.set(5, 1);
        for (int i = 1; i <= 31; i++) {
            arrayList.add(m24273i(instance));
            instance.add(5, 1);
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
