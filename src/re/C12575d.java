package re;

import android.os.Environment;
import android.os.StatFs;
import android.util.Log;

/* renamed from: re.d */
/* loaded from: classes6.dex */
public class C12575d {

    /* renamed from: a */
    private static final String f28277a = "d";

    /* renamed from: a */
    public long m6492a() {
        try {
            return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes();
        } catch (Exception unused) {
            Log.e(f28277a, "Could not get Available Disk Space");
            return -1L;
        }
    }
}
