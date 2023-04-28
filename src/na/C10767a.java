package na;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: na.a */
/* loaded from: classes3.dex */
public class C10767a implements IInterface {

    /* renamed from: a */
    private final IBinder f23919a;

    /* renamed from: b */
    private final String f23920b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C10767a(IBinder iBinder, String str) {
        this.f23919a = iBinder;
        this.f23920b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f23919a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final Parcel m12362b() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f23920b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m12361c(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f23919a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final void m12360e(int i, Parcel parcel) {
        try {
            this.f23919a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
