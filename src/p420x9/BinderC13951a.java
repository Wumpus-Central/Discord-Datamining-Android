package p420x9;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import p420x9.AbstractC13983j;

/* renamed from: x9.a */
/* loaded from: classes5.dex */
public class BinderC13951a extends AbstractC13983j.AbstractBinderC13984a {
    /* renamed from: e */
    public static Account m2201e(AbstractC13983j jVar) {
        Account account = null;
        if (jVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    account = jVar.mo2038Y();
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }
}
