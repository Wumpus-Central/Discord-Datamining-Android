package com.discord.sticker_picker;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u001bB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m15073d2 = {"Lcom/discord/sticker_picker/StickerPickerRow;", "", "rowContentWidth", "", "rowContentPaddingVertical", "itemSize", "items", "", "Lcom/discord/sticker_picker/StickerPickerRow$Sticker;", "(IIILjava/util/List;)V", "getItemSize", "()I", "getItems", "()Ljava/util/List;", "getRowContentPaddingVertical", "getRowContentWidth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "Sticker", "sticker_picker_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes7.dex */
public final class StickerPickerRow {
    private final int itemSize;
    private final List<Sticker> items;
    private final int rowContentPaddingVertical;
    private final int rowContentWidth;

    @Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001$B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006%"}, m15073d2 = {"Lcom/discord/sticker_picker/StickerPickerRow$Sticker;", "", "id", "", "name", "type", "Lcom/discord/sticker_picker/StickerPickerRow$Sticker$Type;", "animated", "", "url", "disabled", "opaque", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/sticker_picker/StickerPickerRow$Sticker$Type;ZLjava/lang/String;ZZ)V", "getAnimated", "()Z", "getDisabled", "getId", "()Ljava/lang/String;", "getName", "getOpaque", "getType", "()Lcom/discord/sticker_picker/StickerPickerRow$Sticker$Type;", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "Type", "sticker_picker_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes7.dex */
    public static final class Sticker {
        private final boolean animated;
        private final boolean disabled;

        /* renamed from: id */
        private final String f7534id;
        private final String name;
        private final boolean opaque;
        private final Type type;
        private final String url;

        @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m15073d2 = {"Lcom/discord/sticker_picker/StickerPickerRow$Sticker$Type;", "", "(Ljava/lang/String;I)V", "PNG", "APNG", "LOTTIE", "GIF", "sticker_picker_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* loaded from: classes7.dex */
        public enum Type {
            PNG,
            APNG,
            LOTTIE,
            GIF
        }

        public Sticker(String id2, String name, Type type, boolean z, String url, boolean z2, boolean z3) {
            C9971q.m14633g(id2, "id");
            C9971q.m14633g(name, "name");
            C9971q.m14633g(type, "type");
            C9971q.m14633g(url, "url");
            this.f7534id = id2;
            this.name = name;
            this.type = type;
            this.animated = z;
            this.url = url;
            this.disabled = z2;
            this.opaque = z3;
        }

        public static /* synthetic */ Sticker copy$default(Sticker sticker, String str, String str2, Type type, boolean z, String str3, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sticker.f7534id;
            }
            if ((i & 2) != 0) {
                str2 = sticker.name;
            }
            if ((i & 4) != 0) {
                type = sticker.type;
            }
            if ((i & 8) != 0) {
                z = sticker.animated;
            }
            if ((i & 16) != 0) {
                str3 = sticker.url;
            }
            if ((i & 32) != 0) {
                z2 = sticker.disabled;
            }
            if ((i & 64) != 0) {
                z3 = sticker.opaque;
            }
            return sticker.copy(str, str2, type, z, str3, z2, z3);
        }

        public final String component1() {
            return this.f7534id;
        }

        public final String component2() {
            return this.name;
        }

        public final Type component3() {
            return this.type;
        }

        public final boolean component4() {
            return this.animated;
        }

        public final String component5() {
            return this.url;
        }

        public final boolean component6() {
            return this.disabled;
        }

        public final boolean component7() {
            return this.opaque;
        }

        public final Sticker copy(String id2, String name, Type type, boolean z, String url, boolean z2, boolean z3) {
            C9971q.m14633g(id2, "id");
            C9971q.m14633g(name, "name");
            C9971q.m14633g(type, "type");
            C9971q.m14633g(url, "url");
            return new Sticker(id2, name, type, z, url, z2, z3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Sticker)) {
                return false;
            }
            Sticker sticker = (Sticker) obj;
            return C9971q.m14638b(this.f7534id, sticker.f7534id) && C9971q.m14638b(this.name, sticker.name) && this.type == sticker.type && this.animated == sticker.animated && C9971q.m14638b(this.url, sticker.url) && this.disabled == sticker.disabled && this.opaque == sticker.opaque;
        }

        public final boolean getAnimated() {
            return this.animated;
        }

        public final boolean getDisabled() {
            return this.disabled;
        }

        public final String getId() {
            return this.f7534id;
        }

        public final String getName() {
            return this.name;
        }

        public final boolean getOpaque() {
            return this.opaque;
        }

        public final Type getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int hashCode = ((((this.f7534id.hashCode() * 31) + this.name.hashCode()) * 31) + this.type.hashCode()) * 31;
            boolean z = this.animated;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int hashCode2 = (((hashCode + i2) * 31) + this.url.hashCode()) * 31;
            boolean z2 = this.disabled;
            if (z2) {
                z2 = true;
            }
            int i5 = z2 ? 1 : 0;
            int i6 = z2 ? 1 : 0;
            int i7 = z2 ? 1 : 0;
            int i8 = (hashCode2 + i5) * 31;
            boolean z3 = this.opaque;
            if (!z3) {
                i = z3 ? 1 : 0;
            }
            return i8 + i;
        }

        public String toString() {
            String str = this.f7534id;
            String str2 = this.name;
            Type type = this.type;
            boolean z = this.animated;
            String str3 = this.url;
            boolean z2 = this.disabled;
            boolean z3 = this.opaque;
            return "Sticker(id=" + str + ", name=" + str2 + ", type=" + type + ", animated=" + z + ", url=" + str3 + ", disabled=" + z2 + ", opaque=" + z3 + ")";
        }
    }

    public StickerPickerRow(int i, int i2, int i3, List<Sticker> items) {
        C9971q.m14633g(items, "items");
        this.rowContentWidth = i;
        this.rowContentPaddingVertical = i2;
        this.itemSize = i3;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StickerPickerRow copy$default(StickerPickerRow stickerPickerRow, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = stickerPickerRow.rowContentWidth;
        }
        if ((i4 & 2) != 0) {
            i2 = stickerPickerRow.rowContentPaddingVertical;
        }
        if ((i4 & 4) != 0) {
            i3 = stickerPickerRow.itemSize;
        }
        if ((i4 & 8) != 0) {
            list = stickerPickerRow.items;
        }
        return stickerPickerRow.copy(i, i2, i3, list);
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

    public final List<Sticker> component4() {
        return this.items;
    }

    public final StickerPickerRow copy(int i, int i2, int i3, List<Sticker> items) {
        C9971q.m14633g(items, "items");
        return new StickerPickerRow(i, i2, i3, items);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerPickerRow)) {
            return false;
        }
        StickerPickerRow stickerPickerRow = (StickerPickerRow) obj;
        return this.rowContentWidth == stickerPickerRow.rowContentWidth && this.rowContentPaddingVertical == stickerPickerRow.rowContentPaddingVertical && this.itemSize == stickerPickerRow.itemSize && C9971q.m14638b(this.items, stickerPickerRow.items);
    }

    public final int getItemSize() {
        return this.itemSize;
    }

    public final List<Sticker> getItems() {
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
        int i = this.rowContentWidth;
        int i2 = this.rowContentPaddingVertical;
        int i3 = this.itemSize;
        List<Sticker> list = this.items;
        return "StickerPickerRow(rowContentWidth=" + i + ", rowContentPaddingVertical=" + i2 + ", itemSize=" + i3 + ", items=" + list + ")";
    }
}
