package com.discord.chat.bridge.structurabletext;

import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.d;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\t"}, d2 = {"Lcom/discord/chat/bridge/structurabletext/StructurableTextSerializer;", "Lkotlinx/serialization/json/d;", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "selectDeserializer", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class StructurableTextSerializer extends d<StructurableText> {
    public static final StructurableTextSerializer INSTANCE = new StructurableTextSerializer();

    private StructurableTextSerializer() {
        super(f0.b(StructurableText.class));
    }

    @Override // kotlinx.serialization.json.d
    protected DeserializationStrategy<StructurableText> selectDeserializer(JsonElement element) {
        q.g(element, "element");
        if (element instanceof JsonPrimitive) {
            return PrimitiveStructurableTextSerializer.INSTANCE;
        }
        if (element instanceof JsonArray) {
            return AnnotatedStructurableTextSerializer.INSTANCE;
        }
        throw new IllegalArgumentException("unable to find serializer for json: " + element);
    }
}
