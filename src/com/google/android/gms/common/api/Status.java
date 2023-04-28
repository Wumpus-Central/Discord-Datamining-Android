package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p365u9.C13215a;
import p384v9.AbstractC13478k;
import p384v9.C13467d;
import p420x9.C13996n;
import p420x9.C14004p;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* loaded from: classes5.dex */
public final class Status extends AbstractC14320a implements AbstractC13478k, ReflectedParcelable {

    /* renamed from: k */
    final int f10108k;

    /* renamed from: l */
    private final int f10109l;

    /* renamed from: m */
    private final String f10110m;

    /* renamed from: n */
    private final PendingIntent f10111n;

    /* renamed from: o */
    private final C13215a f10112o;

    /* renamed from: p */
    public static final Status f10101p = new Status(0);

    /* renamed from: q */
    public static final Status f10102q = new Status(14);

    /* renamed from: r */
    public static final Status f10103r = new Status(8);

    /* renamed from: s */
    public static final Status f10104s = new Status(15);

    /* renamed from: t */
    public static final Status f10105t = new Status(16);

    /* renamed from: v */
    public static final Status f10107v = new Status(17);

    /* renamed from: u */
    public static final Status f10106u = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new C5370b();

    public Status(int i) {
        this(i, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Status(int i, int i2, String str, PendingIntent pendingIntent, C13215a aVar) {
        this.f10108k = i;
        this.f10109l = i2;
        this.f10110m = str;
        this.f10111n = pendingIntent;
        this.f10112o = aVar;
    }

    /* renamed from: B */
    public void m29114B(Activity activity, int i) {
        if (m29109u()) {
            PendingIntent pendingIntent = this.f10111n;
            C14004p.m2051j(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    /* renamed from: C */
    public final String m29113C() {
        String str = this.f10110m;
        return str != null ? str : C13467d.m3639a(this.f10109l);
    }

    @Override // p384v9.AbstractC13478k
    /* renamed from: b */
    public Status mo3607b() {
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f10108k != status.f10108k || this.f10109l != status.f10109l || !C13996n.m2071b(this.f10110m, status.f10110m) || !C13996n.m2071b(this.f10111n, status.f10111n) || !C13996n.m2071b(this.f10112o, status.f10112o)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C13996n.m2070c(Integer.valueOf(this.f10108k), Integer.valueOf(this.f10109l), this.f10110m, this.f10111n, this.f10112o);
    }

    /* renamed from: p */
    public C13215a m29112p() {
        return this.f10112o;
    }

    /* renamed from: r */
    public int m29111r() {
        return this.f10109l;
    }

    /* renamed from: t */
    public String m29110t() {
        return this.f10110m;
    }

    public String toString() {
        C13996n.C13997a d = C13996n.m2069d(this);
        d.m2068a("statusCode", m29113C());
        d.m2068a("resolution", this.f10111n);
        return d.toString();
    }

    /* renamed from: u */
    public boolean m29109u() {
        return this.f10111n != null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, m29111r());
        C14323c.m842p(parcel, 2, m29110t(), false);
        C14323c.m844n(parcel, 3, this.f10111n, i, false);
        C14323c.m844n(parcel, 4, m29112p(), i, false);
        C14323c.m848j(parcel, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f10108k);
        C14323c.m856b(parcel, a);
    }

    /* renamed from: z */
    public boolean m29108z() {
        return this.f10109l <= 0;
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this(i, i2, str, pendingIntent, null);
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    public Status(C13215a aVar, String str) {
        this(aVar, str, 17);
    }

    @Deprecated
    public Status(C13215a aVar, String str, int i) {
        this(1, i, str, aVar.m4296t(), aVar);
    }
}
