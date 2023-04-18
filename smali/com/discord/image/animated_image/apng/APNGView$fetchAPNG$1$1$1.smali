.class final Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1;->emit(Lcom/discord/file_downloader/DownloadState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Ljava/lang/Boolean;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lkotlinx/coroutines/CoroutineScope;",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/e;
    c = "com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$1"
    f = "APNGView.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $config:Lcom/discord/image/animated_image/apng/APNGView$Config;

.field final synthetic $drawable:Lcom/linecorp/apng/ApngDrawable;

.field label:I

.field final synthetic this$0:Lcom/discord/image/animated_image/apng/APNGView;


# direct methods
.method constructor <init>(Lcom/discord/image/animated_image/apng/APNGView;Lcom/linecorp/apng/ApngDrawable;Lcom/discord/image/animated_image/apng/APNGView$Config;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/image/animated_image/apng/APNGView;",
            "Lcom/linecorp/apng/ApngDrawable;",
            "Lcom/discord/image/animated_image/apng/APNGView$Config;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$1;->this$0:Lcom/discord/image/animated_image/apng/APNGView;

    iput-object p2, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$1;->$drawable:Lcom/linecorp/apng/ApngDrawable;

    iput-object p3, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$1;->$config:Lcom/discord/image/animated_image/apng/APNGView$Config;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$1;

    iget-object v0, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$1;->this$0:Lcom/discord/image/animated_image/apng/APNGView;

    iget-object v1, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$1;->$drawable:Lcom/linecorp/apng/ApngDrawable;

    iget-object v2, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$1;->$config:Lcom/discord/image/animated_image/apng/APNGView$Config;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$1;-><init>(Lcom/discord/image/animated_image/apng/APNGView;Lcom/linecorp/apng/ApngDrawable;Lcom/discord/image/animated_image/apng/APNGView$Config;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$1;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$1;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$1;->this$0:Lcom/discord/image/animated_image/apng/APNGView;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/n;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$1;->this$0:Lcom/discord/image/animated_image/apng/APNGView;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$1;->$drawable:Lcom/linecorp/apng/ApngDrawable;

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/n;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$1;->this$0:Lcom/discord/image/animated_image/apng/APNGView;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$1;->this$0:Lcom/discord/image/animated_image/apng/APNGView;

    .line 30
    .line 31
    invoke-static {p1}, Lcom/discord/image/animated_image/apng/APNGView;->access$getApngStateManager$p(Lcom/discord/image/animated_image/apng/APNGView;)Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object v0, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$1;->$config:Lcom/discord/image/animated_image/apng/APNGView$Config;

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/discord/image/animated_image/apng/APNGView$Config;->getAnimate()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v1, 0x1

    .line 42
    invoke-virtual {p1, v1, v0}, Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;->onFetchFinished(ZZ)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1
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
.end method
