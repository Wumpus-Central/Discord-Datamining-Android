.class Lcom/horcrux/svg/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/horcrux/svg/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field private static final a:[Lcom/horcrux/svg/l0;

.field private static final b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    new-array v1, v0, [Lcom/horcrux/svg/l0;

    .line 4
    .line 5
    sget-object v2, Lcom/horcrux/svg/l0;->n:Lcom/horcrux/svg/l0;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    aput-object v2, v1, v3

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    aput-object v2, v1, v3

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    sget-object v3, Lcom/horcrux/svg/l0;->o:Lcom/horcrux/svg/l0;

    .line 15
    .line 16
    aput-object v3, v1, v2

    .line 17
    .line 18
    const/4 v2, 0x3

    .line 19
    sget-object v3, Lcom/horcrux/svg/l0;->p:Lcom/horcrux/svg/l0;

    .line 20
    .line 21
    aput-object v3, v1, v2

    .line 22
    .line 23
    const/4 v2, 0x4

    .line 24
    sget-object v3, Lcom/horcrux/svg/l0;->l:Lcom/horcrux/svg/l0;

    .line 25
    .line 26
    aput-object v3, v1, v2

    .line 27
    .line 28
    const/4 v2, 0x5

    .line 29
    sget-object v3, Lcom/horcrux/svg/l0;->r:Lcom/horcrux/svg/l0;

    .line 30
    .line 31
    aput-object v3, v1, v2

    .line 32
    .line 33
    const/4 v2, 0x6

    .line 34
    sget-object v3, Lcom/horcrux/svg/l0;->s:Lcom/horcrux/svg/l0;

    .line 35
    .line 36
    aput-object v3, v1, v2

    .line 37
    .line 38
    const/4 v2, 0x7

    .line 39
    sget-object v3, Lcom/horcrux/svg/l0;->m:Lcom/horcrux/svg/l0;

    .line 40
    .line 41
    aput-object v3, v1, v2

    .line 42
    .line 43
    const/16 v2, 0x8

    .line 44
    .line 45
    sget-object v3, Lcom/horcrux/svg/l0;->u:Lcom/horcrux/svg/l0;

    .line 46
    .line 47
    aput-object v3, v1, v2

    .line 48
    .line 49
    sget-object v2, Lcom/horcrux/svg/l0;->v:Lcom/horcrux/svg/l0;

    .line 50
    .line 51
    const/16 v3, 0x9

    .line 52
    .line 53
    aput-object v2, v1, v3

    .line 54
    .line 55
    const/16 v3, 0xa

    .line 56
    .line 57
    aput-object v2, v1, v3

    .line 58
    .line 59
    sput-object v1, Lcom/horcrux/svg/h$a;->a:[Lcom/horcrux/svg/l0;

    .line 60
    .line 61
    new-array v0, v0, [I

    .line 62
    .line 63
    fill-array-data v0, :array_0

    .line 64
    .line 65
    .line 66
    sput-object v0, Lcom/horcrux/svg/h$a;->b:[I

    .line 67
    .line 68
    return-void

    .line 69
    :array_0
    .array-data 4
        0x190
        0x2bc
        0x64
        0xc8
        0x12c
        0x190
        0x1f4
        0x258
        0x2bc
        0x320
        0x384
    .end array-data
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method

.method private static a(I)I
    .locals 1

    const/16 v0, 0x15e

    if-ge p0, v0, :cond_0

    const/16 p0, 0x190

    return p0

    :cond_0
    const/16 v0, 0x226

    if-ge p0, v0, :cond_1

    const/16 p0, 0x2bc

    return p0

    :cond_1
    const/16 v0, 0x384

    if-ge p0, v0, :cond_2

    return v0

    :cond_2
    return p0
.end method

.method static b(Lcom/horcrux/svg/l0;Lcom/horcrux/svg/h;)I
    .locals 1

    .line 1
    sget-object v0, Lcom/horcrux/svg/l0;->w:Lcom/horcrux/svg/l0;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    iget p0, p1, Lcom/horcrux/svg/h;->f:I

    .line 6
    .line 7
    invoke-static {p0}, Lcom/horcrux/svg/h$a;->a(I)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    sget-object v0, Lcom/horcrux/svg/l0;->x:Lcom/horcrux/svg/l0;

    .line 13
    .line 14
    if-ne p0, v0, :cond_1

    .line 15
    .line 16
    iget p0, p1, Lcom/horcrux/svg/h;->f:I

    .line 17
    .line 18
    invoke-static {p0}, Lcom/horcrux/svg/h$a;->c(I)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_1
    sget-object p1, Lcom/horcrux/svg/h$a;->b:[I

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    aget p0, p1, p0

    .line 30
    .line 31
    return p0
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
.end method

.method private static c(I)I
    .locals 2

    const/16 v0, 0x64

    if-ge p0, v0, :cond_0

    return p0

    :cond_0
    const/16 v1, 0x226

    if-ge p0, v1, :cond_1

    return v0

    :cond_1
    const/16 v0, 0x2ee

    if-ge p0, v0, :cond_2

    const/16 p0, 0x190

    return p0

    :cond_2
    const/16 p0, 0x2bc

    return p0
.end method

.method static d(I)Lcom/horcrux/svg/l0;
    .locals 2

    sget-object v0, Lcom/horcrux/svg/h$a;->a:[Lcom/horcrux/svg/l0;

    int-to-float p0, p0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr p0, v1

    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    aget-object p0, v0, p0

    return-object p0
.end method
