package android.support.p016v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: android.support.v4.media.session.b */
/* loaded from: classes.dex */
public interface AbstractC1472b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC1473a extends Binder implements AbstractC1472b {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: android.support.v4.media.session.b$a$a */
        /* loaded from: classes.dex */
        public static class C0010a implements AbstractC1472b {

            /* renamed from: b */
            public static AbstractC1472b f580b;

            /* renamed from: a */
            private IBinder f581a;

            C0010a(IBinder iBinder) {
                this.f581a = iBinder;
            }

            @Override // android.support.p016v4.media.session.AbstractC1472b
            /* renamed from: H */
            public void mo41024H(AbstractC1471a aVar) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.f581a.transact(3, obtain, obtain2, 0) || AbstractBinderC1473a.m41025c() == null) {
                        obtain2.readException();
                    } else {
                        AbstractBinderC1473a.m41025c().mo41024H(aVar);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f581a;
            }
        }

        /* renamed from: b */
        public static AbstractC1472b m41026b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC1472b)) {
                return new C0010a(iBinder);
            }
            return (AbstractC1472b) queryLocalInterface;
        }

        /* renamed from: c */
        public static AbstractC1472b m41025c() {
            return C0010a.f580b;
        }
    }

    /* renamed from: H */
    void mo41024H(AbstractC1471a aVar);
}
