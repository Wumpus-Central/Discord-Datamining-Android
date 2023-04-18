.class Lcom/facebook/imagepipeline/producers/k$b;
.super Lcom/facebook/imagepipeline/producers/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/producers/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/imagepipeline/producers/o<",
        "Lu5/e;",
        "Lu5/e;",
        ">;"
    }
.end annotation


# instance fields
.field private c:Lcom/facebook/imagepipeline/producers/ProducerContext;

.field final synthetic d:Lcom/facebook/imagepipeline/producers/k;


# direct methods
.method private constructor <init>(Lcom/facebook/imagepipeline/producers/k;Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/Consumer<",
            "Lu5/e;",
            ">;",
            "Lcom/facebook/imagepipeline/producers/ProducerContext;",
            ")V"
        }
    .end annotation

    .line 2
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/k$b;->d:Lcom/facebook/imagepipeline/producers/k;

    .line 3
    invoke-direct {p0, p2}, Lcom/facebook/imagepipeline/producers/o;-><init>(Lcom/facebook/imagepipeline/producers/Consumer;)V

    .line 4
    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/k$b;->c:Lcom/facebook/imagepipeline/producers/ProducerContext;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/imagepipeline/producers/k;Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;Lcom/facebook/imagepipeline/producers/k$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/imagepipeline/producers/k$b;-><init>(Lcom/facebook/imagepipeline/producers/k;Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;)V

    return-void
.end method


# virtual methods
.method protected g(Ljava/lang/Throwable;)V
    .locals 2

    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/k$b;->d:Lcom/facebook/imagepipeline/producers/k;

    invoke-static {p1}, Lcom/facebook/imagepipeline/producers/k;->c(Lcom/facebook/imagepipeline/producers/k;)Lcom/facebook/imagepipeline/producers/l0;

    move-result-object p1

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/o;->o()Lcom/facebook/imagepipeline/producers/Consumer;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/k$b;->c:Lcom/facebook/imagepipeline/producers/ProducerContext;

    invoke-interface {p1, v0, v1}, Lcom/facebook/imagepipeline/producers/l0;->b(Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;)V

    return-void
.end method

.method protected bridge synthetic h(Ljava/lang/Object;I)V
    .locals 0

    check-cast p1, Lu5/e;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/k$b;->p(Lu5/e;I)V

    return-void
.end method

.method protected p(Lu5/e;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/k$b;->c:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/ProducerContext;->d()Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/b;->d(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/request/ImageRequest;->getResizeOptions()Lcom/facebook/imagepipeline/common/ResizeOptions;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {p1, v2}, Lcom/facebook/imagepipeline/producers/a1;->c(Lu5/e;Lcom/facebook/imagepipeline/common/ResizeOptions;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/request/ImageRequest;->getLocalThumbnailPreviewsEnabled()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    :cond_0
    if-eqz v1, :cond_1

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/o;->o()Lcom/facebook/imagepipeline/producers/Consumer;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/Consumer;->c(Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v0, 0x1

    .line 42
    invoke-static {p2, v0}, Lcom/facebook/imagepipeline/producers/b;->n(II)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/o;->o()Lcom/facebook/imagepipeline/producers/Consumer;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/Consumer;->c(Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_0
    if-eqz v1, :cond_3

    .line 54
    .line 55
    if-nez v2, :cond_3

    .line 56
    .line 57
    invoke-static {p1}, Lu5/e;->i(Lu5/e;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/k$b;->d:Lcom/facebook/imagepipeline/producers/k;

    .line 61
    .line 62
    invoke-static {p1}, Lcom/facebook/imagepipeline/producers/k;->c(Lcom/facebook/imagepipeline/producers/k;)Lcom/facebook/imagepipeline/producers/l0;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/o;->o()Lcom/facebook/imagepipeline/producers/Consumer;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/k$b;->c:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 71
    .line 72
    invoke-interface {p1, p2, v0}, Lcom/facebook/imagepipeline/producers/l0;->b(Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    return-void
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
