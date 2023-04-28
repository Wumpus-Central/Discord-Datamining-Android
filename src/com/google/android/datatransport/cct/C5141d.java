package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.facebook.react.views.text.TypefaceStyle;
import com.google.android.datatransport.cct.C5141d;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import mc.AbstractC10580a;
import mc.C10581b;
import p040c7.AbstractC3770a;
import p279p6.C11572b;
import p295q6.AbstractC11996a;
import p295q6.AbstractC12020j;
import p295q6.AbstractC12021k;
import p295q6.AbstractC12024l;
import p295q6.AbstractC12026m;
import p295q6.AbstractC12028n;
import p295q6.AbstractC12029o;
import p295q6.EnumC12033p;
import p315r6.AbstractC12420i;
import p315r6.C12419h;
import p335s6.AbstractC12793f;
import p335s6.AbstractC12795g;
import p335s6.AbstractC12803m;
import p397w6.C13750a;
import p417x6.AbstractC13938a;
import p417x6.AbstractC13940c;
import p417x6.C13939b;

/* renamed from: com.google.android.datatransport.cct.d */
/* loaded from: classes7.dex */
final class C5141d implements AbstractC12803m {

    /* renamed from: a */
    private final AbstractC10580a f8940a;

    /* renamed from: b */
    private final ConnectivityManager f8941b;

    /* renamed from: c */
    private final Context f8942c;

    /* renamed from: d */
    final URL f8943d;

    /* renamed from: e */
    private final AbstractC3770a f8944e;

    /* renamed from: f */
    private final AbstractC3770a f8945f;

    /* renamed from: g */
    private final int f8946g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.cct.d$a */
    /* loaded from: classes7.dex */
    public static final class C5142a {

        /* renamed from: a */
        final URL f8947a;

        /* renamed from: b */
        final AbstractC12020j f8948b;

        /* renamed from: c */
        final String f8949c;

        C5142a(URL url, AbstractC12020j jVar, String str) {
            this.f8947a = url;
            this.f8948b = jVar;
            this.f8949c = str;
        }

