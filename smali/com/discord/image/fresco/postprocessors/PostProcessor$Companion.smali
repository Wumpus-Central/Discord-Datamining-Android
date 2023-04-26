.class public final Lcom/discord/image/fresco/postprocessors/PostProcessor$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/image/fresco/postprocessors/PostProcessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/discord/image/fresco/postprocessors/PostProcessor$Companion;",
        "",
        "()V",
        "create",
        "Lcom/facebook/imagepipeline/request/BasePostprocessor;",
        "processor",
        "Lcom/discord/image/fresco/postprocessors/PostProcessor;",
        "fresco_release"
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
.field static final synthetic $$INSTANCE:Lcom/discord/image/fresco/postprocessors/PostProcessor$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Companion;

    invoke-direct {v0}, Lcom/discord/image/fresco/postprocessors/PostProcessor$Companion;-><init>()V

    sput-object v0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Companion;->$$INSTANCE:Lcom/discord/image/fresco/postprocessors/PostProcessor$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Lcom/discord/image/fresco/postprocessors/PostProcessor;)Lcom/facebook/imagepipeline/request/BasePostprocessor;
    .locals 3

    .line 1
    const-string v0, "processor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lcom/discord/image/fresco/postprocessors/PostProcessor$Composite;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    check-cast p1, Lcom/discord/image/fresco/postprocessors/PostProcessor$Composite;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/discord/image/fresco/postprocessors/PostProcessor$Composite;->getPostprocessors()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    const/16 v1, 0xa

    .line 19
    .line 20
    invoke-static {p1, v1}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lcom/discord/image/fresco/postprocessors/PostProcessor;

    .line 42
    .line 43
    sget-object v2, Lcom/discord/image/fresco/postprocessors/PostProcessor$Companion;->$$INSTANCE:Lcom/discord/image/fresco/postprocessors/PostProcessor$Companion;

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Lcom/discord/image/fresco/postprocessors/PostProcessor$Companion;->create(Lcom/discord/image/fresco/postprocessors/PostProcessor;)Lcom/facebook/imagepipeline/request/BasePostprocessor;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    new-instance p1, Lcom/discord/image/fresco/postprocessors/processors/CompositePostprocessor;

    .line 54
    .line 55
    invoke-direct {p1, v0}, Lcom/discord/image/fresco/postprocessors/processors/CompositePostprocessor;-><init>(Ljava/util/List;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    instance-of v0, p1, Lcom/discord/image/fresco/postprocessors/PostProcessor$Circle;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    new-instance p1, Lcom/discord/image/fresco/postprocessors/processors/SafeRoundAsCirclePostprocessor;

    .line 64
    .line 65
    invoke-direct {p1}, Lcom/discord/image/fresco/postprocessors/processors/SafeRoundAsCirclePostprocessor;-><init>()V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    instance-of v0, p1, Lcom/discord/image/fresco/postprocessors/PostProcessor$Grayscale;

    .line 70
    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    sget-object p1, Lcom/discord/image/fresco/postprocessors/processors/GrayscalePostprocessor;->INSTANCE:Lcom/discord/image/fresco/postprocessors/processors/GrayscalePostprocessor;

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    instance-of v0, p1, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    new-instance v0, Lcom/discord/image/fresco/postprocessors/processors/GradientPostprocessor;

    .line 81
    .line 82
    check-cast p1, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;

    .line 83
    .line 84
    invoke-direct {v0, p1}, Lcom/discord/image/fresco/postprocessors/processors/GradientPostprocessor;-><init>(Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;)V

    .line 85
    .line 86
    .line 87
    move-object p1, v0

    .line 88
    :goto_1
    return-object p1

    .line 89
    :cond_4
    new-instance p1, Llf/q;

    .line 90
    .line 91
    invoke-direct {p1}, Llf/q;-><init>()V

    .line 92
    .line 93
    .line 94
    throw p1
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
