package com.google.firebase.installations;

import android.util.Log;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: com.google.firebase.installations.b */
/* loaded from: classes3.dex */
class C5793b {

    /* renamed from: a */
    private final FileChannel f11468a;

    /* renamed from: b */
    private final FileLock f11469b;

    private C5793b(FileChannel fileChannel, FileLock fileLock) {
        this.f11468a = fileChannel;
        this.f11469b = fileLock;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.firebase.installations.C5793b m27331a(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: OverlappingFileLockException -> 0x002c, Error -> 0x002e, IOException -> 0x0030
            java.io.File r4 = r4.getFilesDir()     // Catch: OverlappingFileLockException -> 0x002c, Error -> 0x002e, IOException -> 0x0030
            r1.<init>(r4, r5)     // Catch: OverlappingFileLockException -> 0x002c, Error -> 0x002e, IOException -> 0x0030
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: OverlappingFileLockException -> 0x002c, Error -> 0x002e, IOException -> 0x0030
            java.lang.String r5 = "rw"
            r4.<init>(r1, r5)     // Catch: OverlappingFileLockException -> 0x002c, Error -> 0x002e, IOException -> 0x0030
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch: OverlappingFileLockException -> 0x002c, Error -> 0x002e, IOException -> 0x0030
            java.nio.channels.FileLock r5 = r4.lock()     // Catch: OverlappingFileLockException -> 0x0025, Error -> 0x0027, IOException -> 0x0029
            com.google.firebase.installations.b r1 = new com.google.firebase.installations.b     // Catch: OverlappingFileLockException -> 0x001f, Error -> 0x0021, IOException -> 0x0023
            r1.<init>(r4, r5)     // Catch: OverlappingFileLockException -> 0x001f, Error -> 0x0021, IOException -> 0x0023
            return r1
        L_0x001f:
            r1 = move-exception
            goto L_0x0033
        L_0x0021:
            r1 = move-exception
            goto L_0x0033
        L_0x0023:
            r1 = move-exception
            goto L_0x0033
        L_0x0025:
            r1 = move-exception
            goto L_0x002a
        L_0x0027:
            r1 = move-exception
            goto L_0x002a
        L_0x0029:
            r1 = move-exception
        L_0x002a:
            r5 = r0
            goto L_0x0033
        L_0x002c:
            r1 = move-exception
            goto L_0x0031
        L_0x002e:
            r1 = move-exception
            goto L_0x0031
        L_0x0030:
            r1 = move-exception
        L_0x0031:
            r4 = r0
            r5 = r4
        L_0x0033:
            java.lang.String r2 = "CrossProcessLock"
            java.lang.String r3 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r2, r3, r1)
            if (r5 == 0) goto L_0x003f
            r5.release()     // Catch: IOException -> 0x003f
        L_0x003f:
            if (r4 == 0) goto L_0x0044
            r4.close()     // Catch: IOException -> 0x0044
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C5793b.m27331a(android.content.Context, java.lang.String):com.google.firebase.installations.b");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m27330b() {
        try {
            this.f11469b.release();
            this.f11468a.close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }
}
