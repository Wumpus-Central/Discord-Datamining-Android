package p420x9;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: x9.u0 */
/* loaded from: classes5.dex */
final class C14019u0 implements AbstractC13990l {

    /* renamed from: a */
    private final IBinder f31603a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14019u0(IBinder iBinder) {
        this.f31603a = iBinder;
    }

    @Override // p420x9.AbstractC13990l
    /* renamed from: U */
    public final void mo2021U(AbstractC13987k kVar, C13971f fVar) {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (kVar != null) {
                iBinder = kVar.asBinder();
            } else {
                iBinder = null;
            }
            obtain.writeStrongBinder(iBinder);
            if (fVar != null) {
                obtain.writeInt(1);
                C13979h1.m2099a(fVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f31603a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f31603a;
    }
}
