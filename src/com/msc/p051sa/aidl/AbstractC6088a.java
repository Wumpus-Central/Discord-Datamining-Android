package com.msc.p051sa.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.msc.sa.aidl.a */
/* loaded from: classes6.dex */
public interface AbstractC6088a extends IInterface {

    /* renamed from: com.msc.sa.aidl.a$a */
    /* loaded from: classes6.dex */
    public static abstract class AbstractBinderC0178a extends Binder implements AbstractC6088a {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.msc.sa.aidl.a$a$a */
        /* loaded from: classes6.dex */
        public static class C0179a implements AbstractC6088a {

            /* renamed from: b */
            public static AbstractC6088a f12374b;

            /* renamed from: a */
            private IBinder f12375a;

            C0179a(IBinder iBinder) {
                this.f12375a = iBinder;
            }

            @Override // com.msc.p051sa.aidl.AbstractC6088a
            /* renamed from: R */
            public String mo26364R(String str, String str2, String str3, ISACallback iSACallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.msc.sa.aidl.ISAService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (iSACallback != null) {
                        iBinder = iSACallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f12375a.transact(1, obtain, obtain2, 0) && AbstractBinderC0178a.m26365c() != null) {
                        return AbstractBinderC0178a.m26365c().mo26364R(str, str2, str3, iSACallback);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.msc.p051sa.aidl.AbstractC6088a
            /* renamed from: V */
            public boolean mo26363V(int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.msc.sa.aidl.ISAService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    boolean z = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f12375a.transact(6, obtain, obtain2, 0) && AbstractBinderC0178a.m26365c() != null) {
                        return AbstractBinderC0178a.m26365c().mo26363V(i, str, bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12375a;
            }
        }

        /* renamed from: b */
        public static AbstractC6088a m26366b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.msc.sa.aidl.ISAService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC6088a)) {
                return new C0179a(iBinder);
            }
            return (AbstractC6088a) queryLocalInterface;
        }

        /* renamed from: c */
        public static AbstractC6088a m26365c() {
            return C0179a.f12374b;
        }
    }

    /* renamed from: R */
    String mo26364R(String str, String str2, String str3, ISACallback iSACallback);

    /* renamed from: V */
    boolean mo26363V(int i, String str, Bundle bundle);
}
