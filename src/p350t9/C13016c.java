package p350t9;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.tasks.C5474b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p064db.AbstractC6421a;
import p064db.AbstractC6424d;
import p262oa.C11241a;

/* renamed from: t9.c */
/* loaded from: classes5.dex */
public class C13016c {

    /* renamed from: h */
    private static int f29294h;

    /* renamed from: i */
    private static PendingIntent f29295i;

    /* renamed from: j */
    private static final Executor f29296j = ExecutorC13019d0.f29306k;

    /* renamed from: k */
    private static final Pattern f29297k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b */
    private final Context f29299b;

    /* renamed from: c */
    private final C13039x f29300c;

    /* renamed from: d */
    private final ScheduledExecutorService f29301d;

    /* renamed from: f */
    private Messenger f29303f;

    /* renamed from: g */
    private C13023h f29304g;

    /* renamed from: a */
    private final SimpleArrayMap<String, TaskCompletionSource<Bundle>> f29298a = new SimpleArrayMap<>();

    /* renamed from: e */
    private Messenger f29302e = new Messenger(new HandlerC13020e(this, Looper.getMainLooper()));

    public C13016c(Context context) {
        this.f29299b = context;
        this.f29300c = new C13039x(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f29301d = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ Task m4734b(Bundle bundle) {
        if (m4726j(bundle)) {
            return C5474b.m28893e(null);
        }
        return C5474b.m28893e(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* bridge */ /* synthetic */ void m4732d(C13016c cVar, Message message) {
        String str;
        String str2;
        String str3;
        String str4;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C13022g());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C13023h) {
                        cVar.f29304g = (C13023h) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        cVar.f29303f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
                            sb2.append("Unexpected response, no error or registration id ");
                            sb2.append(valueOf);
                            Log.w("Rpc", sb2.toString());
                            return;
                        }
                        if (Log.isLoggable("Rpc", 3)) {
                            if (stringExtra2.length() != 0) {
                                str3 = "Received InstanceID error ".concat(stringExtra2);
                            } else {
                                str3 = new String("Received InstanceID error ");
                            }
                            Log.d("Rpc", str3);
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !"ID".equals(split[1])) {
                                if (stringExtra2.length() != 0) {
                                    str2 = "Unexpected structured response ".concat(stringExtra2);
                                } else {
                                    str2 = new String("Unexpected structured response ");
                                }
                                Log.w("Rpc", str2);
                                return;
                            }
                            String str5 = split[2];
                            String str6 = split[3];
                            if (str6.startsWith(":")) {
                                str6 = str6.substring(1);
                            }
                            cVar.m4727i(str5, intent2.putExtra("error", str6).getExtras());
                            return;
                        }
                        synchronized (cVar.f29298a) {
                            for (int i = 0; i < cVar.f29298a.size(); i++) {
                                cVar.m4727i(cVar.f29298a.m39052j(i), intent2.getExtras());
                            }
                        }
                        return;
                    }
                    Matcher matcher = f29297k.matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        if (group != null) {
                            Bundle extras = intent2.getExtras();
                            extras.putString("registration_id", group2);
                            cVar.m4727i(group, extras);
                            return;
                        }
                        return;
                    } else if (Log.isLoggable("Rpc", 3)) {
                        if (stringExtra.length() != 0) {
                            str = "Unexpected response string: ".concat(stringExtra);
                        } else {
                            str = new String("Unexpected response string: ");
                        }
                        Log.d("Rpc", str);
                        return;
                    } else {
                        return;
                    }
                } else if (Log.isLoggable("Rpc", 3)) {
                    String valueOf2 = String.valueOf(action);
                    if (valueOf2.length() != 0) {
                        str4 = "Unexpected response action: ".concat(valueOf2);
                    } else {
                        str4 = new String("Unexpected response action: ");
                    }
                    Log.d("Rpc", str4);
                    return;
                } else {
                    return;
                }
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    /* renamed from: f */
    private final Task<Bundle> m4730f(Bundle bundle) {
        final String g = m4729g();
        final TaskCompletionSource<Bundle> taskCompletionSource = new TaskCompletionSource<>();
        synchronized (this.f29298a) {
            this.f29298a.put(g, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f29300c.m4703b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m4728h(this.f29299b, intent);
        StringBuilder sb2 = new StringBuilder(String.valueOf(g).length() + 5);
        sb2.append("|ID|");
        sb2.append(g);
        sb2.append("|");
        intent.putExtra("kid", sb2.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb3 = new StringBuilder(valueOf.length() + 8);
            sb3.append("Sending ");
            sb3.append(valueOf);
            Log.d("Rpc", sb3.toString());
        }
        intent.putExtra("google.messenger", this.f29302e);
        if (!(this.f29303f == null && this.f29304g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f29303f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f29304g.m4724b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f29301d.schedule(new Runnable() { // from class: t9.c0
                @Override // java.lang.Runnable
                public final void run() {
                    if (TaskCompletionSource.this.m28899d(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            taskCompletionSource.m28902a().mo28870c(f29296j, new AbstractC6424d() { // from class: t9.a0
                @Override // p064db.AbstractC6424d
                /* renamed from: a */
                public final void mo4743a(Task task) {
                    C13016c.this.m4731e(g, schedule, task);
                }
            });
            return taskCompletionSource.m28902a();
        }
        if (this.f29300c.m4703b() == 2) {
            this.f29299b.sendBroadcast(intent);
        } else {
            this.f29299b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f29301d.schedule(new Runnable() { // from class: t9.c0
            @Override // java.lang.Runnable
            public final void run() {
                if (TaskCompletionSource.this.m28899d(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        taskCompletionSource.m28902a().mo28870c(f29296j, new AbstractC6424d() { // from class: t9.a0
            @Override // p064db.AbstractC6424d
            /* renamed from: a */
            public final void mo4743a(Task task) {
                C13016c.this.m4731e(g, schedule2, task);
            }
        });
        return taskCompletionSource.m28902a();
    }

    /* renamed from: g */
    private static synchronized String m4729g() {
        String num;
        synchronized (C13016c.class) {
            int i = f29294h;
            f29294h = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: h */
    private static synchronized void m4728h(Context context, Intent intent) {
        synchronized (C13016c.class) {
            if (f29295i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f29295i = C11241a.m10369a(context, 0, intent2, C11241a.f25140a);
            }
            intent.putExtra("app", f29295i);
        }
    }

    /* renamed from: i */
    private final void m4727i(String str, Bundle bundle) {
        String str2;
        synchronized (this.f29298a) {
            TaskCompletionSource<Bundle> remove = this.f29298a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2 = "Missing callback for ".concat(valueOf);
                } else {
                    str2 = new String("Missing callback for ");
                }
                Log.w("Rpc", str2);
                return;
            }
            remove.m28900c(bundle);
        }
    }

    /* renamed from: j */
    private static boolean m4726j(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("google.messenger")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public Task<Bundle> m4735a(final Bundle bundle) {
        if (this.f29300c.m4704a() >= 12000000) {
            return C13038w.m4710b(this.f29299b).m4708d(1, bundle).mo28865h(f29296j, C13041z.f29344a);
        }
        if (this.f29300c.m4703b() != 0) {
            return m4730f(bundle).mo28864i(f29296j, new AbstractC6421a() { // from class: t9.y
                @Override // p064db.AbstractC6421a
                /* renamed from: a */
                public final Object mo4702a(Task task) {
                    return C13016c.this.m4733c(bundle, task);
                }
            });
        }
        return C5474b.m28894d(new IOException("MISSING_INSTANCEID_SERVICE"));
    }

    /* renamed from: c */
    public final /* synthetic */ Task m4733c(Bundle bundle, Task task) {
        if (!task.mo28858o()) {
            return task;
        }
        if (!m4726j((Bundle) task.mo28862k())) {
            return task;
        }
        return m4730f(bundle).mo28857p(f29296j, C13015b0.f29293a);
    }

    /* renamed from: e */
    public final /* synthetic */ void m4731e(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f29298a) {
            this.f29298a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
