package com.discord.chat.bridge.forums;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import vj.f;
import yj.n1;

@f
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002&'BK\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J!\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%HÇ\u0001R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006("}, d2 = {"Lcom/discord/chat/bridge/forums/PostSharePrompt;", "", "seen1", "", "title", "", "description", "cta", "icon", "closeIcon", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCloseIcon", "()Ljava/lang/String;", "getCta", "getDescription", "getIcon", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PostSharePrompt {
    public static final Companion Companion = new Companion(null);
    private final String closeIcon;
    private final String cta;
    private final String description;
    private final String icon;
    private final String title;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/forums/PostSharePrompt$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/forums/PostSharePrompt;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PostSharePrompt> serializer() {
            return PostSharePrompt$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PostSharePrompt(int i10, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i10 & 31)) {
            n1.b(i10, 31, PostSharePrompt$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.description = str2;
        this.cta = str3;
        this.icon = str4;
        this.closeIcon = str5;
    }

    public static /* synthetic */ PostSharePrompt copy$default(PostSharePrompt postSharePrompt, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = postSharePrompt.title;
        }
        if ((i10 & 2) != 0) {
            str2 = postSharePrompt.description;
        }
        if ((i10 & 4) != 0) {
            str3 = postSharePrompt.cta;
        }
        if ((i10 & 8) != 0) {
            str4 = postSharePrompt.icon;
        }
        if ((i10 & 16) != 0) {
            str5 = postSharePrompt.closeIcon;
        }
        return postSharePrompt.copy(str, str2, str3, str4, str5);
    }

    public static final void write$Self(PostSharePrompt self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.z(serialDesc, 0, self.title);
        output.z(serialDesc, 1, self.description);
        output.z(serialDesc, 2, self.cta);
        output.z(serialDesc, 3, self.icon);
        output.z(serialDesc, 4, self.closeIcon);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.description;
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

    public final PostSharePrompt copy(String title, String description, String cta, String icon, String closeIcon) {
        q.g(title, "title");
        q.g(description, "description");
        q.g(cta, "cta");
        q.g(icon, "icon");
        q.g(closeIcon, "closeIcon");
        return new PostSharePrompt(title, description, cta, icon, closeIcon);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostSharePrompt)) {
            return false;
        }
        PostSharePrompt postSharePrompt = (PostSharePrompt) obj;
        return q.b(this.title, postSharePrompt.title) && q.b(this.description, postSharePrompt.description) && q.b(this.cta, postSharePrompt.cta) && q.b(this.icon, postSharePrompt.icon) && q.b(this.closeIcon, postSharePrompt.closeIcon);
    }

    public final String getCloseIcon() {
        return this.closeIcon;
    }

    public final String getCta() {
        return this.cta;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.cta.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.closeIcon.hashCode();
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.cta;
        String str4 = this.icon;
        String str5 = this.closeIcon;
        return "PostSharePrompt(title=" + str + ", description=" + str2 + ", cta=" + str3 + ", icon=" + str4 + ", closeIcon=" + str5 + ")";
    }

    public PostSharePrompt(String title, String description, String cta, String icon, String closeIcon) {
        q.g(title, "title");
        q.g(description, "description");
        q.g(cta, "cta");
        q.g(icon, "icon");
        q.g(closeIcon, "closeIcon");
        this.title = title;
        this.description = description;
        this.cta = cta;
        this.icon = icon;
        this.closeIcon = closeIcon;
    }
}
