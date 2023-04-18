.class public final synthetic Lh8/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lh8/b0$a;

.field public final synthetic l:Lh8/b0;

.field public final synthetic m:Lh8/q;


# direct methods
.method public synthetic constructor <init>(Lh8/b0$a;Lh8/b0;Lh8/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh8/w;->k:Lh8/b0$a;

    iput-object p2, p0, Lh8/w;->l:Lh8/b0;

    iput-object p3, p0, Lh8/w;->m:Lh8/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lh8/w;->k:Lh8/b0$a;

    iget-object v1, p0, Lh8/w;->l:Lh8/b0;

    iget-object v2, p0, Lh8/w;->m:Lh8/q;

    invoke-static {v0, v1, v2}, Lh8/b0$a;->d(Lh8/b0$a;Lh8/b0;Lh8/q;)V

    return-void
.end method
