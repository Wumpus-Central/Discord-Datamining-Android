.class public Lcom/facebook/react/views/image/ScaleTypeStartInside;
.super Lcom/facebook/drawee/drawable/ScalingUtils$a;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/views/image/ScaleTypeStartInside;

    invoke-direct {v0}, Lcom/facebook/react/views/image/ScaleTypeStartInside;-><init>()V

    sput-object v0, Lcom/facebook/react/views/image/ScaleTypeStartInside;->INSTANCE:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/drawee/drawable/ScalingUtils$a;-><init>()V

    return-void
.end method


# virtual methods
.method public getTransformImpl(Landroid/graphics/Matrix;Landroid/graphics/Rect;IIFFFF)V
    .locals 0

    .line 1
    invoke-static {p7, p8}, Ljava/lang/Math;->min(FF)F

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    const/high16 p4, 0x3f800000    # 1.0f

    .line 6
    .line 7
    invoke-static {p3, p4}, Ljava/lang/Math;->min(FF)F

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    iget p4, p2, Landroid/graphics/Rect;->left:I

    .line 12
    .line 13
    int-to-float p4, p4

    .line 14
    iget p2, p2, Landroid/graphics/Rect;->top:I

    .line 15
    .line 16
    int-to-float p2, p2

    .line 17
    invoke-virtual {p1, p3, p3}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 18
    .line 19
    .line 20
    const/high16 p3, 0x3f000000    # 0.5f

    .line 21
    .line 22
    add-float/2addr p4, p3

    .line 23
    float-to-int p4, p4

    .line 24
    int-to-float p4, p4

    .line 25
    add-float/2addr p2, p3

    .line 26
    float-to-int p2, p2

    .line 27
    int-to-float p2, p2

    .line 28
    invoke-virtual {p1, p4, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "start_inside"

    return-object v0
.end method
