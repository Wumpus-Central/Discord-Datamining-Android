package p409wj;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okio.Buffer;
import okio.ByteString;
import p015ak.C1457k;
import p307qj.C12222f;
import p307qj.C12231k;
import p326ri.C12718u;
import p327rj.C12729c;

@Metadata(m15074d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\n\u001a\u00020\t*\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\u0006H\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u001a\u0010\u0016\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000\u001a\n\u0010\u0018\u001a\u00020\u000b*\u00020\u0017\"\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001a\"\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001a¨\u0006\u001d"}, m15073d2 = {"Lokhttp3/Headers;", "", "headerName", "", "Lqj/f;", "a", "Lokio/Buffer;", "", "result", "", "c", "", "g", "", "prefix", "h", "d", "e", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "headers", "f", "Lokhttp3/Response;", "b", "Lokio/ByteString;", "Lokio/ByteString;", "QUOTED_STRING_DELIMITERS", "TOKEN_DELIMITERS", "okhttp"}, m15072k = 2, m15071mv = {1, 4, 0})
/* renamed from: wj.e */
/* loaded from: classes8.dex */
public final class C13896e {

    /* renamed from: a */
    private static final ByteString f31326a;

    /* renamed from: b */
    private static final ByteString f31327b;

    static {
        ByteString.C11437a aVar = ByteString.f25542o;
        f31326a = aVar.m9690d("\"\\");
        f31327b = aVar.m9690d("\t ,=");
    }

