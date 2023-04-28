package com.facebook.soloader;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.facebook.soloader.C5105m;
import dalvik.system.BaseDexClassLoader;
import java.io.DataOutput;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/* loaded from: classes7.dex */
public final class SysUtil {

    @AbstractC5089e
    @TargetApi(14)
    /* loaded from: classes7.dex */
    public static class Api14Utils {
        /* renamed from: a */
        public static String m30763a() {
            ClassLoader classLoader = SoLoader.class.getClassLoader();
            if (classLoader == null || (classLoader instanceof BaseDexClassLoader)) {
                try {
                    return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
                } catch (Exception e) {
                    throw new RuntimeException("Cannot call getLdLibraryPath", e);
                }
            } else {
                throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @AbstractC5089e
    @TargetApi(21)
    /* loaded from: classes7.dex */
    public static final class LollipopSysdeps {
        private LollipopSysdeps() {
        }

        @AbstractC5089e
        public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j) {
            int i;
            try {
                Os.posix_fallocate(fileDescriptor, 0L, j);
            } catch (ErrnoException e) {
                if (e.errno != OsConstants.EOPNOTSUPP && (i = e.errno) != OsConstants.ENOSYS && i != OsConstants.EINVAL) {
                    throw new IOException(e.toString(), e);
                }
            }
        }

        @AbstractC5089e
        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            try {
                if (is64Bit()) {
                    treeSet.add(C5105m.EnumC5107b.AARCH64.toString());
                    treeSet.add(C5105m.EnumC5107b.X86_64.toString());
                } else {
                    treeSet.add(C5105m.EnumC5107b.ARM.toString());
                    treeSet.add(C5105m.EnumC5107b.X86.toString());
                }
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    if (treeSet.contains(str)) {
                        arrayList.add(str);
                    }
                }
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (ErrnoException e) {
                Log.e("SysUtil", String.format("Could not read /proc/self/exe. Falling back to default ABI list: %s. errno: %d Err msg: %s", Arrays.toString(strArr), Integer.valueOf(e.errno), e.getMessage()));
                return Build.SUPPORTED_ABIS;
            }
        }

        @AbstractC5089e
        public static boolean is64Bit() {
            return Os.readlink("/proc/self/exe").contains("64");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @AbstractC5089e
    @TargetApi(23)
    /* loaded from: classes7.dex */
    public static final class MarshmallowSysdeps {
        private MarshmallowSysdeps() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
            if (r1.getMethod() != 0) goto L_0x0042;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
            r2 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
            r5.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
            return r2;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static boolean m30762a(android.content.Context r5) {
            /*
                java.io.File r0 = new java.io.File
                android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
                java.lang.String r5 = r5.sourceDir
                r0.<init>(r5)
                java.util.zip.ZipFile r5 = new java.util.zip.ZipFile
                r5.<init>(r0)
                java.util.Enumeration r0 = r5.entries()     // Catch: all -> 0x004a
            L_0x0014:
                boolean r1 = r0.hasMoreElements()     // Catch: all -> 0x004a
                r2 = 0
                if (r1 == 0) goto L_0x0046
                java.lang.Object r1 = r0.nextElement()     // Catch: all -> 0x004a
                java.util.zip.ZipEntry r1 = (java.util.zip.ZipEntry) r1     // Catch: all -> 0x004a
                if (r1 == 0) goto L_0x0014
                java.lang.String r3 = r1.getName()     // Catch: all -> 0x004a
                java.lang.String r4 = ".so"
                boolean r3 = r3.endsWith(r4)     // Catch: all -> 0x004a
                if (r3 == 0) goto L_0x0014
                java.lang.String r3 = r1.getName()     // Catch: all -> 0x004a
                java.lang.String r4 = "/lib"
                boolean r3 = r3.contains(r4)     // Catch: all -> 0x004a
                if (r3 == 0) goto L_0x0014
                int r0 = r1.getMethod()     // Catch: all -> 0x004a
                if (r0 != 0) goto L_0x0042
                r2 = 1
            L_0x0042:
                r5.close()
                return r2
            L_0x0046:
                r5.close()
                return r2
            L_0x004a:
                r0 = move-exception
                r5.close()     // Catch: all -> 0x004f
                goto L_0x0053
            L_0x004f:
                r5 = move-exception
                r0.addSuppressed(r5)
            L_0x0053:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SysUtil.MarshmallowSysdeps.m30762a(android.content.Context):boolean");
        }

        /* renamed from: b */
        public static boolean m30761b(Context context) {
            return context != null && (context.getApplicationInfo().flags & 268435456) == 0;
        }

        /* renamed from: c */
        public static boolean m30760c(Context context, int i) {
            if (i == 2) {
                return m30762a(context);
            }
            return m30761b(context);
        }

        @AbstractC5089e
        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            if (is64Bit()) {
                treeSet.add(C5105m.EnumC5107b.AARCH64.toString());
                treeSet.add(C5105m.EnumC5107b.X86_64.toString());
            } else {
                treeSet.add(C5105m.EnumC5107b.ARM.toString());
                treeSet.add(C5105m.EnumC5107b.X86.toString());
            }
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (treeSet.contains(str)) {
                    arrayList.add(str);
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }

        @AbstractC5089e
        public static boolean is64Bit() {
            return Process.is64Bit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m30777a(DataOutput dataOutput, InputStream inputStream, int i, byte[] bArr) {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, 0, Math.min(bArr.length, i - i2));
            if (read == -1) {
                break;
            }
            dataOutput.write(bArr, 0, read);
            i2 += read;
        }
        return i2;
    }

    /* renamed from: b */
    public static void m30776b(File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            Log.e("SysUtil", "Enable write permission failed: " + parentFile);
        }
        if (!file.delete() && file.exists()) {
            throw new IOException("Could not delete file " + file);
        }
    }

    /* renamed from: c */
    public static void m30775c(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    m30775c(file2);
                }
            } else {
                return;
            }
        }
        m30776b(file);
    }

