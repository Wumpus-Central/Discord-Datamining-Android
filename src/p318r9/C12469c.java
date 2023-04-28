package p318r9;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import p420x9.C14004p;

/* renamed from: r9.c */
/* loaded from: classes5.dex */
public class C12469c {

    /* renamed from: c */
    private static final Lock f28127c = new ReentrantLock();

    /* renamed from: d */
    private static C12469c f28128d;

    /* renamed from: a */
    private final Lock f28129a = new ReentrantLock();

    /* renamed from: b */
    private final SharedPreferences f28130b;

    C12469c(Context context) {
        this.f28130b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: b */
    public static C12469c m6649b(Context context) {
        C14004p.m2051j(context);
        Lock lock = f28127c;
        lock.lock();
        try {
            if (f28128d == null) {
                f28128d = new C12469c(context.getApplicationContext());
            }
            C12469c cVar = f28128d;
            lock.unlock();
            return cVar;
        } catch (Throwable th2) {
            f28127c.unlock();
            throw th2;
        }
    }

    /* renamed from: i */
    private static final String m6642i(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: a */
    public void m6650a() {
        this.f28129a.lock();
        try {
            this.f28130b.edit().clear().apply();
        } finally {
            this.f28129a.unlock();
        }
    }

    /* renamed from: c */
    public GoogleSignInAccount m6648c() {
        String g;
        String g2 = m6644g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = m6644g(m6642i("googleSignInAccount", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m29167U(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public GoogleSignInOptions m6647d() {
        String g;
        String g2 = m6644g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = m6644g(m6642i("googleSignInOptions", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.m29155T(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public String m6646e() {
        return m6644g("refreshToken");
    }

    /* renamed from: f */
    public void m6645f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        C14004p.m2051j(googleSignInAccount);
        C14004p.m2051j(googleSignInOptions);
        m6643h("defaultGoogleSignInAccount", googleSignInAccount.m29166V());
        C14004p.m2051j(googleSignInAccount);
        C14004p.m2051j(googleSignInOptions);
        String V = googleSignInAccount.m29166V();
        m6643h(m6642i("googleSignInAccount", V), googleSignInAccount.m29165W());
        m6643h(m6642i("googleSignInOptions", V), googleSignInOptions.m29151X());
    }

    /* renamed from: g */
    protected final String m6644g(String str) {
        this.f28129a.lock();
        try {
            return this.f28130b.getString(str, null);
        } finally {
            this.f28129a.unlock();
        }
    }

    /* renamed from: h */
    protected final void m6643h(String str, String str2) {
        this.f28129a.lock();
        try {
            this.f28130b.edit().putString(str, str2).apply();
        } finally {
            this.f28129a.unlock();
        }
    }
}
