package com.discord.icons;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001bB3\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b0\u0007¢\u0006\u0002\u0010\u000bB\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J,\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001a\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b0\u0007J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\t2\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u001aR*\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u0010j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0011`\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/discord/icons/IconView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "size", "Lcom/discord/icons/IconView$IconSize;", "layers", "", "Lkotlin/Pair;", "Lcom/discord/react_asset_fetcher/ReactAsset;", "", "(Landroid/content/Context;Lcom/discord/icons/IconView$IconSize;Ljava/util/List;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "viewLayers", "Ljava/util/LinkedHashMap;", "Landroid/view/View;", "Lkotlin/collections/LinkedHashMap;", "createAndAddChild", "Lcom/facebook/drawee/view/SimpleDraweeView;", "setAssets", "", "tintAsset", "asset", "tintColor", "(Lcom/discord/react_asset_fetcher/ReactAsset;Ljava/lang/Integer;)V", "IconSize", "icons_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public class IconView extends FrameLayout {
    private final LinkedHashMap<ReactAsset, View> viewLayers;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\t\n\u000b\f\r\u000eB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u0082\u0001\u0006\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/discord/icons/IconView$IconSize;", "", "widthDp", "", "heightDp", "(II)V", "getHeightDp", "()I", "getWidthDp", "Custom", "LG", "MD", "SM", "XS", "XXS", "Lcom/discord/icons/IconView$IconSize$Custom;", "Lcom/discord/icons/IconView$IconSize$LG;", "Lcom/discord/icons/IconView$IconSize$MD;", "Lcom/discord/icons/IconView$IconSize$SM;", "Lcom/discord/icons/IconView$IconSize$XS;", "Lcom/discord/icons/IconView$IconSize$XXS;", "icons_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class IconSize {
        private final int heightDp;
        private final int widthDp;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/discord/icons/IconView$IconSize$Custom;", "Lcom/discord/icons/IconView$IconSize;", "widthDp", "", "heightDp", "(II)V", "getHeightDp", "()I", "getWidthDp", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "icons_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Custom extends IconSize {
            private final int heightDp;
            private final int widthDp;

            public Custom(int i10, int i11) {
                super(i10, i11, null);
                this.widthDp = i10;
                this.heightDp = i11;
            }

            public static /* synthetic */ Custom copy$default(Custom custom, int i10, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i10 = custom.getWidthDp();
                }
                if ((i12 & 2) != 0) {
                    i11 = custom.getHeightDp();
                }
                return custom.copy(i10, i11);
            }

            public final int component1() {
                return getWidthDp();
            }

            public final int component2() {
                return getHeightDp();
            }

            public final Custom copy(int i10, int i11) {
                return new Custom(i10, i11);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Custom)) {
                    return false;
                }
                Custom custom = (Custom) obj;
                return getWidthDp() == custom.getWidthDp() && getHeightDp() == custom.getHeightDp();
            }

            @Override // com.discord.icons.IconView.IconSize
            public int getHeightDp() {
                return this.heightDp;
            }

            @Override // com.discord.icons.IconView.IconSize
            public int getWidthDp() {
                return this.widthDp;
            }

            public int hashCode() {
                return (getWidthDp() * 31) + getHeightDp();
            }

            public String toString() {
                int widthDp = getWidthDp();
                int heightDp = getHeightDp();
                return "Custom(widthDp=" + widthDp + ", heightDp=" + heightDp + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/discord/icons/IconView$IconSize$LG;", "Lcom/discord/icons/IconView$IconSize;", "()V", "icons_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class LG extends IconSize {
            public static final LG INSTANCE = new LG();

            private LG() {
                super(32, 32, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/discord/icons/IconView$IconSize$MD;", "Lcom/discord/icons/IconView$IconSize;", "()V", "icons_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class MD extends IconSize {
            public static final MD INSTANCE = new MD();

            private MD() {
                super(24, 24, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/discord/icons/IconView$IconSize$SM;", "Lcom/discord/icons/IconView$IconSize;", "()V", "icons_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class SM extends IconSize {
            public static final SM INSTANCE = new SM();

            private SM() {
                super(18, 18, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/discord/icons/IconView$IconSize$XS;", "Lcom/discord/icons/IconView$IconSize;", "()V", "icons_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class XS extends IconSize {
            public static final XS INSTANCE = new XS();

            private XS() {
                super(16, 16, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/discord/icons/IconView$IconSize$XXS;", "Lcom/discord/icons/IconView$IconSize;", "()V", "icons_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class XXS extends IconSize {
            public static final XXS INSTANCE = new XXS();

            private XXS() {
                super(12, 12, null);
            }
        }

        private IconSize(int i10, int i11) {
            this.widthDp = i10;
            this.heightDp = i11;
        }

        public /* synthetic */ IconSize(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, i11);
        }

        public int getHeightDp() {
            return this.heightDp;
        }

        public int getWidthDp() {
            return this.widthDp;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconView(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public /* synthetic */ IconView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    private final SimpleDraweeView createAndAddChild(IconSize iconSize) {
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
        addView(simpleDraweeView, SizeUtilsKt.getDpToPx(iconSize.getWidthDp()), SizeUtilsKt.getDpToPx(iconSize.getHeightDp()));
        return simpleDraweeView;
    }

    public static /* synthetic */ void setAssets$default(IconView iconView, IconSize iconSize, List list, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                iconSize = IconSize.SM.INSTANCE;
            }
            iconView.setAssets(iconSize, list);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAssets");
    }

    public final void setAssets(IconSize size, List<? extends Pair<? extends ReactAsset, Integer>> layers) {
        SimpleDraweeView simpleDraweeView;
        q.g(size, "size");
        q.g(layers, "layers");
        this.viewLayers.clear();
        int i10 = 0;
        for (Object obj : layers) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                j.r();
            }
            Pair pair = (Pair) obj;
            ReactAsset reactAsset = (ReactAsset) pair.a();
            Integer num = (Integer) pair.b();
            View childAt = getChildAt(i10);
            if (childAt instanceof SimpleDraweeView) {
                simpleDraweeView = (SimpleDraweeView) childAt;
            } else {
                simpleDraweeView = null;
            }
            if (simpleDraweeView == null) {
                simpleDraweeView = createAndAddChild(size);
            }
            ReactAssetUtilsKt.setReactAsset(simpleDraweeView, reactAsset);
            if (num != null) {
                simpleDraweeView.setColorFilter(num.intValue());
            } else {
                simpleDraweeView.clearColorFilter();
            }
            this.viewLayers.put(reactAsset, simpleDraweeView);
            i10 = i11;
        }
        while (getChildCount() > layers.size()) {
            removeViewAt(getChildCount() - 1);
        }
    }

    public final void tintAsset(ReactAsset asset, Integer num) {
        q.g(asset, "asset");
        View view = this.viewLayers.get(asset);
        q.e(view, "null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view;
        if (num != null) {
            simpleDraweeView.setColorFilter(num.intValue());
        } else {
            simpleDraweeView.clearColorFilter();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        this.viewLayers = new LinkedHashMap<>();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconView(Context context, IconSize size, List<? extends Pair<? extends ReactAsset, Integer>> layers) {
        this(context, null);
        q.g(context, "context");
        q.g(size, "size");
        q.g(layers, "layers");
        setAssets(size, layers);
    }
}
