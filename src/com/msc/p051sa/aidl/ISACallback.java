package com.msc.p051sa.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.msc.sa.aidl.ISACallback */
/* loaded from: classes6.dex */
public interface ISACallback extends IInterface {

    /* renamed from: com.msc.sa.aidl.ISACallback$Stub */
    /* loaded from: classes6.dex */
    public static abstract class Stub extends Binder implements ISACallback {
        private static final String DESCRIPTOR = "com.msc.sa.aidl.ISACallback";
        static final int TRANSACTION_onReceiveAccessToken = 1;
        static final int TRANSACTION_onReceiveAuthCode = 4;
        static final int TRANSACTION_onReceiveChecklistValidation = 2;
        static final int TRANSACTION_onReceiveDisclaimerAgreement = 3;
        static final int TRANSACTION_onReceivePasswordConfirmation = 6;
        static final int TRANSACTION_onReceiveRLControlFMM = 7;
        static final int TRANSACTION_onReceiveRubinRequest = 8;
        static final int TRANSACTION_onReceiveSCloudAccessToken = 5;

        /* renamed from: com.msc.sa.aidl.ISACallback$Stub$a */
        /* loaded from: classes6.dex */
        private static class C6087a implements ISACallback {

            /* renamed from: b */
            public static ISACallback f12372b;

            /* renamed from: a */
            private IBinder f12373a;

            C6087a(IBinder iBinder) {
                this.f12373a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12373a;
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ISACallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ISACallback)) {
                return new C6087a(iBinder);
            }
            return (ISACallback) queryLocalInterface;
        }

        public static ISACallback getDefaultImpl() {
            return C6087a.f12372b;
        }

        public static boolean setDefaultImpl(ISACallback iSACallback) {
            if (C6087a.f12372b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iSACallback == null) {
                return false;
            } else {
                C6087a.f12372b = iSACallback;
                return true;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                Bundle bundle = null;
                boolean z = false;
                switch (i) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        onReceiveAccessToken(readInt, z, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        int readInt2 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        onReceiveChecklistValidation(readInt2, z, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        int readInt3 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        onReceiveDisclaimerAgreement(readInt3, z, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        int readInt4 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        onReceiveAuthCode(readInt4, z, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        int readInt5 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        onReceiveSCloudAccessToken(readInt5, z, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        int readInt6 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        onReceivePasswordConfirmation(readInt6, z, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        int readInt7 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        onReceiveRLControlFMM(readInt7, z, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        int readInt8 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        onReceiveRubinRequest(readInt8, z, bundle);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void onReceiveAccessToken(int i, boolean z, Bundle bundle);

    void onReceiveAuthCode(int i, boolean z, Bundle bundle);

    void onReceiveChecklistValidation(int i, boolean z, Bundle bundle);

    void onReceiveDisclaimerAgreement(int i, boolean z, Bundle bundle);

    void onReceivePasswordConfirmation(int i, boolean z, Bundle bundle);

    void onReceiveRLControlFMM(int i, boolean z, Bundle bundle);

    void onReceiveRubinRequest(int i, boolean z, Bundle bundle);

    void onReceiveSCloudAccessToken(int i, boolean z, Bundle bundle);
}
