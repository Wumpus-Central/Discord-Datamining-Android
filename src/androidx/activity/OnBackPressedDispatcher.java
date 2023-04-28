package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.AbstractC3038j;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f611a;

    /* renamed from: b */
    final ArrayDeque<AbstractC1486b> f612b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements AbstractC3038j, AbstractC1485a {

        /* renamed from: k */
        private final Lifecycle f613k;

        /* renamed from: l */
        private final AbstractC1486b f614l;

        /* renamed from: m */
        private AbstractC1485a f615m;

        LifecycleOnBackPressedCancellable(Lifecycle lifecycle, AbstractC1486b bVar) {
            this.f613k = lifecycle;
            this.f614l = bVar;
            lifecycle.mo35844a(this);
        }

        @Override // androidx.lifecycle.AbstractC3038j
        /* renamed from: c */
        public void mo34707c(LifecycleOwner lifecycleOwner, Lifecycle.EnumC3010b bVar) {
            if (bVar == Lifecycle.EnumC3010b.ON_START) {
                this.f615m = OnBackPressedDispatcher.this.m41006b(this.f614l);
            } else if (bVar == Lifecycle.EnumC3010b.ON_STOP) {
                AbstractC1485a aVar = this.f615m;
                if (aVar != null) {
                    aVar.cancel();
                }
            } else if (bVar == Lifecycle.EnumC3010b.ON_DESTROY) {
                cancel();
            }
        }

        @Override // androidx.activity.AbstractC1485a
        public void cancel() {
            this.f613k.mo35842c(this);
            this.f614l.m41001e(this);
            AbstractC1485a aVar = this.f615m;
            if (aVar != null) {
                aVar.cancel();
                this.f615m = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    /* loaded from: classes.dex */
    public class C1484a implements AbstractC1485a {

        /* renamed from: k */
        private final AbstractC1486b f617k;

        C1484a(AbstractC1486b bVar) {
            this.f617k = bVar;
        }

        @Override // androidx.activity.AbstractC1485a
        public void cancel() {
            OnBackPressedDispatcher.this.f612b.remove(this.f617k);
            this.f617k.m41001e(this);
        }
    }

    public OnBackPressedDispatcher() {
        this(null);
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public void m41007a(LifecycleOwner lifecycleOwner, AbstractC1486b bVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.mo35843b() != Lifecycle.State.DESTROYED) {
            bVar.m41004a(new LifecycleOnBackPressedCancellable(lifecycle, bVar));
        }
    }

    /* renamed from: b */
    AbstractC1485a m41006b(AbstractC1486b bVar) {
        this.f612b.add(bVar);
        C1484a aVar = new C1484a(bVar);
        bVar.m41004a(aVar);
        return aVar;
    }

    /* renamed from: c */
    public void m41005c() {
        Iterator<AbstractC1486b> descendingIterator = this.f612b.descendingIterator();
        while (descendingIterator.hasNext()) {
            AbstractC1486b next = descendingIterator.next();
            if (next.m41003c()) {
                next.mo25970b();
                return;
            }
        }
        Runnable runnable = this.f611a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f612b = new ArrayDeque<>();
        this.f611a = runnable;
    }
}
