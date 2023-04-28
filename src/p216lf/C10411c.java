package p216lf;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C9971q;
import nf.C11090s;
import nf.C11093t;
import nf.C11098x;
import nf.C11099y;
import p326ri.C12718u;
import p326ri.C12719v;
import p426xf.C14081b;
import p426xf.C14082c;
import p426xf.C14099n;

@Metadata(m15074d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004\u001a\n\u0010\u0007\u001a\u00020\u0002*\u00020\u0005\u001a\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004\u001a\u001e\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b\u001a\u001e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b\u001a\u0016\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\t\u001a\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0000\u001a\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0014H\u0000\u001a*\u0010\u001b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u001a*\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u000b\"\u001c\u0010!\u001a\n \u001f*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 ¨\u0006\""}, m15073d2 = {"Landroid/content/Context;", "context", "", "a", "Ljava/io/File;", "Landroid/graphics/Bitmap$CompressFormat;", "c", "g", "imageFile", "Landroid/graphics/Bitmap;", "i", "", "reqWidth", "reqHeight", "e", "Landroid/graphics/BitmapFactory$Options;", "options", "b", "bitmap", "f", "Landroid/net/Uri;", "srcFileUri", "d", "uri", "h", "format", "quality", "j", "destination", "", "l", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "separator", "compressor_release"}, m15072k = 2, m15071mv = {1, 4, 0})
/* renamed from: lf.c */
/* loaded from: classes8.dex */
public final class C10411c {

    /* renamed from: a */
    private static final String f22819a = File.separator;

