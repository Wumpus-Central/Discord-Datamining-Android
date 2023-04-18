.class final Lcom/discord/safearea/SafeAreaProviderManager$addEventEmitters$2;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/safearea/SafeAreaProviderManager;->addEventEmitters(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/th3rdwave/safeareacontext/SafeAreaProvider;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/core/view/WindowInsetsCompat;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "insets",
        "Landroidx/core/view/WindowInsetsCompat;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $view:Lcom/th3rdwave/safeareacontext/SafeAreaProvider;

.field final synthetic this$0:Lcom/discord/safearea/SafeAreaProviderManager;


# direct methods
.method constructor <init>(Lcom/discord/safearea/SafeAreaProviderManager;Lcom/th3rdwave/safeareacontext/SafeAreaProvider;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/safearea/SafeAreaProviderManager$addEventEmitters$2;->this$0:Lcom/discord/safearea/SafeAreaProviderManager;

    iput-object p2, p0, Lcom/discord/safearea/SafeAreaProviderManager$addEventEmitters$2;->$view:Lcom/th3rdwave/safeareacontext/SafeAreaProvider;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/core/view/WindowInsetsCompat;

    invoke-virtual {p0, p1}, Lcom/discord/safearea/SafeAreaProviderManager$addEventEmitters$2;->invoke(Landroidx/core/view/WindowInsetsCompat;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/core/view/WindowInsetsCompat;)V
    .locals 3

    const-string v0, "insets"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$m;->b()I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/core/view/WindowInsetsCompat;->f(I)Landroidx/core/graphics/Insets;

    move-result-object p1

    const-string v0, "insets.getInsets(WindowInsetsCompat.Type.ime())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/discord/safearea/SafeAreaProviderManager$addEventEmitters$2;->this$0:Lcom/discord/safearea/SafeAreaProviderManager;

    invoke-static {v0, p1}, Lcom/discord/safearea/SafeAreaProviderManager;->access$setImeInsets$p(Lcom/discord/safearea/SafeAreaProviderManager;Landroidx/core/graphics/Insets;)V

    .line 4
    iget-object v0, p0, Lcom/discord/safearea/SafeAreaProviderManager$addEventEmitters$2;->this$0:Lcom/discord/safearea/SafeAreaProviderManager;

    .line 5
    invoke-static {v0}, Lcom/discord/safearea/SafeAreaProviderManager;->access$getSafeAreaEdgeInsets$p(Lcom/discord/safearea/SafeAreaProviderManager;)Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;

    move-result-object v1

    .line 6
    iget-object v2, p0, Lcom/discord/safearea/SafeAreaProviderManager$addEventEmitters$2;->$view:Lcom/th3rdwave/safeareacontext/SafeAreaProvider;

    .line 7
    invoke-static {v0, v1, p1, v2}, Lcom/discord/safearea/SafeAreaProviderManager;->access$handleInsetsChanged(Lcom/discord/safearea/SafeAreaProviderManager;Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;Landroidx/core/graphics/Insets;Lcom/th3rdwave/safeareacontext/SafeAreaProvider;)V

    return-void
.end method
