package p074e2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: e2.z */
/* loaded from: classes.dex */
public class C6693z {

    /* renamed from: e2.z$a */
    /* loaded from: classes.dex */
    private static final class ServiceConnectionC6694a implements ServiceConnection {

        /* renamed from: k */
        long f14234k;

        /* renamed from: l */
        boolean f14235l = false;

        /* renamed from: m */
        private final LinkedBlockingQueue<IBinder> f14236m = new LinkedBlockingQueue<>(1);

        public ServiceConnectionC6694a(long j) {
            this.f14234k = j;
        }

        /* renamed from: a */
        public IBinder m24624a() {
            if (!this.f14235l) {
                this.f14235l = true;
                return this.f14236m.poll(this.f14234k, TimeUnit.MILLISECONDS);
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f14236m.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: e2.z$b */
    /* loaded from: classes.dex */
    public static final class C6695b {

        /* renamed from: a */
        private final String f14237a;

        /* renamed from: b */
        private final Boolean f14238b;

        C6695b(String str, Boolean bool) {
            this.f14237a = str;
            this.f14238b = bool;
        }

        /* renamed from: a */
        public String m24623a() {
            return this.f14237a;
        }

        /* renamed from: b */
        public Boolean m24622b() {
            return this.f14238b;
        }
    }

    /* renamed from: e2.z$c */
    /* loaded from: classes.dex */
    private static final class C6696c implements IInterface {

        /* renamed from: a */
        private IBinder f14239a;

        public C6696c(IBinder iBinder) {
            this.f14239a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f14239a;
        }

        /* renamed from: b */
        public String m24621b() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f14239a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: c */
        public Boolean m24620c(boolean z) {
            int i;
            Boolean valueOf;
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z2 = false;
                if (z) {
                    i = 1;
                } else {
                    i = 0;
                }
                obtain.writeInt(i);
                this.f14239a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    z2 = true;
                }
                if (Boolean.valueOf(z2) != null) {
                    return Boolean.valueOf(!valueOf.booleanValue());
                }
                return null;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* renamed from: a */
    public static C6695b m24625a(Context context, long j) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                ServiceConnectionC6694a aVar = new ServiceConnectionC6694a(j);
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (context.bindService(intent, aVar, 1)) {
                        try {
                            C6696c cVar = new C6696c(aVar.m24624a());
                            return new C6695b(cVar.m24621b(), cVar.m24620c(true));
                        } catch (Exception e) {
                            throw e;
                        }
                    } else {
                        throw new IOException("Google Play connection failed");
                    }
                } finally {
                    context.unbindService(aVar);
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            throw new IllegalStateException("Google Play Services info can't be accessed from the main thread");
        }
    }
}
