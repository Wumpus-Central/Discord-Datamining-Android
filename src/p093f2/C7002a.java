package p093f2;

import android.net.Uri;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;
import org.json.JSONException;
import org.json.JSONObject;
import p074e2.AbstractC6608c0;
import p074e2.C6607c;
import p074e2.C6619g;
import p074e2.C6629i1;
import p074e2.C6639l;
import p074e2.C6697z0;
import p074e2.EnumC6603b;
import p074e2.EnumC6618f1;
import p093f2.AbstractC7003b;
import p093f2.C7006d;
import p112g2.AbstractC7404f;
import p112g2.C7397d;

/* renamed from: f2.a */
/* loaded from: classes.dex */
public class C7002a implements AbstractC7003b {

    /* renamed from: a */
    private String f15270a;

    /* renamed from: b */
    private String f15271b;

    /* renamed from: c */
    private String f15272c;

    /* renamed from: d */
    private String f15273d;

    /* renamed from: g */
    private C7005c f15276g;

    /* renamed from: e */
    private AbstractC6608c0 f15274e = C6639l.m24863j();

    /* renamed from: f */
    private AbstractC7404f f15275f = new C7397d("ActivityPackageSender");

    /* renamed from: h */
    private C7006d.AbstractC0215d f15277h = C6639l.m24865h();

    /* renamed from: i */
    private C7006d.AbstractC7009c f15278i = C6639l.m24867f();

    /* renamed from: f2.a$a */
    /* loaded from: classes.dex */
    class RunnableC0214a implements Runnable {

        /* renamed from: k */
        final /* synthetic */ AbstractC7003b.AbstractC7004a f15279k;

        /* renamed from: l */
        final /* synthetic */ C6607c f15280l;

        /* renamed from: m */
        final /* synthetic */ Map f15281m;

        RunnableC0214a(AbstractC7003b.AbstractC7004a aVar, C6607c cVar, Map map) {
            this.f15279k = aVar;
            this.f15280l = cVar;
            this.f15281m = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15279k.mo23674f(C7002a.this.mo23676a(this.f15280l, this.f15281m));
        }
    }

    public C7002a(String str, String str2, String str3, String str4, String str5) {
        this.f15270a = str2;
        this.f15271b = str3;
        this.f15272c = str4;
        this.f15273d = str5;
        this.f15276g = new C7005c(C6639l.m24868e(), C6639l.m24866g(), C6639l.m24856q(), str);
    }

