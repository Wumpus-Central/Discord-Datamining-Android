package p365u9;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import p420x9.C14004p;

/* renamed from: u9.l */
/* loaded from: classes5.dex */
public class C13226l extends DialogFragment {

    /* renamed from: k */
    private Dialog f29700k;

    /* renamed from: l */
    private DialogInterface.OnCancelListener f29701l;

    /* renamed from: m */
    private Dialog f29702m;

    /* renamed from: d */
    public static C13226l m4254d(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C13226l lVar = new C13226l();
        Dialog dialog2 = (Dialog) C14004p.m2050k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        lVar.f29700k = dialog2;
        if (onCancelListener != null) {
            lVar.f29701l = onCancelListener;
        }
        return lVar;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f29701l;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f29700k;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f29702m == null) {
            this.f29702m = new AlertDialog.Builder((Context) C14004p.m2051j(getContext())).create();
        }
        return this.f29702m;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
