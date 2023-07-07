package com.discord.notifications.renderer;

import androidx.core.app.NotificationChannelCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroidx/core/app/NotificationChannelCompat;", "<anonymous parameter 1>", "Landroidx/core/app/NotificationChannelCompat$Builder;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class NotificationChannels$migrateOrCreateNotificationChannel$1 extends s implements Function2<NotificationChannelCompat, NotificationChannelCompat.Builder, Unit> {
    public static final NotificationChannels$migrateOrCreateNotificationChannel$1 INSTANCE = new NotificationChannels$migrateOrCreateNotificationChannel$1();

    NotificationChannels$migrateOrCreateNotificationChannel$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(NotificationChannelCompat notificationChannelCompat, NotificationChannelCompat.Builder builder) {
        invoke2(notificationChannelCompat, builder);
        return Unit.f20717a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(NotificationChannelCompat notificationChannelCompat, NotificationChannelCompat.Builder builder) {
        q.g(builder, "<anonymous parameter 1>");
    }
}
