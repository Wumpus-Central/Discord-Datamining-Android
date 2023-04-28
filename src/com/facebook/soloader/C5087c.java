package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.soloader.SysUtil;
import java.io.File;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.facebook.soloader.c */
/* loaded from: classes7.dex */
public class C5087c extends AbstractC5111q {

    /* renamed from: a */
    private final Map<String, Set<String>> f8748a = new HashMap();

    /* renamed from: b */
    private final Set<String> f8749b;

    /* renamed from: c */
    private final File f8750c;

    public C5087c(Context context) {
        String str = context.getApplicationInfo().sourceDir;
        this.f8749b = m30753f("", str);
        this.f8750c = new File(str);
    }

    /* renamed from: d */
    private synchronized void m30755d(String str, String str2) {
        if (!this.f8748a.containsKey(str)) {
            this.f8748a.put(str, new HashSet());
        }
        this.f8748a.get(str).add(str2);
    }

    /* renamed from: e */
    private static String[] m30754e(String str, AbstractC5090f fVar) {
        boolean z = SoLoader.f8722a;
        if (z) {
            Api18TraceUtils.m30807a("SoLoader.getElfDependencies[", str, "]");
        }
        try {
            String[] b = C5108n.m30720b(str, fVar);
            if (z) {
                Api18TraceUtils.m30806b();
            }
            return b;
        } catch (Throwable th2) {
            if (SoLoader.f8722a) {
                Api18TraceUtils.m30806b();
            }
            throw th2;
        }
    }

    /* renamed from: f */
    static Set<String> m30753f(String str, String str2) {
        String g;
        String[] split;
        HashSet hashSet = new HashSet();
        String a = SysUtil.Api14Utils.m30763a();
        if (a != null) {
            for (String str3 : a.split(":")) {
                if (str3.contains(str + ".apk!/")) {
                    hashSet.add(str3);
                }
            }
        }
        if (hashSet.isEmpty() && (g = m30752g(str2)) != null) {
            hashSet.add(g);
        }
        return hashSet;
    }

