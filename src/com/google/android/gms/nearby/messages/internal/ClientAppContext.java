package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Locale;
import p420x9.C13996n;
import p420x9.C14004p;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* loaded from: classes3.dex */
public final class ClientAppContext extends AbstractC14320a implements ReflectedParcelable {
    public static final Parcelable.Creator<ClientAppContext> CREATOR = new C5444f0();

    /* renamed from: k */
    final int f10271k;

    /* renamed from: l */
    public final String f10272l;

    /* renamed from: m */
    public final String f10273m;

    /* renamed from: n */
    public final boolean f10274n;
    @Deprecated

    /* renamed from: o */
    public final int f10275o;

    /* renamed from: p */
    public final String f10276p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ClientAppContext(int i, String str, String str2, boolean z, int i2, String str3) {
        this.f10271k = i;
        this.f10272l = (String) C14004p.m2051j(str);
        if (str2 != null && !str2.isEmpty() && !str2.startsWith("0p:")) {
            Log.w("NearbyMessages", String.format(Locale.US, "ClientAppContext: 0P identifier(%s) without 0P prefix(%s)", str2, "0p:"));
            str2 = "0p:".concat(str2);
        }
        this.f10273m = str2;
        this.f10274n = z;
        this.f10275o = i2;
        this.f10276p = str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static final ClientAppContext m28929p(ClientAppContext clientAppContext, String str, String str2, boolean z) {
        if (clientAppContext != null) {
            return clientAppContext;
        }
        if (str == null && str2 == null) {
            return null;
        }
        return new ClientAppContext(1, str, str2, z, 0, null);
    }

    /* renamed from: r */
    private static boolean m28928r(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return TextUtils.isEmpty(str2);
        }
        return str.equals(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientAppContext)) {
            return false;
        }
        ClientAppContext clientAppContext = (ClientAppContext) obj;
        if (!m28928r(this.f10272l, clientAppContext.f10272l) || !m28928r(this.f10273m, clientAppContext.f10273m) || this.f10274n != clientAppContext.f10274n || !m28928r(this.f10276p, clientAppContext.f10276p) || this.f10275o != clientAppContext.f10275o) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C13996n.m2070c(this.f10272l, this.f10273m, Boolean.valueOf(this.f10274n), this.f10276p, Integer.valueOf(this.f10275o));
    }

    public final String toString() {
        return String.format(Locale.US, "{realClientPackageName: %s, zeroPartyIdentifier: %s, useRealClientApiKey: %b, apiKey: %s, callingContext: %d}", this.f10272l, this.f10273m, Boolean.valueOf(this.f10274n), this.f10276p, Integer.valueOf(this.f10275o));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f10271k);
        C14323c.m842p(parcel, 2, this.f10272l, false);
        C14323c.m842p(parcel, 3, this.f10273m, false);
        C14323c.m855c(parcel, 4, this.f10274n);
        C14323c.m848j(parcel, 5, this.f10275o);
        C14323c.m842p(parcel, 6, this.f10276p, false);
        C14323c.m856b(parcel, a);
    }
}
