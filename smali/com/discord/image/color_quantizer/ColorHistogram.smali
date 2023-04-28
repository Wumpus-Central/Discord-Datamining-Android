.class public final Lcom/discord/image/color_quantizer/ColorHistogram;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/image/color_quantizer/ColorHistogram$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/discord/image/color_quantizer/ColorHistogram;",
        "",
        "pixels",
        "",
        "([I)V",
        "colorCounts",
        "getColorCounts",
        "()[I",
        "colors",
        "getColors",
        "numberOfColors",
        "",
        "getNumberOfColors",
        "()I",
        "countFrequencies",
        "",
        "Companion",
        "color_quantizer_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/discord/image/color_quantizer/ColorHistogram$Companion;


# instance fields
.field private final colorCounts:[I

.field private final colors:[I

.field private final numberOfColors:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/image/color_quantizer/ColorHistogram$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/image/color_quantizer/ColorHistogram$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/image/color_quantizer/ColorHistogram;->Companion:Lcom/discord/image/color_quantizer/ColorHistogram$Companion;

    return-void
.end method

.method public constructor <init>([I)V
    .locals 2

    .line 1
    const-string v0, "pixels"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Ljava/util/Arrays;->sort([I)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Lcom/discord/image/color_quantizer/ColorHistogram;->Companion:Lcom/discord/image/color_quantizer/ColorHistogram$Companion;

    .line 13
    .line 14
    invoke-static {v0, p1}, Lcom/discord/image/color_quantizer/ColorHistogram$Companion;->access$countDistinctColors(Lcom/discord/image/color_quantizer/ColorHistogram$Companion;[I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iput v0, p0, Lcom/discord/image/color_quantizer/ColorHistogram;->numberOfColors:I

    .line 19
    .line 20
    new-array v1, v0, [I

    .line 21
    .line 22
    iput-object v1, p0, Lcom/discord/image/color_quantizer/ColorHistogram;->colors:[I

    .line 23
    .line 24
    new-array v0, v0, [I

    .line 25
    .line 26
    iput-object v0, p0, Lcom/discord/image/color_quantizer/ColorHistogram;->colorCounts:[I

    .line 27
    .line 28
    invoke-direct {p0, p1}, Lcom/discord/image/color_quantizer/ColorHistogram;->countFrequencies([I)V

    .line 29
    .line 30
    .line 31
    return-void
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
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
.end method

.method private final countFrequencies([I)V
    .locals 7

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v2

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v0, v1

    .line 9
    :goto_0
    if-eqz v0, :cond_1

    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    aget v0, p1, v1

    .line 13
    .line 14
    iget-object v3, p0, Lcom/discord/image/color_quantizer/ColorHistogram;->colors:[I

    .line 15
    .line 16
    aput v0, v3, v1

    .line 17
    .line 18
    iget-object v3, p0, Lcom/discord/image/color_quantizer/ColorHistogram;->colorCounts:[I

    .line 19
    .line 20
    aput v2, v3, v1

    .line 21
    .line 22
    array-length v3, p1

    .line 23
    if-ne v3, v2, :cond_2

    .line 24
    .line 25
    return-void

    .line 26
    :cond_2
    array-length v3, p1

    .line 27
    move v4, v2

    .line 28
    :goto_1
    if-ge v4, v3, :cond_4

    .line 29
    .line 30
    aget v5, p1, v4

    .line 31
    .line 32
    if-ne v5, v0, :cond_3

    .line 33
    .line 34
    iget-object v5, p0, Lcom/discord/image/color_quantizer/ColorHistogram;->colorCounts:[I

    .line 35
    .line 36
    aget v6, v5, v1

    .line 37
    .line 38
    add-int/2addr v6, v2

    .line 39
    aput v6, v5, v1

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    iget-object v0, p0, Lcom/discord/image/color_quantizer/ColorHistogram;->colors:[I

    .line 45
    .line 46
    aput v5, v0, v1

    .line 47
    .line 48
    iget-object v0, p0, Lcom/discord/image/color_quantizer/ColorHistogram;->colorCounts:[I

    .line 49
    .line 50
    aput v2, v0, v1

    .line 51
    .line 52
    move v0, v5

    .line 53
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_4
    return-void
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
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
.end method


# virtual methods
.method public final getColorCounts()[I
    .locals 1

    iget-object v0, p0, Lcom/discord/image/color_quantizer/ColorHistogram;->colorCounts:[I

    return-object v0
.end method

.method public final getColors()[I
    .locals 1

    iget-object v0, p0, Lcom/discord/image/color_quantizer/ColorHistogram;->colors:[I

    return-object v0
.end method

.method public final getNumberOfColors()I
    .locals 1

    iget v0, p0, Lcom/discord/image/color_quantizer/ColorHistogram;->numberOfColors:I

    return v0
.end method
