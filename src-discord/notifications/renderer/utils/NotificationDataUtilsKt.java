package com.discord.notifications.renderer.utils;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import androidx.core.app.NotificationCompat;
import androidx.core.app.Person;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.discord.crash_reporting.CrashReporting;
import com.discord.icons.IconUrlUtils;
import com.discord.misc.utilities.intent.PendingIntentUtils;
import com.discord.notifications.actions.intents.ContentAction;
import com.discord.notifications.actions.intents.DeleteAction;
import com.discord.notifications.actions.intents.DirectReplyAction;
import com.discord.notifications.actions.intents.DismissCallAction;
import com.discord.notifications.actions.intents.MarkAsReadAction;
import com.discord.notifications.actions.intents.MuteAction;
import com.discord.notifications.actions.intents.NotificationAction;
import com.discord.notifications.api.KvMessageEntry;
import com.discord.notifications.api.NotificationData;
import com.discord.notifications.api.NotificationMessage;
import com.discord.notifications.api.Sticker;
import com.discord.notifications.renderer.R;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageFlag;
import com.discord.primitives.MessageFlagKt;
import com.discord.primitives.MessageId;
import com.discord.primitives.UserId;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.shortcuts.ShortcutData;
import com.discord.shortcuts.ShortcutUtilsKt;
import com.discord.theme.utils.ColorUtilsKt;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jg.x;
import kg.v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.i;
import kotlin.collections.j;
import kotlin.collections.r;
import kotlin.jvm.internal.q;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.f;
import kotlinx.serialization.json.g;
import kotlinx.serialization.json.s;

