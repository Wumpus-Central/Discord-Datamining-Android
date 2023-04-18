.class public final Lcom/discord/misc/utilities/measure/HeadlessViewMeasurerExtensionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a:\u0010\u0000\u001a\u00020\u0001\"\n\u0008\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0014\u0008\u0008\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0008\u001a\u00020\tH\u0086\u0008\u00f8\u0001\u0000\u001a>\u0010\u0000\u001a\u00020\u0001\"\u0008\u0008\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0008\u001a\u00020\t\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u000c"
    }
    d2 = {
        "measureHeadlessView",
        "Landroid/util/Size;",
        "T",
        "Landroid/view/View;",
        "Landroid/content/Context;",
        "configureView",
        "Lkotlin/Function1;",
        "",
        "measureBounds",
        "Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;",
        "clazz",
        "Ljava/lang/Class;",
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
.method public static final measureHeadlessView(Landroid/content/Context;Ljava/lang/Class;Lkotlin/jvm/functions/Function1;Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;)Landroid/util/Size;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(",
            "Landroid/content/Context;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;",
            ")",
            "Landroid/util/Size;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configureView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measureBounds"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer;

    invoke-direct {v0, p1}, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v0, p0, p2, p3}, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer;->measure$misc_utilities_release(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;)Landroid/util/Size;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic measureHeadlessView(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;)Landroid/util/Size;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;",
            ")",
            "Landroid/util/Size;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configureView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measureBounds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    const-string v1, "T"

    .line 2
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->m(ILjava/lang/String;)V

    const-class v0, Landroid/view/View;

    invoke-static {p0, v0, p1, p2}, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurerExtensionsKt;->measureHeadlessView(Landroid/content/Context;Ljava/lang/Class;Lkotlin/jvm/functions/Function1;Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;)Landroid/util/Size;

    move-result-object p0

    return-object p0
.end method
