package com.discord.sticker_picker;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u001bB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/discord/sticker_picker/StickerPickerRow;", "", "rowContentWidth", "", "rowContentPaddingVertical", "itemSize", "items", "", "Lcom/discord/sticker_picker/StickerPickerRow$Sticker;", "(IIILjava/util/List;)V", "getItemSize", "()I", "getItems", "()Ljava/util/List;", "getRowContentPaddingVertical", "getRowContentWidth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "Sticker", "sticker_picker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StickerPickerRow {
    private final int itemSize;
    private final List<Sticker> items;
    private final int rowContentPaddingVertical;
    private final int rowContentWidth;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001$B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006%"}, d2 = {"Lcom/discord/sticker_picker/StickerPickerRow$Sticker;", "", "id", "", ZeroconfModule.KEY_SERVICE_NAME, "type", "Lcom/discord/sticker_picker/StickerPickerRow$Sticker$Type;", "animated", "", "url", "disabled", "opaque", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/sticker_picker/StickerPickerRow$Sticker$Type;ZLjava/lang/String;ZZ)V", "getAnimated", "()Z", "getDisabled", "getId", "()Ljava/lang/String;", "getName", "getOpaque", "getType", "()Lcom/discord/sticker_picker/StickerPickerRow$Sticker$Type;", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "Type", "sticker_picker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Sticker {
        private final boolean animated;
        private final boolean disabled;

        /* renamed from: id  reason: collision with root package name */
        private final String f7950id;
        private final String name;
        private final boolean opaque;
        private final Type type;
        private final String url;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/discord/sticker_picker/StickerPickerRow$Sticker$Type;", "", "(Ljava/lang/String;I)V", "PNG", "APNG", "LOTTIE", "GIF", "sticker_picker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public enum Type {
            PNG,
            APNG,
            LOTTIE,
            GIF
        }

        public Sticker(String id2, String name, Type type, boolean z10, String url, boolean z11, boolean z12) {
            q.g(id2, "id");
            q.g(name, "name");
            q.g(type, "type");
            q.g(url, "url");
            this.f7950id = id2;
            this.name = name;
            this.type = type;
            this.animated = z10;
            this.url = url;
            this.disabled = z11;
            this.opaque = z12;
        }

        public static /* synthetic */ Sticker copy$default(Sticker sticker, String str, String str2, Type type, boolean z10, String str3, boolean z11, boolean z12, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = sticker.f7950id;
            }
            if ((i10 & 2) != 0) {
                str2 = sticker.name;
            }
            if ((i10 & 4) != 0) {
                type = sticker.type;
            }
            if ((i10 & 8) != 0) {
                z10 = sticker.animated;
            }
            if ((i10 & 16) != 0) {
                str3 = sticker.url;
            }
            if ((i10 & 32) != 0) {
                z11 = sticker.disabled;
            }
            if ((i10 & 64) != 0) {
                z12 = sticker.opaque;
            }
            return sticker.copy(str, str2, type, z10, str3, z11, z12);
        }

        public final String component1() {
            return this.f7950id;
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

        public final Sticker copy(String id2, String name, Type type, boolean z10, String url, boolean z11, boolean z12) {
            q.g(id2, "id");
            q.g(name, "name");
            q.g(type, "type");
            q.g(url, "url");
            return new Sticker(id2, name, type, z10, url, z11, z12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Sticker)) {
                return false;
            }
            Sticker sticker = (Sticker) obj;
            return q.b(this.f7950id, sticker.f7950id) && q.b(this.name, sticker.name) && this.type == sticker.type && this.animated == sticker.animated && q.b(this.url, sticker.url) && this.disabled == sticker.disabled && this.opaque == sticker.opaque;
        }

        public final boolean getAnimated() {
            return this.animated;
        }

        public final boolean getDisabled() {
            return this.disabled;
        }

        public final String getId() {
            return this.f7950id;
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
            int hashCode = ((((this.f7950id.hashCode() * 31) + this.name.hashCode()) * 31) + this.type.hashCode()) * 31;
            boolean z10 = this.animated;
            int i10 = 1;
            if (z10) {
                z10 = true;
            }
            int i11 = z10 ? 1 : 0;
            int i12 = z10 ? 1 : 0;
            int i13 = z10 ? 1 : 0;
            int hashCode2 = (((hashCode + i11) * 31) + this.url.hashCode()) * 31;
            boolean z11 = this.disabled;
            if (z11) {
                z11 = true;
            }
            int i14 = z11 ? 1 : 0;
            int i15 = z11 ? 1 : 0;
            int i16 = z11 ? 1 : 0;
            int i17 = (hashCode2 + i14) * 31;
            boolean z12 = this.opaque;
            if (!z12) {
                i10 = z12 ? 1 : 0;
            }
            return i17 + i10;
        }

        public String toString() {
            String str = this.f7950id;
            String str2 = this.name;
            Type type = this.type;
            boolean z10 = this.animated;
            String str3 = this.url;
            boolean z11 = this.disabled;
            boolean z12 = this.opaque;
            return "Sticker(id=" + str + ", name=" + str2 + ", type=" + type + ", animated=" + z10 + ", url=" + str3 + ", disabled=" + z11 + ", opaque=" + z12 + ")";
        }
    }

    public StickerPickerRow(int i10, int i11, int i12, List<Sticker> items) {
        q.g(items, "items");
        this.rowContentWidth = i10;
        this.rowContentPaddingVertical = i11;
        this.itemSize = i12;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StickerPickerRow copy$default(StickerPickerRow stickerPickerRow, int i10, int i11, int i12, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = stickerPickerRow.rowContentWidth;
        }
        if ((i13 & 2) != 0) {
            i11 = stickerPickerRow.rowContentPaddingVertical;
        }
        if ((i13 & 4) != 0) {
            i12 = stickerPickerRow.itemSize;
        }
        if ((i13 & 8) != 0) {
            list = stickerPickerRow.items;
        }
        return stickerPickerRow.copy(i10, i11, i12, list);
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

    public final StickerPickerRow copy(int i10, int i11, int i12, List<Sticker> items) {
        q.g(items, "items");
        return new StickerPickerRow(i10, i11, i12, items);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerPickerRow)) {
            return false;
        }
        StickerPickerRow stickerPickerRow = (StickerPickerRow) obj;
        return this.rowContentWidth == stickerPickerRow.rowContentWidth && this.rowContentPaddingVertical == stickerPickerRow.rowContentPaddingVertical && this.itemSize == stickerPickerRow.itemSize && q.b(this.items, stickerPickerRow.items);
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
        int i10 = this.rowContentWidth;
        int i11 = this.rowContentPaddingVertical;
        int i12 = this.itemSize;
        List<Sticker> list = this.items;
        return "StickerPickerRow(rowContentWidth=" + i10 + ", rowContentPaddingVertical=" + i11 + ", itemSize=" + i12 + ", items=" + list + ")";
    }
}