@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u001a/\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\r\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u0010\u001a(\u0010\u0011\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u001a0\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u001a\u0016\u0010\u0016\u001a\u0004\u0018\u00010\t*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a(\u0010\u0017\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u001a\u000e\u0010\u0018\u001a\u0004\u0018\u00010\t*\u00020\u0010H\u0000\u001a\u0014\u0010\u0019\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u0013*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\f\u0010\u001b\u001a\u00020\u0006*\u00020\u0010H\u0000\u001a\u0014\u0010\u001c\u001a\u00020\u0006*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u001d\u001a\u00020\u0006*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001f*\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u0006\u001a\u0016\u0010!\u001a\u0004\u0018\u00010\u0013*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\f\u0010\"\u001a\u00020\u0006*\u00020\u0010H\u0000\u001a\f\u0010#\u001a\u00020$*\u00020\u0010H\u0000\u001a\u0016\u0010%\u001a\u00020&*\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010(H\u0000\u001a\u0018\u0010)\u001a\u0004\u0018\u00010&*\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010(H\u0000\u001a<\u0010*\u001a\u00020+*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010,\u001a\u0004\u0018\u00010(H\u0000\u001a\f\u0010-\u001a\u00020.*\u00020\u0010H\u0000\u001a\u0016\u0010/\u001a\u0004\u0018\u000100*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\n\u00101\u001a\u00020\u0006*\u00020\u0010\u001a\u001c\u00102\u001a\u0004\u0018\u00010\u0013*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00103\u001a\u00020.\u001a\u0014\u00104\u001a\u00020\t*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\f\u00105\u001a\u00020\u0015*\u00020\u0010H\u0000\u001a\f\u00106\u001a\u00020\u0015*\u00020\u0010H\u0000\u001a\u0016\u00107\u001a\u0004\u0018\u00010\t*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\f\u00108\u001a\u00020\u0015*\u00020\u0010H\u0000\u001a\f\u00109\u001a\u00020:*\u00020(H\u0002\u001a\u0014\u0010;\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010<\u001a\u00020\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006="}, d2 = {"getPendingIntent", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "notificationDataMap", "", "", "tag", "getSystemMessageUserJoin", "", "userId", "Lcom/discord/primitives/UserId;", "userName", "getSystemMessageUserJoin-_NT-lnE", "getAuthor", "Lkotlinx/serialization/json/JsonObject;", "Lcom/discord/notifications/api/NotificationData;", "getButtonPendingIntent", "getCallAction", "Landroidx/core/app/NotificationCompat$Action;", "isAcceptAction", "", "getContent", "getContentPendingIntent", "getConversationTitle", "getDeletePendingIntent", "getDirectReplyAction", "getGroupKey", "getIconUrl", "getIconUrlForAvatar", "getKvMessage", "Lcom/discord/notifications/api/KvMessageEntry;", "rawMessage", "getMarkAsReadAction", "getNotificationCategory", "getSendTime", "", "getSender", "Landroidx/core/app/Person;", "icon", "Landroid/graphics/Bitmap;", "getSenderForMessageNotification", "getShortcutInfo", "Landroidx/core/content/pm/ShortcutInfoCompat;", "avatar", "getSmallIcon", "", "getSound", "Landroid/net/Uri;", "getTag", "getTimedMuteAction", "numMessages", "getTitle", "isConversation", "isGroupConversation", "renderMessageContent", "shouldUseBigText", "toIconCompat", "Landroidx/core/graphics/drawable/IconCompat;", "toNotificationMessage", "author", "notification_renderer_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationDataUtilsKt {
    public static final JsonObject getAuthor(NotificationData notificationData) {
        q.g(notificationData, "<this>");
        String userAvatar = notificationData.getUserAvatar();
        UserId userId = notificationData.m517getUserIdwUX8bhU();
        String userUsername = notificationData.getUserUsername();
        if (userAvatar == null || userId == null || userUsername == null) {
            return null;
        }
        s sVar = new s();
        f.c(sVar, "avatar", userAvatar);
        f.c(sVar, "id", UserId.m617toStringimpl(userId.m619unboximpl()));
        f.c(sVar, "username", userUsername);
        f.c(sVar, "global_name", notificationData.getUserGlobalName());
        f.a(sVar, "incomplete", Boolean.TRUE);
        return sVar.a();
    }

    public static final PendingIntent getButtonPendingIntent(NotificationData notificationData, Context context, Map<String, String> notificationDataMap) {
        q.g(notificationData, "<this>");
        q.g(context, "context");
        q.g(notificationDataMap, "notificationDataMap");
        String tag = getTag(notificationData);
        return getPendingIntent(context, notificationDataMap, tag + "button");
    }

    public static final NotificationCompat.Action getCallAction(NotificationData notificationData, Context context, boolean z10, Map<String, String> notificationDataMap) {
        ChannelId channelId;
        PendingIntent pendingIntent;
        Pair pair;
        int i10;
        Map v10;
        q.g(notificationData, "<this>");
        q.g(context, "context");
        q.g(notificationDataMap, "notificationDataMap");
        if (!q.b(notificationData.getType(), NotificationData.TYPE_CALL_RING) || (channelId = notificationData.m513getChannelIdqMVnFVQ()) == null) {
            return null;
        }
        long j10 = channelId.m555unboximpl();
        if (z10) {
            v10 = v.v(notificationDataMap);
            v10.put("type", NotificationData.TYPE_CALL_CONNECT);
            Unit unit = Unit.f22080a;
            pendingIntent = getButtonPendingIntent(notificationData, context, v10);
        } else {
            pendingIntent = NotificationAction.DefaultImpls.toPendingIntent$default(new DismissCallAction(getTag(notificationData), j10, null), context, 0, false, 6, null);
        }
        if (z10) {
            pair = x.a(I18nUtilsKt.i18nFormat$default(context, I18nMessage.JOIN_CALL, null, 2, null), Integer.valueOf(ColorUtilsKt.getColorCompat(context, R.color.green_360)));
        } else {
            pair = x.a(I18nUtilsKt.i18nFormat$default(context, I18nMessage.DECLINE, null, 2, null), Integer.valueOf(ColorUtilsKt.getColorCompat(context, R.color.red_400)));
        }
        int intValue = ((Number) pair.b()).intValue();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(intValue);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) pair.a());
        spannableStringBuilder.setSpan(foregroundColorSpan, length2, spannableStringBuilder.length(), 17);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        if (z10) {
            i10 = R.drawable.ic_call_24dp;
        } else {
            i10 = R.drawable.ic_call_disconnect_24dp;
        }
        return new NotificationCompat.Action.a(i10, spannableStringBuilder, pendingIntent).b();
    }

    public static final CharSequence getContent(NotificationData notificationData, Context context) {
        String subtitle;
        Integer activityType;
        q.g(notificationData, "<this>");
        q.g(context, "context");
        String type = notificationData.getType();
        boolean z10 = false;
        switch (type.hashCode()) {
            case -1502317553:
                return (type.equals(NotificationData.TYPE_GENERIC_PUSH_NOTIFICATION_SENT) && (subtitle = notificationData.getSubtitle()) != null) ? subtitle : "";
            case -1489275252:
                if (!type.equals(NotificationData.TYPE_GUILD_SCHEDULED_EVENT_UPDATE)) {
                    return "";
                }
                Integer guildScheduledEventEntityType = notificationData.getGuildScheduledEventEntityType();
                if ((guildScheduledEventEntityType != null && guildScheduledEventEntityType.intValue() == 2) || (guildScheduledEventEntityType != null && guildScheduledEventEntityType.intValue() == 1)) {
                    z10 = true;
                }
                if (z10) {
                    return I18nUtilsKt.i18nFormat(context, I18nMessage.GUILD_SCHEDULED_EVENT_STAGE_START_BODY, new NotificationDataUtilsKt$getContent$8(notificationData));
                }
                return (guildScheduledEventEntityType != null && guildScheduledEventEntityType.intValue() == 3) ? I18nUtilsKt.i18nFormat(context, I18nMessage.GUILD_SCHEDULED_EVENT_EXTERNAL_START_BODY, new NotificationDataUtilsKt$getContent$9(notificationData)) : "";
            case -1327124998:
                if (!type.equals(NotificationData.TYPE_RELATIONSHIP_ADD)) {
                    return "";
                }
                Integer relationshipType = notificationData.getRelationshipType();
                if (relationshipType != null && relationshipType.intValue() == 1) {
                    return I18nUtilsKt.i18nFormat$default(context, I18nMessage.NOTIFICATION_ACCEPTED_FRIEND_REQUEST, null, 2, null);
                }
                return (relationshipType != null && relationshipType.intValue() == 3) ? I18nUtilsKt.i18nFormat$default(context, I18nMessage.NOTIFICATION_PENDING_FRIEND_REQUEST, null, 2, null) : "";
            case -1263316859:
                return !type.equals(NotificationData.TYPE_STAGE_INSTANCE_CREATE) ? "" : I18nUtilsKt.i18nFormat(context, I18nMessage.STAGE_START_PUSH_NOTIFICATION_BODY, new NotificationDataUtilsKt$getContent$6(notificationData));
            case -1237752112:
                return !type.equals(NotificationData.TYPE_APPLICATION_LIBRARY_INSTALL_COMPLETE) ? "" : I18nUtilsKt.i18nFormat(context, I18nMessage.GAME_LIBRARY_NOTIFICATION_GAME_INSTALLED_BODY, new NotificationDataUtilsKt$getContent$5(notificationData));
            case -437641071:
                return !type.equals(NotificationData.TYPE_FORUM_THREAD_CREATED) ? "" : I18nUtilsKt.i18nFormat(context, I18nMessage.FORUM_CHANNEL_THREAD_CREATED_PUSH_BODY_MOBILE, new NotificationDataUtilsKt$getContent$7(notificationData));
            case 974015250:
                return (type.equals(NotificationData.TYPE_ACTIVITY_START) && (activityType = notificationData.getActivityType()) != null && activityType.intValue() == 0) ? I18nUtilsKt.i18nFormat(context, I18nMessage.NOTIFICATION_BODY_START_GAME, new NotificationDataUtilsKt$getContent$3(notificationData)) : "";
            case 998188116:
                if (!type.equals(NotificationData.TYPE_MESSAGE_CREATE)) {
                    return "";
                }
                Integer channelType = notificationData.getChannelType();
                if ((((((channelType != null && channelType.intValue() == 0) || (channelType != null && channelType.intValue() == 2)) || (channelType != null && channelType.intValue() == 5)) || (channelType != null && channelType.intValue() == 10)) || (channelType != null && channelType.intValue() == 11)) || (channelType != null && channelType.intValue() == 12)) {
                    Integer messageType = notificationData.getMessageType();
                    if (messageType != null && messageType.intValue() == 7) {
                        return m532getSystemMessageUserJoin_NTlnE(context, notificationData.m517getUserIdwUX8bhU(), notificationData.getUserUsername());
                    }
                    Integer messageActivityType = notificationData.getMessageActivityType();
                    if (messageActivityType != null && messageActivityType.intValue() == 1) {
                        return I18nUtilsKt.i18nFormat(context, I18nMessage.NOTIFICATION_MESSAGE_CREATE_GUILD_ACTIVITY_JOIN, new NotificationDataUtilsKt$getContent$1(notificationData));
                    }
                    return renderMessageContent(notificationData, context);
                }
                if ((channelType != null && channelType.intValue() == 3) || (channelType != null && channelType.intValue() == 1)) {
                    z10 = true;
                }
                if (!z10) {
                    return "";
                }
                Integer messageActivityType2 = notificationData.getMessageActivityType();
                if (messageActivityType2 != null && messageActivityType2.intValue() == 1) {
                    return I18nUtilsKt.i18nFormat(context, I18nMessage.NOTIFICATION_MESSAGE_CREATE_DM_ACTIVITY_JOIN, new NotificationDataUtilsKt$getContent$2(notificationData));
                }
                return renderMessageContent(notificationData, context);
            case 1770025841:
                return !type.equals(NotificationData.TYPE_CALL_RING) ? "" : I18nUtilsKt.i18nFormat(context, I18nMessage.OVERLAY_FRIEND_CALLING, new NotificationDataUtilsKt$getContent$4(notificationData));
            default:
                return "";
        }
    }

    public static final PendingIntent getContentPendingIntent(NotificationData notificationData, Context context, Map<String, String> notificationDataMap) {
        q.g(notificationData, "<this>");
        q.g(context, "context");
        q.g(notificationDataMap, "notificationDataMap");
        String tag = getTag(notificationData);
        return getPendingIntent(context, notificationDataMap, tag + "content");
    }

    public static final CharSequence getConversationTitle(NotificationData notificationData) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String userUsername;
        q.g(notificationData, "<this>");
        if (!q.b(notificationData.getType(), NotificationData.TYPE_MESSAGE_CREATE)) {
            return null;
        }
        Integer channelType = notificationData.getChannelType();
        boolean z14 = false;
        if ((channelType != null && channelType.intValue() == 0) || (channelType != null && channelType.intValue() == 2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && (channelType == null || channelType.intValue() != 5)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11 && (channelType == null || channelType.intValue() != 10)) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z12 && (channelType == null || channelType.intValue() != 11)) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z13 || (channelType != null && channelType.intValue() == 12)) {
            z14 = true;
        }
        if (z14) {
            userUsername = notificationData.getGuildName() + " #" + notificationData.getChannelName();
        } else if (channelType == null || channelType.intValue() != 3) {
            return null;
        } else {
            String channelName = notificationData.getChannelName();
            if (channelName != null) {
                return channelName;
            }
            userUsername = notificationData.getUserUsername();
        }
        return userUsername;
    }

    public static final PendingIntent getDeletePendingIntent(NotificationData notificationData, Context context) {
        q.g(notificationData, "<this>");
        q.g(context, "context");
        return NotificationAction.DefaultImpls.toPendingIntent$default(new DeleteAction(getTag(notificationData)), context, 0, false, 6, null);
    }

    public static final NotificationCompat.Action getDirectReplyAction(NotificationData notificationData, Context context) {
        ChannelId channelId;
        q.g(notificationData, "<this>");
        q.g(context, "context");
        if (!q.b(notificationData.getType(), NotificationData.TYPE_MESSAGE_CREATE) || !notificationData.getCanReply() || (channelId = notificationData.m513getChannelIdqMVnFVQ()) == null) {
            return null;
        }
        return new NotificationCompat.Action.a(R.drawable.ic_send_white_24dp, I18nUtilsKt.i18nFormat$default(context, I18nMessage.NOTIFICATION_REPLY, null, 2, null), NotificationAction.DefaultImpls.toPendingIntent$default(new DirectReplyAction(getTag(notificationData), channelId.m555unboximpl(), notificationData.getChannelName(), notificationData.getChannelType(), notificationData.getGuildName(), null), context, PendingIntentUtils.mutablePendingIntentFlag$default(PendingIntentUtils.INSTANCE, 0, 1, null), false, 4, null)).a(DirectReplyAction.Companion.toRemoteInput(I18nUtilsKt.i18nFormat$default(context, I18nMessage.SEND_MESSAGE, null, 2, null).toString())).e(true).h(1).i(false).b();
    }

    public static final String getGroupKey(NotificationData notificationData) {
        q.g(notificationData, "<this>");
        String type = notificationData.getType();
        return "GROUP_" + type;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String getIconUrl(com.discord.notifications.api.NotificationData r12, android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.notifications.renderer.utils.NotificationDataUtilsKt.getIconUrl(com.discord.notifications.api.NotificationData, android.content.Context):java.lang.String");
    }

    public static final String getIconUrlForAvatar(NotificationData notificationData, Context context) {
        boolean z10;
        String str;
        q.g(notificationData, "<this>");
        q.g(context, "context");
        IconUrlUtils iconUrlUtils = IconUrlUtils.INSTANCE;
        String str2 = IconUrlUtils.m441getForGuildMember2tNb6hE$default(iconUrlUtils, notificationData.getUserGuildAvatar(), notificationData.m514getGuildIdqOKuAAo(), notificationData.m517getUserIdwUX8bhU(), null, false, 24, null);
        if (str2.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return str2;
        }
        str = iconUrlUtils.m447getForUser_fRzTXg(context, notificationData.m517getUserIdwUX8bhU(), notificationData.getUserAvatar(), (r16 & 8) != 0 ? null : notificationData.getUserDiscriminator(), (r16 & 16) != 0 ? false : false, (r16 & 32) != 0 ? null : null);
        return str;
    }

    public static final KvMessageEntry getKvMessage(NotificationData notificationData, String str) {
        JsonObject notificationMessage;
        List i10;
        List d10;
        List i11;
        List d11;
        List o02;
        q.g(notificationData, "<this>");
        String str2 = notificationData.m515getMessageIdN_6c4I0();
        ChannelId channelId = notificationData.m513getChannelIdqMVnFVQ();
        if (!(str2 == null || channelId == null || !q.b(notificationData.getType(), NotificationData.TYPE_MESSAGE_CREATE))) {
            NotificationMessage message = notificationData.getMessage();
            if (str == null || message == null) {
                JsonObject author = getAuthor(notificationData);
                if (author == null || (notificationMessage = toNotificationMessage(notificationData, author)) == null) {
                    CrashReporting.INSTANCE.captureException(new Exception("Failed to derive push message"));
                } else {
                    i10 = j.i();
                    d10 = i.d(author);
                    return new KvMessageEntry(i10, d10, notificationMessage, str2, channelId.m555unboximpl(), null);
                }
            } else {
                JsonElement g10 = Json.f22581d.g(str);
                i11 = j.i();
                JsonObject author2 = message.getAuthor();
                q.d(author2);
                d11 = i.d(author2);
                o02 = r.o0(d11, message.getMentions());
                return new KvMessageEntry(i11, o02, g.m(g10), str2, channelId.m555unboximpl(), null);
            }
        }
        return null;
    }

    public static final NotificationCompat.Action getMarkAsReadAction(NotificationData notificationData, Context context) {
        ChannelId channelId;
        q.g(notificationData, "<this>");
        q.g(context, "context");
        if (!q.b(notificationData.getType(), NotificationData.TYPE_MESSAGE_CREATE) || (channelId = notificationData.m513getChannelIdqMVnFVQ()) == null) {
            return null;
        }
        long j10 = channelId.m555unboximpl();
        String str = notificationData.m515getMessageIdN_6c4I0();
        if (str == null) {
            return null;
        }
        return new NotificationCompat.Action.a(R.drawable.ic_check_grey_24dp, I18nUtilsKt.i18nFormat$default(context, I18nMessage.MARK_AS_READ, null, 2, null), NotificationAction.DefaultImpls.toPendingIntent$default(new MarkAsReadAction(getTag(notificationData), j10, str, null), context, 0, false, 6, null)).h(2).i(false).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String getNotificationCategory(com.discord.notifications.api.NotificationData r1) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.q.g(r1, r0)
            java.lang.String r1 = r1.getType()
            int r0 = r1.hashCode()
            switch(r0) {
                case -1502317553: goto L_0x0056;
                case -1489275252: goto L_0x004d;
                case -1327124998: goto L_0x0044;
                case -1263316859: goto L_0x003b;
                case -1237752112: goto L_0x002f;
                case -437641071: goto L_0x0026;
                case 974015250: goto L_0x001d;
                case 1770025841: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0062
        L_0x0011:
            java.lang.String r0 = "CALL_RING"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x001a
            goto L_0x0062
        L_0x001a:
            java.lang.String r1 = "call"
            goto L_0x0064
        L_0x001d:
            java.lang.String r0 = "ACTIVITY_START"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x005f
            goto L_0x0062
        L_0x0026:
            java.lang.String r0 = "FORUM_THREAD_CREATED"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x005f
            goto L_0x0062
        L_0x002f:
            java.lang.String r0 = "APPLICATION_LIBRARY_INSTALL_COMPLETE"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0038
            goto L_0x0062
        L_0x0038:
            java.lang.String r1 = "progress"
            goto L_0x0064
        L_0x003b:
            java.lang.String r0 = "STAGE_INSTANCE_CREATE"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x005f
            goto L_0x0062
        L_0x0044:
            java.lang.String r0 = "RELATIONSHIP_ADD"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x005f
            goto L_0x0062
        L_0x004d:
            java.lang.String r0 = "GUILD_SCHEDULED_EVENT_UPDATE"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x005f
            goto L_0x0062
        L_0x0056:
            java.lang.String r0 = "GENERIC_PUSH_NOTIFICATION_SENT"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x005f
            goto L_0x0062
        L_0x005f:
            java.lang.String r1 = "social"
            goto L_0x0064
        L_0x0062:
            java.lang.String r1 = "msg"
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.notifications.renderer.utils.NotificationDataUtilsKt.getNotificationCategory(com.discord.notifications.api.NotificationData):java.lang.String");
    }

    private static final PendingIntent getPendingIntent(Context context, Map<String, String> map, String str) {
        return NotificationAction.DefaultImpls.toPendingIntent$default(new ContentAction(str, map), context, 0, true, 2, null);
    }

    public static final long getSendTime(NotificationData notificationData) {
        q.g(notificationData, "<this>");
        return System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r2.intValue() == 1) goto L_0x002e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.core.app.Person getSender(com.discord.notifications.api.NotificationData r2, android.graphics.Bitmap r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.q.g(r2, r0)
            androidx.core.app.Person$c r0 = new androidx.core.app.Person$c
            r0.<init>()
            java.lang.String r1 = r2.getUserUsername()
            androidx.core.app.Person$c r0 = r0.f(r1)
            com.discord.primitives.UserId r1 = r2.m517getUserIdwUX8bhU()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            androidx.core.app.Person$c r0 = r0.e(r1)
            java.lang.Integer r2 = r2.getRelationshipType()
            if (r2 != 0) goto L_0x0025
            goto L_0x002d
        L_0x0025:
            int r2 = r2.intValue()
            r1 = 1
            if (r2 != r1) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r1 = 0
        L_0x002e:
            androidx.core.app.Person$c r2 = r0.d(r1)
            if (r3 == 0) goto L_0x0039
            androidx.core.graphics.drawable.IconCompat r3 = toIconCompat(r3)
            goto L_0x003a
        L_0x0039:
            r3 = 0
        L_0x003a:
            androidx.core.app.Person$c r2 = r2.c(r3)
            androidx.core.app.Person r2 = r2.a()
            java.lang.String r3 = "Builder()\n        .setNa…ompat())\n        .build()"
            kotlin.jvm.internal.q.f(r2, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.notifications.renderer.utils.NotificationDataUtilsKt.getSender(com.discord.notifications.api.NotificationData, android.graphics.Bitmap):androidx.core.app.Person");
    }

    public static final Person getSenderForMessageNotification(NotificationData notificationData, Bitmap bitmap) {
        q.g(notificationData, "<this>");
        if (notificationData.isFromCurrentUser()) {
            return null;
        }
        return getSender(notificationData, bitmap);
    }

    public static final ShortcutInfoCompat getShortcutInfo(NotificationData notificationData, Context context, Map<String, String> notificationDataMap, Bitmap bitmap, Bitmap bitmap2) {
        List d10;
        q.g(notificationData, "<this>");
        q.g(context, "context");
        q.g(notificationDataMap, "notificationDataMap");
        String valueOf = String.valueOf(notificationData.m513getChannelIdqMVnFVQ());
        CharSequence title = getTitle(notificationData, context);
        CharSequence title2 = getTitle(notificationData, context);
        Intent createShortcutIntent = ShortcutData.Companion.createShortcutIntent(context, "android.intent.action.VIEW", NotificationAction.Companion.getActivityClass(), getTag(notificationData), notificationDataMap);
        d10 = i.d(getSender(notificationData, bitmap2));
        return ShortcutUtilsKt.createShortcut$default(context, valueOf, title, title2, bitmap, d10, createShortcutIntent, 0, 64, null);
    }

    public static final int getSmallIcon(NotificationData notificationData) {
        q.g(notificationData, "<this>");
        String type = notificationData.getType();
        int hashCode = type.hashCode();
        if (hashCode != -1327124998) {
            if (hashCode != 998188116) {
                if (hashCode == 1770025841 && type.equals(NotificationData.TYPE_CALL_RING)) {
                    return R.drawable.ic_notification_call_24dp;
                }
            } else if (type.equals(NotificationData.TYPE_MESSAGE_CREATE)) {
                return R.drawable.ic_notification_message_24dp;
            }
        } else if (type.equals(NotificationData.TYPE_RELATIONSHIP_ADD)) {
            return R.drawable.ic_notification_friends_24dp;
        }
        return R.drawable.ic_notification_24dp;
    }

    public static final Uri getSound(NotificationData notificationData, Context context) {
        q.g(notificationData, "<this>");
        q.g(context, "context");
        if (!q.b(notificationData.getType(), NotificationData.TYPE_CALL_RING)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("android.resource://");
        String packageName = context.getPackageName();
        int i10 = R.raw.call_ringing;
        sb2.append(packageName + "/" + i10);
        return Uri.parse(sb2.toString());
    }

    /* renamed from: getSystemMessageUserJoin-_NT-lnE  reason: not valid java name */
    private static final CharSequence m532getSystemMessageUserJoin_NTlnE(Context context, UserId userId, String str) {
        List l10;
        long j10;
        l10 = j.l(I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_001, I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_002, I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_003, I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_004, I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_005, I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_006, I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_007, I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_008, I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_009, I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_010, I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_011, I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_012, I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_013);
        if (userId != null) {
            j10 = userId.m619unboximpl();
        } else {
            j10 = 0;
        }
        return I18nUtilsKt.i18nFormat(context, (I18nMessage) l10.get((int) (j10 % l10.size())), new NotificationDataUtilsKt$getSystemMessageUserJoin$1$1(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
        if (r0.equals(com.discord.notifications.api.NotificationData.TYPE_FORUM_THREAD_CREATED) != false) goto L_0x00a8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
        if (r0.equals(com.discord.notifications.api.NotificationData.TYPE_STAGE_INSTANCE_CREATE) != false) goto L_0x00a8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
        if (r0.equals(com.discord.notifications.api.NotificationData.TYPE_GUILD_SCHEDULED_EVENT_UPDATE) != false) goto L_0x00a8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
        r0 = r3.getType();
        r3 = r3.m513getChannelIdqMVnFVQ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
        return r0 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r0.equals(com.discord.notifications.api.NotificationData.TYPE_CALL_RING) != false) goto L_0x00a8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r0.equals(com.discord.notifications.api.NotificationData.TYPE_MESSAGE_CREATE) != false) goto L_0x00a8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String getTag(com.discord.notifications.api.NotificationData r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.q.g(r3, r0)
            java.lang.String r0 = r3.getType()
            int r1 = r0.hashCode()
            switch(r1) {
                case -1502317553: goto L_0x00c0;
                case -1489275252: goto L_0x00a0;
                case -1327124998: goto L_0x0080;
                case -1263316859: goto L_0x0077;
                case -1237752112: goto L_0x0057;
                case -437641071: goto L_0x004e;
                case 974015250: goto L_0x0026;
                case 998188116: goto L_0x001c;
                case 1770025841: goto L_0x0012;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x00e0
        L_0x0012:
            java.lang.String r1 = "CALL_RING"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e0
            goto L_0x00a8
        L_0x001c:
            java.lang.String r1 = "MESSAGE_CREATE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e0
            goto L_0x00a8
        L_0x0026:
            java.lang.String r1 = "ACTIVITY_START"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e0
            java.lang.String r0 = r3.getType()
            java.lang.Integer r1 = r3.getActivityType()
            java.lang.String r3 = r3.getActivityName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r1)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            goto L_0x00df
        L_0x004e:
            java.lang.String r1 = "FORUM_THREAD_CREATED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e0
            goto L_0x00a8
        L_0x0057:
            java.lang.String r1 = "APPLICATION_LIBRARY_INSTALL_COMPLETE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e0
            java.lang.String r0 = r3.getType()
            com.discord.primitives.ApplicationId r3 = r3.m512getApplicationIdUtIrSio()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            goto L_0x00df
        L_0x0077:
            java.lang.String r1 = "STAGE_INSTANCE_CREATE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e0
            goto L_0x00a8
        L_0x0080:
            java.lang.String r1 = "RELATIONSHIP_ADD"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e0
            java.lang.String r0 = r3.getType()
            com.discord.primitives.UserId r3 = r3.m517getUserIdwUX8bhU()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            goto L_0x00df
        L_0x00a0:
            java.lang.String r1 = "GUILD_SCHEDULED_EVENT_UPDATE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e0
        L_0x00a8:
            java.lang.String r0 = r3.getType()
            com.discord.primitives.ChannelId r3 = r3.m513getChannelIdqMVnFVQ()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            goto L_0x00df
        L_0x00c0:
            java.lang.String r1 = "GENERIC_PUSH_NOTIFICATION_SENT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e0
            java.lang.String r0 = r3.getType()
            java.lang.String r3 = r3.getDeeplink()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
        L_0x00df:
            return r3
        L_0x00e0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.getType()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown notification type: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.notifications.renderer.utils.NotificationDataUtilsKt.getTag(com.discord.notifications.api.NotificationData):java.lang.String");
    }

    public static final NotificationCompat.Action getTimedMuteAction(NotificationData notificationData, Context context, int i10) {
        ChannelId channelId;
        q.g(notificationData, "<this>");
        q.g(context, "context");
        if (!q.b(notificationData.getType(), NotificationData.TYPE_MESSAGE_CREATE) || i10 < 2 || (channelId = notificationData.m513getChannelIdqMVnFVQ()) == null) {
            return null;
        }
        return new NotificationCompat.Action.a(R.drawable.ic_notifications_off_24dp, I18nUtilsKt.i18nFormat$default(context, I18nMessage.NOTIFICATION_MUTE_1_HOUR, null, 2, null), NotificationAction.DefaultImpls.toPendingIntent$default(new MuteAction(getTag(notificationData), notificationData.m514getGuildIdqOKuAAo(), channelId.m555unboximpl(), null), context, 0, false, 6, null)).b();
    }

    public static final CharSequence getTitle(NotificationData notificationData, Context context) {
        String title;
        Integer guildScheduledEventEntityType;
        Integer activityType;
        q.g(notificationData, "<this>");
        q.g(context, "context");
        String type = notificationData.getType();
        switch (type.hashCode()) {
            case -1502317553:
                if (!type.equals(NotificationData.TYPE_GENERIC_PUSH_NOTIFICATION_SENT) || (title = notificationData.getTitle()) == null) {
                    return "";
                }
                break;
            case -1489275252:
                return (type.equals(NotificationData.TYPE_GUILD_SCHEDULED_EVENT_UPDATE) && (guildScheduledEventEntityType = notificationData.getGuildScheduledEventEntityType()) != null && guildScheduledEventEntityType.intValue() == 1) ? I18nUtilsKt.i18nFormat(context, I18nMessage.GUILD_SCHEDULED_EVENT_STAGE_START_TITLE, new NotificationDataUtilsKt$getTitle$3(notificationData)) : "";
            case -1327124998:
                if (!type.equals(NotificationData.TYPE_RELATIONSHIP_ADD) || (title = notificationData.getUserUsername()) == null) {
                    return "";
                }
                break;
            case -1263316859:
                return !type.equals(NotificationData.TYPE_STAGE_INSTANCE_CREATE) ? "" : I18nUtilsKt.i18nFormat(context, I18nMessage.STAGE_START_PUSH_NOTIFICATION_TITLE, new NotificationDataUtilsKt$getTitle$1(notificationData));
            case -1237752112:
                return !type.equals(NotificationData.TYPE_APPLICATION_LIBRARY_INSTALL_COMPLETE) ? "" : I18nUtilsKt.i18nFormat$default(context, I18nMessage.GAME_LIBRARY_NOTIFICATION_GAME_INSTALLED_TITLE, null, 2, null);
            case -437641071:
                return !type.equals(NotificationData.TYPE_FORUM_THREAD_CREATED) ? "" : I18nUtilsKt.i18nFormat(context, I18nMessage.FORUM_CHANNEL_THREAD_CREATED_PUSH_TITLE_MOBILE, new NotificationDataUtilsKt$getTitle$2(notificationData));
            case 974015250:
                return (type.equals(NotificationData.TYPE_ACTIVITY_START) && (activityType = notificationData.getActivityType()) != null && activityType.intValue() == 0) ? I18nUtilsKt.i18nFormat$default(context, I18nMessage.NOTIFICATION_TITLE_START_GAME, null, 2, null) : "";
            case 998188116:
                if (!type.equals(NotificationData.TYPE_MESSAGE_CREATE)) {
                    return "";
                }
                Integer channelType = notificationData.getChannelType();
                boolean z10 = false;
                if ((((((channelType != null && channelType.intValue() == 0) || (channelType != null && channelType.intValue() == 2)) || (channelType != null && channelType.intValue() == 5)) || (channelType != null && channelType.intValue() == 10)) || (channelType != null && channelType.intValue() == 11)) || (channelType != null && channelType.intValue() == 12)) {
                    z10 = true;
                }
                if (z10) {
                    title = notificationData.getGuildName() + " #" + notificationData.getChannelName();
                    break;
                } else if (channelType != null && channelType.intValue() == 1) {
                    title = notificationData.getUserUsername();
                    if (title == null) {
                        return "";
                    }
                } else if (channelType == null || channelType.intValue() != 3) {
                    return "";
                } else {
                    String channelName = notificationData.getChannelName();
                    if (channelName != null) {
                        return channelName;
                    }
                    title = notificationData.getUserUsername();
                    if (title == null) {
                        return "";
                    }
                }
                break;
            case 1770025841:
                if (!type.equals(NotificationData.TYPE_CALL_RING)) {
                    return "";
                }
                Integer channelType2 = notificationData.getChannelType();
                if (channelType2 != null && channelType2.intValue() == 1) {
                    return I18nUtilsKt.i18nFormat$default(context, I18nMessage.INCOMING_CALL, null, 2, null);
                }
                title = notificationData.getChannelName();
                if (title == null) {
                    return "";
                }
                break;
            default:
                return "";
        }
        return title;
    }

    public static final boolean isConversation(NotificationData notificationData) {
        q.g(notificationData, "<this>");
        return q.b(notificationData.getType(), NotificationData.TYPE_MESSAGE_CREATE);
    }

    public static final boolean isGroupConversation(NotificationData notificationData) {
        Integer channelType;
        q.g(notificationData, "<this>");
        if (!q.b(notificationData.getType(), NotificationData.TYPE_MESSAGE_CREATE) || ((channelType = notificationData.getChannelType()) != null && channelType.intValue() == 1)) {
            return false;
        }
        return true;
    }

    public static final CharSequence renderMessageContent(NotificationData notificationData, Context context) {
        Sticker sticker;
        boolean z10;
        q.g(notificationData, "<this>");
        q.g(context, "context");
        NotificationMessage message = notificationData.getMessage();
        if (message != null) {
            sticker = message.getSticker();
        } else {
            sticker = null;
        }
        if (sticker != null) {
            return I18nUtilsKt.i18nFormat(context, I18nMessage.STICKER_NOTIFICATION_BODY, new NotificationDataUtilsKt$renderMessageContent$1(sticker));
        }
        if (MessageFlagKt.hasMessageFlag(notificationData.getMessageFlags(), MessageFlag.IS_VOICE_MESSAGE)) {
            return I18nUtilsKt.i18nFormat$default(context, I18nMessage.VOICE_MESSAGES_SENT_NOTIFICATION, null, 2, null);
        }
        String messageContent = notificationData.getMessageContent();
        if (messageContent == null || messageContent.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return notificationData.getMessageContent();
        }
        String messageContent2 = notificationData.getMessageContent();
        q.d(messageContent2);
        return RenderNotificationMessageContentKt.renderNotificationMessageContent(messageContent2);
    }

    public static final boolean shouldUseBigText(NotificationData notificationData) {
        q.g(notificationData, "<this>");
        if (!q.b(notificationData.getType(), NotificationData.TYPE_GENERIC_PUSH_NOTIFICATION_SENT) || !q.b(notificationData.getExpandSubtitle(), Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    private static final IconCompat toIconCompat(Bitmap bitmap) {
        IconCompat h10 = IconCompat.h(bitmap);
        q.f(h10, "createWithBitmap(this)");
        return h10;
    }

    public static final JsonObject toNotificationMessage(NotificationData notificationData, JsonObject author) {
        q.g(notificationData, "<this>");
        q.g(author, "author");
        String messageContent = notificationData.getMessageContent();
        Long messageFlags = notificationData.getMessageFlags();
        Integer messageType = notificationData.getMessageType();
        String str = notificationData.m515getMessageIdN_6c4I0();
        ChannelId channelId = notificationData.m513getChannelIdqMVnFVQ();
        GuildId guildId = notificationData.m514getGuildIdqOKuAAo();
        if (messageContent == null || messageType == null || str == null || channelId == null) {
            return null;
        }
        String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS", Locale.getDefault()).format(new Date());
        s sVar = new s();
        f.c(sVar, "content", messageContent);
        f.b(sVar, "flags", messageFlags);
        f.b(sVar, "type", notificationData.getMessageType());
        f.c(sVar, "id", MessageId.m578toStringimpl(str));
        f.c(sVar, "channel_id", ChannelId.m553toStringimpl(channelId.m555unboximpl()));
        f.c(sVar, "timestamp", format);
        sVar.b("author", author);
        if (guildId != null) {
            f.c(sVar, "guild_id", GuildId.m566toStringimpl(guildId.m568unboximpl()));
        }
        return sVar.a();
    }
}
