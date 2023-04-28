package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.graphics.C2394d0;
import androidx.core.p018os.C2458t;
import androidx.core.provider.C2469e;
import androidx.core.provider.C2476g;
import androidx.core.util.C2517g;
import androidx.emoji2.text.C2863d;
import androidx.emoji2.text.C2879i;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: androidx.emoji2.text.i */
/* loaded from: classes.dex */
public class C2879i extends C2863d.AbstractC2866c {

    /* renamed from: j */
    private static final C2880a f3889j = new C2880a();

    /* renamed from: androidx.emoji2.text.i$a */
    /* loaded from: classes.dex */
    public static class C2880a {
        /* renamed from: a */
        public Typeface m36400a(Context context, C2476g.C2478b bVar) {
            return C2476g.m37680a(context, null, new C2476g.C2478b[]{bVar});
        }

        /* renamed from: b */
        public C2476g.C2477a m36399b(Context context, C2469e eVar) {
            return C2476g.m37679b(context, null, eVar);
        }

        /* renamed from: c */
        public void m36398c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* renamed from: androidx.emoji2.text.i$b */
    /* loaded from: classes.dex */
    private static class C2881b implements C2863d.AbstractC2869g {

        /* renamed from: a */
        private final Context f3890a;

        /* renamed from: b */
        private final C2469e f3891b;

        /* renamed from: c */
        private final C2880a f3892c;

        /* renamed from: d */
        private final Object f3893d = new Object();

        /* renamed from: e */
        private Handler f3894e;

        /* renamed from: f */
        private Executor f3895f;

        /* renamed from: g */
        private ThreadPoolExecutor f3896g;

        /* renamed from: h */
        C2863d.AbstractC2870h f3897h;

        /* renamed from: i */
        private ContentObserver f3898i;

        /* renamed from: j */
        private Runnable f3899j;

        C2881b(Context context, C2469e eVar, C2880a aVar) {
            C2517g.m37587h(context, "Context cannot be null");
            C2517g.m37587h(eVar, "FontRequest cannot be null");
            this.f3890a = context.getApplicationContext();
            this.f3891b = eVar;
            this.f3892c = aVar;
        }

        /* renamed from: b */
        private void m36396b() {
            synchronized (this.f3893d) {
                this.f3897h = null;
                ContentObserver contentObserver = this.f3898i;
                if (contentObserver != null) {
                    this.f3892c.m36398c(this.f3890a, contentObserver);
                    this.f3898i = null;
                }
                Handler handler = this.f3894e;
                if (handler != null) {
                    handler.removeCallbacks(this.f3899j);
                }
                this.f3894e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f3896g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f3895f = null;
                this.f3896g = null;
            }
        }

        /* renamed from: e */
        private C2476g.C2478b m36393e() {
            try {
                C2476g.C2477a b = this.f3892c.m36399b(this.f3890a, this.f3891b);
                if (b.m37675c() == 0) {
                    C2476g.C2478b[] b2 = b.m37676b();
                    if (b2 != null && b2.length != 0) {
                        return b2[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + b.m37675c() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        @Override // androidx.emoji2.text.C2863d.AbstractC2869g
        /* renamed from: a */
        public void mo36397a(C2863d.AbstractC2870h hVar) {
            C2517g.m37587h(hVar, "LoaderCallback cannot be null");
            synchronized (this.f3893d) {
                this.f3897h = hVar;
            }
            m36394d();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public void m36395c() {
            synchronized (this.f3893d) {
                if (this.f3897h != null) {
                    try {
                        C2476g.C2478b e = m36393e();
                        int b = e.m37673b();
                        if (b == 2) {
                            synchronized (this.f3893d) {
                            }
                        }
                        if (b == 0) {
                            C2458t.m37717a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface a = this.f3892c.m36400a(this.f3890a, e);
                            ByteBuffer f = C2394d0.m37886f(this.f3890a, null, e.m37671d());
                            if (f == null || a == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            C2887l b2 = C2887l.m36382b(a, f);
                            C2458t.m37716b();
                            synchronized (this.f3893d) {
                                C2863d.AbstractC2870h hVar = this.f3897h;
                                if (hVar != null) {
                                    hVar.mo36436b(b2);
                                }
                            }
                            m36396b();
                            return;
                        }
                        throw new RuntimeException("fetchFonts result is not OK. (" + b + ")");
                    } catch (Throwable th2) {
                        synchronized (this.f3893d) {
                            C2863d.AbstractC2870h hVar2 = this.f3897h;
                            if (hVar2 != null) {
                                hVar2.mo36437a(th2);
                            }
                            m36396b();
                        }
                    }
                }
            }
        }

        /* renamed from: d */
        void m36394d() {
            synchronized (this.f3893d) {
                if (this.f3897h != null) {
                    if (this.f3895f == null) {
                        ThreadPoolExecutor b = C2857b.m36481b("emojiCompat");
                        this.f3896g = b;
                        this.f3895f = b;
                    }
                    this.f3895f.execute(new Runnable() { // from class: androidx.emoji2.text.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2879i.C2881b.this.m36395c();
                        }
                    });
                }
            }
        }

        /* renamed from: f */
        public void m36392f(Executor executor) {
            synchronized (this.f3893d) {
                this.f3895f = executor;
            }
        }
    }

    public C2879i(Context context, C2469e eVar) {
        super(new C2881b(context, eVar, f3889j));
    }

    /* renamed from: c */
    public C2879i m36401c(Executor executor) {
        ((C2881b) m36440a()).m36392f(executor);
        return this;
    }
}
