package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.timepicker.d */
/* loaded from: classes3.dex */
public class C5781d implements Parcelable {
    public static final Parcelable.Creator<C5781d> CREATOR = new C5782a();

    /* renamed from: k */
    private final C5778b f11418k;

    /* renamed from: l */
    private final C5778b f11419l;

    /* renamed from: m */
    final int f11420m;

    /* renamed from: n */
    int f11421n;

    /* renamed from: o */
    int f11422o;

    /* renamed from: p */
    int f11423p;

    /* renamed from: q */
    int f11424q;

    /* renamed from: com.google.android.material.timepicker.d$a */
    /* loaded from: classes3.dex */
    class C5782a implements Parcelable.Creator<C5781d> {
        C5782a() {
        }

        /* renamed from: a */
        public C5781d createFromParcel(Parcel parcel) {
            return new C5781d(parcel);
        }

        /* renamed from: b */
        public C5781d[] newArray(int i) {
            return new C5781d[i];
        }
    }

    public C5781d() {
        this(0);
    }

    /* renamed from: a */
    public static String m27384a(Resources resources, CharSequence charSequence) {
        return m27383b(resources, charSequence, "%02d");
    }

    /* renamed from: b */
    public static String m27383b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    /* renamed from: e */
    private static int m27382e(int i) {
        return i >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5781d)) {
            return false;
        }
        C5781d dVar = (C5781d) obj;
        if (this.f11421n == dVar.f11421n && this.f11422o == dVar.f11422o && this.f11420m == dVar.f11420m && this.f11423p == dVar.f11423p) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11420m), Integer.valueOf(this.f11421n), Integer.valueOf(this.f11422o), Integer.valueOf(this.f11423p)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11421n);
        parcel.writeInt(this.f11422o);
        parcel.writeInt(this.f11423p);
        parcel.writeInt(this.f11420m);
    }

    public C5781d(int i) {
        this(0, 0, 10, i);
    }

    public C5781d(int i, int i2, int i3, int i4) {
        this.f11421n = i;
        this.f11422o = i2;
        this.f11423p = i3;
        this.f11420m = i4;
        this.f11424q = m27382e(i);
        this.f11418k = new C5778b(59);
        this.f11419l = new C5778b(i4 == 1 ? 24 : 12);
    }

    protected C5781d(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
