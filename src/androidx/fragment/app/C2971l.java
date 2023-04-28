package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.l */
/* loaded from: classes.dex */
public final class C2971l implements Parcelable {
    public static final Parcelable.Creator<C2971l> CREATOR = new C2972a();

    /* renamed from: k */
    final String f4229k;

    /* renamed from: l */
    final String f4230l;

    /* renamed from: m */
    final boolean f4231m;

    /* renamed from: n */
    final int f4232n;

    /* renamed from: o */
    final int f4233o;

    /* renamed from: p */
    final String f4234p;

    /* renamed from: q */
    final boolean f4235q;

    /* renamed from: r */
    final boolean f4236r;

    /* renamed from: s */
    final boolean f4237s;

    /* renamed from: t */
    final Bundle f4238t;

    /* renamed from: u */
    final boolean f4239u;

    /* renamed from: v */
    final int f4240v;

    /* renamed from: w */
    Bundle f4241w;

    /* renamed from: androidx.fragment.app.l$a */
    /* loaded from: classes.dex */
    class C2972a implements Parcelable.Creator<C2971l> {
        C2972a() {
        }

        /* renamed from: a */
        public C2971l createFromParcel(Parcel parcel) {
            return new C2971l(parcel);
        }

        /* renamed from: b */
        public C2971l[] newArray(int i) {
            return new C2971l[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2971l(Fragment fragment) {
        this.f4229k = fragment.getClass().getName();
        this.f4230l = fragment.mWho;
        this.f4231m = fragment.mFromLayout;
        this.f4232n = fragment.mFragmentId;
        this.f4233o = fragment.mContainerId;
        this.f4234p = fragment.mTag;
        this.f4235q = fragment.mRetainInstance;
        this.f4236r = fragment.mRemoving;
        this.f4237s = fragment.mDetached;
        this.f4238t = fragment.mArguments;
        this.f4239u = fragment.mHidden;
        this.f4240v = fragment.mMaxState.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f4229k);
        sb2.append(" (");
        sb2.append(this.f4230l);
        sb2.append(")}:");
        if (this.f4231m) {
            sb2.append(" fromLayout");
        }
        if (this.f4233o != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f4233o));
        }
        String str = this.f4234p;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f4234p);
        }
        if (this.f4235q) {
            sb2.append(" retainInstance");
        }
        if (this.f4236r) {
            sb2.append(" removing");
        }
        if (this.f4237s) {
            sb2.append(" detached");
        }
        if (this.f4239u) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f4229k);
        parcel.writeString(this.f4230l);
        parcel.writeInt(this.f4231m ? 1 : 0);
        parcel.writeInt(this.f4232n);
        parcel.writeInt(this.f4233o);
        parcel.writeString(this.f4234p);
        parcel.writeInt(this.f4235q ? 1 : 0);
        parcel.writeInt(this.f4236r ? 1 : 0);
        parcel.writeInt(this.f4237s ? 1 : 0);
        parcel.writeBundle(this.f4238t);
        parcel.writeInt(this.f4239u ? 1 : 0);
        parcel.writeBundle(this.f4241w);
        parcel.writeInt(this.f4240v);
    }

    C2971l(Parcel parcel) {
        this.f4229k = parcel.readString();
        this.f4230l = parcel.readString();
        boolean z = true;
        this.f4231m = parcel.readInt() != 0;
        this.f4232n = parcel.readInt();
        this.f4233o = parcel.readInt();
        this.f4234p = parcel.readString();
        this.f4235q = parcel.readInt() != 0;
        this.f4236r = parcel.readInt() != 0;
        this.f4237s = parcel.readInt() != 0;
        this.f4238t = parcel.readBundle();
        this.f4239u = parcel.readInt() == 0 ? false : z;
        this.f4241w = parcel.readBundle();
        this.f4240v = parcel.readInt();
    }
}
