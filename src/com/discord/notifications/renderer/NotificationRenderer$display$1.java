package com.discord.notifications.renderer;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import androidx.core.app.Person;
import com.discord.image.fresco.FrescoFetchDecodedImageKt;
import com.discord.image.fresco.postprocessors.PostProcessor;
import com.discord.notifications.api.NotificationData;
import com.discord.notifications.renderer.utils.NotificationDataUtilsKt;
import com.discord.notifications.renderer.utils.NotificationManagerUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.shortcuts.ShortcutUtilsKt;
import com.discord.theme.utils.ColorUtilsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9610j;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9636e;
import kotlin.coroutines.jvm.internal.AbstractC9643k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC9873q0;
import kotlinx.coroutines.C9732f;
import kotlinx.coroutines.C9851l;
import kotlinx.coroutines.CoroutineScope;
import nf.C10848t;
import tf.C12962d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9636e(m14702c = "com.discord.notifications.renderer.NotificationRenderer$display$1", m14701f = "NotificationRenderer.kt", m14700l = {134}, m14699m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class NotificationRenderer$display$1 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ NotificationBehaviors $behaviors;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $currentUsername;
    final /* synthetic */ boolean $makeOrUpdateShortcut;
    final /* synthetic */ NotificationData $notification;
    final /* synthetic */ Map<String, String> $notificationDataMap;
    final /* synthetic */ boolean $notifyEveryTime;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/graphics/Bitmap;", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    @AbstractC9636e(m14702c = "com.discord.notifications.renderer.NotificationRenderer$display$1$1", m14701f = "NotificationRenderer.kt", m14700l = {135}, m14699m = "invokeSuspend")
    /* renamed from: com.discord.notifications.renderer.NotificationRenderer$display$1$1 */
    /* loaded from: classes3.dex */
    public static final class C35531 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Ref$ObjectRef<String> $iconUrl;
        final /* synthetic */ Ref$ObjectRef<PostProcessor> $postProcessor;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35531(Ref$ObjectRef<String> ref$ObjectRef, Context context, Ref$ObjectRef<PostProcessor> ref$ObjectRef2, Continuation<? super C35531> continuation) {
            super(2, continuation);
            this.$iconUrl = ref$ObjectRef;
            this.$context = context;
            this.$postProcessor = ref$ObjectRef2;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C35531(this.$iconUrl, this.$context, this.$postProcessor, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
            return ((C35531) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = C12962d.m4646d();
            int i = this.label;
            if (i == 0) {
                C10848t.m10930b(obj);
                this.label = 1;
                obj = NotificationRenderer$display$1.invokeSuspend$fetchImage(this.$context, this.$postProcessor, this.$iconUrl.f25807k, this);
                if (obj == d) {
                    return d;
                }
            } else if (i == 1) {
                C10848t.m10930b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/graphics/Bitmap;", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    @AbstractC9636e(m14702c = "com.discord.notifications.renderer.NotificationRenderer$display$1$2", m14701f = "NotificationRenderer.kt", m14700l = {136}, m14699m = "invokeSuspend")
    /* renamed from: com.discord.notifications.renderer.NotificationRenderer$display$1$2 */
    /* loaded from: classes3.dex */
    public static final class C35542 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ NotificationData $notification;
        final /* synthetic */ Ref$ObjectRef<PostProcessor> $postProcessor;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35542(NotificationData notificationData, Context context, Ref$ObjectRef<PostProcessor> ref$ObjectRef, Continuation<? super C35542> continuation) {
            super(2, continuation);
            this.$notification = notificationData;
            this.$context = context;
            this.$postProcessor = ref$ObjectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C35542(this.$notification, this.$context, this.$postProcessor, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
            return ((C35542) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = C12962d.m4646d();
            int i = this.label;
            if (i == 0) {
                C10848t.m10930b(obj);
                Context context = this.$context;
                Ref$ObjectRef<PostProcessor> ref$ObjectRef = this.$postProcessor;
                String iconUrlForAvatar = NotificationDataUtilsKt.getIconUrlForAvatar(this.$notification, context);
                this.label = 1;
                obj = NotificationRenderer$display$1.invokeSuspend$fetchImage(context, ref$ObjectRef, iconUrlForAvatar, this);
                if (obj == d) {
                    return d;
                }
            } else if (i == 1) {
                C10848t.m10930b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationRenderer$display$1(NotificationData notificationData, Context context, boolean z, Map<String, String> map, NotificationBehaviors notificationBehaviors, String str, boolean z2, Continuation<? super NotificationRenderer$display$1> continuation) {
        super(2, continuation);
        this.$notification = notificationData;
        this.$context = context;
        this.$notifyEveryTime = z;
        this.$notificationDataMap = map;
        this.$behaviors = notificationBehaviors;
        this.$currentUsername = str;
        this.$makeOrUpdateShortcut = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invokeSuspend$fetchImage(Context context, Ref$ObjectRef<PostProcessor> ref$ObjectRef, String str, Continuation<? super Bitmap> continuation) {
        return FrescoFetchDecodedImageKt.fetchDecodedImage(context, str, ref$ObjectRef.f25807k, true, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NotificationRenderer$display$1 notificationRenderer$display$1 = new NotificationRenderer$display$1(this.$notification, this.$context, this.$notifyEveryTime, this.$notificationDataMap, this.$behaviors, this.$currentUsername, this.$makeOrUpdateShortcut, continuation);
        notificationRenderer$display$1.L$0 = obj;
        return notificationRenderer$display$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotificationRenderer$display$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.discord.image.fresco.postprocessors.PostProcessor$Circle, T] */
    /* JADX WARN: Type inference failed for: r8v5, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Object invokeSuspend(Object obj) {
        Object d;
        Object obj2;
        List<NotificationCompat.Action> l;
        NotificationCompat.MessagingStyle messagingStyle;
        List<NotificationCompat.MessagingStyle.C0977a> B;
        AbstractC9873q0 b;
        AbstractC9873q0 b2;
        d = C12962d.m4646d();
        int i = this.label;
        if (i == 0) {
            C10848t.m10930b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.f25807k = PostProcessor.Circle.INSTANCE;
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.f25807k = NotificationDataUtilsKt.getIconUrl(this.$notification, this.$context);
            if (this.$notification.getImageAttachmentUrl() != null) {
                String imageAttachmentUrl = this.$notification.getImageAttachmentUrl();
                T t = imageAttachmentUrl;
                if (imageAttachmentUrl == null) {
                    t = "";
                }
                ref$ObjectRef2.f25807k = t;
                ref$ObjectRef.f25807k = null;
            }
            b = C9851l.m14176b(coroutineScope, null, null, new C35531(ref$ObjectRef2, this.$context, ref$ObjectRef, null), 3, null);
            b2 = C9851l.m14176b(coroutineScope, null, null, new C35542(this.$notification, this.$context, ref$ObjectRef, null), 3, null);
            this.label = 1;
            obj2 = C9732f.m14463a(new AbstractC9873q0[]{b, b2}, this);
            if (obj2 == d) {
                return d;
            }
        } else if (i == 1) {
            C10848t.m10930b(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list = (List) obj2;
        Bitmap bitmap = (Bitmap) list.get(0);
        Bitmap bitmap2 = (Bitmap) list.get(1);
        CharSequence content = NotificationDataUtilsKt.getContent(this.$notification, this.$context);
        int activeNotificationMessageCount = NotificationManagerUtilsKt.getActiveNotificationMessageCount(this.$context, NotificationDataUtilsKt.getTag(this.$notification)) + 1;
        NotificationCompat.Builder C = NotificationManagerUtilsKt.getNotificationBuilderOrCreate(this.$context, NotificationChannels.INSTANCE.getNotificationChannelId(this.$notification), NotificationManagerUtilsKt.getActiveNotification(this.$context, NotificationDataUtilsKt.getTag(this.$notification))).m38519t(true).m38559R(!this.$notifyEveryTime).m38551Z(NotificationDataUtilsKt.getSmallIcon(this.$notification)).m38513z(ColorUtilsKt.getColorCompat(this.$context, C3555R.color.brand_500)).m38516w(NotificationDataUtilsKt.getNotificationCategory(this.$notification)).m38572E(NotificationDataUtilsKt.getTitle(this.$notification, this.$context)).m38573D(content).m38567J(NotificationDataUtilsKt.getGroupKey(this.$notification)).m38561P(activeNotificationMessageCount).m38565L(bitmap).m38570G(NotificationDataUtilsKt.getDeletePendingIntent(this.$notification, this.$context)).m38574C(NotificationDataUtilsKt.getContentPendingIntent(this.$notification, this.$context, this.$notificationDataMap));
        C9677q.m14634f(C, "context.getNotificationB…xt, notificationDataMap))");
        Context context = this.$context;
        NotificationCompat.Builder builder = NotificationManagerUtilsKt.setLegacyNotificationBehaviors(C, context, this.$behaviors, NotificationDataUtilsKt.getSound(this.$notification, context)).m38536h();
        NotificationData notificationData = this.$notification;
        CharSequence charSequence = this.$currentUsername;
        Context context2 = this.$context;
        boolean z = this.$makeOrUpdateShortcut;
        Map<String, String> map = this.$notificationDataMap;
        if (NotificationDataUtilsKt.isConversation(notificationData)) {
            Person.C0998c cVar = new Person.C0998c();
            if (charSequence == null) {
                charSequence = I18nUtilsKt.i18nFormat$default(context2, I18nMessage.ME, null, 2, null);
            }
            NotificationCompat.MessagingStyle H = new NotificationCompat.MessagingStyle(cVar.m38385f(charSequence).m38386e("me").m38390a()).m38506G(NotificationDataUtilsKt.getConversationTitle(notificationData)).m38505H(NotificationDataUtilsKt.isGroupConversation(notificationData));
            Notification activeNotification = NotificationManagerUtilsKt.getActiveNotification(context2, NotificationDataUtilsKt.getTag(notificationData));
            if (!(activeNotification == null || (messagingStyle = NotificationManagerUtilsKt.getMessagingStyle(activeNotification)) == null || (B = messagingStyle.m38511B()) == null)) {
                for (NotificationCompat.MessagingStyle.C0977a aVar : B) {
                    H.m38504x(aVar);
                }
            }
            H.m38503y(content, NotificationDataUtilsKt.getSendTime(notificationData), NotificationDataUtilsKt.getSenderForMessageNotification(notificationData, bitmap2));
            builder.m38541e0(H);
            if (z) {
                C9677q.m14634f(builder, "builder");
                ShortcutUtilsKt.addShortcut(builder, context2, NotificationDataUtilsKt.getShortcutInfo(notificationData, context2, map, bitmap, bitmap2));
            }
        } else if (NotificationDataUtilsKt.shouldUseBigText(notificationData)) {
            builder.m38541e0(new NotificationCompat.C0983c().m38481x(content));
        }
        l = C9610j.m14817l(NotificationDataUtilsKt.getMarkAsReadAction(notificationData, context2), NotificationDataUtilsKt.getDirectReplyAction(notificationData, context2), NotificationDataUtilsKt.getCallAction(notificationData, context2, false, map), NotificationDataUtilsKt.getCallAction(notificationData, context2, true, map), NotificationDataUtilsKt.getTimedMuteAction(notificationData, context2, activeNotificationMessageCount));
        ArrayList arrayList = new ArrayList();
        for (NotificationCompat.Action action : l) {
            NotificationCompat.Builder b3 = builder.m38548b(action);
            if (b3 != null) {
                arrayList.add(b3);
            }
        }
        C9677q.m14634f(builder, "context.getNotificationB…n(action) }\n            }");
        NotificationManagerUtilsKt.notify(NotificationManagerUtilsKt.getNotificationManagerCompat(this.$context), NotificationDataUtilsKt.getTag(this.$notification), builder);
        return Unit.f25780a;
    }
}
