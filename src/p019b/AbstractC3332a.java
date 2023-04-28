package p019b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b.a */
/* loaded from: classes.dex */
public interface AbstractC3332a extends IInterface {

    /* renamed from: b.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0072a extends Binder implements AbstractC3332a {

        /* renamed from: b.a$a$a */
        /* loaded from: classes.dex */
        private static class C0073a implements AbstractC3332a {

            /* renamed from: a */
            private IBinder f5351a;

            C0073a(IBinder iBinder) {
                this.f5351a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5351a;
            }
        }

        public AbstractBinderC0072a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: b */
        public static AbstractC3332a m34627b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC3332a)) {
                return new C0073a(iBinder);
            }
            return (AbstractC3332a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Bundle bundle;
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                mo34623F(readInt, bundle);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    /* renamed from: F */
    void mo34623F(int i, Bundle bundle);
}
