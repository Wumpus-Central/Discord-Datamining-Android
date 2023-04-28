package p044ce;

import com.henninghall.date_picker.pickers.AbstractC5907a;
import ee.AbstractC6825g;

/* renamed from: ce.g */
/* loaded from: classes6.dex */
public class C3994g {
    /* renamed from: a */
    public void m33159a(AbstractC6825g gVar, int i) {
        AbstractC5907a aVar = gVar.f14909d;
        int value = aVar.getValue();
        int maxValue = aVar.getMaxValue();
        boolean wrapSelectorWheel = aVar.getWrapSelectorWheel();
        int i2 = value + i;
        if (i2 <= maxValue || wrapSelectorWheel) {
            aVar.mo26894b(i2 % (maxValue + 1));
        }
    }
}
