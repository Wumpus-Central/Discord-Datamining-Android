package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import io.sentry.AbstractC8861f0;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9023q0;
import io.sentry.C8843d;
import io.sentry.C8951o3;
import io.sentry.C9116v;
import io.sentry.EnumC8942n3;
import io.sentry.util.C9111k;
import io.sentry.util.C9115o;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: io.sentry.android.core.c1 */
/* loaded from: classes8.dex */
public final class C8705c1 implements AbstractC9023q0, Closeable {

    /* renamed from: k */
    private final Context f19254k;

    /* renamed from: l */
    C8706a f19255l;

    /* renamed from: m */
    private SentryAndroidOptions f19256m;

    /* renamed from: n */
    private final List<String> f19257n;

    /* renamed from: io.sentry.android.core.c1$a */
    /* loaded from: classes8.dex */
    static final class C8706a extends BroadcastReceiver {

        /* renamed from: a */
        private final AbstractC8861f0 f19258a;

        /* renamed from: b */
        private final AbstractC8869g0 f19259b;

        C8706a(AbstractC8861f0 f0Var, AbstractC8869g0 g0Var) {
            this.f19258a = f0Var;
            this.f19259b = g0Var;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C8843d dVar = new C8843d();
            dVar.m17905p("system");
            dVar.m17909l("device.event");
            String action = intent.getAction();
            String c = C9115o.m16983c(action);
            if (c != null) {
                dVar.m17908m("action", c);
            }
            Bundle extras = intent.getExtras();
            HashMap hashMap = new HashMap();
            if (extras != null && !extras.isEmpty()) {
                for (String str : extras.keySet()) {
                    try {
                        Object obj = extras.get(str);
                        if (obj != null) {
                            hashMap.put(str, obj.toString());
                        }
                    } catch (Throwable th2) {
                        this.f19259b.mo17724a(EnumC8942n3.ERROR, th2, "%s key of the %s action threw an error.", str, action);
                    }
                }
                dVar.m17908m("extras", hashMap);
            }
            dVar.m17907n(EnumC8942n3.INFO);
            C9116v vVar = new C9116v();
            vVar.m16973h("android:intent", intent);
            this.f19258a.mo17830h(dVar, vVar);
        }
    }

    public C8705c1(Context context) {
        this(context, m18321g());
    }

    /* renamed from: g */
    private static List<String> m18321g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.appwidget.action.APPWIDGET_DELETED");
        arrayList.add("android.appwidget.action.APPWIDGET_DISABLED");
        arrayList.add("android.appwidget.action.APPWIDGET_ENABLED");
        arrayList.add("android.appwidget.action.APPWIDGET_HOST_RESTORED");
        arrayList.add("android.appwidget.action.APPWIDGET_RESTORED");
        arrayList.add("android.appwidget.action.APPWIDGET_UPDATE");
        arrayList.add("android.appwidget.action.APPWIDGET_UPDATE_OPTIONS");
        arrayList.add("android.intent.action.ACTION_POWER_CONNECTED");
        arrayList.add("android.intent.action.ACTION_POWER_DISCONNECTED");
        arrayList.add("android.intent.action.ACTION_SHUTDOWN");
        arrayList.add("android.intent.action.AIRPLANE_MODE");
        arrayList.add("android.intent.action.BATTERY_LOW");
        arrayList.add("android.intent.action.BATTERY_OKAY");
        arrayList.add("android.intent.action.BOOT_COMPLETED");
        arrayList.add("android.intent.action.CAMERA_BUTTON");
        arrayList.add("android.intent.action.CONFIGURATION_CHANGED");
        arrayList.add("android.intent.action.CONTENT_CHANGED");
        arrayList.add("android.intent.action.DATE_CHANGED");
        arrayList.add("android.intent.action.DEVICE_STORAGE_LOW");
        arrayList.add("android.intent.action.DEVICE_STORAGE_OK");
        arrayList.add("android.intent.action.DOCK_EVENT");
        arrayList.add("android.intent.action.DREAMING_STARTED");
        arrayList.add("android.intent.action.DREAMING_STOPPED");
        arrayList.add("android.intent.action.INPUT_METHOD_CHANGED");
        arrayList.add("android.intent.action.LOCALE_CHANGED");
        arrayList.add("android.intent.action.REBOOT");
        arrayList.add("android.intent.action.SCREEN_OFF");
        arrayList.add("android.intent.action.SCREEN_ON");
        arrayList.add("android.intent.action.TIMEZONE_CHANGED");
        arrayList.add("android.intent.action.TIME_SET");
        arrayList.add("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        arrayList.add("android.os.action.POWER_SAVE_MODE_CHANGED");
        arrayList.add("android.intent.action.APP_ERROR");
        arrayList.add("android.intent.action.BUG_REPORT");
        arrayList.add("android.intent.action.MEDIA_BAD_REMOVAL");
        arrayList.add("android.intent.action.MEDIA_MOUNTED");
        arrayList.add("android.intent.action.MEDIA_UNMOUNTABLE");
        arrayList.add("android.intent.action.MEDIA_UNMOUNTED");
        return arrayList;
    }

    @Override // io.sentry.AbstractC9023q0
    /* renamed from: b */
    public void mo17181b(AbstractC8861f0 f0Var, C8951o3 o3Var) {
        SentryAndroidOptions sentryAndroidOptions;
        C9111k.m16995a(f0Var, "Hub is required");
        if (o3Var instanceof SentryAndroidOptions) {
            sentryAndroidOptions = (SentryAndroidOptions) o3Var;
        } else {
            sentryAndroidOptions = null;
        }
        SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) C9111k.m16995a(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f19256m = sentryAndroidOptions2;
        sentryAndroidOptions2.getLogger().mo17722c(EnumC8942n3.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f19256m.isEnableSystemEventBreadcrumbs()));
        if (this.f19256m.isEnableSystemEventBreadcrumbs()) {
            this.f19255l = new C8706a(f0Var, this.f19256m.getLogger());
            IntentFilter intentFilter = new IntentFilter();
            for (String str : this.f19257n) {
                intentFilter.addAction(str);
            }
            try {
                this.f19254k.registerReceiver(this.f19255l, intentFilter);
                this.f19256m.getLogger().mo17722c(EnumC8942n3.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
            } catch (Throwable th2) {
                this.f19256m.setEnableSystemEventBreadcrumbs(false);
                this.f19256m.getLogger().mo17723b(EnumC8942n3.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th2);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C8706a aVar = this.f19255l;
        if (aVar != null) {
            this.f19254k.unregisterReceiver(aVar);
            this.f19255l = null;
            SentryAndroidOptions sentryAndroidOptions = this.f19256m;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo17722c(EnumC8942n3.DEBUG, "SystemEventsBreadcrumbsIntegration remove.", new Object[0]);
            }
        }
    }

    public C8705c1(Context context, List<String> list) {
        this.f19254k = (Context) C9111k.m16995a(context, "Context is required");
        this.f19257n = (List) C9111k.m16995a(list, "Actions list is required");
    }
}
