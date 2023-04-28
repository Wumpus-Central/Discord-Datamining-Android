package ma;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ma.a */
/* loaded from: classes3.dex */
public class C10568a implements IInterface {

    /* renamed from: a */
    private final IBinder f23414a;

    /* renamed from: b */
    private final String f23415b = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";

    /* JADX INFO: Access modifiers changed from: protected */
    public C10568a(IBinder iBinder, String str) {
        this.f23414a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f23414a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final Parcel m12807b() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f23415b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m12806c(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f23414a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
