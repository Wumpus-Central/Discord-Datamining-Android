package com.discord.notifications.client;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.discord.crash_reporting.CrashReporting;
import com.discord.kvstorage.discordapp.DiscordMobileApi;
import com.discord.logging.Log;
import com.discord.misc.utilities.intent.IntentUtilsKt;
import com.discord.notifications.actions.intents.ContentAction;
import com.discord.notifications.actions.intents.NotificationAction;
import com.discord.notifications.api.DirectReplyMessage;
import com.discord.notifications.api.KvMessageEntry;
import com.discord.notifications.api.NotificationData;
import com.discord.notifications.renderer.NotificationBehaviors;
import com.discord.notifications.renderer.NotificationRenderer;
import com.discord.notifications.renderer.utils.NotificationDataUtilsKt;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import com.discord.react.headless_tasks.api.HeadlessTasks;
import com.discord.shortcuts.ShortcutData;
import gf.x;
import hf.v;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import kotlinx.serialization.json.Json;
import wi.a;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 K2\u00020\u0001:\u0001KB\u0007¢\u0006\u0004\bI\u0010JJ4\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u000f\u001a\u00020\u000b2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J6\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006J\u0016\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015J\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006J\u000e\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0007J\u001a\u0010\u001d\u001a\u00020\u000b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u001bJ(\u0010\u001f\u001a\u00020\u000b2 \u0010\u001e\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0004\u0012\u00020\u000b0\u001bJ\u001c\u0010 \u001a\u00020\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006J(\u0010!\u001a\u00020\u000b2 \u0010\u001e\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0004\u0012\u00020\u000b0\u001bJ\u0016\u0010#\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\tJ\u000e\u0010$\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010&\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\tJ\u000e\u0010'\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010)\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\tJ\u000e\u0010*\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010,\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\tJ\u0018\u0010.\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\u0007J\u0016\u00100\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\tJ\u000e\u00101\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u00103\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u0007J\u0016\u00106\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00105\u001a\u000204J$\u00107\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u000e\u00108\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002R\"\u00109\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;\"\u0004\b<\u0010=R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010>R\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010?R&\u0010@\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR2\u0010\u001e\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010?R2\u0010B\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010?R\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006L"}, d2 = {"Lcom/discord/notifications/client/NotificationClient;", "", "Landroid/content/Context;", "context", "Lcom/discord/notifications/api/NotificationData;", "notificationData", "", "", "notificationDataMap", "", "makeOrUpdateShortcut", "", "showNotification", "updateAndComputeIfShouldRunBackgroundSync", "notification", "setNotification", "Lcom/discord/notifications/renderer/NotificationBehaviors;", "getBehaviors", "localizedCategoryNames", "localizedGroupNames", "initNotificationCategories", "Landroid/content/Intent;", "intent", "handleIntent", "getPendingNotification", "token", "setToken", "Lkotlin/Function1;", "tokenListener", "setTokenListener", "notificationListener", "setNotificationListener", "setLocalNotification", "setLocalNotificationListener", "isAuthed", "setIsAuthed", "isSoundsEnabled", "soundsEnabled", "setSoundsEnabled", "isVibrationsEnabled", "vibrationsEnabled", "setVibrationsEnabled", "isLightsEnabled", "lightsEnabled", "setLightsEnabled", "username", "setCurrentUsername", "notifyEveryTime", "setNotifyEveryTime", "shouldNotifyEveryTime", "data", "onDirectReplySuccess", "", "channelId", "markNotificationAsDirectReply", "onNotificationReceived", "clearAllNotifications", "isActive", "Z", "()Z", "setActive", "(Z)V", "Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "notificationPending", "Ljava/util/Map;", "notificationLocalListener", "Lcom/discord/notifications/client/NotificationCache;", "cache", "Lcom/discord/notifications/client/NotificationCache;", "Lcom/discord/notifications/renderer/NotificationRenderer;", "renderer", "Lcom/discord/notifications/renderer/NotificationRenderer;", "<init>", "()V", "Companion", "notification_client_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class NotificationClient {
    private static final long NOTIFICATION_BACKGROUND_SYNC_INTERVAL_MS = 3600000;
    private boolean isActive;
    private Function1<? super Map<String, String>, Unit> notificationListener;
    private Function1<? super Map<String, String>, Unit> notificationLocalListener;
    private Map<String, String> notificationPending;
    private String token;
    public static final Companion Companion = new Companion(null);
    private static final NotificationClient instance = new NotificationClient();
    private Function1<? super String, Unit> tokenListener = NotificationClient$tokenListener$1.INSTANCE;
    private NotificationCache cache = new NotificationCache();
    private NotificationRenderer renderer = new NotificationRenderer();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/discord/notifications/client/NotificationClient$Companion;", "", "()V", "NOTIFICATION_BACKGROUND_SYNC_INTERVAL_MS", "", "instance", "Lcom/discord/notifications/client/NotificationClient;", "getInstance", "()Lcom/discord/notifications/client/NotificationClient;", "notification_client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NotificationClient getInstance() {
            return NotificationClient.instance;
        }
    }

    private final NotificationBehaviors getBehaviors(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return null;
        }
        return new NotificationBehaviors(isSoundsEnabled(context), isVibrationsEnabled(context), isLightsEnabled(context));
    }

    private final void setNotification(Map<String, String> map) {
        if (map == null) {
            this.notificationPending = null;
            return;
        }
        Function1<? super Map<String, String>, Unit> function1 = this.notificationListener;
        if (function1 == null) {
            this.notificationPending = map;
        } else if (function1 != null) {
            function1.invoke(map);
        }
    }

    private final void showNotification(Context context, NotificationData notificationData, Map<String, String> map, boolean z10) {
        Map k10;
        String str;
        CrashReporting crashReporting = CrashReporting.INSTANCE;
        k10 = v.k(x.a("type", notificationData.getType()), x.a("channelId", String.valueOf(notificationData.m531getChannelIdqMVnFVQ())), x.a("messageId", String.valueOf(notificationData.m531getChannelIdqMVnFVQ())));
        CrashReporting.addBreadcrumb$default(crashReporting, "Notification received in native code.", k10, null, 4, null);
        if (this.cache.isAuthed(context)) {
            SilentNotificationManager silentNotificationManager = SilentNotificationManager.Companion.get(context);
            if (q.b(notificationData.getType(), NotificationData.TYPE_CHANNEL_ACK)) {
                this.renderer.handleAcks(context, notificationData);
                silentNotificationManager.handleAcks(notificationData);
            } else if (!this.isActive) {
                try {
                    if (silentNotificationManager.shouldDisplayNotification(notificationData)) {
                        this.renderer.initIconUrlUtils(context);
                        this.renderer.initFresco(context);
                        this.renderer.display(context, notificationData, this.cache.getCurrentUsername(context), map, getBehaviors(context), z10, shouldNotifyEveryTime(context));
                        silentNotificationManager.onDisplayNotification(notificationData);
                    } else {
                        silentNotificationManager.onSilentNotification(notificationData);
                    }
                    if (q.b(notificationData.getType(), NotificationData.TYPE_MESSAGE_CREATE)) {
                        KvMessageEntry kvMessage = NotificationDataUtilsKt.getKvMessage(notificationData, map.get("message"));
                        if (kvMessage != null) {
                            String str2 = notificationData.m533getMessageIdN_6c4I0();
                            ChannelId channelId = notificationData.m531getChannelIdqMVnFVQ();
                            if (!(str2 == null || channelId == null)) {
                                String str3 = map.get("receiving_user_id");
                                String str4 = "@account." + ((Object) str3);
                                GuildId guildId = notificationData.m532getGuildIdqOKuAAo();
                                if (guildId != null) {
                                    str = GuildId.m584toStringimpl(guildId.m586unboximpl());
                                } else {
                                    str = null;
                                }
                                String str5 = ChannelId.m571toStringimpl(channelId.m573unboximpl());
                                String str6 = MessageId.m596toStringimpl(str2);
                                Json.a aVar = Json.f21218d;
                                aVar.a();
                                DiscordMobileApi.putMessage(str4, str, str5, str6, aVar.c(KvMessageEntry.Companion.serializer(), kvMessage));
                            }
                        }
                        if (updateAndComputeIfShouldRunBackgroundSync(context)) {
                            HeadlessTasks.Companion.startHeadlessTask$default(HeadlessTasks.Companion, context, "BackgroundSync", 30000L, false, null, true, 24, null);
                        }
                    }
                } catch (Exception e10) {
                    Log log = Log.INSTANCE;
                    String simpleName = NotificationClient.class.getSimpleName();
                    q.f(simpleName, "javaClass.simpleName");
                    log.e(simpleName, "Unable to display notification", e10);
                }
            }
        }
    }

    private final boolean updateAndComputeIfShouldRunBackgroundSync(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < this.cache.getBackgroundSyncRan(context)) {
            this.cache.setBackgroundSyncRan(context);
            return true;
        } else if (currentTimeMillis <= this.cache.getBackgroundSyncRan(context) + NOTIFICATION_BACKGROUND_SYNC_INTERVAL_MS) {
            return false;
        } else {
            this.cache.setBackgroundSyncRan(context);
            return true;
        }
    }

    public final void clearAllNotifications(Context context) {
        q.g(context, "context");
        this.renderer.clearAllNotifications(context);
    }

    public final Map<String, String> getPendingNotification() {
        Map<String, String> map = this.notificationPending;
        if (map == null) {
            return null;
        }
        this.notificationPending = null;
        return map;
    }

    public final void handleIntent(Context context, Intent intent) {
        NotificationAction notificationAction;
        ContentAction contentAction;
        q.g(context, "context");
        q.g(intent, "intent");
        NotificationAction.Companion companion = NotificationAction.Companion;
        if (IntentUtilsKt.hasExtra(intent, f0.b(ContentAction.class))) {
            notificationAction = (NotificationAction) IntentUtilsKt.getIntentParcelable(intent);
        } else {
            notificationAction = null;
        }
        ContentAction contentAction2 = (ContentAction) notificationAction;
        ShortcutData shortcutIntentData = ShortcutData.Companion.getShortcutIntentData(intent);
        if (shortcutIntentData != null) {
            contentAction = new ContentAction(shortcutIntentData.getTag(), shortcutIntentData.getData());
        } else {
            contentAction = null;
        }
        if (contentAction2 == null) {
            contentAction2 = contentAction;
        }
        if (contentAction2 == null) {
            setNotification(null);
            return;
        }
        setNotification(contentAction2.getData());
        contentAction2.onNotificationActionComplete(context);
    }

    public final void initNotificationCategories(Context context, Map<String, String> localizedCategoryNames, Map<String, String> localizedGroupNames) {
        q.g(context, "context");
        q.g(localizedCategoryNames, "localizedCategoryNames");
        q.g(localizedGroupNames, "localizedGroupNames");
        this.renderer.initNotificationCategories(context, localizedCategoryNames, localizedGroupNames);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isLightsEnabled(Context context) {
        q.g(context, "context");
        return this.cache.isLightsEnabled(context);
    }

    public final boolean isSoundsEnabled(Context context) {
        q.g(context, "context");
        return this.cache.isSoundsEnabled(context);
    }

    public final boolean isVibrationsEnabled(Context context) {
        q.g(context, "context");
        return this.cache.isVibrationsEnabled(context);
    }

    public final void markNotificationAsDirectReply(Context context, long j10) {
        q.g(context, "context");
        NotificationRenderer notificationRenderer = this.renderer;
        notificationRenderer.markNotificationAsDirectReply(context, NotificationData.TYPE_MESSAGE_CREATE + j10, "", true);
    }

    public final void onDirectReplySuccess(Context context, String data) {
        String str;
        Map<String, String> k10;
        q.g(context, "context");
        q.g(data, "data");
        NotificationData notificationData = DirectReplyMessage.Companion.toNotificationData(data);
        Pair[] pairArr = new Pair[3];
        pairArr[0] = x.a("type", notificationData.getType());
        pairArr[1] = x.a("channel_id", String.valueOf(notificationData.m531getChannelIdqMVnFVQ()));
        String str2 = notificationData.m533getMessageIdN_6c4I0();
        if (str2 == null) {
            str = "null";
        } else {
            str = MessageId.m596toStringimpl(str2);
        }
        pairArr[2] = x.a("message_id", str);
        k10 = v.k(pairArr);
        showNotification(context, notificationData, k10, false);
    }

    public final void onNotificationReceived(Context context, Map<String, String> data) {
        q.g(context, "context");
        q.g(data, "data");
        showNotification(context, (NotificationData) a.f28955b.d(NotificationData.Companion.serializer(), data), data, true);
    }

    public final void setActive(boolean z10) {
        this.isActive = z10;
    }

    public final void setCurrentUsername(Context context, String str) {
        q.g(context, "context");
        this.cache.setCurrentUsername(context, str);
    }

    public final void setIsAuthed(Context context, boolean z10) {
        q.g(context, "context");
        this.cache.setIsAuthed(context, z10);
    }

    public final void setLightsEnabled(Context context, boolean z10) {
        q.g(context, "context");
        this.cache.setLightsEnabled(context, z10);
    }

    public final void setLocalNotification(Map<String, String> notification) {
        q.g(notification, "notification");
    }

    public final void setLocalNotificationListener(Function1<? super Map<String, String>, Unit> notificationListener) {
        q.g(notificationListener, "notificationListener");
        this.notificationLocalListener = notificationListener;
    }

    public final void setNotificationListener(Function1<? super Map<String, String>, Unit> notificationListener) {
        q.g(notificationListener, "notificationListener");
        this.notificationListener = notificationListener;
    }

    public final void setNotifyEveryTime(Context context, boolean z10) {
        q.g(context, "context");
        this.cache.setNotifyEveryTime(context, z10);
    }

    public final void setSoundsEnabled(Context context, boolean z10) {
        q.g(context, "context");
        this.cache.setSoundsEnabled(context, z10);
    }

    public final void setToken(String token) {
        q.g(token, "token");
        if (!q.b(this.token, token)) {
            this.token = token;
            this.tokenListener.invoke(token);
        }
    }

    public final void setTokenListener(Function1<? super String, Unit> tokenListener) {
        q.g(tokenListener, "tokenListener");
        this.tokenListener = tokenListener;
        String str = this.token;
        if (str != null) {
            tokenListener.invoke(str);
        }
    }

    public final void setVibrationsEnabled(Context context, boolean z10) {
        q.g(context, "context");
        this.cache.setVibrationsEnabled(context, z10);
    }

    public final boolean shouldNotifyEveryTime(Context context) {
        q.g(context, "context");
        return this.cache.shouldNotifyEveryTime(context);
    }
}
