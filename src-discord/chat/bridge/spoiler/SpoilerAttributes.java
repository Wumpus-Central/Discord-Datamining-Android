package com.discord.chat.bridge.spoiler;

import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.embed.Embed;
import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\u000f\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\nJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J4\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "", "identifier", "Lcom/discord/chat/bridge/spoiler/SpoilerIdentifier;", "label", "", "type", "Lcom/discord/chat/bridge/spoiler/SpoilerType;", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/spoiler/SpoilerType;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getIdentifier-Bq9X6Gg", "()Ljava/lang/String;", "Ljava/lang/String;", "getLabel", "getType", "()Lcom/discord/chat/bridge/spoiler/SpoilerType;", "component1", "component1-Bq9X6Gg", "component2", "component3", "configure", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "onTapSpoiler", "Lkotlin/Function0;", "", "copy", "copy-hoKre8U", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/spoiler/SpoilerType;)Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "equals", "", "other", "hasSpoilerConfig", "hashCode", "", "toString", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class SpoilerAttributes {
    public static final Companion Companion = new Companion(null);
    private final String identifier;
    private final String label;
    private final SpoilerType type;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ \u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ/\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/discord/chat/bridge/spoiler/SpoilerAttributes$Companion;", "", "()V", "forAttachment", "Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "attachment", "Lcom/discord/chat/bridge/attachment/Attachment;", "message", "Lcom/discord/chat/bridge/Message;", "index", "", "forEmbed", "embed", "Lcom/discord/chat/bridge/embed/Embed;", "forItem", "spoilerableData", "Lcom/discord/chat/bridge/spoiler/SpoilerableData;", "messageId", "Lcom/discord/primitives/MessageId;", "key", "", "forItem-A9xMOlw", "(Lcom/discord/chat/bridge/spoiler/SpoilerableData;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "forMediaPostPreviewEmbed", "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        
        private final SpoilerAttributes m129forItemA9xMOlw(SpoilerableData spoilerableData, String str, String str2) {
            String obscureOrNull = spoilerableData.getObscureOrNull();
            if (obscureOrNull != null) {
                String str3 = MessageId.m637toStringimpl(str);
                return new SpoilerAttributes(SpoilerIdentifier.m133constructorimpl("obscure:messageId" + str3 + ":" + str2), obscureOrNull, SpoilerType.OBSCURE, null);
            }
            String spoilerOrNull = spoilerableData.getSpoilerOrNull();
            if (spoilerOrNull == null) {
                return null;
            }
            String str4 = MessageId.m637toStringimpl(str);
            return new SpoilerAttributes(SpoilerIdentifier.m133constructorimpl("spoiler:messageId" + str4 + ":" + str2), spoilerOrNull, SpoilerType.SPOILER, null);
        }

        public final SpoilerAttributes forAttachment(Attachment attachment, Message message, int i10) {
            q.h(attachment, "attachment");
            q.h(message, "message");
            String str = message.m25getId3Eiw7ao();
            String indexLabel = attachment.type().getIndexLabel();
            return m129forItemA9xMOlw(attachment, str, indexLabel + i10);
        }

        public final SpoilerAttributes forEmbed(Embed embed, Message message, int i10) {
            q.h(embed, "embed");
            q.h(message, "message");
            String str = message.m25getId3Eiw7ao();
            return m129forItemA9xMOlw(embed, str, "embedIndex" + i10);
        }

        public final SpoilerAttributes forMediaPostPreviewEmbed(PostPreviewEmbed embed, Message message, int i10) {
            q.h(embed, "embed");
            q.h(message, "message");
            String str = message.m25getId3Eiw7ao();
            return m129forItemA9xMOlw(embed, str, "mediaPostPreviewEmbed" + i10);
        }
    }

    private SpoilerAttributes(String str, String str2, SpoilerType spoilerType) {
        this.identifier = str;
        this.label = str2;
        this.type = spoilerType;
    }

    public  SpoilerAttributes(String str, String str2, SpoilerType spoilerType, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, spoilerType);
    }

    
    public static  SpoilerConfig configure$default(SpoilerAttributes spoilerAttributes, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = SpoilerAttributes$configure$1.INSTANCE;
        }
        return spoilerAttributes.configure(function0);
    }

    
    public static  SpoilerAttributes m125copyhoKre8U$default(SpoilerAttributes spoilerAttributes, String str, String str2, SpoilerType spoilerType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = spoilerAttributes.identifier;
        }
        if ((i10 & 2) != 0) {
            str2 = spoilerAttributes.label;
        }
        if ((i10 & 4) != 0) {
            spoilerType = spoilerAttributes.type;
        }
        return spoilerAttributes.m127copyhoKre8U(str, str2, spoilerType);
    }

    private final boolean hasSpoilerConfig() {
        if (SpoilerManager.INSTANCE.m140isNotRevealedV2PEE7g(this.identifier) || this.type == SpoilerType.OBSCURE) {
            return true;
        }
        return false;
    }

    
    public final String m126component1Bq9X6Gg() {
        return this.identifier;
    }

    public final String component2() {
        return this.label;
    }

    public final SpoilerType component3() {
        return this.type;
    }

    public final SpoilerConfig configure(Function0<Unit> onTapSpoiler) {
        SpoilerAttributes spoilerAttributes;
        q.h(onTapSpoiler, "onTapSpoiler");
        if (hasSpoilerConfig()) {
            spoilerAttributes = this;
        } else {
            spoilerAttributes = null;
        }
        if (spoilerAttributes != null) {
            return new SpoilerConfig(spoilerAttributes, new SpoilerAttributes$configure$3$1(onTapSpoiler), new SpoilerAttributes$configure$3$2(onTapSpoiler));
        }
        return null;
    }

    
    public final SpoilerAttributes m127copyhoKre8U(String identifier, String label, SpoilerType type) {
        q.h(identifier, "identifier");
        q.h(label, "label");
        q.h(type, "type");
        return new SpoilerAttributes(identifier, label, type, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpoilerAttributes)) {
            return false;
        }
        SpoilerAttributes spoilerAttributes = (SpoilerAttributes) obj;
        return SpoilerIdentifier.m135equalsimpl0(this.identifier, spoilerAttributes.identifier) && q.c(this.label, spoilerAttributes.label) && this.type == spoilerAttributes.type;
    }

    
    public final String m128getIdentifierBq9X6Gg() {
        return this.identifier;
    }

    public final String getLabel() {
        return this.label;
    }

    public final SpoilerType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((SpoilerIdentifier.m136hashCodeimpl(this.identifier) * 31) + this.label.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        String str = SpoilerIdentifier.m137toStringimpl(this.identifier);
        String str2 = this.label;
        SpoilerType spoilerType = this.type;
        return "SpoilerAttributes(identifier=" + str + ", label=" + str2 + ", type=" + spoilerType + ")";
    }
}
