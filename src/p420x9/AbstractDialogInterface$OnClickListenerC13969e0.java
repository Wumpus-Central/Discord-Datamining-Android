package p420x9;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import p400w9.AbstractC13821f;

/* renamed from: x9.e0 */
/* loaded from: classes5.dex */
public abstract class AbstractDialogInterface$OnClickListenerC13969e0 implements DialogInterface.OnClickListener {
    /* renamed from: b */
    public static AbstractDialogInterface$OnClickListenerC13969e0 m2119b(Activity activity, Intent intent, int i) {
        return new C13962c0(intent, activity, i);
    }

    /* renamed from: c */
    public static AbstractDialogInterface$OnClickListenerC13969e0 m2118c(AbstractC13821f fVar, Intent intent, int i) {
        return new C13966d0(intent, fVar, 2);
    }

    /* renamed from: a */
    protected abstract void mo2120a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo2120a();
        } catch (ActivityNotFoundException e) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
