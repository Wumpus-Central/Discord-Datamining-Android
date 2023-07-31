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
import androidx.core.view.u0;
import androidx.core.view.w0;
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
import ff.n;
import ff.p;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import wf.j;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0004\u0018\u0019\u001a\u001bB\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016R\u0012\u0010\u0007\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/discord/overlapping_circles/OverlappingCirclesView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageLoadingColor", "", "imageLoadingColorDrawable", "Landroid/graphics/drawable/ColorDrawable;", "maxItems", "overflowBgColor", "overflowTextColor", "overflowTextSizePx", "overlapNegativeMargin", "overlapPx", "placeholderCircleColor", "separatorSizePx", "setItems", "", "items", "", "Lcom/discord/overlapping_circles/OverlappingItem;", "Companion", "OverflowItem", "OverlappingClippedItem", "PlaceholderItem", "overlapping_circles_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discord/overlapping_circles/OverlappingCirclesView$Companion;", "", "()V", "SMALL_ITEM_HEIGHT_DP", "", "getClippingPathForSeparator", "Landroid/graphics/Path;", "radius", "", "viewCenterX", "viewCenterY", "separatorSizePx", "overlapping_circles_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Path getClippingPathForSeparator(float f10, float f11, float f12, int i10) {
            Path path = new Path();
            path.addCircle((f11 + (2 * f10)) - i10, f12, f10, Path.Direction.CW);
            return path;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/discord/overlapping_circles/OverlappingCirclesView$OverflowItem;", "Lcom/google/android/material/textview/MaterialTextView;", "context", "Landroid/content/Context;", "count", "", "textSizePx", "textColor", "bgColor", "sizePx", "(Landroid/content/Context;IIIII)V", "overlapping_circles_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    private static final class OverflowItem extends MaterialTextView {
        
        public OverflowItem(Context context, int i10, int i11, int i12, int i13, int i14) {
            super(context);
            q.g(context, "context");
            DiscordFontUtilsKt.setDiscordFont(this, DiscordFont.PrimaryBold);
            setTextSize(0, i11);
            setTextColor(i12);
            setText("+" + i10);
            setGravity(17);
            int i15 = (SizeUtilsKt.getPxToDp(i14) > 20.0f ? 1 : (SizeUtilsKt.getPxToDp(i14) == 20.0f ? 0 : -1));
            setPadding(i15 > 0 ? SizeUtilsKt.getDpToPx(8) : SizeUtilsKt.getDpToPx(4), 0, i15 > 0 ? SizeUtilsKt.getDpToPx(8) : SizeUtilsKt.getDpToPx(4), 0);
            setBackgroundColor(i13);
            ViewClippingUtilsKt.clipToCircle(this);
            q.f(u0.a(this, new Runnable() { 
                @Override 
                public final void run() {
                    int c10;
                    View view = this;
                    OverlappingCirclesView.OverflowItem overflowItem = this;
                    ViewGroup.LayoutParams layoutParams = overflowItem.getLayoutParams();
                    if (layoutParams != null) {
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        c10 = j.c(view.getWidth(), view.getHeight());
                        layoutParams2.width = c10;
                        overflowItem.setLayoutParams(layoutParams2);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
            }), "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0014R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/overlapping_circles/OverlappingCirclesView$OverlappingClippedItem;", "Lcom/facebook/drawee/view/SimpleDraweeView;", "context", "Landroid/content/Context;", "imageUri", "", "showSeparation", "", "overlapPx", "", "separatorSizePx", "defaultImg", "Landroid/graphics/drawable/Drawable;", "(Landroid/content/Context;Ljava/lang/String;ZIILandroid/graphics/drawable/Drawable;)V", "clipPath", "Landroid/graphics/Path;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "overlapping_circles_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SuppressLint({"ViewConstructor"})
    
    private static final class OverlappingClippedItem extends SimpleDraweeView {
        private Path clipPath = new Path();

        
        public OverlappingClippedItem(Context context, String imageUri, final boolean z10, final int i10, final int i11, Drawable defaultImg) {
            super(context);
            q.g(context, "context");
            q.g(imageUri, "imageUri");
            q.g(defaultImg, "defaultImg");
            setHierarchy(GenericDraweeHierarchyBuilder.u(getResources()).D(defaultImg).A(defaultImg).y(1.0f).a());
            setImageURI(imageUri);
            if (!w0.U(this) || isLayoutRequested()) {
                addOnLayoutChangeListener(new View.OnLayoutChangeListener() { 
                    @Override 
                    public void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                        q.g(view, "view");
                        view.removeOnLayoutChangeListener(this);
                        float f10 = OverlappingCirclesView.OverlappingClippedItem.this.getLayoutParams().width / 2.0f;
                        OverlappingCirclesView.OverlappingClippedItem.this.clipPath.addCircle(f10, f10, f10, Path.Direction.CW);
                        if (z10) {
                            OverlappingCirclesView.OverlappingClippedItem.this.clipPath.op(OverlappingCirclesView.Companion.getClippingPathForSeparator(f10, f10 - i10, f10, i11), Path.Op.DIFFERENCE);
                        }
                    }
                });
                return;
            }
            float f10 = getLayoutParams().width / 2.0f;
            this.clipPath.addCircle(f10, f10, f10, Path.Direction.CW);
            if (z10) {
                this.clipPath.op(OverlappingCirclesView.Companion.getClippingPathForSeparator(f10, f10 - i10, f10, i11), Path.Op.DIFFERENCE);
            }
        }

        @Override 
        protected void onDraw(Canvas canvas) {
            q.g(canvas, "canvas");
            int save = canvas.save();
            try {
                canvas.clipPath(this.clipPath);
                super.onDraw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0014R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;", "Landroid/view/View;", "context", "Landroid/content/Context;", "bgColor", "", "showSeparation", "", "overlapPx", "separatorSizePx", "size", "(Landroid/content/Context;IZIII)V", "paint", "Landroid/graphics/Paint;", "radius", "", "separatorClipPath", "Landroid/graphics/Path;", "getSeparatorClipPath", "()Landroid/graphics/Path;", "separatorClipPath$delegate", "Lkotlin/Lazy;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "overlapping_circles_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class PlaceholderItem extends View {
        private final int overlapPx;
        private final Paint paint;
        private final float radius;
        private final Lazy separatorClipPath$delegate;
        private final boolean showSeparation;

        
        public PlaceholderItem(Context context, int i10, boolean z10, int i11, int i12, int i13) {
            super(context);
            Lazy a10;
            q.g(context, "context");
            this.showSeparation = z10;
            this.overlapPx = i11;
            this.radius = i13 / 2.0f;
            a10 = n.a(p.NONE, new OverlappingCirclesView$PlaceholderItem$separatorClipPath$2(this, i12));
            this.separatorClipPath$delegate = a10;
            Paint paint = new Paint();
            paint.setColor(i10);
            paint.setAntiAlias(true);
            this.paint = paint;
        }

        private final Path getSeparatorClipPath() {
            return (Path) this.separatorClipPath$delegate.getValue();
        }

        @Override 
        protected void onDraw(Canvas canvas) {
            q.g(canvas, "canvas");
            int save = canvas.save();
            try {
                if (this.showSeparation) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        canvas.clipOutPath(getSeparatorClipPath());
                    } else {
                        canvas.clipPath(getSeparatorClipPath(), Region.Op.DIFFERENCE);
                    }
                }
                float f10 = this.radius;
                canvas.drawCircle(f10, f10, f10, this.paint);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    
    public OverlappingCirclesView(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public  OverlappingCirclesView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    public final void setItems(List<OverlappingItem> items) {
        boolean z10;
        List v02;
        boolean z11;
        boolean z12;
        View view;
        boolean z13;
        String str;
        q.g(items, "items");
        removeAllViews();
        if (items.size() > this.maxItems) {
            z10 = true;
        } else {
            z10 = false;
        }
        int min = Math.min(items.size(), this.maxItems) - 1;
        int i10 = this.maxItems;
        if (z10) {
            i10--;
        }
        v02 = r.v0(items, i10);
        int i11 = 0;
        for (Object obj : v02) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                kotlin.collections.j.r();
            }
            OverlappingItem overlappingItem = (OverlappingItem) obj;
            if (i11 != min) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 || z10) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (overlappingItem.getImageUri() != null) {
                if (URLUtil.isValidUrl(overlappingItem.getImageUri())) {
                    str = overlappingItem.getImageUri();
                } else {
                    Context context = getContext();
                    q.f(context, "context");
                    ReactAsset reactAsset = ReactAsset.DefaultAvatar0;
                    Context context2 = getContext();
                    q.f(context2, "context");
                    str = ReactAssetUtilsKt.getReactImageUrl(context, reactAsset.getUri(context2));
                }
                Context context3 = getContext();
                q.f(context3, "context");
                view = new OverlappingClippedItem(context3, str, z12, this.overlapPx, this.separatorSizePx, this.imageLoadingColorDrawable);
            } else {
                Context context4 = getContext();
                int backgroundAccent = ThemeManagerKt.getTheme().getBackgroundAccent();
                int i13 = this.overlapPx;
                int i14 = this.separatorSizePx;
                int i15 = getLayoutParams().height;
                q.f(context4, "context");
                view = new PlaceholderItem(context4, backgroundAccent, z12, i13, i14, i15);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getLayoutParams().height, getLayoutParams().height);
            if (i11 > 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                layoutParams.setMarginStart(this.overlapNegativeMargin);
            }
            addView(view, layoutParams);
            i11 = i12;
        }
        if (z10) {
            Context context5 = getContext();
            q.f(context5, "context");
            View overflowItem = new OverflowItem(context5, items.size() - i10, this.overflowTextSizePx, this.overflowTextColor, this.overflowBgColor, getLayoutParams().height);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
            layoutParams2.setMarginStart(this.overlapNegativeMargin);
            Unit unit = Unit.f20679a;
            addView(overflowItem, layoutParams2);
        }
    }

    
    public OverlappingCirclesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int c10;
        q.g(context, "context");
        this.maxItems = 3;
        this.overlapPx = SizeUtilsKt.getDpToPx(4);
        this.separatorSizePx = SizeUtilsKt.getDpToPx(3);
        this.imageLoadingColor = ThemeManagerKt.getTheme().getBackgroundSecondaryAlt();
        this.overflowBgColor = ThemeManagerKt.getTheme().getBackgroundSecondaryAlt();
        this.overflowTextColor = ThemeManagerKt.getTheme().getInteractiveNormal();
        this.overflowTextSizePx = SizeUtilsKt.getSpToPx(12);
        this.placeholderCircleColor = ThemeManagerKt.getTheme().getBackgroundAccent();
        this.imageLoadingColorDrawable = new ColorDrawable(this.imageLoadingColor);
        int[] OverlappingCirclesView = R.styleable.OverlappingCirclesView;
        q.f(OverlappingCirclesView, "OverlappingCirclesView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OverlappingCirclesView, 0, 0);
        q.f(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        c10 = j.c(obtainStyledAttributes.getInt(R.styleable.OverlappingCirclesView_oc_maxItems, this.maxItems), 0);
        this.maxItems = c10;
        this.overlapPx = obtainStyledAttributes.getDimensionPixelSize(R.styleable.OverlappingCirclesView_oc_overlap, this.overlapPx);
        this.separatorSizePx = obtainStyledAttributes.getDimensionPixelSize(R.styleable.OverlappingCirclesView_oc_separation, this.separatorSizePx);
        this.imageLoadingColor = obtainStyledAttributes.getColor(R.styleable.OverlappingCirclesView_oc_circleBgColor, this.imageLoadingColor);
        this.overflowBgColor = obtainStyledAttributes.getColor(R.styleable.OverlappingCirclesView_oc_overflowBgColor, this.overflowBgColor);
        this.overflowTextColor = obtainStyledAttributes.getColor(R.styleable.OverlappingCirclesView_oc_overflowTextColor, this.overflowTextColor);
        this.overflowTextSizePx = obtainStyledAttributes.getDimensionPixelSize(R.styleable.OverlappingCirclesView_oc_overflowTextSize, this.overflowTextSizePx);
        this.placeholderCircleColor = obtainStyledAttributes.getColor(R.styleable.OverlappingCirclesView_oc_placeholderColor, this.placeholderCircleColor);
        obtainStyledAttributes.recycle();
        setOrientation(0);
        this.overlapNegativeMargin = -Math.abs(this.overlapPx);
    }
}
