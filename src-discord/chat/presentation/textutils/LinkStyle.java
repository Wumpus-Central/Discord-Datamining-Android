package com.discord.chat.presentation.textutils;

import com.discord.fonts.DiscordFont;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/discord/chat/presentation/textutils/LinkStyle;", "", "font", "Lcom/discord/fonts/DiscordFont;", "linkColor", "", "(Lcom/discord/fonts/DiscordFont;I)V", "getFont", "()Lcom/discord/fonts/DiscordFont;", "getLinkColor", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LinkStyle {
    private final DiscordFont font;
    private final int linkColor;

    public LinkStyle() {
        this(null, 0, 3, null);
    }

    public LinkStyle(DiscordFont font, int i10) {
        q.g(font, "font");
        this.font = font;
        this.linkColor = i10;
    }

    public static /* synthetic */ LinkStyle copy$default(LinkStyle linkStyle, DiscordFont discordFont, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            discordFont = linkStyle.font;
        }
        if ((i11 & 2) != 0) {
            i10 = linkStyle.linkColor;
        }
        return linkStyle.copy(discordFont, i10);
    }

    public final DiscordFont component1() {
        return this.font;
    }

    public final int component2() {
        return this.linkColor;
    }

    public final LinkStyle copy(DiscordFont font, int i10) {
        q.g(font, "font");
        return new LinkStyle(font, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkStyle)) {
            return false;
        }
        LinkStyle linkStyle = (LinkStyle) obj;
        return this.font == linkStyle.font && this.linkColor == linkStyle.linkColor;
    }

    public final DiscordFont getFont() {
        return this.font;
    }

    public final int getLinkColor() {
        return this.linkColor;
    }

    public int hashCode() {
        return (this.font.hashCode() * 31) + this.linkColor;
    }

    public String toString() {
        DiscordFont discordFont = this.font;
        int i10 = this.linkColor;
        return "LinkStyle(font=" + discordFont + ", linkColor=" + i10 + ")";
    }

    public /* synthetic */ LinkStyle(DiscordFont discordFont, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? DiscordFont.PrimaryNormal : discordFont, (i11 & 2) != 0 ? ThemeManagerKt.getTheme().getTextLink() : i10);
    }
}
