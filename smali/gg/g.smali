.class public Lgg/g;
.super Lpg/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpg/l<",
        "Lgg/l<",
        "*>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0010\u0018\u00002\u0012\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J#\u0010\u0007\u001a\u0006\u0012\u0002\u0008\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J#\u0010\n\u001a\u0006\u0012\u0002\u0008\u00030\u00022\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0012"
    }
    d2 = {
        "Lgg/g;",
        "Lpg/l;",
        "Lgg/l;",
        "",
        "Lmg/y;",
        "descriptor",
        "data",
        "visitFunctionDescriptor",
        "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/Unit;)Lgg/l;",
        "Lmg/u0;",
        "visitPropertyDescriptor",
        "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lkotlin/Unit;)Lgg/l;",
        "Lgg/p;",
        "a",
        "Lgg/p;",
        "container",
        "<init>",
        "(Lgg/p;)V",
        "kotlin-reflection"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final a:Lgg/p;


# direct methods
.method public constructor <init>(Lgg/p;)V
    .locals 1

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lpg/l;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lgg/g;->a:Lgg/p;

    .line 10
    .line 11
    return-void
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
.end method


# virtual methods
.method public bridge synthetic b(Lmg/y;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/Unit;

    invoke-virtual {p0, p1, p2}, Lgg/g;->p(Lmg/y;Lkotlin/Unit;)Lgg/l;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i(Lmg/u0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/Unit;

    invoke-virtual {p0, p1, p2}, Lgg/g;->q(Lmg/u0;Lkotlin/Unit;)Lgg/l;

    move-result-object p1

    return-object p1
.end method

.method public p(Lmg/y;Lkotlin/Unit;)Lgg/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmg/y;",
            "Lkotlin/Unit;",
            ")",
            "Lgg/l<",
            "*>;"
        }
    .end annotation

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "data"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, Lgg/q;

    .line 12
    .line 13
    iget-object v0, p0, Lgg/g;->a:Lgg/p;

    .line 14
    .line 15
    invoke-direct {p2, v0, p1}, Lgg/q;-><init>(Lgg/p;Lmg/y;)V

    .line 16
    .line 17
    .line 18
    return-object p2
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
.end method

.method public q(Lmg/u0;Lkotlin/Unit;)Lgg/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmg/u0;",
            "Lkotlin/Unit;",
            ")",
            "Lgg/l<",
            "*>;"
        }
    .end annotation

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "data"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lmg/a;->f0()Lmg/x0;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    const/4 v0, 0x0

    .line 16
    const/4 v1, 0x1

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    move p2, v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move p2, v0

    .line 22
    :goto_0
    invoke-interface {p1}, Lmg/a;->k0()Lmg/x0;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    move v0, v1

    .line 29
    :cond_1
    add-int/2addr p2, v0

    .line 30
    invoke-interface {p1}, Lmg/k1;->i0()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v2, 0x2

    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    if-eqz p2, :cond_3

    .line 38
    .line 39
    if-eq p2, v1, :cond_2

    .line 40
    .line 41
    if-ne p2, v2, :cond_5

    .line 42
    .line 43
    new-instance p2, Lgg/t;

    .line 44
    .line 45
    iget-object v0, p0, Lgg/g;->a:Lgg/p;

    .line 46
    .line 47
    invoke-direct {p2, v0, p1}, Lgg/t;-><init>(Lgg/p;Lmg/u0;)V

    .line 48
    .line 49
    .line 50
    return-object p2

    .line 51
    :cond_2
    new-instance p2, Lgg/s;

    .line 52
    .line 53
    iget-object v0, p0, Lgg/g;->a:Lgg/p;

    .line 54
    .line 55
    invoke-direct {p2, v0, p1}, Lgg/s;-><init>(Lgg/p;Lmg/u0;)V

    .line 56
    .line 57
    .line 58
    return-object p2

    .line 59
    :cond_3
    new-instance p2, Lgg/r;

    .line 60
    .line 61
    iget-object v0, p0, Lgg/g;->a:Lgg/p;

    .line 62
    .line 63
    invoke-direct {p2, v0, p1}, Lgg/r;-><init>(Lgg/p;Lmg/u0;)V

    .line 64
    .line 65
    .line 66
    return-object p2

    .line 67
    :cond_4
    if-eqz p2, :cond_7

    .line 68
    .line 69
    if-eq p2, v1, :cond_6

    .line 70
    .line 71
    if-ne p2, v2, :cond_5

    .line 72
    .line 73
    new-instance p2, Lgg/z;

    .line 74
    .line 75
    iget-object v0, p0, Lgg/g;->a:Lgg/p;

    .line 76
    .line 77
    invoke-direct {p2, v0, p1}, Lgg/z;-><init>(Lgg/p;Lmg/u0;)V

    .line 78
    .line 79
    .line 80
    return-object p2

    .line 81
    :cond_5
    new-instance p2, Lgg/h0;

    .line 82
    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    const-string v1, "Unsupported property: "

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-direct {p2, p1}, Lgg/h0;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw p2

    .line 104
    :cond_6
    new-instance p2, Lgg/y;

    .line 105
    .line 106
    iget-object v0, p0, Lgg/g;->a:Lgg/p;

    .line 107
    .line 108
    invoke-direct {p2, v0, p1}, Lgg/y;-><init>(Lgg/p;Lmg/u0;)V

    .line 109
    .line 110
    .line 111
    return-object p2

    .line 112
    :cond_7
    new-instance p2, Lgg/x;

    .line 113
    .line 114
    iget-object v0, p0, Lgg/g;->a:Lgg/p;

    .line 115
    .line 116
    invoke-direct {p2, v0, p1}, Lgg/x;-><init>(Lgg/p;Lmg/u0;)V

    .line 117
    .line 118
    .line 119
    return-object p2
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
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
.end method
