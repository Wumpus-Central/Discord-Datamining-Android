package com.discord.overlapping_circles;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.LinearLayout;
import androidx.core.view.C2733w0;
import androidx.core.view.ViewTreeObserver$OnPreDrawListenerC2722u0;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.textview.MaterialTextView;
import eg.C6884j;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9906j;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11084n;
import nf.EnumC11087p;

@Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0004\u0018\u0019\u001a\u001bB\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016R\u0012\u0010\u0007\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m15073d2 = {"Lcom/discord/overlapping_circles/OverlappingCirclesView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageLoadingColor", "", "imageLoadingColorDrawable", "Landroid/graphics/drawable/ColorDrawable;", "maxItems", "overflowBgColor", "overflowTextColor", "overflowTextSizePx", "overlapNegativeMargin", "overlapPx", "placeholderCircleColor", "separatorSizePx", "setItems", "", "items", "", "Lcom/discord/overlapping_circles/OverlappingItem;", "Companion", "OverflowItem", "OverlappingClippedItem", "PlaceholderItem", "overlapping_circles_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes3.dex */
public final class OverlappingCirclesView extends LinearLayout {
    public static final Companion Companion = new Companion(null);
    public static final int SMALL_ITEM_HEIGHT_DP = 20;
    private int imageLoadingColor;
    private final ColorDrawable imageLoadingColorDrawable;
    private int maxItems;
    private int overflowBgColor;
    private int overflowTextColor;
    private int overflowTextSizePx;
    private final int overlapNegativeMargin;
    private int overlapPx;
    private int placeholderCircleColor;
    private int separatorSizePx;

    @Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m15073d2 = {"Lcom/discord/overlapping_circles/OverlappingCirclesView$Companion;", "", "()V", "SMALL_ITEM_HEIGHT_DP", "", "getClippingPathForSeparator", "Landroid/graphics/Path;", "radius", "", "viewCenterX", "viewCenterY", "separatorSizePx", "overlapping_circles_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Path getClippingPathForSeparator(float f, float f2, float f3, int i) {
            Path path = new Path();
            path.addCircle((f2 + (2 * f)) - i, f3, f, Path.Direction.CW);
            return path;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m15073d2 = {"Lcom/discord/overlapping_circles/OverlappingCirclesView$OverflowItem;", "Lcom/google/android/material/textview/MaterialTextView;", "context", "Landroid/content/Context;", "count", "", "textSizePx", "textColor", "bgColor", "sizePx", "(Landroid/content/Context;IIIII)V", "overlapping_circles_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes3.dex */
    private static final class OverflowItem extends MaterialTextView {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OverflowItem(Context context, int i, int i2, int i3, int i4, int i5) {
            super(context);
            int i6;
            int i7;
            C9971q.m14633g(context, "context");
            DiscordFontUtilsKt.setDiscordFont(this, DiscordFont.PrimaryBold);
            setTextSize(0, i2);
            setTextColor(i3);
            setText("+" + i);
            setGravity(17);
            int i8 = (SizeUtilsKt.getPxToDp(i5) > 20.0f ? 1 : (SizeUtilsKt.getPxToDp(i5) == 20.0f ? 0 : -1));
            if (i8 > 0) {
                i6 = SizeUtilsKt.getDpToPx(8);
            } else {
                i6 = SizeUtilsKt.getDpToPx(4);
            }
            if (i8 > 0) {
                i7 = SizeUtilsKt.getDpToPx(8);
            } else {
                i7 = SizeUtilsKt.getDpToPx(4);
            }
            setPadding(i6, 0, i7, 0);
            setBackgroundColor(i4);
            ViewClippingUtilsKt.clipToCircle(this);
            C9971q.m14634f(ViewTreeObserver$OnPreDrawListenerC2722u0.m37085a(this, new Runnable() { // from class: com.discord.overlapping_circles.OverlappingCirclesView$OverflowItem$special$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    int c;
                    View view = this;
                    OverlappingCirclesView.OverflowItem overflowItem = this;
                    ViewGroup.LayoutParams layoutParams = overflowItem.getLayoutParams();
                    if (layoutParams != null) {
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        c = C6884j.m23961c(view.getWidth(), view.getHeight());
                        layoutParams2.width = c;
                        overflowItem.setLayoutParams(layoutParams2);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
            }), "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
        }
    }

    @Metadata(m15074d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0014R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m15073d2 = {"Lcom/discord/overlapping_circles/OverlappingCirclesView$OverlappingClippedItem;", "Lcom/facebook/drawee/view/SimpleDraweeView;", "context", "Landroid/content/Context;", "imageUri", "", "showSeparation", "", "overlapPx", "", "separatorSizePx", "defaultImg", "Landroid/graphics/drawable/Drawable;", "(Landroid/content/Context;Ljava/lang/String;ZIILandroid/graphics/drawable/Drawable;)V", "clipPath", "Landroid/graphics/Path;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "overlapping_circles_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    @SuppressLint({"ViewConstructor"})
    /* loaded from: classes3.dex */
    private static final class OverlappingClippedItem extends SimpleDraweeView {
        private Path clipPath = new Path();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OverlappingClippedItem(Context context, String imageUri, final boolean z, final int i, final int i2, Drawable defaultImg) {
            super(context);
            C9971q.m14633g(context, "context");
            C9971q.m14633g(imageUri, "imageUri");
            C9971q.m14633g(defaultImg, "defaultImg");
            setHierarchy(GenericDraweeHierarchyBuilder.m31735u(getResources()).m31764D(defaultImg).m31767A(defaultImg).m31731y(1.0f).m31755a());
            setImageURI(imageUri);
            if (!C2733w0.m37029U(this) || isLayoutRequested()) {
                addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.discord.overlapping_circles.OverlappingCirclesView$OverlappingClippedItem$special$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                        C9971q.m14633g(view, "view");
                        view.removeOnLayoutChangeListener(this);
                        float f = OverlappingCirclesView.OverlappingClippedItem.this.getLayoutParams().width / 2.0f;
                        OverlappingCirclesView.OverlappingClippedItem.this.clipPath.addCircle(f, f, f, Path.Direction.CW);
                        if (z) {
                            OverlappingCirclesView.OverlappingClippedItem.this.clipPath.op(OverlappingCirclesView.Companion.getClippingPathForSeparator(f, f - i, f, i2), Path.Op.DIFFERENCE);
                        }
                    }
                });
                return;
            }
            float f = getLayoutParams().width / 2.0f;
            this.clipPath.addCircle(f, f, f, Path.Direction.CW);
            if (z) {
                this.clipPath.op(OverlappingCirclesView.Companion.getClippingPathForSeparator(f, f - i, f, i2), Path.Op.DIFFERENCE);
            }
        }

        @Override // android.widget.ImageView, android.view.View
        protected void onDraw(Canvas canvas) {
            C9971q.m14633g(canvas, "canvas");
            int save = canvas.save();
            try {
                canvas.clipPath(this.clipPath);
                super.onDraw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0014R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m15073d2 = {"Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;", "Landroid/view/View;", "context", "Landroid/content/Context;", "bgColor", "", "showSeparation", "", "overlapPx", "separatorSizePx", "size", "(Landroid/content/Context;IZIII)V", "paint", "Landroid/graphics/Paint;", "radius", "", "separatorClipPath", "Landroid/graphics/Path;", "getSeparatorClipPath", "()Landroid/graphics/Path;", "separatorClipPath$delegate", "Lkotlin/Lazy;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "overlapping_circles_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes3.dex */
    public static final class PlaceholderItem extends View {
        private final int overlapPx;
        private final Paint paint;
        private final float radius;
        private final Lazy separatorClipPath$delegate;
        private final boolean showSeparation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlaceholderItem(Context context, int i, boolean z, int i2, int i3, int i4) {
            super(context);
            Lazy b;
            C9971q.m14633g(context, "context");
            this.showSeparation = z;
            this.overlapPx = i2;
            this.radius = i4 / 2.0f;
            b = C11084n.m10944b(EnumC11087p.NONE, new OverlappingCirclesView$PlaceholderItem$separatorClipPath$2(this, i3));
            this.separatorClipPath$delegate = b;
            Paint paint = new Paint();
            paint.setColor(i);
            paint.setAntiAlias(true);
            this.paint = paint;
        }

        private final Path getSeparatorClipPath() {
            return (Path) this.separatorClipPath$delegate.getValue();
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            C9971q.m14633g(canvas, "canvas");
            int save = canvas.save();
            try {
                if (this.showSeparation) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        canvas.clipOutPath(getSeparatorClipPath());
                    } else {
                        canvas.clipPath(getSeparatorClipPath(), Region.Op.DIFFERENCE);
                    }
                }
                float f = this.radius;
                canvas.drawCircle(f, f, f, this.paint);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OverlappingCirclesView(Context context) {
        this(context, null, 2, null);
        C9971q.m14633g(context, "context");
    }

    public /* synthetic */ OverlappingCirclesView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final void setItems(List<OverlappingItem> items) {
        boolean z;
        List x0;
        boolean z2;
        boolean z3;
        View view;
        boolean z4;
        String str;
        C9971q.m14633g(items, "items");
        removeAllViews();
        if (items.size() > this.maxItems) {
            z = true;
        } else {
            z = false;
        }
        int min = Math.min(items.size(), this.maxItems) - 1;
        int i = this.maxItems;
        if (z) {
            i--;
        }
        x0 = C9914r.m14741x0(items, i);
        int i2 = 0;
        for (Object obj : x0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C9906j.m14810s();
            }
            OverlappingItem overlappingItem = (OverlappingItem) obj;
            if (i2 != min) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 || z) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (overlappingItem.getImageUri() != null) {
                if (URLUtil.isValidUrl(overlappingItem.getImageUri())) {
                    str = overlappingItem.getImageUri();
                } else {
                    Context context = getContext();
                    C9971q.m14634f(context, "context");
                    ReactAsset reactAsset = ReactAsset.DefaultAvatar0;
                    Context context2 = getContext();
                    C9971q.m14634f(context2, "context");
                    str = ReactAssetUtilsKt.getReactImageUrl(context, reactAsset.getUri(context2));
                }
                Context context3 = getContext();
                C9971q.m14634f(context3, "context");
                view = new OverlappingClippedItem(context3, str, z3, this.overlapPx, this.separatorSizePx, this.imageLoadingColorDrawable);
            } else {
                Context context4 = getContext();
                int backgroundAccent = ThemeManagerKt.getTheme().getBackgroundAccent();
                int i4 = this.overlapPx;
                int i5 = this.separatorSizePx;
                int i6 = getLayoutParams().height;
                C9971q.m14634f(context4, "context");
                view = new PlaceholderItem(context4, backgroundAccent, z3, i4, i5, i6);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getLayoutParams().height, getLayoutParams().height);
            if (i2 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                layoutParams.setMarginStart(this.overlapNegativeMargin);
            }
            addView(view, layoutParams);
            i2 = i3;
        }
        if (z) {
            Context context5 = getContext();
            C9971q.m14634f(context5, "context");
            View overflowItem = new OverflowItem(context5, items.size() - i, this.overflowTextSizePx, this.overflowTextColor, this.overflowBgColor, getLayoutParams().height);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
            layoutParams2.setMarginStart(this.overlapNegativeMargin);
            Unit unit = Unit.f22042a;
            addView(overflowItem, layoutParams2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlappingCirclesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int c;
        C9971q.m14633g(context, "context");
        this.maxItems = 3;
        this.overlapPx = SizeUtilsKt.getDpToPx(4);
        this.separatorSizePx = SizeUtilsKt.getDpToPx(3);
        this.imageLoadingColor = ThemeManagerKt.getTheme().getBackgroundSecondaryAlt();
        this.overflowBgColor = ThemeManagerKt.getTheme().getBackgroundSecondaryAlt();
        this.overflowTextColor = ThemeManagerKt.getTheme().getInteractiveNormal();
        this.overflowTextSizePx = SizeUtilsKt.getSpToPx(12);
        this.placeholderCircleColor = ThemeManagerKt.getTheme().getBackgroundAccent();
        this.imageLoadingColorDrawable = new ColorDrawable(this.imageLoadingColor);
        int[] OverlappingCirclesView = C4612R.styleable.OverlappingCirclesView;
        C9971q.m14634f(OverlappingCirclesView, "OverlappingCirclesView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OverlappingCirclesView, 0, 0);
        C9971q.m14634f(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        c = C6884j.m23961c(obtainStyledAttributes.getInt(C4612R.styleable.OverlappingCirclesView_oc_maxItems, this.maxItems), 0);
        this.maxItems = c;
        this.overlapPx = obtainStyledAttributes.getDimensionPixelSize(C4612R.styleable.OverlappingCirclesView_oc_overlap, this.overlapPx);
        this.separatorSizePx = obtainStyledAttributes.getDimensionPixelSize(C4612R.styleable.OverlappingCirclesView_oc_separation, this.separatorSizePx);
        this.imageLoadingColor = obtainStyledAttributes.getColor(C4612R.styleable.OverlappingCirclesView_oc_circleBgColor, this.imageLoadingColor);
        this.overflowBgColor = obtainStyledAttributes.getColor(C4612R.styleable.OverlappingCirclesView_oc_overflowBgColor, this.overflowBgColor);
        this.overflowTextColor = obtainStyledAttributes.getColor(C4612R.styleable.OverlappingCirclesView_oc_overflowTextColor, this.overflowTextColor);
        this.overflowTextSizePx = obtainStyledAttributes.getDimensionPixelSize(C4612R.styleable.OverlappingCirclesView_oc_overflowTextSize, this.overflowTextSizePx);
        this.placeholderCircleColor = obtainStyledAttributes.getColor(C4612R.styleable.OverlappingCirclesView_oc_placeholderColor, this.placeholderCircleColor);
        obtainStyledAttributes.recycle();
        setOrientation(0);
        this.overlapNegativeMargin = -Math.abs(this.overlapPx);
    }
}
