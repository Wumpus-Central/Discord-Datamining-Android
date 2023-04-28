package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.collection.C2094a;
import androidx.core.content.C2337a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.activity.result.contract.a */
/* loaded from: classes.dex */
public final class C1498a extends ActivityResultContract<String[], Map<String, Boolean>> {
    /* renamed from: e */
    static Intent m40962e(String[] strArr) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
    }

    /* renamed from: d */
    public Intent mo33700a(Context context, String[] strArr) {
        return m40962e(strArr);
    }

    /* renamed from: f */
    public ActivityResultContract.C1497a<Map<String, Boolean>> mo40964b(Context context, String[] strArr) {
        boolean z;
        if (strArr == null || strArr.length == 0) {
            return new ActivityResultContract.C1497a<>(Collections.emptyMap());
        }
        C2094a aVar = new C2094a();
        boolean z2 = true;
        for (String str : strArr) {
            if (C2337a.m38137a(context, str) == 0) {
                z = true;
            } else {
                z = false;
            }
            aVar.put(str, Boolean.valueOf(z));
            if (!z) {
                z2 = false;
            }
        }
        if (z2) {
            return new ActivityResultContract.C1497a<>(aVar);
        }
        return null;
    }

    /* renamed from: g */
    public Map<String, Boolean> mo33699c(int i, Intent intent) {
        boolean z;
        if (i != -1) {
            return Collections.emptyMap();
        }
        if (intent == null) {
            return Collections.emptyMap();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        int length = stringArrayExtra.length;
        for (int i2 = 0; i2 < length; i2++) {
            String str = stringArrayExtra[i2];
            if (intArrayExtra[i2] == 0) {
                z = true;
            } else {
                z = false;
            }
            hashMap.put(str, Boolean.valueOf(z));
        }
        return hashMap;
    }
}
