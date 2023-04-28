package com.discord.chat.bridge.contentnode;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.AbstractC10273e;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import p014aj.AbstractC1413e;
import p014aj.C1427g;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m15073d2 = {"Lcom/discord/chat/bridge/contentnode/ContentNodeSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class ContentNodeSerializer implements KSerializer<ContentNode> {
    public static final ContentNodeSerializer INSTANCE = new ContentNodeSerializer();

    private ContentNodeSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return C1427g.m41131a("ContentNode", AbstractC1413e.C1421i.f471a);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ContentNode deserialize(Decoder decoder) {
        C9971q.m14633g(decoder, "decoder");
        try {
            if (decoder instanceof AbstractC10273e) {
                JsonElement g = ((AbstractC10273e) decoder).mo13729g();
                if (g instanceof JsonPrimitive) {
                    return new TextContentNode(((JsonPrimitive) g).mo13692a());
                }
                return (ContentNode) ((AbstractC10273e) decoder).mo13730d().m13766d(ContentNodeKt.access$getSealedClassSerializer$p(), g);
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } catch (Exception e) {
            return new ErrorContentNode(e);
        }
    }

    public void serialize(Encoder encoder, ContentNode value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        throw new UnsupportedOperationException();
    }
}
