package p081e9;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p081e9.AbstractC6769e;
import p119g9.C7510a;

/* renamed from: e9.e */
/* loaded from: classes5.dex */
public interface AbstractC6769e {

    /* renamed from: e9.e$a */
    /* loaded from: classes5.dex */
    public interface AbstractC6770a {

        /* renamed from: e9.e$a$a */
        /* loaded from: classes5.dex */
        public static final class C0205a {

            /* renamed from: a */
            private final CopyOnWriteArrayList<C0206a> f14428a = new CopyOnWriteArrayList<>();

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e9.e$a$a$a */
            /* loaded from: classes5.dex */
            public static final class C0206a {

                /* renamed from: a */
                private final Handler f14429a;

                /* renamed from: b */
                private final AbstractC6770a f14430b;

                /* renamed from: c */
                private boolean f14431c;

                public C0206a(Handler handler, AbstractC6770a aVar) {
                    this.f14429a = handler;
                    this.f14430b = aVar;
                }

                /* renamed from: d */
                public void m24361d() {
                    this.f14431c = true;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: d */
            public static /* synthetic */ void m24366d(C0206a aVar, int i, long j, long j2) {
                aVar.f14430b.mo23555i(i, j, j2);
            }

            /* renamed from: b */
            public void m24368b(Handler handler, AbstractC6770a aVar) {
                C7510a.m22367e(handler);
                C7510a.m22367e(aVar);
                m24365e(aVar);
                this.f14428a.add(new C0206a(handler, aVar));
            }

            /* renamed from: c */
            public void m24367c(final int i, final long j, final long j2) {
                Iterator<C0206a> it = this.f14428a.iterator();
                while (it.hasNext()) {
                    final C0206a next = it.next();
                    if (!next.f14431c) {
                        next.f14429a.post(new Runnable() { // from class: e9.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                AbstractC6769e.AbstractC6770a.C0205a.m24366d(AbstractC6769e.AbstractC6770a.C0205a.C0206a.this, i, j, j2);
                            }
                        });
                    }
                }
            }

            /* renamed from: e */
            public void m24365e(AbstractC6770a aVar) {
                Iterator<C0206a> it = this.f14428a.iterator();
                while (it.hasNext()) {
                    C0206a next = it.next();
                    if (next.f14430b == aVar) {
                        next.m24361d();
                        this.f14428a.remove(next);
                    }
                }
            }
        }

        /* renamed from: i */
        void mo23555i(int i, long j, long j2);
    }

    /* renamed from: a */
    void mo24343a(AbstractC6770a aVar);

    /* renamed from: c */
    AbstractC6795x mo24342c();

    /* renamed from: d */
    long mo24341d();

    /* renamed from: g */
    void mo24340g(Handler handler, AbstractC6770a aVar);
}
