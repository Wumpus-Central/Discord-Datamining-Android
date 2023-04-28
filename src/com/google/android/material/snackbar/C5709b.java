package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.b */
/* loaded from: classes3.dex */
class C5709b {

    /* renamed from: e */
    private static C5709b f11197e;

    /* renamed from: a */
    private final Object f11198a = new Object();

    /* renamed from: b */
    private final Handler f11199b = new Handler(Looper.getMainLooper(), new C5710a());

    /* renamed from: c */
    private C5711c f11200c;

    /* renamed from: d */
    private C5711c f11201d;

    /* renamed from: com.google.android.material.snackbar.b$a */
    /* loaded from: classes3.dex */
    class C5710a implements Handler.Callback {
        C5710a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C5709b.this.m27670d((C5711c) message.obj);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.b$b */
    /* loaded from: classes3.dex */
    public interface AbstractC0161b {
        /* renamed from: a */
        void m27660a(int i);

        void show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.snackbar.b$c */
    /* loaded from: classes3.dex */
    public static class C5711c {

        /* renamed from: a */
        final WeakReference<AbstractC0161b> f11203a;

        /* renamed from: b */
        int f11204b;

        /* renamed from: c */
        boolean f11205c;

        /* renamed from: a */
        boolean m27659a(AbstractC0161b bVar) {
            return bVar != null && this.f11203a.get() == bVar;
        }
    }

    private C5709b() {
    }

    /* renamed from: a */
    private boolean m27673a(C5711c cVar, int i) {
        AbstractC0161b bVar = cVar.f11203a.get();
        if (bVar == null) {
            return false;
        }
        this.f11199b.removeCallbacksAndMessages(cVar);
        bVar.m27660a(i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C5709b m27671c() {
        if (f11197e == null) {
            f11197e = new C5709b();
        }
        return f11197e;
    }

    /* renamed from: f */
    private boolean m27668f(AbstractC0161b bVar) {
        C5711c cVar = this.f11200c;
        return cVar != null && cVar.m27659a(bVar);
    }

    /* renamed from: g */
    private boolean m27667g(AbstractC0161b bVar) {
        C5711c cVar = this.f11201d;
        return cVar != null && cVar.m27659a(bVar);
    }

    /* renamed from: l */
    private void m27662l(C5711c cVar) {
        int i = cVar.f11204b;
        if (i != -2) {
            if (i <= 0) {
                if (i == -1) {
                    i = 1500;
                } else {
                    i = 2750;
                }
            }
            this.f11199b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f11199b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i);
        }
    }

    /* renamed from: m */
    private void m27661m() {
        C5711c cVar = this.f11201d;
        if (cVar != null) {
            this.f11200c = cVar;
            this.f11201d = null;
            AbstractC0161b bVar = cVar.f11203a.get();
            if (bVar != null) {
                bVar.show();
            } else {
                this.f11200c = null;
            }
        }
    }

    /* renamed from: b */
    public void m27672b(AbstractC0161b bVar, int i) {
        synchronized (this.f11198a) {
            if (m27668f(bVar)) {
                m27673a(this.f11200c, i);
            } else if (m27667g(bVar)) {
                m27673a(this.f11201d, i);
            }
        }
    }

    /* renamed from: d */
    void m27670d(C5711c cVar) {
        synchronized (this.f11198a) {
            if (this.f11200c == cVar || this.f11201d == cVar) {
                m27673a(cVar, 2);
            }
        }
    }

    /* renamed from: e */
    public boolean m27669e(AbstractC0161b bVar) {
        boolean z;
        synchronized (this.f11198a) {
            if (!m27668f(bVar) && !m27667g(bVar)) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    /* renamed from: h */
    public void m27666h(AbstractC0161b bVar) {
        synchronized (this.f11198a) {
            if (m27668f(bVar)) {
                this.f11200c = null;
                if (this.f11201d != null) {
                    m27661m();
                }
            }
        }
    }

    /* renamed from: i */
    public void m27665i(AbstractC0161b bVar) {
        synchronized (this.f11198a) {
            if (m27668f(bVar)) {
                m27662l(this.f11200c);
            }
        }
    }

    /* renamed from: j */
    public void m27664j(AbstractC0161b bVar) {
        synchronized (this.f11198a) {
            if (m27668f(bVar)) {
                C5711c cVar = this.f11200c;
                if (!cVar.f11205c) {
                    cVar.f11205c = true;
                    this.f11199b.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    /* renamed from: k */
    public void m27663k(AbstractC0161b bVar) {
        synchronized (this.f11198a) {
            if (m27668f(bVar)) {
                C5711c cVar = this.f11200c;
                if (cVar.f11205c) {
                    cVar.f11205c = false;
                    m27662l(cVar);
                }
            }
        }
    }
}
