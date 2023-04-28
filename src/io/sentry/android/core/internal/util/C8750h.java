package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import io.sentry.AbstractC8869g0;
import io.sentry.EnumC8942n3;
import io.sentry.android.core.C8715f0;
import java.io.ByteArrayOutputStream;

/* renamed from: io.sentry.android.core.internal.util.h */
/* loaded from: classes8.dex */
public class C8750h {
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    private static boolean m18206a(Activity activity, C8715f0 f0Var) {
        if (f0Var.m18303d() < 17) {
            return !activity.isFinishing();
        }
        if (activity.isFinishing() || activity.isDestroyed()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static byte[] m18205b(Activity activity, AbstractC8869g0 g0Var, C8715f0 f0Var) {
        if (!m18206a(activity, f0Var) || activity.getWindow() == null || activity.getWindow().getDecorView() == null || activity.getWindow().getDecorView().getRootView() == null) {
            g0Var.mo17722c(EnumC8942n3.DEBUG, "Activity isn't valid, not taking screenshot.", new Object[0]);
            return null;
        }
        View rootView = activity.getWindow().getDecorView().getRootView();
        if (rootView.getWidth() <= 0 || rootView.getHeight() <= 0) {
            g0Var.mo17722c(EnumC8942n3.DEBUG, "View's width and height is zeroed, not taking screenshot.", new Object[0]);
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
            rootView.draw(new Canvas(createBitmap));
            createBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            if (byteArrayOutputStream.size() <= 0) {
                g0Var.mo17722c(EnumC8942n3.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                byteArrayOutputStream.close();
                return null;
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            g0Var.mo17723b(EnumC8942n3.ERROR, "Taking screenshot failed.", th2);
            return null;
        }
    }
}
