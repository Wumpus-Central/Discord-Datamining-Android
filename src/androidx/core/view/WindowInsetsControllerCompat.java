package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.recyclerview.widget.RecyclerView;
import p163j$.util.Spliterator;

/* loaded from: classes.dex */
public final class WindowInsetsControllerCompat {

    /* renamed from: a */
    private final C2548e f3545a;

    /* renamed from: androidx.core.view.WindowInsetsControllerCompat$a */
    /* loaded from: classes.dex */
    private static class C2544a extends C2548e {

        /* renamed from: a */
        protected final Window f3546a;

        /* renamed from: b */
        private final View f3547b;

        C2544a(Window window, View view) {
            this.f3546a = window;
            this.f3547b = view;
        }

        /* renamed from: g */
        private void m37446g(int i) {
            if (i == 1) {
                m37444i(4);
            } else if (i == 2) {
                m37444i(2);
            } else if (i == 8) {
                ((InputMethodManager) this.f3546a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f3546a.getDecorView().getWindowToken(), 0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static /* synthetic */ void m37445h(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        /* renamed from: k */
        private void m37442k(int i) {
            if (i == 1) {
                m37441l(4);
                m37440m(Spliterator.IMMUTABLE);
            } else if (i == 2) {
                m37441l(2);
            } else if (i == 8) {
                final View view = this.f3547b;
                if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                    view.requestFocus();
                } else {
                    view = this.f3546a.getCurrentFocus();
                }
                if (view == null) {
                    view = this.f3546a.findViewById(16908290);
                }
                if (view != null && view.hasWindowFocus()) {
                    view.post(new Runnable() { // from class: androidx.core.view.z3
                        @Override // java.lang.Runnable
                        public final void run() {
                            WindowInsetsControllerCompat.C2544a.m37445h(view);
                        }
                    });
                }
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C2548e
        /* renamed from: a */
        void mo37437a(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    m37446g(i2);
                }
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C2548e
        /* renamed from: d */
        void mo37434d(int i) {
            if (i == 0) {
                m37441l(6144);
            } else if (i == 1) {
                m37441l(4096);
                m37444i(RecyclerView.ItemAnimator.FLAG_MOVED);
            } else if (i == 2) {
                m37441l(RecyclerView.ItemAnimator.FLAG_MOVED);
                m37444i(4096);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C2548e
        /* renamed from: e */
        void mo37433e(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    m37442k(i2);
                }
            }
        }

        /* renamed from: i */
        protected void m37444i(int i) {
            View decorView = this.f3546a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* renamed from: j */
        protected void m37443j(int i) {
            this.f3546a.addFlags(i);
        }

        /* renamed from: l */
        protected void m37441l(int i) {
            View decorView = this.f3546a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        /* renamed from: m */
        protected void m37440m(int i) {
            this.f3546a.clearFlags(i);
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsControllerCompat$b */
    /* loaded from: classes.dex */
    private static class C2545b extends C2544a {
        C2545b(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C2548e
        /* renamed from: c */
        public void mo37435c(boolean z) {
            if (z) {
                m37440m(67108864);
                m37443j(Integer.MIN_VALUE);
                m37444i(8192);
                return;
            }
            m37441l(8192);
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsControllerCompat$c */
    /* loaded from: classes.dex */
    private static class C2546c extends C2545b {
        C2546c(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C2548e
        /* renamed from: b */
        public void mo37436b(boolean z) {
            if (z) {
                m37440m(134217728);
                m37443j(Integer.MIN_VALUE);
                m37444i(16);
                return;
            }
            m37441l(16);
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsControllerCompat$e */
    /* loaded from: classes.dex */
    private static class C2548e {
        C2548e() {
        }

        /* renamed from: a */
        void mo37437a(int i) {
            throw null;
        }

        /* renamed from: b */
        public void mo37436b(boolean z) {
        }

        /* renamed from: c */
        public void mo37435c(boolean z) {
            throw null;
        }

        /* renamed from: d */
        void mo37434d(int i) {
            throw null;
        }

        /* renamed from: e */
        void mo37433e(int i) {
            throw null;
        }
    }

    @Deprecated
    private WindowInsetsControllerCompat(WindowInsetsController windowInsetsController) {
        this.f3545a = new C2547d(windowInsetsController, this);
    }

    @Deprecated
    /* renamed from: f */
    public static WindowInsetsControllerCompat m37448f(WindowInsetsController windowInsetsController) {
        return new WindowInsetsControllerCompat(windowInsetsController);
    }

    /* renamed from: a */
    public void m37453a(int i) {
        this.f3545a.mo37437a(i);
    }

    /* renamed from: b */
    public void m37452b(boolean z) {
        this.f3545a.mo37436b(z);
    }

    /* renamed from: c */
    public void m37451c(boolean z) {
        this.f3545a.mo37435c(z);
    }

    /* renamed from: d */
    public void m37450d(int i) {
        this.f3545a.mo37434d(i);
    }

    /* renamed from: e */
    public void m37449e(int i) {
        this.f3545a.mo37433e(i);
    }

    /* renamed from: androidx.core.view.WindowInsetsControllerCompat$d */
    /* loaded from: classes.dex */
    private static class C2547d extends C2548e {

        /* renamed from: a */
        final WindowInsetsControllerCompat f3548a;

        /* renamed from: b */
        final WindowInsetsController f3549b;

        /* renamed from: c */
        private final SimpleArrayMap<Object, WindowInsetsController.OnControllableInsetsChangedListener> f3550c;

        /* renamed from: d */
        protected Window f3551d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        C2547d(android.view.Window r2, androidx.core.view.WindowInsetsControllerCompat r3) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = androidx.core.view.C2617d4.m37268a(r2)
                r1.<init>(r0, r3)
                r1.f3551d = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.WindowInsetsControllerCompat.C2547d.<init>(android.view.Window, androidx.core.view.WindowInsetsControllerCompat):void");
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C2548e
        /* renamed from: a */
        void mo37437a(int i) {
            this.f3549b.hide(i);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C2548e
        /* renamed from: b */
        public void mo37436b(boolean z) {
            if (z) {
                if (this.f3551d != null) {
                    m37439f(16);
                }
                this.f3549b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f3551d != null) {
                m37438g(16);
            }
            this.f3549b.setSystemBarsAppearance(0, 16);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C2548e
        /* renamed from: c */
        public void mo37435c(boolean z) {
            if (z) {
                if (this.f3551d != null) {
                    m37439f(8192);
                }
                this.f3549b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f3551d != null) {
                m37438g(8192);
            }
            this.f3549b.setSystemBarsAppearance(0, 8);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C2548e
        /* renamed from: d */
        void mo37434d(int i) {
            this.f3549b.setSystemBarsBehavior(i);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C2548e
        /* renamed from: e */
        void mo37433e(int i) {
            Window window = this.f3551d;
            if (!(window == null || (i & 8) == 0 || Build.VERSION.SDK_INT >= 32)) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.f3549b.show(i);
        }

        /* renamed from: f */
        protected void m37439f(int i) {
            View decorView = this.f3551d.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* renamed from: g */
        protected void m37438g(int i) {
            View decorView = this.f3551d.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        C2547d(WindowInsetsController windowInsetsController, WindowInsetsControllerCompat windowInsetsControllerCompat) {
            this.f3550c = new SimpleArrayMap<>();
            this.f3549b = windowInsetsController;
            this.f3548a = windowInsetsControllerCompat;
        }
    }

    public WindowInsetsControllerCompat(Window window, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f3545a = new C2547d(window, this);
        } else if (i >= 26) {
            this.f3545a = new C2546c(window, view);
        } else {
            this.f3545a = new C2545b(window, view);
        }
    }
}
