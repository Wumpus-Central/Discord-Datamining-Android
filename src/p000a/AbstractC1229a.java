package p000a;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: a.a */
/* loaded from: classes.dex */
public interface AbstractC1229a extends IInterface {

    /* renamed from: a.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0000a extends Binder implements AbstractC1229a {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a.a$a$a */
        /* loaded from: classes.dex */
        public static class C0001a implements AbstractC1229a {

            /* renamed from: b */
            public static AbstractC1229a f2b;

            /* renamed from: a */
            private IBinder f3a;

            C0001a(IBinder iBinder) {
                this.f3a = iBinder;
            }

            @Override // p000a.AbstractC1229a
            /* renamed from: Z */
            public void mo41560Z(String str, int i, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f3a.transact(1, obtain, null, 1) && AbstractBinderC0000a.m41561c() != null) {
                        AbstractBinderC0000a.m41561c().mo41560Z(str, i, str2, notification);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3a;
            }
        }

        /* renamed from: b */
        public static AbstractC1229a m41562b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC1229a)) {
                return new C0001a(iBinder);
            }
            return (AbstractC1229a) queryLocalInterface;
        }

        /* renamed from: c */
        public static AbstractC1229a m41561c() {
            return C0001a.f2b;
        }
    }

    /* renamed from: Z */
    void mo41560Z(String str, int i, String str2, Notification notification);
}
