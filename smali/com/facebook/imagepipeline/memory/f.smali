.class public Lcom/facebook/imagepipeline/memory/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/memory/f$b;
    }
.end annotation


# instance fields
.field private final a:Lz3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz3/c<",
            "[B>;"
        }
    .end annotation
.end field

.field final b:Lcom/facebook/imagepipeline/memory/f$b;


# direct methods
.method public constructor <init>(Ly3/c;Lx5/z;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget v0, p2, Lx5/z;->g:I

    .line 5
    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lv3/j;->b(Ljava/lang/Boolean;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lcom/facebook/imagepipeline/memory/f$b;

    .line 19
    .line 20
    invoke-static {}, Lx5/v;->h()Lx5/v;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {v0, p1, p2, v1}, Lcom/facebook/imagepipeline/memory/f$b;-><init>(Ly3/c;Lx5/z;Lx5/a0;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/facebook/imagepipeline/memory/f;->b:Lcom/facebook/imagepipeline/memory/f$b;

    .line 28
    .line 29
    new-instance p1, Lcom/facebook/imagepipeline/memory/f$a;

    .line 30
    .line 31
    invoke-direct {p1, p0}, Lcom/facebook/imagepipeline/memory/f$a;-><init>(Lcom/facebook/imagepipeline/memory/f;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/facebook/imagepipeline/memory/f;->a:Lz3/c;

    .line 35
    .line 36
    return-void
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


# virtual methods
.method public a(I)Lcom/facebook/common/references/CloseableReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/facebook/common/references/CloseableReference<",
            "[B>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/f;->b:Lcom/facebook/imagepipeline/memory/f$b;

    invoke-virtual {v0, p1}, Lcom/facebook/imagepipeline/memory/b;->get(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/f;->a:Lz3/c;

    invoke-static {p1, v0}, Lcom/facebook/common/references/CloseableReference;->i0(Ljava/lang/Object;Lz3/c;)Lcom/facebook/common/references/CloseableReference;

    move-result-object p1

    return-object p1
.end method

.method public b([B)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/f;->b:Lcom/facebook/imagepipeline/memory/f$b;

    invoke-virtual {v0, p1}, Lcom/facebook/imagepipeline/memory/b;->release(Ljava/lang/Object;)V

    return-void
.end method
