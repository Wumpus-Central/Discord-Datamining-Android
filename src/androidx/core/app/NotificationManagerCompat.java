package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000a.AbstractC1229a;

/* loaded from: classes.dex */
public final class NotificationManagerCompat {

    /* renamed from: d */
    private static String f3134d;

    /* renamed from: g */
    private static ServiceConnectionC2181c f3137g;

    /* renamed from: a */
    private final Context f3138a;

    /* renamed from: b */
    private final NotificationManager f3139b;

    /* renamed from: c */
    private static final Object f3133c = new Object();

    /* renamed from: e */
    private static Set<String> f3135e = new HashSet();

    /* renamed from: f */
    private static final Object f3136f = new Object();

    /* renamed from: androidx.core.app.NotificationManagerCompat$a */
    /* loaded from: classes.dex */
    private static class C2179a implements AbstractC2183d {

        /* renamed from: a */
        final String f3140a;

        /* renamed from: b */
        final int f3141b;

        /* renamed from: c */
        final String f3142c;

        /* renamed from: d */
        final Notification f3143d;

        C2179a(String str, int i, String str2, Notification notification) {
            this.f3140a = str;
            this.f3141b = i;
            this.f3142c = str2;
            this.f3143d = notification;
        }

        @Override // androidx.core.app.NotificationManagerCompat.AbstractC2183d
        /* renamed from: a */
        public void mo38407a(AbstractC1229a aVar) {
            aVar.mo41560Z(this.f3140a, this.f3141b, this.f3142c, this.f3143d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f3140a + ", id:" + this.f3141b + ", tag:" + this.f3142c + "]";
        }
    }

    /* renamed from: androidx.core.app.NotificationManagerCompat$b */
    /* loaded from: classes.dex */
    private static class C2180b {

        /* renamed from: a */
        final ComponentName f3144a;

        /* renamed from: b */
        final IBinder f3145b;

        C2180b(ComponentName componentName, IBinder iBinder) {
            this.f3144a = componentName;
            this.f3145b = iBinder;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.app.NotificationManagerCompat$c */
    /* loaded from: classes.dex */
    public static class ServiceConnectionC2181c implements Handler.Callback, ServiceConnection {

        /* renamed from: k */
        private final Context f3146k;

        /* renamed from: l */
        private final HandlerThread f3147l;

        /* renamed from: m */
        private final Handler f3148m;

        /* renamed from: n */
        private final Map<ComponentName, C2182a> f3149n = new HashMap();

        /* renamed from: o */
        private Set<String> f3150o = new HashSet();

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: androidx.core.app.NotificationManagerCompat$c$a */
        /* loaded from: classes.dex */
        public static class C2182a {

            /* renamed from: a */
            final ComponentName f3151a;

            /* renamed from: c */
            AbstractC1229a f3153c;

            /* renamed from: b */
            boolean f3152b = false;

            /* renamed from: d */
            ArrayDeque<AbstractC2183d> f3154d = new ArrayDeque<>();

            /* renamed from: e */
            int f3155e = 0;

            C2182a(ComponentName componentName) {
                this.f3151a = componentName;
            }
        }

        ServiceConnectionC2181c(Context context) {
            this.f3146k = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f3147l = handlerThread;
            handlerThread.start();
            this.f3148m = new Handler(handlerThread.getLooper(), this);
        }

        /* renamed from: a */
        private boolean m38417a(C2182a aVar) {
            if (aVar.f3152b) {
                return true;
            }
            boolean bindService = this.f3146k.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f3151a), this, 33);
            aVar.f3152b = bindService;
            if (bindService) {
                aVar.f3155e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f3151a);
                this.f3146k.unbindService(this);
            }
            return aVar.f3152b;
        }

        /* renamed from: b */
        private void m38416b(C2182a aVar) {
            if (aVar.f3152b) {
                this.f3146k.unbindService(this);
                aVar.f3152b = false;
            }
            aVar.f3153c = null;
        }

