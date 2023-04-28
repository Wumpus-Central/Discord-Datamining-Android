package p441y9;

import android.os.Parcel;
import android.os.Parcelable;
import p420x9.C14004p;

/* renamed from: y9.e */
/* loaded from: classes5.dex */
public final class C14325e {
    /* renamed from: a */
    public static <T extends AbstractC14324d> T m833a(byte[] bArr, Parcelable.Creator<T> creator) {
        C14004p.m2051j(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }
}
