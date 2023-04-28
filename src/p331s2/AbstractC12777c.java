package p331s2;

import fk.C7369p;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* renamed from: s2.c */
/* loaded from: classes.dex */
public abstract class AbstractC12777c implements Closeable {

    /* renamed from: q */
    private static final String[] f28677q = new String[128];

    /* renamed from: k */
    int f28678k;

    /* renamed from: l */
    int[] f28679l = new int[32];

    /* renamed from: m */
    String[] f28680m = new String[32];

    /* renamed from: n */
    int[] f28681n = new int[32];

    /* renamed from: o */
    boolean f28682o;

    /* renamed from: p */
    boolean f28683p;

    /* renamed from: s2.c$a */
    /* loaded from: classes.dex */
    public static final class C12778a {

        /* renamed from: a */
        final String[] f28684a;

        /* renamed from: b */
        final C7369p f28685b;

        private C12778a(String[] strArr, C7369p pVar) {
            this.f28684a = strArr;
            this.f28685b = pVar;
        }

        /* renamed from: a */
        public static C12778a m5511a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                Buffer buffer = new Buffer();
                for (int i = 0; i < strArr.length; i++) {
                    AbstractC12777c.m5514b0(buffer, strArr[i]);
                    buffer.readByte();
                    byteStringArr[i] = buffer.mo9727o0();
                }
                return new C12778a((String[]) strArr.clone(), C7369p.m22790r(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: s2.c$b */
    /* loaded from: classes.dex */
    public enum EnumC12779b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f28677q[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f28677q;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* renamed from: H */
    public static AbstractC12777c m5517H(BufferedSource bufferedSource) {
        return new C12781e(bufferedSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m5514b0(okio.BufferedSink r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = p331s2.AbstractC12777c.f28677q
            r1 = 34
            r7.writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        L_0x000d:
            if (r3 >= r2) goto L_0x0036
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L_0x001c
            r5 = r0[r5]
            if (r5 != 0) goto L_0x0029
            goto L_0x0033
        L_0x001c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L_0x0023
            java.lang.String r5 = "\\u2028"
            goto L_0x0029
        L_0x0023:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L_0x0033
            java.lang.String r5 = "\\u2029"
        L_0x0029:
            if (r4 >= r3) goto L_0x002e
            r7.mo9749M(r8, r4, r3)
        L_0x002e:
            r7.mo9750J(r5)
            int r4 = r3 + 1
        L_0x0033:
            int r3 = r3 + 1
            goto L_0x000d
        L_0x0036:
            if (r4 >= r2) goto L_0x003b
            r7.mo9749M(r8, r4, r2)
        L_0x003b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p331s2.AbstractC12777c.m5514b0(okio.BufferedSink, java.lang.String):void");
    }

    /* renamed from: C */
    public abstract String mo5509C();

    /* renamed from: Q */
    public abstract EnumC12779b mo5497Q();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public final void m5516R(int i) {
        int i2 = this.f28678k;
        int[] iArr = this.f28679l;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f28679l = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f28680m;
                this.f28680m = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f28681n;
                this.f28681n = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new C12775a("Nesting too deep at " + m5512n());
            }
        }
        int[] iArr3 = this.f28679l;
        int i3 = this.f28678k;
        this.f28678k = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: S */
    public abstract int mo5496S(C12778a aVar);

    /* renamed from: U */
    public abstract void mo5495U();

    /* renamed from: Y */
    public abstract void mo5494Y();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final C12776b m5513f0(String str) {
        throw new C12776b(str + " at path " + m5512n());
    }

    /* renamed from: g */
    public abstract void mo5493g();

    /* renamed from: h */
    public abstract void mo5492h();

    /* renamed from: i */
    public abstract void mo5491i();

    /* renamed from: l */
    public abstract void mo5489l();

    /* renamed from: n */
    public final String m5512n() {
        return C12780d.m5510a(this.f28678k, this.f28679l, this.f28680m, this.f28681n);
    }

    /* renamed from: p */
    public abstract boolean mo5488p();

    /* renamed from: r */
    public abstract boolean mo5487r();

    /* renamed from: s */
    public abstract double mo5486s();

    /* renamed from: t */
    public abstract int mo5485t();

    /* renamed from: z */
    public abstract String mo5483z();
}
