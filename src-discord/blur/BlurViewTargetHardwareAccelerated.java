package com.discord.blur;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import com.discord.blur.BlurView;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import j$.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0001*B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J0\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tH\u0016J\u0012\u0010\u001d\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J0\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0014J\u0010\u0010'\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\tH\u0016J\u0018\u0010(\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010)\u001a\u00020\nH\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/discord/blur/BlurViewTargetHardwareAccelerated;", "Lcom/discord/blur/BlurViewTargetBase;", "context", "Landroid/content/Context;", "blurTargetNativeId", "", "(Landroid/content/Context;Ljava/lang/String;)V", "blurAmounts", "", "", "", "blurContentRenderNode", "Landroid/graphics/RenderNode;", "blurRectRenderNodes", "blurRects", "Lcom/discord/blur/BlurViewTargetHardwareAccelerated$BlurRect;", "blurViewTargetHeight", "blurViewTargetLocation", "", "blurViewTargetWidth", "blurViewTargetWindowOffsetX", "blurViewTargetWindowOffsetY", "addBlurRect", "", "rectId", "windowX", "windowY", "width", "height", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", ViewProps.ON_LAYOUT, "changed", "", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "removeBlurRect", "setBlurAmount", "blurAmount", "BlurRect", "blur_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})

public final class BlurViewTargetHardwareAccelerated extends BlurViewTargetBase {
    private int blurViewTargetWidth = -1;
    private int blurViewTargetHeight = -1;
    private int blurViewTargetWindowOffsetX = -1;
    private int blurViewTargetWindowOffsetY = -1;
    private int[] blurViewTargetLocation = new int[2];
    private Map<Integer, Float> blurAmounts = new HashMap();
    private final Map<Integer, BlurRect> blurRects = new HashMap();
    private final Map<Integer, RenderNode> blurRectRenderNodes = new HashMap();
    private final RenderNode blurContentRenderNode = new RenderNode("content");

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/discord/blur/BlurViewTargetHardwareAccelerated$BlurRect;", "", "windowX", "", "windowY", "width", "height", "(IIII)V", "getHeight", "()I", "getWidth", "getWindowX", "getWindowY", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "blur_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    private static final class BlurRect {
        private final int height;
        private final int width;
        private final int windowX;
        private final int windowY;

        public BlurRect(int i10, int i11, int i12, int i13) {
            this.windowX = i10;
            this.windowY = i11;
            this.width = i12;
            this.height = i13;
        }

        public static  BlurRect copy$default(BlurRect blurRect, int i10, int i11, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i10 = blurRect.windowX;
            }
            if ((i14 & 2) != 0) {
                i11 = blurRect.windowY;
            }
            if ((i14 & 4) != 0) {
                i12 = blurRect.width;
            }
            if ((i14 & 8) != 0) {
                i13 = blurRect.height;
            }
            return blurRect.copy(i10, i11, i12, i13);
        }

        public final int component1() {
            return this.windowX;
        }

        public final int component2() {
            return this.windowY;
        }

        public final int component3() {
            return this.width;
        }

        public final int component4() {
            return this.height;
        }

        public final BlurRect copy(int i10, int i11, int i12, int i13) {
            return new BlurRect(i10, i11, i12, i13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BlurRect)) {
                return false;
            }
            BlurRect blurRect = (BlurRect) obj;
            return this.windowX == blurRect.windowX && this.windowY == blurRect.windowY && this.width == blurRect.width && this.height == blurRect.height;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public final int getWindowX() {
            return this.windowX;
        }

        public final int getWindowY() {
            return this.windowY;
        }

        public int hashCode() {
            return (((((this.windowX * 31) + this.windowY) * 31) + this.width) * 31) + this.height;
        }

