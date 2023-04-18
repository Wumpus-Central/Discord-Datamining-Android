.class public final synthetic Lgc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsc/b;


# instance fields
.field public final synthetic a:Lgc/d;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lgc/d;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgc/b;->a:Lgc/d;

    iput-object p2, p0, Lgc/b;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lgc/b;->a:Lgc/d;

    iget-object v1, p0, Lgc/b;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Lgc/d;->b(Lgc/d;Landroid/content/Context;)Lyc/a;

    move-result-object v0

    return-object v0
.end method
