package io.sentry.vendor;

import java.io.UnsupportedEncodingException;

/* renamed from: io.sentry.vendor.a */
/* loaded from: classes8.dex */
public class C9121a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.sentry.vendor.a$a */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC0279a {

        /* renamed from: a */
        public byte[] f19992a;

        /* renamed from: b */
        public int f19993b;

        AbstractC0279a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.sentry.vendor.a$b */
    /* loaded from: classes8.dex */
    public static class C9122b extends AbstractC0279a {

        /* renamed from: j */
        private static final byte[] f19994j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: k */
        private static final byte[] f19995k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: c */
        private final byte[] f19996c;

        /* renamed from: d */
        int f19997d;

        /* renamed from: e */
        private int f19998e;

        /* renamed from: f */
        public final boolean f19999f;

        /* renamed from: g */
        public final boolean f20000g;

        /* renamed from: h */
        public final boolean f20001h;

        /* renamed from: i */
        private final byte[] f20002i;

        public C9122b(int i, byte[] bArr) {
            boolean z;
            boolean z2;
            byte[] bArr2;
            int i2;
            this.f19992a = bArr;
            boolean z3 = true;
            if ((i & 1) == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f19999f = z;
            if ((i & 2) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f20000g = z2;
            this.f20001h = (i & 4) == 0 ? false : z3;
            if ((i & 8) == 0) {
                bArr2 = f19994j;
            } else {
                bArr2 = f19995k;
            }
            this.f20002i = bArr2;
            this.f19996c = new byte[2];
            this.f19997d = 0;
            if (z2) {
                i2 = 19;
            } else {
                i2 = -1;
            }
            this.f19998e = i2;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x00e6 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00dd -> B:21:0x008a). Please submit an issue!!! */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m16967a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 478
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.C9121a.C9122b.m16967a(byte[], int, int, boolean):boolean");
        }
    }

    /* renamed from: a */
    public static byte[] m16970a(byte[] bArr, int i) {
        return m16969b(bArr, 0, bArr.length, i);
    }

    /* renamed from: b */
    public static byte[] m16969b(byte[] bArr, int i, int i2, int i3) {
        C9122b bVar = new C9122b(i3, null);
        int i4 = (i2 / 3) * 4;
        int i5 = 2;
        if (!bVar.f19999f) {
            int i6 = i2 % 3;
            if (i6 == 1) {
                i4 += 2;
            } else if (i6 == 2) {
                i4 += 3;
            }
        } else if (i2 % 3 > 0) {
            i4 += 4;
        }
        if (bVar.f20000g && i2 > 0) {
            int i7 = ((i2 - 1) / 57) + 1;
            if (!bVar.f20001h) {
                i5 = 1;
            }
            i4 += i7 * i5;
        }
        bVar.f19992a = new byte[i4];
        bVar.m16967a(bArr, i, i2, true);
        return bVar.f19992a;
    }

    /* renamed from: c */
    public static String m16968c(byte[] bArr, int i) {
        try {
            return new String(m16970a(bArr, i), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
