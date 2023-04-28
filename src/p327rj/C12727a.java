package p327rj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okio.Buffer;
import p326ri.C12719v;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\u001a\f\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0000H\u0002\u001a\"\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002\u001a0\u0010\r\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0002¨\u0006\u000f"}, m15073d2 = {"", "e", "", "a", "input", "", "pos", "limit", "Ljava/net/InetAddress;", "c", "", "address", "addressOffset", "b", "d", "okhttp"}, m15072k = 2, m15071mv = {1, 4, 0})
/* renamed from: rj.a */
/* loaded from: classes8.dex */
public final class C12727a {
    /* renamed from: a */
    private static final boolean m5648a(String str) {
        int Y;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (C9971q.m14631i(charAt, 31) <= 0 || C9971q.m14631i(charAt, 127) >= 0) {
                return true;
            }
            Y = C12719v.m5687Y(" #%/:?@[\\]", charAt, 0, false, 6, null);
            if (Y != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static final boolean m5647b(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (C9971q.m14631i(charAt, 48) < 0 || C9971q.m14631i(charAt, 57) > 0) {
                    break;
                } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i5++;
                }
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        if (i4 == i3 + 4) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
        if (r13 == 16) goto L_0x00aa;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
        if (r14 != (-1)) goto L_0x009c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009b, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009c, code lost:
        r0 = r13 - r14;
        java.lang.System.arraycopy(r9, r14, r9, 16 - r0, r0);
        java.util.Arrays.fill(r9, r14, (16 - r13) + r14, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ae, code lost:
        return java.net.InetAddress.getByAddress(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.net.InetAddress m5646c(java.lang.String r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 175
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p327rj.C12727a.m5646c(java.lang.String, int, int):java.net.InetAddress");
    }

    /* renamed from: d */
    private static final String m5645d(byte[] bArr) {
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        Buffer buffer = new Buffer();
        while (i2 < bArr.length) {
            if (i2 == i) {
                buffer.writeByte(58);
                i2 += i4;
                if (i2 == 16) {
                    buffer.writeByte(58);
                }
            } else {
                if (i2 > 0) {
                    buffer.writeByte(58);
                }
                buffer.mo9745n0((C12729c.m5616b(bArr[i2], 255) << 8) | C12729c.m5616b(bArr[i2 + 1], 255));
                i2 += 2;
            }
        }
        return buffer.mo9726s0();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d A[RETURN] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String m5644e(java.lang.String r5) {
        /*
            java.lang.String r0 = "$this$toCanonicalHost"
            kotlin.jvm.internal.C9971q.m14633g(r5, r0)
            java.lang.String r0 = ":"
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r0 = p326ri.C12707l.m5807M(r5, r0, r1, r2, r3)
            r4 = 1
            if (r0 == 0) goto L_0x006e
            java.lang.String r0 = "["
            boolean r0 = p326ri.C12707l.m5813H(r5, r0, r1, r2, r3)
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = "]"
            boolean r0 = p326ri.C12707l.m5772s(r5, r0, r1, r2, r3)
            if (r0 == 0) goto L_0x002b
            int r0 = r5.length()
            int r0 = r0 - r4
            java.net.InetAddress r0 = m5646c(r5, r4, r0)
            goto L_0x0033
        L_0x002b:
            int r0 = r5.length()
            java.net.InetAddress r0 = m5646c(r5, r1, r0)
        L_0x0033:
            if (r0 == 0) goto L_0x006d
            byte[] r1 = r0.getAddress()
            int r2 = r1.length
            r3 = 16
            if (r2 != r3) goto L_0x0048
            java.lang.String r5 = "address"
            kotlin.jvm.internal.C9971q.m14634f(r1, r5)
            java.lang.String r5 = m5645d(r1)
            return r5
        L_0x0048:
            int r1 = r1.length
            r2 = 4
            if (r1 != r2) goto L_0x0051
            java.lang.String r5 = r0.getHostAddress()
            return r5
        L_0x0051:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid IPv6 address: '"
            r1.append(r2)
            r1.append(r5)
            r5 = 39
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L_0x006d:
            return r3
        L_0x006e:
            java.lang.String r5 = java.net.IDN.toASCII(r5)     // Catch: IllegalArgumentException -> 0x00a4
            java.lang.String r0 = "IDN.toASCII(host)"
            kotlin.jvm.internal.C9971q.m14634f(r5, r0)     // Catch: IllegalArgumentException -> 0x00a4
            java.util.Locale r0 = java.util.Locale.US     // Catch: IllegalArgumentException -> 0x00a4
            java.lang.String r2 = "Locale.US"
            kotlin.jvm.internal.C9971q.m14634f(r0, r2)     // Catch: IllegalArgumentException -> 0x00a4
            if (r5 == 0) goto L_0x009c
            java.lang.String r5 = r5.toLowerCase(r0)     // Catch: IllegalArgumentException -> 0x00a4
            java.lang.String r0 = "(this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.C9971q.m14634f(r5, r0)     // Catch: IllegalArgumentException -> 0x00a4
            int r0 = r5.length()     // Catch: IllegalArgumentException -> 0x00a4
            if (r0 != 0) goto L_0x0090
            r1 = r4
        L_0x0090:
            if (r1 == 0) goto L_0x0093
            return r3
        L_0x0093:
            boolean r0 = m5648a(r5)     // Catch: IllegalArgumentException -> 0x00a4
            if (r0 == 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r3 = r5
        L_0x009b:
            return r3
        L_0x009c:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch: IllegalArgumentException -> 0x00a4
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r5.<init>(r0)     // Catch: IllegalArgumentException -> 0x00a4
            throw r5     // Catch: IllegalArgumentException -> 0x00a4
        L_0x00a4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p327rj.C12727a.m5644e(java.lang.String):java.lang.String");
    }
}
