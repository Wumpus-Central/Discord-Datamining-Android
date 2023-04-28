package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.C2350h;
import java.util.Calendar;

/* renamed from: androidx.appcompat.app.p */
/* loaded from: classes.dex */
class C1554p {

    /* renamed from: d */
    private static C1554p f848d;

    /* renamed from: a */
    private final Context f849a;

    /* renamed from: b */
    private final LocationManager f850b;

    /* renamed from: c */
    private final C1555a f851c = new C1555a();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.p$a */
    /* loaded from: classes.dex */
    public static class C1555a {

        /* renamed from: a */
        boolean f852a;

        /* renamed from: b */
        long f853b;

        /* renamed from: c */
        long f854c;

        /* renamed from: d */
        long f855d;

        /* renamed from: e */
        long f856e;

        /* renamed from: f */
        long f857f;

        C1555a() {
        }
    }

    C1554p(Context context, LocationManager locationManager) {
        this.f849a = context;
        this.f850b = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1554p m40763a(Context context) {
        if (f848d == null) {
            Context applicationContext = context.getApplicationContext();
            f848d = new C1554p(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f848d;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m40762b() {
        Location location;
        Location location2 = null;
        if (C2350h.m38098b(this.f849a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = m40761c("network");
        } else {
            location = null;
        }
        if (C2350h.m38098b(this.f849a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location2 = m40761c("gps");
        }
        if (location2 == null || location == null) {
            if (location2 != null) {
                return location2;
            }
            return location;
        } else if (location2.getTime() > location.getTime()) {
            return location2;
        } else {
            return location;
        }
    }

    /* renamed from: c */
    private Location m40761c(String str) {
        try {
            if (this.f850b.isProviderEnabled(str)) {
                return this.f850b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: e */
    private boolean m40759e() {
        return this.f851c.f857f > System.currentTimeMillis();
    }

    /* renamed from: f */
    private void m40758f(Location location) {
        long j;
        long j2;
        C1555a aVar = this.f851c;
        long currentTimeMillis = System.currentTimeMillis();
        C1553o b = C1553o.m40764b();
        b.m40765a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j3 = b.f845a;
        b.m40765a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = true;
        if (b.f847c != 1) {
            z = false;
        }
        long j4 = b.f846b;
        long j5 = b.f845a;
        b.m40765a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j6 = b.f846b;
        if (j4 == -1 || j5 == -1) {
            j = currentTimeMillis + 43200000;
        } else {
            if (currentTimeMillis > j5) {
                j2 = 0 + j6;
            } else if (currentTimeMillis > j4) {
                j2 = 0 + j5;
            } else {
                j2 = 0 + j4;
            }
            j = j2 + 60000;
        }
        aVar.f852a = z;
        aVar.f853b = j3;
        aVar.f854c = j4;
        aVar.f855d = j5;
        aVar.f856e = j6;
        aVar.f857f = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m40760d() {
        C1555a aVar = this.f851c;
        if (m40759e()) {
            return aVar.f852a;
        }
        Location b = m40762b();
        if (b != null) {
            m40758f(b);
            return aVar.f852a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        if (i < 6 || i >= 22) {
            return true;
        }
        return false;
    }
}
