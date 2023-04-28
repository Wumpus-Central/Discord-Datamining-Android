package p365u9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p420x9.C13996n;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: u9.a */
/* loaded from: classes5.dex */
public final class C13215a extends AbstractC14320a {

    /* renamed from: k */
    final int f29675k;

    /* renamed from: l */
    private final int f29676l;

    /* renamed from: m */
    private final PendingIntent f29677m;

    /* renamed from: n */
    private final String f29678n;

    /* renamed from: o */
    public static final C13215a f29674o = new C13215a(0);
    public static final Parcelable.Creator<C13215a> CREATOR = new C13228n();

    public C13215a(int i) {
        this(i, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13215a(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f29675k = i;
        this.f29676l = i2;
        this.f29677m = pendingIntent;
        this.f29678n = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static String m4299B(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        StringBuilder sb2 = new StringBuilder(31);
                        sb2.append("UNKNOWN_ERROR_CODE(");
                        sb2.append(i);
                        sb2.append(")");
                        return sb2.toString();
                }
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13215a)) {
            return false;
        }
        C13215a aVar = (C13215a) obj;
        if (this.f29676l != aVar.f29676l || !C13996n.m2071b(this.f29677m, aVar.f29677m) || !C13996n.m2071b(this.f29678n, aVar.f29678n)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C13996n.m2070c(Integer.valueOf(this.f29676l), this.f29677m, this.f29678n);
    }

    /* renamed from: p */
    public int m4298p() {
        return this.f29676l;
    }

    /* renamed from: r */
    public String m4297r() {
        return this.f29678n;
    }

    /* renamed from: t */
    public PendingIntent m4296t() {
        return this.f29677m;
    }

    public String toString() {
        C13996n.C13997a d = C13996n.m2069d(this);
        d.m2068a("statusCode", m4299B(this.f29676l));
        d.m2068a("resolution", this.f29677m);
        d.m2068a("message", this.f29678n);
        return d.toString();
    }

    /* renamed from: u */
    public boolean m4295u() {
        return (this.f29676l == 0 || this.f29677m == null) ? false : true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f29675k);
        C14323c.m848j(parcel, 2, m4298p());
        C14323c.m844n(parcel, 3, m4296t(), i, false);
        C14323c.m842p(parcel, 4, m4297r(), false);
        C14323c.m856b(parcel, a);
    }

    /* renamed from: z */
    public boolean m4294z() {
        return this.f29676l == 0;
    }

    public C13215a(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public C13215a(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}
