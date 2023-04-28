package android.support.p016v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C1468a();

    /* renamed from: k */
    public int f558k;

    /* renamed from: l */
    public int f559l;

    /* renamed from: m */
    public int f560m;

    /* renamed from: n */
    public int f561n;

    /* renamed from: o */
    public int f562o;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    /* loaded from: classes.dex */
    class C1468a implements Parcelable.Creator<ParcelableVolumeInfo> {
        C1468a() {
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f558k = parcel.readInt();
        this.f560m = parcel.readInt();
        this.f561n = parcel.readInt();
        this.f562o = parcel.readInt();
        this.f559l = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f558k);
        parcel.writeInt(this.f560m);
        parcel.writeInt(this.f561n);
        parcel.writeInt(this.f562o);
        parcel.writeInt(this.f559l);
    }
}
