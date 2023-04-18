.class Lcom/facebook/imagepipeline/producers/m$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/y$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/producers/m$c;-><init>(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;ZI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/imagepipeline/producers/m;

.field final synthetic b:Lcom/facebook/imagepipeline/producers/ProducerContext;

.field final synthetic c:I

.field final synthetic d:Lcom/facebook/imagepipeline/producers/m$c;


# direct methods
.method constructor <init>(Lcom/facebook/imagepipeline/producers/m$c;Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/ProducerContext;I)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/m$c$a;->d:Lcom/facebook/imagepipeline/producers/m$c;

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/m$c$a;->a:Lcom/facebook/imagepipeline/producers/m;

    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/m$c$a;->b:Lcom/facebook/imagepipeline/producers/ProducerContext;

    iput p4, p0, Lcom/facebook/imagepipeline/producers/m$c$a;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lu5/e;I)V
    .locals 3

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m$c$a;->d:Lcom/facebook/imagepipeline/producers/m$c;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/facebook/imagepipeline/producers/m$c;->p(Lcom/facebook/imagepipeline/producers/m$c;)Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Lu5/e;->x()Li5/c;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Li5/c;->a()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "image_format"

    .line 18
    .line 19
    invoke-interface {v0, v2, v1}, Lcom/facebook/imagepipeline/producers/ProducerContext;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m$c$a;->d:Lcom/facebook/imagepipeline/producers/m$c;

    .line 23
    .line 24
    iget-object v0, v0, Lcom/facebook/imagepipeline/producers/m$c;->i:Lcom/facebook/imagepipeline/producers/m;

    .line 25
    .line 26
    invoke-static {v0}, Lcom/facebook/imagepipeline/producers/m;->c(Lcom/facebook/imagepipeline/producers/m;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    const/16 v0, 0x10

    .line 33
    .line 34
    invoke-static {p2, v0}, Lcom/facebook/imagepipeline/producers/b;->m(II)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m$c$a;->b:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 41
    .line 42
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/ProducerContext;->d()Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/m$c$a;->d:Lcom/facebook/imagepipeline/producers/m$c;

    .line 47
    .line 48
    iget-object v1, v1, Lcom/facebook/imagepipeline/producers/m$c;->i:Lcom/facebook/imagepipeline/producers/m;

    .line 49
    .line 50
    invoke-static {v1}, Lcom/facebook/imagepipeline/producers/m;->f(Lcom/facebook/imagepipeline/producers/m;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/request/ImageRequest;->getSourceUri()Landroid/net/Uri;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v1}, Ld4/f;->m(Landroid/net/Uri;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_2

    .line 65
    .line 66
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/request/ImageRequest;->getRotationOptions()Lcom/facebook/imagepipeline/common/RotationOptions;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/request/ImageRequest;->getResizeOptions()Lcom/facebook/imagepipeline/common/ResizeOptions;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget v2, p0, Lcom/facebook/imagepipeline/producers/m$c$a;->c:I

    .line 75
    .line 76
    invoke-static {v1, v0, p1, v2}, La6/a;->b(Lcom/facebook/imagepipeline/common/RotationOptions;Lcom/facebook/imagepipeline/common/ResizeOptions;Lu5/e;I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    invoke-virtual {p1, v0}, Lu5/e;->M0(I)V

    .line 81
    .line 82
    .line 83
    :cond_2
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m$c$a;->b:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 84
    .line 85
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/ProducerContext;->f()Lq5/g;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-interface {v0}, Lq5/g;->C()Lcom/facebook/imagepipeline/core/a;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/a;->z()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_3

    .line 98
    .line 99
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m$c$a;->d:Lcom/facebook/imagepipeline/producers/m$c;

    .line 100
    .line 101
    invoke-static {v0, p1}, Lcom/facebook/imagepipeline/producers/m$c;->q(Lcom/facebook/imagepipeline/producers/m$c;Lu5/e;)V

    .line 102
    .line 103
    .line 104
    :cond_3
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m$c$a;->d:Lcom/facebook/imagepipeline/producers/m$c;

    .line 105
    .line 106
    invoke-static {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/m$c;->r(Lcom/facebook/imagepipeline/producers/m$c;Lu5/e;I)V

    .line 107
    .line 108
    .line 109
    :cond_4
    return-void
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
