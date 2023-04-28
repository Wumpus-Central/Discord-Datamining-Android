package androidx.core.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;

/* renamed from: androidx.core.app.d */
/* loaded from: classes.dex */
public class C2212d {

    /* renamed from: androidx.core.app.d$a */
    /* loaded from: classes.dex */
    private static class C2213a extends C2212d {

        /* renamed from: a */
        private final ActivityOptions f3194a;

        C2213a(ActivityOptions activityOptions) {
            this.f3194a = activityOptions;
        }

        @Override // androidx.core.app.C2212d
        /* renamed from: b */
        public Bundle mo38301b() {
            return this.f3194a.toBundle();
        }
    }

    /* renamed from: androidx.core.app.d$b */
    /* loaded from: classes.dex */
    static class C2214b {
        /* renamed from: a */
        static ActivityOptions m38300a(Context context, int i, int i2) {
            return ActivityOptions.makeCustomAnimation(context, i, i2);
        }

        /* renamed from: b */
        static ActivityOptions m38299b(View view, int i, int i2, int i3, int i4) {
            return ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4);
        }

        /* renamed from: c */
        static ActivityOptions m38298c(View view, Bitmap bitmap, int i, int i2) {
            return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2);
        }
    }

    protected C2212d() {
    }

    /* renamed from: a */
    public static C2212d m38302a(Context context, int i, int i2) {
        return new C2213a(C2214b.m38300a(context, i, i2));
    }

    /* renamed from: b */
    public Bundle mo38301b() {
        throw null;
    }
}
