package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.b */
/* loaded from: classes.dex */
public abstract class AbstractC1486b {

    /* renamed from: a */
    private boolean f619a;

    /* renamed from: b */
    private CopyOnWriteArrayList<AbstractC1485a> f620b = new CopyOnWriteArrayList<>();

    public AbstractC1486b(boolean z) {
        this.f619a = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m41004a(AbstractC1485a aVar) {
        this.f620b.add(aVar);
    }

    /* renamed from: b */
    public abstract void mo25970b();

    /* renamed from: c */
    public final boolean m41003c() {
        return this.f619a;
    }

    /* renamed from: d */
    public final void m41002d() {
        Iterator<AbstractC1485a> it = this.f620b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m41001e(AbstractC1485a aVar) {
        this.f620b.remove(aVar);
    }

    /* renamed from: f */
    public final void m41000f(boolean z) {
        this.f619a = z;
    }
}
