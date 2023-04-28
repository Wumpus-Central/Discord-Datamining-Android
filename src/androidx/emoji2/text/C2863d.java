package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.collection.C2095b;
import androidx.core.util.C2517g;
import androidx.emoji2.text.C2874g;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: androidx.emoji2.text.d */
/* loaded from: classes.dex */
public class C2863d {

    /* renamed from: n */
    private static final Object f3830n = new Object();

    /* renamed from: o */
    private static final Object f3831o = new Object();

    /* renamed from: p */
    private static volatile C2863d f3832p;

    /* renamed from: b */
    private final Set<AbstractC2867e> f3834b;

    /* renamed from: e */
    private final C2865b f3837e;

    /* renamed from: f */
    final AbstractC2869g f3838f;

    /* renamed from: g */
    final boolean f3839g;

    /* renamed from: h */
    final boolean f3840h;

    /* renamed from: i */
    final int[] f3841i;

    /* renamed from: j */
    private final boolean f3842j;

    /* renamed from: k */
    private final int f3843k;

    /* renamed from: l */
    private final int f3844l;

    /* renamed from: m */
    private final AbstractC0053d f3845m;

    /* renamed from: a */
    private final ReadWriteLock f3833a = new ReentrantReadWriteLock();

    /* renamed from: c */
    private volatile int f3835c = 3;

    /* renamed from: d */
    private final Handler f3836d = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.emoji2.text.d$a */
    /* loaded from: classes.dex */
    private static final class C2864a extends C2865b {

        /* renamed from: b */
        private volatile C2874g f3846b;

        /* renamed from: c */
        private volatile C2887l f3847c;

        /* renamed from: androidx.emoji2.text.d$a$a */
        /* loaded from: classes.dex */
        class C0052a extends AbstractC2870h {
            C0052a() {
            }

            @Override // androidx.emoji2.text.C2863d.AbstractC2870h
            /* renamed from: a */
            public void mo36437a(Throwable th2) {
                C2864a.this.f3849a.m36453m(th2);
            }

            @Override // androidx.emoji2.text.C2863d.AbstractC2870h
            /* renamed from: b */
            public void mo36436b(C2887l lVar) {
                C2864a.this.m36444d(lVar);
            }
        }

        C2864a(C2863d dVar) {
            super(dVar);
        }

        @Override // androidx.emoji2.text.C2863d.C2865b
        /* renamed from: a */
        void mo36443a() {
            try {
                this.f3849a.f3838f.mo36397a(new C0052a());
            } catch (Throwable th2) {
                this.f3849a.m36453m(th2);
            }
        }

        @Override // androidx.emoji2.text.C2863d.C2865b
        /* renamed from: b */
        CharSequence mo36442b(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.f3846b.m36416h(charSequence, i, i2, i3, z);
        }

