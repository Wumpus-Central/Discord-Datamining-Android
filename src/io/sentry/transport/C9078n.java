package io.sentry.transport;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import io.sentry.AbstractC8869g0;
import io.sentry.C8951o3;
import io.sentry.C9025q2;
import io.sentry.C9155y1;
import io.sentry.EnumC8942n3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.transport.n */
/* loaded from: classes8.dex */
public final class C9078n {

    /* renamed from: e */
    private static final Charset f19928e = Charset.forName("UTF-8");

    /* renamed from: a */
    private final Proxy f19929a;

    /* renamed from: b */
    private final C9155y1 f19930b;

    /* renamed from: c */
    private final C8951o3 f19931c;

    /* renamed from: d */
    private final C9090y f19932d;

    public C9078n(C8951o3 o3Var, C9155y1 y1Var, C9090y yVar) {
        this(o3Var, y1Var, C9076l.m17128a(), yVar);
    }

    /* renamed from: a */
    private void m17125a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } catch (Throwable th2) {
            httpURLConnection.disconnect();
            throw th2;
        }
        httpURLConnection.disconnect();
    }

    /* renamed from: b */
    private HttpURLConnection m17124b() {
        HttpURLConnection e = m17121e();
        for (Map.Entry<String, String> entry : this.f19930b.m16773a().entrySet()) {
            e.setRequestProperty(entry.getKey(), entry.getValue());
        }
        e.setRequestMethod("POST");
        e.setDoOutput(true);
        e.setRequestProperty("Content-Encoding", "gzip");
        e.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        e.setRequestProperty("Accept", "application/json");
        e.setRequestProperty("Connection", "close");
        e.setConnectTimeout(this.f19931c.getConnectionTimeoutMillis());
        e.setReadTimeout(this.f19931c.getReadTimeoutMillis());
        HostnameVerifier hostnameVerifier = this.f19931c.getHostnameVerifier();
        boolean z = e instanceof HttpsURLConnection;
        if (z && hostnameVerifier != null) {
            ((HttpsURLConnection) e).setHostnameVerifier(hostnameVerifier);
        }
        SSLSocketFactory sslSocketFactory = this.f19931c.getSslSocketFactory();
        if (z && sslSocketFactory != null) {
            ((HttpsURLConnection) e).setSSLSocketFactory(sslSocketFactory);
        }
        e.connect();
        return e;
    }

    /* renamed from: c */
    private String m17123c(HttpURLConnection httpURLConnection) {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f19928e));
            try {
                StringBuilder sb2 = new StringBuilder();
                boolean z = true;
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (!z) {
                        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    }
                    sb2.append(readLine);
                    z = false;
                }
                String sb3 = sb2.toString();
                bufferedReader.close();
                if (errorStream != null) {
                    errorStream.close();
                }
                return sb3;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }

    /* renamed from: d */
    private boolean m17122d(int i) {
        return i == 200;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: f */
    private AbstractC9059a0 m17120f(HttpURLConnection httpURLConnection) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                m17117i(httpURLConnection, responseCode);
                if (!m17122d(responseCode)) {
                    AbstractC8869g0 logger = this.f19931c.getLogger();
                    EnumC8942n3 n3Var = EnumC8942n3.ERROR;
                    logger.mo17722c(n3Var, "Request failed, API returned %s", Integer.valueOf(responseCode));
                    if (this.f19931c.isDebug()) {
                        this.f19931c.getLogger().mo17722c(n3Var, m17123c(httpURLConnection), new Object[0]);
                    }
                    AbstractC9059a0 b = AbstractC9059a0.m17160b(responseCode);
                    m17125a(httpURLConnection);
                    return b;
                }
                this.f19931c.getLogger().mo17722c(EnumC8942n3.DEBUG, "Envelope sent successfully.", new Object[0]);
                AbstractC9059a0 e = AbstractC9059a0.m17159e();
                m17125a(httpURLConnection);
                return e;
            } catch (IOException e2) {
                this.f19931c.getLogger().mo17724a(EnumC8942n3.ERROR, e2, "Error reading and logging the response stream", new Object[0]);
                m17125a(httpURLConnection);
                return AbstractC9059a0.m17161a();
            }
        } catch (Throwable th2) {
            m17125a(httpURLConnection);
            throw th2;
        }
    }

    /* renamed from: g */
    private Proxy m17119g(C8951o3.C8956e eVar) {
        if (eVar != null) {
            String c = eVar.m17556c();
            String a = eVar.m17558a();
            if (!(c == null || a == null)) {
                try {
                    return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(a, Integer.parseInt(c)));
                } catch (NumberFormatException e) {
                    AbstractC8869g0 logger = this.f19931c.getLogger();
                    EnumC8942n3 n3Var = EnumC8942n3.ERROR;
                    logger.mo17724a(n3Var, e, "Failed to parse Sentry Proxy port: " + eVar.m17556c() + ". Proxy is ignored", new Object[0]);
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    HttpURLConnection m17121e() {
        URLConnection uRLConnection;
        if (this.f19929a == null) {
            uRLConnection = this.f19930b.m16772b().openConnection();
        } else {
            uRLConnection = this.f19930b.m16772b().openConnection(this.f19929a);
        }
        return (HttpURLConnection) uRLConnection;
    }

    /* renamed from: h */
    public AbstractC9059a0 m17118h(C9025q2 q2Var) {
        HttpURLConnection b;
        OutputStream outputStream;
        GZIPOutputStream gZIPOutputStream;
        try {
            outputStream = m17124b().getOutputStream();
            gZIPOutputStream = new GZIPOutputStream(outputStream);
        } finally {
            try {
                return m17120f(b);
            } finally {
            }
        }
        try {
            this.f19931c.getSerializer().mo17606b(q2Var, gZIPOutputStream);
            gZIPOutputStream.close();
            if (outputStream != null) {
                outputStream.close();
            }
            return m17120f(b);
        } catch (Throwable th2) {
            try {
                gZIPOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: i */
    public void m17117i(HttpURLConnection httpURLConnection, int i) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        this.f19932d.m17095k(httpURLConnection.getHeaderField("X-Sentry-Rate-Limits"), headerField, i);
    }

    C9078n(C8951o3 o3Var, C9155y1 y1Var, C9076l lVar, C9090y yVar) {
        this.f19930b = y1Var;
        this.f19931c = o3Var;
        this.f19932d = yVar;
        Proxy g = m17119g(o3Var.getProxy());
        this.f19929a = g;
        if (g != null && o3Var.getProxy() != null) {
            String d = o3Var.getProxy().m17555d();
            String b = o3Var.getProxy().m17557b();
            if (d != null && b != null) {
                lVar.m17127b(new C9085u(d, b));
            }
        }
    }
}
