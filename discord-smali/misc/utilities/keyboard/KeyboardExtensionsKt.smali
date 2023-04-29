.class public final Lcom/discord/misc/utilities/keyboard/KeyboardExtensionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0002\u001a\n\u0010\t\u001a\u00020\u0006*\u00020\u0007\u001a\u0012\u0010\t\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0002\u00a8\u0006\n"
    }
    d2 = {
        "getInsetsController",
        "Landroidx/core/view/WindowInsetsControllerCompat;",
        "Landroid/view/Window;",
        "view",
        "Landroid/view/View;",
        "hideKeyboard",
        "",
        "Landroid/app/Activity;",
        "window",
        "showKeyboard",
        "misc_utilities_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic access$getInsetsController(Landroid/view/Window;Landroid/view/View;)Landroidx/core/view/WindowInsetsControllerCompat;
    .locals 0

    invoke-static {p0, p1}, Lcom/discord/misc/utilities/keyboard/KeyboardExtensionsKt;->getInsetsController(Landroid/view/Window;Landroid/view/View;)Landroidx/core/view/WindowInsetsControllerCompat;

    move-result-object p0

    return-object p0
.end method

.method private static final getInsetsController(Landroid/view/Window;Landroid/view/View;)Landroidx/core/view/WindowInsetsControllerCompat;
    .locals 0

    invoke-static {p0, p1}, Landroidx/core/view/r2;->a(Landroid/view/Window;Landroid/view/View;)Landroidx/core/view/WindowInsetsControllerCompat;

    move-result-object p0

    const-string p1, "getInsetsController(this, view)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final hideKeyboard(Landroid/app/Activity;)V
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p0}, Lcom/discord/misc/utilities/activity/ActivityExtensionsKt;->getContentView(Landroid/app/Activity;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    const-string v1, "window"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Lcom/discord/misc/utilities/keyboard/KeyboardExtensionsKt;->hideKeyboard(Landroid/view/View;Landroid/view/Window;)V

    :cond_0
    return-void
.end method

.method public static final hideKeyboard(Landroid/view/View;Landroid/view/Window;)V
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "window"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/discord/misc/utilities/coroutines/MainImmediateScopeKt;->MainImmediateScope()Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/discord/misc/utilities/keyboard/KeyboardExtensionsKt$hideKeyboard$1;

    const/4 v0, 0x0

    invoke-direct {v4, p1, p0, v0}, Lcom/discord/misc/utilities/keyboard/KeyboardExtensionsKt$hideKeyboard$1;-><init>(Landroid/view/Window;Landroid/view/View;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/j;->d(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/l0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public static final showKeyboard(Landroid/app/Activity;)V
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p0}, Lcom/discord/misc/utilities/activity/ActivityExtensionsKt;->getContentView(Landroid/app/Activity;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    const-string v1, "window"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Lcom/discord/misc/utilities/keyboard/KeyboardExtensionsKt;->showKeyboard(Landroid/view/View;Landroid/view/Window;)V

    :cond_0
    return-void
.end method

.method public static final showKeyboard(Landroid/view/View;Landroid/view/Window;)V
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "window"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/discord/misc/utilities/coroutines/MainImmediateScopeKt;->MainImmediateScope()Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/discord/misc/utilities/keyboard/KeyboardExtensionsKt$showKeyboard$1;

    const/4 v0, 0x0

    invoke-direct {v4, p1, p0, v0}, Lcom/discord/misc/utilities/keyboard/KeyboardExtensionsKt$showKeyboard$1;-><init>(Landroid/view/Window;Landroid/view/View;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/j;->d(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/l0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method
