package com.discord.notifications.api;

import cj.n1;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import zi.f;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002+,BI\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB1\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\rJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J5\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J!\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*HÇ\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0014¨\u0006-"}, d2 = {"Lcom/discord/notifications/api/NotificationMessage;", "", "seen1", "", "stickerItems", "", "Lcom/discord/notifications/api/Sticker;", "author", "Lkotlinx/serialization/json/JsonObject;", "mentions", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/json/JsonObject;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Lkotlinx/serialization/json/JsonObject;Ljava/util/List;)V", "getAuthor$annotations", "()V", "getAuthor", "()Lkotlinx/serialization/json/JsonObject;", "getMentions$annotations", "getMentions", "()Ljava/util/List;", "sticker", "getSticker", "()Lcom/discord/notifications/api/Sticker;", "getStickerItems$annotations", "getStickerItems", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "notification_api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f

public final class NotificationMessage {
    public static final Companion Companion = new Companion(null);
    private final JsonObject author;
    private final List<JsonObject> mentions;
    private final List<Sticker> stickerItems;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/notifications/api/NotificationMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/notifications/api/NotificationMessage;", "notification_api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NotificationMessage> serializer() {
            return NotificationMessage$$serializer.INSTANCE;
        }
    }

    public NotificationMessage() {
        this((List) null, (JsonObject) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public  NotificationMessage(int i10, List list, JsonObject jsonObject, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        List<JsonObject> i11;
        if ((i10 & 0) != 0) {
            n1.b(i10, 0, NotificationMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.stickerItems = (i10 & 1) == 0 ? j.i() : list;
        if ((i10 & 2) == 0) {
            this.author = null;
        } else {
            this.author = jsonObject;
        }
        if ((i10 & 4) == 0) {
            i11 = j.i();
            this.mentions = i11;
            return;
        }
        this.mentions = list2;
    }

    
    public static  NotificationMessage copy$default(NotificationMessage notificationMessage, List list, JsonObject jsonObject, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = notificationMessage.stickerItems;
        }
        if ((i10 & 2) != 0) {
            jsonObject = notificationMessage.author;
        }
        if ((i10 & 4) != 0) {
            list2 = notificationMessage.mentions;
        }
        return notificationMessage.copy(list, jsonObject, list2);
    }

    public static  void getAuthor$annotations() {
    }

    public static  void getMentions$annotations() {
    }

    public static  void getStickerItems$annotations() {
    }

    
    
    
    
    
    
    
    public static final void write$Self(com.discord.notifications.api.NotificationMessage r5, kotlinx.serialization.encoding.CompositeEncoder r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.notifications.api.NotificationMessage.write$Self(com.discord.notifications.api.NotificationMessage, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final List<Sticker> component1() {
        return this.stickerItems;
    }

    public final JsonObject component2() {
        return this.author;
    }

    public final List<JsonObject> component3() {
        return this.mentions;
    }

    public final NotificationMessage copy(List<Sticker> stickerItems, JsonObject jsonObject, List<JsonObject> mentions) {
        q.h(stickerItems, "stickerItems");
        q.h(mentions, "mentions");
        return new NotificationMessage(stickerItems, jsonObject, mentions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationMessage)) {
            return false;
        }
        NotificationMessage notificationMessage = (NotificationMessage) obj;
        return q.c(this.stickerItems, notificationMessage.stickerItems) && q.c(this.author, notificationMessage.author) && q.c(this.mentions, notificationMessage.mentions);
    }

    public final JsonObject getAuthor() {
        return this.author;
    }

    public final List<JsonObject> getMentions() {
        return this.mentions;
    }

    public final Sticker getSticker() {
        Object V;
        V = r.V(this.stickerItems);
        return (Sticker) V;
    }

    public final List<Sticker> getStickerItems() {
        return this.stickerItems;
    }

    public int hashCode() {
        int hashCode = this.stickerItems.hashCode() * 31;
        JsonObject jsonObject = this.author;
        return ((hashCode + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31) + this.mentions.hashCode();
    }

    public String toString() {
        List<Sticker> list = this.stickerItems;
        JsonObject jsonObject = this.author;
        List<JsonObject> list2 = this.mentions;
        return "NotificationMessage(stickerItems=" + list + ", author=" + jsonObject + ", mentions=" + list2 + ")";
    }

    public NotificationMessage(List<Sticker> stickerItems, JsonObject jsonObject, List<JsonObject> mentions) {
        q.h(stickerItems, "stickerItems");
        q.h(mentions, "mentions");
        this.stickerItems = stickerItems;
        this.author = jsonObject;
        this.mentions = mentions;
    }

    public  NotificationMessage(List list, JsonObject jsonObject, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? j.i() : list, (i10 & 2) != 0 ? null : jsonObject, (i10 & 4) != 0 ? j.i() : list2);
    }
}
