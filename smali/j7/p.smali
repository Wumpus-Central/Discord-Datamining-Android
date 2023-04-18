.class public final synthetic Lj7/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lj7/v$a;

.field public final synthetic l:Lj7/v;

.field public final synthetic m:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Lj7/v$a;Lj7/v;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj7/p;->k:Lj7/v$a;

    iput-object p2, p0, Lj7/p;->l:Lj7/v;

    iput-object p3, p0, Lj7/p;->m:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lj7/p;->k:Lj7/v$a;

    iget-object v1, p0, Lj7/p;->l:Lj7/v;

    iget-object v2, p0, Lj7/p;->m:Ljava/lang/Exception;

    invoke-static {v0, v1, v2}, Lj7/v$a;->f(Lj7/v$a;Lj7/v;Ljava/lang/Exception;)V

    return-void
.end method