    /* renamed from: d */
    public static void m30774d(FileDescriptor fileDescriptor, long j) {
        LollipopSysdeps.fallocateIfSupported(fileDescriptor, j);
    }

    /* renamed from: e */
    public static int m30773e(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            String str2 = strArr[i];
            if (str2 != null && str.equals(str2)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: f */
    public static void m30772f(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    m30772f(file2);
                }
                return;
            }
            throw new IOException("cannot list directory " + file);
        } else if (!file.getPath().endsWith("_lock")) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable th2) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public static int m30771g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                return packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            }
        }
        return 0;
    }

    /* renamed from: h */
    public static String m30770h(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf > 0) {
            return str.substring(0, lastIndexOf);
        }
        return str;
    }

    /* renamed from: i */
    private static C5103k m30769i(File file, boolean z) {
        if (z) {
            return C5103k.m30734g(file);
        }
        return C5103k.m30733h(file);
    }

    /* renamed from: j */
    public static C5103k m30768j(File file, File file2, boolean z) {
        Throwable th2;
        boolean z2;
        try {
            return m30769i(file2, z);
        } catch (FileNotFoundException e) {
            z2 = true;
            try {
                if (file.setWritable(true)) {
                    C5103k i = m30769i(file2, z);
                    if (!file.setWritable(false)) {
                        Log.w("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
                    }
                    return i;
                }
                throw e;
            } catch (Throwable th3) {
                th2 = th3;
                if (z2 && !file.setWritable(false)) {
                    Log.w("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            z2 = false;
            if (z2) {
                Log.w("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
            }
            throw th2;
        }
    }

    /* renamed from: k */
    public static String[] m30767k() {
        return MarshmallowSysdeps.getSupportedAbis();
    }

    @SuppressLint({"CatchGeneralException"})
    /* renamed from: l */
    public static boolean m30766l() {
        return MarshmallowSysdeps.is64Bit();
    }

    /* renamed from: m */
    public static boolean m30765m(Context context, int i) {
        return MarshmallowSysdeps.m30760c(context, i);
    }

    /* renamed from: n */
    public static void m30764n(File file) {
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException("cannot mkdir: " + file);
        }
    }
}