    /* renamed from: g */
    private static String m30752g(String str) {
        String[] k = SysUtil.m30767k();
        if (TextUtils.isEmpty(str) || k.length <= 0) {
            return null;
        }
        return str + "!/lib/" + k[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
        r2 = new com.facebook.soloader.C5092h(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        r8 = m30754e(r8, r2);
        r3 = r8.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r4 >= r3) goto L_0x0052;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        r5 = r8[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        if (r5.startsWith("/") == false) goto L_0x004a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        com.facebook.soloader.SoLoader.m30785t(r5, r9 | 1, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        r2.close();
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m30750i(java.lang.String r8, int r9, android.os.StrictMode.ThreadPolicy r10) {
        /*
            r7 = this;
            java.lang.String r0 = "/"
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile
            java.io.File r2 = r7.f8750c
            r1.<init>(r2)
            java.util.Enumeration r2 = r1.entries()     // Catch: all -> 0x0064
        L_0x000d:
            boolean r3 = r2.hasMoreElements()     // Catch: all -> 0x0064
            if (r3 == 0) goto L_0x0060
            java.lang.Object r3 = r2.nextElement()     // Catch: all -> 0x0064
            java.util.zip.ZipEntry r3 = (java.util.zip.ZipEntry) r3     // Catch: all -> 0x0064
            if (r3 == 0) goto L_0x000d
            java.lang.String r4 = r3.getName()     // Catch: all -> 0x0064
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: all -> 0x0064
            r5.<init>()     // Catch: all -> 0x0064
            r5.append(r0)     // Catch: all -> 0x0064
            r5.append(r8)     // Catch: all -> 0x0064
            java.lang.String r5 = r5.toString()     // Catch: all -> 0x0064
            boolean r4 = r4.endsWith(r5)     // Catch: all -> 0x0064
            if (r4 == 0) goto L_0x000d
            com.facebook.soloader.h r2 = new com.facebook.soloader.h     // Catch: all -> 0x0064
            r2.<init>(r1, r3)     // Catch: all -> 0x0064
            java.lang.String[] r8 = m30754e(r8, r2)     // Catch: all -> 0x0056
            int r3 = r8.length     // Catch: all -> 0x0056
            r4 = 0
        L_0x003f:
            if (r4 >= r3) goto L_0x0052
            r5 = r8[r4]     // Catch: all -> 0x0056
            boolean r6 = r5.startsWith(r0)     // Catch: all -> 0x0056
            if (r6 == 0) goto L_0x004a
            goto L_0x004f
        L_0x004a:
            r6 = r9 | 1
            com.facebook.soloader.SoLoader.m30785t(r5, r6, r10)     // Catch: all -> 0x0056
        L_0x004f:
            int r4 = r4 + 1
            goto L_0x003f
        L_0x0052:
            r2.close()     // Catch: all -> 0x0064
            goto L_0x0060
        L_0x0056:
            r8 = move-exception
            r2.close()     // Catch: all -> 0x005b
            goto L_0x005f
        L_0x005b:
            r9 = move-exception
            r8.addSuppressed(r9)     // Catch: all -> 0x0064
        L_0x005f:
            throw r8     // Catch: all -> 0x0064
        L_0x0060:
            r1.close()
            return
        L_0x0064:
            r8 = move-exception
            r1.close()     // Catch: all -> 0x0069
            goto L_0x006d
        L_0x0069:
            r9 = move-exception
            r8.addSuppressed(r9)
        L_0x006d:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C5087c.m30750i(java.lang.String, int, android.os.StrictMode$ThreadPolicy):void");
    }

    @Override // com.facebook.soloader.AbstractC5111q
    /* renamed from: a */
    public int mo30710a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        if (SoLoader.f8723b != null) {
            for (String str2 : this.f8749b) {
                Set<String> set = this.f8748a.get(str2);
                if (TextUtils.isEmpty(str2) || set == null || !set.contains(str)) {
                    Log.v("SoLoader", str + " not found on " + str2);
                } else {
                    m30750i(str, i, threadPolicy);
                    try {
                        i |= 4;
                        SoLoader.f8723b.mo30713a(str2 + File.separator + str, i);
                        Log.d("SoLoader", str + " found on " + str2);
                        return 1;
                    } catch (UnsatisfiedLinkError e) {
                        Log.w("SoLoader", str + " not found on " + str2 + " flag: " + i, e);
                    }
                }
            }
            return 0;
        }
        throw new IllegalStateException("SoLoader.init() not yet called");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.soloader.AbstractC5111q
    /* renamed from: b */
    public void mo30709b(int i) {
        int indexOf;
        int i2;
        String str = null;
        for (String str2 : this.f8749b) {
            if (!TextUtils.isEmpty(str2) && (indexOf = str2.indexOf(33)) >= 0 && (i2 = indexOf + 2) < str2.length()) {
                str = str2.substring(i2);
            }
            if (!TextUtils.isEmpty(str)) {
                ZipFile zipFile = new ZipFile(this.f8750c);
                try {
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    while (entries.hasMoreElements()) {
                        ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                        if (zipEntry != null && zipEntry.getName().startsWith(str) && zipEntry.getName().endsWith(".so") && zipEntry.getMethod() == 0) {
                            m30755d(str2, zipEntry.getName().substring(str.length() + 1));
                        }
                    }
                    zipFile.close();
                } catch (Throwable th2) {
                    try {
                        zipFile.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    }

    @Override // com.facebook.soloader.AbstractC5111q
    /* renamed from: c */
    public File mo30711c(String str) {
        throw new UnsupportedOperationException("DirectAPKSoSource doesn't support unpackLibrary");
    }

    /* renamed from: h */
    public boolean m30751h() {
        return !this.f8749b.isEmpty();
    }

    @Override // com.facebook.soloader.AbstractC5111q
    public String toString() {
        return getClass().getName() + "[root = " + this.f8749b.toString() + ']';
    }

    public C5087c(File file) {
        this.f8749b = m30753f(SysUtil.m30770h(file.getName()), file.getAbsolutePath());
        this.f8750c = file;
    }
}
