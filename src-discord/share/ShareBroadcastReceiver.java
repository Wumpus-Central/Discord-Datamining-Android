package com.discord.share;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import com.discord.misc.utilities.intent.PendingIntentUtils;
import com.discord.reactevents.ReactEvents;
import com.discord.share.react.events.ShareBroadcastReceiverAppClicked;
import com.facebook.react.bridge.ReactApplicationContext;
import gf.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/share/ShareBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "reactApplicationContext", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "share_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShareBroadcastReceiver extends BroadcastReceiver {
    public static final Companion Companion = new Companion(null);
    private static final String SHARE_SHEET_CLICK = "share_sheet_click";
    private static final String SHARE_SHEET_LOCATION = "share_sheet_location";
    private final ReactApplicationContext reactApplicationContext;
    private final ReactEvents reactEvents = new ReactEvents(x.a("share-broadcast-receiver-app-clicked", f0.b(ShareBroadcastReceiverAppClicked.class)));

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/share/ShareBroadcastReceiver$Companion;", "", "()V", "SHARE_SHEET_CLICK", "", "SHARE_SHEET_LOCATION", "getPendingIntentSender", "Landroid/content/IntentSender;", "context", "Landroid/content/Context;", "location", "register", "", "receiver", "Lcom/discord/share/ShareBroadcastReceiver;", "unregister", "share_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IntentSender getPendingIntentSender(Context context, String str) {
            q.g(context, "context");
            Intent intent = new Intent(ShareBroadcastReceiver.SHARE_SHEET_CLICK);
            intent.putExtra(ShareBroadcastReceiver.SHARE_SHEET_LOCATION, str);
            Unit unit = Unit.f20685a;
            IntentSender intentSender = PendingIntent.getBroadcast(context, 0, intent, PendingIntentUtils.mutablePendingIntentFlag$default(PendingIntentUtils.INSTANCE, 0, 1, null)).getIntentSender();
            q.f(intentSender, "getBroadcast(\n          …           ).intentSender");
            return intentSender;
        }

        public final void register(Context context, ShareBroadcastReceiver receiver) {
            q.g(context, "context");
            q.g(receiver, "receiver");
            context.registerReceiver(receiver, new IntentFilter(ShareBroadcastReceiver.SHARE_SHEET_CLICK));
        }

        public final void unregister(Context context, ShareBroadcastReceiver receiver) {
            q.g(context, "context");
            q.g(receiver, "receiver");
            try {
                context.unregisterReceiver(receiver);
            } catch (Exception unused) {
            }
        }
    }

    public ShareBroadcastReceiver(ReactApplicationContext reactContext) {
        q.g(reactContext, "reactContext");
        this.reactApplicationContext = reactContext;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ComponentName componentName;
        String str = null;
        if (intent != null) {
            componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
        } else {
            componentName = null;
        }
        if (intent != null) {
            str = intent.getStringExtra(SHARE_SHEET_LOCATION);
        }
        if (componentName != null) {
            ReactEvents reactEvents = this.reactEvents;
            ReactApplicationContext reactApplicationContext = this.reactApplicationContext;
            String packageName = componentName.getPackageName();
            q.f(packageName, "clickedComponent.packageName");
            reactEvents.emitModuleEvent(reactApplicationContext, new ShareBroadcastReceiverAppClicked(packageName, str));
        }
    }
}
