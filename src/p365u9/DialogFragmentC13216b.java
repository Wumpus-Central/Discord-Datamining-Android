package p365u9;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import p420x9.C14004p;

/* renamed from: u9.b */
/* loaded from: classes5.dex */
public class DialogFragmentC13216b extends DialogFragment {

    /* renamed from: k */
    private Dialog f29679k;

    /* renamed from: l */
    private DialogInterface.OnCancelListener f29680l;

    /* renamed from: m */
    private Dialog f29681m;

    /* renamed from: a */
    public static DialogFragmentC13216b m4293a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC13216b bVar = new DialogFragmentC13216b();
        Dialog dialog2 = (Dialog) C14004p.m2050k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        bVar.f29679k = dialog2;
        if (onCancelListener != null) {
            bVar.f29680l = onCancelListener;
        }
        return bVar;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f29680l;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f29679k;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f29681m == null) {
            this.f29681m = new AlertDialog.Builder((Context) C14004p.m2051j(getActivity())).create();
        }
        return this.f29681m;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
