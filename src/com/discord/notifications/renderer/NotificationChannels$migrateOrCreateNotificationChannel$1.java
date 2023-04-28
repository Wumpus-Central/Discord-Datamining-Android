package com.discord.notifications.renderer;

import androidx.core.app.NotificationChannelCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m15073d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroidx/core/app/NotificationChannelCompat;", "<anonymous parameter 1>", "Landroidx/core/app/NotificationChannelCompat$Builder;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes3.dex */
final class NotificationChannels$migrateOrCreateNotificationChannel$1 extends AbstractC9973s implements Function2<NotificationChannelCompat, NotificationChannelCompat.Builder, Unit> {
    public static final NotificationChannels$migrateOrCreateNotificationChannel$1 INSTANCE = new NotificationChannels$migrateOrCreateNotificationChannel$1();

    NotificationChannels$migrateOrCreateNotificationChannel$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(NotificationChannelCompat notificationChannelCompat, NotificationChannelCompat.Builder builder) {
        invoke2(notificationChannelCompat, builder);
        return Unit.f22042a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(NotificationChannelCompat notificationChannelCompat, NotificationChannelCompat.Builder builder) {
        C9971q.m14633g(builder, "<anonymous parameter 1>");
    }
}
