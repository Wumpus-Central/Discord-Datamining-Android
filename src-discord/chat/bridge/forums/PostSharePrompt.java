package com.discord.chat.bridge.forums;

import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ti.f;
import wi.n1;

@f
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()BK\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001J!\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÇ\u0001R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006*"}, d2 = {"Lcom/discord/chat/bridge/forums/PostSharePrompt;", "", "seen1", "", "title", "", "subtitle", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "cta", "icon", "closeIcon", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCloseIcon", "()Ljava/lang/String;", "getCta", "getIcon", "getSubtitle", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class PostSharePrompt {
    public static final Companion Companion = new Companion(null);
    private final String closeIcon;
    private final String cta;
    private final String icon;
    private final StructurableText subtitle;
    private final String title;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/forums/PostSharePrompt$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/forums/PostSharePrompt;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PostSharePrompt> serializer() {
            return PostSharePrompt$$serializer.INSTANCE;
        }
    }

    public  PostSharePrompt(int i10, String str, StructurableText structurableText, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i10 & 31)) {
            n1.b(i10, 31, PostSharePrompt$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = structurableText;
        this.cta = str2;
        this.icon = str3;
        this.closeIcon = str4;
    }

    public static  PostSharePrompt copy$default(PostSharePrompt postSharePrompt, String str, StructurableText structurableText, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = postSharePrompt.title;
        }
        if ((i10 & 2) != 0) {
            structurableText = postSharePrompt.subtitle;
        }
        if ((i10 & 4) != 0) {
            str2 = postSharePrompt.cta;
        }
        if ((i10 & 8) != 0) {
            str3 = postSharePrompt.icon;
        }
        if ((i10 & 16) != 0) {
            str4 = postSharePrompt.closeIcon;
        }
        return postSharePrompt.copy(str, structurableText, str2, str3, str4);
    }

    public static final void write$Self(PostSharePrompt self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        output.x(serialDesc, 0, self.title);
        output.o(serialDesc, 1, StructurableTextSerializer.INSTANCE, self.subtitle);
        output.x(serialDesc, 2, self.cta);
        output.x(serialDesc, 3, self.icon);
        output.x(serialDesc, 4, self.closeIcon);
    }

    public final String component1() {
        return this.title;
    }

    public final StructurableText component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.cta;
    }

    public final String component4() {
        return this.icon;
    }

    public final String component5() {
        return this.closeIcon;
    }

    public final PostSharePrompt copy(String title, StructurableText subtitle, String cta, String icon, String closeIcon) {
        q.h(title, "title");
        q.h(subtitle, "subtitle");
        q.h(cta, "cta");
        q.h(icon, "icon");
        q.h(closeIcon, "closeIcon");
        return new PostSharePrompt(title, subtitle, cta, icon, closeIcon);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostSharePrompt)) {
            return false;
        }
        PostSharePrompt postSharePrompt = (PostSharePrompt) obj;
        return q.c(this.title, postSharePrompt.title) && q.c(this.subtitle, postSharePrompt.subtitle) && q.c(this.cta, postSharePrompt.cta) && q.c(this.icon, postSharePrompt.icon) && q.c(this.closeIcon, postSharePrompt.closeIcon);
    }

    public final String getCloseIcon() {
        return this.closeIcon;
    }

    public final String getCta() {
        return this.cta;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final StructurableText getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.cta.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.closeIcon.hashCode();
    }

    public String toString() {
        String str = this.title;
        StructurableText structurableText = this.subtitle;
        String str2 = this.cta;
        String str3 = this.icon;
        String str4 = this.closeIcon;
        return "PostSharePrompt(title=" + str + ", subtitle=" + structurableText + ", cta=" + str2 + ", icon=" + str3 + ", closeIcon=" + str4 + ")";
    }

    public PostSharePrompt(String title, StructurableText subtitle, String cta, String icon, String closeIcon) {
        q.h(title, "title");
        q.h(subtitle, "subtitle");
        q.h(cta, "cta");
        q.h(icon, "icon");
        q.h(closeIcon, "closeIcon");
        this.title = title;
        this.subtitle = subtitle;
        this.cta = cta;
        this.icon = icon;
        this.closeIcon = closeIcon;
    }
}
