package com.discord.chat.reactevents;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import nf.C11098x;

@Metadata(m15074d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001*B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJN\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\b\u0010'\u001a\u00020(H\u0016J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011¨\u0006+"}, m15073d2 = {"Lcom/discord/chat/reactevents/TapImageData;", "Lcom/discord/reactevents/ReactEvent;", "id", "", "index", "", "type", "layout", "Lcom/discord/chat/reactevents/TapImageData$Layout;", "portal", "", "embedIndex", "(Ljava/lang/String;ILjava/lang/String;Lcom/discord/chat/reactevents/TapImageData$Layout;Ljava/lang/Double;Ljava/lang/Integer;)V", "getEmbedIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "()Ljava/lang/String;", "getIndex", "()I", "getLayout", "()Lcom/discord/chat/reactevents/TapImageData$Layout;", "getPortal", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;ILjava/lang/String;Lcom/discord/chat/reactevents/TapImageData$Layout;Ljava/lang/Double;Ljava/lang/Integer;)Lcom/discord/chat/reactevents/TapImageData;", "equals", "", "other", "", "hashCode", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "Layout", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class TapImageData implements ReactEvent {
    private final Integer embedIndex;

    /* renamed from: id */
    private final String f7427id;
    private final int index;
    private final Layout layout;
    private final Double portal;
    private final String type;

    @Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001f"}, m15073d2 = {"Lcom/discord/chat/reactevents/TapImageData$Layout;", "", "width", "", "height", "x", "y", ViewProps.RESIZE_MODE, "Lcom/discord/chat/reactevents/ViewResizeMode;", "(IIIILcom/discord/chat/reactevents/ViewResizeMode;)V", "getHeight", "()I", "getResizeMode", "()Lcom/discord/chat/reactevents/ViewResizeMode;", "getWidth", "getX", "getY", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Layout {
        private final int height;
        private final ViewResizeMode resizeMode;
        private final int width;

        /* renamed from: x */
        private final int f7428x;

        /* renamed from: y */
        private final int f7429y;

        public Layout(int i, int i2, int i3, int i4, ViewResizeMode resizeMode) {
            C9971q.m14633g(resizeMode, "resizeMode");
            this.width = i;
            this.height = i2;
            this.f7428x = i3;
            this.f7429y = i4;
            this.resizeMode = resizeMode;
        }

        public static /* synthetic */ Layout copy$default(Layout layout, int i, int i2, int i3, int i4, ViewResizeMode viewResizeMode, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = layout.width;
            }
            if ((i5 & 2) != 0) {
                i2 = layout.height;
            }
            if ((i5 & 4) != 0) {
                i3 = layout.f7428x;
            }
            if ((i5 & 8) != 0) {
                i4 = layout.f7429y;
            }
            if ((i5 & 16) != 0) {
                viewResizeMode = layout.resizeMode;
            }
            return layout.copy(i, i2, i3, i4, viewResizeMode);
        }

        public final int component1() {
            return this.width;
        }

        public final int component2() {
            return this.height;
        }

        public final int component3() {
            return this.f7428x;
        }

        public final int component4() {
            return this.f7429y;
        }

        public final ViewResizeMode component5() {
            return this.resizeMode;
        }

        public final Layout copy(int i, int i2, int i3, int i4, ViewResizeMode resizeMode) {
            C9971q.m14633g(resizeMode, "resizeMode");
            return new Layout(i, i2, i3, i4, resizeMode);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Layout)) {
                return false;
            }
            Layout layout = (Layout) obj;
            return this.width == layout.width && this.height == layout.height && this.f7428x == layout.f7428x && this.f7429y == layout.f7429y && this.resizeMode == layout.resizeMode;
        }

        public final int getHeight() {
            return this.height;
        }

        public final ViewResizeMode getResizeMode() {
            return this.resizeMode;
        }

        public final int getWidth() {
            return this.width;
        }

        public final int getX() {
            return this.f7428x;
        }

        public final int getY() {
            return this.f7429y;
        }

        public int hashCode() {
            return (((((((this.width * 31) + this.height) * 31) + this.f7428x) * 31) + this.f7429y) * 31) + this.resizeMode.hashCode();
        }

        public final WritableMap serialize() {
            return NativeMapExtensionsKt.nativeMapOf(C11098x.m10921a("width", Integer.valueOf(this.width)), C11098x.m10921a("height", Integer.valueOf(this.height)), C11098x.m10921a("x", Integer.valueOf(this.f7428x)), C11098x.m10921a("y", Integer.valueOf(this.f7429y)), C11098x.m10921a(ViewProps.RESIZE_MODE, this.resizeMode.getValue()));
        }

        public String toString() {
            int i = this.width;
            int i2 = this.height;
            int i3 = this.f7428x;
            int i4 = this.f7429y;
            ViewResizeMode viewResizeMode = this.resizeMode;
            return "Layout(width=" + i + ", height=" + i2 + ", x=" + i3 + ", y=" + i4 + ", resizeMode=" + viewResizeMode + ")";
        }
    }

    public TapImageData(String id2, int i, String type, Layout layout, Double d, Integer num) {
        C9971q.m14633g(id2, "id");
        C9971q.m14633g(type, "type");
        C9971q.m14633g(layout, "layout");
        this.f7427id = id2;
        this.index = i;
        this.type = type;
        this.layout = layout;
        this.portal = d;
        this.embedIndex = num;
    }

    public static /* synthetic */ TapImageData copy$default(TapImageData tapImageData, String str, int i, String str2, Layout layout, Double d, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tapImageData.f7427id;
        }
        if ((i2 & 2) != 0) {
            i = tapImageData.index;
        }
        if ((i2 & 4) != 0) {
            str2 = tapImageData.type;
        }
        if ((i2 & 8) != 0) {
            layout = tapImageData.layout;
        }
        if ((i2 & 16) != 0) {
            d = tapImageData.portal;
        }
        if ((i2 & 32) != 0) {
            num = tapImageData.embedIndex;
        }
        return tapImageData.copy(str, i, str2, layout, d, num);
    }

    public final String component1() {
        return this.f7427id;
    }

    public final int component2() {
        return this.index;
    }

    public final String component3() {
        return this.type;
    }

    public final Layout component4() {
        return this.layout;
    }

    public final Double component5() {
        return this.portal;
    }

    public final Integer component6() {
        return this.embedIndex;
    }

    public final TapImageData copy(String id2, int i, String type, Layout layout, Double d, Integer num) {
        C9971q.m14633g(id2, "id");
        C9971q.m14633g(type, "type");
        C9971q.m14633g(layout, "layout");
        return new TapImageData(id2, i, type, layout, d, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapImageData)) {
            return false;
        }
        TapImageData tapImageData = (TapImageData) obj;
        return C9971q.m14638b(this.f7427id, tapImageData.f7427id) && this.index == tapImageData.index && C9971q.m14638b(this.type, tapImageData.type) && C9971q.m14638b(this.layout, tapImageData.layout) && C9971q.m14638b(this.portal, tapImageData.portal) && C9971q.m14638b(this.embedIndex, tapImageData.embedIndex);
    }

    public final Integer getEmbedIndex() {
        return this.embedIndex;
    }

    public final String getId() {
        return this.f7427id;
    }

    public final int getIndex() {
        return this.index;
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public final Double getPortal() {
        return this.portal;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((((this.f7427id.hashCode() * 31) + this.index) * 31) + this.type.hashCode()) * 31) + this.layout.hashCode()) * 31;
        Double d = this.portal;
        int i = 0;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.embedIndex;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return NativeMapExtensionsKt.nativeMapOf(C11098x.m10921a("id", this.f7427id), C11098x.m10921a("index", Integer.valueOf(this.index)), C11098x.m10921a("type", this.type), C11098x.m10921a("layout", this.layout.serialize()), C11098x.m10921a("portal", this.portal), C11098x.m10921a("embedIndex", this.embedIndex));
    }

    public String toString() {
        String str = this.f7427id;
        int i = this.index;
        String str2 = this.type;
        Layout layout = this.layout;
        Double d = this.portal;
        Integer num = this.embedIndex;
        return "TapImageData(id=" + str + ", index=" + i + ", type=" + str2 + ", layout=" + layout + ", portal=" + d + ", embedIndex=" + num + ")";
    }
}
