package p340t;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.C1915r1;
import com.facebook.react.views.text.TypefaceStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p390w.AbstractC13595f2;

/* renamed from: t.k */
/* loaded from: classes.dex */
public class C12923k implements AbstractC13595f2 {
    /* renamed from: b */
    private List<Size> m5064b(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && (i == 34 || i == 35)) {
            arrayList.add(new Size(720, 720));
            arrayList.add(new Size(TypefaceStyle.NORMAL, TypefaceStyle.NORMAL));
        }
        return arrayList;
    }

    /* renamed from: c */
    private List<Size> m5063c(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    /* renamed from: d */
    private List<Size> m5062d(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    /* renamed from: e */
    private static boolean m5061e() {
        if (!"HUAWEI".equalsIgnoreCase(Build.BRAND) || !"HWANE".equalsIgnoreCase(Build.DEVICE)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m5060f() {
        if (!"OnePlus".equalsIgnoreCase(Build.BRAND) || !"OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m5059g() {
        if (!"OnePlus".equalsIgnoreCase(Build.BRAND) || !"OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static boolean m5058h() {
        return m5060f() || m5059g() || m5061e();
    }

    /* renamed from: a */
    public List<Size> m5065a(String str, int i) {
        if (m5060f()) {
            return m5063c(str, i);
        }
        if (m5059g()) {
            return m5062d(str, i);
        }
        if (m5061e()) {
            return m5064b(str, i);
        }
        C1915r1.m39517k("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.emptyList();
    }
}