        public String toString() {
            int i10 = this.windowX;
            int i11 = this.windowY;
            int i12 = this.width;
            int i13 = this.height;
            return "BlurRect(windowX=" + i10 + ", windowY=" + i11 + ", width=" + i12 + ", height=" + i13 + ")";
        }
    }

    
    public BlurViewTargetHardwareAccelerated(Context context, String blurTargetNativeId) {
        super(context, blurTargetNativeId);
        q.h(context, "context");
        q.h(blurTargetNativeId, "blurTargetNativeId");
    }

    
    @Override 
    
    public void addBlurRect(int r7, int r8, int r9, int r10, int r11) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.blur.BlurViewTargetHardwareAccelerated.addBlurRect(int, int, int, int, int):void");
    }

    
    @Override 
    public void dispatchDraw(Canvas canvas) {
        RecordingCanvas beginRecording;
        RenderEffect createBlurEffect;
        RecordingCanvas beginRecording2;
        boolean z10;
        boolean z11;
        Map<Integer, BlurRect> map = this.blurRects;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<Integer, BlurRect>> it = map.entrySet().iterator();
        while (true) {
            boolean z12 = false;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<Integer, BlurRect> next = it.next();
            int intValue = next.getKey().intValue();
            BlurRect value = next.getValue();
            if (value.getWidth() == 0 || value.getHeight() == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (((Number) Map.EL.getOrDefault(this.blurAmounts, Integer.valueOf(intValue), Float.valueOf(-1.0f))).floatValue() > 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                z12 = true;
            }
            if (z12) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            super.dispatchDraw(canvas);
            return;
        }
        this.blurContentRenderNode.setPosition(0, 0, this.blurViewTargetWidth, this.blurViewTargetHeight);
        beginRecording = this.blurContentRenderNode.beginRecording();
        super.dispatchDraw(beginRecording);
        this.blurContentRenderNode.endRecording();
        if (canvas != null) {
            canvas.drawRenderNode(this.blurContentRenderNode);
        }
        for (Map.Entry<Integer, RenderNode> entry : this.blurRectRenderNodes.entrySet()) {
            int intValue2 = entry.getKey().intValue();
            RenderNode value2 = entry.getValue();
            BlurRect blurRect = (BlurRect) linkedHashMap.get(Integer.valueOf(intValue2));
            if (blurRect != null) {
                float floatValue = ((Number) Map.EL.getOrDefault(this.blurAmounts, Integer.valueOf(intValue2), Float.valueOf(-1.0f))).floatValue();
                createBlurEffect = RenderEffect.createBlurEffect(Math.abs(floatValue), Math.abs(floatValue), Shader.TileMode.CLAMP);
                value2.setRenderEffect(createBlurEffect);
                value2.setPosition(0, 0, blurRect.getWidth(), blurRect.getHeight());
                value2.setTranslationX(blurRect.getWindowX() - this.blurViewTargetWindowOffsetX);
                value2.setTranslationY(blurRect.getWindowY() - this.blurViewTargetWindowOffsetY);
                beginRecording2 = value2.beginRecording();
                beginRecording2.translate(-(blurRect.getWindowX() - this.blurViewTargetWindowOffsetX), -(blurRect.getWindowY() - this.blurViewTargetWindowOffsetY));
                beginRecording2.drawRenderNode(this.blurContentRenderNode);
                value2.endRecording();
                if (canvas != null) {
                    canvas.drawRenderNode(value2);
                }
            }
        }
    }

    
    @Override 
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        getLocationInWindow(this.blurViewTargetLocation);
        this.blurViewTargetWidth = getWidth();
        this.blurViewTargetHeight = getHeight();
        int[] iArr = this.blurViewTargetLocation;
        this.blurViewTargetWindowOffsetX = iArr[0];
        this.blurViewTargetWindowOffsetY = iArr[1];
    }

    @Override 
    public void removeBlurRect(int i10) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (this.blurRects.remove(Integer.valueOf(i10)) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.blurRectRenderNodes.remove(Integer.valueOf(i10)) != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.blurAmounts.remove(Integer.valueOf(i10)) == null) {
            z12 = false;
        }
        if (z10 || z11 || z12) {
            invalidate();
        }
    }

    @Override 
    public void setBlurAmount(int i10, float f10) {
        float dpToPx = SizeUtilsKt.getDpToPx(BlurView.Companion.mapRadius$blur_release$default(BlurView.Companion, f10, 36.0f, 0.0f, 4, null));
        if (!q.b(this.blurAmounts.get(Integer.valueOf(i10)), dpToPx)) {
            this.blurAmounts.put(Integer.valueOf(i10), Float.valueOf(dpToPx));
            invalidate();
        }
    }
}
