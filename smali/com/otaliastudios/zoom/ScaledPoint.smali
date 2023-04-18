.class public final Lcom/otaliastudios/zoom/ScaledPoint;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\n\u00a2\u0006\u0004\u0008 \u0010!J\u001c\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002H\u0007J\u0011\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\u0002J!\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0004\u001a\u00020\nH\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u0003\u001a\u00020\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR\"\u0010\u0004\u001a\u00020\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010\u0018\u001a\u0004\u0008\u001e\u0010\u001a\"\u0004\u0008\u001f\u0010\u001c\u00a8\u0006\""
    }
    d2 = {
        "Lcom/otaliastudios/zoom/ScaledPoint;",
        "",
        "",
        "x",
        "y",
        "",
        "g",
        "scaledPoint",
        "e",
        "f",
        "",
        "scale",
        "Lcom/otaliastudios/zoom/AbsolutePoint;",
        "outPoint",
        "j",
        "(FLcom/otaliastudios/zoom/AbsolutePoint;)Lcom/otaliastudios/zoom/AbsolutePoint;",
        "a",
        "",
        "toString",
        "",
        "hashCode",
        "other",
        "",
        "equals",
        "F",
        "c",
        "()F",
        "h",
        "(F)V",
        "b",
        "d",
        "i",
        "<init>",
        "(FF)V",
        "library_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field private a:F

.field private b:F


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v2, v0, v1}, Lcom/otaliastudios/zoom/ScaledPoint;-><init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(FF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/otaliastudios/zoom/ScaledPoint;->a:F

    .line 3
    iput p2, p0, Lcom/otaliastudios/zoom/ScaledPoint;->b:F

    return-void
.end method

.method public synthetic constructor <init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move p2, v0

    .line 4
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/otaliastudios/zoom/ScaledPoint;-><init>(FF)V

    return-void
.end method

.method public static synthetic b(Lcom/otaliastudios/zoom/ScaledPoint;FFILjava/lang/Object;)Lcom/otaliastudios/zoom/ScaledPoint;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/otaliastudios/zoom/ScaledPoint;->a:F

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lcom/otaliastudios/zoom/ScaledPoint;->b:F

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/otaliastudios/zoom/ScaledPoint;->a(FF)Lcom/otaliastudios/zoom/ScaledPoint;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/otaliastudios/zoom/ScaledPoint;FLcom/otaliastudios/zoom/AbsolutePoint;ILjava/lang/Object;)Lcom/otaliastudios/zoom/AbsolutePoint;
    .locals 1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Lcom/otaliastudios/zoom/AbsolutePoint;

    const/4 p3, 0x3

    const/4 p4, 0x0

    const/4 v0, 0x0

    invoke-direct {p2, v0, v0, p3, p4}, Lcom/otaliastudios/zoom/AbsolutePoint;-><init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/otaliastudios/zoom/ScaledPoint;->j(FLcom/otaliastudios/zoom/AbsolutePoint;)Lcom/otaliastudios/zoom/AbsolutePoint;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(FF)Lcom/otaliastudios/zoom/ScaledPoint;
    .locals 1

    new-instance v0, Lcom/otaliastudios/zoom/ScaledPoint;

    invoke-direct {v0, p1, p2}, Lcom/otaliastudios/zoom/ScaledPoint;-><init>(FF)V

    return-object v0
.end method

.method public final c()F
    .locals 1

    iget v0, p0, Lcom/otaliastudios/zoom/ScaledPoint;->a:F

    return v0
.end method

.method public final d()F
    .locals 1

    iget v0, p0, Lcom/otaliastudios/zoom/ScaledPoint;->b:F

    return v0
.end method

