.class public final Lzg/h;
.super Lpg/z;
.source "SourceFile"


# static fields
.field static final synthetic x:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final q:Lch/u;

.field private final r:Lyg/g;

.field private final s:Lci/i;

.field private final t:Lzg/d;

.field private final u:Lci/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lci/i<",
            "Ljava/util/List<",
            "Llh/c;",
            ">;>;"
        }
    .end annotation
.end field

.field private final v:Lng/g;

.field private final w:Lci/i;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [Lkotlin/reflect/KProperty;

    .line 3
    .line 4
    new-instance v1, Lkotlin/jvm/internal/c0;

    .line 5
    .line 6
    const-class v2, Lzg/h;

    .line 7
    .line 8
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    const-string v4, "binaryClasses"

    .line 13
    .line 14
    const-string v5, "getBinaryClasses$descriptors_jvm()Ljava/util/Map;"

    .line 15
    .line 16
    invoke-direct {v1, v3, v4, v5}, Lkotlin/jvm/internal/c0;-><init>(Lkotlin/reflect/KDeclarationContainer;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lkotlin/jvm/internal/f0;->g(Lkotlin/jvm/internal/b0;)Ldg/h;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v3, 0x0

    .line 24
    aput-object v1, v0, v3

    .line 25
    .line 26
    new-instance v1, Lkotlin/jvm/internal/c0;

    .line 27
    .line 28
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const-string v3, "partToFacade"

    .line 33
    .line 34
    const-string v4, "getPartToFacade()Ljava/util/HashMap;"

    .line 35
    .line 36
    invoke-direct {v1, v2, v3, v4}, Lkotlin/jvm/internal/c0;-><init>(Lkotlin/reflect/KDeclarationContainer;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v1}, Lkotlin/jvm/internal/f0;->g(Lkotlin/jvm/internal/b0;)Ldg/h;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/4 v2, 0x1

    .line 44
    aput-object v1, v0, v2

    .line 45
    .line 46
    sput-object v0, Lzg/h;->x:[Lkotlin/reflect/KProperty;

    .line 47
    .line 48
    return-void
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
.end method

.method public constructor <init>(Lyg/g;Lch/u;)V
    .locals 8

    .line 1
    const-string v0, "outerContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "jPackage"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lyg/g;->d()Lmg/h0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {p2}, Lch/u;->d()Llh/c;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {p0, v0, v1}, Lpg/z;-><init>(Lmg/h0;Llh/c;)V

    .line 20
    .line 21
    .line 22
    iput-object p2, p0, Lzg/h;->q:Lch/u;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x6

    .line 27
    const/4 v7, 0x0

    .line 28
    move-object v2, p1

    .line 29
    move-object v3, p0

    .line 30
    invoke-static/range {v2 .. v7}, Lyg/a;->d(Lyg/g;Lmg/g;Lch/z;IILjava/lang/Object;)Lyg/g;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lzg/h;->r:Lyg/g;

    .line 35
    .line 36
    invoke-virtual {p1}, Lyg/g;->e()Lci/n;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, Lzg/h$a;

    .line 41
    .line 42
    invoke-direct {v1, p0}, Lzg/h$a;-><init>(Lzg/h;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v0, v1}, Lci/n;->d(Lkotlin/jvm/functions/Function0;)Lci/i;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, Lzg/h;->s:Lci/i;

    .line 50
    .line 51
    new-instance v0, Lzg/d;

    .line 52
    .line 53
    invoke-direct {v0, p1, p2, p0}, Lzg/d;-><init>(Lyg/g;Lch/u;Lzg/h;)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lzg/h;->t:Lzg/d;

    .line 57
    .line 58
    invoke-virtual {p1}, Lyg/g;->e()Lci/n;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    new-instance v1, Lzg/h$c;

    .line 63
    .line 64
    invoke-direct {v1, p0}, Lzg/h$c;-><init>(Lzg/h;)V

    .line 65
    .line 66
    .line 67
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-interface {v0, v1, v2}, Lci/n;->c(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)Lci/i;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, Lzg/h;->u:Lci/i;

    .line 76
    .line 77
    invoke-virtual {p1}, Lyg/g;->a()Lyg/b;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Lyg/b;->i()Lvg/x;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Lvg/x;->b()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_0

    .line 90
    .line 91
    sget-object p2, Lng/g;->f:Lng/g$a;

    .line 92
    .line 93
    invoke-virtual {p2}, Lng/g$a;->b()Lng/g;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    goto :goto_0

    .line 98
    :cond_0
    invoke-static {p1, p2}, Lyg/e;->a(Lyg/g;Lch/d;)Lng/g;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    :goto_0
    iput-object p2, p0, Lzg/h;->v:Lng/g;

    .line 103
    .line 104
    invoke-virtual {p1}, Lyg/g;->e()Lci/n;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    new-instance p2, Lzg/h$b;

    .line 109
    .line 110
    invoke-direct {p2, p0}, Lzg/h$b;-><init>(Lzg/h;)V

    .line 111
    .line 112
    .line 113
    invoke-interface {p1, p2}, Lci/n;->d(Lkotlin/jvm/functions/Function0;)Lci/i;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    iput-object p1, p0, Lzg/h;->w:Lci/i;

    .line 118
    .line 119
    return-void
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

.method public static final synthetic F0(Lzg/h;)Lyg/g;
    .locals 0

    iget-object p0, p0, Lzg/h;->r:Lyg/g;

    return-object p0
.end method

.method public static final synthetic K0(Lzg/h;)Lch/u;
    .locals 0

    iget-object p0, p0, Lzg/h;->q:Lch/u;

    return-object p0
.end method


# virtual methods
.method public final L0(Lch/g;)Lmg/e;
    .locals 1

    .line 1
    const-string v0, "jClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lzg/h;->t:Lzg/d;

    .line 7
    .line 8
    invoke-virtual {v0}, Lzg/d;->j()Lzg/i;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1}, Lzg/i;->O(Lch/g;)Lmg/e;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
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

.method public final M0()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Leh/r;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzg/h;->s:Lci/i;

    sget-object v1, Lzg/h;->x:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Lci/m;->a(Lci/i;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public N0()Lzg/d;
    .locals 1

    iget-object v0, p0, Lzg/h;->t:Lzg/d;

    return-object v0
.end method

.method public final O0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llh/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzg/h;->u:Lci/i;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getAnnotations()Lng/g;
    .locals 1

    iget-object v0, p0, Lzg/h;->v:Lng/g;

    return-object v0
.end method

.method public j()Lmg/a1;
    .locals 1

    new-instance v0, Leh/s;

    invoke-direct {v0, p0}, Leh/s;-><init>(Lzg/h;)V

    return-object v0
.end method

.method public bridge synthetic p()Lwh/h;
    .locals 1

    invoke-virtual {p0}, Lzg/h;->N0()Lzg/d;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Lazy Java package fragment: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpg/z;->d()Llh/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " of module "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lzg/h;->r:Lyg/g;

    invoke-virtual {v1}, Lyg/g;->a()Lyg/b;

    move-result-object v1

    invoke-virtual {v1}, Lyg/b;->m()Lmg/h0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
