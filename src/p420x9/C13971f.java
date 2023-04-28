package p420x9;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p365u9.C13217c;
import p365u9.C13221g;
import p420x9.AbstractC13983j;
import p441y9.AbstractC14320a;

/* renamed from: x9.f */
/* loaded from: classes5.dex */
public class C13971f extends AbstractC14320a {
    public static final Parcelable.Creator<C13971f> CREATOR = new C13979h1();

    /* renamed from: k */
    final int f31510k;

    /* renamed from: l */
    final int f31511l;

    /* renamed from: m */
    int f31512m;

    /* renamed from: n */
    String f31513n;

    /* renamed from: o */
    IBinder f31514o;

    /* renamed from: p */
    Scope[] f31515p;

    /* renamed from: q */
    Bundle f31516q;

    /* renamed from: r */
    Account f31517r;

    /* renamed from: s */
    C13217c[] f31518s;

    /* renamed from: t */
    C13217c[] f31519t;

    /* renamed from: u */
    boolean f31520u;

    /* renamed from: v */
    int f31521v;

    /* renamed from: w */
    boolean f31522w;

    /* renamed from: x */
    private String f31523x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13971f(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C13217c[] cVarArr, C13217c[] cVarArr2, boolean z, int i4, boolean z2, String str2) {
        this.f31510k = i;
        this.f31511l = i2;
        this.f31512m = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f31513n = "com.google.android.gms";
        } else {
            this.f31513n = str;
        }
        if (i < 2) {
            this.f31517r = iBinder != null ? BinderC13951a.m2201e(AbstractC13983j.AbstractBinderC13984a.m2094c(iBinder)) : null;
        } else {
            this.f31514o = iBinder;
            this.f31517r = account;
        }
        this.f31515p = scopeArr;
        this.f31516q = bundle;
        this.f31518s = cVarArr;
        this.f31519t = cVarArr2;
        this.f31520u = z;
        this.f31521v = i4;
        this.f31522w = z2;
        this.f31523x = str2;
    }

    /* renamed from: p */
    public final String m2117p() {
        return this.f31523x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C13979h1.m2099a(this, parcel, i);
    }

    public C13971f(int i, String str) {
        this.f31510k = 6;
        this.f31512m = C13221g.f29689a;
        this.f31511l = i;
        this.f31520u = true;
        this.f31523x = str;
    }
}
