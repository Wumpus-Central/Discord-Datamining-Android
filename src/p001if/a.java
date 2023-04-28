package p001if;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: if.a */
/* loaded from: classes8.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0257a();

    /* renamed from: k */
    private final String f18304k;

    /* renamed from: l */
    private final float f18305l;

    /* renamed from: m */
    private final float f18306m;

    /* renamed from: if.a$a */
    /* loaded from: classes8.dex */
    static class C0257a implements Parcelable.Creator<a> {
        C0257a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: b */
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    public a(String str, float f, float f2) {
        this.f18304k = str;
        this.f18305l = f;
        this.f18306m = f2;
    }

    /* renamed from: a */
    public String m19851a() {
        return this.f18304k;
    }

    /* renamed from: b */
    public float m19850b() {
        return this.f18305l;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public float m19849e() {
        return this.f18306m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18304k);
        parcel.writeFloat(this.f18305l);
        parcel.writeFloat(this.f18306m);
    }

    protected a(Parcel parcel) {
        this.f18304k = parcel.readString();
        this.f18305l = parcel.readFloat();
        this.f18306m = parcel.readFloat();
    }
}