    /* renamed from: A */
    private void m23702A(C6697z0 z0Var) {
        boolean z;
        String str;
        boolean z2;
        DataOutputStream dataOutputStream = null;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                C6607c cVar = z0Var.f14252m;
                                HashMap hashMap = new HashMap(cVar.m25116m());
                                Map<String, String> map = z0Var.f14253n;
                                String c = m23700c(hashMap, cVar.m25128a());
                                boolean z3 = true;
                                if (z0Var.f14252m.m25128a() == EnumC6603b.ATTRIBUTION) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    m23692k(hashMap);
                                    str = m23686q(cVar.m25128a(), cVar.m25114o(), hashMap, map);
                                } else {
                                    str = m23685r(cVar.m25128a(), cVar.m25114o());
                                }
                                HttpsURLConnection a = this.f15277h.mo23660a(new URL(str));
                                this.f15278i.mo23661a(a, cVar.m25123f());
                                if (c != null) {
                                    a.setRequestProperty("Authorization", c);
                                }
                                if (z) {
                                    dataOutputStream = m23697f(a);
                                } else {
                                    m23692k(hashMap);
                                    dataOutputStream = m23696g(a, hashMap, map);
                                }
                                Integer x = m23679x(a, z0Var);
                                if (z0Var.f14245f == null || z0Var.f14250k != null || x == null || x.intValue() != 200) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                z0Var.f14240a = z2;
                                if (z0Var.f14245f != null && z0Var.f14250k == null) {
                                    z3 = false;
                                }
                                z0Var.f14241b = z3;
                                if (dataOutputStream != null) {
                                    try {
                                        dataOutputStream.flush();
                                        dataOutputStream.close();
                                    } catch (IOException e) {
                                        this.f15274e.mo24885b(m23695h(e, "Flushing and closing connection output stream", z0Var.f14252m), new Object[0]);
                                    }
                                }
                            } catch (UnsupportedEncodingException e2) {
                                m23681v(e2, "Failed to encode parameters", z0Var);
                                if (dataOutputStream != null) {
                                    try {
                                        dataOutputStream.flush();
                                        dataOutputStream.close();
                                    } catch (IOException e3) {
                                        this.f15274e.mo24885b(m23695h(e3, "Flushing and closing connection output stream", z0Var.f14252m), new Object[0]);
                                    }
                                }
                            }
                        } catch (SSLHandshakeException e4) {
                            m23678y(e4, "Certificate failed", z0Var);
                            if (dataOutputStream != null) {
                                try {
                                    dataOutputStream.flush();
                                    dataOutputStream.close();
                                } catch (IOException e5) {
                                    this.f15274e.mo24885b(m23695h(e5, "Flushing and closing connection output stream", z0Var.f14252m), new Object[0]);
                                }
                            }
                        }
                    } catch (SocketTimeoutException e6) {
                        m23678y(e6, "Request timed out", z0Var);
                        if (dataOutputStream != null) {
                            try {
                                dataOutputStream.flush();
                                dataOutputStream.close();
                            } catch (IOException e7) {
                                this.f15274e.mo24885b(m23695h(e7, "Flushing and closing connection output stream", z0Var.f14252m), new Object[0]);
                            }
                        }
                    }
                } catch (ProtocolException e8) {
                    m23681v(e8, "Protocol Error", z0Var);
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                        } catch (IOException e9) {
                            this.f15274e.mo24885b(m23695h(e9, "Flushing and closing connection output stream", z0Var.f14252m), new Object[0]);
                        }
                    }
                }
            } catch (MalformedURLException e10) {
                m23681v(e10, "Malformed URL", z0Var);
                if (dataOutputStream != null) {
                    try {
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } catch (IOException e11) {
                        this.f15274e.mo24885b(m23695h(e11, "Flushing and closing connection output stream", z0Var.f14252m), new Object[0]);
                    }
                }
            } catch (IOException e12) {
                m23678y(e12, "Request failed", z0Var);
                if (dataOutputStream != null) {
                    try {
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } catch (IOException e13) {
                        this.f15274e.mo24885b(m23695h(e13, "Flushing and closing connection output stream", z0Var.f14252m), new Object[0]);
                    }
                }
            }
        }
    }

    /* renamed from: B */
    private String m23701B(EnumC6603b bVar, String str) {
        if (bVar == EnumC6603b.GDPR) {
            if (this.f15271b == null) {
                return str;
            }
            return str + this.f15271b;
        } else if (bVar == EnumC6603b.SUBSCRIPTION) {
            if (this.f15272c == null) {
                return str;
            }
            return str + this.f15272c;
        } else if (this.f15270a == null) {
            return str;
        } else {
            return str + this.f15270a;
        }
    }

    /* renamed from: c */
    private String m23700c(Map<String, String> map, EnumC6603b bVar) {
        String bVar2 = bVar.toString();
        String n = m23689n(map);
        String e = m23698e(m23688o(map), n, m23691l(map), m23694i(map), m23690m(map));
        if (e != null) {
            return e;
        }
        return m23699d(map, m23693j(map), n, bVar2);
    }

    /* renamed from: d */
    private String m23699d(Map<String, String> map, String str, String str2, String str3) {
        if (str == null || str.length() == 0) {
            return null;
        }
        Map<String, String> s = m23684s(map, str3, str);
        String l = C6629i1.m24906l("Signature %s,%s,%s,%s", C6629i1.m24906l("secret_id=\"%s\"", str2), C6629i1.m24906l("signature=\"%s\"", C6629i1.m24912g0(s.get("clear_signature"))), C6629i1.m24906l("algorithm=\"%s\"", "sha256"), C6629i1.m24906l("headers=\"%s\"", s.get("fields")));
        this.f15274e.mo24880g("authorizationHeader: %s", l);
        return l;
    }

    /* renamed from: e */
    private String m23698e(String str, String str2, String str3, String str4, String str5) {
        if (str2 == null || str == null || str3 == null) {
            return null;
        }
        String l = C6629i1.m24906l("signature=\"%s\"", str);
        String l2 = C6629i1.m24906l("secret_id=\"%s\"", str2);
        String l3 = C6629i1.m24906l("headers_id=\"%s\"", str3);
        Object[] objArr = new Object[1];
        if (str4 == null) {
            str4 = "adj1";
        }
        objArr[0] = str4;
        String l4 = C6629i1.m24906l("algorithm=\"%s\"", objArr);
        Object[] objArr2 = new Object[1];
        if (str5 == null) {
            str5 = "";
        }
        objArr2[0] = str5;
        String l5 = C6629i1.m24906l("Signature %s,%s,%s,%s,%s", l, l2, l4, l3, C6629i1.m24906l("native_version=\"%s\"", objArr2));
        this.f15274e.mo24880g("authorizationHeader: %s", l5);
        return l5;
    }

    /* renamed from: f */
    private DataOutputStream m23697f(HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setRequestMethod("GET");
        return null;
    }

    /* renamed from: g */
    private DataOutputStream m23696g(HttpsURLConnection httpsURLConnection, Map<String, String> map, Map<String, String> map2) {
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setUseCaches(false);
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        String p = m23687p(map, map2);
        if (p == null) {
            return null;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.writeBytes(p);
        return dataOutputStream;
    }

    /* renamed from: h */
    private String m23695h(Throwable th2, String str, C6607c cVar) {
        return C6629i1.m24906l("%s. (%s)", cVar.m25121h(), C6629i1.m24950B(str, th2));
    }

    /* renamed from: i */
    private static String m23694i(Map<String, String> map) {
        return map.remove("algorithm");
    }

    /* renamed from: j */
    private static String m23693j(Map<String, String> map) {
        return map.remove("app_secret");
    }

    /* renamed from: k */
    private static void m23692k(Map<String, String> map) {
        map.remove("event_callback_id");
    }

    /* renamed from: l */
    private static String m23691l(Map<String, String> map) {
        return map.remove("headers_id");
    }

    /* renamed from: m */
    private static String m23690m(Map<String, String> map) {
        return map.remove("native_version");
    }

    /* renamed from: n */
    private static String m23689n(Map<String, String> map) {
        return map.remove("secret_id");
    }

    /* renamed from: o */
    private static String m23688o(Map<String, String> map) {
        return map.remove("signature");
    }

    /* renamed from: p */
    private String m23687p(Map<String, String> map, Map<String, String> map2) {
        if (map.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        m23682u(map, sb2);
        m23682u(map2, sb2);
        if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == '&') {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString();
    }

    /* renamed from: q */
    private String m23686q(EnumC6603b bVar, String str, Map<String, String> map, Map<String, String> map2) {
        URL url = new URL(m23701B(bVar, this.f15276g.m23668f(bVar)));
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(url.getProtocol());
        builder.encodedAuthority(url.getAuthority());
        builder.path(url.getPath());
        builder.appendPath(str);
        this.f15274e.mo24884c("Making request to url: %s", builder.toString());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builder.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                builder.appendQueryParameter(entry2.getKey(), entry2.getValue());
            }
        }
        return builder.build().toString();
    }

    /* renamed from: r */
    private String m23685r(EnumC6603b bVar, String str) {
        String l = C6629i1.m24906l("%s%s", m23701B(bVar, this.f15276g.m23668f(bVar)), str);
        this.f15274e.mo24884c("Making request to url : %s", l);
        return l;
    }

    /* renamed from: s */
    private Map<String, String> m23684s(Map<String, String> map, String str, String str2) {
        String t = m23683t(map);
        String str3 = map.get("source");
        String str4 = map.get("payload");
        HashMap hashMap = new HashMap();
        hashMap.put("app_secret", str2);
        hashMap.put("created_at", map.get("created_at"));
        hashMap.put("activity_kind", str);
        hashMap.put(t, map.get(t));
        if (str3 != null) {
            hashMap.put("source", str3);
        }
        if (str4 != null) {
            hashMap.put("payload", str4);
        }
        String str5 = "";
        String str6 = str5;
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getValue() != null) {
                str5 = str5 + ((String) entry.getKey()) + " ";
                str6 = str6 + ((String) entry.getValue());
            }
        }
        String substring = str5.substring(0, str5.length() - 1);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("clear_signature", str6);
        hashMap2.put("fields", substring);
        return hashMap2;
    }

    /* renamed from: t */
    private String m23683t(Map<String, String> map) {
        if (map.get("gps_adid") != null) {
            return "gps_adid";
        }
        if (map.get("fire_adid") != null) {
            return "fire_adid";
        }
        if (map.get("android_id") != null) {
            return "android_id";
        }
        if (map.get("mac_sha1") != null) {
            return "mac_sha1";
        }
        if (map.get("mac_md5") != null) {
            return "mac_md5";
        }
        if (map.get("android_uuid") != null) {
            return "android_uuid";
        }
        return null;
    }

    /* renamed from: u */
    private void m23682u(Map<String, String> map, StringBuilder sb2) {
        String str;
        if (!(map == null || map.isEmpty())) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String encode = URLEncoder.encode(entry.getKey(), "UTF-8");
                String value = entry.getValue();
                if (value != null) {
                    str = URLEncoder.encode(value, "UTF-8");
                } else {
                    str = "";
                }
                sb2.append(encode);
                sb2.append("=");
                sb2.append(str);
                sb2.append("&");
            }
        }
    }

    /* renamed from: v */
    private void m23681v(Throwable th2, String str, C6697z0 z0Var) {
        String h = m23695h(th2, str, z0Var.f14252m);
        this.f15274e.mo24885b(h, new Object[0]);
        z0Var.f14243d = h;
        z0Var.f14241b = false;
    }

    /* renamed from: w */
    private void m23680w(C6697z0 z0Var, String str) {
        JSONObject jSONObject;
        if (str.length() == 0) {
            this.f15274e.mo24885b("Empty response string", new Object[0]);
            return;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            this.f15274e.mo24885b(m23695h(e, "Failed to parse JSON response", z0Var.f14252m), new Object[0]);
            jSONObject = null;
        }
        if (jSONObject != null) {
            z0Var.f14245f = jSONObject;
            z0Var.f14243d = C7006d.m23663e(jSONObject, "message");
            z0Var.f14242c = C7006d.m23663e(jSONObject, "adid");
            z0Var.f14244e = C7006d.m23663e(jSONObject, "timestamp");
            String e2 = C7006d.m23663e(jSONObject, "tracking_state");
            if (e2 != null && e2.equals("opted_out")) {
                z0Var.f14247h = EnumC6618f1.OPTED_OUT;
            }
            z0Var.f14249j = C7006d.m23664d(jSONObject, "ask_in");
            z0Var.f14250k = C7006d.m23664d(jSONObject, "retry_in");
            z0Var.f14251l = C7006d.m23664d(jSONObject, "continue_in");
            z0Var.f14248i = C6619g.m25013a(jSONObject.optJSONObject("attribution"), z0Var.f14242c, C6629i1.m24947E(this.f15273d));
        }
    }

    /* renamed from: y */
    private void m23678y(Throwable th2, String str, C6697z0 z0Var) {
        String str2 = m23695h(th2, str, z0Var.f14252m) + " Will retry later";
        this.f15274e.mo24885b(str2, new Object[0]);
        z0Var.f14243d = str2;
        z0Var.f14241b = true;
    }

    /* renamed from: z */
    private boolean m23677z(C6697z0 z0Var) {
        if (!z0Var.f14241b) {
            this.f15274e.mo24884c("Will not retry with current url strategy", new Object[0]);
            this.f15276g.m23671c();
            return false;
        } else if (this.f15276g.m23670d(z0Var.f14246g)) {
            this.f15274e.mo24885b("Failed with current url strategy, but it will retry with new", new Object[0]);
            return true;
        } else {
            this.f15274e.mo24885b("Failed with current url strategy and it will not retry", new Object[0]);
            return false;
        }
    }

    @Override // p093f2.AbstractC7003b
    /* renamed from: a */
    public C6697z0 mo23676a(C6607c cVar, Map<String, String> map) {
        C6697z0 a;
        do {
            a = C6697z0.m24619a(cVar, map);
            m23702A(a);
        } while (m23677z(a));
        return a;
    }

    @Override // p093f2.AbstractC7003b
    /* renamed from: b */
    public void mo23675b(C6607c cVar, Map<String, String> map, AbstractC7003b.AbstractC7004a aVar) {
        this.f15275f.submit(new RunnableC0214a(aVar, cVar, map));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r7 == null) goto L_0x0050;
     */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.Integer m23679x(javax.net.ssl.HttpsURLConnection r7, p074e2.C6697z0 r8) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = 0
            r7.connect()     // Catch: all -> 0x003b, IOException -> 0x003d
            int r3 = r7.getResponseCode()     // Catch: all -> 0x003b, IOException -> 0x003d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch: all -> 0x003b, IOException -> 0x003d
            int r3 = r2.intValue()     // Catch: all -> 0x003b, IOException -> 0x003d
            r4 = 400(0x190, float:5.6E-43)
            if (r3 < r4) goto L_0x001f
            java.io.InputStream r3 = r7.getErrorStream()     // Catch: all -> 0x003b, IOException -> 0x003d
            goto L_0x0023
        L_0x001f:
            java.io.InputStream r3 = r7.getInputStream()     // Catch: all -> 0x003b, IOException -> 0x003d
        L_0x0023:
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: all -> 0x003b, IOException -> 0x003d
            r4.<init>(r3)     // Catch: all -> 0x003b, IOException -> 0x003d
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: all -> 0x003b, IOException -> 0x003d
            r3.<init>(r4)     // Catch: all -> 0x003b, IOException -> 0x003d
        L_0x002d:
            java.lang.String r4 = r3.readLine()     // Catch: all -> 0x003b, IOException -> 0x003d
            if (r4 == 0) goto L_0x0037
            r0.append(r4)     // Catch: all -> 0x003b, IOException -> 0x003d
            goto L_0x002d
        L_0x0037:
            r7.disconnect()
            goto L_0x0050
        L_0x003b:
            r8 = move-exception
            goto L_0x00a8
        L_0x003d:
            r3 = move-exception
            java.lang.String r4 = "Connecting and reading response"
            e2.c r5 = r8.f14252m     // Catch: all -> 0x003b
            java.lang.String r3 = r6.m23695h(r3, r4, r5)     // Catch: all -> 0x003b
            e2.c0 r4 = r6.f15274e     // Catch: all -> 0x003b
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: all -> 0x003b
            r4.mo24885b(r3, r5)     // Catch: all -> 0x003b
            if (r7 == 0) goto L_0x0050
            goto L_0x0037
        L_0x0050:
            int r7 = r0.length()
            if (r7 != 0) goto L_0x0060
            e2.c0 r7 = r6.f15274e
            java.lang.String r8 = "Empty response string buffer"
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r7.mo24885b(r8, r0)
            return r2
        L_0x0060:
            int r7 = r2.intValue()
            r3 = 429(0x1ad, float:6.01E-43)
            if (r7 != r3) goto L_0x0072
            e2.c0 r7 = r6.f15274e
            java.lang.String r8 = "Too frequent requests to the endpoint (429)"
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r7.mo24885b(r8, r0)
            return r2
        L_0x0072:
            java.lang.String r7 = r0.toString()
            e2.c0 r0 = r6.f15274e
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r1] = r7
            java.lang.String r5 = "Response string: %s"
            r0.mo24884c(r5, r4)
            r6.m23680w(r8, r7)
            java.lang.String r7 = r8.f14243d
            if (r7 != 0) goto L_0x008a
            return r2
        L_0x008a:
            int r8 = r2.intValue()
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.String r4 = "Response message: %s"
            if (r8 != r0) goto L_0x009e
            e2.c0 r8 = r6.f15274e
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r1] = r7
            r8.mo24879h(r4, r0)
            goto L_0x00a7
        L_0x009e:
            e2.c0 r8 = r6.f15274e
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r1] = r7
            r8.mo24885b(r4, r0)
        L_0x00a7:
            return r2
        L_0x00a8:
            if (r7 == 0) goto L_0x00ad
            r7.disconnect()
        L_0x00ad:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p093f2.C7002a.m23679x(javax.net.ssl.HttpsURLConnection, e2.z0):java.lang.Integer");
    }
}
