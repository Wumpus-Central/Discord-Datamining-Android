package com.yalantis.ucrop.task;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import androidx.exifinterface.media.C2892a;
import java.io.File;
import p001if.b;
import p001if.c;
import p001if.d;
import p139hf.AbstractC8010a;
import p200kf.C9858e;
import p200kf.C9859f;

/* loaded from: classes8.dex */
public class BitmapCropTask extends AsyncTask<Void, Void, Throwable> {

    /* renamed from: a */
    private Bitmap f13002a;

    /* renamed from: b */
    private final RectF f13003b;

    /* renamed from: c */
    private final RectF f13004c;

    /* renamed from: d */
    private float f13005d;

    /* renamed from: e */
    private float f13006e;

    /* renamed from: f */
    private final int f13007f;

    /* renamed from: g */
    private final int f13008g;

    /* renamed from: h */
    private final Bitmap.CompressFormat f13009h;

    /* renamed from: i */
    private final int f13010i;

    /* renamed from: j */
    private final String f13011j;

    /* renamed from: k */
    private final String f13012k;

    /* renamed from: l */
    private final c f13013l;

    /* renamed from: m */
    private final AbstractC8010a f13014m;

    /* renamed from: n */
    private int f13015n;

    /* renamed from: o */
    private int f13016o;

    /* renamed from: p */
    private int f13017p;

    /* renamed from: q */
    private int f13018q;

    static {
        System.loadLibrary("ucrop");
    }

    public BitmapCropTask(Bitmap bitmap, d dVar, b bVar, AbstractC8010a aVar) {
        this.f13002a = bitmap;
        this.f13003b = dVar.m19837a();
        this.f13004c = dVar.m19835c();
        this.f13005d = dVar.m19834d();
        this.f13006e = dVar.m19836b();
        this.f13007f = bVar.m19841f();
        this.f13008g = bVar.m19840g();
        this.f13009h = bVar.m19846a();
        this.f13010i = bVar.m19845b();
        this.f13011j = bVar.m19843d();
        this.f13012k = bVar.m19842e();
        this.f13013l = bVar.m19844c();
        this.f13014m = aVar;
    }

    /* renamed from: a */
    private boolean m25709a(float f) {
        C2892a aVar = new C2892a(this.f13011j);
        this.f13017p = Math.round((this.f13003b.left - this.f13004c.left) / this.f13005d);
        this.f13018q = Math.round((this.f13003b.top - this.f13004c.top) / this.f13005d);
        this.f13015n = Math.round(this.f13003b.width() / this.f13005d);
        int round = Math.round(this.f13003b.height() / this.f13005d);
        this.f13016o = round;
        boolean e = m25705e(this.f13015n, round);
        Log.i("BitmapCropTask", "Should crop: " + e);
        if (e) {
            boolean cropCImg = cropCImg(this.f13011j, this.f13012k, this.f13017p, this.f13018q, this.f13015n, this.f13016o, this.f13006e, f, this.f13009h.ordinal(), this.f13010i, this.f13013l.m19839a(), this.f13013l.m19838b());
            if (cropCImg && this.f13009h.equals(Bitmap.CompressFormat.JPEG)) {
                C9859f.m15182b(aVar, this.f13015n, this.f13016o, this.f13012k);
            }
            return cropCImg;
        }
        C9858e.m15184a(this.f13011j, this.f13012k);
        return false;
    }

    public static native boolean cropCImg(String str, String str2, int i, int i2, int i3, int i4, float f, float f2, int i5, int i6, int i7, int i8);

    /* renamed from: d */
    private float m25706d() {
        int i;
        int i2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        boolean z = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(this.f13011j, options);
        if (!(this.f13013l.m19839a() == 90 || this.f13013l.m19839a() == 270)) {
            z = false;
        }
        if (z) {
            i = options.outHeight;
        } else {
            i = options.outWidth;
        }
        float width = i / this.f13002a.getWidth();
        if (z) {
            i2 = options.outWidth;
        } else {
            i2 = options.outHeight;
        }
        this.f13005d /= Math.min(width, i2 / this.f13002a.getHeight());
        if (this.f13007f > 0 && this.f13008g > 0) {
            float width2 = this.f13003b.width() / this.f13005d;
            float height = this.f13003b.height() / this.f13005d;
            int i3 = this.f13007f;
            if (width2 > i3 || height > this.f13008g) {
                float min = Math.min(i3 / width2, this.f13008g / height);
                this.f13005d /= min;
                return min;
            }
        }
        return 1.0f;
    }

    /* renamed from: e */
    private boolean m25705e(int i, int i2) {
        int round = Math.round(Math.max(i, i2) / 1000.0f) + 1;
        if (this.f13007f > 0 && this.f13008g > 0) {
            return true;
        }
        float f = round;
        if (Math.abs(this.f13003b.left - this.f13004c.left) > f || Math.abs(this.f13003b.top - this.f13004c.top) > f || Math.abs(this.f13003b.bottom - this.f13004c.bottom) > f || Math.abs(this.f13003b.right - this.f13004c.right) > f || this.f13006e != 0.0f) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public Throwable doInBackground(Void... voidArr) {
        Bitmap bitmap = this.f13002a;
        if (bitmap == null) {
            return new NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException("ViewBitmap is recycled");
        }
        if (this.f13004c.isEmpty()) {
            return new NullPointerException("CurrentImageRect is empty");
        }
        try {
            m25709a(m25706d());
            this.f13002a = null;
            return null;
        } catch (Throwable th2) {
            return th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void onPostExecute(Throwable th2) {
        AbstractC8010a aVar = this.f13014m;
        if (aVar == null) {
            return;
        }
        if (th2 == null) {
            this.f13014m.mo20860a(Uri.fromFile(new File(this.f13012k)), this.f13017p, this.f13018q, this.f13015n, this.f13016o);
            return;
        }
        aVar.mo20859b(th2);
    }
}
