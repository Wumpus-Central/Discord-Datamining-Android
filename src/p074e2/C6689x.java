package p074e2;

import android.content.Context;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import java.util.Date;
import java.util.Locale;
import p074e2.C6693z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: e2.x */
/* loaded from: classes.dex */
public class C6689x {

    /* renamed from: C */
    String f37958C;

    /* renamed from: D */
    String f37959D;

    /* renamed from: E */
    int f37960E;

    /* renamed from: a */
    String f14198a;

    /* renamed from: b */
    String f14199b;

    /* renamed from: c */
    int f14200c;

    /* renamed from: d */
    Boolean f14201d;

    /* renamed from: f */
    String f14203f;

    /* renamed from: g */
    String f14204g;

    /* renamed from: h */
    String f14205h;

    /* renamed from: i */
    String f14206i;

    /* renamed from: j */
    String f14207j;

    /* renamed from: k */
    String f14208k;

    /* renamed from: l */
    String f14209l;

    /* renamed from: m */
    String f14210m;

    /* renamed from: s */
    String f14216s;

    /* renamed from: t */
    String f14217t;

    /* renamed from: u */
    String f14218u;

    /* renamed from: v */
    String f14219v;

    /* renamed from: w */
    String f14220w;

    /* renamed from: x */
    String f14221x;

    /* renamed from: y */
    String f14222y;

    /* renamed from: e */
    private boolean f14202e = false;

    /* renamed from: n */
    String f14211n = m24656j();

    /* renamed from: o */
    String f14212o = m24657i();

    /* renamed from: p */
    String f14213p = m24646t();

    /* renamed from: q */
    String f14214q = m24645u();

    /* renamed from: r */
    String f14215r = m24664b();

    /* renamed from: z */
    String f14223z = m24650p();

    /* renamed from: A */
    String f37956A = m24665a();

