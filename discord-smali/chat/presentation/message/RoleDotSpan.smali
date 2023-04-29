.class public final Lcom/discord/chat/presentation/message/RoleDotSpan;
.super Landroid/text/style/DynamicDrawableSpan;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u0008\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/RoleDotSpan;",
        "Landroid/text/style/DynamicDrawableSpan;",
        "context",
        "Landroid/content/Context;",
        "backgroundColor",
        "",
        "spSize",
        "(Landroid/content/Context;II)V",
        "backgroundDrawable",
        "Landroid/graphics/drawable/ColorDrawable;",
        "borderColor",
        "layerDrawable",
        "Landroid/graphics/drawable/LayerDrawable;",
        "pxSize",
        "roleDot",
        "Lcom/discord/chat/presentation/message/viewholder/RoleDotDrawable;",
        "scale",
        "",
        "topPos",
        "getDrawable",
        "Landroid/graphics/drawable/Drawable;",
        "setColor",
        "",
        "roleColor",
        "chat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final backgroundDrawable:Landroid/graphics/drawable/ColorDrawable;

.field private final borderColor:I

.field private final layerDrawable:Landroid/graphics/drawable/LayerDrawable;

.field private final pxSize:I

.field private final roleDot:Lcom/discord/chat/presentation/message/viewholder/RoleDotDrawable;

.field private final scale:F

.field private final spSize:I

.field private final topPos:I


# direct methods
.method public constructor <init>(Landroid/content/Context;II)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Landroid/text/style/DynamicDrawableSpan;-><init>()V

    iput p3, p0, Lcom/discord/chat/presentation/message/RoleDotSpan;->spSize:I

    .line 2
    sget-object v0, Lcom/discord/react/FontManager;->INSTANCE:Lcom/discord/react/FontManager;

    invoke-virtual {v0, p1}, Lcom/discord/react/FontManager;->getFontScale(Landroid/content/Context;)F

    move-result v0

    iput v0, p0, Lcom/discord/chat/presentation/message/RoleDotSpan;->scale:F

    .line 3
    invoke-static {p3}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getSpToPx(I)I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, v0

    float-to-int v0, v1

    iput v0, p0, Lcom/discord/chat/presentation/message/RoleDotSpan;->pxSize:I

    mul-int/lit8 v0, p3, -0x1

    .line 4
    div-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getSpToPx(I)I

    move-result v0

    iput v0, p0, Lcom/discord/chat/presentation/message/RoleDotSpan;->topPos:I

    .line 5
    sget v0, Lcom/discord/chat/R$color;->black:I

    .line 6
    sget v1, Lcom/discord/chat/R$color;->white:I

    .line 7
    invoke-static {p1, v0, v1}, Lcom/discord/theme/utils/ColorUtilsKt;->getThemeColor(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lcom/discord/chat/presentation/message/RoleDotSpan;->borderColor:I

    .line 8
    new-instance v1, Lcom/discord/chat/presentation/message/viewholder/RoleDotDrawable;

    invoke-direct {v1, p1, v0, p3}, Lcom/discord/chat/presentation/message/viewholder/RoleDotDrawable;-><init>(Landroid/content/Context;II)V

    iput-object v1, p0, Lcom/discord/chat/presentation/message/RoleDotSpan;->roleDot:Lcom/discord/chat/presentation/message/viewholder/RoleDotDrawable;

    .line 9
    new-instance p1, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {p1, p2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/RoleDotSpan;->backgroundDrawable:Landroid/graphics/drawable/ColorDrawable;

    .line 10
    new-instance p2, Landroid/graphics/drawable/LayerDrawable;

    const/4 p3, 0x2

    new-array p3, p3, [Landroid/graphics/drawable/Drawable;

    const/4 v0, 0x0

    aput-object p1, p3, v0

    const/4 p1, 0x1

    aput-object v1, p3, p1

    invoke-direct {p2, p3}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iput-object p2, p0, Lcom/discord/chat/presentation/message/RoleDotSpan;->layerDrawable:Landroid/graphics/drawable/LayerDrawable;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/16 p3, 0x14

    .line 11
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/discord/chat/presentation/message/RoleDotSpan;-><init>(Landroid/content/Context;II)V

    return-void
.end method


# virtual methods
.method public getDrawable()Landroid/graphics/drawable/Drawable;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/message/RoleDotSpan;->layerDrawable:Landroid/graphics/drawable/LayerDrawable;

    .line 2
    .line 3
    iget v1, p0, Lcom/discord/chat/presentation/message/RoleDotSpan;->topPos:I

    .line 4
    .line 5
    iget v2, p0, Lcom/discord/chat/presentation/message/RoleDotSpan;->pxSize:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-virtual {v0, v3, v1, v2, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/discord/chat/presentation/message/RoleDotSpan;->layerDrawable:Landroid/graphics/drawable/LayerDrawable;

    .line 12
    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public final setColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/RoleDotSpan;->roleDot:Lcom/discord/chat/presentation/message/viewholder/RoleDotDrawable;

    invoke-virtual {v0, p1}, Lcom/discord/chat/presentation/message/viewholder/RoleDotDrawable;->setColor(I)V

    return-void
.end method
