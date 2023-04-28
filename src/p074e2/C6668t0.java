package p074e2;

import android.content.ContentResolver;
import android.text.TextUtils;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: e2.t0 */
/* loaded from: classes.dex */
public class C6668t0 {

    /* renamed from: v */
    private static AbstractC6608c0 f14121v = C6639l.m24863j();

    /* renamed from: a */
    private long f14122a;

    /* renamed from: b */
    private C6689x f14123b;

    /* renamed from: c */
    private C6624h f14124c;

    /* renamed from: d */
    private C6669a f14125d;

    /* renamed from: e */
    private C6609c1 f14126e;

    /* renamed from: f */
    long f14127f = -1;

    /* renamed from: g */
    long f14128g = -1;

    /* renamed from: h */
    long f14129h = -1;

    /* renamed from: i */
    long f14130i = -1;

    /* renamed from: j */
    long f14131j = -1;

    /* renamed from: k */
    String f14132k;

    /* renamed from: l */
    String f14133l;

    /* renamed from: m */
    String f14134m;

    /* renamed from: n */
    String f14135n;

    /* renamed from: o */
    String f14136o;

    /* renamed from: p */
    String f14137p;

    /* renamed from: q */
    String f14138q;

    /* renamed from: r */
    String f14139r;

    /* renamed from: s */
    Boolean f14140s;

    /* renamed from: t */
    C6619g f14141t;

    /* renamed from: u */
    Map<String, String> f14142u;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e2.t0$a */
    /* loaded from: classes.dex */
    public class C6669a {

        /* renamed from: a */
        int f14143a;

        /* renamed from: b */
        int f14144b;

        /* renamed from: c */
        int f14145c;

        /* renamed from: d */
        long f14146d;

        /* renamed from: e */
        long f14147e;

        /* renamed from: f */
        long f14148f;

        /* renamed from: g */
        String f14149g;

        /* renamed from: h */
        String f14150h;

        C6669a(C6610d dVar) {
            this.f14143a = -1;
            this.f14144b = -1;
            this.f14145c = -1;
            this.f14146d = -1L;
            this.f14147e = -1L;
            this.f14148f = -1L;
            this.f14149g = null;
            this.f14150h = null;
            if (dVar != null) {
                this.f14143a = dVar.f13897q;
                this.f14144b = dVar.f13898r;
                this.f14145c = dVar.f13899s;
                this.f14146d = dVar.f13901u;
                this.f14147e = dVar.f13903w;
                this.f14148f = dVar.f13900t;
                this.f14149g = dVar.f13892l;
                this.f14150h = dVar.f13906z;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6668t0(C6624h hVar, C6689x xVar, C6610d dVar, C6609c1 c1Var, long j) {
        this.f14122a = j;
        this.f14123b = xVar;
        this.f14124c = hVar;
        this.f14125d = new C6669a(dVar);
        this.f14126e = c1Var;
    }

    /* renamed from: A */
    private boolean m24781A(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        return map.containsKey("gps_adid");
    }

    /* renamed from: B */
    private Map<String, String> m24780B(C6616f fVar, boolean z) {
        ContentResolver contentResolver = this.f14124c.f13953d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> f = C6692y0.m24632f(this.f14124c.f13953d, f14121v);
        if (f != null) {
            hashMap.putAll(f);
        }
        Map<String, String> g = C6692y0.m24631g(this.f14124c.f13953d, f14121v);
        if (g != null) {
            hashMap.putAll(g);
        }
        if (!z) {
            m24756k(hashMap, "callback_params", C6629i1.m24927Y(this.f14126e.f13889a, fVar.f13918h, "Callback"));
            m24756k(hashMap, "partner_params", C6629i1.m24927Y(this.f14126e.f13890b, fVar.f13919i, "Partner"));
        }
        this.f14123b.m24666A(this.f14124c.f13953d);
        m24755l(hashMap, "android_uuid", this.f14125d.f14149g);
        m24755l(hashMap, "gps_adid", this.f14123b.f14198a);
        m24757j(hashMap, "gps_adid_attempt", this.f14123b.f14200c);
        m24755l(hashMap, "gps_adid_src", this.f14123b.f14199b);
        m24766a(hashMap, "tracking_enabled", this.f14123b.f14201d);
        m24755l(hashMap, "fire_adid", C6629i1.m24901q(contentResolver));
        m24766a(hashMap, "fire_tracking_enabled", C6629i1.m24900r(contentResolver));
        if (!m24781A(hashMap) && !m24741z(hashMap)) {
            f14121v.mo24886a("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f14123b.m24640z(this.f14124c.f13953d);
            m24755l(hashMap, "android_id", this.f14123b.f14205h);
            m24755l(hashMap, "mac_md5", this.f14123b.f14204g);
            m24755l(hashMap, "mac_sha1", this.f14123b.f14203f);
        }
        m24755l(hashMap, "api_level", this.f14123b.f14215r);
        m24755l(hashMap, "app_secret", this.f14124c.f37950B);
        m24755l(hashMap, "app_token", this.f14124c.f13954e);
        m24755l(hashMap, "app_version", this.f14123b.f14209l);
        Boolean bool = Boolean.TRUE;
        m24766a(hashMap, "attribution_deeplink", bool);
        m24757j(hashMap, "connectivity_type", C6629i1.m24903o(this.f14124c.f13953d));
        m24755l(hashMap, "country", this.f14123b.f14217t);
        m24755l(hashMap, "cpu_type", this.f14123b.f37956A);
        m24764c(hashMap, "created_at", this.f14122a);
        m24755l(hashMap, "default_tracker", this.f14124c.f13959j);
        m24766a(hashMap, "device_known", this.f14124c.f13961l);
        m24766a(hashMap, "needs_cost", this.f14124c.f37953E);
        m24755l(hashMap, "device_manufacturer", this.f14123b.f14212o);
        m24755l(hashMap, "device_name", this.f14123b.f14211n);
        m24755l(hashMap, "device_type", this.f14123b.f14210m);
        m24757j(hashMap, "ui_mode", this.f14123b.f37960E);
        m24755l(hashMap, "display_height", this.f14123b.f14222y);
        m24755l(hashMap, "display_width", this.f14123b.f14221x);
        m24755l(hashMap, "environment", this.f14124c.f13955f);
        m24766a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f14124c.f13958i));
        m24755l(hashMap, "external_device_id", this.f14124c.f37951C);
        m24755l(hashMap, "fb_id", this.f14123b.f14206i);
        m24755l(hashMap, "hardware_name", this.f14123b.f14223z);
        m24755l(hashMap, "installed_at", this.f14123b.f37958C);
        m24755l(hashMap, "language", this.f14123b.f14216s);
        m24760g(hashMap, "last_interval", this.f14125d.f14147e);
        m24755l(hashMap, "mcc", C6629i1.m24894x(this.f14124c.f13953d));
        m24755l(hashMap, "mnc", C6629i1.m24893y(this.f14124c.f13953d));
        m24766a(hashMap, "needs_response_details", bool);
        m24757j(hashMap, "network_type", C6629i1.m24892z(this.f14124c.f13953d));
        m24755l(hashMap, "os_build", this.f14123b.f37957B);
        m24755l(hashMap, "os_name", this.f14123b.f14213p);
        m24755l(hashMap, "os_version", this.f14123b.f14214q);
        m24755l(hashMap, "package_name", this.f14123b.f14208k);
        m24755l(hashMap, "push_token", this.f14125d.f14150h);
        m24755l(hashMap, "screen_density", this.f14123b.f14220w);
        m24755l(hashMap, "screen_format", this.f14123b.f14219v);
        m24755l(hashMap, "screen_size", this.f14123b.f14218u);
        m24755l(hashMap, "secret_id", this.f14124c.f37949A);
        m24755l(hashMap, "source", fVar.f13911a);
        m24761f(hashMap, "revenue", fVar.f13912b);
        m24755l(hashMap, "currency", fVar.f13913c);
        m24759h(hashMap, "ad_impressions_count", fVar.f13914d);
        m24755l(hashMap, "ad_revenue_network", fVar.f13915e);
        m24755l(hashMap, "ad_revenue_unit", fVar.f13916f);
        m24755l(hashMap, "ad_revenue_placement", fVar.f13917g);
        m24757j(hashMap, "session_count", this.f14125d.f14144b);
        m24760g(hashMap, "session_length", this.f14125d.f14148f);
        m24757j(hashMap, "subsession_count", this.f14125d.f14145c);
        m24760g(hashMap, "time_spent", this.f14125d.f14146d);
        m24755l(hashMap, "updated_at", this.f14123b.f37959D);
        m24742y(hashMap);
        return hashMap;
    }

    /* renamed from: C */
    private Map<String, String> m24779C(String str, JSONObject jSONObject) {
        ContentResolver contentResolver = this.f14124c.f13953d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> f = C6692y0.m24632f(this.f14124c.f13953d, f14121v);
        if (f != null) {
            hashMap.putAll(f);
        }
        Map<String, String> g = C6692y0.m24631g(this.f14124c.f13953d, f14121v);
        if (g != null) {
            hashMap.putAll(g);
        }
        this.f14123b.m24666A(this.f14124c.f13953d);
        m24755l(hashMap, "android_uuid", this.f14125d.f14149g);
        m24755l(hashMap, "gps_adid", this.f14123b.f14198a);
        m24757j(hashMap, "gps_adid_attempt", this.f14123b.f14200c);
        m24755l(hashMap, "gps_adid_src", this.f14123b.f14199b);
        m24766a(hashMap, "tracking_enabled", this.f14123b.f14201d);
        m24755l(hashMap, "fire_adid", C6629i1.m24901q(contentResolver));
        m24766a(hashMap, "fire_tracking_enabled", C6629i1.m24900r(contentResolver));
        if (!m24781A(hashMap) && !m24741z(hashMap)) {
            f14121v.mo24886a("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f14123b.m24640z(this.f14124c.f13953d);
            m24755l(hashMap, "android_id", this.f14123b.f14205h);
            m24755l(hashMap, "mac_md5", this.f14123b.f14204g);
            m24755l(hashMap, "mac_sha1", this.f14123b.f14203f);
        }
        m24755l(hashMap, "api_level", this.f14123b.f14215r);
        m24755l(hashMap, "app_secret", this.f14124c.f37950B);
        m24755l(hashMap, "app_token", this.f14124c.f13954e);
        m24755l(hashMap, "app_version", this.f14123b.f14209l);
        Boolean bool = Boolean.TRUE;
        m24766a(hashMap, "attribution_deeplink", bool);
        m24757j(hashMap, "connectivity_type", C6629i1.m24903o(this.f14124c.f13953d));
        m24755l(hashMap, "country", this.f14123b.f14217t);
        m24755l(hashMap, "cpu_type", this.f14123b.f37956A);
        m24764c(hashMap, "created_at", this.f14122a);
        m24755l(hashMap, "default_tracker", this.f14124c.f13959j);
        m24766a(hashMap, "device_known", this.f14124c.f13961l);
        m24766a(hashMap, "needs_cost", this.f14124c.f37953E);
        m24755l(hashMap, "device_manufacturer", this.f14123b.f14212o);
        m24755l(hashMap, "device_name", this.f14123b.f14211n);
        m24755l(hashMap, "device_type", this.f14123b.f14210m);
        m24757j(hashMap, "ui_mode", this.f14123b.f37960E);
        m24755l(hashMap, "display_height", this.f14123b.f14222y);
        m24755l(hashMap, "display_width", this.f14123b.f14221x);
        m24755l(hashMap, "environment", this.f14124c.f13955f);
        m24766a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f14124c.f13958i));
        m24755l(hashMap, "external_device_id", this.f14124c.f37951C);
        m24755l(hashMap, "fb_id", this.f14123b.f14206i);
        m24755l(hashMap, "hardware_name", this.f14123b.f14223z);
        m24755l(hashMap, "installed_at", this.f14123b.f37958C);
        m24755l(hashMap, "language", this.f14123b.f14216s);
        m24760g(hashMap, "last_interval", this.f14125d.f14147e);
        m24755l(hashMap, "mcc", C6629i1.m24894x(this.f14124c.f13953d));
        m24755l(hashMap, "mnc", C6629i1.m24893y(this.f14124c.f13953d));
        m24766a(hashMap, "needs_response_details", bool);
        m24757j(hashMap, "network_type", C6629i1.m24892z(this.f14124c.f13953d));
        m24755l(hashMap, "os_build", this.f14123b.f37957B);
        m24755l(hashMap, "os_name", this.f14123b.f14213p);
        m24755l(hashMap, "os_version", this.f14123b.f14214q);
        m24755l(hashMap, "package_name", this.f14123b.f14208k);
        m24755l(hashMap, "push_token", this.f14125d.f14150h);
        m24755l(hashMap, "screen_density", this.f14123b.f14220w);
        m24755l(hashMap, "screen_format", this.f14123b.f14219v);
        m24755l(hashMap, "screen_size", this.f14123b.f14218u);
        m24755l(hashMap, "secret_id", this.f14124c.f37949A);
        m24755l(hashMap, "source", str);
        m24758i(hashMap, "payload", jSONObject);
        m24757j(hashMap, "session_count", this.f14125d.f14144b);
        m24760g(hashMap, "session_length", this.f14125d.f14148f);
        m24757j(hashMap, "subsession_count", this.f14125d.f14145c);
        m24760g(hashMap, "time_spent", this.f14125d.f14146d);
        m24755l(hashMap, "updated_at", this.f14123b.f37959D);
        m24742y(hashMap);
        return hashMap;
    }

