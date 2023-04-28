package com.discord.notifications.actions.intents;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.core.app.NotificationManagerCompat;
import com.discord.misc.utilities.intent.IntentUtilsKt;
import com.discord.misc.utilities.intent.PendingIntentUtils;
import com.discord.notifications.actions.NotificationActions;
import com.discord.react_activities.ReactActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;

@Metadata(m15074d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0016J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0018"}, m15073d2 = {"Lcom/discord/notifications/actions/intents/NotificationAction;", "Landroid/os/Parcelable;", "pendingIntentRequestCode", "", "getPendingIntentRequestCode", "()I", "tag", "", "getTag", "()Ljava/lang/String;", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "launchActivity", "", "onNotificationAction", "", "intent", "onNotificationActionComplete", "toPendingIntent", "Landroid/app/PendingIntent;", "flags", "Companion", "notification_actions_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public interface NotificationAction extends Parcelable {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String activityAction = "android.intent.action.VIEW";

    @Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\f\u001a\u0004\u0018\u0001H\r\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\u000e*\u00020\u000fH\u0086\b¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0015\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m15073d2 = {"Lcom/discord/notifications/actions/intents/NotificationAction$Companion;", "", "()V", "activityAction", "", "activityClass", "Ljava/lang/Class;", "getActivityClass", "()Ljava/lang/Class;", "broadcastAction", "broadcastClass", "Lcom/discord/notifications/actions/NotificationActions;", "toAction", "T", "Lcom/discord/notifications/actions/intents/NotificationAction;", "Landroid/content/Intent;", "(Landroid/content/Intent;)Lcom/discord/notifications/actions/intents/NotificationAction;", "notification_actions_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public static final String activityAction = "android.intent.action.VIEW";
        private static final String broadcastAction = "com.discord.intent.action.NOTIFICATION_ACTION";
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Class<?> activityClass = ReactActivity.Registry.getMainActivity();
        private static final Class<NotificationActions> broadcastClass = NotificationActions.class;

        private Companion() {
        }

        public final Class<?> getActivityClass() {
            return activityClass;
        }

        public final /* synthetic */ <T extends NotificationAction> T toAction(Intent intent) {
            C9971q.m14633g(intent, "<this>");
            C9971q.m14627m(4, "T");
            if (IntentUtilsKt.hasExtra(intent, C9951f0.m14684b(NotificationAction.class))) {
                return (T) ((NotificationAction) IntentUtilsKt.getIntentParcelable(intent));
            }
            return null;
        }
    }

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class DefaultImpls {
        private static Intent createIntent(NotificationAction notificationAction, Context context, boolean z) {
            String str;
            Class<?> cls;
            if (z) {
                str = "android.intent.action.VIEW";
            } else {
                str = "com.discord.intent.action.NOTIFICATION_ACTION";
            }
            if (z) {
                cls = NotificationAction.Companion.getActivityClass();
            } else {
                cls = Companion.broadcastClass;
            }
            return IntentUtilsKt.putIntentParcelable(IntentUtilsKt.putExtra(new Intent(str, null, context, cls), C9951f0.m14684b(notificationAction.getClass())), notificationAction);
        }

        public static int getPendingIntentRequestCode(NotificationAction notificationAction) {
            String tag = notificationAction.getTag();
            KClass b = C9951f0.m14684b(notificationAction.getClass());
            return Math.abs((tag + b).hashCode());
        }

        public static void onNotificationAction(NotificationAction notificationAction, Context context, Intent intent) {
            C9971q.m14633g(context, "context");
            C9971q.m14633g(intent, "intent");
        }

        public static void onNotificationActionComplete(NotificationAction notificationAction, Context context) {
            C9971q.m14633g(context, "context");
            NotificationManagerCompat.m38426g(context).m38431b(notificationAction.getTag(), 0);
        }

        public static PendingIntent toPendingIntent(NotificationAction notificationAction, Context context, int i, boolean z) {
            PendingIntent pendingIntent;
            C9971q.m14633g(context, "context");
            Intent createIntent = createIntent(notificationAction, context, z);
            if (z) {
                pendingIntent = PendingIntent.getActivity(context, notificationAction.getPendingIntentRequestCode(), createIntent, i);
            } else {
                pendingIntent = PendingIntent.getBroadcast(context, notificationAction.getPendingIntentRequestCode(), createIntent, i);
            }
            C9971q.m14634f(pendingIntent, "createIntent(context, la…t, flags)\n        }\n    }");
            return pendingIntent;
        }

        public static /* synthetic */ PendingIntent toPendingIntent$default(NotificationAction notificationAction, Context context, int i, boolean z, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    i = PendingIntentUtils.immutablePendingIntentFlag$default(PendingIntentUtils.INSTANCE, 0, 1, null);
                }
                if ((i2 & 4) != 0) {
                    z = false;
                }
                return notificationAction.toPendingIntent(context, i, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toPendingIntent");
        }
    }

    int getPendingIntentRequestCode();

    String getTag();

    void onNotificationAction(Context context, Intent intent);

    void onNotificationActionComplete(Context context);

    PendingIntent toPendingIntent(Context context, int i, boolean z);
}
