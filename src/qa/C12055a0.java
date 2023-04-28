package qa;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: qa.a0 */
/* loaded from: classes3.dex */
public class C12055a0 implements IInterface {

    /* renamed from: a */
    private final IBinder f27085a;

    /* renamed from: b */
    private final String f27086b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C12055a0(IBinder iBinder, String str) {
        this.f27085a = iBinder;
        this.f27086b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f27085a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final Parcel m7893b() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f27086b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m7892c(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f27085a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
