package sa;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: sa.o */
/* loaded from: classes3.dex */
public class C12848o implements IInterface {

    /* renamed from: a */
    private final IBinder f28924a;

    /* renamed from: b */
    private final String f28925b = "com.android.vending.billing.IInAppBillingService";

    /* JADX INFO: Access modifiers changed from: protected */
    public C12848o(IBinder iBinder, String str) {
        this.f28924a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f28924a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final Parcel m5270b() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f28925b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final Parcel m5269c(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f28924a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
