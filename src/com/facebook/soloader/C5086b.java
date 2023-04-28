package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;

/* renamed from: com.facebook.soloader.b */
/* loaded from: classes7.dex */
public class C5086b extends AbstractC5111q {

    /* renamed from: a */
    private Context f8745a;

    /* renamed from: b */
    private int f8746b;

    /* renamed from: c */
    private C5088d f8747c;

    public C5086b(Context context, int i) {
        Context applicationContext = context.getApplicationContext();
        this.f8745a = applicationContext;
        if (applicationContext == null) {
            Log.w("SoLoader", "context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: " + context.getApplicationInfo().nativeLibraryDir);
            this.f8745a = context;
        }
        this.f8746b = i;
        this.f8747c = new C5088d(new File(this.f8745a.getApplicationInfo().nativeLibraryDir), i);
    }

    /* renamed from: e */
    public static File m30757e(Context context) {
        return new File(context.getApplicationInfo().nativeLibraryDir);
    }

    @Override // com.facebook.soloader.AbstractC5111q
    /* renamed from: a */
    public int mo30710a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return this.f8747c.mo30710a(str, i, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.soloader.AbstractC5111q
    /* renamed from: b */
    public void mo30709b(int i) {
        this.f8747c.mo30709b(i);
    }

    @Override // com.facebook.soloader.AbstractC5111q
    /* renamed from: c */
    public File mo30711c(String str) {
        return this.f8747c.mo30711c(str);
    }

    /* renamed from: d */
    public boolean m30758d() {
        File file = this.f8747c.f8751a;
        Context f = m30756f();
        File e = m30757e(f);
        if (file.equals(e)) {
            return false;
        }
        Log.d("SoLoader", "Native library directory updated from " + file + " to " + e);
        int i = this.f8746b | 1;
        this.f8746b = i;
        C5088d dVar = new C5088d(e, i);
        this.f8747c = dVar;
        dVar.mo30709b(this.f8746b);
        this.f8745a = f;
        return true;
    }

    /* renamed from: f */
    public Context m30756f() {
        try {
            Context context = this.f8745a;
            return context.createPackageContext(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.facebook.soloader.AbstractC5111q
    public String toString() {
        return this.f8747c.toString();
    }
}
