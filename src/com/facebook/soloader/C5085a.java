package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import com.facebook.soloader.AbstractC5112r;
import com.facebook.soloader.C5098j;
import java.io.File;

/* renamed from: com.facebook.soloader.a */
/* loaded from: classes7.dex */
public class C5085a extends C5098j {

    /* renamed from: k */
    private final int f8741k;

    /* renamed from: com.facebook.soloader.a$a */
    /* loaded from: classes7.dex */
    protected class C0137a extends C5098j.C5101c {

        /* renamed from: o */
        private final File f8742o;

        /* renamed from: p */
        private final int f8743p;

        C0137a(C5098j jVar) {
            super(jVar);
            this.f8742o = new File(C5085a.this.f8797d.getApplicationInfo().nativeLibraryDir);
            this.f8743p = C5085a.this.f8741k;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
        @Override // com.facebook.soloader.C5098j.C5101c
        /* renamed from: n */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        protected boolean mo30736n(java.util.zip.ZipEntry r10, java.lang.String r11) {
            /*
                r9 = this;
                java.lang.String r0 = r10.getName()
                com.facebook.soloader.a r1 = com.facebook.soloader.C5085a.this
                java.lang.String r1 = r1.f8798e
                boolean r1 = r11.equals(r1)
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0022
                com.facebook.soloader.a r10 = com.facebook.soloader.C5085a.this
                r0 = 0
                r10.f8798e = r0
                java.lang.Object[] r10 = new java.lang.Object[r3]
                r10[r2] = r11
                java.lang.String r11 = "allowing consideration of corrupted lib %s"
                java.lang.String r10 = java.lang.String.format(r11, r10)
            L_0x001f:
                r2 = r3
                goto L_0x00cd
            L_0x0022:
                int r1 = r9.f8743p
                r1 = r1 & r3
                if (r1 != 0) goto L_0x003e
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "allowing consideration of "
                r10.append(r11)
                r10.append(r0)
                java.lang.String r11 = ": self-extraction preferred"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                goto L_0x001f
            L_0x003e:
                java.io.File r1 = new java.io.File
                java.io.File r4 = r9.f8742o
                r1.<init>(r4, r11)
                r4 = 3
                r5 = 2
                java.lang.String r6 = r1.getCanonicalPath()     // Catch: IOException -> 0x0068
                java.io.File r7 = r9.f8742o     // Catch: IOException -> 0x0068
                java.lang.String r7 = r7.getCanonicalPath()     // Catch: IOException -> 0x0068
                boolean r6 = r6.startsWith(r7)     // Catch: IOException -> 0x0068
                if (r6 != 0) goto L_0x0064
                java.lang.String r6 = "not allowing consideration of %s: %s not in lib dir"
                java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch: IOException -> 0x0068
                r7[r2] = r0     // Catch: IOException -> 0x0068
                r7[r3] = r11     // Catch: IOException -> 0x0068
                java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch: IOException -> 0x0068
                goto L_0x007b
            L_0x0064:
                java.lang.String r6 = ""
                r7 = r3
                goto L_0x007c
            L_0x0068:
                r6 = move-exception
                java.lang.Object[] r7 = new java.lang.Object[r4]
                r7[r2] = r0
                r7[r3] = r11
                java.lang.String r6 = r6.toString()
                r7[r5] = r6
                java.lang.String r6 = "not allowing consideration of %s: %s, IOException when constructing path: %s"
                java.lang.String r6 = java.lang.String.format(r6, r7)
            L_0x007b:
                r7 = r2
            L_0x007c:
                if (r7 == 0) goto L_0x00cc
                boolean r6 = r1.isFile()
                if (r6 != 0) goto L_0x0091
                java.lang.Object[] r10 = new java.lang.Object[r5]
                r10[r2] = r0
                r10[r3] = r11
                java.lang.String r11 = "allowing consideration of %s: %s not in system lib dir"
                java.lang.String r10 = java.lang.String.format(r11, r10)
                goto L_0x001f
            L_0x0091:
                long r6 = r1.length()
                long r10 = r10.getSize()
                int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r8 == 0) goto L_0x00b5
                java.lang.Object[] r0 = new java.lang.Object[r4]
                r0[r2] = r1
                java.lang.Long r1 = java.lang.Long.valueOf(r6)
                r0[r3] = r1
                java.lang.Long r10 = java.lang.Long.valueOf(r10)
                r0[r5] = r10
                java.lang.String r10 = "allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK"
                java.lang.String r10 = java.lang.String.format(r10, r0)
                goto L_0x001f
            L_0x00b5:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "not allowing consideration of "
                r10.append(r11)
                r10.append(r0)
                java.lang.String r11 = ": deferring to libdir"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                goto L_0x00cd
            L_0x00cc:
                r10 = r6
            L_0x00cd:
                java.lang.String r11 = "ApkSoSource"
                android.util.Log.d(r11, r10)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C5085a.C0137a.mo30736n(java.util.zip.ZipEntry, java.lang.String):boolean");
        }
    }

    public C5085a(Context context, File file, String str, int i) {
        super(context, str, file, "^lib/([^/]+)/([^/]+\\.so)$");
        this.f8741k = i;
    }

    @Override // com.facebook.soloader.AbstractC5112r
    /* renamed from: o */
    protected byte[] mo30702o() {
        File canonicalFile = this.f8768i.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(SysUtil.m30771g(this.f8797d));
            if ((this.f8741k & 1) == 0) {
                obtain.writeByte((byte) 0);
                return obtain.marshall();
            }
            String str = this.f8797d.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                obtain.writeByte((byte) 1);
                return obtain.marshall();
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                obtain.writeByte((byte) 1);
                return obtain.marshall();
            }
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile2.getPath());
            obtain.writeLong(canonicalFile2.lastModified());
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.facebook.soloader.AbstractC5112r
    /* renamed from: t */
    protected AbstractC5112r.AbstractC5119g mo30697t(byte b) {
        return new C0137a(this);
    }
}
