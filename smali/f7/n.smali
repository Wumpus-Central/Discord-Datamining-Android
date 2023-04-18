.class public final synthetic Lf7/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lf7/r$a;

.field public final synthetic l:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Lf7/r$a;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf7/n;->k:Lf7/r$a;

    iput-object p2, p0, Lf7/n;->l:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lf7/n;->k:Lf7/r$a;

    iget-object v1, p0, Lf7/n;->l:Ljava/lang/Exception;

    invoke-static {v0, v1}, Lf7/r$a;->c(Lf7/r$a;Ljava/lang/Exception;)V

    return-void
.end method