        /* renamed from: a */
        C5142a m30567a(URL url) {
            return new C5142a(url, this.f8948b, this.f8949c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.cct.d$b */
    /* loaded from: classes7.dex */
    public static final class C5143b {

        /* renamed from: a */
        final int f8950a;

        /* renamed from: b */
        final URL f8951b;

        /* renamed from: c */
        final long f8952c;

        C5143b(int i, URL url, long j) {
            this.f8950a = i;
            this.f8951b = url;
            this.f8952c = j;
        }
    }

    C5141d(Context context, AbstractC3770a aVar, AbstractC3770a aVar2, int i) {
        this.f8940a = AbstractC12020j.m8007b();
        this.f8942c = context;
        this.f8941b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f8943d = m30568n(C5138a.f8931c);
        this.f8944e = aVar2;
        this.f8945f = aVar;
        this.f8946g = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public C5143b m30577e(C5142a aVar) {
        Throwable e;
        Throwable e2;
        C13750a.m2814a("CctTransportBackend", "Making request to: %s", aVar.f8947a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f8947a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f8946g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.2"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f8949c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f8940a.mo10347a(aVar.f8948b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                C13750a.m2810e("CctTransportBackend", "Status Code: " + responseCode);
                C13750a.m2810e("CctTransportBackend", "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                C13750a.m2810e("CctTransportBackend", "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new C5143b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                }
                if (responseCode != 200) {
                    return new C5143b(responseCode, null, 0L);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    InputStream m = m30569m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    C5143b bVar = new C5143b(responseCode, null, AbstractC12028n.m7962b(new BufferedReader(new InputStreamReader(m))).mo7961c());
                    if (m != null) {
                        m.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th2) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (ConnectException e3) {
            e = e3;
            C13750a.m2812c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C5143b(500, null, 0L);
        } catch (UnknownHostException e4) {
            e = e4;
            C13750a.m2812c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C5143b(500, null, 0L);
        } catch (IOException e5) {
            e2 = e5;
            C13750a.m2812c("CctTransportBackend", "Couldn't encode request, returning with 400", e2);
            return new C5143b(TypefaceStyle.NORMAL, null, 0L);
        } catch (C10581b e6) {
            e2 = e6;
            C13750a.m2812c("CctTransportBackend", "Couldn't encode request, returning with 400", e2);
            return new C5143b(TypefaceStyle.NORMAL, null, 0L);
        }
    }

    /* renamed from: f */
    private static int m30576f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC12029o.EnumC12031b.UNKNOWN_MOBILE_SUBTYPE.m7953b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return AbstractC12029o.EnumC12031b.COMBINED.m7953b();
        }
        if (AbstractC12029o.EnumC12031b.m7954a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    /* renamed from: g */
    private static int m30575g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC12029o.EnumC12032c.NONE.m7951b();
        }
        return networkInfo.getType();
    }

    /* renamed from: h */
    private static int m30574h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            C13750a.m2812c("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    /* renamed from: i */
    private AbstractC12020j m30573i(AbstractC12793f fVar) {
        AbstractC12024l.AbstractC12025a j;
        HashMap hashMap = new HashMap();
        for (AbstractC12420i iVar : fVar.mo5477b()) {
            String j2 = iVar.mo6836j();
            if (!hashMap.containsKey(j2)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                hashMap.put(j2, arrayList);
            } else {
                ((List) hashMap.get(j2)).add(iVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            AbstractC12420i iVar2 = (AbstractC12420i) ((List) entry.getValue()).get(0);
            AbstractC12026m.AbstractC12027a b = AbstractC12026m.m7981a().mo7968f(EnumC12033p.DEFAULT).mo7967g(this.f8945f.mo33601a()).mo7966h(this.f8944e.mo33601a()).mo7972b(AbstractC12021k.m8005a().mo8000c(AbstractC12021k.EnumC12023b.ANDROID_FIREBASE).mo8001b(AbstractC11996a.m8040a().mo8009m(Integer.valueOf(iVar2.m6839g("sdk-version"))).mo8012j(iVar2.m6844b("model")).mo8016f(iVar2.m6844b("hardware")).mo8018d(iVar2.m6844b("device")).mo8010l(iVar2.m6844b("product")).mo8011k(iVar2.m6844b("os-uild")).mo8014h(iVar2.m6844b("manufacturer")).mo8017e(iVar2.m6844b("fingerprint")).mo8019c(iVar2.m6844b("country")).mo8015g(iVar2.m6844b("locale")).mo8013i(iVar2.m6844b("mcc_mnc")).mo8020b(iVar2.m6844b("application_build")).mo8021a()).mo8002a());
            try {
                b.m7965i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b.m7964j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC12420i iVar3 : (List) entry.getValue()) {
                C12419h e = iVar3.mo6841e();
                C11572b b2 = e.m6846b();
                if (b2.equals(C11572b.m9324b("proto"))) {
                    j = AbstractC12024l.m7990j(e.m6847a());
                } else if (b2.equals(C11572b.m9324b("json"))) {
                    j = AbstractC12024l.m7991i(new String(e.m6847a(), Charset.forName("UTF-8")));
                } else {
                    C13750a.m2809f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b2);
                }
                j.mo7987c(iVar3.mo6840f()).mo7986d(iVar3.mo6835k()).mo7982h(iVar3.m6838h("tz-offset")).mo7985e(AbstractC12029o.m7960a().mo7955c(AbstractC12029o.EnumC12032c.m7952a(iVar3.m6839g("net-type"))).mo7956b(AbstractC12029o.EnumC12031b.m7954a(iVar3.m6839g("mobile-subtype"))).mo7957a());
                if (iVar3.mo6842d() != null) {
                    j.mo7988b(iVar3.mo6842d());
                }
                arrayList3.add(j.mo7989a());
            }
            b.mo7971c(arrayList3);
            arrayList2.add(b.mo7973a());
        }
        return AbstractC12020j.m8008a(arrayList2);
    }

    /* renamed from: j */
    private static TelephonyManager m30572j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: k */
    static long m30571k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ C5142a m30570l(C5142a aVar, C5143b bVar) {
        URL url = bVar.f8951b;
        if (url == null) {
            return null;
        }
        C13750a.m2814a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.m30567a(bVar.f8951b);
    }

    /* renamed from: m */
    private static InputStream m30569m(InputStream inputStream, String str) {
        if ("gzip".equals(str)) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    /* renamed from: n */
    private static URL m30568n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    @Override // p335s6.AbstractC12803m
    /* renamed from: a */
    public AbstractC12420i mo5449a(AbstractC12420i iVar) {
        NetworkInfo activeNetworkInfo = this.f8941b.getActiveNetworkInfo();
        return iVar.m6834l().m6833a("sdk-version", Build.VERSION.SDK_INT).m6831c("model", Build.MODEL).m6831c("hardware", Build.HARDWARE).m6831c("device", Build.DEVICE).m6831c("product", Build.PRODUCT).m6831c("os-uild", Build.ID).m6831c("manufacturer", Build.MANUFACTURER).m6831c("fingerprint", Build.FINGERPRINT).m6832b("tz-offset", m30571k()).m6833a("net-type", m30575g(activeNetworkInfo)).m6833a("mobile-subtype", m30576f(activeNetworkInfo)).m6831c("country", Locale.getDefault().getCountry()).m6831c("locale", Locale.getDefault().getLanguage()).m6831c("mcc_mnc", m30572j(this.f8942c).getSimOperator()).m6831c("application_build", Integer.toString(m30574h(this.f8942c))).mo6830d();
    }

    @Override // p335s6.AbstractC12803m
    /* renamed from: b */
    public AbstractC12795g mo5448b(AbstractC12793f fVar) {
        AbstractC12020j i = m30573i(fVar);
        URL url = this.f8943d;
        String str = null;
        if (fVar.mo5476c() != null) {
            try {
                C5138a c = C5138a.m30582c(fVar.mo5476c());
                if (c.m30581d() != null) {
                    str = c.m30581d();
                }
                if (c.m30580e() != null) {
                    url = m30568n(c.m30580e());
                }
            } catch (IllegalArgumentException unused) {
                return AbstractC12795g.m5472a();
            }
        }
        try {
            C5143b bVar = (C5143b) C13939b.m2232a(5, new C5142a(url, i, str), new AbstractC13938a() { // from class: com.google.android.datatransport.cct.b
                @Override // p417x6.AbstractC13938a
                public final Object apply(Object obj) {
                    C5141d.C5143b e;
                    e = C5141d.this.m30577e((C5141d.C5142a) obj);
                    return e;
                }
            }, new AbstractC13940c() { // from class: com.google.android.datatransport.cct.c
                @Override // p417x6.AbstractC13940c
                /* renamed from: a */
                public final Object mo2231a(Object obj, Object obj2) {
                    C5141d.C5142a l;
                    l = C5141d.m30570l((C5141d.C5142a) obj, (C5141d.C5143b) obj2);
                    return l;
                }
            });
            int i2 = bVar.f8950a;
            if (i2 == 200) {
                return AbstractC12795g.m5468e(bVar.f8952c);
            }
            if (i2 < 500 && i2 != 404) {
                if (i2 == 400) {
                    return AbstractC12795g.m5469d();
                }
                return AbstractC12795g.m5472a();
            }
            return AbstractC12795g.m5467f();
        } catch (IOException e) {
            C13750a.m2812c("CctTransportBackend", "Could not make request to the backend", e);
            return AbstractC12795g.m5467f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5141d(Context context, AbstractC3770a aVar, AbstractC3770a aVar2) {
        this(context, aVar, aVar2, 40000);
    }
}