.method public final e(Lcom/otaliastudios/zoom/ScaledPoint;)Lcom/otaliastudios/zoom/ScaledPoint;
    .locals 3

    .line 1
    const-string v0, "scaledPoint"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/otaliastudios/zoom/ScaledPoint;

    .line 7
    .line 8
    iget v1, p0, Lcom/otaliastudios/zoom/ScaledPoint;->a:F

    .line 9
    .line 10
    iget v2, p1, Lcom/otaliastudios/zoom/ScaledPoint;->a:F

    .line 11
    .line 12
    sub-float/2addr v1, v2

    .line 13
    iget v2, p0, Lcom/otaliastudios/zoom/ScaledPoint;->b:F

    .line 14
    .line 15
    iget p1, p1, Lcom/otaliastudios/zoom/ScaledPoint;->b:F

    .line 16
    .line 17
    sub-float/2addr v2, p1

    .line 18
    invoke-direct {v0, v1, v2}, Lcom/otaliastudios/zoom/ScaledPoint;-><init>(FF)V

    .line 19
    .line 20
    .line 21
    return-object v0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/otaliastudios/zoom/ScaledPoint;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/otaliastudios/zoom/ScaledPoint;

    iget v1, p0, Lcom/otaliastudios/zoom/ScaledPoint;->a:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v3, p1, Lcom/otaliastudios/zoom/ScaledPoint;->a:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/otaliastudios/zoom/ScaledPoint;->b:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget p1, p1, Lcom/otaliastudios/zoom/ScaledPoint;->b:F

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final f(Lcom/otaliastudios/zoom/ScaledPoint;)Lcom/otaliastudios/zoom/ScaledPoint;
    .locals 3

    .line 1
    const-string v0, "scaledPoint"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/otaliastudios/zoom/ScaledPoint;

    .line 7
    .line 8
    iget v1, p0, Lcom/otaliastudios/zoom/ScaledPoint;->a:F

    .line 9
    .line 10
    iget v2, p1, Lcom/otaliastudios/zoom/ScaledPoint;->a:F

    .line 11
    .line 12
    add-float/2addr v1, v2

    .line 13
    iget v2, p0, Lcom/otaliastudios/zoom/ScaledPoint;->b:F

    .line 14
    .line 15
    iget p1, p1, Lcom/otaliastudios/zoom/ScaledPoint;->b:F

    .line 16
    .line 17
    add-float/2addr v2, p1

    .line 18
    invoke-direct {v0, v1, v2}, Lcom/otaliastudios/zoom/ScaledPoint;-><init>(FF)V

    .line 19
    .line 20
    .line 21
    return-object v0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public final g(Ljava/lang/Number;Ljava/lang/Number;)V
    .locals 1

    .line 1
    const-string v0, "x"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "y"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iput p1, p0, Lcom/otaliastudios/zoom/ScaledPoint;->a:F

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iput p1, p0, Lcom/otaliastudios/zoom/ScaledPoint;->b:F

    .line 22
    .line 23
    return-void
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
.end method

.method public final h(F)V
    .locals 0

    iput p1, p0, Lcom/otaliastudios/zoom/ScaledPoint;->a:F

    return-void
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/otaliastudios/zoom/ScaledPoint;->a:F

    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/otaliastudios/zoom/ScaledPoint;->b:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i(F)V
    .locals 0

    iput p1, p0, Lcom/otaliastudios/zoom/ScaledPoint;->b:F

    return-void
.end method

.method public final j(FLcom/otaliastudios/zoom/AbsolutePoint;)Lcom/otaliastudios/zoom/AbsolutePoint;
    .locals 2

    .line 1
    const-string v0, "outPoint"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lcom/otaliastudios/zoom/ScaledPoint;->a:F

    .line 7
    .line 8
    div-float/2addr v0, p1

    .line 9
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v1, p0, Lcom/otaliastudios/zoom/ScaledPoint;->b:F

    .line 14
    .line 15
    div-float/2addr v1, p1

    .line 16
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p2, v0, p1}, Lcom/otaliastudios/zoom/AbsolutePoint;->h(Ljava/lang/Number;Ljava/lang/Number;)V

    .line 21
    .line 22
    .line 23
    return-object p2
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
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ScaledPoint(x="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/otaliastudios/zoom/ScaledPoint;->a:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", y="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/otaliastudios/zoom/ScaledPoint;->b:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
