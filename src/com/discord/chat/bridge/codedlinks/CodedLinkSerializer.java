package com.discord.chat.bridge.codedlinks;

import kotlin.Metadata;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.AbstractC10272d;
import kotlinx.serialization.json.C10274f;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

@Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\t"}, m15073d2 = {"Lcom/discord/chat/bridge/codedlinks/CodedLinkSerializer;", "Lkotlinx/serialization/json/d;", "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "selectDeserializer", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class CodedLinkSerializer extends AbstractC10272d<CodedLinkEmbed> {
    public static final CodedLinkSerializer INSTANCE = new CodedLinkSerializer();

    private CodedLinkSerializer() {
        super(C9951f0.m14684b(CodedLinkEmbed.class));
    }

    @Override // kotlinx.serialization.json.AbstractC10272d
    protected DeserializationStrategy<CodedLinkEmbed> selectDeserializer(JsonElement element) {
        String str;
        JsonPrimitive k;
        C9971q.m14633g(element, "element");
        JsonElement jsonElement = (JsonElement) C10274f.m13719j(element).get("extendedType");
        if (jsonElement == null || (k = C10274f.m13718k(jsonElement)) == null) {
            str = null;
        } else {
            str = k.mo13692a();
        }
        if (C9971q.m14638b(str, String.valueOf(CodedLinkExtendedType.GUILD_SCHEDULED_EVENT.getSerialNumber()))) {
            return GuildEventInviteEmbedImpl.Companion.serializer();
        }
        if (C9971q.m14638b(str, String.valueOf(CodedLinkExtendedType.GUILD_INVITE_DISABLED.getSerialNumber()))) {
            return GuildInviteDisabledEmbedImpl.Companion.serializer();
        }
        if (C9971q.m14638b(str, String.valueOf(CodedLinkExtendedType.ACTIVITY_LAUNCHER.getSerialNumber()))) {
            return ActivityLauncherEmbedImpl.Companion.serializer();
        }
        if (C9971q.m14638b(str, String.valueOf(CodedLinkExtendedType.EMBEDDED_ACTIVITY_INVITE.getSerialNumber()))) {
            return EmbeddedActivityInviteEmbedImpl.Companion.serializer();
        }
        return GuildInviteEmbedImpl.Companion.serializer();
    }
}
