package com.facebook.soloader;

import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.soloader.d */
/* loaded from: classes7.dex */
public class C5088d extends AbstractC5111q {

    /* renamed from: a */
    protected final File f8751a;

    /* renamed from: b */
    protected final int f8752b;

    /* renamed from: c */
    protected final List<String> f8753c;

    public C5088d(File file, int i) {
        this(file, i, new String[0]);
    }

    /* renamed from: g */
    private void m30746g(String str, AbstractC5090f fVar, int i, StrictMode.ThreadPolicy threadPolicy) {
        String[] e = m30748e(str, fVar);
        Log.d("SoLoader", "Loading " + str + "'s dependencies: " + Arrays.toString(e));
        for (String str2 : e) {
            if (!str2.startsWith("/")) {
                SoLoader.m30785t(str2, i | 1, threadPolicy);
            }
        }
    }

    @Override // com.facebook.soloader.AbstractC5111q
    /* renamed from: a */
    public int mo30710a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return m30745h(str, i, this.f8751a, threadPolicy);
    }

    @Override // com.facebook.soloader.AbstractC5111q
    /* renamed from: c */
    public File mo30711c(String str) {
        return m30747f(str);
    }

    /* renamed from: d */
    protected AbstractC5090f m30749d(File file) {
        return new C5091g(file);
    }

    /* renamed from: e */
    protected String[] m30748e(String str, AbstractC5090f fVar) {
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
    protected File m30747f(String str) {
        File file = new File(this.f8751a, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public int m30745h(String str, int i, File file, StrictMode.ThreadPolicy threadPolicy) {
        if (SoLoader.f8723b != null) {
            boolean z = false;
            if (this.f8753c.contains(str)) {
                Log.d("SoLoader", str + " is on the denyList, skip loading from " + file.getCanonicalPath());
                return 0;
            }
            File f = m30747f(str);
            if (f == null) {
                Log.v("SoLoader", str + " not found on " + file.getCanonicalPath());
                return 0;
            }
            Log.d("SoLoader", str + " found on " + file.getCanonicalPath());
            if ((i & 1) == 0 || (this.f8752b & 2) == 0) {
                if ((this.f8752b & 1) != 0) {
                    z = true;
                }
                boolean equals = f.getName().equals(str);
                AbstractC5090f fVar = null;
                if (z || !equals) {
                    try {
                        fVar = m30749d(f);
                    } catch (Throwable th2) {
                        if (fVar != null) {
                            fVar.close();
                        }
                        throw th2;
                    }
                }
                if (z) {
                    m30746g(str, fVar, i, threadPolicy);
                } else {
                    Log.d("SoLoader", "Not resolving dependencies for " + str);
                }
                try {
                    if (equals) {
                        SoLoader.f8723b.mo30713a(f.getAbsolutePath(), i);
                    } else {
                        SoLoader.f8723b.mo30712b(f.getAbsolutePath(), fVar, i);
                    }
                    if (fVar != null) {
                        fVar.close();
                    }
                    return 1;
                } catch (UnsatisfiedLinkError e) {
                    if (e.getMessage().contains("bad ELF magic")) {
                        Log.d("SoLoader", "Corrupted lib file detected");
                        if (fVar == null) {
                            return 3;
                        }
                        fVar.close();
                        return 3;
                    }
                    throw e;
                }
            } else {
                Log.d("SoLoader", str + " loaded implicitly");
                return 2;
            }
        } else {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
    }

    @Override // com.facebook.soloader.AbstractC5111q
    public String toString() {
        String str;
        try {
            str = String.valueOf(this.f8751a.getCanonicalPath());
        } catch (IOException unused) {
            str = this.f8751a.getName();
        }
        return getClass().getName() + "[root = " + str + " flags = " + this.f8752b + ']';
    }

    public C5088d(File file, int i, String[] strArr) {
        this.f8751a = file;
        this.f8752b = i;
        this.f8753c = Arrays.asList(strArr);
    }
}
