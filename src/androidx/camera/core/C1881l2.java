package androidx.camera.core;

import android.util.SparseArray;
import androidx.concurrent.futures.C2114c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p120gc.AbstractFutureC7576b;
import p390w.AbstractC13629l1;

/* renamed from: androidx.camera.core.l2 */
/* loaded from: classes.dex */
final class C1881l2 implements AbstractC13629l1 {

    /* renamed from: e */
    private final List<Integer> f1877e;

    /* renamed from: f */
    private String f1878f;

    /* renamed from: a */
    final Object f1873a = new Object();

    /* renamed from: b */
    final SparseArray<C2114c.C2115a<ImageProxy>> f1874b = new SparseArray<>();

    /* renamed from: c */
    private final SparseArray<AbstractFutureC7576b<ImageProxy>> f1875c = new SparseArray<>();

    /* renamed from: d */
    private final List<ImageProxy> f1876d = new ArrayList();

    /* renamed from: g */
    private boolean f1879g = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.l2$a */
    /* loaded from: classes.dex */
    public class C1882a implements C2114c.AbstractC0030c<ImageProxy> {

        /* renamed from: a */
        final /* synthetic */ int f1880a;

        C1882a(int i) {
            this.f1880a = i;
        }

        @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
        /* renamed from: a */
        public Object mo1403a(C2114c.C2115a<ImageProxy> aVar) {
            synchronized (C1881l2.this.f1873a) {
                C1881l2.this.f1874b.put(this.f1880a, aVar);
            }
            return "getImageProxy(id: " + this.f1880a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1881l2(List<Integer> list, String str) {
        this.f1877e = list;
        this.f1878f = str;
        m39600f();
    }

    /* renamed from: f */
    private void m39600f() {
        synchronized (this.f1873a) {
            for (Integer num : this.f1877e) {
                int intValue = num.intValue();
                this.f1875c.put(intValue, C2114c.m38964a(new C1882a(intValue)));
            }
        }
    }

    @Override // p390w.AbstractC13629l1
    /* renamed from: a */
    public List<Integer> mo3127a() {
        return Collections.unmodifiableList(this.f1877e);
    }

    @Override // p390w.AbstractC13629l1
    /* renamed from: b */
    public AbstractFutureC7576b<ImageProxy> mo3126b(int i) {
        AbstractFutureC7576b<ImageProxy> bVar;
        synchronized (this.f1873a) {
            if (!this.f1879g) {
                bVar = this.f1875c.get(i);
                if (bVar == null) {
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + i);
                }
            } else {
                throw new IllegalStateException("ImageProxyBundle already closed.");
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m39603c(ImageProxy imageProxy) {
        synchronized (this.f1873a) {
            if (!this.f1879g) {
                Integer num = (Integer) imageProxy.mo39604p0().mo343c().m3089c(this.f1878f);
                if (num != null) {
                    C2114c.C2115a<ImageProxy> aVar = this.f1874b.get(num.intValue());
                    if (aVar != null) {
                        this.f1876d.add(imageProxy);
                        aVar.m38961c(imageProxy);
                        return;
                    }
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + num);
                }
                throw new IllegalArgumentException("CaptureId is null.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m39602d() {
        synchronized (this.f1873a) {
            if (!this.f1879g) {
                for (ImageProxy imageProxy : this.f1876d) {
                    imageProxy.close();
                }
                this.f1876d.clear();
                this.f1875c.clear();
                this.f1874b.clear();
                this.f1879g = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m39601e() {
        synchronized (this.f1873a) {
            if (!this.f1879g) {
                for (ImageProxy imageProxy : this.f1876d) {
                    imageProxy.close();
                }
                this.f1876d.clear();
                this.f1875c.clear();
                this.f1874b.clear();
                m39600f();
            }
        }
    }
}
