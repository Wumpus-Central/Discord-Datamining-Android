package sa;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: sa.q */
/* loaded from: classes3.dex */
public final class C12850q {

    /* renamed from: a */
    private static final ClassLoader f28926a = C12850q.class.getClassLoader();

    private C12850q() {
    }

    /* renamed from: a */
    public static Parcelable m5268a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m5267b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
