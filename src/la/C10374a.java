package la;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: la.a */
/* loaded from: classes3.dex */
public class C10374a implements IInterface {

    /* renamed from: a */
    private final IBinder f22766a;

    /* renamed from: b */
    private final String f22767b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C10374a(IBinder iBinder, String str) {
        this.f22766a = iBinder;
        this.f22767b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f22766a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final Parcel m13534b() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f22767b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m13533c(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f22766a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
