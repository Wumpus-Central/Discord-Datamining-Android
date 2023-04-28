package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.b */
/* loaded from: classes.dex */
public final class C2938b implements Parcelable {
    public static final Parcelable.Creator<C2938b> CREATOR = new C2939a();

    /* renamed from: k */
    final int[] f4132k;

    /* renamed from: l */
    final ArrayList<String> f4133l;

    /* renamed from: m */
    final int[] f4134m;

    /* renamed from: n */
    final int[] f4135n;

    /* renamed from: o */
    final int f4136o;

    /* renamed from: p */
    final String f4137p;

    /* renamed from: q */
    final int f4138q;

    /* renamed from: r */
    final int f4139r;

    /* renamed from: s */
    final CharSequence f4140s;

    /* renamed from: t */
    final int f4141t;

    /* renamed from: u */
    final CharSequence f4142u;

    /* renamed from: v */
    final ArrayList<String> f4143v;

    /* renamed from: w */
    final ArrayList<String> f4144w;

    /* renamed from: x */
    final boolean f4145x;

    /* renamed from: androidx.fragment.app.b$a */
    /* loaded from: classes.dex */
    class C2939a implements Parcelable.Creator<C2938b> {
        C2939a() {
        }

        /* renamed from: a */
        public C2938b createFromParcel(Parcel parcel) {
            return new C2938b(parcel);
        }

        /* renamed from: b */
        public C2938b[] newArray(int i) {
            return new C2938b[i];
        }
    }

    public C2938b(C2937a aVar) {
        int size = aVar.f4100c.size();
        this.f4132k = new int[size * 5];
        if (aVar.f4106i) {
            this.f4133l = new ArrayList<>(size);
            this.f4134m = new int[size];
            this.f4135n = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                FragmentTransaction.C2936a aVar2 = aVar.f4100c.get(i2);
                int i3 = i + 1;
                this.f4132k[i] = aVar2.f4117a;
                ArrayList<String> arrayList = this.f4133l;
                Fragment fragment = aVar2.f4118b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f4132k;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f4119c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f4120d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f4121e;
                i = i6 + 1;
                iArr[i6] = aVar2.f4122f;
                this.f4134m[i2] = aVar2.f4123g.ordinal();
                this.f4135n[i2] = aVar2.f4124h.ordinal();
            }
            this.f4136o = aVar.f4105h;
            this.f4137p = aVar.f4108k;
            this.f4138q = aVar.f4131v;
            this.f4139r = aVar.f4109l;
            this.f4140s = aVar.f4110m;
            this.f4141t = aVar.f4111n;
            this.f4142u = aVar.f4112o;
            this.f4143v = aVar.f4113p;
            this.f4144w = aVar.f4114q;
            this.f4145x = aVar.f4115r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public C2937a m36034a(FragmentManager fragmentManager) {
        C2937a aVar = new C2937a(fragmentManager);
        int i = 0;
        int i2 = 0;
        while (i < this.f4132k.length) {
            FragmentTransaction.C2936a aVar2 = new FragmentTransaction.C2936a();
            int i3 = i + 1;
            aVar2.f4117a = this.f4132k[i];
            if (FragmentManager.m36195H0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + this.f4132k[i3]);
            }
            String str = this.f4133l.get(i2);
            if (str != null) {
                aVar2.f4118b = fragmentManager.m36139g0(str);
            } else {
                aVar2.f4118b = null;
            }
            aVar2.f4123g = Lifecycle.State.values()[this.f4134m[i2]];
            aVar2.f4124h = Lifecycle.State.values()[this.f4135n[i2]];
            int[] iArr = this.f4132k;
            int i4 = i3 + 1;
            int i5 = iArr[i3];
            aVar2.f4119c = i5;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            aVar2.f4120d = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            aVar2.f4121e = i9;
            int i10 = iArr[i8];
            aVar2.f4122f = i10;
            aVar.f4101d = i5;
            aVar.f4102e = i7;
            aVar.f4103f = i9;
            aVar.f4104g = i10;
            aVar.m36070f(aVar2);
            i2++;
            i = i8 + 1;
        }
        aVar.f4105h = this.f4136o;
        aVar.f4108k = this.f4137p;
        aVar.f4131v = this.f4138q;
        aVar.f4106i = true;
        aVar.f4109l = this.f4139r;
        aVar.f4110m = this.f4140s;
        aVar.f4111n = this.f4141t;
        aVar.f4112o = this.f4142u;
        aVar.f4113p = this.f4143v;
        aVar.f4114q = this.f4144w;
        aVar.f4115r = this.f4145x;
        aVar.m36041t(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f4132k);
        parcel.writeStringList(this.f4133l);
        parcel.writeIntArray(this.f4134m);
        parcel.writeIntArray(this.f4135n);
        parcel.writeInt(this.f4136o);
        parcel.writeString(this.f4137p);
        parcel.writeInt(this.f4138q);
        parcel.writeInt(this.f4139r);
        TextUtils.writeToParcel(this.f4140s, parcel, 0);
        parcel.writeInt(this.f4141t);
        TextUtils.writeToParcel(this.f4142u, parcel, 0);
        parcel.writeStringList(this.f4143v);
        parcel.writeStringList(this.f4144w);
        parcel.writeInt(this.f4145x ? 1 : 0);
    }

    public C2938b(Parcel parcel) {
        this.f4132k = parcel.createIntArray();
        this.f4133l = parcel.createStringArrayList();
        this.f4134m = parcel.createIntArray();
        this.f4135n = parcel.createIntArray();
        this.f4136o = parcel.readInt();
        this.f4137p = parcel.readString();
        this.f4138q = parcel.readInt();
        this.f4139r = parcel.readInt();
        this.f4140s = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4141t = parcel.readInt();
        this.f4142u = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4143v = parcel.createStringArrayList();
        this.f4144w = parcel.createStringArrayList();
        this.f4145x = parcel.readInt() != 0;
    }
}
