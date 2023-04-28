package pa;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: pa.a */
/* loaded from: classes3.dex */
public class C11589a implements IInterface {

    /* renamed from: a */
    private final IBinder f25854a;

    /* renamed from: b */
    private final String f25855b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C11589a(IBinder iBinder, String str) {
        this.f25854a = iBinder;
        this.f25855b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f25854a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final Parcel m9294b(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f25854a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final Parcel m9293c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f25855b);
        return obtain;
    }
}
