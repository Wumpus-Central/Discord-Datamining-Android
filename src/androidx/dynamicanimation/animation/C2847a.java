package androidx.dynamicanimation.animation;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.dynamicanimation.animation.a */
/* loaded from: classes.dex */
public class C2847a {

    /* renamed from: g */
    public static final ThreadLocal<C2847a> f3800g = new ThreadLocal<>();

    /* renamed from: d */
    private AbstractC2849c f3804d;

    /* renamed from: a */
    private final SimpleArrayMap<AbstractC2848b, Long> f3801a = new SimpleArrayMap<>();

    /* renamed from: b */
    final ArrayList<AbstractC2848b> f3802b = new ArrayList<>();

    /* renamed from: c */
    private final C0049a f3803c = new C0049a();

    /* renamed from: e */
    long f3805e = 0;

    /* renamed from: f */
    private boolean f3806f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.dynamicanimation.animation.a$a */
    /* loaded from: classes.dex */
    public class C0049a {
        C0049a() {
        }

        /* renamed from: a */
        void m36499a() {
            C2847a.this.f3805e = SystemClock.uptimeMillis();
            C2847a aVar = C2847a.this;
            aVar.m36504c(aVar.f3805e);
            if (C2847a.this.f3802b.size() > 0) {
                C2847a.this.m36502e().mo36497a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.dynamicanimation.animation.a$b */
    /* loaded from: classes.dex */
    public interface AbstractC2848b {
        /* renamed from: a */
        boolean mo36498a(long j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.dynamicanimation.animation.a$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2849c {

        /* renamed from: a */
        final C0049a f3808a;

        AbstractC2849c(C0049a aVar) {
            this.f3808a = aVar;
        }

        /* renamed from: a */
        abstract void mo36497a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.dynamicanimation.animation.a$d */
    /* loaded from: classes.dex */
    public static class C2850d extends AbstractC2849c {

        /* renamed from: b */
        private final Choreographer f3809b = Choreographer.getInstance();

        /* renamed from: c */
        private final Choreographer.FrameCallback f3810c = new Choreographer$FrameCallbackC0050a();

        /* renamed from: androidx.dynamicanimation.animation.a$d$a */
        /* loaded from: classes.dex */
        class Choreographer$FrameCallbackC0050a implements Choreographer.FrameCallback {
            Choreographer$FrameCallbackC0050a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                C2850d.this.f3808a.m36499a();
            }
        }

        C2850d(C0049a aVar) {
            super(aVar);
        }

        @Override // androidx.dynamicanimation.animation.C2847a.AbstractC2849c
        /* renamed from: a */
        void mo36497a() {
            this.f3809b.postFrameCallback(this.f3810c);
        }
    }

    C2847a() {
    }

    /* renamed from: b */
    private void m36505b() {
        if (this.f3806f) {
            for (int size = this.f3802b.size() - 1; size >= 0; size--) {
                if (this.f3802b.get(size) == null) {
                    this.f3802b.remove(size);
                }
            }
            this.f3806f = false;
        }
    }

    /* renamed from: d */
    public static C2847a m36503d() {
        ThreadLocal<C2847a> threadLocal = f3800g;
        if (threadLocal.get() == null) {
            threadLocal.set(new C2847a());
        }
        return threadLocal.get();
    }

    /* renamed from: f */
    private boolean m36501f(AbstractC2848b bVar, long j) {
        Long l = this.f3801a.get(bVar);
        if (l == null) {
            return true;
        }
        if (l.longValue() >= j) {
            return false;
        }
        this.f3801a.remove(bVar);
        return true;
    }

    /* renamed from: a */
    public void m36506a(AbstractC2848b bVar, long j) {
        if (this.f3802b.size() == 0) {
            m36502e().mo36497a();
        }
        if (!this.f3802b.contains(bVar)) {
            this.f3802b.add(bVar);
        }
        if (j > 0) {
            this.f3801a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    /* renamed from: c */
    void m36504c(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.f3802b.size(); i++) {
            AbstractC2848b bVar = this.f3802b.get(i);
            if (bVar != null && m36501f(bVar, uptimeMillis)) {
                bVar.mo36498a(j);
            }
        }
        m36505b();
    }

    /* renamed from: e */
    AbstractC2849c m36502e() {
        if (this.f3804d == null) {
            this.f3804d = new C2850d(this.f3803c);
        }
        return this.f3804d;
    }

    /* renamed from: g */
    public void m36500g(AbstractC2848b bVar) {
        this.f3801a.remove(bVar);
        int indexOf = this.f3802b.indexOf(bVar);
        if (indexOf >= 0) {
            this.f3802b.set(indexOf, null);
            this.f3806f = true;
        }
    }
}
