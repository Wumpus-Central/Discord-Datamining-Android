package p125h1;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: h1.a */
/* loaded from: classes.dex */
public abstract class AbstractC7736a implements Parcelable {

    /* renamed from: k */
    private final Parcelable f16774k;

    /* renamed from: l */
    public static final AbstractC7736a f16773l = new C0245a();
    public static final Parcelable.Creator<AbstractC7736a> CREATOR = new C7737b();

    /* renamed from: h1.a$a */
    /* loaded from: classes.dex */
    class C0245a extends AbstractC7736a {
        C0245a() {
            super((C0245a) null);
        }
    }

    /* renamed from: h1.a$b */
    /* loaded from: classes.dex */
    class C7737b implements Parcelable.ClassLoaderCreator<AbstractC7736a> {
        C7737b() {
        }

        /* renamed from: a */
        public AbstractC7736a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        /* renamed from: b */
        public AbstractC7736a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC7736a.f16773l;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public AbstractC7736a[] newArray(int i) {
            return new AbstractC7736a[i];
        }
    }

    /* synthetic */ AbstractC7736a(C0245a aVar) {
        this();
    }

    /* renamed from: a */
    public final Parcelable m21547a() {
        return this.f16774k;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f16774k, i);
    }

    private AbstractC7736a() {
        this.f16774k = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC7736a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f16774k = parcelable == f16773l ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC7736a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f16774k = readParcelable == null ? f16773l : readParcelable;
    }
}
