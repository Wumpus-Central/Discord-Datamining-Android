package sa;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: sa.m */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC12846m extends BinderC12849p implements AbstractC12847n {
    /* renamed from: b */
    public static AbstractC12847n m5281b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        if (queryLocalInterface instanceof AbstractC12847n) {
            return (AbstractC12847n) queryLocalInterface;
        }
        return new C12845l(iBinder);
    }
}
