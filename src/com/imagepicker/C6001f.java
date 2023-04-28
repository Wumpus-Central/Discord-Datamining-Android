package com.imagepicker;

import android.app.Activity;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import androidx.core.content.C2337a;
import androidx.core.content.FileProvider;
import androidx.exifinterface.media.C2892a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.util.JSStackTrace;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.webrtc.MediaStreamTrack;

/* renamed from: com.imagepicker.f */
/* loaded from: classes6.dex */
public class C6001f {

    /* renamed from: a */
    public static String f12111a = "rn_image_picker_lib_temp_";

    /* renamed from: b */
    public static String f12112b = "camera_unavailable";

    /* renamed from: c */
    public static String f12113c = "permission";

    /* renamed from: d */
    public static String f12114d = "others";

    /* renamed from: e */
    public static String f12115e = "photo";

    /* renamed from: f */
    public static String f12116f = "video";

    /* renamed from: g */
    public static String f12117g = "mixed";

    /* renamed from: h */
    public static String f12118h = "any";

    /* renamed from: i */
    public static String f12119i = "This library does not require Manifest.permission.CAMERA, if you add this permission in manifest then you have to obtain the same.";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static boolean m26539A(int i) {
        switch (i) {
            case ImagePickerModule.REQUEST_LAUNCH_IMAGE_CAPTURE /* 13001 */:
            case ImagePickerModule.REQUEST_LAUNCH_VIDEO_CAPTURE /* 13002 */:
            case ImagePickerModule.REQUEST_LAUNCH_LIBRARY /* 13003 */:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: B */
    static boolean m26538B(Uri uri, Context context) {
        return m26508y("video/", uri, context);
    }

    /* renamed from: C */
    public static Uri m26537C(Uri uri, UUID uuid, Context context, C6000e eVar) {
        try {
            int[] o = m26518o(uri, context);
            if (!m26533G(o[0], o[1], eVar)) {
                return uri;
            }
            int[] n = m26519n(o[0], o[1], eVar);
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            String r = m26515r(uri);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeStream(openInputStream), n[0], n[1], true);
            String s = m26514s(uri, context);
            File c = m26530c(context, uuid, m26520m(r));
            createScaledBitmap.compress(m26525h(r), eVar.f12104e, context.getContentResolver().openOutputStream(Uri.fromFile(c)));
            m26534F(c, s, context);
            return Uri.fromFile(c);
        } catch (Exception e) {
            e.printStackTrace();
            return uri;
        }
    }

    /* renamed from: D */
    public static void m26536D(Uri uri, UUID uuid, Context context, String str) {
        Uri uri2;
        ContentResolver contentResolver = context.getContentResolver();
        ContentValues contentValues = new ContentValues();
        if (uuid == null) {
            uuid = UUID.randomUUID();
        }
        if (str.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            contentValues.put("_display_name", uuid.toString());
            contentValues.put("mime_type", contentResolver.getType(uri));
            uri2 = contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
        } else {
            contentValues.put("_display_name", uuid.toString());
            contentValues.put("mime_type", contentResolver.getType(uri));
            uri2 = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        }
        m26531b(uri, uri2, contentResolver);
    }

    /* renamed from: E */
    public static void m26535E(Intent intent) {
        int i = Build.VERSION.SDK_INT;
        intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
        if (i >= 26) {
            intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
        }
    }

    /* renamed from: F */
    static void m26534F(File file, String str, Context context) {
        if (!str.equals(String.valueOf(1)) && !str.equals(String.valueOf(0))) {
            C2892a aVar = new C2892a(file);
            aVar.m36332a0("Orientation", str);
            aVar.m36337W();
        }
    }

    /* renamed from: G */
    static boolean m26533G(int i, int i2, C6000e eVar) {
        int i3 = eVar.f12105f;
        if ((i3 == 0 || eVar.f12106g == 0) && eVar.f12104e == 100) {
            return false;
        }
        if (i3 < i || eVar.f12106g < i2 || eVar.f12104e != 100) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static List<Uri> m26532a(Intent intent) {
        if (intent.getClipData() == null) {
            return Collections.singletonList(intent.getData());
        }
        ClipData clipData = intent.getClipData();
        ArrayList arrayList = new ArrayList(clipData.getItemCount());
        for (int i = 0; i < clipData.getItemCount(); i++) {
            arrayList.add(clipData.getItemAt(i).getUri());
        }
        return arrayList;
    }

    /* renamed from: b */
    public static void m26531b(Uri uri, Uri uri2, ContentResolver contentResolver) {
        try {
            OutputStream openOutputStream = contentResolver.openOutputStream(uri2);
            InputStream openInputStream = contentResolver.openInputStream(uri);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read != -1) {
                    openOutputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static File m26530c(Context context, UUID uuid, String str) {
        if (uuid == null) {
            try {
                uuid = UUID.randomUUID();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        File file = new File(context.getCacheDir(), f12111a + uuid + "." + str);
        file.createNewFile();
        return file;
    }

    /* renamed from: d */
    public static Uri m26529d(File file, Context context) {
        return FileProvider.getUriForFile(context, context.getApplicationContext().getPackageName() + ".imagepickerprovider", file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m26528e(Uri uri) {
        new File(uri.getPath()).delete();
    }

    /* renamed from: f */
    public static Uri m26527f(Uri uri, UUID uuid, Context context) {
        if (uri == null) {
            return null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        Uri fromFile = Uri.fromFile(m26530c(context, uuid, m26520m(contentResolver.getType(uri))));
        m26531b(uri, fromFile, contentResolver);
        return fromFile;
    }

    /* renamed from: g */
    static String m26526g(Uri uri, Context context) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            byte[] bArr = new byte[8192];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                try {
                    int read = openInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: h */
    static Bitmap.CompressFormat m26525h(String str) {
        str.hashCode();
        if (str.equals("image/jpeg")) {
            return Bitmap.CompressFormat.JPEG;
        }
        if (!str.equals("image/png")) {
            return Bitmap.CompressFormat.JPEG;
        }
        return Bitmap.CompressFormat.PNG;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static ReadableMap m26524i() {
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("didCancel", true);
        return createMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static ReadableMap m26523j(String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("errorCode", str);
        if (str2 != null) {
            createMap.putString("errorMessage", str2);
        }
        return createMap;
    }

    /* renamed from: k */
    static ReadableMap m26522k(Uri uri, Context context) {
        String a = ContentResolver.m26542a(context.getContentResolver(), uri);
        WritableMap createMap = Arguments.createMap();
        createMap.putString("uri", uri.toString());
        createMap.putString("fileName", a);
        createMap.putString("mimeType", m26516q(uri, context));
        return createMap;
    }

    /* renamed from: l */
    static double m26521l(Uri uri, Context context) {
        try {
            return context.getContentResolver().openFileDescriptor(uri, "r").getStatSize();
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0d;
        }
    }

    /* renamed from: m */
    static String m26520m(String str) {
        if (str == null) {
            return "jpg";
        }
        if (str.equals("image/gif")) {
            return "gif";
        }
        if (!str.equals("image/png")) {
            return "jpg";
        }
        return "png";
    }

    /* renamed from: n */
    static int[] m26519n(int i, int i2, C6000e eVar) {
        int i3;
        int i4 = eVar.f12105f;
        if (i4 == 0 || (i3 = eVar.f12106g) == 0) {
            return new int[]{i, i2};
        }
        if (i4 < i) {
            i2 = (int) ((i4 / i) * i2);
            i = i4;
        }
        if (i3 < i2) {
            i = (int) ((i3 / i2) * i);
        } else {
            i3 = i2;
        }
        return new int[]{i, i3};
    }

    /* renamed from: o */
    public static int[] m26518o(Uri uri, Context context) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(openInputStream, null, options);
            return new int[]{options.outWidth, options.outHeight};
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return new int[]{0, 0};
        }
    }

    /* renamed from: p */
    static ReadableMap m26517p(Uri uri, C6000e eVar, Context context) {
        String lastPathSegment = uri.getLastPathSegment();
        C5997b bVar = new C5997b(uri, context);
        int[] o = m26518o(uri, context);
        WritableMap createMap = Arguments.createMap();
        createMap.putString("uri", uri.toString());
        createMap.putDouble("fileSize", m26521l(uri, context));
        createMap.putString("fileName", lastPathSegment);
        createMap.putString("type", m26515r(uri));
        createMap.putInt("width", o[0]);
        createMap.putInt("height", o[1]);
        createMap.putString("type", m26516q(uri, context));
        if (eVar.f12101b.booleanValue()) {
            createMap.putString("base64", m26526g(uri, context));
        }
        if (eVar.f12102c.booleanValue()) {
            createMap.putString("timestamp", bVar.m26541b());
            createMap.putString("id", lastPathSegment);
        }
        return createMap;
    }

    /* renamed from: q */
    static String m26516q(Uri uri, Context context) {
        if (uri.getScheme().equals(JSStackTrace.FILE_KEY)) {
            return m26515r(uri);
        }
        return context.getContentResolver().getType(uri);
    }

    /* renamed from: r */
    static String m26515r(Uri uri) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()));
    }

    /* renamed from: s */
    static String m26514s(Uri uri, Context context) {
        return new C2892a(context.getContentResolver().openInputStream(uri)).m36323f("Orientation");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static ReadableMap m26513t(List<Uri> list, UUID uuid, C6000e eVar, Context context) {
        boolean equals = eVar.f12110k.equals(f12115e);
        boolean equals2 = eVar.f12110k.equals(f12116f);
        boolean equals3 = eVar.f12110k.equals(f12117g);
        boolean equals4 = eVar.f12110k.equals(f12118h);
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i);
            if (m26507z(uri, context) && (equals || equals3)) {
                if (uri.getScheme().contains("content")) {
                    uri = m26527f(uri, uuid, context);
                }
                createArray.pushMap(m26517p(m26537C(uri, uuid, context, eVar), eVar, context));
            } else if (m26538B(uri, context) && (equals2 || equals3)) {
                createArray.pushMap(m26512u(uri, eVar, context));
            } else if (equals4) {
                createArray.pushMap(m26522k(uri, context));
            } else {
                throw new RuntimeException("Unsupported file type");
            }
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putArray("assets", createArray);
        return createMap;
    }

    /* renamed from: u */
    static ReadableMap m26512u(Uri uri, C6000e eVar, Context context) {
        String a = ContentResolver.m26542a(context.getContentResolver(), uri);
        WritableMap createMap = Arguments.createMap();
        C6002g gVar = new C6002g(uri, context);
        createMap.putString("uri", uri.toString());
        createMap.putDouble("fileSize", m26521l(uri, context));
        createMap.putInt("duration", gVar.m26503e());
        createMap.putInt("bitrate", gVar.m26505c());
        createMap.putString("fileName", a);
        createMap.putString("type", m26516q(uri, context));
        createMap.putInt("width", gVar.m26501g());
        createMap.putInt("height", gVar.m26502f());
        if (eVar.f12102c.booleanValue()) {
            createMap.putString("timestamp", gVar.m26504d());
            createMap.putString("id", a);
        }
        return createMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static boolean m26511v(Activity activity) {
        if (C2337a.m38137a(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public static boolean m26510w(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.camera") || context.getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public static boolean m26509x(Context context, Activity activity) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null && Arrays.asList(strArr).contains("android.permission.CAMERA")) {
                if (C2337a.m38137a(activity, "android.permission.CAMERA") != 0) {
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: y */
    static boolean m26508y(String str, Uri uri, Context context) {
        String q = m26516q(uri, context);
        if (q != null) {
            return q.contains(str);
        }
        return false;
    }

    /* renamed from: z */
    static boolean m26507z(Uri uri, Context context) {
        return m26508y("image/", uri, context);
    }
}
