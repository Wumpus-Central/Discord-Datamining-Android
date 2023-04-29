.class public final Lcom/discord/chat/presentation/textutils/RenderContext$Insets;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/chat/presentation/textutils/RenderContext;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Insets"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B-\u0012\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\t\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/discord/chat/presentation/textutils/RenderContext$Insets;",
        "",
        "top",
        "",
        "bottom",
        "start",
        "end",
        "(IIII)V",
        "getBottom",
        "()I",
        "getEnd",
        "getStart",
        "getTop",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
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
.field private final bottom:I

.field private final end:I

.field private final start:I

.field private final top:I


# direct methods
.method public constructor <init>()V
    .locals 7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xf

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;-><init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->top:I

    .line 3
    iput p2, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->bottom:I

    .line 4
    iput p3, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->start:I

    .line 5
    iput p4, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->end:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move p4, v0

    .line 6
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;-><init>(IIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/chat/presentation/textutils/RenderContext$Insets;IIIIILjava/lang/Object;)Lcom/discord/chat/presentation/textutils/RenderContext$Insets;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->top:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->bottom:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->start:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->end:I

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->copy(IIII)Lcom/discord/chat/presentation/textutils/RenderContext$Insets;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->top:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->bottom:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->start:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->end:I

    return v0
.end method

.method public final copy(IIII)Lcom/discord/chat/presentation/textutils/RenderContext$Insets;
    .locals 1

    new-instance v0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;-><init>(IIII)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;

    iget v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->top:I

    iget v3, p1, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->top:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->bottom:I

    iget v3, p1, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->bottom:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->start:I

    iget v3, p1, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->start:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->end:I

    iget p1, p1, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->end:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBottom()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->bottom:I

    return v0
.end method

.method public final getEnd()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->end:I

    return v0
.end method

.method public final getStart()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->start:I

    return v0
.end method

.method public final getTop()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->top:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->top:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->bottom:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->start:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->end:I

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->top:I

    iget v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->bottom:I

    iget v2, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->start:I

    iget v3, p0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->end:I

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Insets(top="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", bottom="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", start="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", end="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
