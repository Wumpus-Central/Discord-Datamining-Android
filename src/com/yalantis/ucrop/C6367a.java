package com.yalantis.ucrop;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: com.yalantis.ucrop.a */
/* loaded from: classes8.dex */
public class C6367a {

    /* renamed from: a */
    private Intent f12999a = new Intent();

    /* renamed from: b */
    private Bundle f13000b;

    /* renamed from: com.yalantis.ucrop.a$a */
    /* loaded from: classes8.dex */
    public static class C0186a {

        /* renamed from: a */
        private final Bundle f13001a = new Bundle();

        /* renamed from: a */
        public Bundle m25723a() {
            return this.f13001a;
        }

        /* renamed from: b */
        public void m25722b(int i) {
            this.f13001a.putInt("com.yalantis.ucrop.UcropColorControlsWidgetActive", i);
        }

        /* renamed from: c */
        public void m25721c(int i, int i2, int i3) {
            this.f13001a.putIntArray("com.yalantis.ucrop.AllowedGestures", new int[]{i, i2, i3});
        }

        /* renamed from: d */
        public void m25720d(boolean z) {
            this.f13001a.putBoolean("com.yalantis.ucrop.CircleDimmedLayer", z);
        }

        /* renamed from: e */
        public void m25719e(Bitmap.CompressFormat compressFormat) {
            this.f13001a.putString("com.yalantis.ucrop.CompressionFormatName", compressFormat.name());
        }

        /* renamed from: f */
        public void m25718f(int i) {
            this.f13001a.putInt("com.yalantis.ucrop.CompressionQuality", i);
        }

        /* renamed from: g */
        public void m25717g(boolean z) {
            this.f13001a.putBoolean("com.yalantis.ucrop.FreeStyleCrop", z);
        }

        /* renamed from: h */
        public void m25716h(boolean z) {
            this.f13001a.putBoolean("com.yalantis.ucrop.HideBottomControls", z);
        }

        /* renamed from: i */
        public void m25715i(boolean z) {
            this.f13001a.putBoolean("com.yalantis.ucrop.ShowCropFrame", z);
        }

        /* renamed from: j */
        public void m25714j(boolean z) {
            this.f13001a.putBoolean("com.yalantis.ucrop.ShowCropGrid", z);
        }

        /* renamed from: k */
        public void m25713k(int i) {
            this.f13001a.putInt("com.yalantis.ucrop.StatusBarColor", i);
        }

        /* renamed from: l */
        public void m25712l(int i) {
            this.f13001a.putInt("com.yalantis.ucrop.ToolbarColor", i);
        }

        /* renamed from: m */
        public void m25711m(String str) {
            this.f13001a.putString("com.yalantis.ucrop.UcropToolbarTitleText", str);
        }

        /* renamed from: n */
        public void m25710n(int i) {
            this.f13001a.putInt("com.yalantis.ucrop.UcropToolbarWidgetColor", i);
        }
    }

    private C6367a(Uri uri, Uri uri2) {
        Bundle bundle = new Bundle();
        this.f13000b = bundle;
        bundle.putParcelable("com.yalantis.ucrop.InputUri", uri);
        this.f13000b.putParcelable("com.yalantis.ucrop.OutputUri", uri2);
    }

    /* renamed from: b */
    public static Uri m25729b(Intent intent) {
        return (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
    }

    /* renamed from: c */
    public static C6367a m25728c(Uri uri, Uri uri2) {
        return new C6367a(uri, uri2);
    }

    /* renamed from: a */
    public Intent m25730a(Context context) {
        this.f12999a.setClass(context, UCropActivity.class);
        this.f12999a.putExtras(this.f13000b);
        return this.f12999a;
    }

    /* renamed from: d */
    public void m25727d(Activity activity) {
        m25726e(activity, 69);
    }

    /* renamed from: e */
    public void m25726e(Activity activity, int i) {
        activity.startActivityForResult(m25730a(activity), i);
    }

    /* renamed from: f */
    public C6367a m25725f(float f, float f2) {
        this.f13000b.putFloat("com.yalantis.ucrop.AspectRatioX", f);
        this.f13000b.putFloat("com.yalantis.ucrop.AspectRatioY", f2);
        return this;
    }

    /* renamed from: g */
    public C6367a m25724g(C0186a aVar) {
        this.f13000b.putAll(aVar.m25723a());
        return this;
    }
}
