package p174j9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p258o6.BinderC11204b;
import p258o6.C11203a;
import p258o6.C11205c;

/* renamed from: j9.a */
/* loaded from: classes5.dex */
public interface AbstractC9507a extends IInterface {

    /* renamed from: j9.a$a */
    /* loaded from: classes5.dex */
    public static abstract class AbstractBinderC0284a extends BinderC11204b implements AbstractC9507a {

        /* renamed from: j9.a$a$a */
        /* loaded from: classes5.dex */
        public static class C0285a extends C11203a implements AbstractC9507a {
            C0285a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // p174j9.AbstractC9507a
            /* renamed from: m */
            public final Bundle mo16113m(Bundle bundle) {
                Parcel b = m10497b();
                C11205c.m10494b(b, bundle);
                Parcel c = m10496c(b);
                Bundle bundle2 = (Bundle) C11205c.m10495a(c, Bundle.CREATOR);
                c.recycle();
                return bundle2;
            }
        }

        /* renamed from: b */
        public static AbstractC9507a m16114b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof AbstractC9507a) {
                return (AbstractC9507a) queryLocalInterface;
            }
            return new C0285a(iBinder);
        }
    }

    /* renamed from: m */
    Bundle mo16113m(Bundle bundle);
}
