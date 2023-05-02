package com.discord.notifications.api;

import bj.n1;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import yi.f;

@f
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B+\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0019\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J!\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 HÇ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, d2 = {"Lcom/discord/notifications/api/NotificationMessage;", "", "seen1", "", "stickerItems", "", "Lcom/discord/notifications/api/Sticker;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "sticker", "getSticker", "()Lcom/discord/notifications/api/Sticker;", "getStickerItems$annotations", "()V", "getStickerItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "notification_api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NotificationMessage {
    public static final Companion Companion = new Companion(null);
    private final List<Sticker> stickerItems;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/notifications/api/NotificationMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/notifications/api/NotificationMessage;", "notification_api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NotificationMessage> serializer() {
            return NotificationMessage$$serializer.INSTANCE;
        }
    }

    public NotificationMessage() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ NotificationMessage(int i10, List list, SerializationConstructorMarker serializationConstructorMarker) {
        List<Sticker> i11;
        if ((i10 & 0) != 0) {
            n1.b(i10, 0, NotificationMessage$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            i11 = j.i();
            this.stickerItems = i11;
            return;
        }
        this.stickerItems = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationMessage copy$default(NotificationMessage notificationMessage, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = notificationMessage.stickerItems;
        }
        return notificationMessage.copy(list);
    }

    public static /* synthetic */ void getStickerItems$annotations() {
    }

    public static final void write$Self(NotificationMessage self, CompositeEncoder output, SerialDescriptor serialDesc) {
        List i10;
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        boolean z10 = true;
        if (!output.A(serialDesc, 0)) {
            List<Sticker> list = self.stickerItems;
            i10 = j.i();
            if (q.b(list, i10)) {
                z10 = false;
            }
        }
        if (z10) {
            output.t(serialDesc, 0, new bj.f(Sticker$$serializer.INSTANCE), self.stickerItems);
        }
    }

    public final List<Sticker> component1() {
        return this.stickerItems;
    }

    public final NotificationMessage copy(List<Sticker> stickerItems) {
        q.g(stickerItems, "stickerItems");
        return new NotificationMessage(stickerItems);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationMessage) && q.b(this.stickerItems, ((NotificationMessage) obj).stickerItems);
    }

    public final Sticker getSticker() {
        Object W;
        W = r.W(this.stickerItems);
        return (Sticker) W;
    }

    public final List<Sticker> getStickerItems() {
        return this.stickerItems;
    }

    public int hashCode() {
        return this.stickerItems.hashCode();
    }

    public String toString() {
        List<Sticker> list = this.stickerItems;
        return "NotificationMessage(stickerItems=" + list + ")";
    }

    public NotificationMessage(List<Sticker> stickerItems) {
        q.g(stickerItems, "stickerItems");
        this.stickerItems = stickerItems;
    }

    public /* synthetic */ NotificationMessage(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? j.i() : list);
    }
}
