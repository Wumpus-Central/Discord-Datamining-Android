package p258o6;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o6.c */
/* loaded from: classes7.dex */
public final class C11205c {
    static {
        C11205c.class.getClassLoader();
    }

    private C11205c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m10495a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m10494b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
