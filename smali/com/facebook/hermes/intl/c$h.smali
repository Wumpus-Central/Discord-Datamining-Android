.class public final enum Lcom/facebook/hermes/intl/c$h;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/hermes/intl/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/hermes/intl/c$h;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lcom/facebook/hermes/intl/c$h;

.field public static final enum l:Lcom/facebook/hermes/intl/c$h;

.field public static final enum m:Lcom/facebook/hermes/intl/c$h;

.field public static final enum n:Lcom/facebook/hermes/intl/c$h;

.field private static final synthetic o:[Lcom/facebook/hermes/intl/c$h;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lcom/facebook/hermes/intl/c$h;

    .line 2
    .line 3
    const-string v1, "DECIMAL"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/c$h;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/facebook/hermes/intl/c$h;->k:Lcom/facebook/hermes/intl/c$h;

    .line 10
    .line 11
    new-instance v1, Lcom/facebook/hermes/intl/c$h;

    .line 12
    .line 13
    const-string v3, "PERCENT"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lcom/facebook/hermes/intl/c$h;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lcom/facebook/hermes/intl/c$h;->l:Lcom/facebook/hermes/intl/c$h;

    .line 20
    .line 21
    new-instance v3, Lcom/facebook/hermes/intl/c$h;

    .line 22
    .line 23
    const-string v5, "CURRENCY"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lcom/facebook/hermes/intl/c$h;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lcom/facebook/hermes/intl/c$h;->m:Lcom/facebook/hermes/intl/c$h;

    .line 30
    .line 31
    new-instance v5, Lcom/facebook/hermes/intl/c$h;

    .line 32
    .line 33
    const-string v7, "UNIT"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8}, Lcom/facebook/hermes/intl/c$h;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lcom/facebook/hermes/intl/c$h;->n:Lcom/facebook/hermes/intl/c$h;

    .line 40
    .line 41
    const/4 v7, 0x4

    .line 42
    new-array v7, v7, [Lcom/facebook/hermes/intl/c$h;

    .line 43
    .line 44
    aput-object v0, v7, v2

    .line 45
    .line 46
    aput-object v1, v7, v4

    .line 47
    .line 48
    aput-object v3, v7, v6

    .line 49
    .line 50
    aput-object v5, v7, v8

    .line 51
    .line 52
    sput-object v7, Lcom/facebook/hermes/intl/c$h;->o:[Lcom/facebook/hermes/intl/c$h;

    .line 53
    .line 54
    return-void
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

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/hermes/intl/c$h;
    .locals 1

    const-class v0, Lcom/facebook/hermes/intl/c$h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/hermes/intl/c$h;

    return-object p0
.end method

.method public static values()[Lcom/facebook/hermes/intl/c$h;
    .locals 1

    sget-object v0, Lcom/facebook/hermes/intl/c$h;->o:[Lcom/facebook/hermes/intl/c$h;

    invoke-virtual {v0}, [Lcom/facebook/hermes/intl/c$h;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/hermes/intl/c$h;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/hermes/intl/c$e;Lcom/facebook/hermes/intl/c$d;)I
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/hermes/intl/c$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    if-eq v0, v1, :cond_4

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    sget-object p2, Lcom/facebook/hermes/intl/c$e;->l:Lcom/facebook/hermes/intl/c$e;

    .line 16
    .line 17
    if-eq p1, p2, :cond_4

    .line 18
    .line 19
    sget-object p2, Lcom/facebook/hermes/intl/c$e;->m:Lcom/facebook/hermes/intl/c$e;

    .line 20
    .line 21
    if-ne p1, p2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v1, 0x0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    sget-object p1, Lcom/facebook/hermes/intl/c$d;->l:Lcom/facebook/hermes/intl/c$d;

    .line 27
    .line 28
    if-ne p2, p1, :cond_2

    .line 29
    .line 30
    const/4 v1, 0x7

    .line 31
    goto :goto_0

    .line 32
    :cond_2
    sget-object p1, Lcom/facebook/hermes/intl/c$d;->k:Lcom/facebook/hermes/intl/c$d;

    .line 33
    .line 34
    if-ne p2, p1, :cond_3

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_3
    new-instance p1, Lg5/j;

    .line 39
    .line 40
    const-string p2, "Unrecognized formatting style requested."

    .line 41
    .line 42
    invoke-direct {p1, p2}, Lg5/j;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1

    .line 46
    :cond_4
    :goto_0
    return v1
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

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/hermes/intl/c$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_3

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_2

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    const-string v0, "unit"

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 27
    .line 28
    .line 29
    throw v0

    .line 30
    :cond_1
    const-string v0, "currency"

    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_2
    const-string v0, "percent"

    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_3
    const-string v0, "decimal"

    .line 37
    .line 38
    return-object v0
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
