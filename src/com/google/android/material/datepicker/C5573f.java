package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.C5566a;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.f */
/* loaded from: classes3.dex */
public class C5573f implements C5566a.AbstractC5568c {
    public static final Parcelable.Creator<C5573f> CREATOR = new C5574a();

    /* renamed from: k */
    private final long f10788k;

    /* renamed from: com.google.android.material.datepicker.f$a */
    /* loaded from: classes3.dex */
    class C5574a implements Parcelable.Creator<C5573f> {
        C5574a() {
        }

        /* renamed from: a */
        public C5573f createFromParcel(Parcel parcel) {
            return new C5573f(parcel.readLong(), null);
        }

        /* renamed from: b */
        public C5573f[] newArray(int i) {
            return new C5573f[i];
        }
    }

    /* synthetic */ C5573f(long j, C5574a aVar) {
        this(j);
    }

    /* renamed from: a */
    public static C5573f m28211a(long j) {
        return new C5573f(j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C5573f) && this.f10788k == ((C5573f) obj).f10788k) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f10788k)});
    }

    @Override // com.google.android.material.datepicker.C5566a.AbstractC5568c
    /* renamed from: o */
    public boolean mo28210o(long j) {
        return j >= this.f10788k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f10788k);
    }

    private C5573f(long j) {
        this.f10788k = j;
    }
}
