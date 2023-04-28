package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import android.util.Log;
import com.facebook.react.uimanager.ViewDefaults;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.soloader.r */
/* loaded from: classes7.dex */
public abstract class AbstractC5112r extends C5088d {

    /* renamed from: d */
    protected final Context f8797d;

    /* renamed from: e */
    protected String f8798e;

    /* renamed from: f */
    protected C5103k f8799f;

    /* renamed from: g */
    private String[] f8800g;

    /* renamed from: h */
    private final Map<String, Object> f8801h = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.soloader.r$a */
    /* loaded from: classes7.dex */
    public class RunnableC5113a implements Runnable {

        /* renamed from: k */
        final /* synthetic */ File f8802k;

        /* renamed from: l */
        final /* synthetic */ byte[] f8803l;

        /* renamed from: m */
        final /* synthetic */ C5115c f8804m;

        /* renamed from: n */
        final /* synthetic */ File f8805n;

        /* renamed from: o */
        final /* synthetic */ C5103k f8806o;

        /* renamed from: p */
        final /* synthetic */ Boolean f8807p;

        RunnableC5113a(File file, byte[] bArr, C5115c cVar, File file2, C5103k kVar, Boolean bool) {
            this.f8802k = file;
            this.f8803l = bArr;
            this.f8804m = cVar;
            this.f8805n = file2;
            this.f8806o = kVar;
            this.f8807p = bool;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.v("fb-UnpackingSoSource", "starting syncer worker");
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.f8802k, "rw");
                randomAccessFile.write(this.f8803l);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                randomAccessFile.close();
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(new File(AbstractC5112r.this.f8751a, "dso_manifest"), "rw");
                this.f8804m.m30690b(randomAccessFile2);
                randomAccessFile2.close();
                SysUtil.m30772f(AbstractC5112r.this.f8751a);
                AbstractC5112r.m30692y(this.f8805n, (byte) 1);
                Log.v("fb-UnpackingSoSource", "releasing dso store lock for " + AbstractC5112r.this.f8751a + " (from syncer thread)");
                this.f8806o.close();
            } catch (IOException e) {
                if (!this.f8807p.booleanValue()) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /* renamed from: com.facebook.soloader.r$b */
    /* loaded from: classes7.dex */
    public static class C5114b {

        /* renamed from: k */
        public final String f8809k;

        /* renamed from: l */
        public final String f8810l;

        public C5114b(String str, String str2) {
            this.f8809k = str;
            this.f8810l = str2;
        }
    }

    /* renamed from: com.facebook.soloader.r$c */
    /* loaded from: classes7.dex */
    public static final class C5115c {

        /* renamed from: a */
        public final C5114b[] f8811a;

        public C5115c(C5114b[] bVarArr) {
            this.f8811a = bVarArr;
        }

        /* renamed from: a */
        static final C5115c m30691a(DataInput dataInput) {
            if (dataInput.readByte() == 1) {
                int readInt = dataInput.readInt();
                if (readInt >= 0) {
                    C5114b[] bVarArr = new C5114b[readInt];
                    for (int i = 0; i < readInt; i++) {
                        bVarArr[i] = new C5114b(dataInput.readUTF(), dataInput.readUTF());
                    }
                    return new C5115c(bVarArr);
                }
                throw new RuntimeException("illegal number of shared libraries");
            }
            throw new RuntimeException("wrong dso manifest version");
        }

        /* renamed from: b */
        public final void m30690b(DataOutput dataOutput) {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.f8811a.length);
            int i = 0;
            while (true) {
                C5114b[] bVarArr = this.f8811a;
                if (i < bVarArr.length) {
                    dataOutput.writeUTF(bVarArr[i].f8809k);
                    dataOutput.writeUTF(this.f8811a[i].f8810l);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.facebook.soloader.r$d */
    /* loaded from: classes7.dex */
    public interface AbstractC5116d extends Closeable {
        int available();

        String getFileName();

        /* renamed from: m0 */
        void mo30687m0(DataOutput dataOutput, byte[] bArr);

        /* renamed from: v0 */
        C5114b mo30686v0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.facebook.soloader.r$e */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC5117e implements Closeable {
        /* renamed from: b */
        public abstract boolean mo30689b();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        /* renamed from: g */
        public abstract AbstractC5116d mo30688g();
    }

    /* renamed from: com.facebook.soloader.r$f */
    /* loaded from: classes7.dex */
    public static class C5118f implements AbstractC5116d {

        /* renamed from: k */
        private final C5114b f8812k;

        /* renamed from: l */
        private final InputStream f8813l;

        public C5118f(C5114b bVar, InputStream inputStream) {
            this.f8812k = bVar;
            this.f8813l = inputStream;
        }

        @Override // com.facebook.soloader.AbstractC5112r.AbstractC5116d
        public int available() {
            return this.f8813l.available();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f8813l.close();
        }

        @Override // com.facebook.soloader.AbstractC5112r.AbstractC5116d
        public String getFileName() {
            return this.f8812k.f8809k;
        }

        @Override // com.facebook.soloader.AbstractC5112r.AbstractC5116d
        /* renamed from: m0 */
        public void mo30687m0(DataOutput dataOutput, byte[] bArr) {
            SysUtil.m30777a(dataOutput, this.f8813l, ViewDefaults.NUMBER_OF_LINES, bArr);
        }

        @Override // com.facebook.soloader.AbstractC5112r.AbstractC5116d
        /* renamed from: v0 */
        public C5114b mo30686v0() {
            return this.f8812k;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.facebook.soloader.r$g */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC5119g implements Closeable {
        /* renamed from: b */
        public abstract C5115c mo30685b();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        /* renamed from: g */
        public abstract AbstractC5117e mo30684g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5112r(Context context, String str) {
        super(m30698s(context, str), 1);
        this.f8797d = context;
    }

    /* renamed from: j */
    private Runnable m30707j(C5103k kVar, byte[] bArr, File file, File file2, C5115c cVar, Boolean bool) {
        return new RunnableC5113a(file2, bArr, cVar, file, kVar, bool);
    }

    /* renamed from: k */
    private void m30706k(C5114b[] bVarArr) {
        String[] list = this.f8751a.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_instance_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                    boolean z = false;
                    for (int i = 0; !z && i < bVarArr.length; i++) {
                        if (bVarArr[i].f8809k.equals(m30699r(str))) {
                            z = true;
                        }
                    }
                    if (!z) {
                        File file = new File(this.f8751a, str);
                        Log.v("fb-UnpackingSoSource", "deleting unaccounted-for file " + file);
                        SysUtil.m30775c(file);
                    }
                }
            }
            return;
        }
        throw new IOException("unable to list directory " + this.f8751a);
    }

    /* renamed from: m */
    private void m30704m(AbstractC5116d dVar, byte[] bArr) {
        boolean writable;
        Log.i("fb-UnpackingSoSource", "extracting DSO " + dVar.mo30686v0().f8809k);
        try {
            if (this.f8751a.setWritable(true)) {
                m30703n(dVar, bArr);
                if (writable) {
                    return;
                }
                return;
            }
            throw new IOException("cannot make directory writable for us: " + this.f8751a);
        } finally {
            if (!this.f8751a.setWritable(false)) {
                Log.w("fb-UnpackingSoSource", "error removing " + this.f8751a.getCanonicalPath() + " write permission");
            }
        }
    }

    /* renamed from: n */
    private void m30703n(AbstractC5116d dVar, byte[] bArr) {
        RandomAccessFile randomAccessFile;
        File file = new File(this.f8751a, dVar.getFileName());
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                if (file.exists() && !file.setWritable(true)) {
                    Log.w("fb-UnpackingSoSource", "error adding write permission to: " + file);
                }
                try {
                    randomAccessFile = new RandomAccessFile(file, "rw");
                } catch (IOException e) {
                    Log.w("fb-UnpackingSoSource", "error overwriting " + file + " trying to delete and start over", e);
                    SysUtil.m30775c(file);
                    randomAccessFile = new RandomAccessFile(file, "rw");
                }
                randomAccessFile2 = randomAccessFile;
                int available = dVar.available();
                if (available > 1) {
                    SysUtil.m30774d(randomAccessFile2.getFD(), available);
                }
                dVar.mo30687m0(randomAccessFile2, bArr);
                randomAccessFile2.setLength(randomAccessFile2.getFilePointer());
                if (file.setExecutable(true, false)) {
                    if (!file.setWritable(false)) {
                        Log.w("fb-UnpackingSoSource", "error removing " + file + " write permission");
                    }
                    randomAccessFile2.close();
                    return;
                }
                throw new IOException("cannot make file executable: " + file);
            } catch (IOException e2) {
                SysUtil.m30775c(file);
                throw e2;
            }
        } catch (Throwable th2) {
            if (!file.setWritable(false)) {
                Log.w("fb-UnpackingSoSource", "error removing " + file + " write permission");
            }
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            throw th2;
        }
    }

    /* renamed from: p */
    private Object m30701p(String str) {
        Object obj;
        synchronized (this.f8801h) {
            obj = this.f8801h.get(str);
            if (obj == null) {
                obj = new Object();
                this.f8801h.put(str, obj);
            }
        }
        return obj;
    }

    /* renamed from: s */
    public static File m30698s(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[Catch: all -> 0x0036, TryCatch #4 {all -> 0x0036, blocks: (B:4:0x0031, B:7:0x003a, B:11:0x0043, B:12:0x004a, B:13:0x0054, B:15:0x005a, B:31:0x00a6, B:18:0x0062, B:20:0x0067, B:22:0x0079, B:25:0x008c, B:26:0x008f, B:30:0x00a3), top: B:38:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #4 {all -> 0x0036, blocks: (B:4:0x0031, B:7:0x003a, B:11:0x0043, B:12:0x004a, B:13:0x0054, B:15:0x005a, B:31:0x00a6, B:18:0x0062, B:20:0x0067, B:22:0x0079, B:25:0x008c, B:26:0x008f, B:30:0x00a3), top: B:38:0x0031 }] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m30694w(byte r10, com.facebook.soloader.AbstractC5112r.C5115c r11, com.facebook.soloader.AbstractC5112r.AbstractC5117e r12) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "regenerating DSO store "
            r0.append(r1)
            java.lang.Class r1 = r9.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "fb-UnpackingSoSource"
            android.util.Log.v(r1, r0)
            java.io.File r0 = new java.io.File
            java.io.File r2 = r9.f8751a
            java.lang.String r3 = "dso_manifest"
            r0.<init>(r2, r3)
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile
            java.lang.String r3 = "rw"
            r2.<init>(r0, r3)
            r0 = 1
            if (r10 != r0) goto L_0x003f
            com.facebook.soloader.r$c r10 = com.facebook.soloader.AbstractC5112r.C5115c.m30691a(r2)     // Catch: all -> 0x0036, Exception -> 0x0039
            goto L_0x0040
        L_0x0036:
            r10 = move-exception
            goto L_0x00d6
        L_0x0039:
            r10 = move-exception
            java.lang.String r3 = "error reading existing DSO manifest"
            android.util.Log.i(r1, r3, r10)     // Catch: all -> 0x0036
        L_0x003f:
            r10 = 0
        L_0x0040:
            r3 = 0
            if (r10 != 0) goto L_0x004a
            com.facebook.soloader.r$c r10 = new com.facebook.soloader.r$c     // Catch: all -> 0x0036
            com.facebook.soloader.r$b[] r4 = new com.facebook.soloader.AbstractC5112r.C5114b[r3]     // Catch: all -> 0x0036
            r10.<init>(r4)     // Catch: all -> 0x0036
        L_0x004a:
            com.facebook.soloader.r$b[] r11 = r11.f8811a     // Catch: all -> 0x0036
            r9.m30706k(r11)     // Catch: all -> 0x0036
            r11 = 32768(0x8000, float:4.5918E-41)
            byte[] r11 = new byte[r11]     // Catch: all -> 0x0036
        L_0x0054:
            boolean r4 = r12.mo30689b()     // Catch: all -> 0x0036
            if (r4 == 0) goto L_0x00b6
            com.facebook.soloader.r$d r4 = r12.mo30688g()     // Catch: all -> 0x0036
            r5 = r0
            r6 = r3
        L_0x0060:
            if (r5 == 0) goto L_0x008f
            com.facebook.soloader.r$b[] r7 = r10.f8811a     // Catch: all -> 0x00aa
            int r7 = r7.length     // Catch: all -> 0x00aa
            if (r6 >= r7) goto L_0x008f
            com.facebook.soloader.r$b r7 = r4.mo30686v0()     // Catch: all -> 0x00aa
            java.lang.String r7 = r7.f8809k     // Catch: all -> 0x00aa
            com.facebook.soloader.r$b[] r8 = r10.f8811a     // Catch: all -> 0x00aa
            r8 = r8[r6]     // Catch: all -> 0x00aa
            java.lang.String r8 = r8.f8809k     // Catch: all -> 0x00aa
            boolean r7 = r8.equals(r7)     // Catch: all -> 0x00aa
            if (r7 == 0) goto L_0x008c
            com.facebook.soloader.r$b[] r7 = r10.f8811a     // Catch: all -> 0x00aa
            r7 = r7[r6]     // Catch: all -> 0x00aa
            java.lang.String r7 = r7.f8810l     // Catch: all -> 0x00aa
            com.facebook.soloader.r$b r8 = r4.mo30686v0()     // Catch: all -> 0x00aa
            java.lang.String r8 = r8.f8810l     // Catch: all -> 0x00aa
            boolean r7 = r7.equals(r8)     // Catch: all -> 0x00aa
            if (r7 == 0) goto L_0x008c
            r5 = r3
        L_0x008c:
            int r6 = r6 + 1
            goto L_0x0060
        L_0x008f:
            java.io.File r6 = new java.io.File     // Catch: all -> 0x00aa
            java.io.File r7 = r9.f8751a     // Catch: all -> 0x00aa
            java.lang.String r8 = r4.getFileName()     // Catch: all -> 0x00aa
            r6.<init>(r7, r8)     // Catch: all -> 0x00aa
            boolean r6 = r6.exists()     // Catch: all -> 0x00aa
            if (r6 != 0) goto L_0x00a1
            r5 = r0
        L_0x00a1:
            if (r5 == 0) goto L_0x00a6
            r9.m30704m(r4, r11)     // Catch: all -> 0x00aa
        L_0x00a6:
            r4.close()     // Catch: all -> 0x0036
            goto L_0x0054
        L_0x00aa:
            r10 = move-exception
            if (r4 == 0) goto L_0x00b5
            r4.close()     // Catch: all -> 0x00b1
            goto L_0x00b5
        L_0x00b1:
            r11 = move-exception
            r10.addSuppressed(r11)     // Catch: all -> 0x0036
        L_0x00b5:
            throw r10     // Catch: all -> 0x0036
        L_0x00b6:
            r2.close()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Finished regenerating DSO store "
            r10.append(r11)
            java.lang.Class r11 = r9.getClass()
            java.lang.String r11 = r11.getName()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.v(r1, r10)
            return
        L_0x00d6:
            r2.close()     // Catch: all -> 0x00da
            goto L_0x00de
        L_0x00da:
            r11 = move-exception
            r10.addSuppressed(r11)
        L_0x00de:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.AbstractC5112r.m30694w(byte, com.facebook.soloader.r$c, com.facebook.soloader.r$e):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static void m30692y(File file, byte b) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(0L);
            randomAccessFile.write(b);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
        } catch (SyncFailedException e) {
            Log.w("fb-UnpackingSoSource", "state file sync failed", e);
        }
    }

    @Override // com.facebook.soloader.C5088d, com.facebook.soloader.AbstractC5111q
    /* renamed from: a */
    public int mo30710a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        int h;
        synchronized (m30701p(str)) {
            h = m30745h(str, i, this.f8751a, threadPolicy);
        }
        return h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0133  */
    @Override // com.facebook.soloader.AbstractC5111q
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo30709b(int r14) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.AbstractC5112r.mo30709b(int):void");
    }

    /* renamed from: l */
    protected boolean m30705l(byte[] bArr, byte[] bArr2) {
        return !Arrays.equals(bArr, bArr2);
    }

    /* renamed from: o */
    protected byte[] mo30702o() {
        Parcel obtain = Parcel.obtain();
        AbstractC5119g t = mo30697t((byte) 1);
        try {
            C5114b[] bVarArr = t.mo30685b().f8811a;
            obtain.writeByte((byte) 1);
            obtain.writeInt(bVarArr.length);
            for (int i = 0; i < bVarArr.length; i++) {
                obtain.writeString(bVarArr[i].f8809k);
                obtain.writeString(bVarArr[i].f8810l);
            }
            t.close();
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable th2) {
            if (t != null) {
                try {
                    t.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* renamed from: q */
    protected C5103k m30700q(File file, boolean z) {
        return SysUtil.m30768j(this.f8751a, file, z);
    }

    /* renamed from: r */
    protected String m30699r(String str) {
        return str;
    }

    /* renamed from: t */
    protected abstract AbstractC5119g mo30697t(byte b);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public synchronized void m30696u(String str) {
        synchronized (m30701p(str)) {
            this.f8798e = str;
            mo30709b(2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean m30695v(com.facebook.soloader.C5103k r12, int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.AbstractC5112r.m30695v(com.facebook.soloader.k, int, byte[]):boolean");
    }

    /* renamed from: x */
    public void m30693x(String[] strArr) {
        this.f8800g = strArr;
    }
}
