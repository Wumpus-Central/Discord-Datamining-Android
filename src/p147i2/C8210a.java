package p147i2;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import p343t2.C12948i;

/* renamed from: i2.a */
/* loaded from: classes.dex */
public class C8210a extends Paint {
    public C8210a() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT < 30) {
            setColor((C12948i.m4980c(i, 0, 255) << 24) | (getColor() & 16777215));
            return;
        }
        super.setAlpha(C12948i.m4980c(i, 0, 255));
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public C8210a(int i) {
        super(i);
    }

    public C8210a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C8210a(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
