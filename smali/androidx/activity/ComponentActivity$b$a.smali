.class Landroidx/activity/ComponentActivity$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/activity/ComponentActivity$b;->f(ILandroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Landroidx/core/app/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:I

.field final synthetic l:Landroidx/activity/result/contract/ActivityResultContract$a;

.field final synthetic m:Landroidx/activity/ComponentActivity$b;


# direct methods
.method constructor <init>(Landroidx/activity/ComponentActivity$b;ILandroidx/activity/result/contract/ActivityResultContract$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/activity/ComponentActivity$b$a;->m:Landroidx/activity/ComponentActivity$b;

    iput p2, p0, Landroidx/activity/ComponentActivity$b$a;->k:I

    iput-object p3, p0, Landroidx/activity/ComponentActivity$b$a;->l:Landroidx/activity/result/contract/ActivityResultContract$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Landroidx/activity/ComponentActivity$b$a;->m:Landroidx/activity/ComponentActivity$b;

    iget v1, p0, Landroidx/activity/ComponentActivity$b$a;->k:I

    iget-object v2, p0, Landroidx/activity/ComponentActivity$b$a;->l:Landroidx/activity/result/contract/ActivityResultContract$a;

    invoke-virtual {v2}, Landroidx/activity/result/contract/ActivityResultContract$a;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroidx/activity/result/ActivityResultRegistry;->c(ILjava/lang/Object;)Z

    return-void
.end method
