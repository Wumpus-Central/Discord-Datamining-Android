package qa;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qa.o0 */
/* loaded from: classes3.dex */
public class C12083o0 {

    /* renamed from: a */
    private static final ClassLoader f27119a = C12083o0.class.getClassLoader();

    private C12083o0() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m7862a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m7861b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: c */
    public static void m7860c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
