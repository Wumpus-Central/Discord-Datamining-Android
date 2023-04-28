package ee;

import ae.EnumC1367b;
import android.graphics.Paint;
import com.henninghall.date_picker.C5897k;
import com.henninghall.date_picker.pickers.AbstractC5907a;
import java.util.ArrayList;
import java.util.Calendar;

/* renamed from: ee.a */
/* loaded from: classes6.dex */
public class C6819a extends AbstractC6825g {
    public C6819a(AbstractC5907a aVar, C5897k kVar) {
        super(aVar, kVar);
    }

    @Override // ee.AbstractC6825g
    /* renamed from: e */
    public String mo24262e() {
        return this.f14906a.f11745p.m26979i() ? " a " : "";
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
        instance.set(2000, 0, 0, 0, 0, 0);
        ArrayList<String> arrayList = new ArrayList<>();
        instance.set(11, 0);
        arrayList.add(this.f14910e.format(instance.getTime()));
        instance.add(11, 12);
        arrayList.add(this.f14910e.format(instance.getTime()));
        return arrayList;
    }

    @Override // ee.AbstractC6825g
    /* renamed from: v */
    public boolean mo24259v() {
        return this.f14906a.f11745p.m26979i() && this.f14906a.m26926z() != EnumC1367b.date;
    }

    @Override // ee.AbstractC6825g
    /* renamed from: w */
    public boolean mo24258w() {
        return false;
    }
}
