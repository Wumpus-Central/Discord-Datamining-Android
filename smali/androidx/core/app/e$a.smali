.class Landroidx/core/app/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/core/app/e;->i(Landroid/app/Activity;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Landroidx/core/app/e$d;

.field final synthetic l:Ljava/lang/Object;


# direct methods
.method constructor <init>(Landroidx/core/app/e$d;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Landroidx/core/app/e$a;->k:Landroidx/core/app/e$d;

    iput-object p2, p0, Landroidx/core/app/e$a;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Landroidx/core/app/e$a;->k:Landroidx/core/app/e$d;

    iget-object v1, p0, Landroidx/core/app/e$a;->l:Ljava/lang/Object;

    iput-object v1, v0, Landroidx/core/app/e$d;->k:Ljava/lang/Object;

    return-void
.end method
