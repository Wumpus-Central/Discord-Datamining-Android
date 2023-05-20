package com.discord.chat.bridge.gift;

import com.discord.chat.bridge.gift.GiftEmbed;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.d;
import kotlinx.serialization.json.g;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\t"}, d2 = {"Lcom/discord/chat/bridge/gift/GiftEmbedSerializer;", "Lkotlinx/serialization/json/d;", "Lcom/discord/chat/bridge/gift/GiftEmbed;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "selectDeserializer", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class GiftEmbedSerializer extends d<GiftEmbed> {
    public static final GiftEmbedSerializer INSTANCE = new GiftEmbedSerializer();

    private GiftEmbedSerializer() {
        super(f0.b(GiftEmbed.class));
    }

    @Override // kotlinx.serialization.json.d
    protected DeserializationStrategy<GiftEmbed> selectDeserializer(JsonElement element) {
        q.g(element, "element");
        JsonObject m10 = g.m(element);
        if (GiftEmbedKt.access$hasPrimitives(m10, "resolvingGradientStart", "resolvingGradientEnd")) {
            return GiftEmbed.Resolving.Companion.serializer();
        }
        if (GiftEmbedKt.access$hasPrimitive(m10, "giftCode")) {
            return GiftEmbed.Resolved.Valid.Companion.serializer();
        }
        return GiftEmbed.Resolved.Invalid.Companion.serializer();
    }
}
