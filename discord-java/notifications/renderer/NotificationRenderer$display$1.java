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
import kotlin.collections.j;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.f;
import kotlinx.coroutines.l;
import kotlinx.coroutines.q0;
import nf.t;
import tf.d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.notifications.renderer.NotificationRenderer$display$1", f = "NotificationRenderer.kt", l = {134}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class NotificationRenderer$display$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/graphics/Bitmap;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.discord.notifications.renderer.NotificationRenderer$display$1$1", f = "NotificationRenderer.kt", l = {135}, m = "invokeSuspend")
    /* renamed from: com.discord.notifications.renderer.NotificationRenderer$display$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Ref$ObjectRef<String> $iconUrl;
        final /* synthetic */ Ref$ObjectRef<PostProcessor> $postProcessor;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref$ObjectRef<String> ref$ObjectRef, Context context, Ref$ObjectRef<PostProcessor> ref$ObjectRef2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$iconUrl = ref$ObjectRef;
            this.$context = context;
            this.$postProcessor = ref$ObjectRef2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$iconUrl, this.$context, this.$postProcessor, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22034a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = d.d();
            int i10 = this.label;
            if (i10 == 0) {
                t.b(obj);
                this.label = 1;
                obj = NotificationRenderer$display$1.invokeSuspend$fetchImage(this.$context, this.$postProcessor, this.$iconUrl.f22061k, this);
                if (obj == d10) {
                    return d10;
                }
            } else if (i10 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/graphics/Bitmap;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.discord.notifications.renderer.NotificationRenderer$display$1$2", f = "NotificationRenderer.kt", l = {136}, m = "invokeSuspend")
    /* renamed from: com.discord.notifications.renderer.NotificationRenderer$display$1$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ NotificationData $notification;
        final /* synthetic */ Ref$ObjectRef<PostProcessor> $postProcessor;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(NotificationData notificationData, Context context, Ref$ObjectRef<PostProcessor> ref$ObjectRef, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$notification = notificationData;
            this.$context = context;
            this.$postProcessor = ref$ObjectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$notification, this.$context, this.$postProcessor, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f22034a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = d.d();
            int i10 = this.label;
            if (i10 == 0) {
                t.b(obj);
                Context context = this.$context;
                Ref$ObjectRef<PostProcessor> ref$ObjectRef = this.$postProcessor;
                String iconUrlForAvatar = NotificationDataUtilsKt.getIconUrlForAvatar(this.$notification, context);
                this.label = 1;
                obj = NotificationRenderer$display$1.invokeSuspend$fetchImage(context, ref$ObjectRef, iconUrlForAvatar, this);
                if (obj == d10) {
                    return d10;
                }
            } else if (i10 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationRenderer$display$1(NotificationData notificationData, Context context, boolean z10, Map<String, String> map, NotificationBehaviors notificationBehaviors, String str, boolean z11, Continuation<? super NotificationRenderer$display$1> continuation) {
        super(2, continuation);
        this.$notification = notificationData;
        this.$context = context;
        this.$notifyEveryTime = z10;
        this.$notificationDataMap = map;
        this.$behaviors = notificationBehaviors;
        this.$currentUsername = str;
        this.$makeOrUpdateShortcut = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invokeSuspend$fetchImage(Context context, Ref$ObjectRef<PostProcessor> ref$ObjectRef, String str, Continuation<? super Bitmap> continuation) {
        return FrescoFetchDecodedImageKt.fetchDecodedImage(context, str, ref$ObjectRef.f22061k, true, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NotificationRenderer$display$1 notificationRenderer$display$1 = new NotificationRenderer$display$1(this.$notification, this.$context, this.$notifyEveryTime, this.$notificationDataMap, this.$behaviors, this.$currentUsername, this.$makeOrUpdateShortcut, continuation);
        notificationRenderer$display$1.L$0 = obj;
        return notificationRenderer$display$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotificationRenderer$display$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22034a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.discord.image.fresco.postprocessors.PostProcessor$Circle, T] */
    /* JADX WARN: Type inference failed for: r8v5, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        Object obj2;
        List<NotificationCompat.Action> l10;
        NotificationCompat.MessagingStyle messagingStyle;
        List<NotificationCompat.MessagingStyle.a> B;
        q0 b10;
        q0 b11;
        d10 = d.d();
        int i10 = this.label;
        if (i10 == 0) {
            t.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.f22061k = PostProcessor.Circle.INSTANCE;
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.f22061k = NotificationDataUtilsKt.getIconUrl(this.$notification, this.$context);
            if (this.$notification.getImageAttachmentUrl() != null) {
                String imageAttachmentUrl = this.$notification.getImageAttachmentUrl();
                T t10 = imageAttachmentUrl;
                if (imageAttachmentUrl == null) {
                    t10 = "";
                }
                ref$ObjectRef2.f22061k = t10;
                ref$ObjectRef.f22061k = null;
            }
            b10 = l.b(coroutineScope, null, null, new AnonymousClass1(ref$ObjectRef2, this.$context, ref$ObjectRef, null), 3, null);
            b11 = l.b(coroutineScope, null, null, new AnonymousClass2(this.$notification, this.$context, ref$ObjectRef, null), 3, null);
            this.label = 1;
            obj2 = f.a(new q0[]{b10, b11}, this);
            if (obj2 == d10) {
                return d10;
            }
        } else if (i10 == 1) {
            t.b(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list = (List) obj2;
        Bitmap bitmap = (Bitmap) list.get(0);
        Bitmap bitmap2 = (Bitmap) list.get(1);
        CharSequence content = NotificationDataUtilsKt.getContent(this.$notification, this.$context);
        int activeNotificationMessageCount = NotificationManagerUtilsKt.getActiveNotificationMessageCount(this.$context, NotificationDataUtilsKt.getTag(this.$notification)) + 1;
        NotificationCompat.Builder C = NotificationManagerUtilsKt.getNotificationBuilderOrCreate(this.$context, NotificationChannels.INSTANCE.getNotificationChannelId(this.$notification), NotificationManagerUtilsKt.getActiveNotification(this.$context, NotificationDataUtilsKt.getTag(this.$notification))).t(true).R(!this.$notifyEveryTime).Z(NotificationDataUtilsKt.getSmallIcon(this.$notification)).z(ColorUtilsKt.getColorCompat(this.$context, R.color.brand_500)).w(NotificationDataUtilsKt.getNotificationCategory(this.$notification)).E(NotificationDataUtilsKt.getTitle(this.$notification, this.$context)).D(content).J(NotificationDataUtilsKt.getGroupKey(this.$notification)).P(activeNotificationMessageCount).L(bitmap).G(NotificationDataUtilsKt.getDeletePendingIntent(this.$notification, this.$context)).C(NotificationDataUtilsKt.getContentPendingIntent(this.$notification, this.$context, this.$notificationDataMap));
        q.f(C, "context.getNotificationB…xt, notificationDataMap))");
        Context context = this.$context;
        NotificationCompat.Builder builder = NotificationManagerUtilsKt.setLegacyNotificationBehaviors(C, context, this.$behaviors, NotificationDataUtilsKt.getSound(this.$notification, context)).h();
        NotificationData notificationData = this.$notification;
        CharSequence charSequence = this.$currentUsername;
        Context context2 = this.$context;
        boolean z10 = this.$makeOrUpdateShortcut;
        Map<String, String> map = this.$notificationDataMap;
        if (NotificationDataUtilsKt.isConversation(notificationData)) {
            Person.c cVar = new Person.c();
            if (charSequence == null) {
                charSequence = I18nUtilsKt.i18nFormat$default(context2, I18nMessage.ME, null, 2, null);
            }
            NotificationCompat.MessagingStyle H = new NotificationCompat.MessagingStyle(cVar.f(charSequence).e("me").a()).G(NotificationDataUtilsKt.getConversationTitle(notificationData)).H(NotificationDataUtilsKt.isGroupConversation(notificationData));
            Notification activeNotification = NotificationManagerUtilsKt.getActiveNotification(context2, NotificationDataUtilsKt.getTag(notificationData));
            if (!(activeNotification == null || (messagingStyle = NotificationManagerUtilsKt.getMessagingStyle(activeNotification)) == null || (B = messagingStyle.B()) == null)) {
                for (NotificationCompat.MessagingStyle.a aVar : B) {
                    H.x(aVar);
                }
            }
            H.y(content, NotificationDataUtilsKt.getSendTime(notificationData), NotificationDataUtilsKt.getSenderForMessageNotification(notificationData, bitmap2));
            builder.e0(H);
            if (z10) {
                q.f(builder, "builder");
                ShortcutUtilsKt.addShortcut(builder, context2, NotificationDataUtilsKt.getShortcutInfo(notificationData, context2, map, bitmap, bitmap2));
            }
        } else if (NotificationDataUtilsKt.shouldUseBigText(notificationData)) {
            builder.e0(new NotificationCompat.c().x(content));
        }
        l10 = j.l(NotificationDataUtilsKt.getMarkAsReadAction(notificationData, context2), NotificationDataUtilsKt.getDirectReplyAction(notificationData, context2), NotificationDataUtilsKt.getCallAction(notificationData, context2, false, map), NotificationDataUtilsKt.getCallAction(notificationData, context2, true, map), NotificationDataUtilsKt.getTimedMuteAction(notificationData, context2, activeNotificationMessageCount));
        ArrayList arrayList = new ArrayList();
        for (NotificationCompat.Action action : l10) {
            NotificationCompat.Builder b12 = builder.b(action);
            if (b12 != null) {
                arrayList.add(b12);
            }
        }
        q.f(builder, "context.getNotificationB…n(action) }\n            }");
        NotificationManagerUtilsKt.notify(NotificationManagerUtilsKt.getNotificationManagerCompat(this.$context), NotificationDataUtilsKt.getTag(this.$notification), builder);
        return Unit.f22034a;
    }
}
