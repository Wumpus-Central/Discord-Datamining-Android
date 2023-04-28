package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C2733w0;
import androidx.core.view.ContentInfoCompat;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.u */
/* loaded from: classes.dex */
public final class C1726u {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.u$a */
    /* loaded from: classes.dex */
    public static final class C1727a {
        /* JADX WARN: Finally extract failed */
        /* renamed from: a */
        static boolean m40016a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                C2733w0.m37010g0(textView, new ContentInfoCompat.C2521a(dragEvent.getClipData(), 3).m37565a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th2) {
                textView.endBatchEdit();
                throw th2;
            }
        }

        /* renamed from: b */
        static boolean m40015b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            C2733w0.m37010g0(view, new ContentInfoCompat.C2521a(dragEvent.getClipData(), 3).m37565a());
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m40019a(View view, DragEvent dragEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && C2733w0.m37057E(view) != null) {
            Activity c = m40017c(view);
            if (c == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            } else if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            } else {
                if (dragEvent.getAction() == 3) {
                    if (view instanceof TextView) {
                        return C1727a.m40016a(dragEvent, (TextView) view, c);
                    }
                    return C1727a.m40015b(dragEvent, view, c);
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m40018b(TextView textView, int i) {
        ClipData clipData;
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 31 || C2733w0.m37057E(textView) == null || (i != 16908322 && i != 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            clipData = null;
        } else {
            clipData = clipboardManager.getPrimaryClip();
        }
        if (clipData != null && clipData.getItemCount() > 0) {
            ContentInfoCompat.C2521a aVar = new ContentInfoCompat.C2521a(clipData, 1);
            if (i != 16908322) {
                i2 = 1;
            }
            C2733w0.m37010g0(textView, aVar.m37562d(i2).m37565a());
        }
        return true;
    }

    /* renamed from: c */
    static Activity m40017c(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
