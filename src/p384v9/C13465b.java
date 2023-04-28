package p384v9;

import com.google.android.gms.common.api.Status;

/* renamed from: v9.b */
/* loaded from: classes5.dex */
public class C13465b extends Exception {
    @Deprecated

    /* renamed from: k */
    protected final Status f30066k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C13465b(com.google.android.gms.common.api.Status r5) {
        /*
            r4 = this;
            int r0 = r5.m29111r()
            java.lang.String r1 = r5.m29110t()
            if (r1 == 0) goto L_0x000f
            java.lang.String r1 = r5.m29110t()
            goto L_0x0011
        L_0x000f:
            java.lang.String r1 = ""
        L_0x0011:
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 13
            r3.<init>(r2)
            r3.append(r0)
            java.lang.String r0 = ": "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r4.<init>(r0)
            r4.f30066k = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p384v9.C13465b.<init>(com.google.android.gms.common.api.Status):void");
    }

    /* renamed from: a */
    public Status m3641a() {
        return this.f30066k;
    }

    /* renamed from: b */
    public int m3640b() {
        return this.f30066k.m29111r();
    }
}
