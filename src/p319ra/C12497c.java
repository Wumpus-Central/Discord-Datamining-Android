package p319ra;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ra.c */
/* loaded from: classes3.dex */
public final class C12497c {

    /* renamed from: a */
    private static final ClassLoader f28150a = C12497c.class.getClassLoader();

    private C12497c() {
    }

    /* renamed from: a */
    public static Parcelable m6615a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m6614b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
        }
    }

    /* renamed from: c */
    public static void m6613c(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: d */
    public static boolean m6612d(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