    /* renamed from: D */
    private Map<String, String> m24778D(String str) {
        ContentResolver contentResolver = this.f14124c.f13953d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> f = C6692y0.m24632f(this.f14124c.f13953d, f14121v);
        if (f != null) {
            hashMap.putAll(f);
        }
        Map<String, String> g = C6692y0.m24631g(this.f14124c.f13953d, f14121v);
        if (g != null) {
            hashMap.putAll(g);
        }
        this.f14123b.m24666A(this.f14124c.f13953d);
        m24755l(hashMap, "android_uuid", this.f14125d.f14149g);
        m24755l(hashMap, "gps_adid", this.f14123b.f14198a);
        m24757j(hashMap, "gps_adid_attempt", this.f14123b.f14200c);
        m24755l(hashMap, "gps_adid_src", this.f14123b.f14199b);
        m24766a(hashMap, "tracking_enabled", this.f14123b.f14201d);
        m24755l(hashMap, "fire_adid", C6629i1.m24901q(contentResolver));
        m24766a(hashMap, "fire_tracking_enabled", C6629i1.m24900r(contentResolver));
        if (!m24781A(hashMap) && !m24741z(hashMap)) {
            f14121v.mo24886a("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f14123b.m24640z(this.f14124c.f13953d);
            m24755l(hashMap, "android_id", this.f14123b.f14205h);
            m24755l(hashMap, "mac_md5", this.f14123b.f14204g);
            m24755l(hashMap, "mac_sha1", this.f14123b.f14203f);
        }
        m24755l(hashMap, "api_level", this.f14123b.f14215r);
        m24755l(hashMap, "app_secret", this.f14124c.f37950B);
        m24755l(hashMap, "app_token", this.f14124c.f13954e);
        m24755l(hashMap, "app_version", this.f14123b.f14209l);
        Boolean bool = Boolean.TRUE;
        m24766a(hashMap, "attribution_deeplink", bool);
        m24764c(hashMap, "created_at", this.f14122a);
        m24766a(hashMap, "device_known", this.f14124c.f13961l);
        m24766a(hashMap, "needs_cost", this.f14124c.f37953E);
        m24755l(hashMap, "device_name", this.f14123b.f14211n);
        m24755l(hashMap, "device_type", this.f14123b.f14210m);
        m24757j(hashMap, "ui_mode", this.f14123b.f37960E);
        m24755l(hashMap, "environment", this.f14124c.f13955f);
        m24766a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f14124c.f13958i));
        m24755l(hashMap, "external_device_id", this.f14124c.f37951C);
        m24755l(hashMap, "initiated_by", str);
        m24766a(hashMap, "needs_response_details", bool);
        m24755l(hashMap, "os_name", this.f14123b.f14213p);
        m24755l(hashMap, "os_version", this.f14123b.f14214q);
        m24755l(hashMap, "package_name", this.f14123b.f14208k);
        m24755l(hashMap, "push_token", this.f14125d.f14150h);
        m24755l(hashMap, "secret_id", this.f14124c.f37949A);
        m24742y(hashMap);
        return hashMap;
    }

