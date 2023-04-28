package na;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: na.c */
/* loaded from: classes3.dex */
public final class C10769c {

    /* renamed from: a */
    private static final ClassLoader f23921a = C10769c.class.getClassLoader();

    private C10769c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m12358a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m12357b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: c */
    public static void m12356c(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
