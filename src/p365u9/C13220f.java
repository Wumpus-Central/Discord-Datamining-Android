package p365u9;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import ca.C3799f;
import ca.C3803j;
import com.google.android.gms.common.api.GoogleApiActivity;
import na.C10771e;
import p082ea.C6799b;
import p338s9.C12825a;
import p338s9.C12826b;
import p400w9.AbstractC13821f;
import p400w9.AbstractC13840r;
import p400w9.C13841s;
import p420x9.AbstractDialogInterface$OnClickListenerC13969e0;
import p420x9.C13955b0;
import p420x9.C14004p;

/* renamed from: u9.f */
/* loaded from: classes5.dex */
public class C13220f extends C13221g {

    /* renamed from: c */
    private String f29688c;

    /* renamed from: e */
    private static final Object f29686e = new Object();

    /* renamed from: f */
    private static final C13220f f29687f = new C13220f();

    /* renamed from: d */
    public static final int f29685d = C13221g.f29689a;

    /* renamed from: k */
    public static C13220f m4286k() {
        return f29687f;
    }

    @Override // p365u9.C13221g
    /* renamed from: a */
    public Intent mo4275a(Context context, int i, String str) {
        return super.mo4275a(context, i, str);
    }

    @Override // p365u9.C13221g
    /* renamed from: b */
    public PendingIntent mo4274b(Context context, int i, int i2) {
        return super.mo4274b(context, i, i2);
    }

    @Override // p365u9.C13221g
    /* renamed from: d */
    public final String mo4272d(int i) {
        return super.mo4272d(i);
    }

    @Override // p365u9.C13221g
    /* renamed from: e */
    public int mo4271e(Context context) {
        return super.mo4271e(context);
    }

    @Override // p365u9.C13221g
    /* renamed from: f */
    public int mo4270f(Context context, int i) {
        return super.mo4270f(context, i);
    }

    @Override // p365u9.C13221g
    /* renamed from: h */
    public final boolean mo4268h(int i) {
        return super.mo4268h(i);
    }

    /* renamed from: i */
    public Dialog m4288i(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return m4283n(activity, i, AbstractDialogInterface$OnClickListenerC13969e0.m2119b(activity, mo4275a(activity, i, "d"), i2), onCancelListener);
    }

    /* renamed from: j */
    public PendingIntent m4287j(Context context, C13215a aVar) {
        if (aVar.m4295u()) {
            return aVar.m4296t();
        }
        return mo4274b(context, aVar.m4298p(), 0);
    }

    /* renamed from: l */
    public boolean m4285l(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog i3 = m4288i(activity, i, i2, onCancelListener);
        if (i3 == null) {
            return false;
        }
        m4280q(activity, i3, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: m */
    public void m4284m(Context context, int i) {
        m4279r(context, i, null, m4273c(context, i, 0, "n"));
    }

    /* renamed from: n */
    final Dialog m4283n(Context context, int i, AbstractDialogInterface$OnClickListenerC13969e0 e0Var, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C13955b0.m2196d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c = C13955b0.m2197c(context, i);
        if (c != null) {
            builder.setPositiveButton(c, e0Var);
        }
        String g = C13955b0.m2193g(context, i);
        if (g != null) {
            builder.setTitle(g);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    /* renamed from: o */
    public final Dialog m4282o(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C13955b0.m2196d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        m4280q(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: p */
    public final C13841s m4281p(Context context, AbstractC13840r rVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C13841s sVar = new C13841s(rVar);
        context.registerReceiver(sVar, intentFilter);
        sVar.m2543a(context);
        if (m4269g(context, "com.google.android.gms")) {
            return sVar;
        }
        rVar.mo2544a();
        sVar.m2542b();
        return null;
    }

    /* renamed from: q */
    final void m4280q(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                C13226l.m4254d(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC13216b.m4293a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    /* renamed from: r */
    final void m4279r(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        String str2;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null), new IllegalArgumentException());
        if (i == 18) {
            m4278s(context);
        } else if (pendingIntent != null) {
            String f = C13955b0.m2194f(context, i);
            String e = C13955b0.m2195e(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) C14004p.m2051j(context.getSystemService("notification"));
            NotificationCompat.Builder e0 = new NotificationCompat.Builder(context).m38563N(true).m38519t(true).m38572E(f).m38541e0(new NotificationCompat.C2171c().m38481x(e));
            if (C3799f.m33576c(context)) {
                C14004p.m2049l(C3803j.m33562e());
                e0.m38551Z(context.getApplicationInfo().icon).m38558S(2);
                if (C3799f.m33575d(context)) {
                    e0.m38550a(C12825a.f28861a, resources.getString(C12826b.f28876o), pendingIntent);
                } else {
                    e0.m38574C(pendingIntent);
                }
            } else {
                e0.m38551Z(17301642).m38537g0(resources.getString(C12826b.f28869h)).m38527l0(System.currentTimeMillis()).m38574C(pendingIntent).m38573D(e);
            }
            if (C3803j.m33559h()) {
                C14004p.m2049l(C3803j.m33559h());
                synchronized (f29686e) {
                    str2 = this.f29688c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    notificationChannel = notificationManager.getNotificationChannel(str2);
                    String b = C13955b0.m2198b(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(str2, b, 4));
                    } else {
                        name = notificationChannel.getName();
                        if (!b.contentEquals(name)) {
                            notificationChannel.setName(b);
                            notificationManager.createNotificationChannel(notificationChannel);
                        }
                    }
                }
                e0.m38515x(str2);
            }
            Notification g = e0.m38538g();
            if (i == 1 || i == 2 || i == 3) {
                C13223i.f29693b.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, g);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    /* renamed from: s */
    final void m4278s(Context context) {
        new HandlerC13227m(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    /* renamed from: t */
    public final boolean m4277t(Activity activity, AbstractC13821f fVar, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog n = m4283n(activity, i, AbstractDialogInterface$OnClickListenerC13969e0.m2118c(fVar, mo4275a(activity, i, "d"), 2), onCancelListener);
        if (n == null) {
            return false;
        }
        m4280q(activity, n, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: u */
    public final boolean m4276u(Context context, C13215a aVar, int i) {
        PendingIntent j;
        if (C6799b.m24311a(context) || (j = m4287j(context, aVar)) == null) {
            return false;
        }
        m4279r(context, aVar.m4298p(), null, C10771e.m12355a(context, 0, GoogleApiActivity.m29118a(context, j, i, true), C10771e.f23924a | 134217728));
        return true;
    }
}
