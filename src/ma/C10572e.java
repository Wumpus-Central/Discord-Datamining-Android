package ma;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ma.e */
/* loaded from: classes3.dex */
public final class C10572e {

    /* renamed from: a */
    private static final ClassLoader f23421a = C10572e.class.getClassLoader();

    private C10572e() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m12805a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m12804b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
