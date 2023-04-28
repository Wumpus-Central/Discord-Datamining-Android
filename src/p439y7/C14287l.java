package p439y7;

import android.media.MediaCodec;
import p152i7.C8222g;

/* renamed from: y7.l */
/* loaded from: classes7.dex */
public class C14287l extends C8222g {

    /* renamed from: k */
    public final C14288m f32302k;

    /* renamed from: l */
    public final String f32303l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C14287l(java.lang.Throwable r4, p439y7.C14288m r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoder failed: "
            r0.append(r1)
            r1 = 0
            if (r5 != 0) goto L_0x000f
            r2 = r1
            goto L_0x0011
        L_0x000f:
            java.lang.String r2 = r5.f32304a
        L_0x0011:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            r3.f32302k = r5
            int r5 = p119g9.C7557q0.f16368a
            r0 = 21
            if (r5 < r0) goto L_0x0027
            java.lang.String r1 = m1131a(r4)
        L_0x0027:
            r3.f32303l = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p439y7.C14287l.<init>(java.lang.Throwable, y7.m):void");
    }

    /* renamed from: a */
    private static String m1131a(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
        }
        return null;
    }
}
