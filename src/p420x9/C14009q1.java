package p420x9;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import pa.C11589a;
import pa.C11591c;

/* renamed from: x9.q1 */
/* loaded from: classes5.dex */
public final class C14009q1 extends C11589a implements AbstractC13983j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C14009q1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // p420x9.AbstractC13983j
    /* renamed from: Y */
    public final Account mo2038Y() {
        Parcel b = m9294b(2, m9293c());
        Account account = (Account) C11591c.m9292a(b, Account.CREATOR);
        b.recycle();
        return account;
    }
}