    /* renamed from: a */
    public static final List<C12222f> m2373a(Headers parseChallenges, String headerName) {
        boolean t;
        C9971q.m14633g(parseChallenges, "$this$parseChallenges");
        C9971q.m14633g(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = parseChallenges.size();
        for (int i = 0; i < size; i++) {
            t = C12718u.m5732t(headerName, parseChallenges.m10071b(i), true);
            if (t) {
                try {
                    m2371c(new Buffer().mo9750J(parseChallenges.m10067j(i)), arrayList);
                } catch (EOFException e) {
                    C1457k.f517c.m41079g().m41091k("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final boolean m2372b(Response promisesBody) {
        boolean t;
        C9971q.m14633g(promisesBody, "$this$promisesBody");
        if (C9971q.m14638b(promisesBody.m9844b0().m9881h(), "HEAD")) {
            return false;
        }
        int l = promisesBody.m9839l();
        if (((l >= 100 && l < 200) || l == 204 || l == 304) && C12729c.m5599s(promisesBody) == -1) {
            t = C12718u.m5732t("chunked", Response.m9834t(promisesBody, "Transfer-Encoding", null, 2, null), true);
            if (!t) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0085, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0085, code lost:
        continue;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void m2371c(okio.Buffer r7, java.util.List<p307qj.C12222f> r8) {
        /*
            r0 = 0
        L_0x0001:
            r1 = r0
        L_0x0002:
            if (r1 != 0) goto L_0x000e
            m2367g(r7)
            java.lang.String r1 = m2369e(r7)
            if (r1 != 0) goto L_0x000e
            return
        L_0x000e:
            boolean r2 = m2367g(r7)
            java.lang.String r3 = m2369e(r7)
            if (r3 != 0) goto L_0x002c
            boolean r7 = r7.mo9731h0()
            if (r7 != 0) goto L_0x001f
            return
        L_0x001f:
            qj.f r7 = new qj.f
            java.util.Map r0 = p267of.C11286s.m10268h()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L_0x002c:
            r4 = 61
            byte r4 = (byte) r4
            int r5 = p327rj.C12729c.m5634I(r7, r4)
            boolean r6 = m2367g(r7)
            if (r2 != 0) goto L_0x0068
            if (r6 != 0) goto L_0x0041
            boolean r2 = r7.mo9731h0()
            if (r2 == 0) goto L_0x0068
        L_0x0041:
            qj.f r2 = new qj.f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = p326ri.C12707l.m5763z(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "Collections.singletonMap…ek + \"=\".repeat(eqCount))"
            kotlin.jvm.internal.C9971q.m14634f(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L_0x0001
        L_0x0068:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = p327rj.C12729c.m5634I(r7, r4)
            int r5 = r5 + r6
        L_0x0072:
            if (r3 != 0) goto L_0x0083
            java.lang.String r3 = m2369e(r7)
            boolean r5 = m2367g(r7)
            if (r5 == 0) goto L_0x007f
            goto L_0x0085
        L_0x007f:
            int r5 = p327rj.C12729c.m5634I(r7, r4)
        L_0x0083:
            if (r5 != 0) goto L_0x0090
        L_0x0085:
            qj.f r4 = new qj.f
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L_0x0002
        L_0x0090:
            r6 = 1
            if (r5 <= r6) goto L_0x0094
            return
        L_0x0094:
            boolean r6 = m2367g(r7)
            if (r6 == 0) goto L_0x009b
            return
        L_0x009b:
            r6 = 34
            byte r6 = (byte) r6
            boolean r6 = m2366h(r7, r6)
            if (r6 == 0) goto L_0x00a9
            java.lang.String r6 = m2370d(r7)
            goto L_0x00ad
        L_0x00a9:
            java.lang.String r6 = m2369e(r7)
        L_0x00ad:
            if (r6 == 0) goto L_0x00c7
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x00b8
            return
        L_0x00b8:
            boolean r3 = m2367g(r7)
            if (r3 != 0) goto L_0x00c5
            boolean r3 = r7.mo9731h0()
            if (r3 != 0) goto L_0x00c5
            return
        L_0x00c5:
            r3 = r0
            goto L_0x0072
        L_0x00c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p409wj.C13896e.m2371c(okio.Buffer, java.util.List):void");
    }

    /* renamed from: d */
    private static final String m2370d(Buffer buffer) {
        boolean z;
        byte b = (byte) 34;
        if (buffer.readByte() == b) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Buffer buffer2 = new Buffer();
            while (true) {
                long A = buffer.mo9742A(f31326a);
                if (A == -1) {
                    return null;
                }
                if (buffer.m9792C(A) == b) {
                    buffer2.mo392K(buffer, A);
                    buffer.readByte();
                    return buffer2.mo9726s0();
                } else if (buffer.size() == A + 1) {
                    return null;
                } else {
                    buffer2.mo392K(buffer, A);
                    buffer.readByte();
                    buffer2.mo392K(buffer, 1L);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: e */
    private static final String m2369e(Buffer buffer) {
        long A = buffer.mo9742A(f31327b);
        if (A == -1) {
            A = buffer.size();
        }
        if (A != 0) {
            return buffer.m9756z0(A);
        }
        return null;
    }

    /* renamed from: f */
    public static final void m2368f(CookieJar receiveHeaders, HttpUrl url, Headers headers) {
        C9971q.m14633g(receiveHeaders, "$this$receiveHeaders");
        C9971q.m14633g(url, "url");
        C9971q.m14633g(headers, "headers");
        if (receiveHeaders != CookieJar.f25367a) {
            List<C12231k> e = C12231k.f27520n.m7314e(url, headers);
            if (!e.isEmpty()) {
                receiveHeaders.saveFromResponse(url, e);
            }
        }
    }

    /* renamed from: g */
    private static final boolean m2367g(Buffer buffer) {
        boolean z = false;
        while (!buffer.mo9731h0()) {
            byte C = buffer.m9792C(0L);
            if (C == 9 || C == 32) {
                buffer.readByte();
            } else if (C != 44) {
                break;
            } else {
                buffer.readByte();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: h */
    private static final boolean m2366h(Buffer buffer, byte b) {
        return !buffer.mo9731h0() && buffer.m9792C(0L) == b;
    }
}
