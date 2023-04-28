package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.util.C2513d;
import androidx.core.util.C2517g;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.facebook.react.util.JSStackTrace;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    static final PorterDuff.Mode f3338k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f3339a;

    /* renamed from: b */
    Object f3340b;

    /* renamed from: c */
    public byte[] f3341c;

    /* renamed from: d */
    public Parcelable f3342d;

    /* renamed from: e */
    public int f3343e;

    /* renamed from: f */
    public int f3344f;

    /* renamed from: g */
    public ColorStateList f3345g;

    /* renamed from: h */
    PorterDuff.Mode f3346h;

    /* renamed from: i */
    public String f3347i;

    /* renamed from: j */
    public String f3348j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.drawable.IconCompat$a */
    /* loaded from: classes.dex */
    public static class C2396a {
        /* renamed from: a */
        static IconCompat m37856a(Object obj) {
            C2517g.m37588g(obj);
            int d = m37853d(obj);
            if (d == 2) {
                return IconCompat.m37871l(null, m37854c(obj), m37855b(obj));
            }
            if (d == 4) {
                return IconCompat.m37874i(m37852e(obj));
            }
            if (d == 6) {
                return IconCompat.m37877f(m37852e(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f3340b = obj;
            return iconCompat;
        }

        /* renamed from: b */
        static int m37855b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C2398c.m37847a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon resource", e);
                return 0;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon resource", e2);
                return 0;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            }
        }

        /* renamed from: c */
        static String m37854c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C2398c.m37846b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon package", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon package", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            }
        }

        /* renamed from: d */
        static int m37853d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C2398c.m37845c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e);
                return -1;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e2);
                return -1;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                return -1;
            }
        }

        /* renamed from: e */
        static Uri m37852e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C2398c.m37844d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon uri", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon uri", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon uri", e3);
                return null;
            }
        }

        /* renamed from: f */
        static Drawable m37851f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* renamed from: g */
        static Icon m37850g(IconCompat iconCompat, Context context) {
            Icon icon;
            switch (iconCompat.f3339a) {
                case -1:
                    return (Icon) iconCompat.f3340b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    icon = Icon.createWithBitmap((Bitmap) iconCompat.f3340b);
                    break;
                case 2:
                    icon = Icon.createWithResource(iconCompat.m37868o(), iconCompat.f3343e);
                    break;
                case 3:
                    icon = Icon.createWithData((byte[]) iconCompat.f3340b, iconCompat.f3343e, iconCompat.f3344f);
                    break;
                case 4:
                    icon = Icon.createWithContentUri((String) iconCompat.f3340b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        icon = Icon.createWithBitmap(IconCompat.m37879d((Bitmap) iconCompat.f3340b, false));
                        break;
                    } else {
                        icon = C2397b.m37848b((Bitmap) iconCompat.f3340b);
                        break;
                    }
                case 6:
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30) {
                        icon = C2399d.m37843a(iconCompat.m37865r());
                        break;
                    } else if (context != null) {
                        InputStream s = iconCompat.m37864s(context);
                        if (s != null) {
                            if (i < 26) {
                                icon = Icon.createWithBitmap(IconCompat.m37879d(BitmapFactory.decodeStream(s), false));
                                break;
                            } else {
                                icon = C2397b.m37848b(BitmapFactory.decodeStream(s));
                                break;
                            }
                        } else {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.m37865r());
                        }
                    } else {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.m37865r());
                    }
            }
            ColorStateList colorStateList = iconCompat.f3345g;
            if (colorStateList != null) {
                icon.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f3346h;
            if (mode != IconCompat.f3338k) {
                icon.setTintMode(mode);
            }
            return icon;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.drawable.IconCompat$b */
    /* loaded from: classes.dex */
    public static class C2397b {
        /* renamed from: a */
        static Drawable m37849a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        /* renamed from: b */
        static Icon m37848b(Bitmap bitmap) {
            Icon createWithAdaptiveBitmap;
            createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
            return createWithAdaptiveBitmap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.drawable.IconCompat$c */
    /* loaded from: classes.dex */
    public static class C2398c {
        /* renamed from: a */
        static int m37847a(Object obj) {
            int resId;
            resId = ((Icon) obj).getResId();
            return resId;
        }

        /* renamed from: b */
        static String m37846b(Object obj) {
            String resPackage;
            resPackage = ((Icon) obj).getResPackage();
            return resPackage;
        }

        /* renamed from: c */
        static int m37845c(Object obj) {
            int type;
            type = ((Icon) obj).getType();
            return type;
        }

        /* renamed from: d */
        static Uri m37844d(Object obj) {
            Uri uri;
            uri = ((Icon) obj).getUri();
            return uri;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.drawable.IconCompat$d */
    /* loaded from: classes.dex */
    public static class C2399d {
        /* renamed from: a */
        static Icon m37843a(Uri uri) {
            Icon createWithAdaptiveBitmapContentUri;
            createWithAdaptiveBitmapContentUri = Icon.createWithAdaptiveBitmapContentUri(uri);
            return createWithAdaptiveBitmapContentUri;
        }
    }

    public IconCompat() {
        this.f3339a = -1;
        this.f3341c = null;
        this.f3342d = null;
        this.f3343e = 0;
        this.f3344f = 0;
        this.f3345g = null;
        this.f3346h = f3338k;
        this.f3347i = null;
    }

    /* renamed from: b */
    public static IconCompat m37881b(Bundle bundle) {
        int i = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.f3343e = bundle.getInt("int1");
        iconCompat.f3344f = bundle.getInt("int2");
        iconCompat.f3348j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f3345g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f3346h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                iconCompat.f3340b = bundle.getParcelable("obj");
                break;
            case 0:
            default:
                Log.w("IconCompat", "Unknown type " + i);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f3340b = bundle.getString("obj");
                break;
            case 3:
                iconCompat.f3340b = bundle.getByteArray("obj");
                break;
        }
        return iconCompat;
    }

    /* renamed from: c */
    public static IconCompat m37880c(Icon icon) {
        return C2396a.m37856a(icon);
    }

    /* renamed from: d */
    static Bitmap m37879d(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* renamed from: e */
    public static IconCompat m37878e(Bitmap bitmap) {
        C2513d.m37599c(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f3340b = bitmap;
        return iconCompat;
    }

    /* renamed from: f */
    public static IconCompat m37877f(Uri uri) {
        C2513d.m37599c(uri);
        return m37876g(uri.toString());
    }

    /* renamed from: g */
    public static IconCompat m37876g(String str) {
        C2513d.m37599c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f3340b = str;
        return iconCompat;
    }

    /* renamed from: h */
    public static IconCompat m37875h(Bitmap bitmap) {
        C2513d.m37599c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f3340b = bitmap;
        return iconCompat;
    }

    /* renamed from: i */
    public static IconCompat m37874i(Uri uri) {
        C2513d.m37599c(uri);
        return m37873j(uri.toString());
    }

    /* renamed from: j */
    public static IconCompat m37873j(String str) {
        C2513d.m37599c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f3340b = str;
        return iconCompat;
    }

    /* renamed from: k */
    public static IconCompat m37872k(Context context, int i) {
        C2513d.m37599c(context);
        return m37871l(context.getResources(), context.getPackageName(), i);
    }

    /* renamed from: l */
    public static IconCompat m37871l(Resources resources, String str, int i) {
        C2513d.m37599c(str);
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f3343e = i;
            if (resources != null) {
                try {
                    iconCompat.f3340b = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f3340b = str;
            }
            iconCompat.f3348j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    /* renamed from: p */
    static Resources m37867p(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e);
            return null;
        }
    }

    /* renamed from: z */
    private static String m37857z(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: a */
    public void m37882a(Context context) {
        Object obj;
        if (this.f3339a == 2 && (obj = this.f3340b) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if ("0_resource_name_obfuscated".equals(str4)) {
                    Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                    return;
                }
                String o = m37868o();
                int identifier = m37867p(context, o).getIdentifier(str4, str3, str5);
                if (this.f3343e != identifier) {
                    Log.i("IconCompat", "Id has changed for " + o + " " + str);
                    this.f3343e = identifier;
                }
            }
        }
    }

    /* renamed from: m */
    public Bitmap m37870m() {
        int i = this.f3339a;
        if (i == -1) {
            Object obj = this.f3340b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i == 1) {
            return (Bitmap) this.f3340b;
        } else {
            if (i == 5) {
                return m37879d((Bitmap) this.f3340b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    /* renamed from: n */
    public int m37869n() {
        int i = this.f3339a;
        if (i == -1) {
            return C2396a.m37855b(this.f3340b);
        }
        if (i == 2) {
            return this.f3343e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: o */
    public String m37868o() {
        int i = this.f3339a;
        if (i == -1) {
            return C2396a.m37854c(this.f3340b);
        }
        if (i == 2) {
            String str = this.f3348j;
            if (str == null || TextUtils.isEmpty(str)) {
                return ((String) this.f3340b).split(":", -1)[0];
            }
            return this.f3348j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: q */
    public int m37866q() {
        int i = this.f3339a;
        if (i == -1) {
            return C2396a.m37853d(this.f3340b);
        }
        return i;
    }

    /* renamed from: r */
    public Uri m37865r() {
        int i = this.f3339a;
        if (i == -1) {
            return C2396a.m37852e(this.f3340b);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f3340b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* renamed from: s */
    public InputStream m37864s(Context context) {
        Uri r = m37865r();
        String scheme = r.getScheme();
        if ("content".equals(scheme) || JSStackTrace.FILE_KEY.equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(r);
            } catch (Exception e) {
                Log.w("IconCompat", "Unable to load image from URI: " + r, e);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f3340b));
            } catch (FileNotFoundException e2) {
                Log.w("IconCompat", "Unable to load image from path: " + r, e2);
                return null;
            }
        }
    }

    /* renamed from: t */
    public Drawable m37863t(Context context) {
        m37882a(context);
        return C2396a.m37851f(m37858y(context), context);
    }

    public String toString() {
        if (this.f3339a == -1) {
            return String.valueOf(this.f3340b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(m37857z(this.f3339a));
        switch (this.f3339a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f3340b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f3340b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f3348j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(m37869n())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f3343e);
                if (this.f3344f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f3344f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f3340b);
                break;
        }
        if (this.f3345g != null) {
            sb2.append(" tint=");
            sb2.append(this.f3345g);
        }
        if (this.f3346h != f3338k) {
            sb2.append(" mode=");
            sb2.append(this.f3346h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    /* renamed from: u */
    public void m37862u() {
        this.f3346h = PorterDuff.Mode.valueOf(this.f3347i);
        switch (this.f3339a) {
            case -1:
                Parcelable parcelable = this.f3342d;
                if (parcelable != null) {
                    this.f3340b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f3342d;
                if (parcelable2 != null) {
                    this.f3340b = parcelable2;
                    return;
                }
                byte[] bArr = this.f3341c;
                this.f3340b = bArr;
                this.f3339a = 3;
                this.f3343e = 0;
                this.f3344f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f3341c, Charset.forName("UTF-16"));
                this.f3340b = str;
                if (this.f3339a == 2 && this.f3348j == null) {
                    this.f3348j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f3340b = this.f3341c;
                return;
        }
    }

    /* renamed from: v */
    public void m37861v(boolean z) {
        this.f3347i = this.f3346h.name();
        switch (this.f3339a) {
            case -1:
                if (!z) {
                    this.f3342d = (Parcelable) this.f3340b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f3340b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f3341c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f3342d = (Parcelable) this.f3340b;
                return;
            case 2:
                this.f3341c = ((String) this.f3340b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f3341c = (byte[]) this.f3340b;
                return;
            case 4:
            case 6:
                this.f3341c = this.f3340b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    /* renamed from: w */
    public Bundle m37860w() {
        Bundle bundle = new Bundle();
        switch (this.f3339a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f3340b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f3340b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f3340b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f3340b);
                break;
        }
        bundle.putInt("type", this.f3339a);
        bundle.putInt("int1", this.f3343e);
        bundle.putInt("int2", this.f3344f);
        bundle.putString("string1", this.f3348j);
        ColorStateList colorStateList = this.f3345g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f3346h;
        if (mode != f3338k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    @Deprecated
    /* renamed from: x */
    public Icon m37859x() {
        return m37858y(null);
    }

    /* renamed from: y */
    public Icon m37858y(Context context) {
        return C2396a.m37850g(this, context);
    }

    IconCompat(int i) {
        this.f3341c = null;
        this.f3342d = null;
        this.f3343e = 0;
        this.f3344f = 0;
        this.f3345g = null;
        this.f3346h = f3338k;
        this.f3347i = null;
        this.f3339a = i;
    }
}
