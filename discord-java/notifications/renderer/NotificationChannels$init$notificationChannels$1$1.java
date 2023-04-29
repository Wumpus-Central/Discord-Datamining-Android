package com.discord.notifications.renderer;

import android.content.Context;
import androidx.core.app.NotificationChannelCompat;
import com.discord.notifications.renderer.NotificationChannels;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "legacyChannel", "Landroidx/core/app/NotificationChannelCompat;", "builder", "Landroidx/core/app/NotificationChannelCompat$Builder;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationChannels$init$notificationChannels$1$1 extends s implements Function2<NotificationChannelCompat, NotificationChannelCompat.Builder, Unit> {
    final /* synthetic */ NotificationChannels.Category $category;
    final /* synthetic */ Context $context;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NotificationChannels.Category.values().length];
            try {
                iArr[NotificationChannels.Category.Calls.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationChannels.Category.MediaConnections.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationChannels$init$notificationChannels$1$1(NotificationChannels.Category category, Context context) {
        super(2);
        this.$category = category;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(NotificationChannelCompat notificationChannelCompat, NotificationChannelCompat.Builder builder) {
        invoke2(notificationChannelCompat, builder);
        return Unit.f22042a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(NotificationChannelCompat notificationChannelCompat, NotificationChannelCompat.Builder builder) {
        q.g(builder, "builder");
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.$category.ordinal()];
        if (i10 == 1) {
            NotificationChannels.INSTANCE.configureCallChannel(this.$context, notificationChannelCompat, builder);
        } else if (i10 == 2) {
            NotificationChannels.INSTANCE.configureMediaChannel(notificationChannelCompat, builder);
        }
    }
}