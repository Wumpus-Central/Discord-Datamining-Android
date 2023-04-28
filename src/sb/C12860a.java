package sb;

import android.content.ContentResolver;
import android.provider.Settings;

/* renamed from: sb.a */
/* loaded from: classes3.dex */
public class C12860a {
    /* renamed from: a */
    public float m5249a(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
