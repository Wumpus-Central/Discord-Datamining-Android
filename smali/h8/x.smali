.class public final synthetic Lh8/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lh8/b0$a;

.field public final synthetic l:Lh8/b0;

.field public final synthetic m:Lh8/n;

.field public final synthetic n:Lh8/q;

.field public final synthetic o:Ljava/io/IOException;

.field public final synthetic p:Z


# direct methods
.method public synthetic constructor <init>(Lh8/b0$a;Lh8/b0;Lh8/n;Lh8/q;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh8/x;->k:Lh8/b0$a;

    iput-object p2, p0, Lh8/x;->l:Lh8/b0;

    iput-object p3, p0, Lh8/x;->m:Lh8/n;

    iput-object p4, p0, Lh8/x;->n:Lh8/q;

    iput-object p5, p0, Lh8/x;->o:Ljava/io/IOException;

    iput-boolean p6, p0, Lh8/x;->p:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lh8/x;->k:Lh8/b0$a;

    iget-object v1, p0, Lh8/x;->l:Lh8/b0;

    iget-object v2, p0, Lh8/x;->m:Lh8/n;

    iget-object v3, p0, Lh8/x;->n:Lh8/q;

    iget-object v4, p0, Lh8/x;->o:Ljava/io/IOException;

    iget-boolean v5, p0, Lh8/x;->p:Z

    invoke-static/range {v0 .. v5}, Lh8/b0$a;->b(Lh8/b0$a;Lh8/b0;Lh8/n;Lh8/q;Ljava/io/IOException;Z)V

    return-void
.end method
