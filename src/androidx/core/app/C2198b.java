package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.C2198b;
import androidx.core.app.SharedElementCallback;
import androidx.core.content.C2337a;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.core.app.b */
/* loaded from: classes.dex */
public class C2198b extends C2337a {

    /* renamed from: androidx.core.app.b$a */
    /* loaded from: classes.dex */
    static class C2199a {
        /* renamed from: a */
        static void m38323a(Activity activity) {
            activity.finishAffinity();
        }

        /* renamed from: b */
        static void m38322b(Activity activity, Intent intent, int i, Bundle bundle) {
            activity.startActivityForResult(intent, i, bundle);
        }

        /* renamed from: c */
        static void m38321c(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    /* renamed from: androidx.core.app.b$b */
    /* loaded from: classes.dex */
    static class C0034b {
        /* renamed from: a */
        static void m38320a(Activity activity) {
            activity.finishAfterTransition();
        }

        /* renamed from: b */
        static void m38319b(Activity activity) {
            activity.postponeEnterTransition();
        }

        /* renamed from: c */
        static void m38318c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        /* renamed from: d */
        static void m38317d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        /* renamed from: e */
        static void m38316e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.b$c */
    /* loaded from: classes.dex */
    public static class C2200c {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static void m38315a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        /* renamed from: b */
        static void m38314b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        /* renamed from: c */
        static boolean m38313c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: androidx.core.app.b$d */
    /* loaded from: classes.dex */
    public interface AbstractC2201d {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* renamed from: androidx.core.app.b$e */
    /* loaded from: classes.dex */
    static class SharedElementCallbackC2202e extends SharedElementCallback {

        /* renamed from: a */
        private final SharedElementCallback f3192a;

        SharedElementCallbackC2202e(SharedElementCallback sharedElementCallback) {
            this.f3192a = sharedElementCallback;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f3192a.m38353b(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f3192a.m38352c(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f3192a.m38351d(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.f3192a.m38350e(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f3192a.m38349f(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f3192a.m38348g(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f3192a.m38347h(list, list2, new SharedElementCallback.AbstractC2191a() { // from class: androidx.core.app.c
                @Override // androidx.core.app.SharedElementCallback.AbstractC2191a
                public final void onSharedElementsReady() {
                    C2198b.C2200c.m38315a(onSharedElementsReadyListener);
                }
            });
        }
    }

    /* renamed from: n */
    public static void m38335n(Activity activity) {
        C2199a.m38323a(activity);
    }

    /* renamed from: o */
    public static void m38334o(Activity activity) {
        C0034b.m38320a(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ void m38333p(Activity activity) {
        if (!activity.isFinishing() && !C2219e.m38285i(activity)) {
            activity.recreate();
        }
    }

    /* renamed from: q */
    public static void m38332q(Activity activity) {
        C0034b.m38319b(activity);
    }

    /* renamed from: r */
    public static void m38331r(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    C2198b.m38333p(activity);
                }
            });
        }
    }

    /* renamed from: s */
    public static void m38330s(Activity activity, String[] strArr, int i) {
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
        }
        if (activity instanceof AbstractC2201d) {
            ((AbstractC2201d) activity).validateRequestPermissionsRequestCode(i);
        }
        C2200c.m38314b(activity, strArr, i);
    }

    /* renamed from: t */
    public static void m38329t(Activity activity, SharedElementCallback sharedElementCallback) {
        SharedElementCallbackC2202e eVar;
        if (sharedElementCallback != null) {
            eVar = new SharedElementCallbackC2202e(sharedElementCallback);
        } else {
            eVar = null;
        }
        C0034b.m38318c(activity, eVar);
    }

    /* renamed from: u */
    public static void m38328u(Activity activity, SharedElementCallback sharedElementCallback) {
        SharedElementCallbackC2202e eVar;
        if (sharedElementCallback != null) {
            eVar = new SharedElementCallbackC2202e(sharedElementCallback);
        } else {
            eVar = null;
        }
        C0034b.m38317d(activity, eVar);
    }

    /* renamed from: v */
    public static boolean m38327v(Activity activity, String str) {
        return C2200c.m38313c(activity, str);
    }

    /* renamed from: w */
    public static void m38326w(Activity activity, Intent intent, int i, Bundle bundle) {
        C2199a.m38322b(activity, intent, i, bundle);
    }

    /* renamed from: x */
    public static void m38325x(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        C2199a.m38321c(activity, intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* renamed from: y */
    public static void m38324y(Activity activity) {
        C0034b.m38316e(activity);
    }
}
