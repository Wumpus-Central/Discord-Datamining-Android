package p089ek;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;
import p326ri.C12717t;
import p326ri.C12718u;
import p326ri.C12719v;
import p327rj.C12729c;

@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0004BG\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000b¨\u0006\u001b"}, m15073d2 = {"Lek/e;", "", "", "clientOriginated", "a", "", "toString", "", "hashCode", "other", "equals", "Z", "perMessageDeflate", "b", "Ljava/lang/Integer;", "clientMaxWindowBits", "c", "clientNoContextTakeover", "d", "serverMaxWindowBits", "e", "serverNoContextTakeover", "f", "unknownValues", "<init>", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V", "g", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: ek.e */
/* loaded from: classes8.dex */
public final class C6961e {

    /* renamed from: g */
    public static final C6962a f15172g = new C6962a(null);

    /* renamed from: a */
    public final boolean f15173a;

    /* renamed from: b */
    public final Integer f15174b;

    /* renamed from: c */
    public final boolean f15175c;

    /* renamed from: d */
    public final Integer f15176d;

    /* renamed from: e */
    public final boolean f15177e;

    /* renamed from: f */
    public final boolean f15178f;

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m15073d2 = {"Lek/e$a;", "", "Lokhttp3/Headers;", "responseHeaders", "Lek/e;", "a", "", "HEADER_WEB_SOCKET_EXTENSION", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: ek.e$a */
    /* loaded from: classes8.dex */
    public static final class C6962a {
        private C6962a() {
        }

        public /* synthetic */ C6962a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C6961e m23828a(Headers responseHeaders) {
            boolean t;
            boolean t2;
            String str;
            boolean t3;
            boolean t4;
            boolean t5;
            boolean t6;
            Integer m;
            Integer m2;
            C9971q.m14633g(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            boolean z = false;
            Integer num = null;
            boolean z2 = false;
            Integer num2 = null;
            boolean z3 = false;
            boolean z4 = false;
            for (int i = 0; i < size; i++) {
                t = C12718u.m5732t(responseHeaders.m10071b(i), "Sec-WebSocket-Extensions", true);
                if (t) {
                    String j = responseHeaders.m10067j(i);
                    int i2 = 0;
                    while (i2 < j.length()) {
                        int o = C12729c.m5603o(j, ',', i2, 0, 4, null);
                        int m3 = C12729c.m5605m(j, ';', i2, o);
                        String V = C12729c.m5621V(j, i2, m3);
                        int i3 = m3 + 1;
                        t2 = C12718u.m5732t(V, "permessage-deflate", true);
                        if (t2) {
                            if (z) {
                                z4 = true;
                            }
                            while (i3 < o) {
                                int m4 = C12729c.m5605m(j, ';', i3, o);
                                int m5 = C12729c.m5605m(j, '=', i3, m4);
                                String V2 = C12729c.m5621V(j, i3, m5);
                                if (m5 < m4) {
                                    str = C12719v.m5668r0(C12729c.m5621V(j, m5 + 1, m4), "\"");
                                } else {
                                    str = null;
                                }
                                int i4 = m4 + 1;
                                t3 = C12718u.m5732t(V2, "client_max_window_bits", true);
                                if (t3) {
                                    if (num != null) {
                                        z4 = true;
                                    }
                                    if (str != null) {
                                        m2 = C12717t.m5747m(str);
                                        num = m2;
                                    } else {
                                        num = null;
                                    }
                                    if (num != null) {
                                        i3 = i4;
                                    }
                                    z4 = true;
                                    i3 = i4;
                                } else {
                                    t4 = C12718u.m5732t(V2, "client_no_context_takeover", true);
                                    if (t4) {
                                        if (z2) {
                                            z4 = true;
                                        }
                                        if (str != null) {
                                            z4 = true;
                                        }
                                        z2 = true;
                                    } else {
                                        t5 = C12718u.m5732t(V2, "server_max_window_bits", true);
                                        if (t5) {
                                            if (num2 != null) {
                                                z4 = true;
                                            }
                                            if (str != null) {
                                                m = C12717t.m5747m(str);
                                                num2 = m;
                                            } else {
                                                num2 = null;
                                            }
                                            if (num2 != null) {
                                            }
                                            z4 = true;
                                        } else {
                                            t6 = C12718u.m5732t(V2, "server_no_context_takeover", true);
                                            if (t6) {
                                                if (z3) {
                                                    z4 = true;
                                                }
                                                if (str != null) {
                                                    z4 = true;
                                                }
                                                z3 = true;
                                            }
                                            z4 = true;
                                        }
                                    }
                                    i3 = i4;
                                }
                            }
                            i2 = i3;
                            z = true;
                        } else {
                            i2 = i3;
                            z4 = true;
                        }
                    }
                }
            }
            return new C6961e(z, num, z2, num2, z3, z4);
        }
    }

    public C6961e() {
        this(false, null, false, null, false, false, 63, null);
    }

    public C6961e(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        this.f15173a = z;
        this.f15174b = num;
        this.f15175c = z2;
        this.f15176d = num2;
        this.f15177e = z3;
        this.f15178f = z4;
    }

    /* renamed from: a */
    public final boolean m23829a(boolean z) {
        if (z) {
            return this.f15175c;
        }
        return this.f15177e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6961e)) {
            return false;
        }
        C6961e eVar = (C6961e) obj;
        return this.f15173a == eVar.f15173a && C9971q.m14638b(this.f15174b, eVar.f15174b) && this.f15175c == eVar.f15175c && C9971q.m14638b(this.f15176d, eVar.f15176d) && this.f15177e == eVar.f15177e && this.f15178f == eVar.f15178f;
    }

    public int hashCode() {
        boolean z = this.f15173a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        Integer num = this.f15174b;
        int i6 = 0;
        int hashCode = (i5 + (num != null ? num.hashCode() : 0)) * 31;
        boolean z2 = this.f15175c;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (hashCode + i7) * 31;
        Integer num2 = this.f15176d;
        if (num2 != null) {
            i6 = num2.hashCode();
        }
        int i11 = (i10 + i6) * 31;
        boolean z3 = this.f15177e;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (i11 + i12) * 31;
        boolean z4 = this.f15178f;
        if (!z4) {
            i = z4 ? 1 : 0;
        }
        return i15 + i;
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f15173a + ", clientMaxWindowBits=" + this.f15174b + ", clientNoContextTakeover=" + this.f15175c + ", serverMaxWindowBits=" + this.f15176d + ", serverNoContextTakeover=" + this.f15177e + ", unknownValues=" + this.f15178f + ")";
    }

    public /* synthetic */ C6961e(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z2, (i & 8) == 0 ? num2 : null, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4);
    }
}