    /* renamed from: B */
    String f37957B = m24660f();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6689x(Context context, String str) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        Locale u = C6629i1.m24897u(configuration);
        int i = configuration.screenLayout;
        this.f14208k = m24644v(context);
        this.f14209l = m24661e(context);
        this.f14210m = m24655k(configuration);
        this.f14216s = m24649q(u);
        this.f14217t = m24658h(u);
        this.f14218u = m24641y(i);
        this.f14219v = m24642x(i);
        this.f14220w = m24643w(displayMetrics);
        this.f14221x = m24652n(displayMetrics);
        this.f14222y = m24653m(displayMetrics);
        this.f14207j = m24659g(str);
        this.f14206i = m24651o(context);
        this.f37958C = m24663c(context);
        this.f37959D = m24662d(context);
        this.f37960E = m24654l(configuration);
    }

    /* renamed from: a */
    private String m24665a() {
        String[] G = C6629i1.m24945G();
        if (G == null || G.length == 0) {
            return C6629i1.m24902p();
        }
        return G[0];
    }

    /* renamed from: b */
    private String m24664b() {
        return "" + Build.VERSION.SDK_INT;
    }

    /* renamed from: c */
    private String m24663c(Context context) {
        try {
            return C6629i1.f13989b.format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).firstInstallTime));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    private String m24662d(Context context) {
        try {
            return C6629i1.f13989b.format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).lastUpdateTime));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    private String m24661e(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    private String m24660f() {
        return Build.ID;
    }

    /* renamed from: g */
    private String m24659g(String str) {
        if (str == null) {
            return "android4.28.8";
        }
        return C6629i1.m24906l("%s@%s", str, "android4.28.8");
    }

    /* renamed from: h */
    private String m24658h(Locale locale) {
        return locale.getCountry();
    }

    /* renamed from: i */
    private String m24657i() {
        return Build.MANUFACTURER;
    }

    /* renamed from: j */
    private String m24656j() {
        return Build.MODEL;
    }

    /* renamed from: k */
    private String m24655k(Configuration configuration) {
        if ((configuration.uiMode & 15) == 4) {
            return "tv";
        }
        int i = configuration.screenLayout & 15;
        if (i == 1 || i == 2) {
            return "phone";
        }
        if (i == 3 || i == 4) {
            return "tablet";
        }
        return null;
    }

    /* renamed from: l */
    private int m24654l(Configuration configuration) {
        return configuration.uiMode & 15;
    }

    /* renamed from: m */
    private String m24653m(DisplayMetrics displayMetrics) {
        return String.valueOf(displayMetrics.heightPixels);
    }

    /* renamed from: n */
    private String m24652n(DisplayMetrics displayMetrics) {
        return String.valueOf(displayMetrics.widthPixels);
    }

    /* renamed from: o */
    private String m24651o(Context context) {
        Cursor query;
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.facebook.katana", 64).signatures;
            if (signatureArr == null || signatureArr.length != 1 || !"30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2".equals(signatureArr[0].toCharsString()) || (query = context.getContentResolver().query(Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), new String[]{"aid"}, null, null, null)) == null) {
                return null;
            }
            if (!query.moveToFirst()) {
                query.close();
                return null;
            }
            String string = query.getString(query.getColumnIndex("aid"));
            query.close();
            return string;
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: p */
    private String m24650p() {
        return Build.DISPLAY;
    }

    /* renamed from: q */
    private String m24649q(Locale locale) {
        return locale.getLanguage();
    }

    /* renamed from: r */
    private String m24648r(String str) {
        if (str == null) {
            return null;
        }
        return C6629i1.m24914f0(str);
    }

    /* renamed from: s */
    private String m24647s(String str) {
        if (str == null) {
            return null;
        }
        return C6629i1.m24928X(str.replaceAll(":", ""));
    }

    /* renamed from: t */
    private String m24646t() {
        return "android";
    }

    /* renamed from: u */
    private String m24645u() {
        return Build.VERSION.RELEASE;
    }

    /* renamed from: v */
    private String m24644v(Context context) {
        return context.getPackageName();
    }

    /* renamed from: w */
    private String m24643w(DisplayMetrics displayMetrics) {
        int i = displayMetrics.densityDpi;
        if (i == 0) {
            return null;
        }
        return i < 140 ? "low" : i > 200 ? "high" : "medium";
    }

    /* renamed from: x */
    private String m24642x(int i) {
        int i2 = i & 48;
        if (i2 == 16) {
            return "normal";
        }
        if (i2 != 32) {
            return null;
        }
        return "long";
    }

    /* renamed from: y */
    private String m24641y(int i) {
        int i2 = i & 15;
        if (i2 == 1) {
            return "small";
        }
        if (i2 == 2) {
            return "normal";
        }
        if (i2 == 3) {
            return "large";
        }
        if (i2 != 4) {
            return null;
        }
        return "xlarge";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void m24666A(Context context) {
        String str = this.f14198a;
        Boolean bool = this.f14201d;
        this.f14198a = null;
        this.f14201d = null;
        this.f14199b = null;
        this.f14200c = -1;
        for (int i = 1; i <= 3; i++) {
            try {
                C6693z.C6695b a = C6693z.m24625a(context, i * 3000);
                if (this.f14198a == null) {
                    this.f14198a = a.m24623a();
                }
                if (this.f14201d == null) {
                    this.f14201d = a.m24622b();
                }
                if (!(this.f14198a == null || this.f14201d == null)) {
                    this.f14199b = "service";
                    this.f14200c = i;
                    return;
                }
            } catch (Exception unused) {
            }
        }
        for (int i2 = 1; i2 <= 3; i2++) {
            Object m = C6629i1.m24905m(context, 11000L);
            if (m != null) {
                if (this.f14198a == null) {
                    this.f14198a = C6629i1.m24951A(context, m, 1000L);
                }
                if (this.f14201d == null) {
                    this.f14201d = C6629i1.m24931U(context, m, 1000L);
                }
                if (!(this.f14198a == null || this.f14201d == null)) {
                    this.f14199b = "library";
                    this.f14200c = i2;
                    return;
                }
            }
        }
        if (this.f14198a == null) {
            this.f14198a = str;
        }
        if (this.f14201d == null) {
            this.f14201d = bool;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m24640z(Context context) {
        if (!this.f14202e) {
            if (!C6629i1.m24923b(context, "android.permission.ACCESS_WIFI_STATE")) {
                C6639l.m24863j().mo24886a("Missing permission: ACCESS_WIFI_STATE", new Object[0]);
            }
            String w = C6629i1.m24895w(context);
            this.f14203f = m24648r(w);
            this.f14204g = m24647s(w);
            this.f14205h = C6629i1.m24904n(context);
            this.f14202e = true;
        }
    }
}
