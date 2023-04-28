package p420x9;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import pa.BinderC11590b;

/* renamed from: x9.j */
/* loaded from: classes5.dex */
public interface AbstractC13983j extends IInterface {

    /* renamed from: x9.j$a */
    /* loaded from: classes5.dex */
    public static abstract class AbstractBinderC13984a extends BinderC11590b implements AbstractC13983j {
        /* renamed from: c */
        public static AbstractC13983j m2094c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof AbstractC13983j) {
                return (AbstractC13983j) queryLocalInterface;
            }
            return new C14009q1(iBinder);
        }
    }

    /* renamed from: Y */
    Account mo2038Y();
}
