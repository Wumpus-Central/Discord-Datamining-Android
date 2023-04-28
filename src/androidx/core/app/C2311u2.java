package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.collection.C2095b;
import androidx.core.app.NotificationCompat;
import androidx.core.content.C2348g;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.app.u2 */
/* loaded from: classes.dex */
public class C2311u2 implements AbstractC2267m {

    /* renamed from: a */
    private final Context f3219a;

    /* renamed from: b */
    private final Notification.Builder f3220b;

    /* renamed from: c */
    private final NotificationCompat.Builder f3221c;

    /* renamed from: d */
    private RemoteViews f3222d;

    /* renamed from: e */
    private RemoteViews f3223e;

    /* renamed from: f */
    private final List<Bundle> f3224f = new ArrayList();

    /* renamed from: g */
    private final Bundle f3225g = new Bundle();

    /* renamed from: h */
    private int f3226h;

    /* renamed from: i */
    private RemoteViews f3227i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2311u2(NotificationCompat.Builder builder) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        List<String> list;
        int i;
        Notification.Builder badgeIconType;
        Notification.Builder settingsText;
        Notification.Builder shortcutId;
        Notification.Builder timeoutAfter;
        this.f3221c = builder;
        this.f3219a = builder.f3071a;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3220b = new Notification.Builder(builder.f3071a, builder.f35629L);
        } else {
            this.f3220b = new Notification.Builder(builder.f3071a);
        }
        Notification notification = builder.f35638U;
        Notification.Builder lights = this.f3220b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, builder.f3079i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z2);
        if ((notification.flags & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z3).setDefaults(notification.defaults).setContentTitle(builder.f3075e).setContentText(builder.f3076f).setContentInfo(builder.f3081k).setContentIntent(builder.f3077g).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = builder.f3078h;
        if ((notification.flags & 128) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z4).setLargeIcon(builder.f3080j).setNumber(builder.f3082l).setProgress(builder.f3091u, builder.f3092v, builder.f3093w);
        this.f3220b.setSubText(builder.f3088r).setUsesChronometer(builder.f3085o).setPriority(builder.f3083m);
        Iterator<NotificationCompat.Action> it = builder.f3072b.iterator();
        while (it.hasNext()) {
            m38177b(it.next());
        }
        Bundle bundle = builder.f35622E;
        if (bundle != null) {
            this.f3225g.putAll(bundle);
        }
        int i2 = Build.VERSION.SDK_INT;
        this.f3222d = builder.f35626I;
        this.f3223e = builder.f35627J;
        this.f3220b.setShowWhen(builder.f3084n);
        this.f3220b.setLocalOnly(builder.f35618A).setGroup(builder.f3094x).setGroupSummary(builder.f3095y).setSortKey(builder.f3096z);
        this.f3226h = builder.f35634Q;
        this.f3220b.setCategory(builder.f35621D).setColor(builder.f35623F).setVisibility(builder.f35624G).setPublicVersion(builder.f35625H).setSound(notification.sound, notification.audioAttributes);
        if (i2 < 28) {
            list = m38174e(m38172g(builder.f3073c), builder.f35641X);
        } else {
            list = builder.f35641X;
        }
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                this.f3220b.addPerson(str);
            }
        }
        this.f3227i = builder.f35628K;
        if (builder.f3074d.size() > 0) {
            Bundle bundle2 = builder.m38528l().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i3 = 0; i3 < builder.f3074d.size(); i3++) {
                bundle4.putBundle(Integer.toString(i3), C2316v2.m38162e(builder.f3074d.get(i3)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            builder.m38528l().putBundle("android.car.EXTENSIONS", bundle2);
            this.f3225g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i4 = Build.VERSION.SDK_INT;
        Icon icon = builder.f35640W;
        if (icon != null) {
            this.f3220b.setSmallIcon(icon);
        }
        if (i4 >= 24) {
            this.f3220b.setExtras(builder.f35622E).setRemoteInputHistory(builder.f3090t);
            RemoteViews remoteViews = builder.f35626I;
            if (remoteViews != null) {
                this.f3220b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = builder.f35627J;
            if (remoteViews2 != null) {
                this.f3220b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = builder.f35628K;
            if (remoteViews3 != null) {
                this.f3220b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i4 >= 26) {
            badgeIconType = this.f3220b.setBadgeIconType(builder.f35630M);
            settingsText = badgeIconType.setSettingsText(builder.f3089s);
            shortcutId = settingsText.setShortcutId(builder.f35631N);
            timeoutAfter = shortcutId.setTimeoutAfter(builder.f35633P);
            timeoutAfter.setGroupAlertBehavior(builder.f35634Q);
            if (builder.f35620C) {
                this.f3220b.setColorized(builder.f35619B);
            }
            if (!TextUtils.isEmpty(builder.f35629L)) {
                this.f3220b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i4 >= 28) {
            Iterator<Person> it2 = builder.f3073c.iterator();
            while (it2.hasNext()) {
                this.f3220b.addPerson(it2.next().m38397j());
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            this.f3220b.setAllowSystemGeneratedContextualActions(builder.f35636S);
            this.f3220b.setBubbleMetadata(NotificationCompat.C2172d.m38470k(builder.f35637T));
            C2348g gVar = builder.f35632O;
            if (gVar != null) {
                this.f3220b.setLocusId(gVar.m38103c());
            }
        }
        if (i5 >= 31 && (i = builder.f35635R) != 0) {
            this.f3220b.setForegroundServiceBehavior(i);
        }
        if (builder.f35639V) {
            if (this.f3221c.f3095y) {
                this.f3226h = 2;
            } else {
                this.f3226h = 1;
            }
            this.f3220b.setVibrate(null);
            this.f3220b.setSound(null);
            int i6 = notification.defaults & (-2) & (-3);
            notification.defaults = i6;
            this.f3220b.setDefaults(i6);
            if (i5 >= 26) {
                if (TextUtils.isEmpty(this.f3221c.f3094x)) {
                    this.f3220b.setGroup("silent");
                }
                this.f3220b.setGroupAlertBehavior(this.f3226h);
            }
        }
    }

    /* renamed from: b */
    private void m38177b(NotificationCompat.Action action) {
        Icon icon;
        Bundle bundle;
        IconCompat d = action.m38592d();
        if (d != null) {
            icon = d.m37859x();
        } else {
            icon = null;
        }
        Notification.Action.Builder builder = new Notification.Action.Builder(icon, action.m38588h(), action.m38595a());
        if (action.m38591e() != null) {
            for (RemoteInput remoteInput : RemoteInput.m38382b(action.m38591e())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        if (action.m38593c() != null) {
            bundle = new Bundle(action.m38593c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", action.m38594b());
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            builder.setAllowGeneratedReplies(action.m38594b());
        }
        bundle.putInt("android.support.action.semanticAction", action.m38590f());
        if (i >= 28) {
            builder.setSemanticAction(action.m38590f());
        }
        if (i >= 29) {
            builder.setContextual(action.m38586j());
        }
        if (i >= 31) {
            builder.setAuthenticationRequired(action.m38587i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", action.m38589g());
        builder.addExtras(bundle);
        this.f3220b.addAction(builder.build());
    }

    /* renamed from: e */
    private static List<String> m38174e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C2095b bVar = new C2095b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    /* renamed from: g */
    private static List<String> m38172g(List<Person> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Person person : list) {
            arrayList.add(person.m38398i());
        }
        return arrayList;
    }

    /* renamed from: h */
    private void m38171h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }

    @Override // androidx.core.app.AbstractC2267m
    /* renamed from: a */
    public Notification.Builder mo38178a() {
        return this.f3220b;
    }

    /* renamed from: c */
    public Notification m38176c() {
        RemoteViews remoteViews;
        Bundle k;
        RemoteViews u;
        RemoteViews s;
        NotificationCompat.AbstractC2178g gVar = this.f3221c.f3087q;
        if (gVar != null) {
            gVar.mo38454b(this);
        }
        if (gVar != null) {
            remoteViews = gVar.mo38436t(this);
        } else {
            remoteViews = null;
        }
        Notification d = m38175d();
        if (remoteViews != null) {
            d.contentView = remoteViews;
        } else {
            RemoteViews remoteViews2 = this.f3221c.f35626I;
            if (remoteViews2 != null) {
                d.contentView = remoteViews2;
            }
        }
        if (!(gVar == null || (s = gVar.mo38437s(this)) == null)) {
            d.bigContentView = s;
        }
        if (!(gVar == null || (u = this.f3221c.f3087q.mo38435u(this)) == null)) {
            d.headsUpContentView = u;
        }
        if (!(gVar == null || (k = NotificationCompat.m38611k(d)) == null)) {
            gVar.mo38455a(k);
        }
        return d;
    }

    /* renamed from: d */
    protected Notification m38175d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f3220b.build();
        }
        if (i >= 24) {
            Notification build = this.f3220b.build();
            if (this.f3226h != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f3226h != 2)) {
                    m38171h(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f3226h == 1) {
                    m38171h(build);
                }
            }
            return build;
        }
        this.f3220b.setExtras(this.f3225g);
        Notification build2 = this.f3220b.build();
        RemoteViews remoteViews = this.f3222d;
        if (remoteViews != null) {
            build2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f3223e;
        if (remoteViews2 != null) {
            build2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f3227i;
        if (remoteViews3 != null) {
            build2.headsUpContentView = remoteViews3;
        }
        if (this.f3226h != 0) {
            if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.f3226h != 2)) {
                m38171h(build2);
            }
            if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f3226h == 1) {
                m38171h(build2);
            }
        }
        return build2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Context m38173f() {
        return this.f3219a;
    }
}
