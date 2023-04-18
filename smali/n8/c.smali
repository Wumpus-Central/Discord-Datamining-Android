.class public final synthetic Ln8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Ln8/d$a;

.field public final synthetic l:Landroid/net/Uri;


# direct methods
.method public synthetic constructor <init>(Ln8/d$a;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln8/c;->k:Ln8/d$a;

    iput-object p2, p0, Ln8/c;->l:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ln8/c;->k:Ln8/d$a;

    iget-object v1, p0, Ln8/c;->l:Landroid/net/Uri;

    invoke-static {v0, v1}, Ln8/d$a;->a(Ln8/d$a;Landroid/net/Uri;)V

    return-void
.end method
