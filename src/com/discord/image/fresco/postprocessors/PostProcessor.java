package com.discord.image.fresco.postprocessors;

import com.discord.image.fresco.postprocessors.processors.CompositePostprocessor;
import com.discord.image.fresco.postprocessors.processors.GradientPostprocessor;
import com.discord.image.fresco.postprocessors.processors.GrayscalePostprocessor;
import com.discord.image.fresco.postprocessors.processors.SafeRoundAsCirclePostprocessor;
import com.facebook.imagepipeline.request.BasePostprocessor;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9907k;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11088q;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00052\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bJ\b\u0010\u0002\u001a\u00020\u0003H\u0016\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, m15073d2 = {"Lcom/discord/image/fresco/postprocessors/PostProcessor;", "", "create", "Lcom/facebook/imagepipeline/request/BasePostprocessor;", "Circle", "Companion", "Composite", "Gradient", "Grayscale", "Lcom/discord/image/fresco/postprocessors/PostProcessor$Circle;", "Lcom/discord/image/fresco/postprocessors/PostProcessor$Composite;", "Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;", "Lcom/discord/image/fresco/postprocessors/PostProcessor$Grayscale;", "fresco_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public interface PostProcessor {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m15073d2 = {"Lcom/discord/image/fresco/postprocessors/PostProcessor$Circle;", "Lcom/discord/image/fresco/postprocessors/PostProcessor;", "()V", "fresco_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Circle implements PostProcessor {
        public static final Circle INSTANCE = new Circle();

        private Circle() {
        }

        @Override // com.discord.image.fresco.postprocessors.PostProcessor
        public BasePostprocessor create() {
            return DefaultImpls.create(this);
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m15073d2 = {"Lcom/discord/image/fresco/postprocessors/PostProcessor$Companion;", "", "()V", "create", "Lcom/facebook/imagepipeline/request/BasePostprocessor;", "processor", "Lcom/discord/image/fresco/postprocessors/PostProcessor;", "fresco_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final BasePostprocessor create(PostProcessor processor) {
            int t;
            C9971q.m14633g(processor, "processor");
            if (processor instanceof Composite) {
                List<PostProcessor> postprocessors = ((Composite) processor).getPostprocessors();
                t = C9907k.m14809t(postprocessors, 10);
                ArrayList arrayList = new ArrayList(t);
                for (PostProcessor postProcessor : postprocessors) {
                    arrayList.add($$INSTANCE.create(postProcessor));
                }
                return new CompositePostprocessor(arrayList);
            } else if (processor instanceof Circle) {
                return new SafeRoundAsCirclePostprocessor();
            } else {
                if (processor instanceof Grayscale) {
                    return GrayscalePostprocessor.INSTANCE;
                }
                if (processor instanceof Gradient) {
                    return new GradientPostprocessor((Gradient) processor);
                }
                throw new C11088q();
            }
        }
    }

    @Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003\"\u00020\u0001¢\u0006\u0002\u0010\u0004B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m15073d2 = {"Lcom/discord/image/fresco/postprocessors/PostProcessor$Composite;", "Lcom/discord/image/fresco/postprocessors/PostProcessor;", "postprocessors", "", "([Lcom/discord/image/fresco/postprocessors/PostProcessor;)V", "", "(Ljava/util/List;)V", "getPostprocessors", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "fresco_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Composite implements PostProcessor {
        private final List<PostProcessor> postprocessors;

        /* JADX WARN: Multi-variable type inference failed */
        public Composite(List<? extends PostProcessor> postprocessors) {
            C9971q.m14633g(postprocessors, "postprocessors");
            this.postprocessors = postprocessors;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Composite copy$default(Composite composite, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = composite.postprocessors;
            }
            return composite.copy(list);
        }

        public final List<PostProcessor> component1() {
            return this.postprocessors;
        }

        public final Composite copy(List<? extends PostProcessor> postprocessors) {
            C9971q.m14633g(postprocessors, "postprocessors");
            return new Composite(postprocessors);
        }

        @Override // com.discord.image.fresco.postprocessors.PostProcessor
        public BasePostprocessor create() {
            return DefaultImpls.create(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Composite) && C9971q.m14638b(this.postprocessors, ((Composite) obj).postprocessors);
        }

        public final List<PostProcessor> getPostprocessors() {
            return this.postprocessors;
        }

        public int hashCode() {
            return this.postprocessors.hashCode();
        }

        public String toString() {
            List<PostProcessor> list = this.postprocessors;
            return "Composite(postprocessors=" + list + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Composite(com.discord.image.fresco.postprocessors.PostProcessor... r2) {
            /*
                r1 = this;
                java.lang.String r0 = "postprocessors"
                kotlin.jvm.internal.C9971q.m14633g(r2, r0)
                java.util.List r2 = kotlin.collections.C9894b.m15002u0(r2)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.image.fresco.postprocessors.PostProcessor.Composite.<init>(com.discord.image.fresco.postprocessors.PostProcessor[]):void");
        }
    }

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class DefaultImpls {
        public static BasePostprocessor create(PostProcessor postProcessor) {
            return PostProcessor.Companion.create(postProcessor);
        }
    }

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m15073d2 = {"Lcom/discord/image/fresco/postprocessors/PostProcessor$Grayscale;", "Lcom/discord/image/fresco/postprocessors/PostProcessor;", "()V", "fresco_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Grayscale implements PostProcessor {
        public static final Grayscale INSTANCE = new Grayscale();

        private Grayscale() {
        }

        @Override // com.discord.image.fresco.postprocessors.PostProcessor
        public BasePostprocessor create() {
            return DefaultImpls.create(this);
        }
    }

    BasePostprocessor create();

    @Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001 B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\b\u0012\b\b\u0003\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006!"}, m15073d2 = {"Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;", "Lcom/discord/image/fresco/postprocessors/PostProcessor;", "direction", "Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;", "startColor", "", "endColor", "startPosition", "", "endPosition", "(Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;IIFF)V", "getDirection", "()Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;", "getEndColor", "()I", "getEndPosition", "()F", "getStartColor", "getStartPosition", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Direction", "fresco_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Gradient implements PostProcessor {
        private final Direction direction;
        private final int endColor;
        private final float endPosition;
        private final int startColor;
        private final float startPosition;

        @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m15073d2 = {"Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;", "", "(Ljava/lang/String;I)V", "LeftToRight", "RightToLeft", "TopToBottom", "BottomToTop", "fresco_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* loaded from: classes5.dex */
        public enum Direction {
            LeftToRight,
            RightToLeft,
            TopToBottom,
            BottomToTop
        }

        public Gradient(Direction direction, int i, int i2, float f, float f2) {
            C9971q.m14633g(direction, "direction");
            this.direction = direction;
            this.startColor = i;
            this.endColor = i2;
            this.startPosition = f;
            this.endPosition = f2;
        }

        public static /* synthetic */ Gradient copy$default(Gradient gradient, Direction direction, int i, int i2, float f, float f2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                direction = gradient.direction;
            }
            if ((i3 & 2) != 0) {
                i = gradient.startColor;
            }
            if ((i3 & 4) != 0) {
                i2 = gradient.endColor;
            }
            if ((i3 & 8) != 0) {
                f = gradient.startPosition;
            }
            if ((i3 & 16) != 0) {
                f2 = gradient.endPosition;
            }
            return gradient.copy(direction, i, i2, f, f2);
        }

        public final Direction component1() {
            return this.direction;
        }

        public final int component2() {
            return this.startColor;
        }

        public final int component3() {
            return this.endColor;
        }

        public final float component4() {
            return this.startPosition;
        }

        public final float component5() {
            return this.endPosition;
        }

        public final Gradient copy(Direction direction, int i, int i2, float f, float f2) {
            C9971q.m14633g(direction, "direction");
            return new Gradient(direction, i, i2, f, f2);
        }

        @Override // com.discord.image.fresco.postprocessors.PostProcessor
        public BasePostprocessor create() {
            return DefaultImpls.create(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Gradient)) {
                return false;
            }
            Gradient gradient = (Gradient) obj;
            return this.direction == gradient.direction && this.startColor == gradient.startColor && this.endColor == gradient.endColor && Float.compare(this.startPosition, gradient.startPosition) == 0 && Float.compare(this.endPosition, gradient.endPosition) == 0;
        }

        public final Direction getDirection() {
            return this.direction;
        }

        public final int getEndColor() {
            return this.endColor;
        }

        public final float getEndPosition() {
            return this.endPosition;
        }

        public final int getStartColor() {
            return this.startColor;
        }

        public final float getStartPosition() {
            return this.startPosition;
        }

        public int hashCode() {
            return (((((((this.direction.hashCode() * 31) + this.startColor) * 31) + this.endColor) * 31) + Float.floatToIntBits(this.startPosition)) * 31) + Float.floatToIntBits(this.endPosition);
        }

        public String toString() {
            Direction direction = this.direction;
            int i = this.startColor;
            int i2 = this.endColor;
            float f = this.startPosition;
            float f2 = this.endPosition;
            return "Gradient(direction=" + direction + ", startColor=" + i + ", endColor=" + i2 + ", startPosition=" + f + ", endPosition=" + f2 + ")";
        }

        public /* synthetic */ Gradient(Direction direction, int i, int i2, float f, float f2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(direction, i, i2, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? 1.0f : f2);
        }
    }
}
