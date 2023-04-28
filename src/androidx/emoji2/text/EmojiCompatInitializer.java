package androidx.emoji2.text;

import android.content.Context;
import androidx.core.p018os.C2458t;
import androidx.emoji2.text.C2863d;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.C3030c;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.C3161a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import p342t1.AbstractC12937a;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements AbstractC12937a<Boolean> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$a */
    /* loaded from: classes.dex */
    public static class C2852a extends C2863d.AbstractC2866c {
        protected C2852a(Context context) {
            super(new C2853b(context));
            m36439b(1);
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    /* loaded from: classes.dex */
    static class C2853b implements C2863d.AbstractC2869g {

        /* renamed from: a */
        private final Context f3824a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b$a */
        /* loaded from: classes.dex */
        public class C2854a extends C2863d.AbstractC2870h {

            /* renamed from: a */
            final /* synthetic */ C2863d.AbstractC2870h f3825a;

            /* renamed from: b */
            final /* synthetic */ ThreadPoolExecutor f3826b;

            C2854a(C2863d.AbstractC2870h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f3825a = hVar;
                this.f3826b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.C2863d.AbstractC2870h
            /* renamed from: a */
            public void mo36437a(Throwable th2) {
                try {
                    this.f3825a.mo36437a(th2);
                } finally {
                    this.f3826b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.C2863d.AbstractC2870h
            /* renamed from: b */
            public void mo36436b(C2887l lVar) {
                try {
                    this.f3825a.mo36436b(lVar);
                } finally {
                    this.f3826b.shutdown();
                }
            }
        }

        C2853b(Context context) {
            this.f3824a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.C2863d.AbstractC2869g
        /* renamed from: a */
        public void mo36397a(final C2863d.AbstractC2870h hVar) {
            final ThreadPoolExecutor b = C2857b.m36481b("EmojiCompatInitializer");
            b.execute(new Runnable() { // from class: androidx.emoji2.text.e
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.C2853b.this.m36483d(hVar, b);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public void m36483d(C2863d.AbstractC2870h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                C2879i a = C2859c.m36477a(this.f3824a);
                if (a != null) {
                    a.m36401c(threadPoolExecutor);
                    a.m36440a().mo36397a(new C2854a(hVar, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th2) {
                hVar.mo36437a(th2);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    /* loaded from: classes.dex */
    public static class RunnableC2855c implements Runnable {
        RunnableC2855c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C2458t.m37717a("EmojiCompat.EmojiCompatInitializer.run");
                if (C2863d.m36458h()) {
                    C2863d.m36464b().m36455k();
                }
            } finally {
                C2458t.m37716b();
            }
        }
    }

    @Override // p342t1.AbstractC12937a
    /* renamed from: a */
    public List<Class<? extends AbstractC12937a<?>>> mo5027a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* renamed from: c */
    public Boolean mo5026b(Context context) {
        C2863d.m36459g(new C2852a(context));
        m36487d(context);
        return Boolean.TRUE;
    }

    /* renamed from: d */
    void m36487d(Context context) {
        final Lifecycle lifecycle = ((LifecycleOwner) C3161a.m35034c(context).m35033d(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.mo35844a(new DefaultLifecycleObserver() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.AbstractC3032e
            public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                C3030c.m35780a(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.AbstractC3032e
            public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
                C3030c.m35779b(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.AbstractC3032e
            public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                C3030c.m35778c(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.AbstractC3032e
            public void onResume(LifecycleOwner lifecycleOwner) {
                EmojiCompatInitializer.this.m36486e();
                lifecycle.mo35842c(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.AbstractC3032e
            public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                C3030c.m35776e(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.AbstractC3032e
            public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                C3030c.m35775f(this, lifecycleOwner);
            }
        });
    }

    /* renamed from: e */
    void m36486e() {
        C2857b.m36479d().postDelayed(new RunnableC2855c(), 500L);
    }
}
