package com.discord.chat.reactevents;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import kf.x;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001*B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJN\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\b\u0010'\u001a\u00020(H\u0016J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011¨\u0006+"}, d2 = {"Lcom/discord/chat/reactevents/TapImageData;", "Lcom/discord/reactevents/ReactEvent;", "id", "", "index", "", "type", "layout", "Lcom/discord/chat/reactevents/TapImageData$Layout;", "portal", "", "embedIndex", "(Ljava/lang/String;ILjava/lang/String;Lcom/discord/chat/reactevents/TapImageData$Layout;Ljava/lang/Double;Ljava/lang/Integer;)V", "getEmbedIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "()Ljava/lang/String;", "getIndex", "()I", "getLayout", "()Lcom/discord/chat/reactevents/TapImageData$Layout;", "getPortal", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;ILjava/lang/String;Lcom/discord/chat/reactevents/TapImageData$Layout;Ljava/lang/Double;Ljava/lang/Integer;)Lcom/discord/chat/reactevents/TapImageData;", "equals", "", "other", "", "hashCode", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "Layout", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class TapImageData implements ReactEvent {
    private final Integer embedIndex;

    
    private final String f7485id;
    private final int index;
    private final Layout layout;
    private final Double portal;
    private final String type;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/discord/chat/reactevents/TapImageData$Layout;", "", "width", "", "height", "x", "y", ViewProps.RESIZE_MODE, "Lcom/discord/chat/reactevents/ViewResizeMode;", "(IIIILcom/discord/chat/reactevents/ViewResizeMode;)V", "getHeight", "()I", "getResizeMode", "()Lcom/discord/chat/reactevents/ViewResizeMode;", "getWidth", "getX", "getY", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Layout {
        private final int height;
        private final ViewResizeMode resizeMode;
        private final int width;

        
        private final int f7486x;

        
        private final int f7487y;

        public Layout(int i10, int i11, int i12, int i13, ViewResizeMode resizeMode) {
            q.h(resizeMode, "resizeMode");
            this.width = i10;
            this.height = i11;
            this.f7486x = i12;
            this.f7487y = i13;
            this.resizeMode = resizeMode;
        }

        public static  Layout copy$default(Layout layout, int i10, int i11, int i12, int i13, ViewResizeMode viewResizeMode, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i10 = layout.width;
            }
            if ((i14 & 2) != 0) {
                i11 = layout.height;
            }
            if ((i14 & 4) != 0) {
                i12 = layout.f7486x;
            }
            if ((i14 & 8) != 0) {
                i13 = layout.f7487y;
            }
            if ((i14 & 16) != 0) {
                viewResizeMode = layout.resizeMode;
            }
            return layout.copy(i10, i11, i12, i13, viewResizeMode);
        }

        public final int component1() {
            return this.width;
        }

        public final int component2() {
            return this.height;
        }

        public final int component3() {
            return this.f7486x;
        }

        public final int component4() {
            return this.f7487y;
        }

        public final ViewResizeMode component5() {
            return this.resizeMode;
        }

        public final Layout copy(int i10, int i11, int i12, int i13, ViewResizeMode resizeMode) {
            q.h(resizeMode, "resizeMode");
            return new Layout(i10, i11, i12, i13, resizeMode);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Layout)) {
                return false;
            }
            Layout layout = (Layout) obj;
            return this.width == layout.width && this.height == layout.height && this.f7486x == layout.f7486x && this.f7487y == layout.f7487y && this.resizeMode == layout.resizeMode;
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
            return this.f7486x;
        }

        public final int getY() {
            return this.f7487y;
        }

        public int hashCode() {
            return (((((((this.width * 31) + this.height) * 31) + this.f7486x) * 31) + this.f7487y) * 31) + this.resizeMode.hashCode();
        }

        public final WritableMap serialize() {
            return NativeMapExtensionsKt.nativeMapOf(x.a("width", Integer.valueOf(this.width)), x.a("height", Integer.valueOf(this.height)), x.a("x", Integer.valueOf(this.f7486x)), x.a("y", Integer.valueOf(this.f7487y)), x.a(ViewProps.RESIZE_MODE, this.resizeMode.getValue()));
        }

        public String toString() {
            int i10 = this.width;
            int i11 = this.height;
            int i12 = this.f7486x;
            int i13 = this.f7487y;
            ViewResizeMode viewResizeMode = this.resizeMode;
            return "Layout(width=" + i10 + ", height=" + i11 + ", x=" + i12 + ", y=" + i13 + ", resizeMode=" + viewResizeMode + ")";
        }
    }

    public TapImageData(String id2, int i10, String type, Layout layout, Double d10, Integer num) {
        q.h(id2, "id");
        q.h(type, "type");
        q.h(layout, "layout");
        this.f7485id = id2;
        this.index = i10;
        this.type = type;
        this.layout = layout;
        this.portal = d10;
        this.embedIndex = num;
    }

    public static  TapImageData copy$default(TapImageData tapImageData, String str, int i10, String str2, Layout layout, Double d10, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tapImageData.f7485id;
        }
        if ((i11 & 2) != 0) {
            i10 = tapImageData.index;
        }
        if ((i11 & 4) != 0) {
            str2 = tapImageData.type;
        }
        if ((i11 & 8) != 0) {
            layout = tapImageData.layout;
        }
        if ((i11 & 16) != 0) {
            d10 = tapImageData.portal;
        }
        if ((i11 & 32) != 0) {
            num = tapImageData.embedIndex;
        }
        return tapImageData.copy(str, i10, str2, layout, d10, num);
    }

    public final String component1() {
        return this.f7485id;
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

    public final TapImageData copy(String id2, int i10, String type, Layout layout, Double d10, Integer num) {
        q.h(id2, "id");
        q.h(type, "type");
        q.h(layout, "layout");
        return new TapImageData(id2, i10, type, layout, d10, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapImageData)) {
            return false;
        }
        TapImageData tapImageData = (TapImageData) obj;
        return q.c(this.f7485id, tapImageData.f7485id) && this.index == tapImageData.index && q.c(this.type, tapImageData.type) && q.c(this.layout, tapImageData.layout) && q.c(this.portal, tapImageData.portal) && q.c(this.embedIndex, tapImageData.embedIndex);
    }

    public final Integer getEmbedIndex() {
        return this.embedIndex;
    }

    public final String getId() {
        return this.f7485id;
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
        int hashCode = ((((((this.f7485id.hashCode() * 31) + this.index) * 31) + this.type.hashCode()) * 31) + this.layout.hashCode()) * 31;
        Double d10 = this.portal;
        int i10 = 0;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.embedIndex;
        if (num != null) {
            i10 = num.hashCode();
        }
        return hashCode2 + i10;
    }

    @Override 
    public WritableMap serialize() {
        return NativeMapExtensionsKt.nativeMapOf(x.a("id", this.f7485id), x.a("index", Integer.valueOf(this.index)), x.a("type", this.type), x.a("layout", this.layout.serialize()), x.a("portal", this.portal), x.a("embedIndex", this.embedIndex));
    }

    public String toString() {
        String str = this.f7485id;
        int i10 = this.index;
        String str2 = this.type;
        Layout layout = this.layout;
        Double d10 = this.portal;
        Integer num = this.embedIndex;
        return "TapImageData(id=" + str + ", index=" + i10 + ", type=" + str2 + ", layout=" + layout + ", portal=" + d10 + ", embedIndex=" + num + ")";
    }
}