    /* renamed from: E */
    private Map<String, String> m24777E(String str) {
        ContentResolver contentResolver = this.f14124c.f13953d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> f = C6692y0.m24632f(this.f14124c.f13953d, f14121v);
        if (f != null) {
            hashMap.putAll(f);
        }
        Map<String, String> g = C6692y0.m24631g(this.f14124c.f13953d, f14121v);
        if (g != null) {
            hashMap.putAll(g);
        }
        this.f14123b.m24666A(this.f14124c.f13953d);
        m24755l(hashMap, "android_uuid", this.f14125d.f14149g);
        m24755l(hashMap, "gps_adid", this.f14123b.f14198a);
        m24757j(hashMap, "gps_adid_attempt", this.f14123b.f14200c);
        m24755l(hashMap, "gps_adid_src", this.f14123b.f14199b);
        m24766a(hashMap, "tracking_enabled", this.f14123b.f14201d);
        m24755l(hashMap, "fire_adid", C6629i1.m24901q(contentResolver));
        m24766a(hashMap, "fire_tracking_enabled", C6629i1.m24900r(contentResolver));
        if (!m24781A(hashMap) && !m24741z(hashMap)) {
            f14121v.mo24886a("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f14123b.m24640z(this.f14124c.f13953d);
            m24755l(hashMap, "android_id", this.f14123b.f14205h);
            m24755l(hashMap, "mac_md5", this.f14123b.f14204g);
            m24755l(hashMap, "mac_sha1", this.f14123b.f14203f);
        }
        C6619g gVar = this.f14141t;
        if (gVar != null) {
            m24755l(hashMap, "tracker", gVar.f13925l);
            m24755l(hashMap, "campaign", this.f14141t.f13927n);
            m24755l(hashMap, "adgroup", this.f14141t.f13928o);
            m24755l(hashMap, "creative", this.f14141t.f13929p);
        }
        m24755l(hashMap, "api_level", this.f14123b.f14215r);
        m24755l(hashMap, "app_secret", this.f14124c.f37950B);
        m24755l(hashMap, "app_token", this.f14124c.f13954e);
        m24755l(hashMap, "app_version", this.f14123b.f14209l);
        Boolean bool = Boolean.TRUE;
        m24766a(hashMap, "attribution_deeplink", bool);
        m24756k(hashMap, "callback_params", this.f14126e.f13889a);
        m24764c(hashMap, "click_time", this.f14128g);
        m24763d(hashMap, "click_time", this.f14127f);
        m24763d(hashMap, "click_time_server", this.f14130i);
        m24757j(hashMap, "connectivity_type", C6629i1.m24903o(this.f14124c.f13953d));
        m24755l(hashMap, "country", this.f14123b.f14217t);
        m24755l(hashMap, "cpu_type", this.f14123b.f37956A);
        m24764c(hashMap, "created_at", this.f14122a);
        m24755l(hashMap, "deeplink", this.f14133l);
        m24766a(hashMap, "device_known", this.f14124c.f13961l);
        m24766a(hashMap, "needs_cost", this.f14124c.f37953E);
        m24755l(hashMap, "device_manufacturer", this.f14123b.f14212o);
        m24755l(hashMap, "device_name", this.f14123b.f14211n);
        m24755l(hashMap, "device_type", this.f14123b.f14210m);
        m24757j(hashMap, "ui_mode", this.f14123b.f37960E);
        m24755l(hashMap, "display_height", this.f14123b.f14222y);
        m24755l(hashMap, "display_width", this.f14123b.f14221x);
        m24755l(hashMap, "environment", this.f14124c.f13955f);
        m24766a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f14124c.f13958i));
        m24755l(hashMap, "external_device_id", this.f14124c.f37951C);
        m24755l(hashMap, "fb_id", this.f14123b.f14206i);
        m24766a(hashMap, "google_play_instant", this.f14140s);
        m24755l(hashMap, "hardware_name", this.f14123b.f14223z);
        m24763d(hashMap, "install_begin_time", this.f14129h);
        m24763d(hashMap, "install_begin_time_server", this.f14131j);
        m24755l(hashMap, "install_version", this.f14135n);
        m24755l(hashMap, "installed_at", this.f14123b.f37958C);
        m24755l(hashMap, "language", this.f14123b.f14216s);
        m24760g(hashMap, "last_interval", this.f14125d.f14147e);
        m24755l(hashMap, "mcc", C6629i1.m24894x(this.f14124c.f13953d));
        m24755l(hashMap, "mnc", C6629i1.m24893y(this.f14124c.f13953d));
        m24766a(hashMap, "needs_response_details", bool);
        m24757j(hashMap, "network_type", C6629i1.m24892z(this.f14124c.f13953d));
        m24755l(hashMap, "os_build", this.f14123b.f37957B);
        m24755l(hashMap, "os_name", this.f14123b.f14213p);
        m24755l(hashMap, "os_version", this.f14123b.f14214q);
        m24755l(hashMap, "package_name", this.f14123b.f14208k);
        m24756k(hashMap, "params", this.f14142u);
        m24756k(hashMap, "partner_params", this.f14126e.f13890b);
        m24755l(hashMap, "push_token", this.f14125d.f14150h);
        m24755l(hashMap, "raw_referrer", this.f14136o);
        m24755l(hashMap, "referrer", this.f14134m);
        m24755l(hashMap, "referrer_api", this.f14137p);
        m24755l(hashMap, "reftag", this.f14132k);
        m24755l(hashMap, "screen_density", this.f14123b.f14220w);
        m24755l(hashMap, "screen_format", this.f14123b.f14219v);
        m24755l(hashMap, "screen_size", this.f14123b.f14218u);
        m24755l(hashMap, "secret_id", this.f14124c.f37949A);
        m24757j(hashMap, "session_count", this.f14125d.f14144b);
        m24760g(hashMap, "session_length", this.f14125d.f14148f);
        m24755l(hashMap, "source", str);
        m24757j(hashMap, "subsession_count", this.f14125d.f14145c);
        m24760g(hashMap, "time_spent", this.f14125d.f14146d);
        m24755l(hashMap, "updated_at", this.f14123b.f37959D);
        m24755l(hashMap, "payload", this.f14138q);
        m24755l(hashMap, "found_location", this.f14139r);
        m24742y(hashMap);
        return hashMap;
    }

    /* renamed from: F */
    private C6607c m24776F(EnumC6603b bVar) {
        C6607c cVar = new C6607c(bVar);
        cVar.m25106w(this.f14123b.f14207j);
        return cVar;
    }

    /* renamed from: G */
    private Map<String, String> m24775G() {
        ContentResolver contentResolver = this.f14124c.f13953d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> f = C6692y0.m24632f(this.f14124c.f13953d, f14121v);
        if (f != null) {
            hashMap.putAll(f);
        }
        Map<String, String> g = C6692y0.m24631g(this.f14124c.f13953d, f14121v);
        if (g != null) {
            hashMap.putAll(g);
        }
        this.f14123b.m24666A(this.f14124c.f13953d);
        m24755l(hashMap, "android_uuid", this.f14125d.f14149g);
        m24755l(hashMap, "gps_adid", this.f14123b.f14198a);
        m24757j(hashMap, "gps_adid_attempt", this.f14123b.f14200c);
        m24755l(hashMap, "gps_adid_src", this.f14123b.f14199b);
        m24766a(hashMap, "tracking_enabled", this.f14123b.f14201d);
        m24755l(hashMap, "fire_adid", C6629i1.m24901q(contentResolver));
        m24766a(hashMap, "fire_tracking_enabled", C6629i1.m24900r(contentResolver));
        if (!m24781A(hashMap) && !m24741z(hashMap)) {
            f14121v.mo24886a("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f14123b.m24640z(this.f14124c.f13953d);
            m24755l(hashMap, "android_id", this.f14123b.f14205h);
            m24755l(hashMap, "mac_md5", this.f14123b.f14204g);
            m24755l(hashMap, "mac_sha1", this.f14123b.f14203f);
        }
        m24755l(hashMap, "api_level", this.f14123b.f14215r);
        m24755l(hashMap, "app_secret", this.f14124c.f37950B);
        m24755l(hashMap, "app_token", this.f14124c.f13954e);
        m24755l(hashMap, "app_version", this.f14123b.f14209l);
        Boolean bool = Boolean.TRUE;
        m24766a(hashMap, "attribution_deeplink", bool);
        m24764c(hashMap, "created_at", this.f14122a);
        m24766a(hashMap, "device_known", this.f14124c.f13961l);
        m24766a(hashMap, "needs_cost", this.f14124c.f37953E);
        m24755l(hashMap, "device_name", this.f14123b.f14211n);
        m24755l(hashMap, "device_type", this.f14123b.f14210m);
        m24757j(hashMap, "ui_mode", this.f14123b.f37960E);
        m24755l(hashMap, "environment", this.f14124c.f13955f);
        m24766a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f14124c.f13958i));
        m24755l(hashMap, "external_device_id", this.f14124c.f37951C);
        m24766a(hashMap, "needs_response_details", bool);
        m24755l(hashMap, "os_name", this.f14123b.f14213p);
        m24755l(hashMap, "os_version", this.f14123b.f14214q);
        m24755l(hashMap, "package_name", this.f14123b.f14208k);
        m24755l(hashMap, "push_token", this.f14125d.f14150h);
        m24755l(hashMap, "secret_id", this.f14124c.f37949A);
        m24742y(hashMap);
        return hashMap;
    }

    /* renamed from: I */
    private String m24773I(C6627i iVar) {
        Double d = iVar.f13982b;
        if (d == null) {
            return C6629i1.m24906l("'%s'", iVar.f13981a);
        }
        return C6629i1.m24906l("(%.5f %s, '%s')", d, iVar.f13983c, iVar.f13981a);
    }

    /* renamed from: J */
    private Map<String, String> m24772J() {
        ContentResolver contentResolver = this.f14124c.f13953d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> f = C6692y0.m24632f(this.f14124c.f13953d, f14121v);
        if (f != null) {
            hashMap.putAll(f);
        }
        Map<String, String> g = C6692y0.m24631g(this.f14124c.f13953d, f14121v);
        if (g != null) {
            hashMap.putAll(g);
        }
        this.f14123b.m24666A(this.f14124c.f13953d);
        m24755l(hashMap, "android_uuid", this.f14125d.f14149g);
        m24755l(hashMap, "gps_adid", this.f14123b.f14198a);
        m24757j(hashMap, "gps_adid_attempt", this.f14123b.f14200c);
        m24755l(hashMap, "gps_adid_src", this.f14123b.f14199b);
        m24766a(hashMap, "tracking_enabled", this.f14123b.f14201d);
        m24755l(hashMap, "fire_adid", C6629i1.m24901q(contentResolver));
        m24766a(hashMap, "fire_tracking_enabled", C6629i1.m24900r(contentResolver));
        if (!m24781A(hashMap) && !m24741z(hashMap)) {
            f14121v.mo24886a("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f14123b.m24640z(this.f14124c.f13953d);
            m24755l(hashMap, "android_id", this.f14123b.f14205h);
            m24755l(hashMap, "mac_md5", this.f14123b.f14204g);
            m24755l(hashMap, "mac_sha1", this.f14123b.f14203f);
        }
        m24755l(hashMap, "api_level", this.f14123b.f14215r);
        m24755l(hashMap, "app_secret", this.f14124c.f37950B);
        m24755l(hashMap, "app_token", this.f14124c.f13954e);
        m24755l(hashMap, "app_version", this.f14123b.f14209l);
        Boolean bool = Boolean.TRUE;
        m24766a(hashMap, "attribution_deeplink", bool);
        m24764c(hashMap, "created_at", this.f14122a);
        m24766a(hashMap, "device_known", this.f14124c.f13961l);
        m24766a(hashMap, "needs_cost", this.f14124c.f37953E);
        m24755l(hashMap, "device_name", this.f14123b.f14211n);
        m24755l(hashMap, "device_type", this.f14123b.f14210m);
        m24757j(hashMap, "ui_mode", this.f14123b.f37960E);
        m24755l(hashMap, "environment", this.f14124c.f13955f);
        m24766a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f14124c.f13958i));
        m24755l(hashMap, "external_device_id", this.f14124c.f37951C);
        m24766a(hashMap, "needs_response_details", bool);
        m24755l(hashMap, "os_name", this.f14123b.f14213p);
        m24755l(hashMap, "os_version", this.f14123b.f14214q);
        m24755l(hashMap, "package_name", this.f14123b.f14208k);
        m24755l(hashMap, "push_token", this.f14125d.f14150h);
        m24755l(hashMap, "secret_id", this.f14124c.f37949A);
        m24742y(hashMap);
        return hashMap;
    }

    /* renamed from: K */
    private Map<String, String> m24771K(String str) {
        ContentResolver contentResolver = this.f14124c.f13953d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> f = C6692y0.m24632f(this.f14124c.f13953d, f14121v);
        if (f != null) {
            hashMap.putAll(f);
        }
        Map<String, String> g = C6692y0.m24631g(this.f14124c.f13953d, f14121v);
        if (g != null) {
            hashMap.putAll(g);
        }
        this.f14123b.m24666A(this.f14124c.f13953d);
        m24755l(hashMap, "android_uuid", this.f14125d.f14149g);
        m24755l(hashMap, "gps_adid", this.f14123b.f14198a);
        m24757j(hashMap, "gps_adid_attempt", this.f14123b.f14200c);
        m24755l(hashMap, "gps_adid_src", this.f14123b.f14199b);
        m24766a(hashMap, "tracking_enabled", this.f14123b.f14201d);
        m24755l(hashMap, "fire_adid", C6629i1.m24901q(contentResolver));
        m24766a(hashMap, "fire_tracking_enabled", C6629i1.m24900r(contentResolver));
        if (!m24781A(hashMap) && !m24741z(hashMap)) {
            f14121v.mo24886a("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f14123b.m24640z(this.f14124c.f13953d);
            m24755l(hashMap, "android_id", this.f14123b.f14205h);
            m24755l(hashMap, "mac_md5", this.f14123b.f14204g);
            m24755l(hashMap, "mac_sha1", this.f14123b.f14203f);
        }
        m24755l(hashMap, "app_secret", this.f14124c.f37950B);
        m24755l(hashMap, "app_token", this.f14124c.f13954e);
        Boolean bool = Boolean.TRUE;
        m24766a(hashMap, "attribution_deeplink", bool);
        m24764c(hashMap, "created_at", this.f14122a);
        m24766a(hashMap, "device_known", this.f14124c.f13961l);
        m24766a(hashMap, "needs_cost", this.f14124c.f37953E);
        m24755l(hashMap, "environment", this.f14124c.f13955f);
        m24766a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f14124c.f13958i));
        m24755l(hashMap, "external_device_id", this.f14124c.f37951C);
        m24766a(hashMap, "needs_response_details", bool);
        m24755l(hashMap, "push_token", this.f14125d.f14150h);
        m24755l(hashMap, "secret_id", this.f14124c.f37949A);
        m24755l(hashMap, "source", str);
        m24742y(hashMap);
        return hashMap;
    }

    /* renamed from: L */
    private Map<String, String> m24770L(boolean z) {
        String str;
        ContentResolver contentResolver = this.f14124c.f13953d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> f = C6692y0.m24632f(this.f14124c.f13953d, f14121v);
        if (f != null) {
            hashMap.putAll(f);
        }
        Map<String, String> g = C6692y0.m24631g(this.f14124c.f13953d, f14121v);
        if (g != null) {
            hashMap.putAll(g);
        }
        if (z) {
            str = "enable";
        } else {
            str = "disable";
        }
        m24755l(hashMap, "measurement", str);
        this.f14123b.m24666A(this.f14124c.f13953d);
        m24755l(hashMap, "android_uuid", this.f14125d.f14149g);
        m24755l(hashMap, "gps_adid", this.f14123b.f14198a);
        m24757j(hashMap, "gps_adid_attempt", this.f14123b.f14200c);
        m24755l(hashMap, "gps_adid_src", this.f14123b.f14199b);
        m24766a(hashMap, "tracking_enabled", this.f14123b.f14201d);
        m24755l(hashMap, "fire_adid", C6629i1.m24901q(contentResolver));
        m24766a(hashMap, "fire_tracking_enabled", C6629i1.m24900r(contentResolver));
        if (!m24781A(hashMap) && !m24741z(hashMap)) {
            f14121v.mo24886a("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f14123b.m24640z(this.f14124c.f13953d);
            m24755l(hashMap, "android_id", this.f14123b.f14205h);
            m24755l(hashMap, "mac_md5", this.f14123b.f14204g);
            m24755l(hashMap, "mac_sha1", this.f14123b.f14203f);
        }
        m24755l(hashMap, "api_level", this.f14123b.f14215r);
        m24755l(hashMap, "app_secret", this.f14124c.f37950B);
        m24755l(hashMap, "app_token", this.f14124c.f13954e);
        m24755l(hashMap, "app_version", this.f14123b.f14209l);
        Boolean bool = Boolean.TRUE;
        m24766a(hashMap, "attribution_deeplink", bool);
        m24764c(hashMap, "created_at", this.f14122a);
        m24766a(hashMap, "device_known", this.f14124c.f13961l);
        m24755l(hashMap, "device_name", this.f14123b.f14211n);
        m24755l(hashMap, "device_type", this.f14123b.f14210m);
        m24757j(hashMap, "ui_mode", this.f14123b.f37960E);
        m24755l(hashMap, "environment", this.f14124c.f13955f);
        m24766a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f14124c.f13958i));
        m24755l(hashMap, "external_device_id", this.f14124c.f37951C);
        m24766a(hashMap, "needs_response_details", bool);
        m24755l(hashMap, "os_name", this.f14123b.f14213p);
        m24755l(hashMap, "os_version", this.f14123b.f14214q);
        m24755l(hashMap, "package_name", this.f14123b.f14208k);
        m24755l(hashMap, "push_token", this.f14125d.f14150h);
        m24755l(hashMap, "secret_id", this.f14124c.f37949A);
        m24742y(hashMap);
        return hashMap;
    }

    /* renamed from: M */
    private Map<String, String> m24769M(boolean z) {
        ContentResolver contentResolver = this.f14124c.f13953d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> f = C6692y0.m24632f(this.f14124c.f13953d, f14121v);
        if (f != null) {
            hashMap.putAll(f);
        }
        Map<String, String> g = C6692y0.m24631g(this.f14124c.f13953d, f14121v);
        if (g != null) {
            hashMap.putAll(g);
        }
        if (!z) {
            m24756k(hashMap, "callback_params", this.f14126e.f13889a);
            m24756k(hashMap, "partner_params", this.f14126e.f13890b);
        }
        this.f14123b.m24666A(this.f14124c.f13953d);
        m24755l(hashMap, "android_uuid", this.f14125d.f14149g);
        m24755l(hashMap, "gps_adid", this.f14123b.f14198a);
        m24757j(hashMap, "gps_adid_attempt", this.f14123b.f14200c);
        m24755l(hashMap, "gps_adid_src", this.f14123b.f14199b);
        m24766a(hashMap, "tracking_enabled", this.f14123b.f14201d);
        m24755l(hashMap, "fire_adid", C6629i1.m24901q(contentResolver));
        m24766a(hashMap, "fire_tracking_enabled", C6629i1.m24900r(contentResolver));
        if (!m24781A(hashMap) && !m24741z(hashMap)) {
            f14121v.mo24886a("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f14123b.m24640z(this.f14124c.f13953d);
            m24755l(hashMap, "android_id", this.f14123b.f14205h);
            m24755l(hashMap, "mac_md5", this.f14123b.f14204g);
            m24755l(hashMap, "mac_sha1", this.f14123b.f14203f);
        }
        m24755l(hashMap, "api_level", this.f14123b.f14215r);
        m24755l(hashMap, "app_secret", this.f14124c.f37950B);
        m24755l(hashMap, "app_token", this.f14124c.f13954e);
        m24755l(hashMap, "app_version", this.f14123b.f14209l);
        Boolean bool = Boolean.TRUE;
        m24766a(hashMap, "attribution_deeplink", bool);
        m24757j(hashMap, "connectivity_type", C6629i1.m24903o(this.f14124c.f13953d));
        m24755l(hashMap, "country", this.f14123b.f14217t);
        m24755l(hashMap, "cpu_type", this.f14123b.f37956A);
        m24764c(hashMap, "created_at", this.f14122a);
        m24755l(hashMap, "default_tracker", this.f14124c.f13959j);
        m24766a(hashMap, "device_known", this.f14124c.f13961l);
        m24766a(hashMap, "needs_cost", this.f14124c.f37953E);
        m24755l(hashMap, "device_manufacturer", this.f14123b.f14212o);
        m24755l(hashMap, "device_name", this.f14123b.f14211n);
        m24755l(hashMap, "device_type", this.f14123b.f14210m);
        m24757j(hashMap, "ui_mode", this.f14123b.f37960E);
        m24755l(hashMap, "display_height", this.f14123b.f14222y);
        m24755l(hashMap, "display_width", this.f14123b.f14221x);
        m24755l(hashMap, "environment", this.f14124c.f13955f);
        m24766a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f14124c.f13958i));
        m24755l(hashMap, "external_device_id", this.f14124c.f37951C);
        m24755l(hashMap, "fb_id", this.f14123b.f14206i);
        m24755l(hashMap, "hardware_name", this.f14123b.f14223z);
        m24755l(hashMap, "installed_at", this.f14123b.f37958C);
        m24755l(hashMap, "language", this.f14123b.f14216s);
        m24760g(hashMap, "last_interval", this.f14125d.f14147e);
        m24755l(hashMap, "mcc", C6629i1.m24894x(this.f14124c.f13953d));
        m24755l(hashMap, "mnc", C6629i1.m24893y(this.f14124c.f13953d));
        m24766a(hashMap, "needs_response_details", bool);
        m24757j(hashMap, "network_type", C6629i1.m24892z(this.f14124c.f13953d));
        m24755l(hashMap, "os_build", this.f14123b.f37957B);
        m24755l(hashMap, "os_name", this.f14123b.f14213p);
        m24755l(hashMap, "os_version", this.f14123b.f14214q);
        m24755l(hashMap, "package_name", this.f14123b.f14208k);
        m24755l(hashMap, "push_token", this.f14125d.f14150h);
        m24755l(hashMap, "screen_density", this.f14123b.f14220w);
        m24755l(hashMap, "screen_format", this.f14123b.f14219v);
        m24755l(hashMap, "screen_size", this.f14123b.f14218u);
        m24755l(hashMap, "secret_id", this.f14124c.f37949A);
        m24757j(hashMap, "session_count", this.f14125d.f14144b);
        m24760g(hashMap, "session_length", this.f14125d.f14148f);
        m24757j(hashMap, "subsession_count", this.f14125d.f14145c);
        m24760g(hashMap, "time_spent", this.f14125d.f14146d);
        m24755l(hashMap, "updated_at", this.f14123b.f37959D);
        m24742y(hashMap);
        return hashMap;
    }

    /* renamed from: N */
    private Map<String, String> m24768N(C6655n nVar, boolean z) {
        ContentResolver contentResolver = this.f14124c.f13953d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> f = C6692y0.m24632f(this.f14124c.f13953d, f14121v);
        if (f != null) {
            hashMap.putAll(f);
        }
        Map<String, String> g = C6692y0.m24631g(this.f14124c.f13953d, f14121v);
        if (g != null) {
            hashMap.putAll(g);
        }
        this.f14123b.m24666A(this.f14124c.f13953d);
        m24755l(hashMap, "android_uuid", this.f14125d.f14149g);
        m24755l(hashMap, "gps_adid", this.f14123b.f14198a);
        m24757j(hashMap, "gps_adid_attempt", this.f14123b.f14200c);
        m24755l(hashMap, "gps_adid_src", this.f14123b.f14199b);
        m24766a(hashMap, "tracking_enabled", this.f14123b.f14201d);
        m24755l(hashMap, "fire_adid", C6629i1.m24901q(contentResolver));
        m24766a(hashMap, "fire_tracking_enabled", C6629i1.m24900r(contentResolver));
        if (!m24781A(hashMap) && !m24741z(hashMap)) {
            f14121v.mo24886a("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f14123b.m24640z(this.f14124c.f13953d);
            m24755l(hashMap, "android_id", this.f14123b.f14205h);
            m24755l(hashMap, "mac_md5", this.f14123b.f14204g);
            m24755l(hashMap, "mac_sha1", this.f14123b.f14203f);
        }
        if (!z) {
            m24756k(hashMap, "callback_params", C6629i1.m24927Y(this.f14126e.f13889a, nVar.m24799d(), "Callback"));
            m24756k(hashMap, "partner_params", C6629i1.m24927Y(this.f14126e.f13890b, nVar.m24796g(), "Partner"));
        }
        m24755l(hashMap, "api_level", this.f14123b.f14215r);
        m24755l(hashMap, "app_secret", this.f14124c.f37950B);
        m24755l(hashMap, "app_token", this.f14124c.f13954e);
        m24755l(hashMap, "app_version", this.f14123b.f14209l);
        Boolean bool = Boolean.TRUE;
        m24766a(hashMap, "attribution_deeplink", bool);
        m24757j(hashMap, "connectivity_type", C6629i1.m24903o(this.f14124c.f13953d));
        m24755l(hashMap, "country", this.f14123b.f14217t);
        m24755l(hashMap, "cpu_type", this.f14123b.f37956A);
        m24764c(hashMap, "created_at", this.f14122a);
        m24755l(hashMap, "default_tracker", this.f14124c.f13959j);
        m24766a(hashMap, "device_known", this.f14124c.f13961l);
        m24766a(hashMap, "needs_cost", this.f14124c.f37953E);
        m24755l(hashMap, "device_manufacturer", this.f14123b.f14212o);
        m24755l(hashMap, "device_name", this.f14123b.f14211n);
        m24755l(hashMap, "device_type", this.f14123b.f14210m);
        m24757j(hashMap, "ui_mode", this.f14123b.f37960E);
        m24755l(hashMap, "display_height", this.f14123b.f14222y);
        m24755l(hashMap, "display_width", this.f14123b.f14221x);
        m24755l(hashMap, "environment", this.f14124c.f13955f);
        m24766a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f14124c.f13958i));
        m24755l(hashMap, "external_device_id", this.f14124c.f37951C);
        m24755l(hashMap, "fb_id", this.f14123b.f14206i);
        m24755l(hashMap, "hardware_name", this.f14123b.f14223z);
        m24755l(hashMap, "installed_at", this.f14123b.f37958C);
        m24755l(hashMap, "language", this.f14123b.f14216s);
        m24760g(hashMap, "last_interval", this.f14125d.f14147e);
        m24755l(hashMap, "mcc", C6629i1.m24894x(this.f14124c.f13953d));
        m24755l(hashMap, "mnc", C6629i1.m24893y(this.f14124c.f13953d));
        m24766a(hashMap, "needs_response_details", bool);
        m24757j(hashMap, "network_type", C6629i1.m24892z(this.f14124c.f13953d));
        m24755l(hashMap, "os_build", this.f14123b.f37957B);
        m24755l(hashMap, "os_name", this.f14123b.f14213p);
        m24755l(hashMap, "os_version", this.f14123b.f14214q);
        m24755l(hashMap, "package_name", this.f14123b.f14208k);
        m24755l(hashMap, "push_token", this.f14125d.f14150h);
        m24755l(hashMap, "screen_density", this.f14123b.f14220w);
        m24755l(hashMap, "screen_format", this.f14123b.f14219v);
        m24755l(hashMap, "screen_size", this.f14123b.f14218u);
        m24755l(hashMap, "secret_id", this.f14124c.f37949A);
        m24757j(hashMap, "session_count", this.f14125d.f14144b);
        m24760g(hashMap, "session_length", this.f14125d.f14148f);
        m24757j(hashMap, "subsession_count", this.f14125d.f14145c);
        m24760g(hashMap, "time_spent", this.f14125d.f14146d);
        m24755l(hashMap, "updated_at", this.f14123b.f37959D);
        m24755l(hashMap, "billing_store", nVar.m24800c());
        m24755l(hashMap, "currency", nVar.m24798e());
        m24755l(hashMap, "product_id", nVar.m24791l());
        m24755l(hashMap, "purchase_token", nVar.m24793j());
        m24755l(hashMap, "receipt", nVar.m24792k());
        m24757j(hashMap, "revenue", nVar.m24795h());
        m24764c(hashMap, "transaction_date", nVar.m24794i());
        m24755l(hashMap, "transaction_id", nVar.m24797f());
        m24742y(hashMap);
        return hashMap;
    }

    /* renamed from: O */
    private Map<String, String> m24767O(C6665s sVar) {
        String str;
        ContentResolver contentResolver = this.f14124c.f13953d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> f = C6692y0.m24632f(this.f14124c.f13953d, f14121v);
        if (f != null) {
            hashMap.putAll(f);
        }
        Map<String, String> g = C6692y0.m24631g(this.f14124c.f13953d, f14121v);
        if (g != null) {
            hashMap.putAll(g);
        }
        Boolean bool = sVar.f14119a;
        if (bool != null) {
            if (bool.booleanValue()) {
                str = "enable";
            } else {
                str = "disable";
            }
            m24755l(hashMap, "sharing", str);
        }
        m24756k(hashMap, "granular_third_party_sharing_options", sVar.f14120b);
        this.f14123b.m24666A(this.f14124c.f13953d);
        m24755l(hashMap, "android_uuid", this.f14125d.f14149g);
        m24755l(hashMap, "gps_adid", this.f14123b.f14198a);
        m24757j(hashMap, "gps_adid_attempt", this.f14123b.f14200c);
        m24755l(hashMap, "gps_adid_src", this.f14123b.f14199b);
        m24766a(hashMap, "tracking_enabled", this.f14123b.f14201d);
        m24755l(hashMap, "fire_adid", C6629i1.m24901q(contentResolver));
        m24766a(hashMap, "fire_tracking_enabled", C6629i1.m24900r(contentResolver));
        if (!m24781A(hashMap) && !m24741z(hashMap)) {
            f14121v.mo24886a("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f14123b.m24640z(this.f14124c.f13953d);
            m24755l(hashMap, "android_id", this.f14123b.f14205h);
            m24755l(hashMap, "mac_md5", this.f14123b.f14204g);
            m24755l(hashMap, "mac_sha1", this.f14123b.f14203f);
        }
        m24755l(hashMap, "api_level", this.f14123b.f14215r);
        m24755l(hashMap, "app_secret", this.f14124c.f37950B);
        m24755l(hashMap, "app_token", this.f14124c.f13954e);
        m24755l(hashMap, "app_version", this.f14123b.f14209l);
        Boolean bool2 = Boolean.TRUE;
        m24766a(hashMap, "attribution_deeplink", bool2);
        m24764c(hashMap, "created_at", this.f14122a);
        m24766a(hashMap, "device_known", this.f14124c.f13961l);
        m24755l(hashMap, "device_name", this.f14123b.f14211n);
        m24755l(hashMap, "device_type", this.f14123b.f14210m);
        m24757j(hashMap, "ui_mode", this.f14123b.f37960E);
        m24755l(hashMap, "environment", this.f14124c.f13955f);
        m24766a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f14124c.f13958i));
        m24755l(hashMap, "external_device_id", this.f14124c.f37951C);
        m24766a(hashMap, "needs_response_details", bool2);
        m24755l(hashMap, "os_name", this.f14123b.f14213p);
        m24755l(hashMap, "os_version", this.f14123b.f14214q);
        m24755l(hashMap, "package_name", this.f14123b.f14208k);
        m24755l(hashMap, "push_token", this.f14125d.f14150h);
        m24755l(hashMap, "secret_id", this.f14124c.f37949A);
        m24742y(hashMap);
        return hashMap;
    }

    /* renamed from: a */
    public static void m24766a(Map<String, String> map, String str, Boolean bool) {
        if (bool != null) {
            m24757j(map, str, bool.booleanValue() ? 1L : 0L);
        }
    }

    /* renamed from: b */
    private static void m24765b(Map<String, String> map, String str, Date date) {
        if (date != null) {
            m24755l(map, str, C6629i1.f13989b.format(date));
        }
    }

    /* renamed from: c */
    private static void m24764c(Map<String, String> map, String str, long j) {
        if (j > 0) {
            m24765b(map, str, new Date(j));
        }
    }

    /* renamed from: d */
    private static void m24763d(Map<String, String> map, String str, long j) {
        if (j > 0) {
            m24765b(map, str, new Date(j * 1000));
        }
    }

    /* renamed from: e */
    private static void m24762e(Map<String, String> map, String str, Double d) {
        if (d != null) {
            m24755l(map, str, C6629i1.m24906l("%.5f", d));
        }
    }

    /* renamed from: f */
    private static void m24761f(Map<String, String> map, String str, Double d) {
        if (d != null) {
            m24755l(map, str, Double.toString(d.doubleValue()));
        }
    }

    /* renamed from: g */
    private static void m24760g(Map<String, String> map, String str, long j) {
        if (j >= 0) {
            m24757j(map, str, (j + 500) / 1000);
        }
    }

    /* renamed from: h */
    private static void m24759h(Map<String, String> map, String str, Integer num) {
        if (num != null) {
            m24755l(map, str, Integer.toString(num.intValue()));
        }
    }

    /* renamed from: i */
    static void m24758i(Map<String, String> map, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            m24755l(map, str, jSONObject.toString());
        }
    }

    /* renamed from: j */
    public static void m24757j(Map<String, String> map, String str, long j) {
        if (j >= 0) {
            m24755l(map, str, Long.toString(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static void m24756k(Map<String, String> map, String str, Map map2) {
        if (map2 != null && map2.size() != 0) {
            m24755l(map, str, new JSONObject(map2).toString());
        }
    }

    /* renamed from: l */
    public static void m24755l(Map<String, String> map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    /* renamed from: y */
    private void m24742y(Map<String, String> map) {
        if (map != null && !map.containsKey("mac_sha1") && !map.containsKey("mac_md5") && !map.containsKey("android_id") && !map.containsKey("gps_adid") && !map.containsKey("fire_adid") && !map.containsKey("oaid") && !map.containsKey("imei") && !map.containsKey("meid") && !map.containsKey("device_id") && !map.containsKey("imeis") && !map.containsKey("meids") && !map.containsKey("device_ids")) {
            f14121v.mo24885b("Missing device id's. Please check if Proguard is correctly set with Adjust SDK", new Object[0]);
        }
    }

    /* renamed from: z */
    private boolean m24741z(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        return map.containsKey("fire_adid");
    }

    /* renamed from: H */
    public Map<String, String> m24774H(C6627i iVar, boolean z) {
        ContentResolver contentResolver = this.f14124c.f13953d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> f = C6692y0.m24632f(this.f14124c.f13953d, f14121v);
        if (f != null) {
            hashMap.putAll(f);
        }
        Map<String, String> g = C6692y0.m24631g(this.f14124c.f13953d, f14121v);
        if (g != null) {
            hashMap.putAll(g);
        }
        if (!z) {
            m24756k(hashMap, "callback_params", C6629i1.m24927Y(this.f14126e.f13889a, iVar.f13984d, "Callback"));
            m24756k(hashMap, "partner_params", C6629i1.m24927Y(this.f14126e.f13890b, iVar.f13985e, "Partner"));
        }
        this.f14123b.m24666A(this.f14124c.f13953d);
        m24755l(hashMap, "android_uuid", this.f14125d.f14149g);
        m24755l(hashMap, "gps_adid", this.f14123b.f14198a);
        m24757j(hashMap, "gps_adid_attempt", this.f14123b.f14200c);
        m24755l(hashMap, "gps_adid_src", this.f14123b.f14199b);
        m24766a(hashMap, "tracking_enabled", this.f14123b.f14201d);
        m24755l(hashMap, "fire_adid", C6629i1.m24901q(contentResolver));
        m24766a(hashMap, "fire_tracking_enabled", C6629i1.m24900r(contentResolver));
        if (!m24781A(hashMap) && !m24741z(hashMap)) {
            f14121v.mo24886a("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f14123b.m24640z(this.f14124c.f13953d);
            m24755l(hashMap, "android_id", this.f14123b.f14205h);
            m24755l(hashMap, "mac_md5", this.f14123b.f14204g);
            m24755l(hashMap, "mac_sha1", this.f14123b.f14203f);
        }
        m24755l(hashMap, "api_level", this.f14123b.f14215r);
        m24755l(hashMap, "app_secret", this.f14124c.f37950B);
        m24755l(hashMap, "app_token", this.f14124c.f13954e);
        m24755l(hashMap, "app_version", this.f14123b.f14209l);
        Boolean bool = Boolean.TRUE;
        m24766a(hashMap, "attribution_deeplink", bool);
        m24757j(hashMap, "connectivity_type", C6629i1.m24903o(this.f14124c.f13953d));
        m24755l(hashMap, "country", this.f14123b.f14217t);
        m24755l(hashMap, "cpu_type", this.f14123b.f37956A);
        m24764c(hashMap, "created_at", this.f14122a);
        m24755l(hashMap, "currency", iVar.f13983c);
        m24766a(hashMap, "device_known", this.f14124c.f13961l);
        m24766a(hashMap, "needs_cost", this.f14124c.f37953E);
        m24755l(hashMap, "device_manufacturer", this.f14123b.f14212o);
        m24755l(hashMap, "device_name", this.f14123b.f14211n);
        m24755l(hashMap, "device_type", this.f14123b.f14210m);
        m24757j(hashMap, "ui_mode", this.f14123b.f37960E);
        m24755l(hashMap, "display_height", this.f14123b.f14222y);
        m24755l(hashMap, "display_width", this.f14123b.f14221x);
        m24755l(hashMap, "environment", this.f14124c.f13955f);
        m24755l(hashMap, "event_callback_id", iVar.f13987g);
        m24757j(hashMap, "event_count", this.f14125d.f14143a);
        m24766a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f14124c.f13958i));
        m24755l(hashMap, "event_token", iVar.f13981a);
        m24755l(hashMap, "external_device_id", this.f14124c.f37951C);
        m24755l(hashMap, "fb_id", this.f14123b.f14206i);
        m24755l(hashMap, "hardware_name", this.f14123b.f14223z);
        m24755l(hashMap, "language", this.f14123b.f14216s);
        m24755l(hashMap, "mcc", C6629i1.m24894x(this.f14124c.f13953d));
        m24755l(hashMap, "mnc", C6629i1.m24893y(this.f14124c.f13953d));
        m24766a(hashMap, "needs_response_details", bool);
        m24757j(hashMap, "network_type", C6629i1.m24892z(this.f14124c.f13953d));
        m24755l(hashMap, "os_build", this.f14123b.f37957B);
        m24755l(hashMap, "os_name", this.f14123b.f14213p);
        m24755l(hashMap, "os_version", this.f14123b.f14214q);
        m24755l(hashMap, "package_name", this.f14123b.f14208k);
        m24755l(hashMap, "push_token", this.f14125d.f14150h);
        m24762e(hashMap, "revenue", iVar.f13982b);
        m24755l(hashMap, "screen_density", this.f14123b.f14220w);
        m24755l(hashMap, "screen_format", this.f14123b.f14219v);
        m24755l(hashMap, "screen_size", this.f14123b.f14218u);
        m24755l(hashMap, "secret_id", this.f14124c.f37949A);
        m24757j(hashMap, "session_count", this.f14125d.f14144b);
        m24760g(hashMap, "session_length", this.f14125d.f14148f);
        m24757j(hashMap, "subsession_count", this.f14125d.f14145c);
        m24760g(hashMap, "time_spent", this.f14125d.f14146d);
        m24742y(hashMap);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public C6607c m24754m(C6616f fVar, boolean z) {
        Map<String, String> B = m24780B(fVar, z);
        EnumC6603b bVar = EnumC6603b.AD_REVENUE;
        C6607c F = m24776F(bVar);
        F.m25130D("/ad_revenue");
        F.m25129E("");
        String bVar2 = bVar.toString();
        String f = F.m25123f();
        C6624h hVar = this.f14124c;
        C6661q.m24784e(B, bVar2, f, hVar.f13953d, hVar.f13971v);
        F.m25132B(B);
        if (z) {
            F.m25110s(fVar.f13918h);
            F.m25131C(fVar.f13919i);
        }
        return F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public C6607c m24753n(String str, JSONObject jSONObject) {
        Map<String, String> C = m24779C(str, jSONObject);
        EnumC6603b bVar = EnumC6603b.AD_REVENUE;
        C6607c F = m24776F(bVar);
        F.m25130D("/ad_revenue");
        F.m25129E("");
        String bVar2 = bVar.toString();
        String f = F.m25123f();
        C6624h hVar = this.f14124c;
        C6661q.m24784e(C, bVar2, f, hVar.f13953d, hVar.f13971v);
        F.m25132B(C);
        return F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public C6607c m24752o(String str) {
        Map<String, String> D = m24778D(str);
        EnumC6603b bVar = EnumC6603b.ATTRIBUTION;
        C6607c F = m24776F(bVar);
        F.m25130D("attribution");
        F.m25129E("");
        String bVar2 = bVar.toString();
        String f = F.m25123f();
        C6624h hVar = this.f14124c;
        C6661q.m24784e(D, bVar2, f, hVar.f13953d, hVar.f13971v);
        F.m25132B(D);
        return F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public C6607c m24751p(String str) {
        Map<String, String> E = m24777E(str);
        EnumC6603b bVar = EnumC6603b.CLICK;
        C6607c F = m24776F(bVar);
        F.m25130D("/sdk_click");
        F.m25129E("");
        F.m25109t(this.f14128g);
        F.m25108u(this.f14127f);
        F.m25104y(this.f14129h);
        F.m25107v(this.f14130i);
        F.m25103z(this.f14131j);
        F.m25133A(this.f14135n);
        F.m25105x(this.f14140s);
        String bVar2 = bVar.toString();
        String f = F.m25123f();
        C6624h hVar = this.f14124c;
        C6661q.m24784e(E, bVar2, f, hVar.f13953d, hVar.f13971v);
        F.m25132B(E);
        return F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public C6607c m24750q() {
        Map<String, String> G = m24775G();
        EnumC6603b bVar = EnumC6603b.DISABLE_THIRD_PARTY_SHARING;
        C6607c F = m24776F(bVar);
        F.m25130D("/disable_third_party_sharing");
        F.m25129E("");
        String bVar2 = bVar.toString();
        String f = F.m25123f();
        C6624h hVar = this.f14124c;
        C6661q.m24784e(G, bVar2, f, hVar.f13953d, hVar.f13971v);
        F.m25132B(G);
        return F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public C6607c m24749r(C6627i iVar, boolean z) {
        Map<String, String> H = m24774H(iVar, z);
        EnumC6603b bVar = EnumC6603b.EVENT;
        C6607c F = m24776F(bVar);
        F.m25130D("/event");
        F.m25129E(m24773I(iVar));
        String bVar2 = bVar.toString();
        String f = F.m25123f();
        C6624h hVar = this.f14124c;
        C6661q.m24784e(H, bVar2, f, hVar.f13953d, hVar.f13971v);
        F.m25132B(H);
        if (z) {
            F.m25110s(iVar.f13984d);
            F.m25131C(iVar.f13985e);
        }
        return F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public C6607c m24748s() {
        Map<String, String> J = m24772J();
        EnumC6603b bVar = EnumC6603b.GDPR;
        C6607c F = m24776F(bVar);
        F.m25130D("/gdpr_forget_device");
        F.m25129E("");
        String bVar2 = bVar.toString();
        String f = F.m25123f();
        C6624h hVar = this.f14124c;
        C6661q.m24784e(J, bVar2, f, hVar.f13953d, hVar.f13971v);
        F.m25132B(J);
        return F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public C6607c m24747t(String str) {
        Map<String, String> K = m24771K(str);
        EnumC6603b bVar = EnumC6603b.INFO;
        C6607c F = m24776F(bVar);
        F.m25130D("/sdk_info");
        F.m25129E("");
        String bVar2 = bVar.toString();
        String f = F.m25123f();
        C6624h hVar = this.f14124c;
        C6661q.m24784e(K, bVar2, f, hVar.f13953d, hVar.f13971v);
        F.m25132B(K);
        return F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public C6607c m24746u(boolean z) {
        Map<String, String> L = m24770L(z);
        EnumC6603b bVar = EnumC6603b.MEASUREMENT_CONSENT;
        C6607c F = m24776F(bVar);
        F.m25130D("/measurement_consent");
        F.m25129E("");
        String bVar2 = bVar.toString();
        String f = F.m25123f();
        C6624h hVar = this.f14124c;
        C6661q.m24784e(L, bVar2, f, hVar.f13953d, hVar.f13971v);
        F.m25132B(L);
        return F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public C6607c m24745v(boolean z) {
        Map<String, String> M = m24769M(z);
        EnumC6603b bVar = EnumC6603b.SESSION;
        C6607c F = m24776F(bVar);
        F.m25130D("/session");
        F.m25129E("");
        String bVar2 = bVar.toString();
        String f = F.m25123f();
        C6624h hVar = this.f14124c;
        C6661q.m24784e(M, bVar2, f, hVar.f13953d, hVar.f13971v);
        F.m25132B(M);
        return F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public C6607c m24744w(C6655n nVar, boolean z) {
        Map<String, String> N = m24768N(nVar, z);
        EnumC6603b bVar = EnumC6603b.SUBSCRIPTION;
        C6607c F = m24776F(bVar);
        F.m25130D("/v2/purchase");
        F.m25129E("");
        String bVar2 = bVar.toString();
        String f = F.m25123f();
        C6624h hVar = this.f14124c;
        C6661q.m24784e(N, bVar2, f, hVar.f13953d, hVar.f13971v);
        F.m25132B(N);
        return F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public C6607c m24743x(C6665s sVar) {
        Map<String, String> O = m24767O(sVar);
        EnumC6603b bVar = EnumC6603b.THIRD_PARTY_SHARING;
        C6607c F = m24776F(bVar);
        F.m25130D("/third_party_sharing");
        F.m25129E("");
        String bVar2 = bVar.toString();
        String f = F.m25123f();
        C6624h hVar = this.f14124c;
        C6661q.m24784e(O, bVar2, f, hVar.f13953d, hVar.f13971v);
        F.m25132B(O);
        return F;
    }
}
