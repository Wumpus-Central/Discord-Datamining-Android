package p420x9;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p365u9.C13217c;
import p441y9.C14321b;
import p441y9.C14323c;

/* renamed from: x9.h1 */
/* loaded from: classes5.dex */
public final class C13979h1 implements Parcelable.Creator<C13971f> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m2099a(C13971f fVar, Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, fVar.f31510k);
        C14323c.m848j(parcel, 2, fVar.f31511l);
        C14323c.m848j(parcel, 3, fVar.f31512m);
        C14323c.m842p(parcel, 4, fVar.f31513n, false);
        C14323c.m849i(parcel, 5, fVar.f31514o, false);
        C14323c.m839s(parcel, 6, fVar.f31515p, i, false);
        C14323c.m853e(parcel, 7, fVar.f31516q, false);
        C14323c.m844n(parcel, 8, fVar.f31517r, i, false);
        C14323c.m839s(parcel, 10, fVar.f31518s, i, false);
        C14323c.m839s(parcel, 11, fVar.f31519t, i, false);
        C14323c.m855c(parcel, 12, fVar.f31520u);
        C14323c.m848j(parcel, 13, fVar.f31521v);
        C14323c.m855c(parcel, 14, fVar.f31522w);
        C14323c.m842p(parcel, 15, fVar.m2117p(), false);
        C14323c.m856b(parcel, a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C13971f createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        C13217c[] cVarArr = null;
        C13217c[] cVarArr2 = null;
        String str2 = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            switch (C14321b.m873k(p)) {
                case 1:
                    i = C14321b.m866r(parcel, p);
                    break;
                case 2:
                    i2 = C14321b.m866r(parcel, p);
                    break;
                case 3:
                    i3 = C14321b.m866r(parcel, p);
                    break;
                case 4:
                    str = C14321b.m879e(parcel, p);
                    break;
                case 5:
                    iBinder = C14321b.m867q(parcel, p);
                    break;
                case 6:
                    scopeArr = (Scope[]) C14321b.m876h(parcel, p, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C14321b.m883a(parcel, p);
                    break;
                case 8:
                    account = (Account) C14321b.m880d(parcel, p, Account.CREATOR);
                    break;
                case 9:
                default:
                    C14321b.m861w(parcel, p);
                    break;
                case 10:
                    cVarArr = (C13217c[]) C14321b.m876h(parcel, p, C13217c.CREATOR);
                    break;
                case 11:
                    cVarArr2 = (C13217c[]) C14321b.m876h(parcel, p, C13217c.CREATOR);
                    break;
                case 12:
                    z = C14321b.m872l(parcel, p);
                    break;
                case 13:
                    i4 = C14321b.m866r(parcel, p);
                    break;
                case 14:
                    z2 = C14321b.m872l(parcel, p);
                    break;
                case 15:
                    str2 = C14321b.m879e(parcel, p);
                    break;
            }
        }
        C14321b.m874j(parcel, x);
        return new C13971f(i, i2, i3, str, iBinder, scopeArr, bundle, account, cVarArr, cVarArr2, z, i4, z2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C13971f[] newArray(int i) {
        return new C13971f[i];
    }
}
