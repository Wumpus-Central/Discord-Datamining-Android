package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.AbstractC5112r;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: com.facebook.soloader.i */
/* loaded from: classes7.dex */
public final class C5093i extends AbstractC5112r {

    /* renamed from: com.facebook.soloader.i$b */
    /* loaded from: classes7.dex */
    private final class C5095b extends AbstractC5112r.AbstractC5119g {

        /* renamed from: k */
        private final C5097c[] f8763k;

        /* renamed from: com.facebook.soloader.i$b$a */
        /* loaded from: classes7.dex */
        private final class C5096a extends AbstractC5112r.AbstractC5117e {

            /* renamed from: k */
            private int f8765k;

            private C5096a() {
            }

            @Override // com.facebook.soloader.AbstractC5112r.AbstractC5117e
            /* renamed from: b */
            public boolean mo30689b() {
                return this.f8765k < C5095b.this.f8763k.length;
            }

            @Override // com.facebook.soloader.AbstractC5112r.AbstractC5117e
            /* renamed from: g */
            public AbstractC5112r.AbstractC5116d mo30688g() {
                C5097c[] cVarArr = C5095b.this.f8763k;
                int i = this.f8765k;
                this.f8765k = i + 1;
                C5097c cVar = cVarArr[i];
                FileInputStream fileInputStream = new FileInputStream(cVar.f8767m);
                try {
                    return new AbstractC5112r.C5118f(cVar, fileInputStream);
                } catch (Throwable th2) {
                    fileInputStream.close();
                    throw th2;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00e4, code lost:
            throw new java.lang.RuntimeException("illegal line in exopackage metadata: [" + r11 + "]");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        C5095b(com.facebook.soloader.AbstractC5112r r19) {
            /*
                Method dump skipped, instructions count: 296
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C5093i.C5095b.<init>(com.facebook.soloader.i, com.facebook.soloader.r):void");
        }

        @Override // com.facebook.soloader.AbstractC5112r.AbstractC5119g
        /* renamed from: b */
        public AbstractC5112r.C5115c mo30685b() {
            return new AbstractC5112r.C5115c(this.f8763k);
        }

        @Override // com.facebook.soloader.AbstractC5112r.AbstractC5119g
        /* renamed from: g */
        public AbstractC5112r.AbstractC5117e mo30684g() {
            return new C5096a();
        }
    }

    /* renamed from: com.facebook.soloader.i$c */
    /* loaded from: classes7.dex */
    private static final class C5097c extends AbstractC5112r.C5114b {

        /* renamed from: m */
        final File f8767m;

        C5097c(String str, String str2, File file) {
            super(str, str2);
            this.f8767m = file;
        }
    }

    public C5093i(Context context, String str) {
        super(context, str);
    }

    @Override // com.facebook.soloader.AbstractC5112r
    /* renamed from: t */
    protected AbstractC5112r.AbstractC5119g mo30697t(byte b) {
        return new C5095b(this);
    }
}
