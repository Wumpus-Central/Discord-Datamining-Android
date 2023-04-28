package p443yb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.SimpleArrayMap;
import p125h1.AbstractC7736a;

/* renamed from: yb.a */
/* loaded from: classes3.dex */
public class C14343a extends AbstractC7736a {
    public static final Parcelable.Creator<C14343a> CREATOR = new C0464a();

    /* renamed from: m */
    public final SimpleArrayMap<String, Bundle> f32469m;

    /* renamed from: yb.a$a */
    /* loaded from: classes3.dex */
    class C0464a implements Parcelable.ClassLoaderCreator<C14343a> {
        C0464a() {
        }

        /* renamed from: a */
        public C14343a createFromParcel(Parcel parcel) {
            return new C14343a(parcel, null, null);
        }

        /* renamed from: b */
        public C14343a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C14343a(parcel, classLoader, null);
        }

        /* renamed from: c */
        public C14343a[] newArray(int i) {
            return new C14343a[i];
        }
    }

    /* synthetic */ C14343a(Parcel parcel, ClassLoader classLoader, C0464a aVar) {
        this(parcel, classLoader);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f32469m + "}";
    }

    @Override // p125h1.AbstractC7736a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f32469m.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.f32469m.m39052j(i2);
            bundleArr[i2] = this.f32469m.m39048n(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public C14343a(Parcelable parcelable) {
        super(parcelable);
        this.f32469m = new SimpleArrayMap<>();
    }

    private C14343a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f32469m = new SimpleArrayMap<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f32469m.put(strArr[i], bundleArr[i]);
        }
    }
}
