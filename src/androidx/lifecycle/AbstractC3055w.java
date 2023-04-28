package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.w */
/* loaded from: classes.dex */
public abstract class AbstractC3055w {

    /* renamed from: a */
    private final Map<String, Object> f4493a = new HashMap();

    /* renamed from: b */
    private volatile boolean f4494b = false;

    /* renamed from: b */
    private static void m35739b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m35740a() {
        this.f4494b = true;
        Map<String, Object> map = this.f4493a;
        if (map != null) {
            synchronized (map) {
                for (Object obj : this.f4493a.values()) {
                    m35739b(obj);
                }
            }
        }
        mo35717d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public <T> T m35738c(String str) {
        T t;
        Map<String, Object> map = this.f4493a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = (T) this.f4493a.get(str);
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void mo35717d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public <T> T m35737e(String str, T t) {
        Object obj;
        synchronized (this.f4493a) {
            obj = this.f4493a.get(str);
            if (obj == null) {
                this.f4493a.put(str, t);
            }
        }
        if (obj != null) {
            t = obj;
        }
        if (this.f4494b) {
            m35739b(t);
        }
        return t;
    }
}