    /* renamed from: a */
    private static final String m13471a(Context context) {
        StringBuilder sb2 = new StringBuilder();
        File cacheDir = context.getCacheDir();
        C9971q.m14637c(cacheDir, "context.cacheDir");
        sb2.append(cacheDir.getPath());
        String str = f22819a;
        sb2.append(str);
        sb2.append("compressor");
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: b */
    public static final int m13470b(BitmapFactory.Options options, int i, int i2) {
        C9971q.m14632h(options, "options");
        Pair a = C11098x.m10921a(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int intValue = ((Number) a.m15067a()).intValue();
        int intValue2 = ((Number) a.m15066b()).intValue();
        int i3 = 1;
        if (intValue > i2 || intValue2 > i) {
            int i4 = intValue / 2;
            int i5 = intValue2 / 2;
            while (i4 / i3 >= i2 && i5 / i3 >= i) {
                i3 *= 2;
            }
        }
        return i3;
    }

    /* renamed from: c */
    public static final Bitmap.CompressFormat m13469c(File compressFormat) {
        String j;
        C9971q.m14632h(compressFormat, "$this$compressFormat");
        j = C14099n.m1680j(compressFormat);
        if (j != null) {
            String lowerCase = j.toLowerCase();
            C9971q.m14637c(lowerCase, "(this as java.lang.String).toLowerCase()");
            int hashCode = lowerCase.hashCode();
            if (hashCode != 111145) {
                if (hashCode != 3198679) {
                    if (hashCode == 3645340 && lowerCase.equals("webp")) {
                        return Bitmap.CompressFormat.WEBP;
                    }
                } else if (lowerCase.equals("heic")) {
                    return null;
                }
            } else if (lowerCase.equals("png")) {
                return Bitmap.CompressFormat.PNG;
            }
            return Bitmap.CompressFormat.JPEG;
        }
        throw new C11099y("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: d */
    public static final File m13468d(Context context, Uri srcFileUri) {
        C9971q.m14632h(context, "context");
        C9971q.m14632h(srcFileUri, "srcFileUri");
        File file = new File(m13471a(context) + m13464h(context, srcFileUri));
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        file.deleteOnExit();
        th = null;
        try {
            C14081b.m1715b(new ParcelFileDescriptor.AutoCloseInputStream(context.getContentResolver().openFileDescriptor(srcFileUri, "r")), new FileOutputStream(file), 0, 2, th);
            return file;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* renamed from: e */
    public static final Bitmap m13467e(File imageFile, int i, int i2) {
        C9971q.m14632h(imageFile, "imageFile");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(imageFile.getAbsolutePath(), options);
        options.inSampleSize = m13470b(options, i, i2);
        options.inJustDecodeBounds = false;
        Bitmap decodeFile = BitmapFactory.decodeFile(imageFile.getAbsolutePath(), options);
        C9971q.m14637c(decodeFile, "BitmapFactory.decodeFile…eFile.absolutePath, this)");
        C9971q.m14637c(decodeFile, "BitmapFactory.Options().…absolutePath, this)\n    }");
        return decodeFile;
    }

    /* renamed from: f */
    public static final Bitmap m13466f(File imageFile, Bitmap bitmap) {
        C9971q.m14632h(imageFile, "imageFile");
        C9971q.m14632h(bitmap, "bitmap");
        int attributeInt = new ExifInterface(imageFile.getAbsolutePath()).getAttributeInt("Orientation", 0);
        Matrix matrix = new Matrix();
        if (attributeInt == 3) {
            matrix.postRotate(180.0f);
        } else if (attributeInt == 6) {
            matrix.postRotate(90.0f);
        } else if (attributeInt == 8) {
            matrix.postRotate(270.0f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        C9971q.m14637c(createBitmap, "Bitmap.createBitmap(bitm…map.height, matrix, true)");
        return createBitmap;
    }

    /* renamed from: g */
    public static final String m13465g(Bitmap.CompressFormat extension) {
        C9971q.m14632h(extension, "$this$extension");
        int i = C10410b.f22818a[extension.ordinal()];
        if (i == 1) {
            return "png";
        }
        if (i != 2) {
            return "jpg";
        }
        return "webp";
    }

    /* renamed from: h */
    public static final String m13464h(Context context, Uri uri) {
        Object obj;
        Object obj2;
        String str;
        String type;
        String str2;
        Cursor query;
        boolean w;
        C9971q.m14632h(context, "context");
        C9971q.m14632h(uri, "uri");
        ContentResolver contentResolver = context.getContentResolver();
        try {
            C11090s.C11091a aVar = C11090s.f24606l;
            query = contentResolver.query(uri, new String[]{"_display_name"}, null, null, null);
            if (query == null) {
                C9971q.m14621s();
            }
        } catch (Throwable th2) {
            C11090s.C11091a aVar2 = C11090s.f24606l;
            obj = C11090s.m10940b(C11093t.m10931a(th2));
        }
        if (query.moveToFirst()) {
            String it = query.getString(query.getColumnIndex("_display_name"));
            C9971q.m14637c(it, "it");
            w = C12718u.m5729w(it);
            if (!(!w)) {
                it = null;
            }
            if (it == null) {
                C9971q.m14621s();
            }
            C14082c.m1713a(query, null);
            obj = C11090s.m10940b(it);
            if (C11090s.m10937e(obj) != null) {
                try {
                    str = "IMG_" + new SimpleDateFormat("yyyyMMdd_", Locale.getDefault()).format(new Date()) + System.nanoTime();
                    type = contentResolver.getType(uri);
                } catch (Throwable th3) {
                    C11090s.C11091a aVar3 = C11090s.f24606l;
                    obj2 = C11090s.m10940b(C11093t.m10931a(th3));
                }
                if (!C9971q.m14638b(type, "image/jpg") && !C9971q.m14638b(type, "image/jpeg")) {
                    if (C9971q.m14638b(type, "image/png")) {
                        str2 = "png";
                    } else if (C9971q.m14638b(type, "image/webp")) {
                        str2 = "webp";
                    } else {
                        throw new IllegalArgumentException("Cannot generate fallback filename for " + type + ' ' + uri);
                    }
                    obj2 = C11090s.m10940b(str + '.' + str2);
                    obj = obj2;
                }
                str2 = "jpg";
                obj2 = C11090s.m10940b(str + '.' + str2);
                obj = obj2;
            }
            C11093t.m10930b(obj);
            return (String) obj;
        }
        throw new IllegalStateException("Cursor is empty".toString());
    }

    /* renamed from: i */
    public static final Bitmap m13463i(File imageFile) {
        boolean z;
        C9971q.m14632h(imageFile, "imageFile");
        Bitmap decodeFile = BitmapFactory.decodeFile(imageFile.getAbsolutePath());
        if (decodeFile != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m13466f(imageFile, decodeFile);
        }
        throw new IllegalArgumentException(("Failed to load bitmap from " + imageFile).toString());
    }

    /* renamed from: j */
    public static final File m13462j(File imageFile, Bitmap bitmap, Bitmap.CompressFormat format, int i) {
        File file;
        String U0;
        C9971q.m14632h(imageFile, "imageFile");
        C9971q.m14632h(bitmap, "bitmap");
        C9971q.m14632h(format, "format");
        if (format == m13469c(imageFile)) {
            file = imageFile;
        } else {
            StringBuilder sb2 = new StringBuilder();
            String absolutePath = imageFile.getAbsolutePath();
            C9971q.m14637c(absolutePath, "imageFile.absolutePath");
            U0 = C12719v.m5692U0(absolutePath, ".", null, 2, null);
            sb2.append(U0);
            sb2.append('.');
            sb2.append(m13465g(format));
            file = new File(sb2.toString());
        }
        imageFile.delete();
        m13460l(bitmap, file, format, i);
        return file;
    }

    /* renamed from: k */
    public static /* synthetic */ File m13461k(File file, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i, int i2, Object obj) {
        if ((i2 & 4) != 0 && (compressFormat = m13469c(file)) == null) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        if ((i2 & 8) != 0) {
            i = 100;
        }
        return m13462j(file, bitmap, compressFormat, i);
    }

    /* renamed from: l */
    public static final void m13460l(Bitmap bitmap, File destination, Bitmap.CompressFormat format, int i) {
        Throwable th2;
        C9971q.m14632h(bitmap, "bitmap");
        C9971q.m14632h(destination, "destination");
        C9971q.m14632h(format, "format");
        File parentFile = destination.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(destination.getAbsolutePath());
            try {
                bitmap.compress(format, i, fileOutputStream2);
                fileOutputStream2.flush();
                fileOutputStream2.close();
            } catch (Throwable th3) {
                th2 = th3;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }
}
