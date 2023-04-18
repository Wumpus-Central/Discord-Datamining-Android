.class public final Landroidx/core/view/ContentInfoCompat$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/ContentInfoCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Landroidx/core/view/ContentInfoCompat$c;


# direct methods
.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    .line 7
    new-instance v0, Landroidx/core/view/ContentInfoCompat$b;

    invoke-direct {v0, p1, p2}, Landroidx/core/view/ContentInfoCompat$b;-><init>(Landroid/content/ClipData;I)V

    iput-object v0, p0, Landroidx/core/view/ContentInfoCompat$a;->a:Landroidx/core/view/ContentInfoCompat$c;

    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Landroidx/core/view/ContentInfoCompat$d;

    invoke-direct {v0, p1, p2}, Landroidx/core/view/ContentInfoCompat$d;-><init>(Landroid/content/ClipData;I)V

    iput-object v0, p0, Landroidx/core/view/ContentInfoCompat$a;->a:Landroidx/core/view/ContentInfoCompat$c;

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroidx/core/view/ContentInfoCompat;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, Landroidx/core/view/ContentInfoCompat$b;

    invoke-direct {v0, p1}, Landroidx/core/view/ContentInfoCompat$b;-><init>(Landroidx/core/view/ContentInfoCompat;)V

    iput-object v0, p0, Landroidx/core/view/ContentInfoCompat$a;->a:Landroidx/core/view/ContentInfoCompat$c;

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Landroidx/core/view/ContentInfoCompat$d;

    invoke-direct {v0, p1}, Landroidx/core/view/ContentInfoCompat$d;-><init>(Landroidx/core/view/ContentInfoCompat;)V

    iput-object v0, p0, Landroidx/core/view/ContentInfoCompat$a;->a:Landroidx/core/view/ContentInfoCompat$c;

    :goto_0
    return-void
.end method


# virtual methods
.method public a()Landroidx/core/view/ContentInfoCompat;
    .locals 1

    iget-object v0, p0, Landroidx/core/view/ContentInfoCompat$a;->a:Landroidx/core/view/ContentInfoCompat$c;

    invoke-interface {v0}, Landroidx/core/view/ContentInfoCompat$c;->build()Landroidx/core/view/ContentInfoCompat;

    move-result-object v0

    return-object v0
.end method

.method public b(Landroid/content/ClipData;)Landroidx/core/view/ContentInfoCompat$a;
    .locals 1

    iget-object v0, p0, Landroidx/core/view/ContentInfoCompat$a;->a:Landroidx/core/view/ContentInfoCompat$c;

    invoke-interface {v0, p1}, Landroidx/core/view/ContentInfoCompat$c;->c(Landroid/content/ClipData;)V

    return-object p0
.end method

.method public c(Landroid/os/Bundle;)Landroidx/core/view/ContentInfoCompat$a;
    .locals 1

    iget-object v0, p0, Landroidx/core/view/ContentInfoCompat$a;->a:Landroidx/core/view/ContentInfoCompat$c;

    invoke-interface {v0, p1}, Landroidx/core/view/ContentInfoCompat$c;->setExtras(Landroid/os/Bundle;)V

    return-object p0
.end method

.method public d(I)Landroidx/core/view/ContentInfoCompat$a;
    .locals 1

    iget-object v0, p0, Landroidx/core/view/ContentInfoCompat$a;->a:Landroidx/core/view/ContentInfoCompat$c;

    invoke-interface {v0, p1}, Landroidx/core/view/ContentInfoCompat$c;->b(I)V

    return-object p0
.end method

.method public e(Landroid/net/Uri;)Landroidx/core/view/ContentInfoCompat$a;
    .locals 1

    iget-object v0, p0, Landroidx/core/view/ContentInfoCompat$a;->a:Landroidx/core/view/ContentInfoCompat$c;

    invoke-interface {v0, p1}, Landroidx/core/view/ContentInfoCompat$c;->a(Landroid/net/Uri;)V

    return-object p0
.end method
