package okhttp3.internal.publicsuffix;

import fk.C7361i;
import fk.C7366m;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9905i;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import okio.BufferedSource;
import p015ak.C1457k;
import p306qi.C12200o;
import p326ri.C12719v;
import p327rj.C12729c;

@Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u0014¨\u0006\u001a"}, m15073d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "", "domain", "", "f", "domainLabels", "b", "", "e", "d", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/CountDownLatch;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "", "[B", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "<init>", "()V", "h", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* loaded from: classes8.dex */
public final class PublicSuffixDatabase {

    /* renamed from: f */
    private static final List<String> f25523f;

    /* renamed from: a */
    private final AtomicBoolean f25526a = new AtomicBoolean(false);

    /* renamed from: b */
    private final CountDownLatch f25527b = new CountDownLatch(1);

    /* renamed from: c */
    private byte[] f25528c;

    /* renamed from: d */
    private byte[] f25529d;

    /* renamed from: h */
    public static final C11433a f25525h = new C11433a(null);

    /* renamed from: e */
    private static final byte[] f25522e = {(byte) 42};

    /* renamed from: g */
    private static final PublicSuffixDatabase f25524g = new PublicSuffixDatabase();

    @Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m15073d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$a;", "", "", "", "labels", "", "labelIndex", "", "b", "([B[[BI)Ljava/lang/String;", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "c", "", "EXCEPTION_MARKER", "C", "", "PREVAILING_RULE", "Ljava/util/List;", "PUBLIC_SUFFIX_RESOURCE", "Ljava/lang/String;", "WILDCARD_LABEL", "[B", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a */
    /* loaded from: classes8.dex */
    public static final class C11433a {
        private C11433a() {
        }

        public /* synthetic */ C11433a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final String m9794b(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int i3;
            int b;
            int length = bArr.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = (i4 + length) / 2;
                while (i5 > -1 && bArr[i5] != ((byte) 10)) {
                    i5--;
                }
                int i6 = i5 + 1;
                int i7 = 1;
                while (true) {
                    i2 = i6 + i7;
                    if (bArr[i2] == ((byte) 10)) {
                        break;
                    }
                    i7++;
                }
                int i8 = i2 - i6;
                int i9 = i;
                boolean z2 = false;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (z2) {
                        i3 = 46;
                        z = false;
                    } else {
                        z = z2;
                        i3 = C12729c.m5616b(bArr2[i9][i10], 255);
                    }
                    b = i3 - C12729c.m5616b(bArr[i6 + i11], 255);
                    if (b != 0) {
                        break;
                    }
                    i11++;
                    i10++;
                    if (i11 == i8) {
                        break;
                    } else if (bArr2[i9].length != i10) {
                        z2 = z;
                    } else if (i9 == bArr2.length - 1) {
                        break;
                    } else {
                        i9++;
                        i10 = -1;
                        z2 = true;
                    }
                }
                if (b >= 0) {
                    if (b <= 0) {
                        int i12 = i8 - i11;
                        int length2 = bArr2[i9].length - i10;
                        int length3 = bArr2.length;
                        for (int i13 = i9 + 1; i13 < length3; i13++) {
                            length2 += bArr2[i13].length;
                        }
                        if (length2 >= i12) {
                            if (length2 <= i12) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                C9971q.m14634f(UTF_8, "UTF_8");
                                return new String(bArr, i6, i8, UTF_8);
                            }
                        }
                    }
                    i4 = i2 + 1;
                }
                length = i6 - 1;
            }
            return null;
        }

        /* renamed from: c */
        public final PublicSuffixDatabase m9793c() {
            return PublicSuffixDatabase.f25524g;
        }
    }

    static {
        List<String> d;
        d = C9905i.m14825d("*");
        f25523f = d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e5, code lost:
        r4 = p326ri.C12719v.m5661y0(r8, new char[]{'.'}, false, 0, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fc, code lost:
        r1 = p326ri.C12719v.m5661y0(r5, new char[]{'.'}, false, 0, 6, null);
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<java.lang.String> m9800b(java.util.List<java.lang.String> r18) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.m9800b(java.util.List):java.util.List");
    }

    /* renamed from: d */
    private final void m9798d() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream != null) {
            BufferedSource d = C7366m.m22819d(new C7361i(C7366m.m22811l(resourceAsStream)));
            try {
                byte[] V = d.mo9736V(d.readInt());
                byte[] V2 = d.mo9736V(d.readInt());
                Unit unit = Unit.f22042a;
                th = null;
                synchronized (this) {
                    C9971q.m14636d(V);
                    this.f25528c = V;
                    C9971q.m14636d(V2);
                    this.f25529d = V2;
                }
                this.f25527b.countDown();
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
    }

    /* renamed from: e */
    private final void m9797e() {
        boolean z = false;
        while (true) {
            try {
                try {
                    m9798d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    C1457k.f517c.m41079g().m41091k("Failed to read public suffix list", 5, e);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th2) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: f */
    private final List<String> m9796f(String str) {
        List<String> y0;
        Object g0;
        List<String> P;
        y0 = C12719v.m5661y0(str, new char[]{'.'}, false, 0, 6, null);
        g0 = C9914r.m14758g0(y0);
        if (!C9971q.m14638b((String) g0, "")) {
            return y0;
        }
        P = C9914r.m14775P(y0, 1);
        return P;
    }

    /* renamed from: c */
    public final String m9799c(String domain) {
        int i;
        int i2;
        Sequence K;
        Sequence o;
        String w;
        C9971q.m14633g(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        C9971q.m14634f(unicodeDomain, "unicodeDomain");
        List<String> f = m9796f(unicodeDomain);
        List<String> b = m9800b(f);
        if (f.size() == b.size() && b.get(0).charAt(0) != '!') {
            return null;
        }
        if (b.get(0).charAt(0) == '!') {
            i2 = f.size();
            i = b.size();
        } else {
            i2 = f.size();
            i = b.size() + 1;
        }
        K = C9914r.m14782K(m9796f(domain));
        o = C12200o.m7430o(K, i2 - i);
        w = C12200o.m7422w(o, ".", null, null, 0, null, null, 62, null);
        return w;
    }
}
