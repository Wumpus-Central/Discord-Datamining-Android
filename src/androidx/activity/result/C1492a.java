package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.activity.result.a */
/* loaded from: classes.dex */
public final class C1492a implements Parcelable {
    public static final Parcelable.Creator<C1492a> CREATOR = new C0012a();

    /* renamed from: k */
    private final int f647k;

    /* renamed from: l */
    private final Intent f648l;

    /* renamed from: androidx.activity.result.a$a */
    /* loaded from: classes.dex */
    class C0012a implements Parcelable.Creator<C1492a> {
        C0012a() {
        }

        /* renamed from: a */
        public C1492a createFromParcel(Parcel parcel) {
            return new C1492a(parcel);
        }

        /* renamed from: b */
        public C1492a[] newArray(int i) {
            return new C1492a[i];
        }
    }

    public C1492a(int i, Intent intent) {
        this.f647k = i;
        this.f648l = intent;
    }

    /* renamed from: e */
    public static String m40977e(int i) {
        return i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK";
    }

    /* renamed from: a */
    public Intent m40979a() {
        return this.f648l;
    }

    /* renamed from: b */
    public int m40978b() {
        return this.f647k;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + m40977e(this.f647k) + ", data=" + this.f648l + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.f647k);
        if (this.f648l == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        parcel.writeInt(i2);
        Intent intent = this.f648l;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    C1492a(Parcel parcel) {
        this.f647k = parcel.readInt();
        this.f648l = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
