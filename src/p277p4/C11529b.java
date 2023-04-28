package p277p4;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import p277p4.AbstractC11528a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p4.b */
/* loaded from: classes7.dex */
public class C11529b extends AbstractC11528a {

    /* renamed from: b */
    private final Object f25719b = new Object();

    /* renamed from: f */
    private final Runnable f25723f = new RunnableC11530a();

    /* renamed from: d */
    private ArrayList<AbstractC11528a.AbstractC0367a> f25721d = new ArrayList<>();

    /* renamed from: e */
    private ArrayList<AbstractC11528a.AbstractC0367a> f25722e = new ArrayList<>();

    /* renamed from: c */
    private final Handler f25720c = new Handler(Looper.getMainLooper());

    /* renamed from: p4.b$a */
    /* loaded from: classes7.dex */
    class RunnableC11530a implements Runnable {
        RunnableC11530a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C11529b.this.f25719b) {
                ArrayList arrayList = C11529b.this.f25722e;
                C11529b bVar = C11529b.this;
                bVar.f25722e = bVar.f25721d;
                C11529b.this.f25721d = arrayList;
            }
            int size = C11529b.this.f25722e.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC11528a.AbstractC0367a) C11529b.this.f25722e.get(i)).release();
            }
            C11529b.this.f25722e.clear();
        }
    }

    @Override // p277p4.AbstractC11528a
    /* renamed from: a */
    public void mo9449a(AbstractC11528a.AbstractC0367a aVar) {
        synchronized (this.f25719b) {
            this.f25721d.remove(aVar);
        }
    }

    @Override // p277p4.AbstractC11528a
    /* renamed from: d */
    public void mo9448d(AbstractC11528a.AbstractC0367a aVar) {
        if (!AbstractC11528a.m9450c()) {
            aVar.release();
            return;
        }
        synchronized (this.f25719b) {
            if (!this.f25721d.contains(aVar)) {
                this.f25721d.add(aVar);
                boolean z = true;
                if (this.f25721d.size() != 1) {
                    z = false;
                }
                if (z) {
                    this.f25720c.post(this.f25723f);
                }
            }
        }
    }
}
