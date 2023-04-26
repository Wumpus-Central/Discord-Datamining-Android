.class public Lcom/facebook/react/uimanager/Spacing;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ALL:I = 0x8

.field public static final BOTTOM:I = 0x3

.field public static final END:I = 0x5

.field public static final HORIZONTAL:I = 0x6

.field public static final LEFT:I = 0x0

.field public static final RIGHT:I = 0x2

.field public static final START:I = 0x4

.field public static final TOP:I = 0x1

.field public static final VERTICAL:I = 0x7

.field private static final sFlagsMap:[I


# instance fields
.field private final mDefaultValue:F

.field private mHasAliasesSet:Z

.field private final mSpacing:[F

.field private mValueFlags:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/facebook/react/uimanager/Spacing;->sFlagsMap:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x1
        0x2
        0x4
        0x8
        0x10
        0x20
        0x40
        0x80
        0x100
    .end array-data
    .line 12
    .line 13
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
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/facebook/react/uimanager/Spacing;-><init>(F)V

    return-void
.end method

.method public constructor <init>(F)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/facebook/react/uimanager/Spacing;->mValueFlags:I

    .line 4
    iput p1, p0, Lcom/facebook/react/uimanager/Spacing;->mDefaultValue:F

    .line 5
    invoke-static {}, Lcom/facebook/react/uimanager/Spacing;->newFullSpacingArray()[F

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/uimanager/Spacing;->mSpacing:[F

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/uimanager/Spacing;)V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/facebook/react/uimanager/Spacing;->mValueFlags:I

    .line 8
    iget v0, p1, Lcom/facebook/react/uimanager/Spacing;->mDefaultValue:F

    iput v0, p0, Lcom/facebook/react/uimanager/Spacing;->mDefaultValue:F

    .line 9
    iget-object v0, p1, Lcom/facebook/react/uimanager/Spacing;->mSpacing:[F

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/uimanager/Spacing;->mSpacing:[F

    .line 10
    iget v0, p1, Lcom/facebook/react/uimanager/Spacing;->mValueFlags:I

    iput v0, p0, Lcom/facebook/react/uimanager/Spacing;->mValueFlags:I

    .line 11
    iget-boolean p1, p1, Lcom/facebook/react/uimanager/Spacing;->mHasAliasesSet:Z

    iput-boolean p1, p0, Lcom/facebook/react/uimanager/Spacing;->mHasAliasesSet:Z

    return-void
.end method

.method private static newFullSpacingArray()[F
    .locals 1

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v0, v0, [F

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :array_0
    .array-data 4
        0x7fc00000    # Float.NaN
        0x7fc00000    # Float.NaN
        0x7fc00000    # Float.NaN
        0x7fc00000    # Float.NaN
        0x7fc00000    # Float.NaN
        0x7fc00000    # Float.NaN
        0x7fc00000    # Float.NaN
        0x7fc00000    # Float.NaN
        0x7fc00000    # Float.NaN
    .end array-data
    .line 10
    .line 11
    .line 12
    .line 13
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
.end method


# virtual methods
.method public get(I)F
    .locals 4

    .line 1
    const/4 v0, 0x4

    .line 2
    if-eq p1, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, 0x5

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget v0, p0, Lcom/facebook/react/uimanager/Spacing;->mDefaultValue:F

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_1
    :goto_0
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 12
    .line 13
    :goto_1
    iget v1, p0, Lcom/facebook/react/uimanager/Spacing;->mValueFlags:I

    .line 14
    .line 15
    if-nez v1, :cond_2

    .line 16
    .line 17
    return v0

    .line 18
    :cond_2
    sget-object v2, Lcom/facebook/react/uimanager/Spacing;->sFlagsMap:[I

    .line 19
    .line 20
    aget v3, v2, p1

    .line 21
    .line 22
    and-int/2addr v3, v1

    .line 23
    if-eqz v3, :cond_3

    .line 24
    .line 25
    iget-object v0, p0, Lcom/facebook/react/uimanager/Spacing;->mSpacing:[F

    .line 26
    .line 27
    aget p1, v0, p1

    .line 28
    .line 29
    return p1

    .line 30
    :cond_3
    iget-boolean v3, p0, Lcom/facebook/react/uimanager/Spacing;->mHasAliasesSet:Z

    .line 31
    .line 32
    if-eqz v3, :cond_7

    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    if-eq p1, v3, :cond_5

    .line 36
    .line 37
    const/4 v3, 0x3

    .line 38
    if-ne p1, v3, :cond_4

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_4
    const/4 p1, 0x6

    .line 42
    goto :goto_3

    .line 43
    :cond_5
    :goto_2
    const/4 p1, 0x7

    .line 44
    :goto_3
    aget v3, v2, p1

    .line 45
    .line 46
    and-int/2addr v3, v1

    .line 47
    if-eqz v3, :cond_6

    .line 48
    .line 49
    iget-object v0, p0, Lcom/facebook/react/uimanager/Spacing;->mSpacing:[F

    .line 50
    .line 51
    aget p1, v0, p1

    .line 52
    .line 53
    return p1

    .line 54
    :cond_6
    const/16 p1, 0x8

    .line 55
    .line 56
    aget v2, v2, p1

    .line 57
    .line 58
    and-int/2addr v1, v2

    .line 59
    if-eqz v1, :cond_7

    .line 60
    .line 61
    iget-object v0, p0, Lcom/facebook/react/uimanager/Spacing;->mSpacing:[F

    .line 62
    .line 63
    aget p1, v0, p1

    .line 64
    .line 65
    return p1

    .line 66
    :cond_7
    return v0
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method public getRaw(I)F
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/Spacing;->mSpacing:[F

    aget p1, v0, p1

    return p1
.end method

.method getWithFallback(II)F
    .locals 2

    iget v0, p0, Lcom/facebook/react/uimanager/Spacing;->mValueFlags:I

    sget-object v1, Lcom/facebook/react/uimanager/Spacing;->sFlagsMap:[I

    aget v1, v1, p1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    iget-object p2, p0, Lcom/facebook/react/uimanager/Spacing;->mSpacing:[F

    aget p1, p2, p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2}, Lcom/facebook/react/uimanager/Spacing;->get(I)F

    move-result p1

    :goto_0
    return p1
.end method

.method public reset()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/Spacing;->mSpacing:[F

    .line 2
    .line 3
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/facebook/react/uimanager/Spacing;->mHasAliasesSet:Z

    .line 10
    .line 11
    iput v0, p0, Lcom/facebook/react/uimanager/Spacing;->mValueFlags:I

    .line 12
    .line 13
    return-void
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
.end method

.method public set(IF)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/Spacing;->mSpacing:[F

    .line 2
    .line 3
    aget v0, v0, p1

    .line 4
    .line 5
    invoke-static {v0, p2}, Lcom/facebook/react/uimanager/FloatUtil;->floatsEqual(FF)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_3

    .line 11
    .line 12
    iget-object v0, p0, Lcom/facebook/react/uimanager/Spacing;->mSpacing:[F

    .line 13
    .line 14
    aput p2, v0, p1

    .line 15
    .line 16
    invoke-static {p2}, Lcom/facebook/yoga/d;->a(F)Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    iget p2, p0, Lcom/facebook/react/uimanager/Spacing;->mValueFlags:I

    .line 23
    .line 24
    sget-object v0, Lcom/facebook/react/uimanager/Spacing;->sFlagsMap:[I

    .line 25
    .line 26
    aget p1, v0, p1

    .line 27
    .line 28
    not-int p1, p1

    .line 29
    and-int/2addr p1, p2

    .line 30
    iput p1, p0, Lcom/facebook/react/uimanager/Spacing;->mValueFlags:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget p2, p0, Lcom/facebook/react/uimanager/Spacing;->mValueFlags:I

    .line 34
    .line 35
    sget-object v0, Lcom/facebook/react/uimanager/Spacing;->sFlagsMap:[I

    .line 36
    .line 37
    aget p1, v0, p1

    .line 38
    .line 39
    or-int/2addr p1, p2

    .line 40
    iput p1, p0, Lcom/facebook/react/uimanager/Spacing;->mValueFlags:I

    .line 41
    .line 42
    :goto_0
    iget p1, p0, Lcom/facebook/react/uimanager/Spacing;->mValueFlags:I

    .line 43
    .line 44
    sget-object p2, Lcom/facebook/react/uimanager/Spacing;->sFlagsMap:[I

    .line 45
    .line 46
    const/16 v0, 0x8

    .line 47
    .line 48
    aget v0, p2, v0

    .line 49
    .line 50
    and-int/2addr v0, p1

    .line 51
    const/4 v2, 0x1

    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    const/4 v0, 0x7

    .line 55
    aget v0, p2, v0

    .line 56
    .line 57
    and-int/2addr v0, p1

    .line 58
    if-nez v0, :cond_1

    .line 59
    .line 60
    const/4 v0, 0x6

    .line 61
    aget p2, p2, v0

    .line 62
    .line 63
    and-int/2addr p1, p2

    .line 64
    if-eqz p1, :cond_2

    .line 65
    .line 66
    :cond_1
    move v1, v2

    .line 67
    :cond_2
    iput-boolean v1, p0, Lcom/facebook/react/uimanager/Spacing;->mHasAliasesSet:Z

    .line 68
    .line 69
    return v2

    .line 70
    :cond_3
    return v1
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
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
.end method
