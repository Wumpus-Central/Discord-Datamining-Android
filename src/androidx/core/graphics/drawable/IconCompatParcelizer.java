package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.AbstractC3304a;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC3304a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3339a = aVar.m34730p(iconCompat.f3339a, 1);
        iconCompat.f3341c = aVar.m34733j(iconCompat.f3341c, 2);
        iconCompat.f3342d = aVar.m34729r(iconCompat.f3342d, 3);
        iconCompat.f3343e = aVar.m34730p(iconCompat.f3343e, 4);
        iconCompat.f3344f = aVar.m34730p(iconCompat.f3344f, 5);
        iconCompat.f3345g = (ColorStateList) aVar.m34729r(iconCompat.f3345g, 6);
        iconCompat.f3347i = aVar.m34728t(iconCompat.f3347i, 7);
        iconCompat.f3348j = aVar.m34728t(iconCompat.f3348j, 8);
        iconCompat.m37862u();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC3304a aVar) {
        aVar.m34725x(true, true);
        iconCompat.m37861v(aVar.m34735f());
        int i = iconCompat.f3339a;
        if (-1 != i) {
            aVar.m34745F(i, 1);
        }
        byte[] bArr = iconCompat.f3341c;
        if (bArr != null) {
            aVar.m34747B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f3342d;
        if (parcelable != null) {
            aVar.m34744H(parcelable, 3);
        }
        int i2 = iconCompat.f3343e;
        if (i2 != 0) {
            aVar.m34745F(i2, 4);
        }
        int i3 = iconCompat.f3344f;
        if (i3 != 0) {
            aVar.m34745F(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f3345g;
        if (colorStateList != null) {
            aVar.m34744H(colorStateList, 6);
        }
        String str = iconCompat.f3347i;
        if (str != null) {
            aVar.m34743J(str, 7);
        }
        String str2 = iconCompat.f3348j;
        if (str2 != null) {
            aVar.m34743J(str2, 8);
        }
    }
}
