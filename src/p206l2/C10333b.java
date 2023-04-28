package p206l2;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p126h2.AbstractC7740b;
import p126h2.C7753f0;
import p343t2.C12945f;
import p343t2.C12949j;

/* renamed from: l2.b */
/* loaded from: classes.dex */
public class C10333b {

    /* renamed from: d */
    private static final Object f22655d = new Object();

    /* renamed from: a */
    private final Context f22656a;

    /* renamed from: b */
    private final String f22657b;

    /* renamed from: c */
    private final Map<String, C7753f0> f22658c;

    public C10333b(Drawable.Callback callback, String str, AbstractC7740b bVar, Map<String, C7753f0> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f22657b = str;
        } else {
            this.f22657b = str + '/';
        }
        if (!(callback instanceof View)) {
            C12945f.m5009c("LottieDrawable must be inside of a view for images to work.");
            this.f22658c = new HashMap();
            this.f22656a = null;
            return;
        }
        this.f22656a = ((View) callback).getContext();
        this.f22658c = map;
        m13592d(bVar);
    }

    /* renamed from: c */
    private Bitmap m13593c(String str, Bitmap bitmap) {
        synchronized (f22655d) {
            this.f22658c.get(str).m21432f(bitmap);
        }
        return bitmap;
    }

    /* renamed from: a */
    public Bitmap m13595a(String str) {
        C7753f0 f0Var = this.f22658c.get(str);
        if (f0Var == null) {
            return null;
        }
        Bitmap a = f0Var.m21437a();
        if (a != null) {
            return a;
        }
        String b = f0Var.m21436b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!b.startsWith("data:") || b.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(this.f22657b)) {
                    AssetManager assets = this.f22656a.getAssets();
                    try {
                        return m13593c(str, C12949j.m4960l(BitmapFactory.decodeStream(assets.open(this.f22657b + b), null, options), f0Var.m21433e(), f0Var.m21435c()));
                    } catch (IllegalArgumentException e) {
                        C12945f.m5008d("Unable to decode image.", e);
                        return null;
                    }
                } else {
                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                }
            } catch (IOException e2) {
                C12945f.m5008d("Unable to open asset.", e2);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(b.substring(b.indexOf(44) + 1), 0);
                return m13593c(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e3) {
                C12945f.m5008d("data URL did not have correct base64 format.", e3);
                return null;
            }
        }
    }

    /* renamed from: b */
    public boolean m13594b(Context context) {
        return (context == null && this.f22656a == null) || this.f22656a.equals(context);
    }

    /* renamed from: d */
    public void m13592d(AbstractC7740b bVar) {
    }
}
