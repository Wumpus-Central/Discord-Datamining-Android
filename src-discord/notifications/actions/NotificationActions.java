package com.discord.notifications.actions;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.discord.misc.utilities.intent.IntentUtilsKt;
import com.discord.notifications.actions.intents.DeleteAction;
import com.discord.notifications.actions.intents.DirectReplyAction;
import com.discord.notifications.actions.intents.DismissCallAction;
import com.discord.notifications.actions.intents.GenericAction;
import com.discord.notifications.actions.intents.MarkAsReadAction;
import com.discord.notifications.actions.intents.MuteAction;
import com.discord.notifications.actions.intents.NotificationAction;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/discord/notifications/actions/NotificationActions;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "notification_actions_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationActions extends BroadcastReceiver {
    public static final String ACTION = "com.discord.intent.action.NOTIFICATION_ACTION";
    public static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/notifications/actions/NotificationActions$Companion;", "", "()V", "ACTION", "", "notification_actions_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        NotificationAction notificationAction;
        NotificationAction notificationAction2;
        NotificationAction notificationAction3;
        NotificationAction notificationAction4;
        NotificationAction notificationAction5;
        q.g(context, "context");
        q.g(intent, "intent");
        NotificationAction.Companion companion = NotificationAction.Companion;
        NotificationAction notificationAction6 = null;
        if (IntentUtilsKt.hasExtra(intent, f0.b(MarkAsReadAction.class))) {
            notificationAction = (NotificationAction) IntentUtilsKt.getIntentParcelable(intent);
        } else {
            notificationAction = null;
        }
        NotificationAction notificationAction7 = (MarkAsReadAction) notificationAction;
        if (notificationAction7 == null) {
            if (IntentUtilsKt.hasExtra(intent, f0.b(MuteAction.class))) {
                notificationAction2 = (NotificationAction) IntentUtilsKt.getIntentParcelable(intent);
            } else {
                notificationAction2 = null;
            }
            notificationAction7 = (MuteAction) notificationAction2;
            if (notificationAction7 == null) {
                if (IntentUtilsKt.hasExtra(intent, f0.b(DismissCallAction.class))) {
                    notificationAction3 = (NotificationAction) IntentUtilsKt.getIntentParcelable(intent);
                } else {
                    notificationAction3 = null;
                }
                notificationAction7 = (DismissCallAction) notificationAction3;
                if (notificationAction7 == null) {
                    if (IntentUtilsKt.hasExtra(intent, f0.b(DirectReplyAction.class))) {
                        notificationAction4 = (NotificationAction) IntentUtilsKt.getIntentParcelable(intent);
                    } else {
                        notificationAction4 = null;
                    }
                    notificationAction7 = (DirectReplyAction) notificationAction4;
                    if (notificationAction7 == null) {
                        if (IntentUtilsKt.hasExtra(intent, f0.b(DeleteAction.class))) {
                            notificationAction5 = (NotificationAction) IntentUtilsKt.getIntentParcelable(intent);
                        } else {
                            notificationAction5 = null;
                        }
                        notificationAction7 = (DeleteAction) notificationAction5;
                        if (notificationAction7 == null) {
                            if (IntentUtilsKt.hasExtra(intent, f0.b(GenericAction.class))) {
                                notificationAction6 = (NotificationAction) IntentUtilsKt.getIntentParcelable(intent);
                            }
                            notificationAction7 = notificationAction6;
                        }
                    }
                }
            }
        }
        if (notificationAction7 != null) {
            notificationAction7.onNotificationAction(context, intent);
            notificationAction7.onNotificationActionComplete(context);
        }
    }
}
