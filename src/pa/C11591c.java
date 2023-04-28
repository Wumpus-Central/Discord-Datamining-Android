package pa;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: pa.c */
/* loaded from: classes3.dex */
public final class C11591c {

    /* renamed from: a */
    private static final ClassLoader f25856a = C11591c.class.getClassLoader();

    private C11591c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m9292a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m9291b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
