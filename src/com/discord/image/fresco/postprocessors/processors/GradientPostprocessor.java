package com.discord.image.fresco.postprocessors.processors;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import com.discord.image.fresco.postprocessors.PostProcessor;
import com.facebook.imagepipeline.request.BasePostprocessor;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C10843q;
import nf.C10853x;

@Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m15073d2 = {"Lcom/discord/image/fresco/postprocessors/processors/GradientPostprocessor;", "Lcom/facebook/imagepipeline/request/BasePostprocessor;", "gradient", "Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;", "(Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;)V", "process", "", "bitmap", "Landroid/graphics/Bitmap;", "Companion", "fresco_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class GradientPostprocessor extends BasePostprocessor {
    public static final Companion Companion = new Companion(null);
    private final PostProcessor.Gradient gradient;

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m15073d2 = {"Lcom/discord/image/fresco/postprocessors/processors/GradientPostprocessor$Companion;", "", "()V", "Point", "fresco_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {

        @Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m15073d2 = {"Lcom/discord/image/fresco/postprocessors/processors/GradientPostprocessor$Companion$Point;", "", "x", "", "y", "(FF)V", "getX", "()F", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fresco_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* loaded from: classes5.dex */
        private static final class Point {

            /* renamed from: x */
            private final float f8884x;

            /* renamed from: y */
            private final float f8885y;

            public Point(float f, float f2) {
                this.f8884x = f;
                this.f8885y = f2;
            }

            public static /* synthetic */ Point copy$default(Point point, float f, float f2, int i, Object obj) {
                if ((i & 1) != 0) {
                    f = point.f8884x;
                }
                if ((i & 2) != 0) {
                    f2 = point.f8885y;
                }
                return point.copy(f, f2);
            }

            public final float component1() {
                return this.f8884x;
            }

            public final float component2() {
                return this.f8885y;
            }

            public final Point copy(float f, float f2) {
                return new Point(f, f2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Point)) {
                    return false;
                }
                Point point = (Point) obj;
                return Float.compare(this.f8884x, point.f8884x) == 0 && Float.compare(this.f8885y, point.f8885y) == 0;
            }

            public final float getX() {
                return this.f8884x;
            }

            public final float getY() {
                return this.f8885y;
            }

            public int hashCode() {
                return (Float.floatToIntBits(this.f8884x) * 31) + Float.floatToIntBits(this.f8885y);
            }

            public String toString() {
                float f = this.f8884x;
                float f2 = this.f8885y;
                return "Point(x=" + f + ", y=" + f2 + ")";
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostProcessor.Gradient.Direction.values().length];
            try {
                iArr[PostProcessor.Gradient.Direction.LeftToRight.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostProcessor.Gradient.Direction.RightToLeft.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostProcessor.Gradient.Direction.TopToBottom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PostProcessor.Gradient.Direction.BottomToTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public GradientPostprocessor(PostProcessor.Gradient gradient) {
        C9677q.m14633g(gradient, "gradient");
        this.gradient = gradient;
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor
    public void process(Bitmap bitmap) {
        Pair pair;
        C9677q.m14633g(bitmap, "bitmap");
        int i = WhenMappings.$EnumSwitchMapping$0[this.gradient.getDirection().ordinal()];
        if (i == 1) {
            pair = C10853x.m10921a(new Companion.Point(0.0f, bitmap.getHeight() / 2.0f), new Companion.Point(bitmap.getWidth(), bitmap.getHeight() / 2.0f));
        } else if (i == 2) {
            pair = C10853x.m10921a(new Companion.Point(bitmap.getWidth(), bitmap.getHeight() / 2.0f), new Companion.Point(0.0f, bitmap.getHeight() / 2.0f));
        } else if (i == 3) {
            pair = C10853x.m10921a(new Companion.Point(bitmap.getWidth() / 2.0f, 0.0f), new Companion.Point(bitmap.getWidth() / 2.0f, bitmap.getHeight()));
        } else if (i == 4) {
            pair = C10853x.m10921a(new Companion.Point(bitmap.getWidth() / 2.0f, bitmap.getHeight()), new Companion.Point(bitmap.getWidth() / 2.0f, 0.0f));
        } else {
            throw new C10843q();
        }
        Companion.Point point = (Companion.Point) pair.m15067a();
        Companion.Point point2 = (Companion.Point) pair.m15066b();
        float height = bitmap.getHeight();
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(point.getX(), point.getY(), point2.getX(), point2.getY(), new int[]{this.gradient.getStartColor(), this.gradient.getEndColor()}, new float[]{this.gradient.getStartPosition(), this.gradient.getEndPosition()}, Shader.TileMode.CLAMP));
        Unit unit = Unit.f25780a;
        new Canvas(bitmap).drawRect(0.0f, 0.0f, bitmap.getWidth(), height, paint);
    }
}