        /* renamed from: c */
        private void m38415c(AbstractC2183d dVar) {
            m38408j();
            for (C2182a aVar : this.f3149n.values()) {
                aVar.f3154d.add(dVar);
                m38411g(aVar);
            }
        }

        /* renamed from: d */
        private void m38414d(ComponentName componentName) {
            C2182a aVar = this.f3149n.get(componentName);
            if (aVar != null) {
                m38411g(aVar);
            }
        }

        /* renamed from: e */
        private void m38413e(ComponentName componentName, IBinder iBinder) {
            C2182a aVar = this.f3149n.get(componentName);
            if (aVar != null) {
                aVar.f3153c = AbstractC1229a.AbstractBinderC0000a.m41562b(iBinder);
                aVar.f3155e = 0;
                m38411g(aVar);
            }
        }

        /* renamed from: f */
        private void m38412f(ComponentName componentName) {
            C2182a aVar = this.f3149n.get(componentName);
            if (aVar != null) {
                m38416b(aVar);
            }
        }

        /* renamed from: g */
        private void m38411g(C2182a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f3151a + ", " + aVar.f3154d.size() + " queued tasks");
            }
            if (!aVar.f3154d.isEmpty()) {
                if (!m38417a(aVar) || aVar.f3153c == null) {
                    m38409i(aVar);
                    return;
                }
                while (true) {
                    AbstractC2183d peek = aVar.f3154d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.mo38407a(aVar.f3153c);
                        aVar.f3154d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + aVar.f3151a);
                        }
                    } catch (RemoteException e) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f3151a, e);
                    }
                }
                if (!aVar.f3154d.isEmpty()) {
                    m38409i(aVar);
                }
            }
        }

        /* renamed from: i */
        private void m38409i(C2182a aVar) {
            if (!this.f3148m.hasMessages(3, aVar.f3151a)) {
                int i = aVar.f3155e + 1;
                aVar.f3155e = i;
                if (i > 6) {
                    Log.w("NotifManCompat", "Giving up on delivering " + aVar.f3154d.size() + " tasks to " + aVar.f3151a + " after " + aVar.f3155e + " retries");
                    aVar.f3154d.clear();
                    return;
                }
                int i2 = (1 << (i - 1)) * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i2 + " ms");
                }
                this.f3148m.sendMessageDelayed(this.f3148m.obtainMessage(3, aVar.f3151a), i2);
            }
        }

        /* renamed from: j */
        private void m38408j() {
            Set<String> h = NotificationManagerCompat.m38425h(this.f3146k);
            if (!h.equals(this.f3150o)) {
                this.f3150o = h;
                List<ResolveInfo> queryIntentServices = this.f3146k.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (h.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f3149n.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f3149n.put(componentName2, new C2182a(componentName2));
                    }
                }
                Iterator<Map.Entry<ComponentName, C2182a>> it = this.f3149n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<ComponentName, C2182a> next = it.next();
                    if (!hashSet.contains(next.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                        }
                        m38416b(next.getValue());
                        it.remove();
                    }
                }
            }
        }

        /* renamed from: h */
        public void m38410h(AbstractC2183d dVar) {
            this.f3148m.obtainMessage(0, dVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m38415c((AbstractC2183d) message.obj);
                return true;
            } else if (i == 1) {
                C2180b bVar = (C2180b) message.obj;
                m38413e(bVar.f3144a, bVar.f3145b);
                return true;
            } else if (i == 2) {
                m38412f((ComponentName) message.obj);
                return true;
            } else if (i != 3) {
                return false;
            } else {
                m38414d((ComponentName) message.obj);
                return true;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f3148m.obtainMessage(1, new C2180b(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f3148m.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.app.NotificationManagerCompat$d */
    /* loaded from: classes.dex */
    public interface AbstractC2183d {
        /* renamed from: a */
        void mo38407a(AbstractC1229a aVar);
    }

    private NotificationManagerCompat(Context context) {
        this.f3138a = context;
        this.f3139b = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: g */
    public static NotificationManagerCompat m38426g(Context context) {
        return new NotificationManagerCompat(context);
    }

    /* renamed from: h */
    public static Set<String> m38425h(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f3133c) {
            if (string != null) {
                if (!string.equals(f3134d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    f3135e = hashSet;
                    f3134d = string;
                }
            }
            set = f3135e;
        }
        return set;
    }

    /* renamed from: n */
    private void m38419n(AbstractC2183d dVar) {
        synchronized (f3136f) {
            if (f3137g == null) {
                f3137g = new ServiceConnectionC2181c(this.f3138a.getApplicationContext());
            }
            f3137g.m38410h(dVar);
        }
    }

    /* renamed from: o */
    private static boolean m38418o(Notification notification) {
        Bundle k = NotificationCompat.m38611k(notification);
        if (k == null || !k.getBoolean("android.support.useSideChannel")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m38432a() {
        boolean areNotificationsEnabled;
        if (Build.VERSION.SDK_INT >= 24) {
            areNotificationsEnabled = this.f3139b.areNotificationsEnabled();
            return areNotificationsEnabled;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f3138a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f3138a.getApplicationInfo();
        String packageName = this.f3138a.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName)).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public void m38431b(String str, int i) {
        this.f3139b.cancel(str, i);
    }

    /* renamed from: c */
    public void m38430c() {
        this.f3139b.cancelAll();
    }

    /* renamed from: d */
    public void m38429d(List<C2283p0> list) {
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C2283p0 p0Var : list) {
                arrayList.add(p0Var.m38208c());
            }
            this.f3139b.createNotificationChannelGroups(arrayList);
        }
    }

    /* renamed from: e */
    public void m38428e(List<NotificationChannelCompat> list) {
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (NotificationChannelCompat notificationChannelCompat : list) {
                arrayList.add(notificationChannelCompat.m38636b());
            }
            this.f3139b.createNotificationChannels(arrayList);
        }
    }

    /* renamed from: f */
    public void m38427f(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3139b.deleteNotificationChannel(str);
        }
    }

    /* renamed from: i */
    public NotificationChannel m38424i(String str) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        notificationChannel = this.f3139b.getNotificationChannel(str);
        return notificationChannel;
    }

    /* renamed from: j */
    public NotificationChannelCompat m38423j(String str) {
        NotificationChannel i;
        if (Build.VERSION.SDK_INT < 26 || (i = m38424i(str)) == null) {
            return null;
        }
        return new NotificationChannelCompat(i);
    }

    /* renamed from: k */
    public NotificationChannelGroup m38422k(String str) {
        String id2;
        NotificationChannelGroup notificationChannelGroup;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            notificationChannelGroup = this.f3139b.getNotificationChannelGroup(str);
            return notificationChannelGroup;
        }
        if (i >= 26) {
            for (NotificationChannelGroup notificationChannelGroup2 : m38421l()) {
                id2 = notificationChannelGroup2.getId();
                if (id2.equals(str)) {
                    return notificationChannelGroup2;
                }
            }
        }
        return null;
    }

    /* renamed from: l */
    public List<NotificationChannelGroup> m38421l() {
        List<NotificationChannelGroup> notificationChannelGroups;
        if (Build.VERSION.SDK_INT < 26) {
            return Collections.emptyList();
        }
        notificationChannelGroups = this.f3139b.getNotificationChannelGroups();
        return notificationChannelGroups;
    }

    /* renamed from: m */
    public void m38420m(String str, int i, Notification notification) {
        if (m38418o(notification)) {
            m38419n(new C2179a(this.f3138a.getPackageName(), i, str, notification));
            this.f3139b.cancel(str, i);
            return;
        }
        this.f3139b.notify(str, i, notification);
    }
}
