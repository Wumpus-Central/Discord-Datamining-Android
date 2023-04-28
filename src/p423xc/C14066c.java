package p423xc;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import ca.C3794a;
import ca.C3800g;
import com.google.android.gms.tasks.C5474b;
import com.google.firebase.installations.C5797d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p321rc.AbstractC12563j;
import p420x9.C14004p;
import p423xc.AbstractC14067d;
import p423xc.AbstractC14071f;
import tc.AbstractC13053b;

/* renamed from: xc.c */
/* loaded from: classes3.dex */
public class C14066c {

    /* renamed from: d */
    private static final Pattern f31748d = Pattern.compile("[0-9]+s");

    /* renamed from: e */
    private static final Charset f31749e = Charset.forName("UTF-8");

    /* renamed from: a */
    private final Context f31750a;

    /* renamed from: b */
    private final AbstractC13053b<AbstractC12563j> f31751b;

    /* renamed from: c */
    private final C14070e f31752c = new C14070e();

    public C14066c(Context context, AbstractC13053b<AbstractC12563j> bVar) {
        this.f31750a = context;
        this.f31751b = bVar;
    }

    /* renamed from: a */
    private static String m1812a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* renamed from: b */
    private static JSONObject m1811b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.1");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    private static JSONObject m1810c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: f */
    private String m1807f() {
        try {
            Context context = this.f31750a;
            byte[] a = C3794a.m33586a(context, context.getPackageName());
            if (a != null) {
                return C3800g.m33571b(a, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f31750a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("ContentValues", "No such package: " + this.f31750a.getPackageName(), e);
            return null;
        }
    }

    /* renamed from: g */
    private URL m1806g(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e) {
            throw new C5797d(e.getMessage(), C5797d.EnumC5798a.UNAVAILABLE);
        }
    }

    /* renamed from: h */
    private static byte[] m1805h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* renamed from: i */
    private static boolean m1804i(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: j */
    private static void m1803j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    /* renamed from: k */
    private static void m1802k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String o = m1798o(httpURLConnection);
        if (!TextUtils.isEmpty(o)) {
            Log.w("Firebase-Installations", o);
            Log.w("Firebase-Installations", m1812a(str, str2, str3));
        }
    }

    /* renamed from: l */
    private HttpURLConnection m1801l(URL url, String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f31750a.getPackageName());
            AbstractC12563j jVar = this.f31751b.get();
            if (jVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) C5474b.m28897a(jVar.mo6550a()));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e);
                } catch (ExecutionException e2) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e2);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", m1807f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new C5797d("Firebase Installations Service is unavailable. Please try again later.", C5797d.EnumC5798a.UNAVAILABLE);
        }
    }

    /* renamed from: m */
    static long m1800m(String str) {
        C14004p.m2059b(f31748d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* renamed from: n */
    private AbstractC14067d m1799n(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f31749e));
        AbstractC14071f.AbstractC14072a a = AbstractC14071f.m1775a();
        AbstractC14067d.AbstractC14068a a2 = AbstractC14067d.m1793a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                a2.mo1782f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a2.mo1785c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a2.mo1784d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a.mo1769c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a.mo1768d(m1800m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a2.mo1786b(a.mo1771a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a2.mo1783e(AbstractC14067d.EnumC14069b.OK).mo1787a();
    }

    /* renamed from: o */
    private static String m1798o(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f31749e));
        try {
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                    sb2.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th2;
        }
    }

    /* renamed from: p */
    private AbstractC14071f m1797p(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f31749e));
        AbstractC14071f.AbstractC14072a a = AbstractC14071f.m1775a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a.mo1769c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a.mo1768d(m1800m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a.mo1770b(AbstractC14071f.EnumC14073b.OK).mo1771a();
    }

    /* renamed from: q */
    private void m1796q(HttpURLConnection httpURLConnection, String str, String str2) {
        m1794s(httpURLConnection, m1805h(m1811b(str, str2)));
    }

    /* renamed from: r */
    private void m1795r(HttpURLConnection httpURLConnection) {
        m1794s(httpURLConnection, m1805h(m1810c()));
    }

    /* renamed from: s */
    private static void m1794s(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    /* renamed from: d */
    public AbstractC14067d m1809d(String str, String str2, String str3, String str4, String str5) {
        int responseCode;
        AbstractC14067d n;
        if (this.f31752c.m1780b()) {
            URL g = m1806g(String.format("projects/%s/installations", str3));
            for (int i = 0; i <= 1; i++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection l = m1801l(g, str);
                try {
                    try {
                        l.setRequestMethod("POST");
                        l.setDoOutput(true);
                        if (str5 != null) {
                            l.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                        }
                        m1796q(l, str2, str4);
                        responseCode = l.getResponseCode();
                        this.f31752c.m1776f(responseCode);
                    } catch (IOException | AssertionError unused) {
                    }
                    if (m1804i(responseCode)) {
                        n = m1799n(l);
                    } else {
                        m1802k(l, str4, str, str3);
                        if (responseCode == 429) {
                            throw new C5797d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C5797d.EnumC5798a.TOO_MANY_REQUESTS);
                        } else if (responseCode < 500 || responseCode >= 600) {
                            m1803j();
                            n = AbstractC14067d.m1793a().mo1783e(AbstractC14067d.EnumC14069b.BAD_CONFIG).mo1787a();
                        } else {
                            l.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    return n;
                } finally {
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            throw new C5797d("Firebase Installations Service is unavailable. Please try again later.", C5797d.EnumC5798a.UNAVAILABLE);
        }
        throw new C5797d("Firebase Installations Service is unavailable. Please try again later.", C5797d.EnumC5798a.UNAVAILABLE);
    }

    /* renamed from: e */
    public AbstractC14071f m1808e(String str, String str2, String str3, String str4) {
        int responseCode;
        AbstractC14071f p;
        if (this.f31752c.m1780b()) {
            URL g = m1806g(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
            for (int i = 0; i <= 1; i++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection l = m1801l(g, str);
                try {
                    try {
                        l.setRequestMethod("POST");
                        l.addRequestProperty("Authorization", "FIS_v2 " + str4);
                        l.setDoOutput(true);
                        m1795r(l);
                        responseCode = l.getResponseCode();
                        this.f31752c.m1776f(responseCode);
                    } finally {
                        l.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                } catch (IOException | AssertionError unused) {
                }
                if (m1804i(responseCode)) {
                    p = m1797p(l);
                } else {
                    m1802k(l, null, str, str3);
                    if (!(responseCode == 401 || responseCode == 404)) {
                        if (responseCode == 429) {
                            throw new C5797d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C5797d.EnumC5798a.TOO_MANY_REQUESTS);
                        } else if (responseCode < 500 || responseCode >= 600) {
                            m1803j();
                            p = AbstractC14071f.m1775a().mo1770b(AbstractC14071f.EnumC14073b.BAD_CONFIG).mo1771a();
                        } else {
                            l.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    p = AbstractC14071f.m1775a().mo1770b(AbstractC14071f.EnumC14073b.AUTH_ERROR).mo1771a();
                }
                return p;
            }
            throw new C5797d("Firebase Installations Service is unavailable. Please try again later.", C5797d.EnumC5798a.UNAVAILABLE);
        }
        throw new C5797d("Firebase Installations Service is unavailable. Please try again later.", C5797d.EnumC5798a.UNAVAILABLE);
    }
}
