.class final Lw9/c0;
.super Lw9/e0;
.source "SourceFile"


# instance fields
.field final synthetic k:Landroid/content/Intent;

.field final synthetic l:Landroid/app/Activity;

.field final synthetic m:I


# direct methods
.method constructor <init>(Landroid/content/Intent;Landroid/app/Activity;I)V
    .locals 0

    iput-object p1, p0, Lw9/c0;->k:Landroid/content/Intent;

    iput-object p2, p0, Lw9/c0;->l:Landroid/app/Activity;

    iput p3, p0, Lw9/c0;->m:I

    invoke-direct {p0}, Lw9/e0;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lw9/c0;->k:Landroid/content/Intent;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lw9/c0;->l:Landroid/app/Activity;

    iget v2, p0, Lw9/c0;->m:I

    invoke-virtual {v1, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method
