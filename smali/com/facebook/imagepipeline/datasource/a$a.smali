.class Lcom/facebook/imagepipeline/datasource/a$a;
.super Lcom/facebook/imagepipeline/producers/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/datasource/a;->B()Lcom/facebook/imagepipeline/producers/Consumer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/imagepipeline/producers/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/facebook/imagepipeline/datasource/a;


# direct methods
.method constructor <init>(Lcom/facebook/imagepipeline/datasource/a;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/datasource/a$a;->b:Lcom/facebook/imagepipeline/datasource/a;

    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/b;-><init>()V

    return-void
.end method


# virtual methods
.method protected f()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/datasource/a$a;->b:Lcom/facebook/imagepipeline/datasource/a;

    invoke-static {v0}, Lcom/facebook/imagepipeline/datasource/a;->z(Lcom/facebook/imagepipeline/datasource/a;)V

    return-void
.end method

.method protected g(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/datasource/a$a;->b:Lcom/facebook/imagepipeline/datasource/a;

    invoke-static {v0, p1}, Lcom/facebook/imagepipeline/datasource/a;->y(Lcom/facebook/imagepipeline/datasource/a;Ljava/lang/Throwable;)V

    return-void
.end method

.method protected h(Ljava/lang/Object;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/datasource/a$a;->b:Lcom/facebook/imagepipeline/datasource/a;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/imagepipeline/datasource/a;->x(Lcom/facebook/imagepipeline/datasource/a;)Lcom/facebook/imagepipeline/producers/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, p1, p2, v1}, Lcom/facebook/imagepipeline/datasource/a;->F(Ljava/lang/Object;ILcom/facebook/imagepipeline/producers/ProducerContext;)V

    .line 8
    .line 9
    .line 10
    return-void
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
.end method

.method protected i(F)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/datasource/a$a;->b:Lcom/facebook/imagepipeline/datasource/a;

    invoke-static {v0, p1}, Lcom/facebook/imagepipeline/datasource/a;->A(Lcom/facebook/imagepipeline/datasource/a;F)Z

    return-void
.end method
