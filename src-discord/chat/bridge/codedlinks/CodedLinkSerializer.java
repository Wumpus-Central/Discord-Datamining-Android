package com.discord.chat.bridge.codedlinks;

import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.d;
import kotlinx.serialization.json.f;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\t"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/CodedLinkSerializer;", "Lkotlinx/serialization/json/d;", "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "selectDeserializer", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class CodedLinkSerializer extends d<CodedLinkEmbed> {
    public static final CodedLinkSerializer INSTANCE = new CodedLinkSerializer();

    private CodedLinkSerializer() {
        super(f0.b(CodedLinkEmbed.class));
    }

    @Override // kotlinx.serialization.json.d
    protected DeserializationStrategy<CodedLinkEmbed> selectDeserializer(JsonElement element) {
        String str;
        JsonPrimitive m10;
        q.g(element, "element");
        JsonElement jsonElement = (JsonElement) f.l(element).get("extendedType");
        if (jsonElement == null || (m10 = f.m(jsonElement)) == null) {
            str = null;
        } else {
            str = m10.a();
        }
        if (q.b(str, String.valueOf(CodedLinkExtendedType.GUILD_SCHEDULED_EVENT.getSerialNumber()))) {
            return GuildEventInviteEmbedImpl.Companion.serializer();
        }
        if (q.b(str, String.valueOf(CodedLinkExtendedType.GUILD_INVITE_DISABLED.getSerialNumber()))) {
            return GuildInviteDisabledEmbedImpl.Companion.serializer();
        }
        if (q.b(str, String.valueOf(CodedLinkExtendedType.ACTIVITY_LAUNCHER.getSerialNumber()))) {
            return ActivityLauncherEmbedImpl.Companion.serializer();
        }
        if (q.b(str, String.valueOf(CodedLinkExtendedType.EMBEDDED_ACTIVITY_INVITE.getSerialNumber()))) {
            return EmbeddedActivityInviteEmbedImpl.Companion.serializer();
        }
        return GuildInviteEmbedImpl.Companion.serializer();
    }
}
