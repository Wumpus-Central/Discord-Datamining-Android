package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.i */
/* loaded from: classes.dex */
public final class C2966i implements Parcelable {
    public static final Parcelable.Creator<C2966i> CREATOR = new C2967a();

    /* renamed from: k */
    ArrayList<C2971l> f4213k;

    /* renamed from: l */
    ArrayList<String> f4214l;

    /* renamed from: m */
    C2938b[] f4215m;

    /* renamed from: n */
    int f4216n;

    /* renamed from: o */
    String f4217o;

    /* renamed from: p */
    ArrayList<String> f4218p;

    /* renamed from: q */
    ArrayList<Bundle> f4219q;

    /* renamed from: r */
    ArrayList<FragmentManager.C2930l> f4220r;

    /* renamed from: androidx.fragment.app.i$a */
    /* loaded from: classes.dex */
    class C2967a implements Parcelable.Creator<C2966i> {
        C2967a() {
        }

        /* renamed from: a */
        public C2966i createFromParcel(Parcel parcel) {
            return new C2966i(parcel);
        }

        /* renamed from: b */
        public C2966i[] newArray(int i) {
            return new C2966i[i];
        }
    }

    public C2966i() {
        this.f4217o = null;
        this.f4218p = new ArrayList<>();
        this.f4219q = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f4213k);
        parcel.writeStringList(this.f4214l);
        parcel.writeTypedArray(this.f4215m, i);
        parcel.writeInt(this.f4216n);
        parcel.writeString(this.f4217o);
        parcel.writeStringList(this.f4218p);
        parcel.writeTypedList(this.f4219q);
        parcel.writeTypedList(this.f4220r);
    }

    public C2966i(Parcel parcel) {
        this.f4217o = null;
        this.f4218p = new ArrayList<>();
        this.f4219q = new ArrayList<>();
        this.f4213k = parcel.createTypedArrayList(C2971l.CREATOR);
        this.f4214l = parcel.createStringArrayList();
        this.f4215m = (C2938b[]) parcel.createTypedArray(C2938b.CREATOR);
        this.f4216n = parcel.readInt();
        this.f4217o = parcel.readString();
        this.f4218p = parcel.createStringArrayList();
        this.f4219q = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f4220r = parcel.createTypedArrayList(FragmentManager.C2930l.CREATOR);
    }
}
