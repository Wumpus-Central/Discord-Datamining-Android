package p319ra;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ra.a */
/* loaded from: classes3.dex */
public class C12491a implements IInterface {

    /* renamed from: a */
    private final IBinder f28144a;

    /* renamed from: b */
    private final String f28145b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C12491a(IBinder iBinder, String str) {
        this.f28144a = iBinder;
        this.f28145b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f28144a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final Parcel m6620b() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f28145b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m6619c(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f28144a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final void m6618e(int i, Parcel parcel) {
        try {
            this.f28144a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
