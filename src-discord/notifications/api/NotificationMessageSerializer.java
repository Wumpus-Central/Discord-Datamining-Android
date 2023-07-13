package com.discord.notifications.api;

import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.l;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/discord/notifications/api/NotificationMessageSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/notifications/api/NotificationMessage;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "json", "Lkotlinx/serialization/json/Json;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "notification_api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class NotificationMessageSerializer implements KSerializer<NotificationMessage> {
    public static final NotificationMessageSerializer INSTANCE = new NotificationMessageSerializer();
    private static final Json json = l.b(null, NotificationMessageSerializer$json$1.INSTANCE, 1, null);

    private NotificationMessageSerializer() {
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return NotificationMessage.Companion.serializer().getDescriptor();
    }

    @Override 
    public NotificationMessage deserialize(Decoder decoder) {
        q.g(decoder, "decoder");
        return (NotificationMessage) json.b(NotificationMessage.Companion.serializer(), decoder.n());
    }

    public void serialize(Encoder encoder, NotificationMessage value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        throw new UnsupportedOperationException();
    }
}
