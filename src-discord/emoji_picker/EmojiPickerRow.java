package com.discord.emoji_picker;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u001bB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerRow;", "", "rowContentWidth", "", "rowContentPaddingVertical", "itemSize", "items", "", "Lcom/discord/emoji_picker/EmojiPickerRow$Emoji;", "(IIILjava/util/List;)V", "getItemSize", "()I", "getItems", "()Ljava/util/List;", "getRowContentPaddingVertical", "getRowContentWidth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "Emoji", "emoji_picker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EmojiPickerRow {
    private final int itemSize;
    private final List<Emoji> items;
    private final int rowContentPaddingVertical;
    private final int rowContentWidth;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerRow$Emoji;", "", "id", "", "name", "url", "disabled", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDisabled", "()Z", "getId", "()Ljava/lang/String;", "getName", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "emoji_picker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Emoji {
        private final boolean disabled;

        /* renamed from: id  reason: collision with root package name */
        private final String f7435id;
        private final String name;
        private final String url;

        public Emoji(String str, String name, String url, boolean z10) {
            q.g(name, "name");
            q.g(url, "url");
            this.f7435id = str;
            this.name = name;
            this.url = url;
            this.disabled = z10;
        }

        public static /* synthetic */ Emoji copy$default(Emoji emoji, String str, String str2, String str3, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = emoji.f7435id;
            }
            if ((i10 & 2) != 0) {
                str2 = emoji.name;
            }
            if ((i10 & 4) != 0) {
                str3 = emoji.url;
            }
            if ((i10 & 8) != 0) {
                z10 = emoji.disabled;
            }
            return emoji.copy(str, str2, str3, z10);
        }

        public final String component1() {
            return this.f7435id;
        }

        public final String component2() {
            return this.name;
        }

        public final String component3() {
            return this.url;
        }

        public final boolean component4() {
            return this.disabled;
        }

        public final Emoji copy(String str, String name, String url, boolean z10) {
            q.g(name, "name");
            q.g(url, "url");
            return new Emoji(str, name, url, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Emoji)) {
                return false;
            }
            Emoji emoji = (Emoji) obj;
            return q.b(this.f7435id, emoji.f7435id) && q.b(this.name, emoji.name) && q.b(this.url, emoji.url) && this.disabled == emoji.disabled;
        }

        public final boolean getDisabled() {
            return this.disabled;
        }

        public final String getId() {
            return this.f7435id;
        }

        public final String getName() {
            return this.name;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.f7435id;
            int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.name.hashCode()) * 31) + this.url.hashCode()) * 31;
            boolean z10 = this.disabled;
            if (z10) {
                z10 = true;
            }
            int i10 = z10 ? 1 : 0;
            int i11 = z10 ? 1 : 0;
            int i12 = z10 ? 1 : 0;
            return hashCode + i10;
        }

        public String toString() {
            String str = this.f7435id;
            String str2 = this.name;
            String str3 = this.url;
            boolean z10 = this.disabled;
            return "Emoji(id=" + str + ", name=" + str2 + ", url=" + str3 + ", disabled=" + z10 + ")";
        }
    }

    public EmojiPickerRow(int i10, int i11, int i12, List<Emoji> items) {
        q.g(items, "items");
        this.rowContentWidth = i10;
        this.rowContentPaddingVertical = i11;
        this.itemSize = i12;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmojiPickerRow copy$default(EmojiPickerRow emojiPickerRow, int i10, int i11, int i12, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = emojiPickerRow.rowContentWidth;
        }
        if ((i13 & 2) != 0) {
            i11 = emojiPickerRow.rowContentPaddingVertical;
        }
        if ((i13 & 4) != 0) {
            i12 = emojiPickerRow.itemSize;
        }
        if ((i13 & 8) != 0) {
            list = emojiPickerRow.items;
        }
        return emojiPickerRow.copy(i10, i11, i12, list);
    }

    public final int component1() {
        return this.rowContentWidth;
    }

    public final int component2() {
        return this.rowContentPaddingVertical;
    }

    public final int component3() {
        return this.itemSize;
    }

    public final List<Emoji> component4() {
        return this.items;
    }

    public final EmojiPickerRow copy(int i10, int i11, int i12, List<Emoji> items) {
        q.g(items, "items");
        return new EmojiPickerRow(i10, i11, i12, items);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmojiPickerRow)) {
            return false;
        }
        EmojiPickerRow emojiPickerRow = (EmojiPickerRow) obj;
        return this.rowContentWidth == emojiPickerRow.rowContentWidth && this.rowContentPaddingVertical == emojiPickerRow.rowContentPaddingVertical && this.itemSize == emojiPickerRow.itemSize && q.b(this.items, emojiPickerRow.items);
    }

    public final int getItemSize() {
        return this.itemSize;
    }

    public final List<Emoji> getItems() {
        return this.items;
    }

    public final int getRowContentPaddingVertical() {
        return this.rowContentPaddingVertical;
    }

    public final int getRowContentWidth() {
        return this.rowContentWidth;
    }

    public int hashCode() {
        return (((((this.rowContentWidth * 31) + this.rowContentPaddingVertical) * 31) + this.itemSize) * 31) + this.items.hashCode();
    }

    public String toString() {
        int i10 = this.rowContentWidth;
        int i11 = this.rowContentPaddingVertical;
        int i12 = this.itemSize;
        List<Emoji> list = this.items;
        return "EmojiPickerRow(rowContentWidth=" + i10 + ", rowContentPaddingVertical=" + i11 + ", itemSize=" + i12 + ", items=" + list + ")";
    }
}
