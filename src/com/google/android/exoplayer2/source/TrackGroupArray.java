package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p153i8.C8302u0;

/* loaded from: classes7.dex */
public final class TrackGroupArray implements Parcelable {

    /* renamed from: k */
    public final int f9362k;

    /* renamed from: l */
    private final C8302u0[] f9363l;

    /* renamed from: m */
    private int f9364m;

    /* renamed from: n */
    public static final TrackGroupArray f9361n = new TrackGroupArray(new C8302u0[0]);
    public static final Parcelable.Creator<TrackGroupArray> CREATOR = new C5223a();

    /* renamed from: com.google.android.exoplayer2.source.TrackGroupArray$a */
    /* loaded from: classes7.dex */
    class C5223a implements Parcelable.Creator<TrackGroupArray> {
        C5223a() {
        }

        /* renamed from: a */
        public TrackGroupArray createFromParcel(Parcel parcel) {
            return new TrackGroupArray(parcel);
        }

        /* renamed from: b */
        public TrackGroupArray[] newArray(int i) {
            return new TrackGroupArray[i];
        }
    }

    public TrackGroupArray(C8302u0... u0VarArr) {
        this.f9363l = u0VarArr;
        this.f9362k = u0VarArr.length;
    }

    /* renamed from: a */
    public C8302u0 m29997a(int i) {
        return this.f9363l[i];
    }

    /* renamed from: b */
    public int m29996b(C8302u0 u0Var) {
        for (int i = 0; i < this.f9362k; i++) {
            if (this.f9363l[i] == u0Var) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public boolean m29995e() {
        return this.f9362k == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroupArray.class != obj.getClass()) {
            return false;
        }
        TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
        if (this.f9362k != trackGroupArray.f9362k || !Arrays.equals(this.f9363l, trackGroupArray.f9363l)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f9364m == 0) {
            this.f9364m = Arrays.hashCode(this.f9363l);
        }
        return this.f9364m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9362k);
        for (int i2 = 0; i2 < this.f9362k; i2++) {
            parcel.writeParcelable(this.f9363l[i2], 0);
        }
    }

    TrackGroupArray(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f9362k = readInt;
        this.f9363l = new C8302u0[readInt];
        for (int i = 0; i < this.f9362k; i++) {
            this.f9363l[i] = (C8302u0) parcel.readParcelable(C8302u0.class.getClassLoader());
        }
    }
}
