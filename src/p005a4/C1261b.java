package p005a4;

import java.lang.ref.SoftReference;

/* renamed from: a4.b */
/* loaded from: classes7.dex */
public class C1261b<T> {

    /* renamed from: a */
    SoftReference<T> f122a = null;

    /* renamed from: b */
    SoftReference<T> f123b = null;

    /* renamed from: c */
    SoftReference<T> f124c = null;

    /* renamed from: a */
    public void m41516a() {
        SoftReference<T> softReference = this.f122a;
        if (softReference != null) {
            softReference.clear();
            this.f122a = null;
        }
        SoftReference<T> softReference2 = this.f123b;
        if (softReference2 != null) {
            softReference2.clear();
            this.f123b = null;
        }
        SoftReference<T> softReference3 = this.f124c;
        if (softReference3 != null) {
            softReference3.clear();
            this.f124c = null;
        }
    }

    /* renamed from: b */
    public T m41515b() {
        SoftReference<T> softReference = this.f122a;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    /* renamed from: c */
    public void m41514c(T t) {
        this.f122a = new SoftReference<>(t);
        this.f123b = new SoftReference<>(t);
        this.f124c = new SoftReference<>(t);
    }
}
