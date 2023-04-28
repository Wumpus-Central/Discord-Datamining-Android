package p291q2;

import android.util.Pair;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import p126h2.C7762i;
import p126h2.C7767k0;
import p126h2.C7781q;
import p343t2.C12945f;

/* renamed from: q2.h */
/* loaded from: classes.dex */
public class C11979h {

    /* renamed from: a */
    private final C11978g f26813a;

    /* renamed from: b */
    private final AbstractC11977f f26814b;

    public C11979h(C11978g gVar, AbstractC11977f fVar) {
        this.f26813a = gVar;
        this.f26814b = fVar;
    }

    /* renamed from: a */
    private C7762i m8080a(String str, String str2) {
        Pair<EnumC11974c, InputStream> a;
        C7767k0<C7762i> k0Var;
        if (str2 == null || (a = this.f26813a.m8086a(str)) == null) {
            return null;
        }
        EnumC11974c cVar = (EnumC11974c) a.first;
        InputStream inputStream = (InputStream) a.second;
        if (cVar == EnumC11974c.ZIP) {
            k0Var = C7781q.m21329y(new ZipInputStream(inputStream), str);
        } else {
            k0Var = C7781q.m21339o(inputStream, str);
        }
        if (k0Var.m21379b() != null) {
            return k0Var.m21379b();
        }
        return null;
    }

    /* renamed from: b */
    private C7767k0<C7762i> m8079b(String str, String str2) {
        boolean z;
        C12945f.m5011a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                AbstractC11975d a = this.f26814b.mo8087a(str);
                if (a.mo8090X()) {
                    C7767k0<C7762i> d = m8077d(str, a.mo8091L(), a.mo8092I(), str2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Completed fetch from network. Success: ");
                    if (d.m21379b() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sb2.append(z);
                    C12945f.m5011a(sb2.toString());
                    try {
                        a.close();
                    } catch (IOException e) {
                        C12945f.m5008d("LottieFetchResult close failed ", e);
                    }
                    return d;
                }
                C7767k0<C7762i> k0Var = new C7767k0<>(new IllegalArgumentException(a.mo8089k0()));
                try {
                    a.close();
                } catch (IOException e2) {
                    C12945f.m5008d("LottieFetchResult close failed ", e2);
                }
                return k0Var;
            } catch (Exception e3) {
                C7767k0<C7762i> k0Var2 = new C7767k0<>(e3);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e4) {
                        C12945f.m5008d("LottieFetchResult close failed ", e4);
                    }
                }
                return k0Var2;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e5) {
                    C12945f.m5008d("LottieFetchResult close failed ", e5);
                }
            }
            throw th2;
        }
    }

    /* renamed from: d */
    private C7767k0<C7762i> m8077d(String str, InputStream inputStream, String str2, String str3) {
        EnumC11974c cVar;
        C7767k0<C7762i> k0Var;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            C12945f.m5011a("Handling zip response.");
            cVar = EnumC11974c.ZIP;
            k0Var = m8075f(str, inputStream, str3);
        } else {
            C12945f.m5011a("Received json response.");
            cVar = EnumC11974c.JSON;
            k0Var = m8076e(str, inputStream, str3);
        }
        if (!(str3 == null || k0Var.m21379b() == null)) {
            this.f26813a.m8082e(str, cVar);
        }
        return k0Var;
    }

    /* renamed from: e */
    private C7767k0<C7762i> m8076e(String str, InputStream inputStream, String str2) {
        if (str2 == null) {
            return C7781q.m21339o(inputStream, null);
        }
        return C7781q.m21339o(new FileInputStream(this.f26813a.m8081f(str, inputStream, EnumC11974c.JSON).getAbsolutePath()), str);
    }

    /* renamed from: f */
    private C7767k0<C7762i> m8075f(String str, InputStream inputStream, String str2) {
        if (str2 == null) {
            return C7781q.m21329y(new ZipInputStream(inputStream), null);
        }
        return C7781q.m21329y(new ZipInputStream(new FileInputStream(this.f26813a.m8081f(str, inputStream, EnumC11974c.ZIP))), str);
    }

    /* renamed from: c */
    public C7767k0<C7762i> m8078c(String str, String str2) {
        C7762i a = m8080a(str, str2);
        if (a != null) {
            return new C7767k0<>(a);
        }
        C12945f.m5011a("Animation for " + str + " not found in cache. Fetching from network.");
        return m8079b(str, str2);
    }
}
