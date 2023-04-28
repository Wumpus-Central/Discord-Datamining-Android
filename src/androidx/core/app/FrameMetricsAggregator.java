package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p163j$.util.Spliterator;

/* loaded from: classes.dex */
public class FrameMetricsAggregator {

    /* renamed from: a */
    private final C2164b f3022a;

    /* renamed from: androidx.core.app.FrameMetricsAggregator$a */
    /* loaded from: classes.dex */
    private static class C2163a extends C2164b {

        /* renamed from: e */
        private static HandlerThread f3023e;

        /* renamed from: f */
        private static Handler f3024f;

        /* renamed from: a */
        int f3025a;

        /* renamed from: b */
        SparseIntArray[] f3026b = new SparseIntArray[9];

        /* renamed from: c */
        private final ArrayList<WeakReference<Activity>> f3027c = new ArrayList<>();

        /* renamed from: d */
        Window.OnFrameMetricsAvailableListener f3028d = new Window$OnFrameMetricsAvailableListenerC0032a();

        /* renamed from: androidx.core.app.FrameMetricsAggregator$a$a */
        /* loaded from: classes.dex */
        class Window$OnFrameMetricsAvailableListenerC0032a implements Window.OnFrameMetricsAvailableListener {
            Window$OnFrameMetricsAvailableListenerC0032a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                long metric;
                long metric2;
                long metric3;
                long metric4;
                long metric5;
                long metric6;
                long metric7;
                long metric8;
                long metric9;
                C2163a aVar = C2163a.this;
                if ((aVar.f3025a & 1) != 0) {
                    SparseIntArray sparseIntArray = aVar.f3026b[0];
                    metric9 = frameMetrics.getMetric(8);
                    aVar.m38643f(sparseIntArray, metric9);
                }
                C2163a aVar2 = C2163a.this;
                if ((aVar2.f3025a & 2) != 0) {
                    SparseIntArray sparseIntArray2 = aVar2.f3026b[1];
                    metric8 = frameMetrics.getMetric(1);
                    aVar2.m38643f(sparseIntArray2, metric8);
                }
                C2163a aVar3 = C2163a.this;
                if ((aVar3.f3025a & 4) != 0) {
                    SparseIntArray sparseIntArray3 = aVar3.f3026b[2];
                    metric7 = frameMetrics.getMetric(3);
                    aVar3.m38643f(sparseIntArray3, metric7);
                }
                C2163a aVar4 = C2163a.this;
                if ((aVar4.f3025a & 8) != 0) {
                    SparseIntArray sparseIntArray4 = aVar4.f3026b[3];
                    metric6 = frameMetrics.getMetric(4);
                    aVar4.m38643f(sparseIntArray4, metric6);
                }
                C2163a aVar5 = C2163a.this;
                if ((aVar5.f3025a & 16) != 0) {
                    SparseIntArray sparseIntArray5 = aVar5.f3026b[4];
                    metric5 = frameMetrics.getMetric(5);
                    aVar5.m38643f(sparseIntArray5, metric5);
                }
                C2163a aVar6 = C2163a.this;
                if ((aVar6.f3025a & 64) != 0) {
                    SparseIntArray sparseIntArray6 = aVar6.f3026b[6];
                    metric4 = frameMetrics.getMetric(7);
                    aVar6.m38643f(sparseIntArray6, metric4);
                }
                C2163a aVar7 = C2163a.this;
                if ((aVar7.f3025a & 32) != 0) {
                    SparseIntArray sparseIntArray7 = aVar7.f3026b[5];
                    metric3 = frameMetrics.getMetric(6);
                    aVar7.m38643f(sparseIntArray7, metric3);
                }
                C2163a aVar8 = C2163a.this;
                if ((aVar8.f3025a & 128) != 0) {
                    SparseIntArray sparseIntArray8 = aVar8.f3026b[7];
                    metric2 = frameMetrics.getMetric(0);
                    aVar8.m38643f(sparseIntArray8, metric2);
                }
                C2163a aVar9 = C2163a.this;
                if ((aVar9.f3025a & Spliterator.NONNULL) != 0) {
                    SparseIntArray sparseIntArray9 = aVar9.f3026b[8];
                    metric = frameMetrics.getMetric(2);
                    aVar9.m38643f(sparseIntArray9, metric);
                }
            }
        }

        C2163a(int i) {
            this.f3025a = i;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.C2164b
        /* renamed from: a */
        public void mo38642a(Activity activity) {
            if (f3023e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f3023e = handlerThread;
                handlerThread.start();
                f3024f = new Handler(f3023e.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                SparseIntArray[] sparseIntArrayArr = this.f3026b;
                if (sparseIntArrayArr[i] == null && (this.f3025a & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f3028d, f3024f);
            this.f3027c.add(new WeakReference<>(activity));
        }

        @Override // androidx.core.app.FrameMetricsAggregator.C2164b
        /* renamed from: b */
        public SparseIntArray[] mo38641b() {
            return this.f3026b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.C2164b
        /* renamed from: c */
        public SparseIntArray[] mo38640c(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f3027c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.f3027c.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f3028d);
            return this.f3026b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.C2164b
        /* renamed from: d */
        public SparseIntArray[] mo38639d() {
            SparseIntArray[] sparseIntArrayArr = this.f3026b;
            this.f3026b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.C2164b
        /* renamed from: e */
        public SparseIntArray[] mo38638e() {
            for (int size = this.f3027c.size() - 1; size >= 0; size--) {
                WeakReference<Activity> weakReference = this.f3027c.get(size);
                Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f3028d);
                    this.f3027c.remove(size);
                }
            }
            return this.f3026b;
        }

        /* renamed from: f */
        void m38643f(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }
    }

    /* renamed from: androidx.core.app.FrameMetricsAggregator$b */
    /* loaded from: classes.dex */
    private static class C2164b {
        C2164b() {
        }

        /* renamed from: a */
        public void mo38642a(Activity activity) {
        }

        /* renamed from: b */
        public SparseIntArray[] mo38641b() {
            return null;
        }

        /* renamed from: c */
        public SparseIntArray[] mo38640c(Activity activity) {
            return null;
        }

        /* renamed from: d */
        public SparseIntArray[] mo38639d() {
            return null;
        }

        /* renamed from: e */
        public SparseIntArray[] mo38638e() {
            return null;
        }
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    /* renamed from: a */
    public void m38648a(Activity activity) {
        this.f3022a.mo38642a(activity);
    }

    /* renamed from: b */
    public SparseIntArray[] m38647b() {
        return this.f3022a.mo38641b();
    }

    /* renamed from: c */
    public SparseIntArray[] m38646c(Activity activity) {
        return this.f3022a.mo38640c(activity);
    }

    /* renamed from: d */
    public SparseIntArray[] m38645d() {
        return this.f3022a.mo38639d();
    }

    /* renamed from: e */
    public SparseIntArray[] m38644e() {
        return this.f3022a.mo38638e();
    }

    public FrameMetricsAggregator(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f3022a = new C2163a(i);
        } else {
            this.f3022a = new C2164b();
        }
    }
}
