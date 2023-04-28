package p258o6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: o6.a */
/* loaded from: classes7.dex */
public class C11203a implements IInterface {

    /* renamed from: a */
    private final IBinder f24989a;

    /* renamed from: b */
    private final String f24990b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    /* JADX INFO: Access modifiers changed from: protected */
    public C11203a(IBinder iBinder) {
        this.f24989a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f24989a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final Parcel m10497b() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f24990b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final Parcel m10496c(Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f24989a.transact(1, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
