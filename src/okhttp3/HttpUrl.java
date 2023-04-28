package okhttp3;

import eg.C6884j;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9907k;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.C9986a;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import okio.Buffer;
import p326ri.C12718u;
import p326ri.C12719v;
import p327rj.C12727a;
import p327rj.C12729c;

@Metadata(m15074d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\b\u0013\u0018\u0000 =2\u00020\u0001:\u0002\u0015\u001aBc\b\u0000\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\u0006\u0010 \u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020\b\u0012\u0006\u0010%\u001a\u00020\b\u0012\u0006\u0010*\u001a\u00020\u0012\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0+\u0012\u0010\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010+\u0012\b\u00101\u001a\u0004\u0018\u00010\b\u0012\u0006\u00102\u001a\u00020\b¢\u0006\u0004\b;\u0010<J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\bJ\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016R\u0017\u0010\u0019\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010 \u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010\"\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u0017\u0010%\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u0017\u0010*\u001a\u00020\u00128\u0007¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0+8\u0007¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001e\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010-R\u0019\u00101\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b1\u0010\u001dR\u0014\u00102\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0011\u00103\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b,\u0010\u001dR\u0011\u00104\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u00105\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\b0+8G¢\u0006\u0006\u001a\u0004\b#\u0010/R\u0013\u00107\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b&\u0010\u001dR\u0013\u00109\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b8\u0010\u001dR\u0013\u0010:\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001d¨\u0006>"}, m15073d2 = {"Lokhttp3/HttpUrl;", "", "Ljava/net/URL;", "s", "()Ljava/net/URL;", "Ljava/net/URI;", "r", "()Ljava/net/URI;", "", "o", "link", "p", "Lokhttp3/HttpUrl$a;", "j", "k", "other", "", "equals", "", "hashCode", "toString", "a", "Z", "i", "()Z", "isHttps", "b", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "scheme", "c", "username", "d", "password", "e", "h", "host", "f", "I", "m", "()I", "port", "", "g", "Ljava/util/List;", "pathSegments", "()Ljava/util/List;", "queryNamesAndValues", "fragment", "url", "encodedUsername", "encodedPassword", "encodedPath", "encodedPathSegments", "encodedQuery", "n", "query", "encodedFragment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "l", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* loaded from: classes8.dex */
public final class HttpUrl {

    /* renamed from: a */
    private final boolean f25381a;

    /* renamed from: b */
    private final String f25382b;

    /* renamed from: c */
    private final String f25383c;

    /* renamed from: d */
    private final String f25384d;

    /* renamed from: e */
    private final String f25385e;

    /* renamed from: f */
    private final int f25386f;

    /* renamed from: g */
    private final List<String> f25387g;

    /* renamed from: h */
    private final List<String> f25388h;

    /* renamed from: i */
    private final String f25389i;

    /* renamed from: j */
    private final String f25390j;

    /* renamed from: l */
    public static final C11421b f25380l = new C11421b(null);

    /* renamed from: k */
    private static final char[] f25379k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    @Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010!\n\u0002\b\r\u0018\u0000 \u00172\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\bD\u0010EJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J0\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0002J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004J\u000f\u0010\u001e\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010!\u001a\u00020 J\b\u0010\"\u001a\u00020\u0004H\u0016J!\u0010$\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010 2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b$\u0010%R$\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010-\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010&\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*R\"\u00100\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010&\u001a\u0004\b.\u0010(\"\u0004\b/\u0010*R$\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010&\u001a\u0004\b2\u0010(\"\u0004\b3\u0010*R\"\u0010\u001a\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R \u0010<\u001a\b\u0012\u0004\u0012\u00020\u0004098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b1\u0010;R,\u0010@\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010:\u001a\u0004\b=\u0010;\"\u0004\b>\u0010?R$\u0010C\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010&\u001a\u0004\bA\u0010(\"\u0004\bB\u0010*¨\u0006F"}, m15073d2 = {"Lokhttp3/HttpUrl$a;", "", "", "b", "", "input", "startPos", "limit", "", "n", "pos", "", "addTrailingSlash", "alreadyEncoded", "l", "f", "g", "j", "scheme", "o", "username", "v", "password", "i", "host", "e", "port", "k", "encodedQuery", "c", "m", "()Lokhttp3/HttpUrl$a;", "Lokhttp3/HttpUrl;", "a", "toString", "base", "h", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/HttpUrl$a;", "Ljava/lang/String;", "getScheme$okhttp", "()Ljava/lang/String;", "u", "(Ljava/lang/String;)V", "getEncodedUsername$okhttp", "r", "encodedUsername", "getEncodedPassword$okhttp", "q", "encodedPassword", "d", "getHost$okhttp", "s", "I", "getPort$okhttp", "()I", "t", "(I)V", "", "Ljava/util/List;", "()Ljava/util/List;", "encodedPathSegments", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "encodedQueryNamesAndValues", "getEncodedFragment$okhttp", "p", "encodedFragment", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: okhttp3.HttpUrl$a */
    /* loaded from: classes8.dex */
    public static final class C11420a {

        /* renamed from: i */
        public static final C0364a f25391i = new C0364a(null);

        /* renamed from: a */
        private String f25392a;

        /* renamed from: d */
        private String f25395d;

        /* renamed from: f */
        private final List<String> f25397f;

        /* renamed from: g */
        private List<String> f25398g;

        /* renamed from: h */
        private String f25399h;

        /* renamed from: b */
        private String f25393b = "";

        /* renamed from: c */
        private String f25394c = "";

        /* renamed from: e */
        private int f25396e = -1;

        @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u001c\u0010\b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002R\u0014\u0010\u000b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m15073d2 = {"Lokhttp3/HttpUrl$a$a;", "", "", "input", "", "pos", "limit", "g", "h", "f", "e", "INVALID_HOST", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
        /* renamed from: okhttp3.HttpUrl$a$a */
        /* loaded from: classes8.dex */
        public static final class C0364a {
            private C0364a() {
            }

            public /* synthetic */ C0364a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public final int m10004e(String str, int i, int i2) {
                try {
                    int parseInt = Integer.parseInt(C11421b.m9999b(HttpUrl.f25380l, str, i, i2, "", false, false, false, false, null, 248, null));
                    if (1 <= parseInt && 65535 >= parseInt) {
                        return parseInt;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: f */
            public final int m10003f(String str, int i, int i2) {
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt == ':') {
                        return i;
                    }
                    if (charAt == '[') {
                        do {
                            i++;
                            if (i < i2) {
                            }
                        } while (str.charAt(i) != ']');
                    }
                    i++;
                }
                return i2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: g */
            public final int m10002g(String str, int i, int i2) {
                if (i2 - i < 2) {
                    return -1;
                }
                char charAt = str.charAt(i);
                if ((C9971q.m14631i(charAt, 97) < 0 || C9971q.m14631i(charAt, 122) > 0) && (C9971q.m14631i(charAt, 65) < 0 || C9971q.m14631i(charAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i++;
                    if (i >= i2) {
                        return -1;
                    }
                    char charAt2 = str.charAt(i);
                    if ('a' > charAt2 || 'z' < charAt2) {
                        if ('A' > charAt2 || 'Z' < charAt2) {
                            if ('0' > charAt2 || '9' < charAt2) {
                                if (!(charAt2 == '+' || charAt2 == '-' || charAt2 == '.')) {
                                    if (charAt2 == ':') {
                                        return i;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: h */
            public final int m10001h(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i3++;
                    i++;
                }
                return i3;
            }
        }

        public C11420a() {
            ArrayList arrayList = new ArrayList();
            this.f25397f = arrayList;
            arrayList.add("");
        }

        /* renamed from: b */
        private final int m10029b() {
            int i = this.f25396e;
            if (i != -1) {
                return i;
            }
            C11421b bVar = HttpUrl.f25380l;
            String str = this.f25392a;
            C9971q.m14636d(str);
            return bVar.m9998c(str);
        }

        /* renamed from: f */
        private final boolean m10025f(String str) {
            boolean t;
            if (C9971q.m14638b(str, ".")) {
                return true;
            }
            t = C12718u.m5732t(str, "%2e", true);
            if (t) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        private final boolean m10024g(String str) {
            boolean t;
            boolean t2;
            boolean t3;
            if (C9971q.m14638b(str, "..")) {
                return true;
            }
            t = C12718u.m5732t(str, "%2e.", true);
            if (t) {
                return true;
            }
            t2 = C12718u.m5732t(str, ".%2e", true);
            if (t2) {
                return true;
            }
            t3 = C12718u.m5732t(str, "%2e%2e", true);
            if (t3) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        private final void m10021j() {
            boolean z;
            List<String> list = this.f25397f;
            if (list.remove(list.size() - 1).length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !(!this.f25397f.isEmpty())) {
                this.f25397f.add("");
                return;
            }
            List<String> list2 = this.f25397f;
            list2.set(list2.size() - 1, "");
        }

        /* renamed from: l */
        private final void m10019l(String str, int i, int i2, boolean z, boolean z2) {
            boolean z3;
            String b = C11421b.m9999b(HttpUrl.f25380l, str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, false, null, 240, null);
            if (!m10025f(b)) {
                if (m10024g(b)) {
                    m10021j();
                    return;
                }
                List<String> list = this.f25397f;
                if (list.get(list.size() - 1).length() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    List<String> list2 = this.f25397f;
                    list2.set(list2.size() - 1, b);
                } else {
                    this.f25397f.add(b);
                }
                if (z) {
                    this.f25397f.add("");
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0041 -> B:10:0x0029). Please submit an issue!!! */
        /* renamed from: n */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void m10017n(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.f25397f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f25397f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f25397f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = p327rj.C12729c.m5604n(r11, r12, r6, r13)
                if (r12 >= r13) goto L_0x0036
                r0 = r3
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.m10019l(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.C11420a.m10017n(java.lang.String, int, int):void");
        }

        /* renamed from: a */
        public final HttpUrl m10030a() {
            int t;
            ArrayList arrayList;
            String str;
            int t2;
            String str2;
            String str3 = this.f25392a;
            if (str3 != null) {
                C11421b bVar = HttpUrl.f25380l;
                String h = C11421b.m9993h(bVar, this.f25393b, 0, 0, false, 7, null);
                String h2 = C11421b.m9993h(bVar, this.f25394c, 0, 0, false, 7, null);
                String str4 = this.f25395d;
                if (str4 != null) {
                    int b = m10029b();
                    List<String> list = this.f25397f;
                    t = C9907k.m14809t(list, 10);
                    ArrayList arrayList2 = new ArrayList(t);
                    for (String str5 : list) {
                        arrayList2.add(C11421b.m9993h(HttpUrl.f25380l, str5, 0, 0, false, 7, null));
                    }
                    List<String> list2 = this.f25398g;
                    if (list2 != null) {
                        t2 = C9907k.m14809t(list2, 10);
                        arrayList = new ArrayList(t2);
                        for (String str6 : list2) {
                            if (str6 != null) {
                                str2 = C11421b.m9993h(HttpUrl.f25380l, str6, 0, 0, true, 3, null);
                            } else {
                                str2 = null;
                            }
                            arrayList.add(str2);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str7 = this.f25399h;
                    if (str7 != null) {
                        str = C11421b.m9993h(HttpUrl.f25380l, str7, 0, 0, false, 7, null);
                    } else {
                        str = null;
                    }
                    return new HttpUrl(str3, h, h2, str4, b, arrayList2, arrayList, str, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        /* renamed from: c */
        public final C11420a m10028c(String str) {
            List<String> list;
            if (str != null) {
                C11421b bVar = HttpUrl.f25380l;
                String b = C11421b.m9999b(bVar, str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null);
                if (b != null) {
                    list = bVar.m9991j(b);
                    this.f25398g = list;
                    return this;
                }
            }
            list = null;
            this.f25398g = list;
            return this;
        }

        /* renamed from: d */
        public final List<String> m10027d() {
            return this.f25397f;
        }

        /* renamed from: e */
        public final C11420a m10026e(String host) {
            C9971q.m14633g(host, "host");
            String e = C12727a.m5644e(C11421b.m9993h(HttpUrl.f25380l, host, 0, 0, false, 7, null));
            if (e != null) {
                this.f25395d = e;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        /* renamed from: h */
        public final C11420a m10023h(HttpUrl httpUrl, String input) {
            int i;
            int n;
            char c;
            int i2;
            String str;
            boolean z;
            boolean z2;
            int i3;
            boolean z3;
            String str2;
            int i4;
            boolean z4;
            boolean z5;
            boolean E;
            boolean E2;
            C9971q.m14633g(input, "input");
            int x = C12729c.m5594x(input, 0, 0, 3, null);
            int z6 = C12729c.m5592z(input, x, 0, 2, null);
            C0364a aVar = f25391i;
            int g = aVar.m10002g(input, x, z6);
            String str3 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            boolean z7 = true;
            char c2 = 65535;
            if (g != -1) {
                E = C12718u.m5739E(input, "https:", x, true);
                if (E) {
                    this.f25392a = "https";
                    x += 6;
                } else {
                    E2 = C12718u.m5739E(input, "http:", x, true);
                    if (E2) {
                        this.f25392a = "http";
                        x += 5;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String substring = input.substring(0, g);
                        C9971q.m14634f(substring, str3);
                        sb2.append(substring);
                        sb2.append("'");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
            } else if (httpUrl != null) {
                this.f25392a = httpUrl.m10033q();
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int h = aVar.m10001h(input, x, z6);
            char c3 = '?';
            char c4 = '#';
            if (h >= 2 || httpUrl == null || (!C9971q.m14638b(httpUrl.m10033q(), this.f25392a))) {
                int i5 = x + h;
                boolean z8 = false;
                boolean z9 = false;
                while (true) {
                    n = C12729c.m5604n(input, "@/\\?#", i5, z6);
                    if (n != z6) {
                        c = input.charAt(n);
                    } else {
                        c = c2;
                    }
                    if (c == c2 || c == c4 || c == '/' || c == '\\' || c == c3) {
                        break;
                    }
                    if (c != '@') {
                        z3 = z7;
                        str2 = str3;
                        i3 = z6;
                    } else {
                        if (!z8) {
                            int m = C12729c.m5605m(input, ':', i5, n);
                            C11421b bVar = HttpUrl.f25380l;
                            z3 = z7;
                            i3 = z6;
                            String b = C11421b.m9999b(bVar, input, i5, m, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z9) {
                                b = this.f25393b + "%40" + b;
                            }
                            this.f25393b = b;
                            if (m != n) {
                                this.f25394c = C11421b.m9999b(bVar, input, m + 1, n, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z5 = z3;
                            } else {
                                z5 = z8;
                            }
                            z8 = z5;
                            str2 = str3;
                            z4 = z3;
                            i4 = n;
                        } else {
                            z3 = z7;
                            i3 = z6;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f25394c);
                            sb3.append("%40");
                            str2 = str3;
                            i4 = n;
                            sb3.append(C11421b.m9999b(HttpUrl.f25380l, input, i5, n, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f25394c = sb3.toString();
                            z4 = z9;
                        }
                        i5 = i4 + 1;
                        z9 = z4;
                    }
                    str3 = str2;
                    z7 = z3;
                    z6 = i3;
                    c4 = '#';
                    c3 = '?';
                    c2 = 65535;
                }
                i = z6;
                C0364a aVar2 = f25391i;
                int f = aVar2.m10003f(input, i5, n);
                int i6 = f + 1;
                if (i6 < n) {
                    i2 = i5;
                    this.f25395d = C12727a.m5644e(C11421b.m9993h(HttpUrl.f25380l, input, i5, f, false, 4, null));
                    int e = aVar2.m10004e(input, i6, n);
                    this.f25396e = e;
                    if (e != -1) {
                        z2 = z7;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        str = str3;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String substring2 = input.substring(i6, n);
                        C9971q.m14634f(substring2, str3);
                        sb4.append(substring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    i2 = i5;
                    str = str3;
                    C11421b bVar2 = HttpUrl.f25380l;
                    this.f25395d = C12727a.m5644e(C11421b.m9993h(bVar2, input, i2, f, false, 4, null));
                    String str4 = this.f25392a;
                    C9971q.m14636d(str4);
                    this.f25396e = bVar2.m9998c(str4);
                }
                if (this.f25395d != null) {
                    z = z7;
                } else {
                    z = false;
                }
                if (z) {
                    x = n;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String substring3 = input.substring(i2, f);
                    C9971q.m14634f(substring3, str);
                    sb5.append(substring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
            } else {
                this.f25393b = httpUrl.m10043g();
                this.f25394c = httpUrl.m10047c();
                this.f25395d = httpUrl.m10042h();
                this.f25396e = httpUrl.m10037m();
                this.f25397f.clear();
                this.f25397f.addAll(httpUrl.m10045e());
                if (x == z6 || input.charAt(x) == '#') {
                    m10028c(httpUrl.m10044f());
                }
                i = z6;
            }
            int n2 = C12729c.m5604n(input, "?#", x, i);
            m10017n(input, x, n2);
            if (n2 < i && input.charAt(n2) == '?') {
                int m2 = C12729c.m5605m(input, '#', n2, i);
                C11421b bVar3 = HttpUrl.f25380l;
                this.f25398g = bVar3.m9991j(C11421b.m9999b(bVar3, input, n2 + 1, m2, " \"'<>#", true, false, true, false, null, 208, null));
                n2 = m2;
            }
            if (n2 < i && input.charAt(n2) == '#') {
                this.f25399h = C11421b.m9999b(HttpUrl.f25380l, input, n2 + 1, i, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        /* renamed from: i */
        public final C11420a m10022i(String password) {
            C9971q.m14633g(password, "password");
            this.f25394c = C11421b.m9999b(HttpUrl.f25380l, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        /* renamed from: k */
        public final C11420a m10020k(int i) {
            boolean z = true;
            if (1 > i || 65535 < i) {
                z = false;
            }
            if (z) {
                this.f25396e = i;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i).toString());
        }

        /* renamed from: m */
        public final C11420a m10018m() {
            String str;
            String str2;
            String str3 = this.f25395d;
            String str4 = null;
            if (str3 != null) {
                str = new Regex("[\"<>^`{|}]").m14582h(str3, "");
            } else {
                str = null;
            }
            this.f25395d = str;
            int size = this.f25397f.size();
            for (int i = 0; i < size; i++) {
                List<String> list = this.f25397f;
                list.set(i, C11421b.m9999b(HttpUrl.f25380l, list.get(i), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.f25398g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str5 = list2.get(i2);
                    if (str5 != null) {
                        str2 = C11421b.m9999b(HttpUrl.f25380l, str5, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null);
                    } else {
                        str2 = null;
                    }
                    list2.set(i2, str2);
                }
            }
            String str6 = this.f25399h;
            if (str6 != null) {
                str4 = C11421b.m9999b(HttpUrl.f25380l, str6, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null);
            }
            this.f25399h = str4;
            return this;
        }

        /* renamed from: o */
        public final C11420a m10016o(String scheme) {
            boolean t;
            boolean t2;
            C9971q.m14633g(scheme, "scheme");
            t = C12718u.m5732t(scheme, "http", true);
            if (t) {
                this.f25392a = "http";
            } else {
                t2 = C12718u.m5732t(scheme, "https", true);
                if (t2) {
                    this.f25392a = "https";
                } else {
                    throw new IllegalArgumentException("unexpected scheme: " + scheme);
                }
            }
            return this;
        }

        /* renamed from: p */
        public final void m10015p(String str) {
            this.f25399h = str;
        }

        /* renamed from: q */
        public final void m10014q(String str) {
            C9971q.m14633g(str, "<set-?>");
            this.f25394c = str;
        }

        /* renamed from: r */
        public final void m10013r(String str) {
            C9971q.m14633g(str, "<set-?>");
            this.f25393b = str;
        }

        /* renamed from: s */
        public final void m10012s(String str) {
            this.f25395d = str;
        }

        /* renamed from: t */
        public final void m10011t(int i) {
            this.f25396e = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
            if (r1 != false) goto L_0x0035;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0091, code lost:
            if (r1 != r3.m9998c(r2)) goto L_0x0093;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.f25392a
                if (r1 == 0) goto L_0x0012
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L_0x0017
            L_0x0012:
                java.lang.String r1 = "//"
                r0.append(r1)
            L_0x0017:
                java.lang.String r1 = r6.f25393b
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L_0x0023
                r1 = r2
                goto L_0x0024
            L_0x0023:
                r1 = r3
            L_0x0024:
                r4 = 58
                if (r1 != 0) goto L_0x0035
                java.lang.String r1 = r6.f25394c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0032
                r1 = r2
                goto L_0x0033
            L_0x0032:
                r1 = r3
            L_0x0033:
                if (r1 == 0) goto L_0x0053
            L_0x0035:
                java.lang.String r1 = r6.f25393b
                r0.append(r1)
                java.lang.String r1 = r6.f25394c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0043
                goto L_0x0044
            L_0x0043:
                r2 = r3
            L_0x0044:
                if (r2 == 0) goto L_0x004e
                r0.append(r4)
                java.lang.String r1 = r6.f25394c
                r0.append(r1)
            L_0x004e:
                r1 = 64
                r0.append(r1)
            L_0x0053:
                java.lang.String r1 = r6.f25395d
                if (r1 == 0) goto L_0x0077
                kotlin.jvm.internal.C9971q.m14636d(r1)
                r2 = 2
                r5 = 0
                boolean r1 = p326ri.C12707l.m5809L(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L_0x0072
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f25395d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L_0x0077
            L_0x0072:
                java.lang.String r1 = r6.f25395d
                r0.append(r1)
            L_0x0077:
                int r1 = r6.f25396e
                r2 = -1
                if (r1 != r2) goto L_0x0080
                java.lang.String r1 = r6.f25392a
                if (r1 == 0) goto L_0x0099
            L_0x0080:
                int r1 = r6.m10029b()
                java.lang.String r2 = r6.f25392a
                if (r2 == 0) goto L_0x0093
                okhttp3.HttpUrl$b r3 = okhttp3.HttpUrl.f25380l
                kotlin.jvm.internal.C9971q.m14636d(r2)
                int r2 = r3.m9998c(r2)
                if (r1 == r2) goto L_0x0099
            L_0x0093:
                r0.append(r4)
                r0.append(r1)
            L_0x0099:
                okhttp3.HttpUrl$b r1 = okhttp3.HttpUrl.f25380l
                java.util.List<java.lang.String> r2 = r6.f25397f
                r1.m9992i(r2, r0)
                java.util.List<java.lang.String> r2 = r6.f25398g
                if (r2 == 0) goto L_0x00b1
                r2 = 63
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r6.f25398g
                kotlin.jvm.internal.C9971q.m14636d(r2)
                r1.m9990k(r2, r0)
            L_0x00b1:
                java.lang.String r1 = r6.f25399h
                if (r1 == 0) goto L_0x00bf
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f25399h
                r0.append(r1)
            L_0x00bf:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.C9971q.m14634f(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.C11420a.toString():java.lang.String");
        }

        /* renamed from: u */
        public final void m10010u(String str) {
            this.f25392a = str;
        }

        /* renamed from: v */
        public final C11420a m10009v(String username) {
            C9971q.m14633g(username, "username");
            this.f25393b = C11421b.m9999b(HttpUrl.f25380l, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    @Metadata(m15074d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0019\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b8\u00109J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\f\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002JV\u0010\u0014\u001a\u00020\n*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0003H\u0007J%\u0010\u001b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00030\u00172\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00172\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\u001b\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001e*\u00020\u0003H\u0000¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020!*\u00020\u0003H\u0007¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u0004\u0018\u00010!*\u00020\u0003H\u0007¢\u0006\u0004\b$\u0010#J1\u0010%\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b%\u0010&Jc\u0010'\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u0010*R\u0014\u00101\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010*R\u0014\u00102\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b2\u0010*R\u0014\u00103\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b3\u0010*R\u0014\u00104\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b4\u0010*R\u0014\u00105\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b5\u0010*R\u0014\u00106\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b6\u0010*R\u0014\u00107\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b7\u0010*¨\u0006:"}, m15073d2 = {"Lokhttp3/HttpUrl$b;", "", "Lokio/Buffer;", "", "encoded", "", "pos", "limit", "", "plusIsSpace", "", "m", "e", "input", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "l", "scheme", "c", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "i", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "k", "", "j", "(Ljava/lang/String;)Ljava/util/List;", "Lokhttp3/HttpUrl;", "d", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "f", "g", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "a", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: okhttp3.HttpUrl$b */
    /* loaded from: classes8.dex */
    public static final class C11421b {
        private C11421b() {
        }

        public /* synthetic */ C11421b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ String m9999b(C11421b bVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            int i4;
            int i5;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            Charset charset2;
            if ((i3 & 1) != 0) {
                i4 = 0;
            } else {
                i4 = i;
            }
            if ((i3 & 2) != 0) {
                i5 = str.length();
            } else {
                i5 = i2;
            }
            if ((i3 & 8) != 0) {
                z5 = false;
            } else {
                z5 = z;
            }
            if ((i3 & 16) != 0) {
                z6 = false;
            } else {
                z6 = z2;
            }
            if ((i3 & 32) != 0) {
                z7 = false;
            } else {
                z7 = z3;
            }
            if ((i3 & 64) != 0) {
                z8 = false;
            } else {
                z8 = z4;
            }
            if ((i3 & 128) != 0) {
                charset2 = null;
            } else {
                charset2 = charset;
            }
            return bVar.m10000a(str, i4, i5, str2, z5, z6, z7, z8, charset2);
        }

        /* renamed from: e */
        private final boolean m9996e(String str, int i, int i2) {
            int i3 = i + 2;
            if (i3 >= i2 || str.charAt(i) != '%' || C12729c.m5637F(str.charAt(i + 1)) == -1 || C12729c.m5637F(str.charAt(i3)) == -1) {
                return false;
            }
            return true;
        }

        /* renamed from: h */
        public static /* synthetic */ String m9993h(C11421b bVar, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return bVar.m9994g(str, i, i2, z);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0062, code lost:
            if (m9996e(r16, r5, r18) == false) goto L_0x006f;
         */
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void m9989l(okio.Buffer r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            L_0x000b:
                if (r5 >= r2) goto L_0x00c5
                if (r1 == 0) goto L_0x00bc
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L_0x002b
                r8 = 9
                if (r7 == r8) goto L_0x0026
                r8 = 10
                if (r7 == r8) goto L_0x0026
                r8 = 12
                if (r7 == r8) goto L_0x0026
                r8 = 13
                if (r7 == r8) goto L_0x0026
                goto L_0x002b
            L_0x0026:
                r8 = r14
                r12 = r19
                goto L_0x00b5
            L_0x002b:
                r8 = 43
                if (r7 != r8) goto L_0x003c
                if (r22 == 0) goto L_0x003c
                if (r20 == 0) goto L_0x0036
                java.lang.String r8 = "+"
                goto L_0x0038
            L_0x0036:
                java.lang.String r8 = "%2B"
            L_0x0038:
                r15.mo9750J(r8)
                goto L_0x0026
            L_0x003c:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L_0x006c
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L_0x006c
                r8 = 128(0x80, float:1.794E-43)
                if (r7 < r8) goto L_0x004c
                if (r23 == 0) goto L_0x006c
            L_0x004c:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = p326ri.C12707l.m5809L(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L_0x006a
                if (r7 != r9) goto L_0x0065
                if (r20 == 0) goto L_0x006a
                if (r21 == 0) goto L_0x0065
                r8 = r14
                boolean r10 = r14.m9996e(r1, r5, r2)
                if (r10 != 0) goto L_0x0066
                goto L_0x006f
            L_0x0065:
                r8 = r14
            L_0x0066:
                r15.m9769W0(r7)
                goto L_0x00b5
            L_0x006a:
                r8 = r14
                goto L_0x006f
            L_0x006c:
                r8 = r14
                r12 = r19
            L_0x006f:
                if (r6 != 0) goto L_0x0076
                okio.Buffer r6 = new okio.Buffer
                r6.<init>()
            L_0x0076:
                if (r3 == 0) goto L_0x008a
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = kotlin.jvm.internal.C9971q.m14638b(r3, r10)
                if (r10 == 0) goto L_0x0081
                goto L_0x008a
            L_0x0081:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.m9774S0(r1, r5, r10, r3)
                goto L_0x008d
            L_0x008a:
                r6.m9769W0(r7)
            L_0x008d:
                boolean r10 = r6.mo9731h0()
                if (r10 != 0) goto L_0x00b5
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.writeByte(r9)
                char[] r11 = okhttp3.HttpUrl.m10049a()
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.writeByte(r11)
                char[] r11 = okhttp3.HttpUrl.m10049a()
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.writeByte(r10)
                goto L_0x008d
            L_0x00b5:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto L_0x000b
            L_0x00bc:
                r8 = r14
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)
                throw r0
            L_0x00c5:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.C11421b.m9989l(okio.Buffer, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        /* renamed from: m */
        private final void m9988m(Buffer buffer, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                if (str != null) {
                    int codePointAt = str.codePointAt(i);
                    if (codePointAt != 37 || (i3 = i + 2) >= i2) {
                        if (codePointAt == 43 && z) {
                            buffer.writeByte(32);
                            i++;
                        }
                        buffer.m9769W0(codePointAt);
                        i += Character.charCount(codePointAt);
                    } else {
                        int F = C12729c.m5637F(str.charAt(i + 1));
                        int F2 = C12729c.m5637F(str.charAt(i3));
                        if (!(F == -1 || F2 == -1)) {
                            buffer.writeByte((F << 4) + F2);
                            i = Character.charCount(codePointAt) + i3;
                        }
                        buffer.m9769W0(codePointAt);
                        i += Character.charCount(codePointAt);
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }

        /* renamed from: a */
        public final String m10000a(String canonicalize, int i, int i2, String encodeSet, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
            boolean L;
            C9971q.m14633g(canonicalize, "$this$canonicalize");
            C9971q.m14633g(encodeSet, "encodeSet");
            int i3 = i;
            while (i3 < i2) {
                int codePointAt = canonicalize.codePointAt(i3);
                if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z4)) {
                    L = C12719v.m5711L(encodeSet, (char) codePointAt, false, 2, null);
                    if (!L) {
                        if (codePointAt == 37) {
                            if (z) {
                                if (z2) {
                                    if (!m9996e(canonicalize, i3, i2)) {
                                        Buffer buffer = new Buffer();
                                        buffer.mo9749M(canonicalize, i, i3);
                                        m9989l(buffer, canonicalize, i3, i2, encodeSet, z, z2, z3, z4, charset);
                                        return buffer.mo9726s0();
                                    }
                                    if (codePointAt == 43 || !z3) {
                                        i3 += Character.charCount(codePointAt);
                                    } else {
                                        Buffer buffer2 = new Buffer();
                                        buffer2.mo9749M(canonicalize, i, i3);
                                        m9989l(buffer2, canonicalize, i3, i2, encodeSet, z, z2, z3, z4, charset);
                                        return buffer2.mo9726s0();
                                    }
                                }
                            }
                        }
                        if (codePointAt == 43) {
                        }
                        i3 += Character.charCount(codePointAt);
                    }
                }
                Buffer buffer22 = new Buffer();
                buffer22.mo9749M(canonicalize, i, i3);
                m9989l(buffer22, canonicalize, i3, i2, encodeSet, z, z2, z3, z4, charset);
                return buffer22.mo9726s0();
            }
            String substring = canonicalize.substring(i, i2);
            C9971q.m14634f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        /* renamed from: c */
        public final int m9998c(String scheme) {
            C9971q.m14633g(scheme, "scheme");
            int hashCode = scheme.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && scheme.equals("https")) {
                    return 443;
                }
            } else if (scheme.equals("http")) {
                return 80;
            }
            return -1;
        }

        /* renamed from: d */
        public final HttpUrl m9997d(String toHttpUrl) {
            C9971q.m14633g(toHttpUrl, "$this$toHttpUrl");
            return new C11420a().m10023h(null, toHttpUrl).m10030a();
        }

        /* renamed from: f */
        public final HttpUrl m9995f(String toHttpUrlOrNull) {
            C9971q.m14633g(toHttpUrlOrNull, "$this$toHttpUrlOrNull");
            try {
                return m9997d(toHttpUrlOrNull);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: g */
        public final String m9994g(String percentDecode, int i, int i2, boolean z) {
            C9971q.m14633g(percentDecode, "$this$percentDecode");
            for (int i3 = i; i3 < i2; i3++) {
                char charAt = percentDecode.charAt(i3);
                if (charAt == '%' || (charAt == '+' && z)) {
                    Buffer buffer = new Buffer();
                    buffer.mo9749M(percentDecode, i, i3);
                    m9988m(buffer, percentDecode, i3, i2, z);
                    return buffer.mo9726s0();
                }
            }
            String substring = percentDecode.substring(i, i2);
            C9971q.m14634f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        /* renamed from: i */
        public final void m9992i(List<String> toPathString, StringBuilder out) {
            C9971q.m14633g(toPathString, "$this$toPathString");
            C9971q.m14633g(out, "out");
            int size = toPathString.size();
            for (int i = 0; i < size; i++) {
                out.append('/');
                out.append(toPathString.get(i));
            }
        }

        /* renamed from: j */
        public final List<String> m9991j(String toQueryNamesAndValues) {
            int Y;
            int Y2;
            C9971q.m14633g(toQueryNamesAndValues, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= toQueryNamesAndValues.length()) {
                Y = C12719v.m5687Y(toQueryNamesAndValues, '&', i, false, 4, null);
                if (Y == -1) {
                    Y = toQueryNamesAndValues.length();
                }
                Y2 = C12719v.m5687Y(toQueryNamesAndValues, '=', i, false, 4, null);
                if (Y2 == -1 || Y2 > Y) {
                    String substring = toQueryNamesAndValues.substring(i, Y);
                    C9971q.m14634f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add(null);
                } else {
                    String substring2 = toQueryNamesAndValues.substring(i, Y2);
                    C9971q.m14634f(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = toQueryNamesAndValues.substring(Y2 + 1, Y);
                    C9971q.m14634f(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i = Y + 1;
            }
            return arrayList;
        }

        /* renamed from: k */
        public final void m9990k(List<String> toQueryString, StringBuilder out) {
            IntRange q;
            C9986a o;
            C9971q.m14633g(toQueryString, "$this$toQueryString");
            C9971q.m14633g(out, "out");
            q = C6884j.m23947q(0, toQueryString.size());
            o = C6884j.m23949o(q, 2);
            int a = o.m14605a();
            int b = o.m14604b();
            int f = o.m14603f();
            if (f >= 0) {
                if (a > b) {
                    return;
                }
            } else if (a < b) {
                return;
            }
            while (true) {
                String str = toQueryString.get(a);
                String str2 = toQueryString.get(a + 1);
                if (a > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (a != b) {
                    a += f;
                } else {
                    return;
                }
            }
        }
    }

    public HttpUrl(String scheme, String username, String password, String host, int i, List<String> pathSegments, List<String> list, String str, String url) {
        C9971q.m14633g(scheme, "scheme");
        C9971q.m14633g(username, "username");
        C9971q.m14633g(password, "password");
        C9971q.m14633g(host, "host");
        C9971q.m14633g(pathSegments, "pathSegments");
        C9971q.m14633g(url, "url");
        this.f25382b = scheme;
        this.f25383c = username;
        this.f25384d = password;
        this.f25385e = host;
        this.f25386f = i;
        this.f25387g = pathSegments;
        this.f25388h = list;
        this.f25389i = str;
        this.f25390j = url;
        this.f25381a = C9971q.m14638b(scheme, "https");
    }

    /* renamed from: l */
    public static final HttpUrl m10038l(String str) {
        return f25380l.m9995f(str);
    }

    /* renamed from: b */
    public final String m10048b() {
        int Y;
        if (this.f25389i == null) {
            return null;
        }
        Y = C12719v.m5687Y(this.f25390j, '#', 0, false, 6, null);
        int i = Y + 1;
        String str = this.f25390j;
        if (str != null) {
            String substring = str.substring(i);
            C9971q.m14634f(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: c */
    public final String m10047c() {
        boolean z;
        int Y;
        int Y2;
        if (this.f25384d.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        Y = C12719v.m5687Y(this.f25390j, ':', this.f25382b.length() + 3, false, 4, null);
        int i = Y + 1;
        Y2 = C12719v.m5687Y(this.f25390j, '@', 0, false, 6, null);
        String str = this.f25390j;
        if (str != null) {
            String substring = str.substring(i, Y2);
            C9971q.m14634f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: d */
    public final String m10046d() {
        int Y;
        Y = C12719v.m5687Y(this.f25390j, '/', this.f25382b.length() + 3, false, 4, null);
        String str = this.f25390j;
        int n = C12729c.m5604n(str, "?#", Y, str.length());
        String str2 = this.f25390j;
        if (str2 != null) {
            String substring = str2.substring(Y, n);
            C9971q.m14634f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: e */
    public final List<String> m10045e() {
        int Y;
        Y = C12719v.m5687Y(this.f25390j, '/', this.f25382b.length() + 3, false, 4, null);
        String str = this.f25390j;
        int n = C12729c.m5604n(str, "?#", Y, str.length());
        ArrayList arrayList = new ArrayList();
        while (Y < n) {
            int i = Y + 1;
            int m = C12729c.m5605m(this.f25390j, '/', i, n);
            String str2 = this.f25390j;
            if (str2 != null) {
                String substring = str2.substring(i, m);
                C9971q.m14634f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                arrayList.add(substring);
                Y = m;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && C9971q.m14638b(((HttpUrl) obj).f25390j, this.f25390j);
    }

    /* renamed from: f */
    public final String m10044f() {
        int Y;
        if (this.f25388h == null) {
            return null;
        }
        Y = C12719v.m5687Y(this.f25390j, '?', 0, false, 6, null);
        int i = Y + 1;
        String str = this.f25390j;
        int m = C12729c.m5605m(str, '#', i, str.length());
        String str2 = this.f25390j;
        if (str2 != null) {
            String substring = str2.substring(i, m);
            C9971q.m14634f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: g */
    public final String m10043g() {
        boolean z;
        if (this.f25383c.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        int length = this.f25382b.length() + 3;
        String str = this.f25390j;
        int n = C12729c.m5604n(str, ":@", length, str.length());
        String str2 = this.f25390j;
        if (str2 != null) {
            String substring = str2.substring(length, n);
            C9971q.m14634f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: h */
    public final String m10042h() {
        return this.f25385e;
    }

    public int hashCode() {
        return this.f25390j.hashCode();
    }

    /* renamed from: i */
    public final boolean m10041i() {
        return this.f25381a;
    }

    /* renamed from: j */
    public final C11420a m10040j() {
        int i;
        C11420a aVar = new C11420a();
        aVar.m10010u(this.f25382b);
        aVar.m10013r(m10043g());
        aVar.m10014q(m10047c());
        aVar.m10012s(this.f25385e);
        if (this.f25386f != f25380l.m9998c(this.f25382b)) {
            i = this.f25386f;
        } else {
            i = -1;
        }
        aVar.m10011t(i);
        aVar.m10027d().clear();
        aVar.m10027d().addAll(m10045e());
        aVar.m10028c(m10044f());
        aVar.m10015p(m10048b());
        return aVar;
    }

    /* renamed from: k */
    public final C11420a m10039k(String link) {
        C9971q.m14633g(link, "link");
        try {
            return new C11420a().m10023h(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public final int m10037m() {
        return this.f25386f;
    }

    /* renamed from: n */
    public final String m10036n() {
        if (this.f25388h == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f25380l.m9990k(this.f25388h, sb2);
        return sb2.toString();
    }

    /* renamed from: o */
    public final String m10035o() {
        C11420a k = m10039k("/...");
        C9971q.m14636d(k);
        return k.m10009v("").m10022i("").m10030a().toString();
    }

    /* renamed from: p */
    public final HttpUrl m10034p(String link) {
        C9971q.m14633g(link, "link");
        C11420a k = m10039k(link);
        if (k != null) {
            return k.m10030a();
        }
        return null;
    }

    /* renamed from: q */
    public final String m10033q() {
        return this.f25382b;
    }

    /* renamed from: r */
    public final URI m10032r() {
        String aVar = m10040j().m10018m().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").m14582h(aVar, ""));
                C9971q.m14634f(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: s */
    public final URL m10031s() {
        try {
            return new URL(this.f25390j);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return this.f25390j;
    }
}
