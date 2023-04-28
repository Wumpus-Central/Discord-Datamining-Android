package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.core.content.res.C2359e;
import androidx.core.provider.C2476g;
import com.facebook.react.util.JSStackTrace;
import com.facebook.react.views.text.TypefaceStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: androidx.core.provider.d */
/* loaded from: classes.dex */
class C2467d {

    /* renamed from: a */
    private static final Comparator<byte[]> f3397a = new Comparator() { // from class: androidx.core.provider.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int g;
            g = C2467d.m37700g((byte[]) obj, (byte[]) obj2);
            return g;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.d$a */
    /* loaded from: classes.dex */
    public static class C2468a {
        /* renamed from: a */
        static Cursor m37698a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* renamed from: b */
    private static List<byte[]> m37705b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: c */
    private static boolean m37704c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static List<List<byte[]>> m37703d(C2469e eVar, Resources resources) {
        if (eVar.m37696b() != null) {
            return eVar.m37696b();
        }
        return C2359e.m38014c(resources, eVar.m37695c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C2476g.C2477a m37702e(Context context, C2469e eVar, CancellationSignal cancellationSignal) {
        ProviderInfo f = m37701f(context.getPackageManager(), eVar, context.getResources());
        if (f == null) {
            return C2476g.C2477a.m37677a(1, null);
        }
        return C2476g.C2477a.m37677a(0, m37699h(context, eVar, f.authority, cancellationSignal));
    }

    /* renamed from: f */
    static ProviderInfo m37701f(PackageManager packageManager, C2469e eVar, Resources resources) {
        String e = eVar.m37693e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + e);
        } else if (resolveContentProvider.packageName.equals(eVar.m37692f())) {
            List<byte[]> b = m37705b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(b, f3397a);
            List<List<byte[]>> d = m37703d(eVar, resources);
            for (int i = 0; i < d.size(); i++) {
                ArrayList arrayList = new ArrayList(d.get(i));
                Collections.sort(arrayList, f3397a);
                if (m37704c(b, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + e + ", but package was not " + eVar.m37692f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ int m37700g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    /* renamed from: h */
    static C2476g.C2478b[] m37699h(Context context, C2469e eVar, String str, CancellationSignal cancellationSignal) {
        int i;
        int i2;
        int i3;
        Uri uri;
        int i4;
        boolean z;
        int i5;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath(JSStackTrace.FILE_KEY).build();
        Cursor cursor = null;
        try {
            int i6 = 0;
            cursor = C2468a.m37698a(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{eVar.m37691g()}, null, cancellationSignal);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    if (columnIndex != -1) {
                        i = cursor.getInt(columnIndex);
                    } else {
                        i = i6;
                    }
                    if (columnIndex4 != -1) {
                        i2 = cursor.getInt(columnIndex4);
                    } else {
                        i2 = i6;
                    }
                    if (columnIndex3 == -1) {
                        i3 = i;
                        uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        i3 = i;
                        uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    if (columnIndex5 != -1) {
                        i4 = cursor.getInt(columnIndex5);
                    } else {
                        i4 = TypefaceStyle.NORMAL;
                    }
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        i5 = i3;
                        z = false;
                    } else {
                        i5 = i3;
                        z = true;
                    }
                    arrayList2.add(C2476g.C2478b.m37674a(uri, i2, i4, z, i5));
                    i6 = 0;
                }
                arrayList = arrayList2;
            }
            return (C2476g.C2478b[]) arrayList.toArray(new C2476g.C2478b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