        @Override // androidx.emoji2.text.C2863d.C2865b
        /* renamed from: c */
        void mo36441c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f3847c.m36379e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f3849a.f3839g);
        }

        /* renamed from: d */
        void m36444d(C2887l lVar) {
            if (lVar == null) {
                this.f3849a.m36453m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f3847c = lVar;
            C2887l lVar2 = this.f3847c;
            C2871i iVar = new C2871i();
            AbstractC0053d dVar = this.f3849a.f3845m;
            C2863d dVar2 = this.f3849a;
            this.f3846b = new C2874g(lVar2, iVar, dVar, dVar2.f3840h, dVar2.f3841i);
            this.f3849a.m36452n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.emoji2.text.d$b */
    /* loaded from: classes.dex */
    public static class C2865b {

        /* renamed from: a */
        final C2863d f3849a;

        C2865b(C2863d dVar) {
            this.f3849a = dVar;
        }

        /* renamed from: a */
        void mo36443a() {
            throw null;
        }

        /* renamed from: b */
        CharSequence mo36442b(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            throw null;
        }

        /* renamed from: c */
        void mo36441c(EditorInfo editorInfo) {
            throw null;
        }
    }

    /* renamed from: androidx.emoji2.text.d$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2866c {

        /* renamed from: a */
        final AbstractC2869g f3850a;

        /* renamed from: b */
        boolean f3851b;

        /* renamed from: c */
        boolean f3852c;

        /* renamed from: d */
        int[] f3853d;

        /* renamed from: e */
        Set<AbstractC2867e> f3854e;

        /* renamed from: f */
        boolean f3855f;

        /* renamed from: g */
        int f3856g = -16711936;

        /* renamed from: h */
        int f3857h = 0;

        /* renamed from: i */
        AbstractC0053d f3858i = new C2874g.C2876b();

        /* JADX INFO: Access modifiers changed from: protected */
        public AbstractC2866c(AbstractC2869g gVar) {
            C2517g.m37587h(gVar, "metadataLoader cannot be null.");
            this.f3850a = gVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public final AbstractC2869g m36440a() {
            return this.f3850a;
        }

        /* renamed from: b */
        public AbstractC2866c m36439b(int i) {
            this.f3857h = i;
            return this;
        }
    }

    /* renamed from: androidx.emoji2.text.d$d */
    /* loaded from: classes.dex */
    public interface AbstractC0053d {
        /* renamed from: a */
        boolean mo36413a(CharSequence charSequence, int i, int i2, int i3);
    }

    /* renamed from: androidx.emoji2.text.d$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2867e {
        /* renamed from: a */
        public void mo36438a(Throwable th2) {
        }

        /* renamed from: b */
        public void mo13601b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.emoji2.text.d$f */
    /* loaded from: classes.dex */
    public static class RunnableC2868f implements Runnable {

        /* renamed from: k */
        private final List<AbstractC2867e> f3859k;

        /* renamed from: l */
        private final Throwable f3860l;

        /* renamed from: m */
        private final int f3861m;

        RunnableC2868f(AbstractC2867e eVar, int i) {
            this(Arrays.asList((AbstractC2867e) C2517g.m37587h(eVar, "initCallback cannot be null")), i, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f3859k.size();
            int i = 0;
            if (this.f3861m != 1) {
                while (i < size) {
                    this.f3859k.get(i).mo36438a(this.f3860l);
                    i++;
                }
                return;
            }
            while (i < size) {
                this.f3859k.get(i).mo13601b();
                i++;
            }
        }

        RunnableC2868f(Collection<AbstractC2867e> collection, int i) {
            this(collection, i, null);
        }

        RunnableC2868f(Collection<AbstractC2867e> collection, int i, Throwable th2) {
            C2517g.m37587h(collection, "initCallbacks cannot be null");
            this.f3859k = new ArrayList(collection);
            this.f3861m = i;
            this.f3860l = th2;
        }
    }

    /* renamed from: androidx.emoji2.text.d$g */
    /* loaded from: classes.dex */
    public interface AbstractC2869g {
        /* renamed from: a */
        void mo36397a(AbstractC2870h hVar);
    }

    /* renamed from: androidx.emoji2.text.d$h */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2870h {
        /* renamed from: a */
        public abstract void mo36437a(Throwable th2);

        /* renamed from: b */
        public abstract void mo36436b(C2887l lVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.emoji2.text.d$i */
    /* loaded from: classes.dex */
    public static class C2871i {
        C2871i() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public AbstractC2878h m36435a(C2873f fVar) {
            return new C2891n(fVar);
        }
    }

    private C2863d(AbstractC2866c cVar) {
        this.f3839g = cVar.f3851b;
        this.f3840h = cVar.f3852c;
        this.f3841i = cVar.f3853d;
        this.f3842j = cVar.f3855f;
        this.f3843k = cVar.f3856g;
        this.f3838f = cVar.f3850a;
        this.f3844l = cVar.f3857h;
        this.f3845m = cVar.f3858i;
        C2095b bVar = new C2095b();
        this.f3834b = bVar;
        Set<AbstractC2867e> set = cVar.f3854e;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f3854e);
        }
        this.f3837e = new C2864a(this);
        m36454l();
    }

    /* renamed from: b */
    public static C2863d m36464b() {
        C2863d dVar;
        boolean z;
        synchronized (f3830n) {
            dVar = f3832p;
            if (dVar != null) {
                z = true;
            } else {
                z = false;
            }
            C2517g.m37585j(z, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return dVar;
    }

    /* renamed from: e */
    public static boolean m36461e(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        return C2874g.m36421c(inputConnection, editable, i, i2, z);
    }

    /* renamed from: f */
    public static boolean m36460f(Editable editable, int i, KeyEvent keyEvent) {
        return C2874g.m36420d(editable, i, keyEvent);
    }

    /* renamed from: g */
    public static C2863d m36459g(AbstractC2866c cVar) {
        C2863d dVar = f3832p;
        if (dVar == null) {
            synchronized (f3830n) {
                dVar = f3832p;
                if (dVar == null) {
                    dVar = new C2863d(cVar);
                    f3832p = dVar;
                }
            }
        }
        return dVar;
    }

    /* renamed from: h */
    public static boolean m36458h() {
        return f3832p != null;
    }

    /* renamed from: j */
    private boolean m36456j() {
        return m36462d() == 1;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: l */
    private void m36454l() {
        this.f3833a.writeLock().lock();
        try {
            if (this.f3844l == 0) {
                this.f3835c = 0;
            }
            this.f3833a.writeLock().unlock();
            if (m36462d() == 0) {
                this.f3837e.mo36443a();
            }
        } catch (Throwable th2) {
            this.f3833a.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: c */
    public int m36463c() {
        return this.f3843k;
    }

    /* renamed from: d */
    public int m36462d() {
        this.f3833a.readLock().lock();
        try {
            return this.f3835c;
        } finally {
            this.f3833a.readLock().unlock();
        }
    }

    /* renamed from: i */
    public boolean m36457i() {
        return this.f3842j;
    }

    /* renamed from: k */
    public void m36455k() {
        boolean z = true;
        if (this.f3844l != 1) {
            z = false;
        }
        C2517g.m37585j(z, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (!m36456j()) {
            this.f3833a.writeLock().lock();
            try {
                if (this.f3835c != 0) {
                    this.f3835c = 0;
                    this.f3833a.writeLock().unlock();
                    this.f3837e.mo36443a();
                }
            } finally {
                this.f3833a.writeLock().unlock();
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: m */
    void m36453m(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f3833a.writeLock().lock();
        try {
            this.f3835c = 2;
            arrayList.addAll(this.f3834b);
            this.f3834b.clear();
            this.f3833a.writeLock().unlock();
            this.f3836d.post(new RunnableC2868f(arrayList, this.f3835c, th2));
        } catch (Throwable th3) {
            this.f3833a.writeLock().unlock();
            throw th3;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: n */
    void m36452n() {
        ArrayList arrayList = new ArrayList();
        this.f3833a.writeLock().lock();
        try {
            this.f3835c = 1;
            arrayList.addAll(this.f3834b);
            this.f3834b.clear();
            this.f3833a.writeLock().unlock();
            this.f3836d.post(new RunnableC2868f(arrayList, this.f3835c));
        } catch (Throwable th2) {
            this.f3833a.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: o */
    public CharSequence m36451o(CharSequence charSequence) {
        int i;
        if (charSequence == null) {
            i = 0;
        } else {
            i = charSequence.length();
        }
        return m36450p(charSequence, 0, i);
    }

    /* renamed from: p */
    public CharSequence m36450p(CharSequence charSequence, int i, int i2) {
        return m36449q(charSequence, i, i2, ViewDefaults.NUMBER_OF_LINES);
    }

    /* renamed from: q */
    public CharSequence m36449q(CharSequence charSequence, int i, int i2, int i3) {
        return m36448r(charSequence, i, i2, i3, 0);
    }

    /* renamed from: r */
    public CharSequence m36448r(CharSequence charSequence, int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C2517g.m37585j(m36456j(), "Not initialized yet");
        C2517g.m37590e(i, "start cannot be negative");
        C2517g.m37590e(i2, "end cannot be negative");
        C2517g.m37590e(i3, "maxEmojiCount cannot be negative");
        boolean z5 = false;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        C2517g.m37593b(z, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        if (i <= charSequence.length()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C2517g.m37593b(z2, "start should be < than charSequence length");
        if (i2 <= charSequence.length()) {
            z3 = true;
        } else {
            z3 = false;
        }
        C2517g.m37593b(z3, "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                z5 = this.f3839g;
            }
            z4 = z5;
        } else {
            z4 = true;
        }
        return this.f3837e.mo36442b(charSequence, i, i2, i3, z4);
    }

    /* renamed from: s */
    public void m36447s(AbstractC2867e eVar) {
        C2517g.m37587h(eVar, "initCallback cannot be null");
        this.f3833a.writeLock().lock();
        try {
            if (!(this.f3835c == 1 || this.f3835c == 2)) {
                this.f3834b.add(eVar);
            }
            this.f3836d.post(new RunnableC2868f(eVar, this.f3835c));
        } finally {
            this.f3833a.writeLock().unlock();
        }
    }

    /* renamed from: t */
    public void m36446t(AbstractC2867e eVar) {
        C2517g.m37587h(eVar, "initCallback cannot be null");
        this.f3833a.writeLock().lock();
        try {
            this.f3834b.remove(eVar);
        } finally {
            this.f3833a.writeLock().unlock();
        }
    }

    /* renamed from: u */
    public void m36445u(EditorInfo editorInfo) {
        if (m36456j() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.f3837e.mo36441c(editorInfo);
        }
    }
}
