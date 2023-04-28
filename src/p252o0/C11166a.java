package p252o0;

import java.io.File;

/* renamed from: o0.a */
/* loaded from: classes.dex */
public final class C11166a {
    /* renamed from: a */
    public static boolean m10622a(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return false;
        }
        if (parentFile.exists()) {
            return parentFile.isDirectory();
        }
        return parentFile.mkdirs();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m10621b(android.content.ContentResolver r9, android.net.Uri r10, java.lang.String r11) {
        /*
            r0 = 0
            r1 = 1
            r2 = 0
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch: all -> 0x0029, RuntimeException -> 0x002b
            r5[r0] = r11     // Catch: all -> 0x0029, RuntimeException -> 0x002b
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r9
            r4 = r10
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)     // Catch: all -> 0x0029, RuntimeException -> 0x002b
            if (r9 != 0) goto L_0x0018
            if (r9 == 0) goto L_0x0017
            r9.close()
        L_0x0017:
            return r2
        L_0x0018:
            int r11 = r9.getColumnIndexOrThrow(r11)     // Catch: RuntimeException -> 0x0027, all -> 0x004d
            r9.moveToFirst()     // Catch: RuntimeException -> 0x0027, all -> 0x004d
            java.lang.String r10 = r9.getString(r11)     // Catch: RuntimeException -> 0x0027, all -> 0x004d
            r9.close()
            return r10
        L_0x0027:
            r11 = move-exception
            goto L_0x002d
        L_0x0029:
            r10 = move-exception
            goto L_0x004f
        L_0x002b:
            r11 = move-exception
            r9 = r2
        L_0x002d:
            java.lang.String r3 = "OutputUtil"
            java.lang.String r4 = "Failed in getting absolute path for Uri %s with Exception %s"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: all -> 0x004d
            java.lang.String r10 = r10.toString()     // Catch: all -> 0x004d
            r5[r0] = r10     // Catch: all -> 0x004d
            java.lang.String r10 = r11.toString()     // Catch: all -> 0x004d
            r5[r1] = r10     // Catch: all -> 0x004d
            java.lang.String r10 = java.lang.String.format(r4, r5)     // Catch: all -> 0x004d
            androidx.camera.core.C1915r1.m39525c(r3, r10)     // Catch: all -> 0x004d
            if (r9 == 0) goto L_0x004c
            r9.close()
        L_0x004c:
            return r2
        L_0x004d:
            r10 = move-exception
            r2 = r9
        L_0x004f:
            if (r2 == 0) goto L_0x0054
            r2.close()
        L_0x0054:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p252o0.C11166a.m10621b(android.content.ContentResolver, android.net.Uri, java.lang.String):java.lang.String");
    }
}
