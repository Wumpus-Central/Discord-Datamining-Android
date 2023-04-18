.class public final synthetic Landroidx/core/content/res/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/core/content/res/h$e;

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Landroidx/core/content/res/h$e;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/core/content/res/j;->k:Landroidx/core/content/res/h$e;

    iput p2, p0, Landroidx/core/content/res/j;->l:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/core/content/res/j;->k:Landroidx/core/content/res/h$e;

    iget v1, p0, Landroidx/core/content/res/j;->l:I

    invoke-static {v0, v1}, Landroidx/core/content/res/h$e;->a(Landroidx/core/content/res/h$e;I)V

    return-void
.end method
