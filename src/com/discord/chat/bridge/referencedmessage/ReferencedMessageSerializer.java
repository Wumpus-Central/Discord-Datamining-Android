package com.discord.chat.bridge.referencedmessage;

import kotlin.Metadata;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.AbstractC10272d;
import kotlinx.serialization.json.C10274f;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

@Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, m15073d2 = {"Lcom/discord/chat/bridge/referencedmessage/ReferencedMessageSerializer;", "Lkotlinx/serialization/json/d;", "Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "selectDeserializer", "", "STATE_LOADED", "Ljava/lang/String;", "STATE_SYSTEM", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ReferencedMessageSerializer extends AbstractC10272d<ReferencedMessage> {
    public static final ReferencedMessageSerializer INSTANCE = new ReferencedMessageSerializer();
    private static final String STATE_LOADED = "0";
    private static final String STATE_SYSTEM = "1";

    private ReferencedMessageSerializer() {
        super(C9951f0.m14684b(ReferencedMessage.class));
    }

    @Override // kotlinx.serialization.json.AbstractC10272d
    protected DeserializationStrategy<ReferencedMessage> selectDeserializer(JsonElement element) {
        String str;
        JsonPrimitive k;
        C9971q.m14633g(element, "element");
        JsonElement jsonElement = (JsonElement) C10274f.m13719j(element).get("state");
        if (jsonElement == null || (k = C10274f.m13718k(jsonElement)) == null) {
            str = null;
        } else {
            str = k.mo13692a();
        }
        if (C9971q.m14638b(str, STATE_LOADED)) {
            return LoadedReferencedMessage.Companion.serializer();
        }
        if (C9971q.m14638b(str, "1")) {
            return SystemReferencedMessage.Companion.serializer();
        }
        throw new IllegalArgumentException("unsupported state json: " + str);
    }
}
